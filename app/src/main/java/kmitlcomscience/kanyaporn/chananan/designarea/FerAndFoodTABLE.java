package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 11/2/2559.
 */
public class FerAndFoodTABLE {

    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String FerAndFood_TABLE = "FerAndFoodTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_area1 = "Area1";
    public static final String column_type1 = "Type1";
    public static final String column_number1 = "Number1";
    public static final String column_ratioNo1_1 = "RatioNo1_1";
    public static final String column_ratioNo1_2 = "RatioNo1_2";
    public static final String column_ratioNo1_3 = "RatioNo1_3";
    public static final String column_ratioNo1_4 = "RatioNo1_4";
    public static final String column_ratioNo1_5 = "RatioNo1_5";

    public static final String column_area2 = "Area2";
    public static final String column_type2 = "Type2";
    public static final String column_number2 = "Number2";
    public static final String column_ratioNo2_1 = "RatioNo2_1";
    public static final String column_ratioNo2_2 = "RatioNo2_2";
    public static final String column_ratioNo2_3 = "RatioNo2_3";
    public static final String column_ratioNo2_4 = "RatioNo2_4";
    public static final String column_ratioNo2_5 = "RatioNo2_5";

    public static final String column_area3 = "Area3";
    public static final String column_type3 = "Type3";
    public static final String column_number3 = "Number3";
    public static final String column_ratioNo3_1 = "RatioNo3_1";
    public static final String column_ratioNo3_2 = "RatioNo3_2";
    public static final String column_ratioNo3_3 = "RatioNo3_3";
    public static final String column_ratioNo3_4 = "RatioNo3_4";
    public static final String column_ratioNo3_5 = "RatioNo3_5";

    public static final String column_area4 = "Area4";
    public static final String column_type4 = "Type4";
    public static final String column_number4 = "Number4";
    public static final String column_ratioNo4_1 = "RatioNo4_1";
    public static final String column_ratioNo4_2 = "RatioNo4_2";
    public static final String column_ratioNo4_3 = "RatioNo4_3";
    public static final String column_ratioNo4_4 = "RatioNo4_4";
    public static final String column_ratioNo4_5 = "RatioNo4_5";


    public FerAndFoodTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor



    public long addNewFerAndFood(String strUser,
                                 String strArea1, String strType1, String strNumber1, String strRatioNo1_1, String strRatioNo1_2, String strRatioNo1_3, String strRatioNo1_4, String strRatioNo1_5,
                                 String strArea2, String strType2, String strNumber2, String strRatioNo2_1, String strRatioNo2_2, String strRatioNo2_3, String strRatioNo2_4, String strRatioNo2_5,
                                 String strArea3, String strType3, String strNumber3, String strRatioNo3_1, String strRatioNo3_2, String strRatioNo3_3, String strRatioNo3_4, String strRatioNo3_5,
                                 String strArea4, String strType4, String strNumber4, String strRatioNo4_1, String strRatioNo4_2, String strRatioNo4_3, String strRatioNo4_4, String strRatioNo4_5) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_area1, strArea1);
        objContentValues.put(column_type1, strType1);
        objContentValues.put(column_number1, strNumber1);
        objContentValues.put(column_ratioNo1_1, strRatioNo1_1);
        objContentValues.put(column_ratioNo1_2, strRatioNo1_2);
        objContentValues.put(column_ratioNo1_3, strRatioNo1_3);
        objContentValues.put(column_ratioNo1_4, strRatioNo1_4);
        objContentValues.put(column_ratioNo1_5, strRatioNo1_5);

        objContentValues.put(column_area2, strArea2);
        objContentValues.put(column_type2, strType2);
        objContentValues.put(column_number2, strNumber2);
        objContentValues.put(column_ratioNo2_1, strRatioNo2_1);
        objContentValues.put(column_ratioNo2_2, strRatioNo2_2);
        objContentValues.put(column_ratioNo2_3, strRatioNo2_3);
        objContentValues.put(column_ratioNo2_4, strRatioNo2_4);
        objContentValues.put(column_ratioNo2_5, strRatioNo2_5);

        objContentValues.put(column_area3, strArea3);
        objContentValues.put(column_type3, strType3);
        objContentValues.put(column_number3, strNumber3);
        objContentValues.put(column_ratioNo3_1, strRatioNo3_1);
        objContentValues.put(column_ratioNo3_2, strRatioNo3_2);
        objContentValues.put(column_ratioNo3_3, strRatioNo3_3);
        objContentValues.put(column_ratioNo3_4, strRatioNo3_4);
        objContentValues.put(column_ratioNo3_5, strRatioNo3_5);

        objContentValues.put(column_area4, strArea4);
        objContentValues.put(column_type4, strType4);
        objContentValues.put(column_number4, strNumber4);
        objContentValues.put(column_ratioNo4_1, strRatioNo4_1);
        objContentValues.put(column_ratioNo4_2, strRatioNo4_2);
        objContentValues.put(column_ratioNo4_3, strRatioNo4_3);
        objContentValues.put(column_ratioNo4_4, strRatioNo4_4);
        objContentValues.put(column_ratioNo4_5, strRatioNo4_5);

        return writeSqLiteDatabase.insert(FerAndFood_TABLE, null, objContentValues);
    } // addNewUser

} // Main Class
