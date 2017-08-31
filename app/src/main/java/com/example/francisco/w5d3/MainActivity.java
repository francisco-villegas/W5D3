package com.example.francisco.w5d3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.tv1)
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        UseTinder();

        Intent intent = getIntent();
        if (intent.getStringExtra("key") != null)
            tv1.setText(getIntent().getStringExtra("key"));

    }

    private void UseTinder() {
        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree() {
                //Add the line number to the tag
                @Override
                protected String createStackElementTag(StackTraceElement element) {
                    return super.createStackElementTag(element) + ":" + element.getLineNumber();
                }
            });

        }

        //DEBUG
        Timber.d("Hello");

        //VERBOSE
        Timber.v("Log");
    }

    @OnClick({R.id.btnScanCode})
    public void OnClick(View view) {
        Timber.d("Clicked");

        Intent intent = new Intent(this, SimpleScannerActivity.class);
        startActivity(intent);

    }

}
