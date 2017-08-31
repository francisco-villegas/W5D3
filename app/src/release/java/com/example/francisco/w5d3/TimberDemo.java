package com.example.francisco.w5d3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import timber.log.Timber;

public class TimberDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Release mode
        Timber.plant(new ReleaseTree());

        Timber.d("Hello");
        Timber.v("Log");
    }
}
