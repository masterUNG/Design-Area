package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 14/2/2559.
 */
public class PlantTABLE {
    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String plant_TABLE = "plantTABLE";
    public static final String column_id = "_id";
    public static final String column_plantName = "PlantName";
    public static final String column_natureArea = "NatureArea";
    public static final String column_weather = "Weather";
    public static final String column_cost = "Cost";
    public static final String column_profit = "Profit";

    public PlantTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor

    public String[] searchPlantData(String strNatureArea) {

        try {

            String[] resultStrings = null;
            Cursor objCursor = readSqLiteDatabase.query(plant_TABLE,
                    new String[]{column_id, column_plantName, column_natureArea, column_weather,
                            column_cost, column_profit},
                    column_natureArea + "=?",
                    new String[]{String.valueOf(strNatureArea)},//เอาคำๆไหนไปหา
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

    public long addNewPlant (String strPlantName, String strNatureArea, String strWeather,
                             String strCost, String strProfit) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_plantName, strPlantName);
        objContentValues.put(column_natureArea, strNatureArea);
        objContentValues.put(column_weather, strWeather);
        objContentValues.put(column_cost, strCost);
        objContentValues.put(column_profit, strProfit);

        return writeSqLiteDatabase.insert(plant_TABLE, null, objContentValues);
    } // addNewUser

} // Main Class