package com.jisuanke.qrato.jisuanke_android;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Timer;
import android.os.Handler;
import java.util.logging.LogRecord;

public class hello_activity extends AppCompatActivity {
    private ImageView iv=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_hello_activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent =new Intent(hello_activity.this,MainActivity.class);
                hello_activity.this.startActivity(mainIntent);
                hello_activity.this.finish();
            }
        },3000);

    }

}
