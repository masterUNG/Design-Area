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

public class ListViewFerAndFoodActivity extends AppCompatActivity {
    // private DesignTABLE objDesignTABLE;

    private FerAndFoodTABLE objFerAndFoodTABLE;
    private MyAdapterFerAndFood myAdapterFerAndFood;

    private ListView ferAndFoodListView;

    Cursor mCursor;
    SQLiteDatabase mDb;
    MyOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_fer_and_food);

        mHelper = new MyOpenHelper(this);
        mDb = mHelper.getWritableDatabase();

        //Bind Widget
        bindWidget();

        showFerAndFood();



    }

    private void bindWidget() {
        ferAndFoodListView = (ListView) findViewById(R.id.listView);

    }//bindWidget

    private void showFerAndFood() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + FerAndFoodTABLE.FerAndFood_TABLE, null);

        int intCount = objCursor.getCount();
        final String[] userStrings = new String[intCount];

        final String[] areaStrings1 = new String[intCount];
        final String[] typeStrings1 = new String[intCount];
        final String[] numberStrings1 = new String[intCount];
        final String[] ratioNo1_1 = new String[intCount];
        final String[] ratioNo1_2 = new String[intCount];
        final String[] ratioNo1_3 = new String[intCount];
        final String[] ratioNo1_4 = new String[intCount];
        final String[] ratioNo1_5 = new String[intCount];

        final String[] areaStrings2 = new String[intCount];
        final String[] typeStrings2 = new String[intCount];
        final String[] numberStrings2 = new String[intCount];
        final String[] ratioNo2_1 = new String[intCount];
        final String[] ratioNo2_2 = new String[intCount];
        final String[] ratioNo2_3 = new String[intCount];
        final String[] ratioNo2_4 = new String[intCount];
        final String[] ratioNo2_5 = new String[intCount];

        final String[] areaStrings3 = new String[intCount];
        final String[] typeStrings3 = new String[intCount];
        final String[] numberStrings3 = new String[intCount];
        final String[] ratioNo3_1 = new String[intCount];
        final String[] ratioNo3_2 = new String[intCount];
        final String[] ratioNo3_3 = new String[intCount];
        final String[] ratioNo3_4 = new String[intCount];
        final String[] ratioNo3_5 = new String[intCount];

        final String[] areaStrings4 = new String[intCount];
        final String[] typeStrings4 = new String[intCount];
        final String[] numberStrings4 = new String[intCount];
        final String[] ratioNo4_1 = new String[intCount];
        final String[] ratioNo4_2 = new String[intCount];
        final String[] ratioNo4_3 = new String[intCount];
        final String[] ratioNo4_4 = new String[intCount];
        final String[] ratioNo4_5 = new String[intCount];


        objCursor.moveToFirst();
        for (int i = 0; i < intCount; i++) {


            userStrings[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_user));

            areaStrings1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_area1));
            typeStrings1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_type1));
            numberStrings1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_number1));
            ratioNo1_1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo1_1));
            ratioNo1_2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo1_2));
            ratioNo1_3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo1_3));
            ratioNo1_4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo1_4));
            ratioNo1_5[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo1_5));

            areaStrings2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_area2));
            typeStrings2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_type2));
            numberStrings2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_number2));
            ratioNo2_1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo2_1));
            ratioNo2_2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo2_2));
            ratioNo2_3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo2_3));
            ratioNo2_4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo2_4));
            ratioNo2_5[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo2_5));

            areaStrings3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_area3));
            typeStrings3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_type3));
            numberStrings3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_number3));
            ratioNo3_1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo3_1));
            ratioNo3_2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo3_2));
            ratioNo3_3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo3_3));
            ratioNo3_4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo3_4));
            ratioNo3_5[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo3_5));

            areaStrings4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_area4));
            typeStrings4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_type4));
            numberStrings4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_number4));
            ratioNo4_1[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo4_1));
            ratioNo4_2[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo4_2));
            ratioNo4_3[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo4_3));
            ratioNo4_4[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo4_4));
            ratioNo4_5[i] = objCursor.getString(objCursor.getColumnIndex(FerAndFoodTABLE.column_ratioNo4_5));





            objCursor.moveToNext();

        }  // for
        objCursor.close();

        MyAdapterFerAndFood objMyAdapter = new MyAdapterFerAndFood(ListViewFerAndFoodActivity.this, userStrings);
        ferAndFoodListView.setAdapter(objMyAdapter);

        ferAndFoodListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //confirmOder(foodStrings[i]);

                showFerAndFoodDetail(areaStrings1[i], typeStrings1[i], numberStrings1[i],
                        ratioNo1_1[i], ratioNo1_2[i], ratioNo1_3[i], ratioNo1_4[i], ratioNo1_5[i],
                        areaStrings2[i], typeStrings2[i], numberStrings2[i],
                        ratioNo2_1[i], ratioNo2_2[i], ratioNo2_3[i], ratioNo2_4[i], ratioNo2_5[i],
                        areaStrings3[i], typeStrings3[i], numberStrings3[i],
                        ratioNo3_1[i], ratioNo3_2[i], ratioNo3_3[i], ratioNo3_4[i], ratioNo3_5[i],
                        areaStrings4[i], typeStrings4[i], numberStrings4[i],
                        ratioNo4_1[i], ratioNo4_2[i], ratioNo4_3[i], ratioNo4_4[i], ratioNo4_5[i]);
            }
        });

    }  // showMenuFood

    private void showFerAndFoodDetail(String areaStrings1, String typeStrings1, String numberStrings1,
                                  String ratioNo1_1, String ratioNo1_2, String ratioNo1_3,
                                  String ratioNo1_4, String ratioNo1_5,
                                  String areaStrings2, String typeStrings2, String numberStrings2,
                                  String ratioNo2_1, String ratioNo2_2, String ratioNo2_3,
                                  String ratioNo2_4, String ratioNo2_5,
                                  String areaStrings3, String typeStrings3, String numberStrings3,
                                  String ratioNo3_1, String ratioNo3_2, String ratioNo3_3,
                                  String ratioNo3_4, String ratioNo3_5,
                                  String areaStrings4, String typeStrings4, String numberStrings4,
                                  String ratioNo4_1, String ratioNo4_2, String ratioNo4_3,
                                  String ratioNo4_4, String ratioNo4_5) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea Detail");
        objBuilder.setMessage("พื้นที่ที่ :  " + areaStrings1 + "\n" + "ชนิด : " + typeStrings1 + "\n" +
                "จำนวน : " + numberStrings1 + " ต้น" + "\n" + "อัตราส่วนปุ๋ย / อาหาร 1 : " + ratioNo1_1 + "\n" +
                "อัตราส่วนปุ๋ย / อาหาร 2 : " + ratioNo1_2 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 3 : " + ratioNo1_3 + "\n"
                + "อัตราส่วนปุ๋ย / อาหาร 4 : " + ratioNo1_4 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 5 : " + ratioNo1_5
                + "\n" + "" + "\n" +

                        "พื้นที่ที่ :  " + areaStrings2 + "\n" + "ชนิด : " + typeStrings2 + "\n" +
                        "จำนวน : " + numberStrings2 + " ต้น" + "\n" + "อัตราส่วนปุ๋ย / อาหาร 1 : " + ratioNo2_1 + "\n" +
                        "อัตราส่วนปุ๋ย / อาหาร 2 : " + ratioNo2_2 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 3 : " + ratioNo2_3 + "\n"
                        + "อัตราส่วนปุ๋ย / อาหาร 4 : " + ratioNo2_4 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 5 : " + ratioNo2_5
                        + "\n" + "" + "\n" +

                        "พื้นที่ที่ :  " + areaStrings3 + "\n" + "ชนิด : " + typeStrings3 + "\n" +
                        "จำนวน : " + numberStrings3 + " ต้น" + "\n" + "อัตราส่วนปุ๋ย / อาหาร 1 : " + ratioNo3_1 + "\n" +
                        "อัตราส่วนปุ๋ย / อาหาร 2 : " + ratioNo3_2 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 3 : " + ratioNo3_3 + "\n"
                        + "อัตราส่วนปุ๋ย / อาหาร 4 : " + ratioNo3_4 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 5 : " + ratioNo3_5
                        + "\n" + "" + "\n" +

                        "พื้นที่ที่ :  " + areaStrings4 + "\n" + "ชนิด : " + typeStrings4 + "\n" +
                        "จำนวน : " + numberStrings4 + " ต้น" + "\n" + "อัตราส่วนปุ๋ย / อาหาร 1 : " + ratioNo4_1 + "\n" +
                        "อัตราส่วนปุ๋ย / อาหาร 2 : " + ratioNo4_2 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 3 : " + ratioNo4_3 + "\n"
                        + "อัตราส่วนปุ๋ย / อาหาร 4 : " + ratioNo4_4 + "\n" + "อัตราส่วนปุ๋ย / อาหาร 5 : " + ratioNo4_5
                        + "\n" + "" + "\n");
        objBuilder.setCancelable(false);
        objBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        objBuilder.show();


    }//showFerAndFoodDetail


}// Main Class