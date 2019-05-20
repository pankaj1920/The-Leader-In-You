package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChapterNineActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_nine);
        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/chapter_nine.html");
        webView.getSettings().setJavaScriptEnabled(true);
        setTitle("Recgnition,Praise And Reward");
    }
}
