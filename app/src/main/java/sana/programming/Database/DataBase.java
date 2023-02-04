package sana.programming.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBase extends SQLiteOpenHelper {

    private static final String DATABEASE_NAME = "notememo.db";
    private static final int DATABASEE_VIRSION = 1;

    public DataBase(Context context) {
        super(context,DATABEASE_NAME,null,DATABASEE_VIRSION);
    }

    @Override
    public void onCreate(SQLiteDatabase Database){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CREATE TABLE notememo(");
        stringBuilder.append("_id INTEGER PRIMARY KEY,");
        stringBuilder.append("name TEXT,");
        stringBuilder.append("note TEXT");
        stringBuilder.append(");");
        String sql = stringBuilder.toString();

        Database.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
