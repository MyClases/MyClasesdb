package com.example.user.myclases.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.myclases.data.MyProfeContract.MyProfeEntry;
/**
 * Created by Diego on 22-10-2014.
 */
public class MyProfeDbHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    public static final String DATABASE_NAME="MyProfe.db";

    public MyProfeDbHelper(Context context) {
        super(context, DATABASE_NAME,null, DATABASE_VERSION);
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {


    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        final String createMyProfeSql = String.format("CREATE TABLE %s (" +
                        "%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                        "%s TEXT NOT NULL, " +
                        "%s TEXT NOT NULL, " +
                        "UNIQUE (%s ) ON CONFLICT IGNORE);",
                MyProfeEntry.TABLE_NAME, MyProfeEntry._ID,
                MyProfeEntry.COLUMN_NAME, MyProfeEntry.COLUMN_PHONE,
                MyProfeEntry.COLUMN_PHONE);

        db.execSQL(createMyProfeSql);

    }
    public boolean insertar( String nombre, String telefono) {
        if (nombre.equals("")){return false;}
        if(telefono.equals("")){return false;}
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("INSERT INTO MyProfe VALUES ( null, "+
                nombre+" , "+ telefono +")" );
        db.close();
        return true;
    }


}
