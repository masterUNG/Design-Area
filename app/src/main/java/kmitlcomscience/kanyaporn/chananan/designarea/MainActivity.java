package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private UserTABLE objUserTABLE;
    private DesignTABLE objDesignTABLE;
    private FerAndFoodTABLE objFerAndFoodTABLE;
    private CostTABLE objCostTABLE;
    private ProfitTABLE objProfitTABLE;


    private EditText userEditText,passwordEditText;
    private String userString,passwordString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //BindWidget ผูกตัวแปร
        userEditText = (EditText) findViewById(R.id.editText);
        passwordEditText = (EditText) findViewById(R.id.editText2);

        //Request Database
        objUserTABLE = new UserTABLE(this);
        objDesignTABLE = new DesignTABLE(this);
        objFerAndFoodTABLE = new FerAndFoodTABLE(this);
        objCostTABLE = new CostTABLE(this);
        objProfitTABLE = new ProfitTABLE(this);



        //Clean data
        cleanData();

        synJSONtoSQLite();



    } // Main Method

    private void synJSONtoSQLite() {

        //Change Policy
        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();//permitAll = อนุญาตให้ทำทุกๆอย่าง
        StrictMode.setThreadPolicy(myPolicy);

        int intTable = 1;
        String tag = "UserAccount";

        while (intTable <=1) {

            //1. Create InputStream
            InputStream objInputStream = null;
            String strURLuser = "http://swiftcodingthai.com/min/php_login_min.php";
           // String strURLdesign = "http://swiftcodingthai.com/min/php_get_design.php";
           // String strURLferandfood = "http://swiftcodingthai.com/min/php_get_ferandfood.php";
           // String strURLcost = "http://swiftcodingthai.com/min/php_get_cost.php";
           // String strURLprofit = "http://swiftcodingthai.com/min/php_get_profit.php";
            HttpPost objHttpPost = null;

            //ป้องกันการ error สำหรับตัวที่เสี่ยงต่อการ error ที่ยอมรับได้
            try {
                HttpClient objHttpClient = new DefaultHttpClient();//ขีดกลาง คือ google มองว่าเสี่ยงต่อความไม่ปอดภัย
                switch (intTable) {
                    case 1:
                        objHttpPost = new HttpPost(strURLuser);
                        break;
                    /*case 2:
                        objHttpPost = new HttpPost(strURLdesign);
                        break;
                    case 3:
                        objHttpPost = new HttpPost(strURLferandfood);
                        break;
                    case 4:
                        objHttpPost = new HttpPost(strURLcost);
                        break;
                    case 5:
                        objHttpPost = new HttpPost(strURLprofit);
                        break;
                    default:
                        break;*/
                } // switch

                HttpResponse objHttpResponse = objHttpClient.execute(objHttpPost);
                HttpEntity objHttpEntity = objHttpResponse.getEntity();
                objInputStream = objHttpEntity.getContent();

            } catch (Exception e) {
                Log.d(tag, "InputStream ==> " +e.toString());
            }

            //2. Create JSON String เปลี่ยนสิ่งที่ประมวลผลได้เป็น String
            String strJSON = null; //ค่าเริ่มต้น

            try {
                // BufferedReader เป็นตัวบอกว่าให้ดึง String ได้ยาวแค่ไหน
                BufferedReader objBufferedReader = new BufferedReader(new InputStreamReader(objInputStream, "UTF-8"));//ภาษาไทยต้องมีการ UTF-8 มิเช่นนั้นจะเป็นภาษาต่างดาว
                //StringBuilder เป็นตัวผูกให้ String รวมกัน
                StringBuilder objStringBuilder = new StringBuilder();
                String strLine = null;

                while ((strLine = objBufferedReader.readLine()) !=null) {
                    objStringBuilder.append(strLine);
                }// while

                objInputStream.close();
                strJSON = objStringBuilder.toString();

            } catch (Exception e) {
                Log.d(tag, "strJSON ==> " +e.toString());
            }

            //3. Update SQLite
            try {
                // Class นึงที่ google สร้างไว้ให้ใช้
                JSONArray objJsonArray = new JSONArray(strJSON);
                for (int i = 0; i < objJsonArray.length(); i++) {

                    JSONObject jsonObject = objJsonArray.getJSONObject(i);

                    switch (intTable) {
                        case 1:

                            //Get Value From userTABLE
                            String strUser = jsonObject.getString(UserTABLE.column_user);
                            String strPassword = jsonObject.getString(UserTABLE.column_password);
                            String strEmail = jsonObject.getString(UserTABLE.column_email);

                            objUserTABLE.addNewUser(strUser, strPassword, strEmail);

                            break;
                       /* case 2:

                            //Get Value From designTABLE
                                   strUser = jsonObject.getString(DesignTABLE.column_user);
                            String strBigArea = jsonObject.getString(DesignTABLE.column_bigarea);

                            String strArea1 = jsonObject.getString(DesignTABLE.column_area1);
                            String strSubArea1 = jsonObject.getString(DesignTABLE.column_subarea1);
                            String strCate1 = jsonObject.getString(DesignTABLE.column_cate1);
                            String strType1 = jsonObject.getString(DesignTABLE.column_type1);
                            String strNumber1 = jsonObject.getString(DesignTABLE.column_number1);
                            String strDistance1 = jsonObject.getString(DesignTABLE.column_distance1);
                            String strHarvest1 = jsonObject.getString(DesignTABLE.column_harvest1);

                            String strArea2 = jsonObject.getString(DesignTABLE.column_area2);
                            String strSubArea2 = jsonObject.getString(DesignTABLE.column_subarea2);
                            String strCate2 = jsonObject.getString(DesignTABLE.column_cate2);
                            String strType2 = jsonObject.getString(DesignTABLE.column_type2);
                            String strNumber2 = jsonObject.getString(DesignTABLE.column_number2);
                            String strDistance2 = jsonObject.getString(DesignTABLE.column_distance2);
                            String strHarvest2 = jsonObject.getString(DesignTABLE.column_harvest2);

                            String strArea3 = jsonObject.getString(DesignTABLE.column_area3);
                            String strSubArea3 = jsonObject.getString(DesignTABLE.column_subarea3);
                            String strCate3 = jsonObject.getString(DesignTABLE.column_cate3);
                            String strType3 = jsonObject.getString(DesignTABLE.column_type3);
                            String strNumber3 = jsonObject.getString(DesignTABLE.column_number3);
                            String strDistance3 = jsonObject.getString(DesignTABLE.column_distance3);
                            String strHarvest3 = jsonObject.getString(DesignTABLE.column_harvest3);

                            String strArea4 = jsonObject.getString(DesignTABLE.column_area4);
                            String strSubArea4 = jsonObject.getString(DesignTABLE.column_subarea4);
                            String strCate4 = jsonObject.getString(DesignTABLE.column_cate4);
                            String strType4 = jsonObject.getString(DesignTABLE.column_type4);
                            String strNumber4 = jsonObject.getString(DesignTABLE.column_number4);
                            String strDistance4 = jsonObject.getString(DesignTABLE.column_distance4);
                            String strHarvest4 = jsonObject.getString(DesignTABLE.column_harvest4);

                            objDesignTABLE.addNewDesign(strUser, strBigArea,
                                    strArea1, strSubArea1, strCate1, strType1, strNumber1, strDistance1, strHarvest1,
                                    strArea2, strSubArea2, strCate2, strType2, strNumber2, strDistance2, strHarvest2,
                                    strArea3, strSubArea3, strCate3, strType3, strNumber3, strDistance3, strHarvest3,
                                    strArea4, strSubArea4, strCate4, strType4, strNumber4, strDistance4, strHarvest4);
                            break;

                        case 3:

                            //Get Value From ferandfoodTABLE
                            strUser = jsonObject.getString(FerAndFoodTABLE.column_user);
                            strArea1 = jsonObject.getString(FerAndFoodTABLE.column_area1);
                            strType1 = jsonObject.getString(FerAndFoodTABLE.column_type1);
                            strNumber1 = jsonObject.getString(FerAndFoodTABLE.column_number1);
                            String strRatioNo1_1 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo1_1);
                            String strRatioNo1_2 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo1_2);
                            String strRatioNo1_3 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo1_3);
                            String strRatioNo1_4 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo1_4);
                            String strRatioNo1_5 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo1_5);

                            strArea2 = jsonObject.getString(FerAndFoodTABLE.column_area2);
                            strType2 = jsonObject.getString(FerAndFoodTABLE.column_type2);
                            strNumber2 = jsonObject.getString(FerAndFoodTABLE.column_number2);
                            String strRatioNo2_1 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo2_1);
                            String strRatioNo2_2 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo2_2);
                            String strRatioNo2_3 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo2_3);
                            String strRatioNo2_4 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo2_4);
                            String strRatioNo2_5 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo2_5);

                            strArea3 = jsonObject.getString(FerAndFoodTABLE.column_area3);
                            strType3 = jsonObject.getString(FerAndFoodTABLE.column_type3);
                            strNumber3 = jsonObject.getString(FerAndFoodTABLE.column_number3);
                            String strRatioNo3_1 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo3_1);
                            String strRatioNo3_2 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo3_2);
                            String strRatioNo3_3 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo3_3);
                            String strRatioNo3_4 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo3_4);
                            String strRatioNo3_5 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo3_5);

                            strArea4 = jsonObject.getString(FerAndFoodTABLE.column_area4);
                            strType4 = jsonObject.getString(FerAndFoodTABLE.column_type4);
                            strNumber4 = jsonObject.getString(FerAndFoodTABLE.column_number4);
                            String strRatioNo4_1 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo4_1);
                            String strRatioNo4_2 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo4_2);
                            String strRatioNo4_3 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo4_3);
                            String strRatioNo4_4 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo4_4);
                            String strRatioNo4_5 = jsonObject.getString(FerAndFoodTABLE.column_ratioNo4_5);

                            objFerAndFoodTABLE.addNewFerAndFood(strUser,
                                    strArea1, strType1, strNumber1, strRatioNo1_1, strRatioNo1_2, strRatioNo1_3, strRatioNo1_4, strRatioNo1_5,
                                    strArea2, strType2, strNumber2, strRatioNo2_1, strRatioNo2_2, strRatioNo2_3, strRatioNo2_4, strRatioNo2_5,
                                    strArea3, strType3, strNumber3, strRatioNo3_1, strRatioNo3_2, strRatioNo3_3, strRatioNo3_4, strRatioNo3_5,
                                    strArea4, strType4, strNumber4, strRatioNo4_1, strRatioNo4_2, strRatioNo4_3, strRatioNo4_4, strRatioNo4_5);
                            break;
                        case 4:
                            //Get Value From costTABLE
                            strUser = jsonObject.getString(CostTABLE.column_user);
                            strArea1 = jsonObject.getString(CostTABLE.column_area1);
                            strType1 = jsonObject.getString(CostTABLE.column_type1);
                            strNumber1 = jsonObject.getString(CostTABLE.column_number1);
                            String strTypeCost1 = jsonObject.getString(CostTABLE.column_typeCost1);
                            String strFerAndFoodCost1 = jsonObject.getString(CostTABLE.column_ferAndFoodCost1);

                            strArea2 = jsonObject.getString(CostTABLE.column_area2);
                            strType2 = jsonObject.getString(CostTABLE.column_type2);
                            strNumber2 = jsonObject.getString(CostTABLE.column_number2);
                            String strTypeCost2 = jsonObject.getString(CostTABLE.column_typeCost2);
                            String strFerAndFoodCost2 = jsonObject.getString(CostTABLE.column_ferAndFoodCost2);

                            strArea3 = jsonObject.getString(CostTABLE.column_area3);
                            strType3 = jsonObject.getString(CostTABLE.column_type3);
                            strNumber3 = jsonObject.getString(CostTABLE.column_number3);
                            String strTypeCost3 = jsonObject.getString(CostTABLE.column_typeCost3);
                            String strFerAndFoodCost3 = jsonObject.getString(CostTABLE.column_ferAndFoodCost3);

                            strArea4 = jsonObject.getString(CostTABLE.column_area4);
                            strType4 = jsonObject.getString(CostTABLE.column_type4);
                            strNumber4 = jsonObject.getString(CostTABLE.column_number4);
                            String strTypeCost4 = jsonObject.getString(CostTABLE.column_typeCost4);
                            String strFerAndFoodCost4 = jsonObject.getString(CostTABLE.column_ferAndFoodCost4);

                            objCostTABLE.addNewCost(strUser,
                                    strArea1, strType1, strNumber1, strTypeCost1, strFerAndFoodCost1,
                                    strArea2, strType2, strNumber2, strTypeCost2, strFerAndFoodCost2,
                                    strArea3, strType3, strNumber3, strTypeCost3, strFerAndFoodCost3,
                                    strArea4, strType4, strNumber4, strTypeCost4, strFerAndFoodCost4);

                            break;
                        case 5:
                            //Get Value From profitTABLE
                            strUser = jsonObject.getString(ProfitTABLE.column_user);
                            strArea1 = jsonObject.getString(ProfitTABLE.column_area1);
                            strType1 = jsonObject.getString(ProfitTABLE.column_type1);
                            strNumber1 = jsonObject.getString(ProfitTABLE.column_number1);
                            String strProfitPeriod1 = jsonObject.getString(ProfitTABLE.column_profitPeriod1);
                            String strEstimatedProfit1 = jsonObject.getString(ProfitTABLE.column_EstimatedProfit1);

                            strArea2 = jsonObject.getString(ProfitTABLE.column_area2);
                            strType2 = jsonObject.getString(ProfitTABLE.column_type2);
                            strNumber2 = jsonObject.getString(ProfitTABLE.column_number2);
                            String strProfitPeriod2 = jsonObject.getString(ProfitTABLE.column_profitPeriod2);
                            String strEstimatedProfit2 = jsonObject.getString(ProfitTABLE.column_EstimatedProfit2);

                            strArea3 = jsonObject.getString(ProfitTABLE.column_area3);
                            strType3 = jsonObject.getString(ProfitTABLE.column_type3);
                            strNumber3 = jsonObject.getString(ProfitTABLE.column_number3);
                            String strProfitPeriod3 = jsonObject.getString(ProfitTABLE.column_profitPeriod3);
                            String strEstimatedProfit3 = jsonObject.getString(ProfitTABLE.column_EstimatedProfit3);

                            strArea4 = jsonObject.getString(ProfitTABLE.column_area4);
                            strType4 = jsonObject.getString(ProfitTABLE.column_type4);
                            strNumber4 = jsonObject.getString(ProfitTABLE.column_number4);
                            String strProfitPeriod4 = jsonObject.getString(ProfitTABLE.column_profitPeriod4);
                            String strEstimatedProfit4 = jsonObject.getString(ProfitTABLE.column_EstimatedProfit4);




                            objProfitTABLE.addNewProfit(strUser,
                                    strArea1, strType1, strNumber1, strProfitPeriod1, strEstimatedProfit1,
                                    strArea2, strType2, strNumber2, strProfitPeriod2, strEstimatedProfit2,
                                    strArea3, strType3, strNumber3, strProfitPeriod3, strEstimatedProfit3,
                                    strArea4, strType4, strNumber4, strProfitPeriod4, strEstimatedProfit4);
                            break;*/
                    }// switch

                } // for

            } catch (Exception e) {
                Log.d(tag, "Update ==> " +e.toString());
            }

            intTable +=1;//จะทำการเพิ่มค่า แล้วเอาไปเช็ค ที่ while ว่า intTable <=2 รึป่าว
        } // while

    }// synJSONtoSQLite






    private void cleanData() {
        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);// MODE_PRIVATE อนุญาตให้ลบข้อมูลในฐานข้อมูลแต่ไม่ให้ลบตาราง
        objSqLiteDatabase.delete(UserTABLE.user_TABLE, null, null);
        objSqLiteDatabase.delete(DesignTABLE.design_TABLE, null, null);
        objSqLiteDatabase.delete(FerAndFoodTABLE.FerAndFood_TABLE, null, null);
        objSqLiteDatabase.delete(CostTABLE.cost_TABLE, null, null);
        objSqLiteDatabase.delete(ProfitTABLE.profit_TABLE, null, null);
    }


    public void clickSignIn(View view){

        //Check Space
        userString = userEditText.getText().toString().trim();// trim ทำการตัดช่องว่างโดยอัตโนมัติ
        passwordString = passwordEditText.getText().toString().trim();

        // || = or
        if (userString.equals("") || passwordString.equals("")) {

            //Have Space
            Toast.makeText(MainActivity.this, "กรุณากรอกให้ครบค่ะ", Toast.LENGTH_SHORT).show();

        }

        //No Space
        checkAuthen();


    }// clickSignIn

    private void checkAuthen() {

        try {

            String[] resultStrings = objUserTABLE.searchUser(userString);
            if (passwordString.equals(resultStrings[2])) {


                //Intent To Service
                Intent objIntent = new Intent(MainActivity.this,HubActivity.class);
                objIntent.putExtra("User", userString);
                startActivity(objIntent);
                finish();

            } else {
                Toast.makeText(MainActivity.this, "Password ผิด",
                        Toast.LENGTH_SHORT).show();
            }


        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "ไม่มี" + userString + "ในฐานข้อมูลของเรา",
                    Toast.LENGTH_SHORT).show();
        }

    } // checkAuthen





    public void clickSignUp(View view) {
        Intent objIntent = new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(objIntent);


    }

} // Main Class
