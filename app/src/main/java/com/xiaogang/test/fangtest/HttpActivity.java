package com.xiaogang.test.fangtest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import javax.inject.Inject;

public class HttpActivity extends AppCompatActivity {

    @Inject
    OkhttpClient okhttpClient;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http);
        DaggerHttpActivityComponent.create().inject(this);

        Toast.makeText(this,"aaa"+ okhttpClient.hashCode(),Toast.LENGTH_LONG).show();


//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                throw new NullPointerException("toolbar can not be null");
//            }
//        },2000);

    }
}
