package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ChooseAreaActivity extends AppCompatActivity {

    //Explicit
    private Float bigAreaAFloat;
    private ImageView theoryImageView, customImageView;

    String userString,memberString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_area);

        receiveValue();
    }// Main Method

    public void clickTheory(View view) {
        Intent objIntent = new Intent(ChooseAreaActivity.this,SpinnerFigActivity.class);
        objIntent.putExtra("BigArea", bigAreaAFloat);
        objIntent.putExtra("User", userString);
        startActivity(objIntent);
        finish();

    }// clickTheory

    public void clickNoFig(View view) {
        Intent objIntent = new Intent(ChooseAreaActivity.this,NofigActivity.class);
        objIntent.putExtra("BigArea", bigAreaAFloat);
        objIntent.putExtra("User", userString);
        startActivity(objIntent);
        finish();

    }//clickNoFig

    private void receiveValue() {
        bigAreaAFloat = getIntent().getExtras().getFloat("BigArea");
        userString = getIntent().getStringExtra("User");

    } // receiveValue
}// Main Class
