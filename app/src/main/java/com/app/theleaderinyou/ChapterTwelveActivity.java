package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChapterTwelveActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_twelve);

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/chapter_twelve.html");
        webView.getSettings().setJavaScriptEnabled(true);
        setTitle("Focus And Discipline");
    }
}
