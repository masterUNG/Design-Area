package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MapFigActivity extends AppCompatActivity {
    private DesignTABLE objDesignTABLE;

    String userString;

    private String typeString1, typeString2, typeString3, typeString4;
    private String strListView1,strListView2,strListView3,strListView4;
    private String strPlant,strFarm,strAnimal,strHouse,strSpinner1,strSpinner2,strSpinner3,strSpinner4;
    private Spinner plantSpinner, farmSpinner, animalSpinner, homeSpinner;
    private Float bigAreaAFloat;
    private Float subArea1,subArea2,subArea3,subArea4;
    private Float durian,mangosteen,corn,rubberTree,rice1,rice2;
    private Float pig,chicken,duck,catfish,tilapia,fish;
    private Float mushroom,compost,etc;

    private String bigAreaString, areaString1, subAreaString1, numberString1
                                , areaString2, subAreaString2, numberString2
                                , areaString3, subAreaString3, numberString3
                                , areaString4, subAreaString4, numberString4;

    private TextView txtPlant,txtFarm,txtAnimal,txtHouse;

    private int subAreaNumber1,subAreaNumber2,subAreaNumber3,subAreaNumber4;
    private int intNumber1,intNumber2,intNumber3,intNumber4;

    private String strDistance1,strDistance2,strDistance3,strDistance4;
    private String strHarvest1,strHarvest2,strHarvest3,strHarvest4;
    private String distanceDurian,distanceMangosteen,distanceCorn,distanceRubberTree;//
    private String harvestDurian,harvestMangosteen,harvestCorn,harvestRubberTree;//

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_fig);

        //Request Database
        objDesignTABLE = new DesignTABLE(this);

        receiveValue();

        //Clean data
        //cleanData();

        //Synchronize JSON to SQLite
        //synJSONtoSQLite();

        calValueFig1();
        calValueFig2();
        calValueFig3();
        calValueFig4();




    }// Main Method

    public void clickSaveDesign(View view) {

        // แปลงค่าเป็น String
        bigAreaString = String.valueOf(bigAreaAFloat);
        areaString1 = String.valueOf(subAreaNumber1);
        subAreaString1 = String.valueOf(subArea1);
        numberString1 = String.valueOf(intNumber1);
        areaString2 = String.valueOf(subAreaNumber2);
        subAreaString2 = String.valueOf(subArea2);
        numberString2 = String.valueOf(intNumber2);
        areaString3 = String.valueOf(subAreaNumber3);
        subAreaString3 = String.valueOf(subArea3);
        numberString3 = String.valueOf(intNumber3);
        areaString4 = String.valueOf(subAreaNumber4);
        subAreaString4 = String.valueOf(subArea4);
        numberString4 = String.valueOf(intNumber4);


       /* StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

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

            Toast.makeText(MapFigActivity.this,
                    "Design Success", Toast.LENGTH_SHORT).show();
            Intent objIntent = new Intent(MapFigActivity.this, FertilizerActivity.class);
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
            Toast.makeText(MapFigActivity.this,
                    "Cannot Design", Toast.LENGTH_SHORT).show();
        }*/
        sentAnswerDesign();

    } // clickSaveDesign

    private void sentAnswerDesign() {
        Intent objIntent = new Intent(MapFigActivity.this,FertilizerActivity.class);
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
        startActivity(objIntent);
        finish();

    }// sentAnswerDesign



    public void clickImage1(View view) {
        showCalDialog1();
    } // clickImage1

    public void clickImage2(View view) {
        showCalDialog2();
    } // clickImage2

    public void clickImage3(View view) {
        showCalDialog3();
    } // clickImage3

    public void clickImage4(View view) {
        showCalDialog4();
    } // clickImage4

    private void showCalDialog1() {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea");
        objBuilder.setMessage("พื้นที่ที่ :  " + subAreaNumber1 + "\n" + "ขนาดพื้นที่ :  " + subArea1 + " ไร่" + "\n" +
                "ประเภท :  " + strPlant + "\n" + "ชนิด :  " + strSpinner1 + "\n" +
                "จำนวน :  " + intNumber1 + " ต้น" + "\n" + "ระยะห่าง :  " + strDistance1 + "\n" +
                "เก็บเกี่ยว :  " + strHarvest1 + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }//showCalDialog

    private void showCalDialog2() {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea");
        objBuilder.setMessage("พื้นที่ที่ :  " + subAreaNumber2 + "\n" + "ขนาดพื้นที่ :  " + subArea2 + " ไร่" + "\n" +
                "ประเภท : " + strFarm + "\n" + "ชนิด : " + strSpinner2 + "\n" +
                "จำนวน : " + intNumber2 + " ต้น" + "\n" + "ระยะห่าง : " + strDistance2 + "\n" +
                "เก็บเกี่ยว : " + strHarvest2 + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }//showCalDialog

    private void showCalDialog3() {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea");
        objBuilder.setMessage("พื้นที่ที่ :  " + subAreaNumber3 + "\n" + "ขนาดพื้นที่ :  " + subArea3 + " ไร่" + "\n" +
                "ประเภท :  " + strAnimal + "\n" + "ชนิด :  " + strSpinner3 + "\n" +
                "จำนวน :  " + intNumber3 + " ตัว" + "\n"  + "ระยะห่าง :  " + strDistance3 + "\n" +
                "เก็บเกี่ยว :  " + strHarvest3 + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }//showCalDialog

    private void showCalDialog4() {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea");
        objBuilder.setMessage("พื้นที่ที่ :  " + subAreaNumber4 + "\n" + "ขนาดพื้นที่ :  " + subArea4 + " ไร่" + "\n" +
                "ประเภท :  " + strHouse + "\n" + "ชนิด :  " + strSpinner4 + "\n" +
                "จำนวน :  " + intNumber4 + " ต้น/กก./หลัง" + "\n" + "ระยะห่าง :  " + strDistance4 + "\n" +
                "เก็บเกี่ยว :  " + strHarvest4 + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }//showCalDialog

    private void calValueFig1() {
        subAreaNumber1 = 1;
        subArea1 = (bigAreaAFloat * 30) / 100;


        //ส่งค่าจำนวน
        if (strSpinner1.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea1) / 1;
            distanceDurian = " 9  เมตร";//
            harvestDurian = " 2  ปี";
            intNumber1 = Integer.valueOf(durian.intValue());
            strDistance1 = String.valueOf(distanceDurian);
            strHarvest1 = String.valueOf(harvestDurian);



        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea1) / 1;
            distanceMangosteen = " 8  เมตร";//
            harvestMangosteen = " 3  ปี";
            intNumber1 = Integer.valueOf(mangosteen.intValue());
            strDistance1 = String.valueOf(distanceMangosteen);//
            strHarvest1 = String.valueOf(harvestMangosteen);


        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea1) / 1;
            distanceCorn = " 35-100  เซนติเมตร";
            harvestCorn = " 6  เดือน";
            intNumber1 = Integer.valueOf(corn.intValue());
            strDistance1 = String.valueOf(distanceCorn);//
            strHarvest1 = String.valueOf(harvestCorn);


        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea1) / 1;
            distanceRubberTree = " 2.5 x 7  เมตร ";
            harvestRubberTree = " 5  ปี";
            intNumber1 = Integer.valueOf(rubberTree.intValue());
            strDistance1 = String.valueOf(distanceRubberTree);//
            strHarvest1 = String.valueOf(harvestRubberTree);


        }//end else if

    }// cal1

    private void calValueFig2() {
        subAreaNumber2 = 2;
        subArea2 = (bigAreaAFloat * 30) / 100;

        //ส่งค่าจำนวน
        if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (5 * subArea2) / 1;
            intNumber2 = Integer.valueOf(rice1.intValue());
            strDistance2 = " 1  เมตร";
            strHarvest2 = " 2  ปี";

        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(rice2.intValue());
            strDistance2 = " 2  เมตร";
            strHarvest2 = " 3  ปี";

        }//end else if

        ////////////////////////////////////////////////////////////////

    }

    private void calValueFig3() {
        subAreaNumber3 = 3;
        subArea3 = (bigAreaAFloat * 30) / 100;


        //ส่งค่าจำนวน
        if (strSpinner3.equals("หมู")) {
            //หมู
            pig = (5 * subArea3) / 1;
            intNumber3 = Integer.valueOf(pig.intValue());
            strDistance3 = " 4  เมตร";
            strHarvest3 = " 2  ปี";

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(chicken.intValue());
            strDistance3 = " 5  เมตร";
            strHarvest3 = " 3  ปี";

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(duck.intValue());
            strDistance3 = " 2  เมตร";
            strHarvest3 = " 2  ปี";

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(catfish.intValue());
            strDistance3 = " 1  เมตร";
            strHarvest3 = " 5  ปี";

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(tilapia.intValue());
            strDistance3 = " 9  เมตร";
            strHarvest3 = " 1  ปี";

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(fish.intValue());
            strDistance3 = " 8  เมตร";
            strHarvest3 = " 7  ปี";

        }//end else if


        ////////////////////////////////////////////////////////////////

    }

    private void calValueFig4() {
        subAreaNumber4 = 4;
        subArea4 = (bigAreaAFloat * 10)/100;



        //ส่งค่าจำนวน
        if (strSpinner4.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea4) / 1;
            intNumber4 = Integer.valueOf(mushroom.intValue());
            strDistance4 = " 5  เมตร";
            strHarvest4 = " 3  ปี";

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(compost.intValue());
            strDistance4 = " 4  เมตร";
            strHarvest4 = " 6  ปี";

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(etc.intValue());
            strDistance4 = " 1  เมตร";
            strHarvest4 = " 8  ปี";

        }//end else if

        ////////////////////////////////////////////////////////////////

    }

    private void receiveValue() {
        bigAreaAFloat = getIntent().getExtras().getFloat("BigArea");//ค่าที่รับ " " ต้องเหมือนกับ " " ที่ส่ง
        userString = getIntent().getStringExtra("User");

        strPlant = getIntent().getStringExtra("strPlant");
        strFarm = getIntent().getStringExtra("strFarm");
        strAnimal = getIntent().getStringExtra("strAnimal");
        strHouse = getIntent().getStringExtra("strHouse");

        strSpinner1 = getIntent().getStringExtra("strSpinner1");
        strSpinner2 = getIntent().getStringExtra("strSpinner2");
        strSpinner3 = getIntent().getStringExtra("strSpinner3");
        strSpinner4 = getIntent().getStringExtra("strSpinner4");

        strListView1 = getIntent().getStringExtra("Cate1");
        strListView2 = getIntent().getStringExtra("Cate2");
        strListView3 = getIntent().getStringExtra("Cate3");
        strListView4 = getIntent().getStringExtra("Cate4");

        typeString1 = getIntent().getStringExtra("Type1");
        typeString2 = getIntent().getStringExtra("Type2");
        typeString3 = getIntent().getStringExtra("Type3");
        typeString4 = getIntent().getStringExtra("Type4");

       /* strPlant = getIntent().getStringExtra("Cate1");
        strFarm = getIntent().getStringExtra("Cate2");
        strAnimal = getIntent().getStringExtra("Cate3");
        strHouse = getIntent().getStringExtra("Cate4");

        strSpinner1 = getIntent().getStringExtra("Type1");
        strSpinner2 = getIntent().getStringExtra("Type2");
        strSpinner3 = getIntent().getStringExtra("Type3");
        strSpinner4 = getIntent().getStringExtra("Type4");*/





    } //receiveValue
}// Main Class

