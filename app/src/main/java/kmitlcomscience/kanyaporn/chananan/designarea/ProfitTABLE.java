package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 11/2/2559.
 */
public class ProfitTABLE {

    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String profit_TABLE = "profitTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_area1 = "Area1";
    public static final String column_type1 = "Type1";
    public static final String column_number1 = "Number1";
    public static final String column_profitPeriod1 = "ProfitPeriod1";
    public static final String column_EstimatedProfit1 = "EstimatedProfit1";

    public static final String column_area2 = "Area2";
    public static final String column_type2 = "Type2";
    public static final String column_number2 = "Number2";
    public static final String column_profitPeriod2 = "ProfitPeriod2";
    public static final String column_EstimatedProfit2 = "EstimatedProfit2";

    public static final String column_area3 = "Area3";
    public static final String column_type3 = "Type3";
    public static final String column_number3 = "Number3";
    public static final String column_profitPeriod3 = "ProfitPeriod3";
    public static final String column_EstimatedProfit3 = "EstimatedProfit3";

    public static final String column_area4 = "Area4";
    public static final String column_type4 = "Type4";
    public static final String column_number4 = "Number4";
    public static final String column_profitPeriod4 = "ProfitPeriod4";
    public static final String column_EstimatedProfit4 = "EstimatedProfit4";

    public ProfitTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor



    public long addNewProfit(String strUser,
                           String strArea1, String strType1, String strNumber1, String strProfitPeriod1, String strEstimatedProfit1,
                           String strArea2, String strType2, String strNumber2, String strProfitPeriod2, String strEstimatedProfit2,
                           String strArea3, String strType3, String strNumber3, String strProfitPeriod3, String strEstimatedProfit3,
                           String strArea4, String strType4, String strNumber4, String strProfitPeriod4, String strEstimatedProfit4) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_area1, strArea1);
        objContentValues.put(column_type1, strType1);
        objContentValues.put(column_number1, strNumber1);
        objContentValues.put(column_profitPeriod1, strProfitPeriod1);
        objContentValues.put(column_EstimatedProfit1, strEstimatedProfit1);

        objContentValues.put(column_area2, strArea2);
        objContentValues.put(column_type2, strType2);
        objContentValues.put(column_number2, strNumber2);
        objContentValues.put(column_profitPeriod2, strProfitPeriod2);
        objContentValues.put(column_EstimatedProfit2, strEstimatedProfit2);

        objContentValues.put(column_area3, strArea3);
        objContentValues.put(column_type3, strType3);
        objContentValues.put(column_number3, strNumber3);
        objContentValues.put(column_profitPeriod3, strProfitPeriod3);
        objContentValues.put(column_EstimatedProfit3, strEstimatedProfit3);

        objContentValues.put(column_area4, strArea4);
        objContentValues.put(column_type4, strType4);
        objContentValues.put(column_number4, strNumber4);
        objContentValues.put(column_profitPeriod4, strProfitPeriod4);
        objContentValues.put(column_EstimatedProfit4, strEstimatedProfit4);


        return writeSqLiteDatabase.insert(profit_TABLE, null, objContentValues);
    } // addNewUser

} // Main Class