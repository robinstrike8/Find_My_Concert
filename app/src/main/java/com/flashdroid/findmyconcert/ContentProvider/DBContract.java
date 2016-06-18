package com.flashdroid.findmyconcert.ContentProvider;

import java.security.PublicKey;

/**
 * Created by yashwanth on 8/29/2015.
 */
public class DBContract {

    public static final String DB_NAME="concert.db";

    public abstract class ConcertTable {

        public static final String TABLE_NAME="concert_table";

        public static final String TITLE="title";
        public static final String LINK="link";
        public static final String IMAGELINK="imagelink";



    }




}
