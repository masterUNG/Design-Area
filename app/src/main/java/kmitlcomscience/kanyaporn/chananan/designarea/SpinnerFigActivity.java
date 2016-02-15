package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class SpinnerFigActivity extends AppCompatActivity {

    private String strPlant,strFarm,strAnimal,strHouse,strSpinner1,strSpinner2,strSpinner3,strSpinner4;
    private Spinner plantSpinner, farmSpinner, animalSpinner, homeSpinner;
    private Float bigAreaAFloat;
    private TextView txtPlant,txtFarm,txtAnimal,txtHouse;
    private int plantChooseAnInt, animalChooseAnInt, farmChooseAnInt, houseChooseAnInt;

    String userString, memberString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_fig);

        chooseSpinner1();
        chooseSpinner2();
        chooseSpinner3();
        chooseSpinner4();

        receiveValue();

        initWidget();
    }// Main Method

    private void initWidget() {
        txtPlant = (TextView)findViewById(R.id.textView6);
        txtFarm = (TextView)findViewById(R.id.textView8);
        txtAnimal = (TextView)findViewById(R.id.textView10);
        txtHouse = (TextView)findViewById(R.id.textView12);
    }

    private void receiveValue() {
        bigAreaAFloat = getIntent().getExtras().getFloat("BigArea");
        userString = getIntent().getStringExtra("User");
    }

    public void clickOK(View view) {

        setValue();
        goAnswerActivity();// method ที่ใช้ส่งค่า



    }// clickOK

    private void goAnswerActivity() {
        Intent sentToAnswer = new Intent(SpinnerFigActivity.this,MapFigActivity.class);
        sentToAnswer.putExtra("BigArea", bigAreaAFloat); //ส่งค่าตัวแปรพื้นที่ไปหน้า SubP1
        sentToAnswer.putExtra("User", userString);

        MyStaticData objMyStaticData = new MyStaticData();

        String[] plantStrings = objMyStaticData.plantStrings;
        String[] farmStrings = objMyStaticData.farmString;
        String[] animalStrings = objMyStaticData.animalStrings;
        String[] houseStrings = objMyStaticData.homeStrings;
        int[] plantInts = objMyStaticData.plantInts;
        int[] farmInts = objMyStaticData.farmInts;
        int[] animalInts = objMyStaticData.animalInts;
        int[] houseInts = objMyStaticData.houseInts;


        sentToAnswer.putExtra("strPlant",strPlant);
        sentToAnswer.putExtra("strFarm", strFarm);
        sentToAnswer.putExtra("strAnimal",strAnimal);
        sentToAnswer.putExtra("strHouse",strHouse);

        sentToAnswer.putExtra("strSpinner1",plantStrings[plantChooseAnInt]);
        sentToAnswer.putExtra("strSpinner2",farmStrings[farmChooseAnInt]);
        sentToAnswer.putExtra("strSpinner3",animalStrings[animalChooseAnInt]);
        sentToAnswer.putExtra("strSpinner4",houseStrings[houseChooseAnInt]);

        sentToAnswer.putExtra("plant", plantInts[plantChooseAnInt]);
        sentToAnswer.putExtra("farm", farmInts[farmChooseAnInt]);
        sentToAnswer.putExtra("animal", animalInts[animalChooseAnInt]);
        sentToAnswer.putExtra("house", houseInts[houseChooseAnInt]);



        startActivity(sentToAnswer);
        finish();

    }

    private void setValue() {
        //แปลงค่าให้เป็น String
        strPlant = txtPlant.getText().toString();
        strFarm = txtFarm.getText().toString();
        strAnimal = txtAnimal.getText().toString();
        strHouse = txtHouse.getText().toString();

        //แปลงค่า spinner
//        strSpinner1 = String.valueOf(plantSpinner.getSelectedItem());
//        strSpinner2 = String.valueOf(farmSpinner.getSelectedItem());
//        strSpinner3 = String.valueOf(animalSpinner.getSelectedItem());
//        strSpinner4 = String.valueOf(homeSpinner.getSelectedItem());

    }

    private void chooseSpinner1() {

        plantSpinner = (Spinner) findViewById(R.id.spinner);
        ArrayList<String> myListSpinner1 = new ArrayList<String>();
        myListSpinner1.add("ทุเรียน");
        myListSpinner1.add("มังคุด");
        myListSpinner1.add("ข้าวโพด");
        myListSpinner1.add("ยางพารา");

        //เครื่องจักรที่นำลิสเหล่านี้เข้าไปใน spinner
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, myListSpinner1);
        plantSpinner.setAdapter(myAdapter1);

        plantSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                plantChooseAnInt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                plantChooseAnInt = 0;
            }
        });


    }// chooseSpinner1

    private void chooseSpinner2() {

        farmSpinner = (Spinner) findViewById(R.id.spinner2);
        ArrayList<String> myListSpinner2 = new ArrayList<String>();
        myListSpinner2.add("ข้าวหอมมะลิ");
        myListSpinner2.add("ข้าวกล้อง");

        //เครื่องจักรที่นำลิสเหล่านี้เข้าไปใน spinner
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,myListSpinner2);
        farmSpinner.setAdapter(myAdapter2);

        farmSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                farmChooseAnInt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                farmChooseAnInt = 0;
            }
        });




    }// chooseSpinner2

    private void chooseSpinner3() {

        animalSpinner = (Spinner) findViewById(R.id.spinner3);
        ArrayList<String> myListSpinner3 = new ArrayList<String>();
        myListSpinner3.add("หมู");
        myListSpinner3.add("ไก่");
        myListSpinner3.add("เป็ด");
        myListSpinner3.add("ปลานิล");
        myListSpinner3.add("ปลาดุก");
        myListSpinner3.add("ปลาสลิด");

        //เครื่องจักรที่นำลิสเหล่านี้เข้าไปใน spinner
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, myListSpinner3);
        animalSpinner.setAdapter(myAdapter3);

        animalSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                animalChooseAnInt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                animalChooseAnInt = 0;
            }
        });

    }// chooseSpinner3

    private void chooseSpinner4() {

        homeSpinner = (Spinner) findViewById(R.id.spinner4);
        ArrayList<String> myListSpinner4 = new ArrayList<String>();
        myListSpinner4.add("เพาะเห็ด");
        myListSpinner4.add("ปุ๋ยหมัก");
        myListSpinner4.add("บ้าน");


        //เครื่องจักรที่นำลิสเหล่านี้เข้าไปใน spinner
        ArrayAdapter<String> myAdapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, myListSpinner4);
        homeSpinner.setAdapter(myAdapter4);

        homeSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                houseChooseAnInt = i;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                houseChooseAnInt = 0;
            }
        });



    }// chooseSpinner4

}// Main Class
