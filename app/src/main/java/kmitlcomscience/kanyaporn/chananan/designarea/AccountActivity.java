package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountActivity extends AppCompatActivity {


    private ImageView designImageView, ferAndFoodImageView, costImageView, profitImageView;
    private String userString;

    private TextView txtUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        //Bind Widget
        bindWidget();

        userString = getIntent().getStringExtra("User");//รับค่า

        //txtUser.setText("User : " + userString);


    }// Main Method

    public void clickDesignImageView(View view) {
        Intent go = new Intent(AccountActivity.this, ListViewDesignActivity.class);
        go.putExtra("User", userString);
        startActivity(go);

    }//clickDesignImageView

    public void clickFerAndFoodImageView(View view) {
        Intent go = new Intent(AccountActivity.this, ListViewFerAndFoodActivity.class);
        go.putExtra("User", userString);
        startActivity(go);

    }// clickFerAndFoodImageView

    public void clickCostImageView(View view) {
        Intent go = new Intent(AccountActivity.this, ListViewCostActivity.class);
        go.putExtra("User", userString);
        startActivity(go);

    }// clickCostImageView

    public void clickProfitImageView(View view) {
        Intent go = new Intent(AccountActivity.this, ListViewProfitActivity.class);
        go.putExtra("User", userString);
        startActivity(go);

    }// clickCostImageView

    private void bindWidget() {

        designImageView = (ImageView) findViewById(R.id.imageView16);
        ferAndFoodImageView = (ImageView) findViewById(R.id.imageView17);
        costImageView = (ImageView) findViewById(R.id.imageView18);
        profitImageView = (ImageView) findViewById(R.id.imageView19);

        txtUser = (TextView) findViewById(R.id.textView47);

    }//bindWidget

}//Main Class
