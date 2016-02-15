package kmitlcomscience.kanyaporn.chananan.designarea;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 8/2/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper {


    //Explicit ประกาศตัวแปร
    public static final String database_name = "DesignArea.db";//ตัวอื่นจะไม่สามารถเปลี่ยนแปลงได้ เป็นค่าคงที ภายนอกสามารถใช้ได้ด้วย่
    private static final int database_version = 1;
    private  static final String create_user_table = "create table userTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Password text," +
            "Email text);";// ตัวสุดท้ายไม่ต้อง ,
    private static final String create_design_table = "create table designTABLE (" +
            "_id integer primary key," +
            "User text," +
            "BigArea text," +
            "Area1 text," +
            "SubArea1 text," +
            "Cate1 text," +
            "Type1 text," +
            "Number1 text," +
            "Distance1 text," +
            "Harvest1 text," +
            "Area2 text," +
            "SubArea2 text," +
            "Cate2 text," +
            "Type2 text," +
            "Number2 text," +
            "Distance2 text," +
            "Harvest2 text," +
            "Area3 text," +
            "SubArea3 text," +
            "Cate3 text," +
            "Type3 text," +
            "Number3 text," +
            "Distance3 text," +
            "Harvest3 text," +
            "Area4 text," +
            "SubArea4 text," +
            "Cate4 text," +
            "Type4 text," +
            "Number4 text," +
            "Distance4 text," +
            "Harvest4 text);";
    private static final String create_ferandfood_table = "create table ferAndFoodTABLE (" +
            "_id integer primary key, " +
            "User text, " +
            "Area1 text, " +
            "Type1 text, " +
            "Number1 text, " +
            "RatioNo1_1 text, " +
            "RatioNo1_2 text," +
            "RatioNo1_3 text," +
            "RatioNo1_4 text," +
            "RatioNo1_5 text," +
            "Area2 text, " +
            "Type2 text, " +
            "Number2 text, " +
            "RatioNo2_1 text, " +
            "RatioNo2_2 text," +
            "RatioNo2_3 text," +
            "RatioNo2_4 text," +
            "RatioNo2_5 text," +
            "Area3 text, " +
            "Type3 text, " +
            "Number3 text, " +
            "RatioNo3_1 text, " +
            "RatioNo3_2 text," +
            "RatioNo3_3 text," +
            "RatioNo3_4 text," +
            "RatioNo3_5 text," +
            "Area4 text, " +
            "Type4 text, " +
            "Number4 text, " +
            "RatioNo4_1 text, " +
            "RatioNo4_2 text," +
            "RatioNo4_3 text," +
            "RatioNo4_4 text," +
            "RatioNo4_5 text);";
    private static final String create_cost_table = "create table costTABLE (" +
            "_id integer primary key," +
            "User text," +
            "Area1 text," +
            "Type1 text," +
            "Number1 text," +
            "TypeCost1 text," +
            "FerAndFoodCost1 text," +
            "Area2 text," +
            "Type2 text," +
            "Number2 text," +
            "TypeCost2 text," +
            "FerAndFoodCost2 text," +
            "Area3 text," +
            "Type3 text," +
            "Number3 text," +
            "TypeCost3 text," +
            "FerAndFoodCost3 text," +
            "Area4 text," +
            "Type4 text," +
            "Number4 text," +
            "TypeCost4 text," +
            "FerAndFoodCost4 text);";

        private static final String create_profit_table = "create table profitTABLE (" +
                "_id integer primary key," +
                "User text," +
                "Area1 text," +
                "Type1 text," +
                "Number1 text," +
                "ProfitPeriod1 text," +
                "EstimatedProfit1 text," +
                "Area2 text," +
                "Type2 text," +
                "Number2 text," +
                "ProfitPeriod2 text," +
                "EstimatedProfit2 text," +
                "Area3 text," +
                "Type3 text," +
                "Number3 text," +
                "ProfitPeriod3 text," +
                "EstimatedProfit3 text," +
                "Area4 text," +
                "Type4 text," +
                "Number4 text," +
                "ProfitPeriod4 text," +
                "EstimatedProfit4 text);";

        private static final String create_plant_table = "create table PlantTABLE (" +
                "_id integer primary key," +
                "PlantName text," +
                "NatureArea text," +
                "Weather text," +
                "Cost text," +
                "Profit text);";

    public MyOpenHelper(Context context) {//method Constructor ทำงานก่อน
        super(context, database_name, null, database_version);//สร้างท่อ ถ้า version ไม่ตรงจะเรียก method

    }  //Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(create_user_table);
        db.execSQL(create_design_table);
        db.execSQL(create_ferandfood_table);
        db.execSQL(create_cost_table);
        db.execSQL(create_profit_table);
        db.execSQL(create_plant_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}// Main Class