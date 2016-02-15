package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;

public class SignUpActivity extends AppCompatActivity {

    //Explicit
    String userString, passwordString, emailString;
    private UserTABLE objUserTABLE;
    private DesignTABLE objDesignTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);



        //Request Database
        objUserTABLE = new UserTABLE(this);
        objDesignTABLE = new DesignTABLE(this);



    }//Main Method

    public void clickSave(View view) {

        EditText userEditText = (EditText) findViewById(R.id.User);
        EditText passwordEditText = (EditText) findViewById(R.id.Password);
        EditText emailEditText = (EditText) findViewById(R.id.email);

        userString = userEditText.getText().toString().trim();
        passwordString = passwordEditText.getText().toString().trim();
        emailString = emailEditText.getText().toString().trim();

        if (checkSpace()) {

            //Have Space
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(SignUpActivity.this, "มีช่องว่าง", "กรุณากรอกให้ครบทุกช่อง");

        }
        
                //No Space
        if (checkUser(userString)) {

            //มี User ซ้ำ
            MyAlertDialog objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.myDialog(SignUpActivity.this, "User ซ้ำ", "เปลี่ยน User ใหม่ User ซ้ำ");

        } else {
            signUp();
        }


                //signUp();


    } // ClickSave

    private boolean checkUser(String userString) {

        boolean bolResult = false;// true ==> user ซ้ำ// false ==> ไม่ซ้ำ

        try {

            UserTABLE objUserTABLE = new UserTABLE(this);
            String[] result = objUserTABLE.searchUser(userString);
            Log.d("test", "มี user = " + result[1]);
            bolResult = true;

        } catch (Exception e) {
            bolResult = false;
        }

        return bolResult;
    }

    private void signUp() {

        StrictMode.ThreadPolicy myPolicy = new StrictMode.ThreadPolicy
                .Builder().permitAll().build();
        StrictMode.setThreadPolicy(myPolicy);



        try {


                ArrayList<NameValuePair> objNameValuePairs = new ArrayList<NameValuePair>();
                objNameValuePairs.add(new BasicNameValuePair("isAdd", "true"));
                objNameValuePairs.add(new BasicNameValuePair("User", userString));
                objNameValuePairs.add(new BasicNameValuePair("Password", passwordString));
                objNameValuePairs.add(new BasicNameValuePair("Email", emailString));


                HttpClient objHttpClient = new DefaultHttpClient();
                HttpPost objHttpPost = new HttpPost("http://swiftcodingthai.com/min/php_register_min.php");
                objHttpPost.setEntity(new UrlEncodedFormEntity(objNameValuePairs, "UTF-8"));
                objHttpClient.execute(objHttpPost);

                Toast.makeText(SignUpActivity.this,
                        "SignUp Success", Toast.LENGTH_SHORT).show();
                Intent objIntent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(objIntent);
                //finish();


        } catch (Exception e) {
            Toast.makeText(SignUpActivity.this,
                    "Cannot SignUp", Toast.LENGTH_SHORT).show();
        }

    } // signUp


    private boolean checkSpace() {

        boolean bolStatus = true; //Have Space

        bolStatus = userString.equals("") || passwordString.equals("") || emailString.equals("");

        return bolStatus;
    }

}// Main Class
