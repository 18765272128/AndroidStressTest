package bob.wintec.cn.androidstresstest;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by adc on 2018/9/19.
 */

public class DatebaseHelper extends SQLiteOpenHelper {
    private Context mContext;
    public static final String CREATE_TABLE = "create table info ("
                + "id integer primary key autoincrement, "
                + "item text unique, "
                + "boolvalue real, "
                + "numvalue integer, "
                + "strvalue text)";

    public DatebaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
         super(context, name, factory, version);
         mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
