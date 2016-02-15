package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by User on 8/2/2559.
 */
public class UserTABLE {

    //Explicit
    private MyOpenHelper objMySQLiteHelper;
    private SQLiteDatabase writeSqLiteDatabase, readSqLiteDatabase;

    public static final String user_TABLE = "userTABLE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_password = "Password";
    public static final String column_email = "Email";

    public UserTABLE(Context context) {
        objMySQLiteHelper = new MyOpenHelper(context);
        writeSqLiteDatabase = objMySQLiteHelper.getWritableDatabase();
        readSqLiteDatabase = objMySQLiteHelper.getReadableDatabase();

    } // Constructor

    public String[] searchUser(String strUser) {

        try {

            String[] resultStrings = null;
            Cursor objCursor = readSqLiteDatabase.query(user_TABLE,
                    new String[]{column_id, column_user, column_password, column_email},
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

    public long addNewUser(String strUser, String strPassword, String strEmail) {
        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_user, strUser);
        objContentValues.put(column_password, strPassword);
        objContentValues.put(column_email, strEmail);

        return writeSqLiteDatabase.insert(user_TABLE, null, objContentValues);
    } // addNewUser

} // Main Class
