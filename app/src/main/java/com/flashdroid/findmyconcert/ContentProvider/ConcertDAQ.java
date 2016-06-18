package com.flashdroid.findmyconcert.ContentProvider;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yashwanth on 8/30/2015.
 */
public class ConcertDAQ {

    private static ConcertDAQ sInstance=null;


    public  static ConcertDAQ getsInstance() {
        if (sInstance == null) {

            sInstance=new ConcertDAQ();

        }
        return sInstance;

    }

public boolean storeConcerts (Context context, List<String> mNewslist)
{

    try{
    SQLiteDatabase db = new DBOpenHelper(context).getWritableDatabase();
    db.beginTransaction();
    for (String post : mNewslist){
        ContentValues cv=new ContentValues();
        cv.put(DBContract.ConcertTable.TITLE,post.getTitle());
        cv.put(DBContract.ConcertTable.LINK,post.getPermalink());
        cv.put(DBContract.ConcertTable.LINK,post.getThumbnailURL());
        db.insert(DBContract.ConcertTable.TABLE_NAME,null,cv);

    }

    db.setTransactionSuccessful();;
    db.endTransaction();;
    db.close();

    return  true;
}
    catch (Exception e)
    {
    return false;
    }
}



}


