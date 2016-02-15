package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewPlantActivity extends AppCompatActivity {

    private PlantTABLE objPlantTABLE;
    private MyAdapterPlant plantAdapter;

    private String natureAreaString, weatherString, costString, profitString;

    private ListView plantListView;

    Cursor mCursor;
    SQLiteDatabase mDb;
    MyOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_plant);

        mHelper = new MyOpenHelper(this);
        mDb = mHelper.getWritableDatabase();

        //Bind Widget
        bindWidget();

        receiveValue();

        showPlant();





    }

    /*private void searchPlantData() {
        try {

            String[] resultStrings = objPlantTABLE.searchPlantData(natureAreaString);
            if (weatherString.equals(resultStrings[3]) || costString.equals(resultStrings[4])
                    || profitString.equals(resultStrings[5])) {


                showPlant();


            } else {
                Toast.makeText(ListViewPlantActivity.this, "ข้อมูล ผิด",
                        Toast.LENGTH_SHORT).show();
            }


        } catch (Exception e) {
            Toast.makeText(ListViewPlantActivity.this, "ไม่มี" + natureAreaString + " , " + weatherString + " , " +
                            costString + " , "+ profitString + "ในฐานข้อมูลของเรา",
                    Toast.LENGTH_SHORT).show();
        }



    }*/

    private void receiveValue() {

        natureAreaString = getIntent().getStringExtra("NatureArea");
        weatherString = getIntent().getStringExtra("Weather");
        costString = getIntent().getStringExtra("Cost");
        profitString = getIntent().getStringExtra("Profit");

        //searchPlantData();

    }// receiveValue

    private void bindWidget() {
        plantListView = (ListView) findViewById(R.id.listView);

    }//bindWidget

    private void showPlant() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + PlantTABLE.plant_TABLE
                + " WHERE " + PlantTABLE.column_natureArea + "='" + natureAreaString + "'"
                + " AND " + PlantTABLE.column_weather + "='" + weatherString + "'"
                + " AND " + PlantTABLE.column_cost + "='" + costString + "'"
                + " AND " + PlantTABLE.column_profit + "='" + profitString + "'", null);

        //Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + PlantTABLE.plant_TABLE, null);

        int intCount = objCursor.getCount();

        final String[] plantName = new String[intCount];
        final String[] natureArea = new String[intCount];
        final String[] weather = new String[intCount];
        final String[] cost = new String[intCount];
        final String[] profit = new String[intCount];






        objCursor.moveToFirst();
        for (int i = 0; i < intCount; i++) {


            plantName[i] = objCursor.getString(objCursor.getColumnIndex(PlantTABLE.column_plantName));
            natureArea[i] = objCursor.getString(objCursor.getColumnIndex(PlantTABLE.column_natureArea));
            weather[i] = objCursor.getString(objCursor.getColumnIndex(PlantTABLE.column_weather));
            cost[i] = objCursor.getString(objCursor.getColumnIndex(PlantTABLE.column_cost));
            profit[i] = objCursor.getString(objCursor.getColumnIndex(PlantTABLE.column_profit));

           



            objCursor.moveToNext();

        }  // for
        objCursor.close();

        MyAdapterPlant objMyAdapter = new MyAdapterPlant(ListViewPlantActivity.this, plantName);
        plantListView.setAdapter(objMyAdapter);

        plantListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //confirmOder(foodStrings[i]);

                showPlantDetail(natureArea[i], weather[i], cost[i],
                        profit[i]);
            }
        });

    }  // showMenuFood

    private void showPlantDetail(String natureArea, String weather, String cost,
                                String profit) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("Plant Detail");
        objBuilder.setMessage("ลักษณะพื้นที่ :  " + natureArea + "\n" + "สภาพอากาศ : " + weather + "\n" +
                "ต้นทุน : " + cost + "\n" + "ผลผลิต / กำไร : " + profit + "\n" );
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();


    }//showDesignDetail


}// Main Class