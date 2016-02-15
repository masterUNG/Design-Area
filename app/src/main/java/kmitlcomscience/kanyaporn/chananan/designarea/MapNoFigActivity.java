package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MapNoFigActivity extends AppCompatActivity {

    private DesignTABLE objDesignTABLE;

    String userString;


    private String type,type1, type2, type3, type4;
    private String strListView,strListView1,strListView2,strListView3,strListView4;
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

    private int inPutInt1, inPutInt2, inPutInt3, inPutInt4;

    private String typeString,typeString1, typeString2, typeString3, typeString4;
    private String cateString,cateString1, cateString2, cateString3, cateString4;

    private TextView txtPlant,txtFarm,txtAnimal,txtHouse;

    private int subAreaNumber1,subAreaNumber2,subAreaNumber3,subAreaNumber4;
    private int intNumber, intNumber1,intNumber2,intNumber3,intNumber4;

    private String strDistance, strDistance1,strDistance2,strDistance3,strDistance4;
    private String strHarvest, strHarvest1,strHarvest2,strHarvest3,strHarvest4;
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

        calValueNoFig1();
        calValueNoFig2();
        calValueNoFig3();
        calValueNoFig4();





    }// Main Method

    private void calValueNoFig() {
        subAreaNumber1 = 1;
        subArea1 = (bigAreaAFloat * 30) / 100;



        //ส่งค่าจำนวน
        if (typeString1.equals("ทุเรียน") || typeString2.equals("ทุเรียน") ||
            typeString3.equals("ทุเรียน") || typeString4.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea1) / 1;
            distanceDurian = " 9  เมตร";//
            harvestDurian = " 2  ปี";
            intNumber = Integer.valueOf(durian.intValue());
            strDistance = String.valueOf(distanceDurian);
            strHarvest = String.valueOf(harvestDurian);
            strListView = String.valueOf(strListView1);
            type1 = String.valueOf(typeString1);



        }//end if
        else if (typeString1.equals("มังคุด") || typeString2.equals("มังคุด") ||
                 typeString3.equals("มังคุด") || typeString4.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea1) / 1;
            distanceMangosteen = " 8  เมตร";//
            harvestMangosteen = " 3  ปี";
            intNumber = Integer.valueOf(mangosteen.intValue());
            strDistance = String.valueOf(distanceMangosteen);//
            strHarvest = String.valueOf(harvestMangosteen);
            strListView = String.valueOf(strListView1);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);


        }//end else if
        else if (typeString1.equals("ข้าวโพด") || typeString2.equals("ข้าวโพด") ||
                 typeString3.equals("ข้าวโพด") || typeString4.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea1) / 1;
            distanceCorn = " 35-100  เซนติเมตร";
            harvestCorn = " 6  เดือน";
            intNumber = Integer.valueOf(corn.intValue());
            strDistance = String.valueOf(distanceCorn);//
            strHarvest = String.valueOf(harvestCorn);
            strListView = String.valueOf(strListView1);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);


        }//end else if
        else if (typeString1.equals("ยางพารา") || typeString2.equals("ยางพารา") ||
                 typeString3.equals("ยางพารา") || typeString4.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea1) / 1;
            distanceRubberTree = " 2.5 x 7  เมตร ";
            harvestRubberTree = " 5  ปี";
            intNumber = Integer.valueOf(rubberTree.intValue());
            strDistance = String.valueOf(distanceRubberTree);//
            strHarvest = String.valueOf(harvestRubberTree);
            strListView = String.valueOf(strListView1);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);



        }//end else if

        ///////////////////////////////
        subAreaNumber2 = 2;
        subArea2 = (bigAreaAFloat * 30) / 100;

        //ส่งค่าจำนวน
        if (typeString1.equals("ข้าวหอมมะลิ") || typeString2.equals("ข้าวหอมมะลิ") ||
            typeString3.equals("ข้าวหอมมะลิ") || typeString4.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (5 * subArea2) / 1;
            intNumber = Integer.valueOf(rice1.intValue());
            strDistance = " 1  เมตร";
            strHarvest = " 2  ปี";
            strListView = String.valueOf(strListView2);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end if
        else if (typeString1.equals("ข้าวกล้อง") || typeString2.equals("ข้าวกล้อง") ||
                 typeString3.equals("ข้าวกล้อง") || typeString4.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea2) / 1;
            intNumber = Integer.valueOf(rice2.intValue());
            strDistance = " 2  เมตร";
            strHarvest = " 3  ปี";
            strListView = String.valueOf(strListView2);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if

        //////////////////////////////////
        subAreaNumber3 = 3;
        subArea3 = (bigAreaAFloat * 30) / 100;


        //ส่งค่าจำนวน
        if (typeString1.equals("หมู") || typeString2.equals("หมู") ||
            typeString3.equals("หมู") || typeString4.equals("หมู")) {
            //หมู
            pig = (5 * subArea3) / 1;
            intNumber = Integer.valueOf(pig.intValue());
            strDistance = " 4  เมตร";
            strHarvest = " 2  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("ไก่") || typeString2.equals("ไก่") ||
                 typeString3.equals("ไก่") || typeString4.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea3) / 1;
            intNumber = Integer.valueOf(chicken.intValue());
            strDistance = " 5  เมตร";
            strHarvest = " 3  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("เป็ด") || typeString2.equals("เป็ด") ||
                 typeString3.equals("เป็ด") || typeString4.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea3) / 1;
            intNumber = Integer.valueOf(duck.intValue());
            strDistance = " 2  เมตร";
            strHarvest = " 2  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);


        }//end else if
        else if (typeString1.equals("ปลานิล") || typeString2.equals("ปลานิล") ||
                 typeString3.equals("ปลานิล") || typeString4.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea3) / 1;
            intNumber = Integer.valueOf(catfish.intValue());
            strDistance = " 1  เมตร";
            strHarvest = " 5  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("ปลาดุก") || typeString2.equals("ปลาดุก") ||
                 typeString3.equals("ปลาดุก") || typeString4.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea3) / 1;
            intNumber = Integer.valueOf(tilapia.intValue());
            strDistance = " 9  เมตร";
            strHarvest = " 1  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("ปลาสลิด") || typeString2.equals("ปลาสลิด") ||
                 typeString3.equals("ปลาสลิด") || typeString4.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea3) / 1;
            intNumber = Integer.valueOf(fish.intValue());
            strDistance = " 8  เมตร";
            strHarvest = " 7  ปี";
            strListView = String.valueOf(strListView3);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if


        ////////////////////////////////////////////////////////////////
        subAreaNumber4 = 4;
        subArea4 = (bigAreaAFloat * 10)/100;



        //ส่งค่าจำนวน
        if (typeString1.equals("เพาะเห็ด") || typeString2.equals("เพาะเห็ด") ||
            typeString3.equals("เพาะเห็ด") || typeString4.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea4) / 1;
            intNumber = Integer.valueOf(mushroom.intValue());
            strDistance = " 5  เมตร";
            strHarvest = " 3  ปี";
            strListView = String.valueOf(strListView4);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("ปุ๋ยหมัก") || typeString2.equals("ปุ๋ยหมัก") ||
                 typeString3.equals("ปุ๋ยหมัก") || typeString4.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea4) / 1;
            intNumber = Integer.valueOf(compost.intValue());
            strDistance = " 4  เมตร";
            strHarvest = " 6  ปี";
            strListView = String.valueOf(strListView4);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if
        else if (typeString1.equals("บ้าน") || typeString2.equals("บ้าน") ||
                 typeString3.equals("บ้าน") || typeString4.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea4) / 1;
            intNumber = Integer.valueOf(etc.intValue());
            strDistance = " 1  เมตร";
            strHarvest = " 8  ปี";
            strListView = String.valueOf(strListView4);
            type1 = String.valueOf(typeString1);
            type2 = String.valueOf(typeString2);
            type3 = String.valueOf(typeString3);
            type4 = String.valueOf(typeString4);

        }//end else if

        ////////////////////////////////////////////////////////////////

    }//calValueNoFig*/

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


        sentAnswerDesign();

    } // clickSaveDesign

    private void sentAnswerDesign() {
        Intent objIntent = new Intent(MapNoFigActivity.this,FertilizerActivity.class);
        objIntent.putExtra("User", userString);
        objIntent.putExtra("BigArea", bigAreaString);
        objIntent.putExtra("Area1", areaString1);
        objIntent.putExtra("Area2", areaString2);
        objIntent.putExtra("Area3", areaString3);
        objIntent.putExtra("Area4", areaString4);
        objIntent.putExtra("Type1", typeString1);
        objIntent.putExtra("Type2", typeString2);
        objIntent.putExtra("Type3", typeString3);
        objIntent.putExtra("Type4", typeString4);
        objIntent.putExtra("Number1", intNumber1); // int
        objIntent.putExtra("Number2", intNumber2); // int
        objIntent.putExtra("Number3", intNumber3); // int
        objIntent.putExtra("Number4", intNumber4); // int
        objIntent.putExtra("SubArea1", subAreaString1);
        objIntent.putExtra("SubArea2", subAreaString2);
        objIntent.putExtra("SubArea3", subAreaString3);
        objIntent.putExtra("SubArea4", subAreaString4);
        objIntent.putExtra("Cate1", strListView1);
        objIntent.putExtra("Cate2", strListView2);
        objIntent.putExtra("Cate3", strListView3);
        objIntent.putExtra("Cate4", strListView4);
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
                "ประเภท :  " + strListView1 + "\n" + "ชนิด :  " + typeString1 + "\n" +
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
                "ประเภท : " + strListView2 + "\n" + "ชนิด : " + typeString2 + "\n" +
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
                "ประเภท :  " + strListView3 + "\n" + "ชนิด :  " + typeString3 + "\n" +
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
                "ประเภท :  " + strListView4 + "\n" + "ชนิด :  " + typeString4 + "\n" +
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

    private void calValueNoFig1() {
        subAreaNumber1 = 1;
        subArea1 = (bigAreaAFloat * inPutInt1) / 100;


        //ส่งค่าจำนวน
        if (type1.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea1) / 1;
            intNumber1 = Integer.valueOf(durian.intValue());
            strDistance1 = " 9  เมตร";
            strHarvest1 = " 5  ปี";
            strListView1 = String.valueOf("พืชสวน / พืชไร่");
            typeString1 = String.valueOf("ทุเรียน");


        }//end if
        else if (type1.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea1) / 1;
            intNumber1 = Integer.valueOf(mangosteen.intValue());
            strDistance1 = " 8  เมตร";
            strHarvest1 = " 1  ปี";
            strListView1 = String.valueOf("พืชสวน / พืชไร่");
            typeString1 = String.valueOf("มังคุด");


        }//end else if
        else if (type1.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea1) / 1;
            intNumber1 = Integer.valueOf(corn.intValue());
            strDistance1 = " 8  เมตร";
            strHarvest1 = " 1  ปี";
            strListView1 = String.valueOf("พืชสวน / พืชไร่");
            typeString1 = String.valueOf("ข้าวโพด");


        }//end else if
        else if (type1.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea1) / 1;
            intNumber1 = Integer.valueOf(rubberTree.intValue());
            strDistance1 = " 8  เมตร";
            strHarvest1 = " 1  ปี";
            strListView1 = String.valueOf("พืชสวน / พืชไร่");
            typeString1 = String.valueOf("ยางพารา");

        }//end else if
        ///////////////////////////////////////////////
        else if (type1.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(rice1.intValue());
            strDistance1 = " 1  เมตร";
            strHarvest1 = " 1  ปี";
            strListView1 = String.valueOf("ทำนา");
            typeString1 = String.valueOf("ข้าวหอมมะลิ");

        }//end if
        else if (type1.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(rice2.intValue());
            strDistance1 = " 2  เมตร";
            strHarvest1 = " 3  ปี";
            strListView1 = String.valueOf("ทำนา");
            typeString1 = String.valueOf("ข้าวกล้อง");

        }//end else if
        //////////////////////////////////////////

        //ส่งค่าจำนวน
        else if (type1.equals("หมู")) {
            //หมู
            pig = (5 * subArea1) / 1;
            intNumber1 = Integer.valueOf(pig.intValue());
            strDistance1 = " 4  เมตร";
            strHarvest1 = " 2  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("หมู");

        }//end else if
        else if (type1.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(chicken.intValue());
            strDistance1 = " 5  เมตร";
            strHarvest1 = " 3  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("ไก่");

        }//end else if
        else if (type1.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(duck.intValue());
            strDistance1 = " 2  เมตร";
            strHarvest1 = " 2  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("เป็ด");


        }//end else if
        else if (type1.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(catfish.intValue());
            strDistance1 = " 1  เมตร";
            strHarvest1 = " 5  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("ปลานิล");

        }//end else if
        else if (type1.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(tilapia.intValue());
            strDistance1 = " 9  เมตร";
            strHarvest1 = " 1  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("ปลาดุก");

        }//end else if
        else if (type1.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(fish.intValue());
            strDistance1 = " 8  เมตร";
            strHarvest1 = " 7  ปี";
            strListView1 = String.valueOf("เลี้ยงสัตว์");
            typeString1 = String.valueOf("ปลาสลิด");
        }//end else if

        else if (type1.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea1) / 1;
            intNumber1 = Integer.valueOf(mushroom.intValue());
            strDistance1 = " 5  เมตร";
            strHarvest1 = " 3  ปี";
            strListView1 = String.valueOf("ที่พักอาศัย");
            typeString1 = String.valueOf("เพาะเห็ด");

        }//end else if
        else if (type1.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(compost.intValue());
            strDistance1 = " 4  เมตร";
            strHarvest1 = " 6  ปี";
            strListView1 = String.valueOf("ที่พักอาศัย");
            typeString1 = String.valueOf("ปุ๋ยหมัก");

        }//end else if
        else if (type1.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea1) / 1;
            intNumber1 = Integer.valueOf(etc.intValue());
            strDistance1 = " 1  เมตร";
            strHarvest1 = " 8  ปี";
            strListView1 = String.valueOf("ที่พักอาศัย");
            typeString1 = String.valueOf("บ้าน");

        }//end else if



    }// cal1

    private void calValueNoFig2() {

        subAreaNumber2 = 2;
        subArea2 = (bigAreaAFloat * inPutInt2) / 100;

        if (type2.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea2) / 1;
            intNumber2 = Integer.valueOf(durian.intValue());
            strDistance2 = " 9  เมตร";
            strHarvest2 = " 5  ปี";
            strListView2 = String.valueOf("พืชสวน / พืชไร่");
            typeString2 = String.valueOf("ทุเรียน");



        }//end if
        else if (type2.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea2) / 1;
            intNumber2 = Integer.valueOf(mangosteen.intValue());
            strDistance2 = " 8  เมตร";
            strHarvest2 = " 1  ปี";
            strListView2 = String.valueOf("พืชสวน / พืชไร่");
            typeString2 = String.valueOf("มังคุด");


        }//end else if
        else if (type2.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea2) / 1;
            intNumber2 = Integer.valueOf(corn.intValue());
            strDistance2 = " 8  เมตร";
            strHarvest2 = " 1  ปี";
            strListView2 = String.valueOf("พืชสวน / พืชไร่");
            typeString2 = String.valueOf("ข้าวโพด");
        }//end else if
        else if (type2.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea2) / 1;
            intNumber2 = Integer.valueOf(rubberTree.intValue());
            strDistance2 = " 8  เมตร";
            strHarvest2 = " 1  ปี";
            strListView2 = String.valueOf("พืชสวน / พืชไร่");
            typeString2 = String.valueOf("ยางพารา");

        }//end else if
        ///////////////////////////////////////////////
        else if (type2.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (5 * subArea2) / 1;
            intNumber2 = Integer.valueOf(rice1.intValue());
            strDistance2 = " 1  เมตร";
            strHarvest2 = " 2  ปี";
            strListView2 = String.valueOf("ทำนา");
            typeString2 = String.valueOf("ข้าวหอมมะลิ");

        }//end if
        else if (type2.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(rice2.intValue());
            strDistance2 = " 2  เมตร";
            strHarvest2 = " 3  ปี";
            strListView2 = String.valueOf("ทำนา");
            typeString2 = String.valueOf("ข้าวกล้อง");

        }//end else if
        //////////////////////////////////////////

        //ส่งค่าจำนวน
        else if (type2.equals("หมู")) {
            //หมู
            pig = (5 * subArea2) / 1;
            intNumber2 = Integer.valueOf(pig.intValue());
            strDistance2 = " 4  เมตร";
            strHarvest2 = " 2  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("หมู");

        }//end else if
        else if (type2.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(chicken.intValue());
            strDistance2 = " 5  เมตร";
            strHarvest2 = " 3  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("ไก่");

        }//end else if
        else if (type2.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(duck.intValue());
            strDistance2 = " 2  เมตร";
            strHarvest2 = " 2  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("เป็ด");


        }//end else if
        else if (type2.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(catfish.intValue());
            strDistance2 = " 1  เมตร";
            strHarvest2 = " 5  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("ปลานิล");

        }//end else if
        else if (type2.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(tilapia.intValue());
            strDistance2 = " 9  เมตร";
            strHarvest2 = " 1  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("ปลาดุก");

        }//end else if
        else if (type2.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(fish.intValue());
            strDistance2 = " 8  เมตร";
            strHarvest2 = " 7  ปี";
            strListView2 = String.valueOf("เลี้ยงสัตว์");
            typeString2 = String.valueOf("ปลาสลิด");
        }//end else if

        else if (type2.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea2) / 1;
            intNumber2 = Integer.valueOf(mushroom.intValue());
            strDistance2 = " 5  เมตร";
            strHarvest2 = " 3  ปี";
            strListView2 = String.valueOf("ที่พักอาศัย");
            typeString2 = String.valueOf("เพาะเห็ด");

        }//end else if
        else if (type2.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(compost.intValue());
            strDistance2 = " 4  เมตร";
            strHarvest2 = " 6  ปี";
            strListView2 = String.valueOf("ที่พักอาศัย");
            typeString2 = String.valueOf("ปุ๋ยหมัก");

        }//end else if
        else if (type2.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea2) / 1;
            intNumber2 = Integer.valueOf(etc.intValue());
            strDistance2 = " 1  เมตร";
            strHarvest2 = " 8  ปี";
            strListView2 = String.valueOf("ที่พักอาศัย");
            typeString2 = String.valueOf("บ้าน");

        }//end else if


        ////////////////////////////////////////////////////////////////

    }

    private void calValueNoFig3() {

        subAreaNumber3 = 3;
        subArea3 = (bigAreaAFloat * inPutInt3) / 100;


        if (type3.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea3) / 1;
            intNumber3 = Integer.valueOf(durian.intValue());
            strDistance3 = " 9  เมตร";
            strHarvest3 = " 5  ปี";
            strListView3 = String.valueOf("พืชสวน / พืชไร่");
            typeString3 = String.valueOf("ทุเรียน");



        }//end if
        else if (type3.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea3) / 1;
            intNumber3 = Integer.valueOf(mangosteen.intValue());
            strDistance3 = " 8  เมตร";
            strHarvest3 = " 1  ปี";
            strListView3 = String.valueOf("พืชสวน / พืชไร่");
            typeString3 = String.valueOf("มังคุด");


        }//end else if
        else if (type3.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea3) / 1;
            intNumber3 = Integer.valueOf(corn.intValue());
            strDistance3 = " 8  เมตร";
            strHarvest3 = " 1  ปี";
            strListView3 = String.valueOf("พืชสวน / พืชไร่");
            typeString3 = String.valueOf("ข้าวโพด");

        }//end else if
        else if (type3.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea3) / 1;
            intNumber3 = Integer.valueOf(rubberTree.intValue());
            strDistance3 = " 8  เมตร";
            strHarvest3 = " 1  ปี";
            strListView3 = String.valueOf("พืชสวน / พืชไร่");
            typeString3 = String.valueOf("ยางพารา");

        }//end else if
        ///////////////////////////////////////////////
        else if (type3.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (5 * subArea3) / 1;
            intNumber3 = Integer.valueOf(rice1.intValue());
            strDistance3 = " 1  เมตร";
            strHarvest3 = " 2  ปี";
            strListView3 = String.valueOf("ทำนา");
            typeString3 = String.valueOf("ข้าวหอมมะลิ");

        }//end if
        else if (type3.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(rice2.intValue());
            strDistance3 = " 2  เมตร";
            strHarvest3 = " 3  ปี";
            strListView3 = String.valueOf("ทำนา");
            typeString3 = String.valueOf("ข้าวกล้อง");

        }//end else if
        //////////////////////////////////////////

        //ส่งค่าจำนวน
        else if (type3.equals("หมู")) {
            //หมู
            pig = (5 * subArea3) / 1;
            intNumber3 = Integer.valueOf(pig.intValue());
            strDistance3 = " 4  เมตร";
            strHarvest3 = " 2  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("หมู");

        }//end else if
        else if (type3.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(chicken.intValue());
            strDistance3 = " 5  เมตร";
            strHarvest3 = " 3  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("ไก่");

        }//end else if
        else if (type3.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(duck.intValue());
            strDistance3 = " 2  เมตร";
            strHarvest3 = " 2  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("เป็ด");


        }//end else if
        else if (type3.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(catfish.intValue());
            strDistance3 = " 1  เมตร";
            strHarvest3 = " 5  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("ปลานิล");

        }//end else if
        else if (type3.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(tilapia.intValue());
            strDistance3 = " 9  เมตร";
            strHarvest3 = " 1  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("ปลาดุก");

        }//end else if
        else if (type3.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(fish.intValue());
            strDistance3 = " 8  เมตร";
            strHarvest3 = " 7  ปี";
            strListView3 = String.valueOf("เลี้ยงสัตว์");
            typeString3 = String.valueOf("ปลาสลิด");
        }//end else if

        if (type3.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea3) / 1;
            intNumber3 = Integer.valueOf(mushroom.intValue());
            strDistance3 = " 5  เมตร";
            strHarvest3 = " 3  ปี";
            strListView3 = String.valueOf("ที่พักอาศัย");
            typeString3 = String.valueOf("เพาะเห็ด");

        }//end else if
        else if (type3.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(compost.intValue());
            strDistance3 = " 4  เมตร";
            strHarvest3 = " 6  ปี";
            strListView3 = String.valueOf("ที่พักอาศัย");
            typeString3 = String.valueOf("ปุ๋ยหมัก");

        }//end else if
        else if (type3.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea3) / 1;
            intNumber3 = Integer.valueOf(etc.intValue());
            strDistance3 = " 1  เมตร";
            strHarvest3 = " 8  ปี";
            strListView3 = String.valueOf("ที่พักอาศัย");
            typeString3 = String.valueOf("บ้าน");

        }//end else if




        ////////////////////////////////////////////////////////////////

    }

    private void calValueNoFig4() {

        subAreaNumber4 = 4;
        subArea4 = (bigAreaAFloat * inPutInt4) / 100;



        if (type4.equals("ทุเรียน")) {
            //ระยะห่าง 9 เมตร
            durian = (20 * subArea4) / 1;
            intNumber4 = Integer.valueOf(durian.intValue());
            strDistance4 = " 9  เมตร";
            strHarvest4 = " 5  ปี";
            strListView4 = String.valueOf("พืชสวน / พืชไร่");
            typeString4 = String.valueOf("ทุเรียน");



        }//end if
        else if (type4.equals("มังคุด")) {
            //ระยะห่าง 8 เมตร
            mangosteen = (25 * subArea4) / 1;
            intNumber4 = Integer.valueOf(mangosteen.intValue());
            strDistance4 = " 8  เมตร";
            strHarvest4 = " 1  ปี";
            strListView4 = String.valueOf("พืชสวน / พืชไร่");
            typeString4 = String.valueOf("มังคุด");


        }//end else if
        else if (type4.equals("ข้าวโพด")) {
            //ระยะระหว่างแถวประมาณ 35-100 เซนติเมตร
            //จำนวนต้นข้าวโพดประมาณ ๖,๐๐๐-๘,๐๐๐ ต้น/ไร่
            corn = (6000 * subArea4) / 1;
            intNumber4 = Integer.valueOf(corn.intValue());
            strDistance4 = " 8  เมตร";
            strHarvest4 = " 1  ปี";
            strListView4 = String.valueOf("พืชสวน / พืชไร่");
            typeString4 = String.valueOf("ข้าวโพด");

        }//end else if
        else if (type4.equals("ยางพารา")) {
            //สำหรับในเขตปลูกยางใหม่ ระยะปลูกควรเป็น 2.5 x 7 เมตร (จะได้ต้นยางไร่ละ 91 ต้น)
            rubberTree = (91 * subArea4) / 1;
            intNumber4 = Integer.valueOf(rubberTree.intValue());
            strDistance4 = " 8  เมตร";
            strHarvest4 = " 1  ปี";
            strListView4 = String.valueOf("พืชสวน / พืชไร่");
            typeString4 = String.valueOf("ยางพารา");

        }//end else if
        ///////////////////////////////////////////////
        else if (type4.equals("ข้าวหอมมะลิ")) {
            //นาดำ ให้ใช้เมล็ดพันธุ์ข้าว 5 กิโลกรัม ต่อ ไร่
            rice1 = (5 * subArea4) / 1;
            intNumber4 = Integer.valueOf(rice1.intValue());
            strDistance4 = " 1  เมตร";
            strHarvest4 = " 2  ปี";
            strListView4 = String.valueOf("ทำนา");
            typeString4 = String.valueOf("ข้าวหอมมะลิ");

        }//end if
        else if (type4.equals("ข้าวกล้อง")) {
            //นาหว่าน ให้ใช้เมล็ดพันธุ์ข้าว 15  20 กิโลกรัม ต่อ ไร่
            rice2 = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(rice2.intValue());
            strDistance4 = " 2  เมตร";
            strHarvest4 = " 3  ปี";
            strListView4 = String.valueOf("ทำนา");
            typeString4 = String.valueOf("ข้าวกล้อง");

        }//end else if
        //////////////////////////////////////////

        //ส่งค่าจำนวน
        else if (type4.equals("หมู")) {
            //หมู
            pig = (5 * subArea4) / 1;
            intNumber4 = Integer.valueOf(pig.intValue());
            strDistance4 = " 4  เมตร";
            strHarvest4 = " 2  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("หมู");

        }//end else if
        else if (type4.equals("ไก่")) {
            //ไก่
            chicken = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(chicken.intValue());
            strDistance4 = " 5  เมตร";
            strHarvest4 = " 3  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("ไก่");

        }//end else if
        else if (type4.equals("เป็ด")) {
            //เป็ด
            duck = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(duck.intValue());
            strDistance4 = " 2  เมตร";
            strHarvest4 = " 2  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("เป็ด");


        }//end else if
        else if (type4.equals("ปลานิล")) {
            //ปลาดุก
            catfish = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(catfish.intValue());
            strDistance4 = " 1  เมตร";
            strHarvest4 = " 5  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("ปลานิล");

        }//end else if
        else if (type4.equals("ปลาดุก")) {
            //ปลานิล
            tilapia = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(tilapia.intValue());
            strDistance4 = " 9  เมตร";
            strHarvest4 = " 1  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("ปลาดุก");

        }//end else if
        else if (type4.equals("ปลาสลิด")) {
            //ปลาสลิด
            fish = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(fish.intValue());
            strDistance4 = " 8  เมตร";
            strHarvest4 = " 7  ปี";
            strListView4 = String.valueOf("เลี้ยงสัตว์");
            typeString4 = String.valueOf("ปลาสลิด");
        }//end else if

        else if (type4.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea4) / 1;
            intNumber4 = Integer.valueOf(mushroom.intValue());
            strDistance4 = " 5  เมตร";
            strHarvest4 = " 3  ปี";
            strListView4 = String.valueOf("ที่พักอาศัย");
            typeString4 = String.valueOf("เพาะเห็ด");

        }//end else if
        else if (type4.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(compost.intValue());
            strDistance4 = " 4  เมตร";
            strHarvest4 = " 6  ปี";
            strListView4 = String.valueOf("ที่พักอาศัย");
            typeString4 = String.valueOf("ปุ๋ยหมัก");

        }//end else if
        else if (type4.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea4) / 1;
            intNumber4 = Integer.valueOf(etc.intValue());
            strDistance4 = " 1  เมตร";
            strHarvest4 = " 8  ปี";
            strListView4 = String.valueOf("ที่พักอาศัย");
            typeString4 = String.valueOf("บ้าน");

        }//end else if

       /* subAreaNumber4 = 4;
        subArea4 = (bigAreaAFloat * 10)/100;



        //ส่งค่าจำนวน
        if (typeString4.equals("เพาะเห็ด")) {
            //เพาะเห็ด
            mushroom = (5 * subArea4) / 1;
            intNumber = Integer.valueOf(mushroom.intValue());
            strDistance = " 5  เมตร";
            strHarvest = " 3  ปี";
            strListView = String.valueOf(strListView4);
            typeString = String.valueOf(typeString4);

        }//end else if
        else if (typeString4.equals("ปุ๋ยหมัก")) {
            //ปุ๋ยหมัก
            compost = (15 * subArea4) / 1;
            intNumber = Integer.valueOf(compost.intValue());
            strDistance = " 4  เมตร";
            strHarvest = " 6  ปี";
            strListView = String.valueOf(strListView4);
            typeString = String.valueOf(typeString4);

        }//end else if
        else if (typeString4.equals("บ้าน")) {
            //อื่นๆ
            etc = (15 * subArea4) / 1;
            intNumber = Integer.valueOf(etc.intValue());
            strDistance = " 1  เมตร";
            strHarvest = " 8  ปี";
            strListView = String.valueOf(strListView4);
            typeString = String.valueOf(typeString4);

        }//end else if*/

        ////////////////////////////////////////////////////////////////

    }

    private void receiveValue() {
        bigAreaAFloat = getIntent().getExtras().getFloat("BigArea");//ค่าที่รับ " " ต้องเหมือนกับ " " ที่ส่ง
        userString = getIntent().getStringExtra("User");


        cateString1 = getIntent().getStringExtra("Cate1");
        cateString2 = getIntent().getStringExtra("Cate2");
        cateString3 = getIntent().getStringExtra("Cate3");
        cateString4 = getIntent().getStringExtra("Cate4");


        type1 = getIntent().getStringExtra("Type1");
        type2 = getIntent().getStringExtra("Type2");
        type3 = getIntent().getStringExtra("Type3");
        type4 = getIntent().getStringExtra("Type4");

        inPutInt1 = getIntent().getExtras().getInt("InputPer1");
        inPutInt2 = getIntent().getExtras().getInt("InputPer2");
        inPutInt3 = getIntent().getExtras().getInt("InputPer3");
        inPutInt4 = getIntent().getExtras().getInt("InputPer4");





    } //receiveValue
}// Main Class