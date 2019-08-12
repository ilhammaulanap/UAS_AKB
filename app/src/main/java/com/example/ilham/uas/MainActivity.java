package com.example.ilham.uas;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

//Nama  : Ilham Maulana Pratama
//NIM   : 10116335
//KLS   : IF 8
//TGL   : 3 Agustus 2019
public class MainActivity extends AppCompatActivity {
    private int waktu_loading=3000;
    //3000=3detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading lansung ke home
                Intent home=new Intent(MainActivity.this, WelcomeActivity.class);
                startActivity(home);
                finish();
            }
        },waktu_loading);
    }
}
