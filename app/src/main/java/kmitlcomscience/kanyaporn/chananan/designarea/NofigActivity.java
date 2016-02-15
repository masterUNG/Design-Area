package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class NofigActivity extends AppCompatActivity {
    private TextView txtArea1, txtArea2, txtArea3, txtArea4,
                     txtCate1, txtCate2, txtCate3, txtCate4;

    private EditText inPut1, inPut2, inPut3, inPut4;
    private int inPutInt1, inPutInt2, inPutInt3, inPutInt4;

    private ListView objListView1, objListView2, objListView3, objListView4;
    private RadioGroup radioSearchCate;
    private TextView txtType1, txtType2, txtType3, txtType4;
    private String typeString,typeString1="1", typeString2="2", typeString3="3", typeString4="4", typeString5,
                   typeString6, typeString7, typeString8, typeString9, typeString10, typeString11,
                   typeString12, typeString13, typeString14, typeString15;
    private Button btnOK;
    private String type1, type2, type3, type4;

    private String strPlant,strFarm,strAnimal, strHouse,strListView1,strListView2,strListView3,strListView4;

    private int selectedPosition;
    private Float bigAreaAFloat;
    String userString;

    final String[] str = { "พืชสวน / พืชไร่", "ทำนา", "เลี้ยงสัตว์", "ที่พักอาศัย" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nofig);

        initWidget();
        addListView1();
        addListView2();
        addListView3();
        addListView4();


        receiveValue();


    } // Main Method

    private void receiveValue() {
        bigAreaAFloat = getIntent().getExtras().getFloat("BigArea");
        userString = getIntent().getStringExtra("User");

    }//receiveValue

    public void clickNextNoFig(View view) {

        checkDataDesign();

        calInputPer();


    }//clickNoFig




    private void addListView1() {

        objListView1.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));
        objListView1.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {


                // Intent intent;
                switch (arg2) {
                    case 0:
                        //typeString1 = String.valueOf("1");
                        showCalDialog1();
                        strListView1 = String.valueOf("พืชสวน / พืชไร่");

                        break;
                    case 1:
                        //typeString1 = String.valueOf("1");
                        showCalDialog2();
                        strListView2 = String.valueOf("ทำนา");
                        break;
                    case 2:
                        // typeString1 = String.valueOf("1");
                        showCalDialog3();
                        strListView3 = String.valueOf("เลี้ยงสัตว์");
                        break;
                    case 3:
                        //typeString1 = String.valueOf("1");
                        showCalDialog4();
                        strListView4 = String.valueOf("ที่พักอาศัย");
                        break;

                }
            }
        });

    }//addListView

    private void addListView2() {

        objListView2.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));
        objListView2.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {


                // Intent intent;
                switch(arg2) {
                    case 0 :
                        //typeString2 = String.valueOf("2");
                        showCalDialog5();
                        strListView1 = String.valueOf("พืชสวน / พืชไร่");
                        break;
                    case 1 :
                        //typeString2 = String.valueOf("2");
                        showCalDialog6();
                        strListView2 = String.valueOf("ทำนา");
                        break;
                    case 2 :
                        //typeString2 = String.valueOf("2");
                        showCalDialog7();
                        strListView3 = String.valueOf("เลี้ยงสัตว์");
                        break;
                    case 3 :
                        typeString2 = String.valueOf("2");
                        showCalDialog8();
                        strListView1 = String.valueOf("ที่พักอาศัย");
                        break;

                }
            }
        });

    }//addListView

    private void addListView3() {

        objListView3.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));
        objListView3.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {


                // Intent intent;
                switch(arg2) {
                    case 0 :
                        //typeString3 = String.valueOf("3");
                        showCalDialog9();
                        strListView1 = String.valueOf("พืชสวน / พืชไร่");
                        break;
                    case 1 :
                        //typeString3 = String.valueOf("3");
                        showCalDialog10();
                        strListView2 = String.valueOf("ทำนา");
                        break;
                    case 2 :
                        //typeString3 = String.valueOf("3");
                        showCalDialog11();
                        strListView3 = String.valueOf("เลี้ยงสัตว์");
                        break;
                    case 3 :
                        //typeString3 = String.valueOf("3");
                        showCalDialog12();
                        strListView4 = String.valueOf("ที่พักอาศัย");
                        break;

                }
            }
        });

    }//addListView

    private void addListView4() {

        objListView4.setAdapter(new ArrayAdapter(this
                , android.R.layout.simple_list_item_1, str));
        objListView4.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0, View arg1
                    , int arg2, long arg3) {


                // Intent intent;
                switch(arg2) {
                    case 0 :
                        //typeString4 = String.valueOf("4");
                        showCalDialog13();
                        strListView1 = String.valueOf("พืชสวน / พืชไร่");
                        break;
                    case 1 :
                        //typeString4 = String.valueOf("4");
                        showCalDialog14();
                        strListView2 = String.valueOf("ทำนา");
                        break;
                    case 2 :
                        //typeString4 = String.valueOf("4");
                        showCalDialog15();
                        strListView3 = String.valueOf("เลี้ยงสัตว์");
                        break;
                    case 3 :
                        //typeString4 = String.valueOf("4");
                        showCalDialog16();
                        strListView4 = String.valueOf("ที่พักอาศัย");
                        break;

                }
            }
        });

    }//addListView

    private void calInputPer() {


        try {
            //แปลงค่าจาก Editext เป็น int
            inPutInt1 = Integer.parseInt(inPut1.getText().toString().trim());
            inPutInt2 = Integer.parseInt(inPut2.getText().toString().trim());
            inPutInt3 = Integer.parseInt(inPut3.getText().toString().trim());
            inPutInt4 = Integer.parseInt(inPut4.getText().toString().trim());

            if (inPutInt1 + inPutInt2 + inPutInt3 + inPutInt4 == 100) {
                Toast.makeText(NofigActivity.this, "ข้อมูลอัตราส่วนถูกต้อง"
                        , Toast.LENGTH_SHORT).show();

                Intent go = new Intent(NofigActivity.this, MapNoFigActivity.class);


                go.putExtra("BigArea", bigAreaAFloat);
                go.putExtra("User", userString);

                go.putExtra("Cate1", strListView1);
                go.putExtra("Cate2", strListView2);
                go.putExtra("Cate3", strListView3);
                go.putExtra("Cate4", strListView4);


                go.putExtra("Type1", type1);
                go.putExtra("Type2", type2);
                go.putExtra("Type3", type3);
                go.putExtra("Type4", type4);

                go.putExtra("InputPer1", inPutInt1);
                go.putExtra("InputPer2", inPutInt2);
                go.putExtra("InputPer3", inPutInt3);
                go.putExtra("InputPer4", inPutInt4);

                startActivity(go);
                finish();
            } // if
            else if (inPutInt1 + inPutInt2 + inPutInt3 + inPutInt4 < 100) {
                MyAlertDialog objMyAlertDialog = new MyAlertDialog();
                objMyAlertDialog.myDialog(NofigActivity.this, "ข้อมูลอัตราส่วนไม่ถูกต้อง ", "ไม่ครบ 100 % กรุณากรอกใหม่");
            }
            else if (inPutInt1 + inPutInt2 + inPutInt3 + inPutInt4 > 100) {
                MyAlertDialog objMyAlertDialog = new MyAlertDialog();
                objMyAlertDialog.myDialog(NofigActivity.this, "ข้อมูลอัตราส่วนไม่ถูกต้อง ", "เกิน 100 % กรุณากรอกใหม่");
            }
        }// try
        catch (Exception e) {
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(NofigActivity.this, "ข้อมูลอัตราส่วนไม่ถูกต้อง ", "กรุณากรอกใหม่");

        }

    }// calInputPer

    private void checkDataDesign() {
        try {

            if (!type1.equals("") || !type2.equals("") || !type3.equals("") || !type4.equals("")) {
                Toast.makeText(NofigActivity.this, "ข้อมูลถูกต้อง"
                        , Toast.LENGTH_SHORT).show();

            } // if

            else  {
                MyAlertDialog objMyAlertDialog = new MyAlertDialog();
                objMyAlertDialog.myDialog(NofigActivity.this, "ข้อมูลไม่ถูกต้อง ", "กรุณากรอกใหม่");
            }
        }// try
        catch (Exception e) {
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(NofigActivity.this, "ข้อมูลไม่ถูกต้อง ", "กรุณากรอกใหม่");

        }


    }// checkDataDesign

    private void initWidget() {

        objListView1 = (ListView) findViewById(R.id.listView2);
        objListView2 = (ListView) findViewById(R.id.listView4);
        objListView3 = (ListView) findViewById(R.id.listView3);
        objListView4 = (ListView) findViewById(R.id.listView5);

        btnOK = (Button) findViewById(R.id.button9);

        inPut1 = (EditText) findViewById(R.id.editText4);
        inPut2 = (EditText) findViewById(R.id.editText6);
        inPut3 = (EditText) findViewById(R.id.editText5);
        inPut4 = (EditText) findViewById(R.id.editText7);


    } // initWidget

    public void showCalDialog1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("พืชสวน / พืชไร่ ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Plant, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ทุเรียน");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("มังคุด");

                        }// else if

                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ข้าวโพด");


                        }// else if

                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ยางพารา");


                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2







    public void showCalDialog2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Farm, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ข้าวหอมมะลิ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ข้าวกล้อง");

                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2

    public void showCalDialog3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("เลี้ยงสัตว์ ==> ชนิด : ")

                                .setSingleChoiceItems(R.array.Animal, 0, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {

                                        if (arg1 == 0) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "หมู"
                                                    , Toast.LENGTH_SHORT).show();
                                        } //if
                                        else if (arg1 == 1) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                                    , Toast.LENGTH_SHORT).show();
                                        }// else if
                                        else if (arg1 == 2) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                                    , Toast.LENGTH_SHORT).show();
                                        }// else if
                                        else if (arg1 == 3) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                                    , Toast.LENGTH_SHORT).show();
                                        }// else if
                                        else if (arg1 == 4) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาดุก"
                                                    , Toast.LENGTH_SHORT).show();
                                        }// else if
                                        else if (arg1 == 5) {
                                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาสลิด"
                                                    , Toast.LENGTH_SHORT).show();
                                        }// else if

                                    }

                                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("หมู");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();

                            type1 = String.valueOf("ไก่");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();


                             type1 = String.valueOf("เป็ด");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();

                            type1 = String.valueOf("ปลานิล");

                        }// else if
                        else if (selectedPosition == 4) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();

                            type1 = String.valueOf("ปลาดุก");


                        }// else if
                        else if (selectedPosition == 5) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();


                            type1 = String.valueOf("ปลาสลิด");


                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog3

    public void showCalDialog4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ที่พักอาศัย ==> ชนิด : ")

                // specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive call backs when items are selected
                // again, R.array.choices were set in the resources res/values/strings.xml
                .setSingleChoiceItems(R.array.House, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if


                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();

                               type1 = String.valueOf("เพาะเห็ด");


                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();


                              type1 = String.valueOf("ปุ๋ยหมัก");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();

                            type1 = String.valueOf("บ้าน");

                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog4

    public void showCalDialog5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Plant, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ทุเรียน");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("มังคุด");

                        }// else if

                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ข้าวโพด");


                        }// else if

                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ยางพารา");


                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2







    public void showCalDialog6() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Farm, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ข้าวหอมมะลิ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ข้าวกล้อง");

                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2

    public void showCalDialog7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("เลี้ยงสัตว์ ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Animal, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 4) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 5) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if

                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("หมู");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();

                            type2 = String.valueOf("ไก่");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("เป็ด");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();

                            type2 = String.valueOf("ปลานิล");

                        }// else if
                        else if (selectedPosition == 4) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();

                            type2 = String.valueOf("ปลาดุก");


                        }// else if
                        else if (selectedPosition == 5) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ปลาสลิด");


                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog3

    public void showCalDialog8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ที่พักอาศัย ==> ชนิด : ")

                // specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive call backs when items are selected
                // again, R.array.choices were set in the resources res/values/strings.xml
                .setSingleChoiceItems(R.array.House, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if


                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();

                            type2 = String.valueOf("เพาะเห็ด");


                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();


                            type2 = String.valueOf("ปุ๋ยหมัก");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();

                            type2 = String.valueOf("บ้าน");

                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog8

    public void showCalDialog9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Plant, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ทุเรียน");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("มังคุด");

                        }// else if

                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ข้าวโพด");


                        }// else if

                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ยางพารา");


                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2







    public void showCalDialog10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Farm, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ข้าวหอมมะลิ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ข้าวกล้อง");

                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2

    public void showCalDialog11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("เลี้ยงสัตว์ ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Animal, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 4) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 5) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if

                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("หมู");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();

                            type3 = String.valueOf("ไก่");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("เป็ด");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();

                            type3 = String.valueOf("ปลานิล");

                        }// else if
                        else if (selectedPosition == 4) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();

                            type3 = String.valueOf("ปลาดุก");


                        }// else if
                        else if (selectedPosition == 5) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ปลาสลิด");


                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog3

    public void showCalDialog12() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ที่พักอาศัย ==> ชนิด : ")

                // specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive call backs when items are selected
                // again, R.array.choices were set in the resources res/values/strings.xml
                .setSingleChoiceItems(R.array.House, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if


                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();

                            type3 = String.valueOf("เพาะเห็ด");


                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();


                            type3 = String.valueOf("ปุ๋ยหมัก");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();

                            type3 = String.valueOf("บ้าน");

                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog12

    public void showCalDialog13() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Plant, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ทุเรียน"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ทุเรียน");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "มังคุด"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("มังคุด");

                        }// else if

                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวโพด"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ข้าวโพด");


                        }// else if

                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ยางพารา"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ยางพารา");


                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2







    public void showCalDialog14() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ทำนา ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Farm, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวหอมมะลิ"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ข้าวหอมมะลิ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ข้าวกล้อง"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ข้าวกล้อง");

                        }// else if
                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog2

    public void showCalDialog15() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("เลี้ยงสัตว์ ==> ชนิด : ")

                .setSingleChoiceItems(R.array.Animal, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 3) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 4) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 5) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if

                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("หมู");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();

                            type4 = String.valueOf("ไก่");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("เป็ด");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();

                            type4 = String.valueOf("ปลานิล");

                        }// else if
                        else if (selectedPosition == 4) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาดุก"
                                    , Toast.LENGTH_SHORT).show();

                            type4 = String.valueOf("ปลาดุก");


                        }// else if
                        else if (selectedPosition == 5) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปลาสลิด"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ปลาสลิด");


                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog3

    public void showCalDialog16() {
        AlertDialog.Builder builder = new AlertDialog.Builder(NofigActivity.this);

        // Set the dialog title
        builder.setTitle("ที่พักอาศัย ==> ชนิด : ")

                // specify the list array, the items to be selected by default (null for none),
                // and the listener through which to receive call backs when items are selected
                // again, R.array.choices were set in the resources res/values/strings.xml
                .setSingleChoiceItems(R.array.House, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();
                        } //if
                        else if (arg1 == 1) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if
                        else if (arg1 == 2) {
                            Toast.makeText(NofigActivity.this, "Selected index: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();
                        }// else if


                    }

                })

                        // Set the action buttons
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // user clicked OK, so save the mSelectedItems results somewhere
                        // or return them to the component that opened the dialog

                        selectedPosition = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                        // showToast("selectedPosition: " + selectedPosition);
                        if (selectedPosition == 0) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "เพาะเห็ด"
                                    , Toast.LENGTH_SHORT).show();

                            type4 = String.valueOf("เพาะเห็ด");


                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "ปุ๋ยหมัก"
                                    , Toast.LENGTH_SHORT).show();


                            type4 = String.valueOf("ปุ๋ยหมัก");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(NofigActivity.this, "selectedPosition: " + "บ้าน"
                                    , Toast.LENGTH_SHORT).show();

                            type4 = String.valueOf("บ้าน");

                        }// else if

                    }
                })

                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        // removes the dialog from the screen

                    }
                })

                .show();

    }//showCalDialog4



} // Main Class
