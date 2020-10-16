package com.example.windows10.yukmasak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private static final int durasi_splash_ms=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new  Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,ResepDanDiary.class);
                MainActivity.this.startActivity(i);
                MainActivity.this.finish();
            }
        }, durasi_splash_ms);
    }


    //mengarahkan pada layout resep dan diary
//    public void next(View view) {
//
//        Intent inte = new Intent(MainActivity.this, ResepDanDiary.class);
//        startActivity(inte);
//    }
}
