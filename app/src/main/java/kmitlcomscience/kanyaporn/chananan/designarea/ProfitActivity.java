package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;

public class ProfitActivity extends AppCompatActivity {
    //Explicit
    private ImageView calFerImageView1, calFerImageView2, calFerImageView3, calFerImageView4;

    String userString;

    private String bigAreaString, areaString1, numberString1
            , areaString2, numberString2
            , areaString3, numberString3
            , areaString4, numberString4;

    private String typeCostString1, typeCostString2, typeCostString3, typeCostString4;
    private String ferAndFoodCostString1, ferAndFoodCostString2, ferAndFoodCostString3, ferAndFoodCostString4;

    private String ratio1_1String,ratio1_2String,ratio1_3String,ratio1_4String,ratio1_5String,
            ratio2_1String,ratio2_2String,ratio2_3String,ratio2_4String,ratio2_5String,
            ratio3_1String,ratio3_2String,ratio3_3String,ratio3_4String,ratio3_5String,
            ratio4_1String,ratio4_2String,ratio4_3String,ratio4_4String,ratio4_5String;
    private String subAreaString1, subAreaString2, subAreaString3, subAreaString4;

    private String strDistance1,strDistance2,strDistance3,strDistance4;
    private String strHarvest1,strHarvest2,strHarvest3,strHarvest4;


    private String typeProfitString1, typeProfitString2, typeProfitString3, typeProfitString4;
    private String ferAndFoodProfitString1, ferAndFoodProfitString2, ferAndFoodProfitString3, ferAndFoodProfitString4;

    private int intNumber1,intNumber2,intNumber3,intNumber4;

    private String strPlant,strFarm,strAnimal,strHouse,strSpinner1,strSpinner2,strSpinner3,strSpinner4;

    private TextView areaTextView1, areaTextView2, areaTextView3, areaTextView4;
    private TextView typeTextView1, typeTextView2, typeTextView3, typeTextView4;
    private TextView numberTextView1, numberTextView2, numberTextView3, numberTextView4;
    private TextView profitPeriodTextView1, profitPeriodTextView2, profitPeriodTextView3, profitPeriodTextView4;
    private TextView estimatedProfitTextView1, estimatedProfitTextView2,estimatedProfitTextView3, estimatedProfitTextView4;

    private int estimatedProfitInt1,estimatedProfitInt2,estimatedProfitInt3,estimatedProfitInt4;


    private String profitPeriodString1, profitPeriodString2, profitPeriodString3, profitPeriodString4;
    private String estimatedProfitString1, estimatedProfitString2, estimatedProfitString3, estimatedProfitString4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profit);

        initWidget();

        receiveValue();

        calProfit1();
        calProfit2();
        calProfit3();
        calProfit4();

        show1();
        show2();
        show3();
        show4();
    } // Main Method

    /*public void clickSaveProfit(View view) {

        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

        try {

            ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
            objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
            objNameValuePairs.add(new BasicNameValuePair("User", userString));

            objNameValuePairs.add(new BasicNameValuePair("Area1", areaString1));
            objNameValuePairs.add(new BasicNameValuePair("Type1", strSpinner1));
            objNameValuePairs.add(new BasicNameValuePair("Number1", numberString1));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod1", profitPeriodString1));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit1", estimatedProfitString1 ));

            objNameValuePairs.add(new BasicNameValuePair("Area2", areaString2));
            objNameValuePairs.add(new BasicNameValuePair("Type2", strSpinner2));
            objNameValuePairs.add(new BasicNameValuePair("Number2", numberString2));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod2", profitPeriodString2));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit2", estimatedProfitString2 ));

            objNameValuePairs.add(new BasicNameValuePair("Area3", areaString3));
            objNameValuePairs.add(new BasicNameValuePair("Type3", strSpinner3));
            objNameValuePairs.add(new BasicNameValuePair("Number3", numberString3));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod3", profitPeriodString3));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit3", estimatedProfitString3 ));

            objNameValuePairs.add(new BasicNameValuePair("Area4", areaString4));
            objNameValuePairs.add(new BasicNameValuePair("Type4", strSpinner4));
            objNameValuePairs.add(new BasicNameValuePair("Number4", numberString4));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod4", profitPeriodString4));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit4", estimatedProfitString4));



            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_add_profit.php");
            objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
            objHttpClient.execute(objHttpPost);

            Toast.makeText(ProfitActivity.this,
                    "Profit Success", Toast.LENGTH_SHORT).show();
            Intent objIntent = new Intent(ProfitActivity.this, HubActivity.class);
           objIntent.putExtra("User", userString);

            startActivity(objIntent);
           finish();


        } catch (Exception e) {
            Toast.makeText(ProfitActivity.this,
                    "Cannot Profit", Toast.LENGTH_SHORT).show();
        }

    } // clickSaveProfit*/

    public void clickSaveProfit(View view) {

        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);
        Intent objIntent = new Intent(ProfitActivity.this, HubActivity.class);
        objIntent.putExtra("User", userString);

        addDesign();
        addFerAndFood();
        addCost();
        addProfit();
        startActivity(objIntent);
        Toast.makeText(ProfitActivity.this,
                "Save Data Success", Toast.LENGTH_SHORT).show();
        finish();



    } // clickSaveProfit

    private void addDesign() {
        try {

            ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
            objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
            objNameValuePairs.add(new BasicNameValuePair("User", userString));
            objNameValuePairs.add(new BasicNameValuePair("BigArea", bigAreaString));

            objNameValuePairs.add(new BasicNameValuePair("Area1", areaString1));
            objNameValuePairs.add(new BasicNameValuePair("SubArea1", subAreaString1));
            objNameValuePairs.add(new BasicNameValuePair("Cate1", strPlant));
            objNameValuePairs.add(new BasicNameValuePair("Type1", strSpinner1));
            objNameValuePairs.add(new BasicNameValuePair("Number1", numberString1));
            objNameValuePairs.add(new BasicNameValuePair("Distance1", strDistance1));
            objNameValuePairs.add(new BasicNameValuePair("Harvest1", strHarvest1));

            objNameValuePairs.add(new BasicNameValuePair("Area2", areaString2));
            objNameValuePairs.add(new BasicNameValuePair("SubArea2", subAreaString2));
            objNameValuePairs.add(new BasicNameValuePair("Cate2", strFarm));
            objNameValuePairs.add(new BasicNameValuePair("Type2", strSpinner2));
            objNameValuePairs.add(new BasicNameValuePair("Number2", numberString2));
            objNameValuePairs.add(new BasicNameValuePair("Distance2", strDistance2));
            objNameValuePairs.add(new BasicNameValuePair("Harvest2", strHarvest2));

            objNameValuePairs.add(new BasicNameValuePair("Area3", areaString3));
            objNameValuePairs.add(new BasicNameValuePair("SubArea3", subAreaString3));
            objNameValuePairs.add(new BasicNameValuePair("Cate3", strAnimal));
            objNameValuePairs.add(new BasicNameValuePair("Type3", strSpinner3));
            objNameValuePairs.add(new BasicNameValuePair("Number3", numberString3));
            objNameValuePairs.add(new BasicNameValuePair("Distance3", strDistance3));
            objNameValuePairs.add(new BasicNameValuePair("Harvest3", strHarvest3));

            objNameValuePairs.add(new BasicNameValuePair("Area4", areaString4));
            objNameValuePairs.add(new BasicNameValuePair("SubArea4", subAreaString4));
            objNameValuePairs.add(new BasicNameValuePair("Cate4", strHouse));
            objNameValuePairs.add(new BasicNameValuePair("Type4", strSpinner4));
            objNameValuePairs.add(new BasicNameValuePair("Number4", numberString4));
            objNameValuePairs.add(new BasicNameValuePair("Distance4", strDistance4));
            objNameValuePairs.add(new BasicNameValuePair("Harvest4", strHarvest4));


            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_add_design.php");
            objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
            objHttpClient.execute(objHttpPost);


        } catch (Exception e) {
            Toast.makeText(ProfitActivity.this,
                    "Cannot Design", Toast.LENGTH_SHORT).show();
        }

    } //addDesign

    private void addFerAndFood() {
        try {

            ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
            objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
            objNameValuePairs.add(new BasicNameValuePair("User", userString));

            objNameValuePairs.add(new BasicNameValuePair("Area1", areaString1));
            objNameValuePairs.add(new BasicNameValuePair("Type1", strSpinner1));
            objNameValuePairs.add(new BasicNameValuePair("Number1", numberString1));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo1_1", ratio1_1String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo1_2", ratio1_2String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo1_3", ratio1_3String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo1_4", ratio1_4String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo1_5", ratio1_5String ));

            objNameValuePairs.add(new BasicNameValuePair("Area2", areaString2));
            objNameValuePairs.add(new BasicNameValuePair("Type2", strSpinner2));
            objNameValuePairs.add(new BasicNameValuePair("Number2", numberString2));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo2_1", ratio2_1String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo2_2", ratio2_2String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo2_3", ratio2_3String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo2_4", ratio2_4String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo2_5", ratio2_5String ));

            objNameValuePairs.add(new BasicNameValuePair("Area3", areaString3));
            objNameValuePairs.add(new BasicNameValuePair("Type3", strSpinner3));
            objNameValuePairs.add(new BasicNameValuePair("Number3", numberString3));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo3_1", ratio3_1String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo3_2", ratio3_2String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo3_3", ratio3_3String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo3_4", ratio3_4String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo3_5", ratio3_5String ));

            objNameValuePairs.add(new BasicNameValuePair("Area4", areaString4));
            objNameValuePairs.add(new BasicNameValuePair("Type4", strSpinner4));
            objNameValuePairs.add(new BasicNameValuePair("Number4", numberString4));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo4_1", ratio4_1String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo4_2", ratio4_2String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo4_3", ratio4_3String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo4_4", ratio4_4String ));
            objNameValuePairs.add(new BasicNameValuePair("RatioNo4_5", ratio4_5String ));


            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_add_ferandfood.php");
            objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
            objHttpClient.execute(objHttpPost);





        } catch (Exception e) {
            Toast.makeText(ProfitActivity.this,
                    "Cannot FerAndFood", Toast.LENGTH_SHORT).show();
        }

    } //addFerAndFood

    private void addCost() {
        try {

            ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
            objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
            objNameValuePairs.add(new BasicNameValuePair("User", userString));

            objNameValuePairs.add(new BasicNameValuePair("Area1", areaString1));
            objNameValuePairs.add(new BasicNameValuePair("Type1", strSpinner1));
            objNameValuePairs.add(new BasicNameValuePair("Number1", numberString1));
            objNameValuePairs.add(new BasicNameValuePair("TypeCost1", typeCostString1));
            objNameValuePairs.add(new BasicNameValuePair("FerAndFoodCost1", ferAndFoodCostString1 ));

            objNameValuePairs.add(new BasicNameValuePair("Area2", areaString2));
            objNameValuePairs.add(new BasicNameValuePair("Type2", strSpinner2));
            objNameValuePairs.add(new BasicNameValuePair("Number2", numberString2));
            objNameValuePairs.add(new BasicNameValuePair("TypeCost2", typeCostString2));
            objNameValuePairs.add(new BasicNameValuePair("FerAndFoodCost2", ferAndFoodCostString2));

            objNameValuePairs.add(new BasicNameValuePair("Area3", areaString3));
            objNameValuePairs.add(new BasicNameValuePair("Type3", strSpinner3));
            objNameValuePairs.add(new BasicNameValuePair("Number3", numberString3));
            objNameValuePairs.add(new BasicNameValuePair("TypeCost3", typeCostString3));
            objNameValuePairs.add(new BasicNameValuePair("FerAndFoodCost3", ferAndFoodCostString3 ));

            objNameValuePairs.add(new BasicNameValuePair("Area4", areaString4));
            objNameValuePairs.add(new BasicNameValuePair("Type4", strSpinner4));
            objNameValuePairs.add(new BasicNameValuePair("Number4", numberString4));
            objNameValuePairs.add(new BasicNameValuePair("TypeCost4", typeCostString4));
            objNameValuePairs.add(new BasicNameValuePair("FerAndFoodCost4", ferAndFoodCostString4));




            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_add_cost.php");
            objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
            objHttpClient.execute(objHttpPost);




        } catch (Exception e) {
            Toast.makeText(ProfitActivity.this,
                    "Cannot Cost", Toast.LENGTH_SHORT).show();
        }

    } //addCost

    private void addProfit() {
        try {

            ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
            objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
            objNameValuePairs.add(new BasicNameValuePair("User", userString));

            objNameValuePairs.add(new BasicNameValuePair("Area1", areaString1));
            objNameValuePairs.add(new BasicNameValuePair("Type1", strSpinner1));
            objNameValuePairs.add(new BasicNameValuePair("Number1", numberString1));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod1", profitPeriodString1));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit1", estimatedProfitString1 ));

            objNameValuePairs.add(new BasicNameValuePair("Area2", areaString2));
            objNameValuePairs.add(new BasicNameValuePair("Type2", strSpinner2));
            objNameValuePairs.add(new BasicNameValuePair("Number2", numberString2));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod2", profitPeriodString2));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit2", estimatedProfitString2 ));

            objNameValuePairs.add(new BasicNameValuePair("Area3", areaString3));
            objNameValuePairs.add(new BasicNameValuePair("Type3", strSpinner3));
            objNameValuePairs.add(new BasicNameValuePair("Number3", numberString3));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod3", profitPeriodString3));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit3", estimatedProfitString3 ));

            objNameValuePairs.add(new BasicNameValuePair("Area4", areaString4));
            objNameValuePairs.add(new BasicNameValuePair("Type4", strSpinner4));
            objNameValuePairs.add(new BasicNameValuePair("Number4", numberString4));
            objNameValuePairs.add(new BasicNameValuePair("ProfitPeriod4", profitPeriodString4));
            objNameValuePairs.add(new BasicNameValuePair("EstimatedProfit4", estimatedProfitString4));



            HttpClient objHttpClient = new DefaultHttpClient();
            HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_add_profit.php");
            objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
            objHttpClient.execute(objHttpPost);


        } catch (Exception e) {
            Toast.makeText(ProfitActivity.this,
                    "Cannot Profit", Toast.LENGTH_SHORT).show();
        }

    } //addProfit
    private void initWidget() {
        areaTextView1 = (TextView) findViewById(R.id.textView2);
        typeTextView1 = (TextView) findViewById(R.id.textView6);
        numberTextView1 = (TextView) findViewById(R.id.textView31);
        profitPeriodTextView1 = (TextView) findViewById(R.id.textView7);
        estimatedProfitTextView1 = (TextView) findViewById(R.id.textView8);

        areaTextView2 = (TextView) findViewById(R.id.textView9);
        typeTextView2 = (TextView) findViewById(R.id.textView18);
        numberTextView2 = (TextView) findViewById(R.id.textView32);
        profitPeriodTextView2 = (TextView) findViewById(R.id.textView19);
        estimatedProfitTextView2 = (TextView) findViewById(R.id.textView20);

        areaTextView3 = (TextView) findViewById(R.id.textView12);
        typeTextView3 = (TextView) findViewById(R.id.textView21);
        numberTextView3 = (TextView) findViewById(R.id.textView33);
        profitPeriodTextView3 = (TextView) findViewById(R.id.textView22);
        estimatedProfitTextView3 = (TextView) findViewById(R.id.textView23);

        areaTextView4 = (TextView) findViewById(R.id.textView15);
        typeTextView4 = (TextView) findViewById(R.id.textView24);
        numberTextView4 = (TextView) findViewById(R.id.textView34);
        profitPeriodTextView4 = (TextView) findViewById(R.id.textView25);
        estimatedProfitTextView4 = (TextView) findViewById(R.id.textView26);

    }//initWidget

    private void show1() {
        areaTextView1.setText("พื้นที่ที่ : " +areaString1);

        if (strSpinner1.equals("ทุเรียน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");

        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");



        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");

        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");



        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");
        }//end else if

        else if (strSpinner1.equals("หมู")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if

        else if (strSpinner1.equals("เพาะเห็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " กก.");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " หลัง");
            profitPeriodTextView1.setText(profitPeriodString1);
            estimatedProfitTextView1.setText(estimatedProfitString1 + " บาท");


        }//end else if

    } // show

    private void show2() {
        areaTextView2.setText("พื้นที่ที่ : " + areaString2);

        if (strSpinner2.equals("ทุเรียน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");

        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");



        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");

        }//end else if

        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");



        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");
        }//end else if

        else if (strSpinner2.equals("หมู")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("ปลานิล")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if

        else if (strSpinner2.equals("เพาะเห็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " กก.");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");


        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " หลัง");
            profitPeriodTextView2.setText(profitPeriodString2);
            estimatedProfitTextView2.setText(estimatedProfitString2 + " บาท");



        }//end else if



    } // show

    private void show3() {
        areaTextView3.setText("พื้นที่ที่ : " + areaString3);

        if (strSpinner3.equals("ทุเรียน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");

        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");



        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");

        }//end else if

        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");



        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");
        }//end else if

        else if (strSpinner3.equals("หมู")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if

        else if (strSpinner3.equals("เพาะเห็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " กก.");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");


        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " หลัง");
            profitPeriodTextView3.setText(profitPeriodString3);
            estimatedProfitTextView3.setText(estimatedProfitString3 + " บาท");



        }//end else if



    } // show

    private void show4() {
        areaTextView4.setText("พื้นที่ที่ : " + areaString4);

        if (strSpinner4.equals("ทุเรียน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");

        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");



        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");

        }//end else if

        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");



        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");
        }//end else if

        else if (strSpinner4.equals("หมู")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if

        else if (strSpinner4.equals("เพาะเห็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " กก.");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");


        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " หลัง");
            profitPeriodTextView4.setText(profitPeriodString4);
            estimatedProfitTextView4.setText(estimatedProfitString4 + " บาท");



        }//end else if



    } // show

    private void calProfit1() {
        if (strSpinner1.equals("ทุเรียน")) {
            profitPeriodString1 = "5 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            profitPeriodString1 = "5 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            profitPeriodString1 = "5 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            profitPeriodString1 = "10 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);


        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if

        else if (strSpinner1.equals("หมู")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);
        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if

        else if (strSpinner1.equals("เพาะเห็ด")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            profitPeriodString1 = " 2 ปี";
            estimatedProfitInt1 = (310 * intNumber1) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString1 = String.valueOf(estimatedProfitInt1);

        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            profitPeriodString1 = "-";
            estimatedProfitString1 = "-";


        }//end else if

    }// calCost1

    private void calProfit2() {
        if (strSpinner2.equals("ทุเรียน")) {
            profitPeriodString2 = "5 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            profitPeriodString2 = "5 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            profitPeriodString2 = "5 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            profitPeriodString2 = "10 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);


        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if

        else if (strSpinner2.equals("หมู")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);
        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ปลานิล")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if

        else if (strSpinner2.equals("เพาะเห็ด")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            profitPeriodString2 = " 2 ปี";
            estimatedProfitInt2 = (310 * intNumber2) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString2 = String.valueOf(estimatedProfitInt2);

        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            profitPeriodString2 = "-";
            estimatedProfitString2 = "-";


        }//end else if

    }// calCost2

    private void calProfit3() {
        if (strSpinner3.equals("ทุเรียน")) {
            profitPeriodString3 = "5 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            profitPeriodString3 = "5 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            profitPeriodString3 = "5 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            profitPeriodString3 = "10 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);


        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("หมู")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);
        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if

        else if (strSpinner3.equals("เพาะเห็ด")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            profitPeriodString3 = " 2 ปี";
            estimatedProfitInt3 = (310 * intNumber3) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString3 = String.valueOf(estimatedProfitInt3);

        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            profitPeriodString3 = "-";
            estimatedProfitString3 = "-";


        }//end else if

    }// calCost3

    private void calProfit4() {
        if (strSpinner4.equals("ทุเรียน")) {
            profitPeriodString4 = "5 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            profitPeriodString4 = "5 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            profitPeriodString4 = "5 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            profitPeriodString4 = "10 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);


        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("หมู")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);
        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("เพาะเห็ด")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            profitPeriodString4 = " 2 ปี";
            estimatedProfitInt4 = (310 * intNumber4) / 1; //ได้กำไรกี่บาทต่อต้น
            estimatedProfitString4 = String.valueOf(estimatedProfitInt4);

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            profitPeriodString4 = "-";
            estimatedProfitString4 = "-";


        }//end else if

    }// calCost4


    private void receiveValue() {
        userString = getIntent().getStringExtra("User"); //รับค่า
        bigAreaString = getIntent().getStringExtra("BigArea"); //รับค่า

        areaString1 = getIntent().getStringExtra("Area1");
        areaString2 = getIntent().getStringExtra("Area2");
        areaString3 = getIntent().getStringExtra("Area3");
        areaString4 = getIntent().getStringExtra("Area4");

        strSpinner1 = getIntent().getStringExtra("Type1");
        strSpinner2 = getIntent().getStringExtra("Type2");
        strSpinner3 = getIntent().getStringExtra("Type3");
        strSpinner4 = getIntent().getStringExtra("Type4");

        subAreaString1 = getIntent().getStringExtra("SubArea1");
        subAreaString2 = getIntent().getStringExtra("SubArea2");
        subAreaString3 = getIntent().getStringExtra("SubArea3");
        subAreaString4 = getIntent().getStringExtra("SubArea4");

        intNumber1 = getIntent().getExtras().getInt("Number1");
        intNumber2 = getIntent().getExtras().getInt("Number2");
        intNumber3 = getIntent().getExtras().getInt("Number3");
        intNumber4 = getIntent().getExtras().getInt("Number4");

        strPlant = getIntent().getStringExtra("Cate1");
        strFarm = getIntent().getStringExtra("Cate2");
        strAnimal = getIntent().getStringExtra("Cate3");
        strHouse = getIntent().getStringExtra("Cate4");

        strDistance1 = getIntent().getStringExtra("Distance1");
        strDistance2 = getIntent().getStringExtra("Distance2");
        strDistance3 = getIntent().getStringExtra("Distance3");
        strDistance4 = getIntent().getStringExtra("Distance4");

        strHarvest1 = getIntent().getStringExtra("Harvest1");
        strHarvest2 = getIntent().getStringExtra("Harvest2");
        strHarvest3 = getIntent().getStringExtra("Harvest3");
        strHarvest4 = getIntent().getStringExtra("Harvest4");

        ratio1_1String = getIntent().getStringExtra("RatioNo1_1");
        ratio1_2String = getIntent().getStringExtra("RatioNo1_2");
        ratio1_3String = getIntent().getStringExtra("RatioNo1_3");
        ratio1_4String = getIntent().getStringExtra("RatioNo1_4");
        ratio1_5String = getIntent().getStringExtra("RatioNo1_5");

        ratio2_1String = getIntent().getStringExtra("RatioNo2_1");
        ratio2_2String = getIntent().getStringExtra("RatioNo2_2");
        ratio2_3String = getIntent().getStringExtra("RatioNo2_3");
        ratio2_4String = getIntent().getStringExtra("RatioNo2_4");
        ratio2_5String = getIntent().getStringExtra("RatioNo2_5");

        ratio3_1String = getIntent().getStringExtra("RatioNo3_1");
        ratio3_2String = getIntent().getStringExtra("RatioNo3_2");
        ratio3_3String = getIntent().getStringExtra("RatioNo3_3");
        ratio3_4String = getIntent().getStringExtra("RatioNo3_4");
        ratio3_5String = getIntent().getStringExtra("RatioNo3_5");

        ratio4_1String = getIntent().getStringExtra("RatioNo4_1");
        ratio4_2String = getIntent().getStringExtra("RatioNo4_2");
        ratio4_3String = getIntent().getStringExtra("RatioNo4_3");
        ratio4_4String = getIntent().getStringExtra("RatioNo4_4");
        ratio4_5String = getIntent().getStringExtra("RatioNo4_5");

        typeCostString1 = getIntent().getStringExtra("TypeCost1");
        typeCostString2 = getIntent().getStringExtra("TypeCost2");
        typeCostString3 = getIntent().getStringExtra("TypeCost3");
        typeCostString4 = getIntent().getStringExtra("TypeCost4");

        ferAndFoodCostString1 = getIntent().getStringExtra("FerAndFoodCost1");
        ferAndFoodCostString2 = getIntent().getStringExtra("FerAndFoodCost2");
        ferAndFoodCostString3 = getIntent().getStringExtra("FerAndFoodCost3");
        ferAndFoodCostString4 = getIntent().getStringExtra("FerAndFoodCost4");

        //แปลงค่า
        numberString1 = String.valueOf(intNumber1);
        numberString2 = String.valueOf(intNumber2);
        numberString3 = String.valueOf(intNumber3);
        numberString4 = String.valueOf(intNumber4);
    } // receiveValue
} // Main Class