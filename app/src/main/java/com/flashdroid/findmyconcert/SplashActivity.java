package com.flashdroid.findmyconcert;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Runnable runnable3 =new Runnable() {
            @Override
            public void run() {
                nextActivity();
                finish();
            }
        };

        Handler myhandler = new Handler();
        myhandler.postDelayed(runnable3,3000);


    }

    public  void nextActivity()
    {
        Intent myintent=new Intent(this,MainActivity.class);
        startActivity(myintent);

    }
}
