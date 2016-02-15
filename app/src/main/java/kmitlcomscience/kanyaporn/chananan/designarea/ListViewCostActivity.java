package kmitlcomscience.kanyaporn.chananan.designarea;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListViewCostActivity extends AppCompatActivity {

    private CostTABLE objCostTABLE;
    private MyAdapterCost costAdapter;

    private ListView costListView;

    Cursor mCursor;
    SQLiteDatabase mDb;
    MyOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_cost);

        mHelper = new MyOpenHelper(this);
        mDb = mHelper.getWritableDatabase();

        //Bind Widget
        bindWidget();

        showCost();



    }

    private void bindWidget() {
        costListView = (ListView) findViewById(R.id.listView);

    }//bindWidget

    private void showCost() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + CostTABLE.cost_TABLE, null);

        int intCount = objCursor.getCount();
        final String[] userStrings = new String[intCount];

        final String[] areaStrings1 = new String[intCount];
        final String[] typeStrings1 = new String[intCount];
        final String[] numberStrings1 = new String[intCount];
        final String[] typeCost1 = new String[intCount];
        final String[] ferAndFoodCost1 = new String[intCount];

        final String[] areaStrings2 = new String[intCount];
        final String[] typeStrings2 = new String[intCount];
        final String[] numberStrings2 = new String[intCount];
        final String[] typeCost2 = new String[intCount];
        final String[] ferAndFoodCost2 = new String[intCount];

        final String[] areaStrings3 = new String[intCount];
        final String[] typeStrings3 = new String[intCount];
        final String[] numberStrings3 = new String[intCount];
        final String[] typeCost3 = new String[intCount];
        final String[] ferAndFoodCost3 = new String[intCount];

        final String[] areaStrings4 = new String[intCount];
        final String[] typeStrings4 = new String[intCount];
        final String[] numberStrings4 = new String[intCount];
        final String[] typeCost4 = new String[intCount];
        final String[] ferAndFoodCost4 = new String[intCount];




        objCursor.moveToFirst();
        for (int i = 0; i < intCount; i++) {


            userStrings[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_user));

            areaStrings1[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_area1));
            typeStrings1[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_type1));
            numberStrings1[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_number1));
            typeCost1[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_typeCost1));
            ferAndFoodCost1[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_ferAndFoodCost1));

            areaStrings2[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_area2));
            typeStrings2[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_type2));
            numberStrings2[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_number2));
            typeCost2[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_typeCost2));
            ferAndFoodCost2[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_ferAndFoodCost2));

            areaStrings3[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_area3));
            typeStrings3[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_type3));
            numberStrings3[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_number3));
            typeCost3[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_typeCost3));
            ferAndFoodCost3[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_ferAndFoodCost3));

            areaStrings4[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_area4));
            typeStrings4[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_type4));
            numberStrings4[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_number4));
            typeCost4[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_typeCost4));
            ferAndFoodCost4[i] = objCursor.getString(objCursor.getColumnIndex(CostTABLE.column_ferAndFoodCost4));



            objCursor.moveToNext();

        }  // for
        objCursor.close();

        MyAdapterCost objMyAdapter = new MyAdapterCost(ListViewCostActivity.this, userStrings);
        costListView.setAdapter(objMyAdapter);

        costListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //confirmOder(foodStrings[i]);

                showCostDetail(areaStrings1[i], typeStrings1[i], numberStrings1[i],
                               typeCost1[i], ferAndFoodCost1[i],
                               areaStrings2[i], typeStrings2[i], numberStrings2[i],
                               typeCost2[i], ferAndFoodCost2[i],
                               areaStrings3[i], typeStrings3[i], numberStrings3[i],
                               typeCost3[i], ferAndFoodCost3[i],
                               areaStrings4[i], typeStrings4[i], numberStrings4[i],
                               typeCost4[i], ferAndFoodCost4[i]);
            }
        });

    }  // showMenuFood

    private void showCostDetail(String areaStrings1, String typeStrings1, String numberStrings1,
                                String typeCost1, String ferAndFoodCost1,
                                String areaStrings2, String typeStrings2, String numberStrings2,
                                String typeCost2, String ferAndFoodCost2,
                                String areaStrings3, String typeStrings3, String numberStrings3,
                                String typeCost3, String ferAndFoodCost3,
                                String areaStrings4, String typeStrings4, String numberStrings4,
                                String typeCost4, String ferAndFoodCost4) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea Detail");
        objBuilder.setMessage("พื้นที่ที่ :  " + areaStrings1 + "\n" + "ชนิด : " + typeStrings1 + "\n" +
                        "จำนวน : " + numberStrings1 + " ต้น" + "\n" + "ราคาต้นกล้า / ลูกสัตว์ : " + typeCost1 + "\n" +
                        "ราคาปุ๋ย / อาหาร : " + ferAndFoodCost1 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings2 + "\n" + "ชนิด : " + typeStrings2 + "\n" +
                "จำนวน : " + numberStrings2 + " ต้น" + "\n" + "ราคาต้นกล้า / ลูกสัตว์ : " + typeCost2 + "\n" +
                "ราคาปุ๋ย / อาหาร : " + ferAndFoodCost2 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings3 + "\n" + "ชนิด : " + typeStrings3 + "\n" +
                "จำนวน : " + numberStrings3 + " ต้น" + "\n" + "ราคาต้นกล้า / ลูกสัตว์ : " + typeCost3 + "\n" +
                "ราคาปุ๋ย / อาหาร : " + ferAndFoodCost3 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings4 + "\n" + "ชนิด : " + typeStrings4 + "\n" +
                "จำนวน : " + numberStrings4 + " ต้น" + "\n" + "ราคาต้นกล้า / ลูกสัตว์ : " + typeCost4 + "\n" +
                "ราคาปุ๋ย / อาหาร : " + ferAndFoodCost4 + "\n" + "" + "\n" );
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
