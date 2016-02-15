package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class RecommendActivity extends AppCompatActivity {
    //Explicit
   private ImageView natureArea, weather, cost, profit;


    private int selectedPosition;
    private PlantTABLE objPlantTABLE;
    private String natureAreaString, weatherString, costString, profitString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend);

        //Bind Widget
        bindWidget();

        natureArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialogNatureArea();

            }
        });// natureArea

        weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialogWeather();

            }
        });//weather

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialogCost();

            }
        });//cost

        profit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showDialogProfit();

            }
        });//profit
    }//Main Method

    public void clickRecommendOK(View view) {

        //searchPlantData();
        Intent objIntent = new Intent(RecommendActivity.this,ListViewPlantActivity.class);
        objIntent.putExtra("NatureArea", natureAreaString);
        objIntent.putExtra("Weather", weatherString);
        objIntent.putExtra("Cost", costString);
        objIntent.putExtra("Profit", profitString);
        startActivity(objIntent);
        finish();

    }// clickRecommendOK





    private void showDialogNatureArea() {
        AlertDialog.Builder builder = new AlertDialog.Builder(RecommendActivity.this);

        // Set the dialog title
        builder.setTitle("NatureArea : ")

                .setSingleChoiceItems(R.array.NatureArea, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            /*Toast.makeText(RecommendActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();*/
                        } //if
                        else if (arg1 == 1) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 2) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 3) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();*/
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

                        if (selectedPosition == 0) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "พื้นที่ราบสูง"
                                    , Toast.LENGTH_SHORT).show();


                            natureAreaString = String.valueOf("พื้นที่ราบสูง");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "พื้นที่ราบ"
                                    , Toast.LENGTH_SHORT).show();

                            natureAreaString = String.valueOf("พื้นที่ราบ");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "พื้นที่ราบลุ่ม"
                                    , Toast.LENGTH_SHORT).show();


                            natureAreaString = String.valueOf("พื้นที่ราบลุ่ม");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "พื้นที่ดอน"
                                    , Toast.LENGTH_SHORT).show();

                            natureAreaString = String.valueOf("พื้นที่ดอน");

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
    }

    private void showDialogWeather() {
        AlertDialog.Builder builder = new AlertDialog.Builder(RecommendActivity.this);

        // Set the dialog title
        builder.setTitle("Weather : ")

                .setSingleChoiceItems(R.array.Weather, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            /*Toast.makeText(RecommendActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();*/
                        } //if
                        else if (arg1 == 1) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 2) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 3) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ปลานิล"
                                    , Toast.LENGTH_SHORT).show();*/
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

                        if (selectedPosition == 0) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "อากาศหนาว"
                                    , Toast.LENGTH_SHORT).show();


                            weatherString = String.valueOf("อากาศหนาว");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "เขตร้อน"
                                    , Toast.LENGTH_SHORT).show();

                            weatherString = String.valueOf("เขตร้อน");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "ทนต่อสภาพอากาศแปรปรวน"
                                    , Toast.LENGTH_SHORT).show();


                            weatherString = String.valueOf("ทนต่อสภาพอากาศแปรปรวน");


                        }// else if
                        else if (selectedPosition == 3) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "อากาศร้อนชื้น"
                                    , Toast.LENGTH_SHORT).show();

                            weatherString = String.valueOf("อากาศร้อนชื้น");

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

    }

    private void showDialogCost() {
        AlertDialog.Builder builder = new AlertDialog.Builder(RecommendActivity.this);

        // Set the dialog title
        builder.setTitle("Cost : ")

                .setSingleChoiceItems(R.array.Cost, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            /*Toast.makeText(RecommendActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();*/
                        } //if
                        else if (arg1 == 1) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 2) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();*/
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

                        if (selectedPosition == 0) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "ต่ำ"
                                    , Toast.LENGTH_SHORT).show();


                            costString = String.valueOf("ต่ำ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "ปานกลาง"
                                    , Toast.LENGTH_SHORT).show();

                            costString = String.valueOf("ปานกลาง");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "สูง"
                                    , Toast.LENGTH_SHORT).show();


                            costString = String.valueOf("สูง");


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

    }

    private void showDialogProfit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(RecommendActivity.this);

        // Set the dialog title
        builder.setTitle("Profit : ")

                .setSingleChoiceItems(R.array.Profit, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                        if (arg1 == 0) {
                            /*Toast.makeText(RecommendActivity.this, "Selected index: " + "หมู"
                                    , Toast.LENGTH_SHORT).show();*/
                        } //if
                        else if (arg1 == 1) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "ไก่"
                                    , Toast.LENGTH_SHORT).show();*/
                        }// else if
                        else if (arg1 == 2) {
                           /* Toast.makeText(NofigActivity.this, "Selected index: " + "เป็ด"
                                    , Toast.LENGTH_SHORT).show();*/
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

                        if (selectedPosition == 0) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "ต่ำ"
                                    , Toast.LENGTH_SHORT).show();


                            profitString = String.valueOf("ต่ำ");

                        } //if
                        else if (selectedPosition == 1) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "ปานกลาง"
                                    , Toast.LENGTH_SHORT).show();

                            profitString = String.valueOf("ปานกลาง");

                        }// else if
                        else if (selectedPosition == 2) {
                            Toast.makeText(RecommendActivity.this, "selectedPosition: " + "สูง"
                                    , Toast.LENGTH_SHORT).show();


                            profitString = String.valueOf("สูง");


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
    }

  /*  private void searchPlantData() {
        try {

            String[] resultStrings = objPlantTABLE.searchPlantData(natureAreaString);
            if (weatherString.equals(resultStrings[3]) && costString.equals(resultStrings[4])
                && profitString.equals(resultStrings[5])) {


                //Intent To Service
                Intent objIntent = new Intent(RecommendActivity.this,ListViewPlantActivity.class);
                objIntent.putExtra("NatureArea", natureAreaString);
                objIntent.putExtra("Weather", weatherString);
                objIntent.putExtra("Cost", costString);
                objIntent.putExtra("Profit", profitString);
                startActivity(objIntent);
                finish();

            } else {
                Toast.makeText(RecommendActivity.this, "ข้อมูล ผิด",
                        Toast.LENGTH_SHORT).show();
            }


        } catch (Exception e) {
            Toast.makeText(RecommendActivity.this, "ไม่มี" + natureAreaString + " , " + weatherString + " , " +
                            costString + " , "+ profitString + "ในฐานข้อมูลของเรา",
                    Toast.LENGTH_SHORT).show();
        }



    }//searchData*/

    private void bindWidget() {
        natureArea = (ImageView) findViewById(R.id.imageView23);
        weather = (ImageView) findViewById(R.id.imageView25);
        cost = (ImageView) findViewById(R.id.imageView24);
        profit = (ImageView) findViewById(R.id.imageView26);


    }//bindWidget
}//Main Class
