package com.example.user.myclases.data;

import android.provider.BaseColumns;

/**
 * Created by Diego on 22-10-2014.
 */
public class MyProfeContract {
    public static final class MyProfeEntry implements BaseColumns {

        public static final String TABLE_NAME="MyProfe";

        public static final String COLUMN_NAME="nombre";

        public static final String COLUMN_PHONE="telefono";
    }

}
