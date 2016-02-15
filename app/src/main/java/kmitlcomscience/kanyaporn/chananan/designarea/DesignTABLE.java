package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 8/2/2559.
 */
public class DesignTABLE {

    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String design_TABLE = "designTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_bigarea = "BigArea";
    public static final String column_area1 = "Area1";
    public static final String column_subarea1 = "SubArea1";
    public static final String column_cate1 = "Cate1";
    public static final String column_type1 = "Type1";
    public static final String column_number1 = "Number1";
    public static final String column_distance1 = "Distance1";
    public static final String column_harvest1 = "Harvest1";
    public static final String column_area2 = "Area2";
    public static final String column_subarea2 = "SubArea2";
    public static final String column_cate2 = "Cate2";
    public static final String column_type2 = "Type2";
    public static final String column_number2 = "Number2";
    public static final String column_distance2 = "Distance2";
    public static final String column_harvest2 = "Harvest2";
    public static final String column_area3 = "Area3";
    public static final String column_subarea3 = "SubArea3";
    public static final String column_cate3 = "Cate3";
    public static final String column_type3 = "Type3";
    public static final String column_number3 = "Number3";
    public static final String column_distance3 = "Distance3";
    public static final String column_harvest3 = "Harvest3";
    public static final String column_area4 = "Area4";
    public static final String column_subarea4 = "SubArea4";
    public static final String column_cate4 = "Cate4";
    public static final String column_type4 = "Type4";
    public static final String column_number4 = "Number4";
    public static final String column_distance4 = "Distance4";
    public static final String column_harvest4 = "Harvest4";

    public DesignTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor

    public String[] searchDesign(String strUser) {

        try {

            String[] resultStrings = null;
            Cursor objCursor = readSqLiteDatabase.query(design_TABLE,
                    new String[]{column_id, column_user, column_bigarea,
                            column_area1, column_subarea1, column_cate1, column_type1, column_number1, column_distance1, column_harvest1,
                            column_area2, column_subarea2, column_cate2, column_type2, column_number2, column_distance2, column_harvest2,
                            column_area3, column_subarea3, column_cate3, column_type3, column_number3, column_distance3, column_harvest3,
                            column_area4, column_subarea4, column_cate4, column_type4, column_number4, column_distance4, column_harvest4},
                    column_user + "=?",
                    new  String[]{String.valueOf(strUser)},//เอาคำๆไหนไปหา
                    null, null, null, null);

            if (objCursor != null) {
                if (objCursor.moveToFirst()) {

                    resultStrings = new String[4];
                    for (int i = 0; i < 4; i++) {
                        resultStrings[i] = objCursor.getString(i);
                    }

                } // if 2
            } //if 1
            objCursor.close();
            return resultStrings;

        } catch (Exception e) {
            return  null;
        }

        //return new String[0];
    }

    public long addNewDesign(String strUser, String strBigArea, String strArea1, String strSubArea1,
                             String strCate1, String strType1, String strNumber1,
                             String strDistance1, String strHarvest1, String strArea2,
                             String strSubArea2, String strCate2, String strType2,
                             String strNumber2, String strDistance2, String strHarvest2,
                             String strArea3, String strSubArea3, String strCate3,
                             String strType3, String strNumber3, String strDistance3,
                             String strHarvest3, String strArea4, String strSubArea4,
                             String strCate4, String strType4, String strNumber4,
                             String strDistance4, String strHarvest4) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_bigarea, strBigArea);
        objContentValues.put(column_area1, strArea1);
        objContentValues.put(column_subarea1, strSubArea1);
        objContentValues.put(column_cate1, strCate1);
        objContentValues.put(column_type1, strType1);
        objContentValues.put(column_number1, strNumber1);
        objContentValues.put(column_distance1, strDistance1);
        objContentValues.put(column_harvest1, strHarvest1);

        objContentValues.put(column_area2, strArea2);
        objContentValues.put(column_subarea2, strSubArea2);
        objContentValues.put(column_cate2, strCate2);
        objContentValues.put(column_type2, strType2);
        objContentValues.put(column_number2, strNumber2);
        objContentValues.put(column_distance2, strDistance2);
        objContentValues.put(column_harvest2, strHarvest2);

        objContentValues.put(column_area3, strArea3);
        objContentValues.put(column_subarea3, strSubArea3);
        objContentValues.put(column_cate3, strCate3);
        objContentValues.put(column_type3, strType3);
        objContentValues.put(column_number3, strNumber3);
        objContentValues.put(column_distance3, strDistance3);
        objContentValues.put(column_harvest3, strHarvest3);

        objContentValues.put(column_area4, strArea4);
        objContentValues.put(column_subarea4, strSubArea4);
        objContentValues.put(column_cate4, strCate4);
        objContentValues.put(column_type4, strType4);
        objContentValues.put(column_number4, strNumber4);
        objContentValues.put(column_distance4, strDistance4);
        objContentValues.put(column_harvest4, strHarvest4);

        return writeSqLiteDatabase.insert(design_TABLE, null, objContentValues);
    } // addNewUser


} // Main Class