package com.example.user.myclases;

import android.database.sqlite.SQLiteDatabase;
import android.test.AndroidTestCase;

import com.example.user.myclases.data.MyProfeDbHelper;

/**
 * Created by Diego on 22-10-2014.
 */
public class TestDb extends AndroidTestCase{
    public void testCreateDb() throws Throwable {
        mContext.deleteDatabase(MyProfeDbHelper.DATABASE_NAME);
        SQLiteDatabase db =new MyProfeDbHelper(
            this.mContext).getWritableDatabase();
        assertEquals(true, db.isOpen());
        db.close();
        }
}
