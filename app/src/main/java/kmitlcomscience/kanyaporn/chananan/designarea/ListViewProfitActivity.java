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

public class ListViewProfitActivity extends AppCompatActivity {

    private ProfitTABLE objProfitTABLE;
    private MyAdapterProfit myAdapterProfit;

    private ListView profitListView;

    Cursor mCursor;
    SQLiteDatabase mDb;
    MyOpenHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_profit);

        mHelper = new MyOpenHelper(this);
        mDb = mHelper.getWritableDatabase();

        //Bind Widget
        bindWidget();

        showProfit();



    }

    private void bindWidget() {
        profitListView = (ListView) findViewById(R.id.listView);

    }//bindWidget

    private void showProfit() {

        SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE, null);
        Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM " + ProfitTABLE.profit_TABLE, null);

        int intCount = objCursor.getCount();
        final String[] userStrings = new String[intCount];

        final String[] areaStrings1 = new String[intCount];
        final String[] typeStrings1 = new String[intCount];
        final String[] numberStrings1 = new String[intCount];
        final String[] profitPeriod1 = new String[intCount];
        final String[] estimatedProfit1 = new String[intCount];

        final String[] areaStrings2 = new String[intCount];
        final String[] typeStrings2 = new String[intCount];
        final String[] numberStrings2 = new String[intCount];
        final String[] profitPeriod2 = new String[intCount];
        final String[] estimatedProfit2 = new String[intCount];

        final String[] areaStrings3 = new String[intCount];
        final String[] typeStrings3 = new String[intCount];
        final String[] numberStrings3 = new String[intCount];
        final String[] profitPeriod3 = new String[intCount];
        final String[] estimatedProfit3 = new String[intCount];

        final String[] areaStrings4 = new String[intCount];
        final String[] typeStrings4 = new String[intCount];
        final String[] numberStrings4 = new String[intCount];
        final String[] profitPeriod4 = new String[intCount];
        final String[] estimatedProfit4 = new String[intCount];




        objCursor.moveToFirst();
        for (int i = 0; i < intCount; i++) {


            userStrings[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_user));

            areaStrings1[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_area1));
            typeStrings1[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_type1));
            numberStrings1[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_number1));
            profitPeriod1[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_profitPeriod1));
            estimatedProfit1[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_EstimatedProfit1));

            areaStrings2[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_area2));
            typeStrings2[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_type2));
            numberStrings2[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_number2));
            profitPeriod2[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_profitPeriod2));
            estimatedProfit2[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_EstimatedProfit2));

            areaStrings3[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_area3));
            typeStrings3[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_type3));
            numberStrings3[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_number3));
            profitPeriod3[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_profitPeriod3));
            estimatedProfit3[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_EstimatedProfit3));

            areaStrings4[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_area4));
            typeStrings4[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_type4));
            numberStrings4[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_number4));
            profitPeriod4[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_profitPeriod4));
            estimatedProfit4[i] = objCursor.getString(objCursor.getColumnIndex(ProfitTABLE.column_EstimatedProfit4));



            objCursor.moveToNext();

        }  // for
        objCursor.close();

        MyAdapterProfit objMyAdapter = new MyAdapterProfit(ListViewProfitActivity.this, userStrings);
        profitListView.setAdapter(objMyAdapter);

        profitListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //confirmOder(foodStrings[i]);

                showProfitDetail(areaStrings1[i], typeStrings1[i], numberStrings1[i],
                        profitPeriod1[i], estimatedProfit1[i],
                        areaStrings2[i], typeStrings2[i], numberStrings2[i],
                        profitPeriod2[i], estimatedProfit2[i],
                        areaStrings3[i], typeStrings3[i], numberStrings3[i],
                        profitPeriod3[i], estimatedProfit3[i],
                        areaStrings4[i], typeStrings4[i], numberStrings4[i],
                        profitPeriod4[i], estimatedProfit4[i]);
            }
        });

    }  // showMenuFood

    private void showProfitDetail(String areaStrings1, String typeStrings1, String numberStrings1,
                                String profitPeriod1, String estimatedProfit1,
                                String areaStrings2, String typeStrings2, String numberStrings2,
                                String profitPeriod2, String estimatedProfit2,
                                String areaStrings3, String typeStrings3, String numberStrings3,
                                String profitPeriod3, String estimatedProfit3,
                                String areaStrings4, String typeStrings4, String numberStrings4,
                                String profitPeriod4, String estimatedProfit4) {
        AlertDialog.Builder objBuilder = new AlertDialog.Builder(this);
        objBuilder.setIcon(R.drawable.build3);
        objBuilder.setTitle("DesignArea Detail");
        objBuilder.setMessage("พื้นที่ที่ :  " + areaStrings1 + "\n" + "ชนิด : " + typeStrings1 + "\n" +
                "จำนวน : " + numberStrings1 + " ต้น" + "\n" + "ระยะเวลาที่จะได้กำไร : " + profitPeriod1 + "\n" +
                "กำไรประมาณ : " + estimatedProfit1 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings2 + "\n" + "ชนิด : " + typeStrings2 + "\n" +
                "จำนวน : " + numberStrings2 + " ต้น" + "\n" + "ระยะเวลาที่จะได้กำไร : " + profitPeriod2 + "\n" +
                "กำไรประมาณ : " + estimatedProfit2 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings3 + "\n" + "ชนิด : " + typeStrings3 + "\n" +
                "จำนวน : " + numberStrings3 + " ต้น" + "\n" + "ระยะเวลาที่จะได้กำไร : " + profitPeriod3 + "\n" +
                "กำไรประมาณ : " + estimatedProfit3 + "\n" + "" + "\n" +

                "พื้นที่ที่ :  " + areaStrings4 + "\n" + "ชนิด : " + typeStrings4 + "\n" +
                "จำนวน : " + numberStrings4 + " ต้น" + "\n" + "ระยะเวลาที่จะได้กำไร : " + profitPeriod4 + "\n" +
                "กำไรประมาณ : " + estimatedProfit4 + "\n" + "" + "\n" );
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