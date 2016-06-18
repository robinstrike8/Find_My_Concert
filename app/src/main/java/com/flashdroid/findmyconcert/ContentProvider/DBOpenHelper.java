package com.flashdroid.findmyconcert.ContentProvider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by yashwanth on 8/29/2015.
 */
public class DBOpenHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION=1;

    private static final String TEXT_TYPE="TEXT";
    private static final String INTEGER_TYPE="INTEGER";
    private static final String COMMA=",";

    private static final String CREATE_CONCERT_TABLE ="CREATE TABLE "
            + DBContract.ConcertTable.TABLE_NAME + "("
            + DBContract.ConcertTable.TITLE + TEXT_TYPE + COMMA
            + DBContract.ConcertTable.LINK + TEXT_TYPE +COMMA
            + DBContract.ConcertTable.IMAGELINK + TEXT_TYPE + ")";

    public  static final String DROP_CONCERT_TABLE = "DROP TABLE IF EXISTS"+ DBContract.ConcertTable.TABLE_NAME;

    public DBOpenHelper(Context context) {
        super(context,DBContract.DB_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONCERT_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_CONCERT_TABLE);
        onCreate(db);

    }
}
