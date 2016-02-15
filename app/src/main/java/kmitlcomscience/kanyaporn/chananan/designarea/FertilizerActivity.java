package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FertilizerActivity extends AppCompatActivity {

    //Explicit
    private ImageView calFerImageView1, calFerImageView2, calFerImageView3, calFerImageView4;

    String userString;

    private String strDistance1,strDistance2,strDistance3,strDistance4;
    private String strHarvest1,strHarvest2,strHarvest3,strHarvest4;

    private String bigAreaString, areaString1, numberString1
            , areaString2, numberString2
            , areaString3, numberString3
            , areaString4, numberString4;

    private String subAreaString1, subAreaString2, subAreaString3, subAreaString4;

    private String ratio1_1String,ratio1_2String,ratio1_3String,ratio1_4String,ratio1_5String,ratio2_1String,ratio2_2String,ratio2_3String,ratio2_4String,ratio2_5String,
            ratio3_1String,ratio3_2String,ratio3_3String,ratio3_4String,ratio3_5String,ratio4_1String,ratio4_2String,ratio4_3String,ratio4_4String,ratio4_5String;

    private int intNumber1,intNumber2,intNumber3,intNumber4;
    private int ratio1_1,ratio1_2,ratio1_3,ratio1_4,ratio1_5,ratio2_1,ratio2_2,ratio2_3,ratio2_4,ratio2_5,
                ratio3_1,ratio3_2,ratio3_3,ratio3_4,ratio3_5,ratio4_1,ratio4_2,ratio4_3,ratio4_4,ratio4_5;

    private String strPlant,strFarm,strAnimal,strHouse,strSpinner1,strSpinner2,strSpinner3,strSpinner4;
    private TextView areaTextView1, areaTextView2, areaTextView3, areaTextView4;
    private TextView typeTextView1, typeTextView2, typeTextView3, typeTextView4;
    private TextView numberTextView1, numberTextView2, numberTextView3, numberTextView4;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fertilizer);

        initWidget();

        receiveValue();

        calFerAndFood1();
        calFerAndFood2();
        calFerAndFood3();
        calFerAndFood4();

        show1();
        show2();
        show3();
        show4();



    } // Main Method



    private void initWidget() {
        areaTextView1 = (TextView) findViewById(R.id.textView13);
        typeTextView1 = (TextView) findViewById(R.id.textView14);
        numberTextView1 = (TextView) findViewById(R.id.textView15);

        areaTextView2 = (TextView) findViewById(R.id.textView16);
        typeTextView2 = (TextView) findViewById(R.id.textView17);
        numberTextView2 = (TextView) findViewById(R.id.textView18);

        areaTextView3 = (TextView) findViewById(R.id.textView19);
        typeTextView3 = (TextView) findViewById(R.id.textView20);
        numberTextView3 = (TextView) findViewById(R.id.textView21);

        areaTextView4 = (TextView) findViewById(R.id.textView22);
        typeTextView4 = (TextView) findViewById(R.id.textView23);
        numberTextView4 = (TextView) findViewById(R.id.textView24);

    }// initWidget

    private void show1() {
        areaTextView1.setText("พื้นที่ที่ : " +areaString1);

        if (strSpinner1.equals("ทุเรียน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");

        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");


        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");



        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");

        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");


        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น");

        }//end else if

        else if (strSpinner1.equals("หมู")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ตัว");

        }//end else if
        else if (strSpinner1.equals("เพาะเห็ด")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            typeTextView1.setText("ชนิด : " + strSpinner1);
            numberTextView1.setText("จำนวน : " + intNumber1 + " ต้น/กก./หลัง");


        }//end else if


    } // show

    private void show2() {

        areaTextView2.setText("พื้นที่ที่ : " +areaString2);

        if (strSpinner2.equals("ทุเรียน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");

        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");


        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");



        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");

        }//end else if

        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");


        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น");

        }//end else if

        else if (strSpinner2.equals("หมู")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("ปลานิล")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ตัว");

        }//end else if
        else if (strSpinner2.equals("เพาะเห็ด")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            typeTextView2.setText("ชนิด : " + strSpinner2);
            numberTextView2.setText("จำนวน : " + intNumber2 + " ต้น/กก./หลัง");


        }//end else if

    } // show

    private void show3() {
        areaTextView3.setText("พื้นที่ที่ : " +areaString3);

        if (strSpinner3.equals("ทุเรียน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");

        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");


        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");



        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");

        }//end else if

        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");


        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น");

        }//end else if

        else if (strSpinner3.equals("หมู")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ตัว");

        }//end else if
        else if (strSpinner3.equals("เพาะเห็ด")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            typeTextView3.setText("ชนิด : " + strSpinner3);
            numberTextView3.setText("จำนวน : " + intNumber3 + " ต้น/กก./หลัง");


        }//end else if

    } // show

    private void show4() {
        areaTextView4.setText("พื้นที่ที่ : " + areaString4);

        if (strSpinner4.equals("ทุเรียน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");

        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");


        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");



        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");

        }//end else if

        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");


        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น");

        }//end else if

        else if (strSpinner4.equals("หมู")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ตัว");

        }//end else if

        else if (strSpinner4.equals("เพาะเห็ด")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น/กก./หลัง");

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            typeTextView4.setText("ชนิด : " + strSpinner4);
            numberTextView4.setText("จำนวน : " + intNumber4 + " ต้น/กก./หลัง");


        }//end else if

    } // show

    public void clickCalFer1(View view) {
        showCalDialog1();
    } // clickImage1

    public void clickCalFer2(View view) {
        showCalDialog2();
    } // clickImage2

    public void clickCalFer3(View view) {
        showCalDialog3();
    } // clickImage3

    public void clickCalFer4(View view) {
        showCalDialog4();
    } // clickImage4

    private void showCalDialog1() {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea");
        objBuilder.setMessage("พื้นที่ที่ :  " + areaString1 + "\n" + "ชนิด :  " + strSpinner1 + "\n" +
                "จำนวน : " + intNumber1 + "  ต้น" + "\n" + "ปุ๋ย1 : " + ratio1_1String + "  กก." + "\n" +
                "ปุ๋ย2 :  " + ratio1_2String + "  กก." + "\n" + "ปุ๋ย3 :  " + ratio1_3String + "  กก." + "\n" +
                "ปุ๋ย4 :  " + ratio1_4String + "  กก." + "\n" + "ปุ๋ย5 :  " + ratio1_5String + "  กก." + "\n");
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
        objBuilder.setMessage("พื้นที่ที่ :  " + areaString2 + "\n" + "ชนิด :  " + strSpinner2 + "\n" +
                "จำนวน : " + intNumber2 + "  ต้น" + "\n" + "ปุ๋ย1 : " + ratio2_1String + "  กก." + "\n" +
                "ปุ๋ย2 :  " + ratio2_2String + "  กก." + "\n" + "ปุ๋ย3 :  " + ratio2_3String + "  กก." + "\n" +
                "ปุ๋ย4 :  " + ratio2_4String + "  กก." + "\n" + "ปุ๋ย5 :  " + ratio2_5String + "  กก." + "\n");
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
        objBuilder.setMessage("พื้นที่ที่ :  " + areaString3 + "\n" + "ชนิด :  " + strSpinner3 + "\n" +
                "จำนวน : " + intNumber3 + "  ต้น" + "\n" + "อาหาร 1 : " + ratio3_1String + "  กก." + "\n" +
                "อาหาร 2 :  " + ratio3_2String + "  กก." + "\n" + "อาหาร 3 :  " + ratio3_3String + "  กก." + "\n" +
                "อาหาร 4 :  " + ratio3_4String + "  กก." + "\n" + "อาหาร 5 :  " + ratio3_5String + "  กก." + "\n");
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
        objBuilder.setMessage("พื้นที่ที่ :  " + areaString4 + "\n" + "ชนิด :  " + strSpinner4 + "\n" +
                "จำนวน : " + intNumber4 + "  ต้น" + "\n" + "ปุ๋ย1 : " + ratio4_1String + "  กก." + "\n" +
                "ปุ๋ย2 :  " + ratio4_2String + "  กก." + "\n" + "ปุ๋ย3 :  " + ratio4_3String + "  กก." + "\n" +
                "ปุ๋ย4 :  " + ratio4_4String + "  กก." + "\n" + "ปุ๋ย5 :  " + ratio4_5String + "  กก." + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();

    }//showCalDialog



    private void calFerAndFood1() {

        //ส่งค่าจำนวน
        if (strSpinner1.equals("ทุเรียน")) {
            ratio1_1 = (5 * intNumber1) / 1;
            ratio1_2 = (8 * intNumber1) / 1;
            ratio1_3 = (12 * intNumber1) / 1;
            ratio1_4 = (3 * intNumber1) / 1;
            ratio1_5 = (2 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end if
        else if (strSpinner1.equals("มังคุด")) {
            ratio1_1 = (4 * intNumber1) / 1;
            ratio1_2 = (7 * intNumber1) / 1;
            ratio1_3 = (9 * intNumber1) / 1;
            ratio1_4 = (21 * intNumber1) / 1;
            ratio1_5 = (6 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);


        }//end else if
        else if (strSpinner1.equals("ข้าวโพด")) {
            ratio1_1 = (10 * intNumber1) / 1;
            ratio1_2 = (5 * intNumber1) / 1;
            ratio1_3 = (9 * intNumber1) / 1;
            ratio1_4 = (15 * intNumber1) / 1;
            ratio1_5 = (7 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);


        }//end else if
        else if (strSpinner1.equals("ยางพารา")) {
            ratio1_1 = (11 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (2 * intNumber1) / 1;
            ratio1_4 = (13 * intNumber1) / 1;
            ratio1_5 = (5 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);


        }//end else if

        else if (strSpinner1.equals("ข้าวหอมมะลิ")) {
            ratio1_1 = (20 * intNumber1) / 1;
            ratio1_2 = (30 * intNumber1) / 1;
            ratio1_3 = (5 * intNumber1) / 1;
            ratio1_4 = (9 * intNumber1) / 1;
            ratio1_5 = (15 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end if
        else if (strSpinner1.equals("ข้าวกล้อง")) {
            ratio1_1 = (10 * intNumber1) / 1;
            ratio1_2 = (35 * intNumber1) / 1;
            ratio1_3 = (7 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (12 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if

        else if (strSpinner1.equals("หมู")) {
            ratio1_1 = (10 * intNumber1) / 1;
            ratio1_2 = (35 * intNumber1) / 1;
            ratio1_3 = (7 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (12 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if
        else if (strSpinner1.equals("ไก่")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);


        }//end else if
        else if (strSpinner1.equals("เป็ด")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);
        }//end else if
        else if (strSpinner1.equals("ปลาดุก")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if
        else if (strSpinner1.equals("ปลาสลิด")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if

        else if (strSpinner1.equals("เพาะเห็ด")) {
            ratio1_1 = (10 * intNumber1) / 1;
            ratio1_2 = (35 * intNumber1) / 1;
            ratio1_3 = (7 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (12 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if
        else if (strSpinner1.equals("ปุ๋ยหมัก")) {
            ratio1_1 = (10 * intNumber1) / 1;
            ratio1_2 = (35 * intNumber1) / 1;
            ratio1_3 = (7 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (12 * intNumber1) / 1;
            ratio1_1String = String.valueOf(ratio1_1);
            ratio1_2String = String.valueOf(ratio1_2);
            ratio1_3String = String.valueOf(ratio1_3);
            ratio1_4String = String.valueOf(ratio1_4);
            ratio1_5String = String.valueOf(ratio1_5);

        }//end else if
        else if (strSpinner1.equals("บ้าน")) {
            ratio1_1String = "-";
            ratio1_2String = "-";
            ratio1_3String = "-";
            ratio1_4String = "-";
            ratio1_5String = "-";


        }//end else if

    } // calFerAndFood1

    private void calFerAndFood2() {
        if (strSpinner2.equals("ทุเรียน")) {
            ratio2_1 = (5 * intNumber2) / 1;
            ratio2_2 = (8 * intNumber2) / 1;
            ratio2_3 = (12 * intNumber2) / 1;
            ratio2_4 = (3 * intNumber2) / 1;
            ratio2_5 = (2 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end if
        else if (strSpinner2.equals("มังคุด")) {
            ratio2_1 = (4 * intNumber2) / 1;
            ratio2_2 = (7 * intNumber2) / 1;
            ratio2_3 = (9 * intNumber2) / 1;
            ratio2_4 = (21 * intNumber2) / 1;
            ratio2_5 = (6 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);


        }//end else if
        else if (strSpinner2.equals("ข้าวโพด")) {
            ratio2_1 = (10 * intNumber2) / 1;
            ratio2_2 = (5 * intNumber2) / 1;
            ratio2_3 = (9 * intNumber2) / 1;
            ratio2_4 = (15 * intNumber2) / 1;
            ratio2_5 = (7 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);


        }//end else if
        else if (strSpinner2.equals("ยางพารา")) {
            ratio2_1 = (11 * intNumber2) / 1;
            ratio2_2 = (10 * intNumber2) / 1;
            ratio2_3 = (2 * intNumber2) / 1;
            ratio2_4 = (13 * intNumber2) / 1;
            ratio2_5 = (5 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);


        }//end else if
        else if (strSpinner2.equals("ข้าวหอมมะลิ")) {
            ratio2_1 = (20 * intNumber2) / 1;
            ratio2_2 = (30 * intNumber2) / 1;
            ratio2_3 = (5 * intNumber2) / 1;
            ratio2_4 = (9 * intNumber2) / 1;
            ratio2_5 = (15 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);


        }//end if
        else if (strSpinner2.equals("ข้าวกล้อง")) {
            ratio2_1 = (10 * intNumber2) / 1;
            ratio2_2 = (35 * intNumber2) / 1;
            ratio2_3 = (7 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (12 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("หมู")) {
            ratio2_1 = (10 * intNumber2) / 1;
            ratio2_2 = (35 * intNumber2) / 1;
            ratio2_3 = (7 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (12 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("ไก่")) {
            ratio2_1 = (6 * intNumber2) / 1;
            ratio2_2 = (10 * intNumber2) / 1;
            ratio2_3 = (3 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (8 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);


        }//end else if
        else if (strSpinner2.equals("เป็ด")) {
            ratio2_1 = (6 * intNumber2) / 1;
            ratio2_2 = (10 * intNumber2) / 1;
            ratio2_3 = (3 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (8 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner1.equals("ปลานิล")) {
            ratio1_1 = (6 * intNumber1) / 1;
            ratio1_2 = (10 * intNumber1) / 1;
            ratio1_3 = (3 * intNumber1) / 1;
            ratio1_4 = (6 * intNumber1) / 1;
            ratio1_5 = (8 * intNumber1) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);
        }//end else if
        else if (strSpinner2.equals("ปลาดุก")) {
            ratio2_1 = (6 * intNumber2) / 1;
            ratio2_2 = (10 * intNumber2) / 1;
            ratio2_3 = (3 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (8 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("ปลาสลิด")) {
            ratio2_1 = (6 * intNumber2) / 1;
            ratio2_2 = (10 * intNumber2) / 1;
            ratio2_3 = (3 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (8 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("เพาะเห็ด")) {
            ratio2_1 = (10 * intNumber2) / 1;
            ratio2_2 = (35 * intNumber2) / 1;
            ratio2_3 = (7 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (12 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("ปุ๋ยหมัก")) {
            ratio2_1 = (10 * intNumber2) / 1;
            ratio2_2 = (35 * intNumber2) / 1;
            ratio2_3 = (7 * intNumber2) / 1;
            ratio2_4 = (6 * intNumber2) / 1;
            ratio2_5 = (12 * intNumber2) / 1;
            ratio2_1String = String.valueOf(ratio2_1);
            ratio2_2String = String.valueOf(ratio2_2);
            ratio2_3String = String.valueOf(ratio2_3);
            ratio2_4String = String.valueOf(ratio2_4);
            ratio2_5String = String.valueOf(ratio2_5);

        }//end else if
        else if (strSpinner2.equals("บ้าน")) {
            ratio2_1String = "-";
            ratio2_2String = "-";
            ratio2_3String = "-";
            ratio2_4String = "-";
            ratio2_5String = "-";


        }//end else if

    } // calFerAndFood2

    private void calFerAndFood3() {
        if (strSpinner3.equals("ทุเรียน")) {
            ratio3_1 = (5 * intNumber3) / 1;
            ratio3_2 = (8 * intNumber3) / 1;
            ratio3_3 = (12 * intNumber3) / 1;
            ratio3_4 = (3 * intNumber3) / 1;
            ratio3_5 = (2 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end if
        else if (strSpinner3.equals("มังคุด")) {
            ratio3_1 = (4 * intNumber3) / 1;
            ratio3_2 = (7 * intNumber3) / 1;
            ratio3_3 = (9 * intNumber3) / 1;
            ratio3_4 = (21 * intNumber3) / 1;
            ratio3_5 = (6 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);


        }//end else if
        else if (strSpinner3.equals("ข้าวโพด")) {
            ratio3_1 = (10 * intNumber3) / 1;
            ratio3_2 = (5 * intNumber3) / 1;
            ratio3_3 = (9 * intNumber3) / 1;
            ratio3_4 = (15 * intNumber3) / 1;
            ratio3_5 = (7 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);


        }//end else if
        else if (strSpinner3.equals("ยางพารา")) {
            ratio3_1 = (11 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (2 * intNumber3) / 1;
            ratio3_4 = (13 * intNumber3) / 1;
            ratio3_5 = (5 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);


        }//end else if
        else if (strSpinner3.equals("ข้าวหอมมะลิ")) {
            ratio3_1 = (20 * intNumber3) / 1;
            ratio3_2 = (30 * intNumber3) / 1;
            ratio3_3 = (5 * intNumber3) / 1;
            ratio3_4 = (9 * intNumber3) / 1;
            ratio3_5 = (15 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);


        }//end if
        else if (strSpinner3.equals("ข้าวกล้อง")) {
            ratio3_1 = (10 * intNumber3) / 1;
            ratio3_2 = (35 * intNumber3) / 1;
            ratio3_3 = (7 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (12 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("หมู")) {
            ratio3_1 = (10 * intNumber3) / 1;
            ratio3_2 = (35 * intNumber3) / 1;
            ratio3_3 = (7 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (12 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("ไก่")) {
            ratio3_1 = (6 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (3 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (8 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("เป็ด")) {
            ratio3_1 = (6 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (3 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (8 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("ปลานิล")) {
            ratio3_1 = (6 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (3 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (8 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("ปลาดุก")) {
            ratio3_1 = (6 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (3 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (8 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("ปลาสลิด")) {
            ratio3_1 = (6 * intNumber3) / 1;
            ratio3_2 = (10 * intNumber3) / 1;
            ratio3_3 = (3 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (8 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if

        else if (strSpinner3.equals("เพาะเห็ด")) {
            ratio3_1 = (10 * intNumber3) / 1;
            ratio3_2 = (35 * intNumber3) / 1;
            ratio3_3 = (7 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (12 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("ปุ๋ยหมัก")) {
            ratio3_1 = (10 * intNumber3) / 1;
            ratio3_2 = (35 * intNumber3) / 1;
            ratio3_3 = (7 * intNumber3) / 1;
            ratio3_4 = (6 * intNumber3) / 1;
            ratio3_5 = (12 * intNumber3) / 1;
            ratio3_1String = String.valueOf(ratio3_1);
            ratio3_2String = String.valueOf(ratio3_2);
            ratio3_3String = String.valueOf(ratio3_3);
            ratio3_4String = String.valueOf(ratio3_4);
            ratio3_5String = String.valueOf(ratio3_5);

        }//end else if
        else if (strSpinner3.equals("บ้าน")) {
            ratio3_1String = "-";
            ratio3_2String = "-";
            ratio3_3String = "-";
            ratio3_4String = "-";
            ratio3_5String = "-";


        }//end else if

    }// calFerAndFood3

    private void calFerAndFood4() {
        if (strSpinner4.equals("ทุเรียน")) {
            ratio4_1 = (5 * intNumber4) / 1;
            ratio4_2 = (8 * intNumber4) / 1;
            ratio4_3 = (12 * intNumber4) / 1;
            ratio4_4 = (3 * intNumber4) / 1;
            ratio4_5 = (2 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end if
        else if (strSpinner4.equals("มังคุด")) {
            ratio4_1 = (4 * intNumber4) / 1;
            ratio4_2 = (7 * intNumber4) / 1;
            ratio4_3 = (9 * intNumber4) / 1;
            ratio4_4 = (21 * intNumber4) / 1;
            ratio4_5 = (6 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);


        }//end else if
        else if (strSpinner4.equals("ข้าวโพด")) {
            ratio4_1 = (10 * intNumber4) / 1;
            ratio4_2 = (5 * intNumber4) / 1;
            ratio4_3 = (9 * intNumber4) / 1;
            ratio4_4 = (15 * intNumber4) / 1;
            ratio4_5 = (7 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);


        }//end else if
        else if (strSpinner4.equals("ยางพารา")) {
            ratio4_1 = (11 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (2 * intNumber4) / 1;
            ratio4_4 = (13 * intNumber4) / 1;
            ratio4_5 = (5 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);


        }//end else if
        else if (strSpinner4.equals("ข้าวหอมมะลิ")) {
            ratio4_1 = (20 * intNumber4) / 1;
            ratio4_2 = (30 * intNumber4) / 1;
            ratio4_3 = (5 * intNumber4) / 1;
            ratio4_4 = (9 * intNumber4) / 1;
            ratio4_5 = (15 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);


        }//end if
        else if (strSpinner4.equals("ข้าวกล้อง")) {
            ratio4_1 = (10 * intNumber4) / 1;
            ratio4_2 = (35 * intNumber4) / 1;
            ratio4_3 = (7 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (12 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("หมู")) {
            ratio4_1 = (10 * intNumber4) / 1;
            ratio4_2 = (35 * intNumber4) / 1;
            ratio4_3 = (7 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (12 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("ไก่")) {
            ratio4_1 = (6 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (3 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (8 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("เป็ด")) {
            ratio4_1 = (6 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (3 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (8 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("ปลานิล")) {
            ratio4_1 = (6 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (3 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (8 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("ปลาดุก")) {
            ratio4_1 = (6 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (3 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (8 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("ปลาสลิด")) {
            ratio4_1 = (6 * intNumber4) / 1;
            ratio4_2 = (10 * intNumber4) / 1;
            ratio4_3 = (3 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (8 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
       else if (strSpinner4.equals("เพาะเห็ด")) {
            ratio4_1 = (10 * intNumber4) / 1;
            ratio4_2 = (35 * intNumber4) / 1;
            ratio4_3 = (7 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (12 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("ปุ๋ยหมัก")) {
            ratio4_1 = (10 * intNumber4) / 1;
            ratio4_2 = (35 * intNumber4) / 1;
            ratio4_3 = (7 * intNumber4) / 1;
            ratio4_4 = (6 * intNumber4) / 1;
            ratio4_5 = (12 * intNumber4) / 1;
            ratio4_1String = String.valueOf(ratio4_1);
            ratio4_2String = String.valueOf(ratio4_2);
            ratio4_3String = String.valueOf(ratio4_3);
            ratio4_4String = String.valueOf(ratio4_4);
            ratio4_5String = String.valueOf(ratio4_5);

        }//end else if
        else if (strSpinner4.equals("บ้าน")) {
            ratio4_1String = "-";
            ratio4_2String = "-";
            ratio4_3String = "-";
            ratio4_4String = "-";
            ratio4_5String = "-";


        }//end else if

    } // calFerAndFood4

    private void receiveValue() {
        userString = getIntent().getStringExtra("User"); //รับค่า
        bigAreaString = getIntent().getStringExtra("BigArea"); //รับค่า

        areaString1 = getIntent().getStringExtra("Area1");
        areaString2 = getIntent().getStringExtra("Area2");
        areaString3 = getIntent().getStringExtra("Area3");
        areaString4 = getIntent().getStringExtra("Area4");

        subAreaString1 = getIntent().getStringExtra("SubArea1");
        subAreaString2 = getIntent().getStringExtra("SubArea2");
        subAreaString3 = getIntent().getStringExtra("SubArea3");
        subAreaString4 = getIntent().getStringExtra("SubArea4");


        strSpinner1 = getIntent().getStringExtra("Type1");
        strSpinner2 = getIntent().getStringExtra("Type2");
        strSpinner3 = getIntent().getStringExtra("Type3");
        strSpinner4 = getIntent().getStringExtra("Type4");

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


        //แปลงค่า
        numberString1 = String.valueOf(intNumber1);
        numberString2 = String.valueOf(intNumber2);
        numberString3 = String.valueOf(intNumber3);
        numberString4 = String.valueOf(intNumber4);
    } // receiveValue

    public void clickSaveFertilizer(View view) {


      /*  StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);

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

            Toast.makeText(FertilizerActivity.this,
                    "FerAndFood Success", Toast.LENGTH_SHORT).show();
            Intent objIntent = new Intent(FertilizerActivity.this, CostActivity.class);
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
            Toast.makeText(FertilizerActivity.this,
                    "Cannot FerAndFood", Toast.LENGTH_SHORT).show();
        }*/
        sentAnswer();


    } //clickSaveFertilizer

    private void sentAnswer() {
        Intent objIntent = new Intent(FertilizerActivity.this, CostActivity.class);
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
        startActivity(objIntent);
        finish();
    }//sentAnswerFerAndFood


} // Main Class
