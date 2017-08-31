package com.example.francisco.w5d3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import timber.log.Timber;

public class TimberDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Timber.plant(new Timber.DebugTree(){
            //Add the line number to the tag
            @Override
            protected String createStackElementTag(StackTraceElement element){
                return super.createStackElementTag(element) + ":" + element.getLineNumber();
            }
        });

        Timber.d("Hello");
        Timber.v("Log");
    }
}
