package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 11/2/2559.
 */
public class CostTABLE {

    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String cost_TABLE = "costTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_area1 = "Area1";
    public static final String column_type1 = "Type1";
    public static final String column_number1 = "Number1";
    public static final String column_typeCost1 = "TypeCost1";
    public static final String column_ferAndFoodCost1 = "FerAndFoodCost1";

    public static final String column_area2 = "Area2";
    public static final String column_type2 = "Type2";
    public static final String column_number2 = "Number2";
    public static final String column_typeCost2 = "TypeCost2";
    public static final String column_ferAndFoodCost2 = "FerAndFoodCost2";

    public static final String column_area3 = "Area3";
    public static final String column_type3 = "Type3";
    public static final String column_number3 = "Number3";
    public static final String column_typeCost3 = "TypeCost3";
    public static final String column_ferAndFoodCost3 = "FerAndFoodCost3";

    public static final String column_area4 = "Area4";
    public static final String column_type4 = "Type4";
    public static final String column_number4 = "Number4";
    public static final String column_typeCost4 = "TypeCost4";
    public static final String column_ferAndFoodCost4 = "FerAndFoodCost4";

    public CostTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor



    public long addNewCost(String strUser,
                           String strArea1, String strType1, String strNumber1, String strTypeCost1, String strFerAndFoodCost1,
                           String strArea2, String strType2, String strNumber2, String strTypeCost2, String strFerAndFoodCost2,
                           String strArea3, String strType3, String strNumber3, String strTypeCost3, String strFerAndFoodCost3,
                           String strArea4, String strType4, String strNumber4, String strTypeCost4, String strFerAndFoodCost4) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_area1, strArea1);
        objContentValues.put(column_type1, strType1);
        objContentValues.put(column_number1, strNumber1);
        objContentValues.put(column_typeCost1, strTypeCost1);
        objContentValues.put(column_ferAndFoodCost1, strFerAndFoodCost1);

        objContentValues.put(column_area2, strArea2);
        objContentValues.put(column_type2, strType2);
        objContentValues.put(column_number2, strNumber2);
        objContentValues.put(column_typeCost2, strTypeCost2);
        objContentValues.put(column_ferAndFoodCost2, strFerAndFoodCost2);

        objContentValues.put(column_area3, strArea3);
        objContentValues.put(column_type3, strType3);
        objContentValues.put(column_number3, strNumber3);
        objContentValues.put(column_typeCost3, strTypeCost3);
        objContentValues.put(column_ferAndFoodCost3, strFerAndFoodCost3);

        objContentValues.put(column_area4, strArea4);
        objContentValues.put(column_type4, strType4);
        objContentValues.put(column_number4, strNumber4);
        objContentValues.put(column_typeCost4, strTypeCost4);
        objContentValues.put(column_ferAndFoodCost4, strFerAndFoodCost4);


        return writeSqLiteDatabase.insert(cost_TABLE, null, objContentValues);
    } // addNewUser

} // Main Class

