package com.example.myapplication.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.myapplication.R;

public class Main2Activity extends AppCompatActivity {


    public static final String URL = "https:/developer.android.com";

    private WebView mWebViewAndroid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initView();
    }

    private void initView() {
        mWebViewAndroid = findViewById(R.id.web_view_android);
        WebSettings webSettings = mWebViewAndroid.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebViewAndroid.loadUrl(URL);
    }
}
