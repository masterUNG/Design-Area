package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CostActivity extends AppCompatActivity {
    //Explicit
    private ImageView calFerImageView1, calFerImageView2, calFerImageView3, calFerImageView4;
    private String subAreaString1, subAreaString2, subAreaString3, subAreaString4;

    String userString;

    private String ratio1_1String,ratio1_2String,ratio1_3String,ratio1_4String,ratio1_5String,
            ratio2_1String,ratio2_2String,ratio2_3String,ratio2_4String,ratio2_5String,
            ratio3_1String,ratio3_2String,ratio3_3String,ratio3_4String,ratio3_5String,
            ratio4_1String,ratio4_2String,ratio4_3String,ratio4_4String,ratio4_5String;


    private String bigAreaString, areaString1, numberString1
            , areaString2, numberString2
            , areaString3, numberString3
            , areaString4, numberString4;

    private String strDistance1,strDistance2,strDistance3,strDistance4;
    private String strHarvest1,strHarvest2,strHarvest3,strHarvest4;


    private String typeCostString1, typeCostString2, typeCostString3, typeCostString4;
    private String ferAndFoodCostString1, ferAndFoodCostString2, ferAndFoodCostString3, ferAndFoodCostString4;

    private int intNumber1,intNumber2,intNumber3,intNumber4;
    private int typeCost1,typeCost2,typeCost3,typeCost4;
    private int ferAndFoodCost1,ferAndFoodCost2,ferAndFoodCost3,ferAndFoodCost4;

    private String strPlant,strFarm,strAnimal,strHouse,strSpinner1,strSpinner2,strSpinner3,strSpinner4;

    private TextView areaTextView1, areaTextView2, areaTextView3, areaTextView4;
    private TextView typeTextView1, typeTextView2, typeTextView3, typeTextView4;
    private TextView numberTextView1, numberTextView2, numberTextView3, numberTextView4;
    private TextView typeCostTextView1, typeCostTextView2, typeCostTextView3, typeCostTextView4;
    private TextView ferAndFoodCostTextView1, ferAndFoodCostTextView2, ferAndFoodCostTextView3, ferAndFoodCostTextView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cost);

        initWidget();

        receiveValue();

        calCost1();
        calCost2();
        calCost3();
        calCost4();

        show1();
        show2();
        show3();
        show4();
    } // Main Method

    public void clickSaveCost(View view) {
        /*StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

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

            Toast.makeText(CostActivity.this,
                    "Cost Success", Toast.LENGTH_SHORT).show();
            Intent objIntent = new Intent(CostActivity.this, ProfitActivity.class);
            objIntent.putExtra("User", userString);
            objIntent.putExtra("Area1", areaString1);
            objIntent.putExtra("Area2", areaString2);
            objIntent.putExtra("Area3", areaString3);
            objIntent.putExtra("Area4", areaString4);
            objIntent.putExtra("Type1", strSpinner1);
            objIntent.putExtra("Type2", strSpinner2);
            objIntent.putExtra("Type3", strSpinner3);
            objIntent.putExtra("Type4", strSpinner4);
            objIntent.putExtra("Number1", intNumber1); // int
            objIntent.putExtra("Number2", intNumber2); // int
            objIntent.putExtra("Number3", intNumber3); // int
            objIntent.putExtra("Number4", intNumber4); // int
            startActivity(objIntent);
            finish();


        } catch (Exception e) {
            Toast.makeText(CostActivity.this,
                    "Cannot Cost", Toast.LENGTH_SHORT).show();
        }*/

        sentAnswer();



    }//clickSaveCost

    private void initWidget() {
        areaTextView1 = (TextView) findViewById(R.id.textView2);
        typeTextView1 = (TextView) findViewById(R.id.textView6);
        numberTextView1 = (TextView) findViewById(R.id.textView27);
        typeCostTextView1 = (TextView) findViewById(R.id.textView7);
        ferAndFoodCostTextView1 = (TextView) findViewById(R.id.textView8);

        areaTextView2 = (TextView) findViewById(R.id.textView9);
        typeTextView2 = (TextView) findViewById(R.id.textView18);
        numberTextView2 = (TextView) findViewById(R.id.textView28);
        typeCostTextView2 = (TextView) findViewById(R.id.textView19);
        ferAndFoodCostTextView2 = (TextView) findViewById(R.id.textView20);

        areaTextView3 = (TextView) findViewById(R.id.textView12);
        typeTextView3 = (TextView) findViewById(R.id.textView21);
        numberTextView3 = (TextView) findViewById(R.id.textView29);
        typeCostTextView3 = (TextView) findViewById(R.id.textView22);
        ferAndFoodCostTextView3 = (TextView) findViewById(R.id.textView23);

        areaTextView4 = (TextView) findViewById(R.id.textView15);
        typeTextView4 = (TextView) findViewById(R.id.textView24);
        numberTextView4 = (TextView) findViewById(R.id.textView30);
        typeCostTextView4 = (TextView) findViewById(R.id.textView25);
        ferAndFoodCostTextView4 = (TextView) findViewById(R.id.textView26);

    }//initWidget

    private void show1() {
        areaTextView1.setText("พื้นที่ที่ : " +areaString1);

        if (strSpinner1.equals("ทุเรียน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");



        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");




        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");


        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");



        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if

       else  if (strSpinner1.equals("หมู")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if

        else if (strSpinner1.equals("เพาะเห็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " กก.");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");

        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " หลัง");
            typeCostTextView1.setText(typeCostString1 + " บาท");
            ferAndFoodCostTextView1.setText(ferAndFoodCostString1 + " บาท");


        }//end else if



    } // show

    private void show2() {

        areaTextView2.setText("พื้นที่ที่ : " +areaString2);

        if (strSpinner2.equals("ทุเรียน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");



        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");




        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");


        }//end else if

        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");



        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if

        else  if (strSpinner2.equals("หมู")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ปลานิล")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("เพาะเห็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " กก.");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");

        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " หลัง");
            typeCostTextView2.setText(typeCostString2 + " บาท");
            ferAndFoodCostTextView2.setText(ferAndFoodCostString2 + " บาท");


        }//end else if
    } // show

    private void show3() {
        areaTextView3.setText("พื้นที่ที่ : " +areaString3);

        if (strSpinner3.equals("ทุเรียน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");



        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");




        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");


        }//end else if

        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");



        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if

        if (strSpinner3.equals("หมู")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if

        else if (strSpinner3.equals("เพาะเห็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " กก.");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");

        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " หลัง");
            typeCostTextView3.setText(typeCostString3 + " บาท");
            ferAndFoodCostTextView3.setText(ferAndFoodCostString3 + " บาท");


        }//end else if

    } // show

    private void show4() {

        areaTextView4.setText("พื้นที่ที่ : " +areaString4);

        if (strSpinner4.equals("ทุเรียน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");



        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");




        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");


        }//end else if

        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");



        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if

        if (strSpinner4.equals("หมู")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if

       else if (strSpinner4.equals("เพาะเห็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " กก.");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " หลัง");
            typeCostTextView4.setText(typeCostString4 + " บาท");
            ferAndFoodCostTextView4.setText(ferAndFoodCostString4 + " บาท");


        }//end else if

    } // show

    private void calCost1() {
        if (strSpinner1.equals("ทุเรียน")) {
            typeCost1 = (300 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (250 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);


        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            typeCost1 = (320 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (200 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);



        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);


        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            typeCost1 = (220 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (250 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);


        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);


        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if

        else if (strSpinner1.equals("หมู")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            typeCost1 = (120 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (80 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("เพาะเห็ด")) {
            typeCost1 = (220 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (250 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            typeCost1 = (220 * intNumber1) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost1 = (250 * intNumber1) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString1 = String.valueOf(typeCost1);
            ferAndFoodCostString1 = String.valueOf(ferAndFoodCost1);

        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            typeCostString1 = "-"; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCostString1 = "-"; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท


        }//end else if

    }// calCost1

    private void calCost2() {

        if (strSpinner2.equals("ทุเรียน")) {
            typeCost2 = (300 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (250 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);


        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            typeCost2 = (320 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (200 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);



        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);


        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            typeCost2 = (220 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (250 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);


        }//end else if
        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);


        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if

        else if (strSpinner2.equals("หมู")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("ปลานิล")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            typeCost2 = (120 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (80 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("เพาะเห็ด")) {
            typeCost2 = (220 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (250 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            typeCost2 = (220 * intNumber2) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost2 = (250 * intNumber2) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString2 = String.valueOf(typeCost2);
            ferAndFoodCostString2 = String.valueOf(ferAndFoodCost2);

        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            typeCostString2 = "-"; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCostString2 = "-"; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท


        }//end else if

    }// calCost2

    private void calCost3() {
        if (strSpinner3.equals("ทุเรียน")) {
            typeCost3 = (300 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (250 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);


        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            typeCost3 = (320 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (200 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);



        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);


        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            typeCost3 = (220 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (250 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);


        }//end else if
        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);


        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("หมู")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            typeCost3 = (120 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (80 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if

        else if (strSpinner3.equals("เพาะเห็ด")) {
            typeCost3 = (220 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (250 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            typeCost3 = (220 * intNumber3) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost3 = (250 * intNumber3) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString3 = String.valueOf(typeCost3);
            ferAndFoodCostString3 = String.valueOf(ferAndFoodCost3);

        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            typeCostString3 = "-"; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCostString3 = "-"; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท


        }//end else if

    }// calCost3

    private void calCost4() {
        if (strSpinner4.equals("ทุเรียน")) {
            typeCost4 = (300 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (250 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);


        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            typeCost4 = (320 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (200 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);



        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);


        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            typeCost4 = (220 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (250 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);


        }//end else if
        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);


        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("หมู")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            typeCost4 = (120 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (80 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if

        else if (strSpinner4.equals("เพาะเห็ด")) {
            typeCost4 = (220 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (250 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            typeCost4 = (220 * intNumber4) / 1; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCost4 = (250 * intNumber4) / 1; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท
            typeCostString4 = String.valueOf(typeCost4);
            ferAndFoodCostString4 = String.valueOf(ferAndFoodCost4);

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            typeCostString4 = "-"; //ต้องหาว่าต้นนึงกี่บาท
            ferAndFoodCostString4 = "-"; //ต้องหาว่าปุ๋ยที่ใช้ต้นนึงราคากี่บาท


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

        //แปลงค่า
        numberString1 = String.valueOf(intNumber1);
        numberString2 = String.valueOf(intNumber2);
        numberString3 = String.valueOf(intNumber3);
        numberString4 = String.valueOf(intNumber4);
    } // receiveValue

    private void sentAnswer() {
        Intent objIntent = new Intent(CostActivity.this, ProfitActivity.class);
        objIntent.putExtra("SubArea1", subAreaString1);
        objIntent.putExtra("SubArea2", subAreaString2);
        objIntent.putExtra("SubArea3", subAreaString3);
        objIntent.putExtra("SubArea4", subAreaString4);
        objIntent.putExtra("Cate1", strPlant);
        objIntent.putExtra("Cate2", strFarm);
        objIntent.putExtra("Cate3", strAnimal);
        objIntent.putExtra("Cate4", strHouse);
        objIntent.putExtra("Distance1", strDistance1);
        objIntent.putExtra("Distance2", strDistance2);
        objIntent.putExtra("Distance3", strDistance3);
        objIntent.putExtra("Distance4", strDistance4);
        objIntent.putExtra("Harvest1", strHarvest1);
        objIntent.putExtra("Harvest2", strHarvest2);
        objIntent.putExtra("Harvest3", strHarvest3);
        objIntent.putExtra("Harvest4", strHarvest4);
        objIntent.putExtra("User", userString);
        objIntent.putExtra("BigArea", bigAreaString);
        objIntent.putExtra("Area1", areaString1);
        objIntent.putExtra("Area2", areaString2);
        objIntent.putExtra("Area3", areaString3);
        objIntent.putExtra("Area4", areaString4);
        objIntent.putExtra("Type1", strSpinner1);
        objIntent.putExtra("Type2", strSpinner2);
        objIntent.putExtra("Type3", strSpinner3);
        objIntent.putExtra("Type4", strSpinner4);
        objIntent.putExtra("Number1", intNumber1); // int
        objIntent.putExtra("Number2", intNumber2); // int
        objIntent.putExtra("Number3", intNumber3); // int
        objIntent.putExtra("Number4", intNumber4); // int
        objIntent.putExtra("RatioNo1_1", ratio1_1String);
        objIntent.putExtra("RatioNo1_2", ratio1_2String);
        objIntent.putExtra("RatioNo1_3", ratio1_3String);
        objIntent.putExtra("RatioNo1_4", ratio1_4String);
        objIntent.putExtra("RatioNo1_5", ratio1_5String);

        objIntent.putExtra("RatioNo2_1", ratio2_1String);
        objIntent.putExtra("RatioNo2_2", ratio2_2String);
        objIntent.putExtra("RatioNo2_3", ratio2_3String);
        objIntent.putExtra("RatioNo2_4", ratio2_4String);
        objIntent.putExtra("RatioNo2_5", ratio2_5String);

        objIntent.putExtra("RatioNo3_1", ratio3_1String);
        objIntent.putExtra("RatioNo3_2", ratio3_2String);
        objIntent.putExtra("RatioNo3_3", ratio3_3String);
        objIntent.putExtra("RatioNo3_4", ratio3_4String);
        objIntent.putExtra("RatioNo3_5", ratio3_5String);

        objIntent.putExtra("RatioNo4_1", ratio4_1String);
        objIntent.putExtra("RatioNo4_2", ratio4_2String);
        objIntent.putExtra("RatioNo4_3", ratio4_3String);
        objIntent.putExtra("RatioNo4_4", ratio4_4String);
        objIntent.putExtra("RatioNo4_5", ratio4_5String);

        objIntent.putExtra("TypeCost1", typeCostString1);
        objIntent.putExtra("TypeCost2", typeCostString2);
        objIntent.putExtra("TypeCost3", typeCostString3);
        objIntent.putExtra("TypeCost4", typeCostString4);

        objIntent.putExtra("FerAndFoodCost1", ferAndFoodCostString1);
        objIntent.putExtra("FerAndFoodCost2", ferAndFoodCostString2);
        objIntent.putExtra("FerAndFoodCost3", ferAndFoodCostString3);
        objIntent.putExtra("FerAndFoodCost4", ferAndFoodCostString4);

        startActivity(objIntent);
        finish();
    }//sentAnswerFerAndFood
} // Main Class
