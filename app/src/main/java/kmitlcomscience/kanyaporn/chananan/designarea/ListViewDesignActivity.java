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

public class ListViewDesignActivity extends AppCompatActivity {
   // private DesignTABLE objDesignTABLE;

    private DesignTABLE objDesignTABLE;
    private MyAdapterDesign designAdapter;

    private ListView designListView;

    Cursor mCursor;
    SQLiteDatabase mDb;
    MyOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_design);

        mHelper = new MyOpenHelper(this);
        mDb = mHelper.getWritableDatabase();

        //Bind Widget
        bindWidget();

        showDesign();



    }

    private void bindWidget() {
        designListView = (ListView) findViewById(R.id.listView);

    }//bindWidget

    private void showDesign() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + DesignTABLE.design_TABLE, null);

        int intCount = objCursor.getCount();
        final String[] bigAreaStrings = new String [intCount];
        final String[] userStrings = new String[intCount];

        final String[] areaStrings1 = new String[intCount];
        final String[] subAreaStrings1 = new String[intCount];
        final String[] cateStrings1 = new String[intCount];
        final String[] typeStrings1 = new String[intCount];
        final String[] numberStrings1 = new String[intCount];
        final String[] distanceStrings1 = new String[intCount];
        final String[] harvestStrings1 = new String[intCount];

        final String[] areaStrings2 = new String[intCount];
        final String[] subAreaStrings2 = new String[intCount];
        final String[] cateStrings2 = new String[intCount];
        final String[] typeStrings2 = new String[intCount];
        final String[] numberStrings2 = new String[intCount];
        final String[] distanceStrings2 = new String[intCount];
        final String[] harvestStrings2 = new String[intCount];

        final String[] areaStrings3 = new String[intCount];
        final String[] subAreaStrings3 = new String[intCount];
        final String[] cateStrings3 = new String[intCount];
        final String[] typeStrings3 = new String[intCount];
        final String[] numberStrings3 = new String[intCount];
        final String[] distanceStrings3 = new String[intCount];
        final String[] harvestStrings3 = new String[intCount];

        final String[] areaStrings4 = new String[intCount];
        final String[] subAreaStrings4 = new String[intCount];
        final String[] cateStrings4 = new String[intCount];
        final String[] typeStrings4 = new String[intCount];
        final String[] numberStrings4 = new String[intCount];
        final String[] distanceStrings4 = new String[intCount];
        final String[] harvestStrings4 = new String[intCount];


        objCursor.moveToFirst();
        for (int i = 0; i < intCount; i++) {

            bigAreaStrings[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_bigarea));
            userStrings[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_user));

            areaStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area1));
            subAreaStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_subarea1));
            cateStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_cate1));
            typeStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_type1));
            numberStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_number1));
            distanceStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area1));
            harvestStrings1[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_harvest1));

            areaStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area2));
            subAreaStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_subarea2));
            cateStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_cate2));
            typeStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_type2));
            numberStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_number2));
            distanceStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area2));
            harvestStrings2[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_harvest2));

            areaStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area3));
            subAreaStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_subarea3));
            cateStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_cate3));
            typeStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_type3));
            numberStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_number3));
            distanceStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area3));
            harvestStrings3[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_harvest3));

            areaStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area4));
            subAreaStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_subarea4));
            cateStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_cate4));
            typeStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_type4));
            numberStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_number4));
            distanceStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_area4));
            harvestStrings4[i] = objCursor.getString(objCursor.getColumnIndex(DesignTABLE.column_harvest4));





            objCursor.moveToNext();

        }  // for
        objCursor.close();

        MyAdapterDesign objMyAdapter = new MyAdapterDesign(ListViewDesignActivity.this, bigAreaStrings,
                userStrings);
        designListView.setAdapter(objMyAdapter);

        designListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //confirmOder(foodStrings[i]);

                showDesignDetail(areaStrings1[i], subAreaStrings1[i], cateStrings1[i], typeStrings1[i],
                                 numberStrings1[i], distanceStrings1[i], harvestStrings1[i],
                                 areaStrings2[i], subAreaStrings2[i], cateStrings2[i], typeStrings2[i],
                                 numberStrings2[i], distanceStrings2[i], harvestStrings2[i],
                                 areaStrings3[i], subAreaStrings3[i], cateStrings3[i], typeStrings3[i],
                                 numberStrings3[i], distanceStrings3[i], harvestStrings3[i],
                                 areaStrings4[i], subAreaStrings4[i], cateStrings4[i], typeStrings4[i],
                                 numberStrings4[i], distanceStrings4[i], harvestStrings4[i]);
            }
        });

    }  // showMenuFood

    private void showDesignDetail(String areaStrings1, String subAreaStrings1, String cateStrings1, String typeStrings1,
                                  String numberString1, String distanceStrings1, String harvestStrings1,
                                  String areaStrings2, String subAreaStrings2, String cateStrings2, String typeStrings2,
                                  String numberString2, String distanceStrings2, String harvestStrings2,
                                  String areaStrings3, String subAreaStrings3, String cateStrings3, String typeStrings3,
                                  String numberString3, String distanceStrings3, String harvestStrings3,
                                  String areaStrings4, String subAreaStrings4, String cateStrings4, String typeStrings4,
                                  String numberString4, String distanceStrings4, String harvestStrings4) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea Detail");
        objBuilder.setMessage("พื้นที่ที่ :  " + areaStrings1 + "\n" + "ขนาดพื้นที่ :  " + subAreaStrings1 + " ไร่" + "\n" +
                "ประเภท : " + cateStrings1 + "\n" + "ชนิด : " + typeStrings1 + "\n" +
                "จำนวน : " + numberString1 + " ต้น" + "\n" + "ระยะห่าง : " + distanceStrings1 + "\n" +
                "เก็บเกี่ยว : " + harvestStrings1 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings2 + "\n" + "ขนาดพื้นที่ :  " + subAreaStrings2 + " ไร่" + "\n" +
                "ประเภท : " + cateStrings2 + "\n" + "ชนิด : " + typeStrings2 + "\n" +
                "จำนวน : " + numberString2 + " ต้น" + "\n" + "ระยะห่าง : " + distanceStrings2 + "\n" +
                "เก็บเกี่ยว : " + harvestStrings2 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings3 + "\n" + "ขนาดพื้นที่ :  " + subAreaStrings3 + " ไร่" + "\n" +
                "ประเภท : " + cateStrings3 + "\n" + "ชนิด : " + typeStrings3 + "\n" +
                "จำนวน : " + numberString3 + " ต้น" + "\n" + "ระยะห่าง : " + distanceStrings3 + "\n" +
                "เก็บเกี่ยว : " + harvestStrings3 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings4 + "\n" + "ขนาดพื้นที่ :  " + subAreaStrings4 + " ไร่" + "\n" +
                "ประเภท : " + cateStrings4 + "\n" + "ชนิด : " + typeStrings4 + "\n" +
                "จำนวน : " + numberString4 + " ต้น" + "\n" + "ระยะห่าง : " + distanceStrings4 + "\n" +
                "เก็บเกี่ยว : " + harvestStrings4 + "\n" + "" + "\n");
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
