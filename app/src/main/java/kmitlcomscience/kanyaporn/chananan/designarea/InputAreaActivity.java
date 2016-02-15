package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InputAreaActivity extends AppCompatActivity {
    //Explicit
    private EditText bigAreaEditText;

    private Float bigAreaAFloat;

    String memberString;

    String userString, bigAreaString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_area);



        userString = getIntent().getStringExtra("User");
    } // Main Method

    public void clickDesign(View view) {

       /* //BindWidget ผูกตัวแปร
        bigAreaEditText = (EditText) findViewById(R.id.editText3);


        bigAreaAFloat = Float.parseFloat(bigAreaEditText.getText().toString().trim());
       // bigAreaString = String.valueOf(bigAreaAFloat);*/

        try {
            //แปลงค่าจาก Editext เป็น float
            //BindWidget ผูกตัวแปร
            bigAreaEditText = (EditText) findViewById(R.id.editText3);


            bigAreaAFloat = Float.parseFloat(bigAreaEditText.getText().toString().trim());


            if (bigAreaAFloat != 0) {
                Toast.makeText(InputAreaActivity.this, "ข้อมูลพื้นที่ถูกต้อง"
                        , Toast.LENGTH_SHORT).show();
                Intent objIntent = new Intent(InputAreaActivity.this, ChooseAreaActivity.class);

                objIntent.putExtra("BigArea", bigAreaAFloat);
                objIntent.putExtra("User", userString);

                startActivity(objIntent);
                finish();
            } // if
            else {
                MyAlertDialog objMyAlertDialog = new MyAlertDialog();
                objMyAlertDialog.myDialog(InputAreaActivity.this, "ข้อมูลพื้นที่ไม่ถูกต้อง ", "กรุณากรอกใหม่");
            }

        }// try
        catch (Exception e) {
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(InputAreaActivity.this, "ข้อมูลพื้นไม่ถูกต้อง ", "กรุณากรอกใหม่");

        }


                /*Intent objIntent = new Intent(InputAreaActivity.this, ChooseAreaActivity.class);
                objIntent.putExtra("BigArea", bigAreaAFloat);
                objIntent.putExtra("User", userString);
                startActivity(objIntent);
                finish();*/




    }// clickDesign



}// Main Class
