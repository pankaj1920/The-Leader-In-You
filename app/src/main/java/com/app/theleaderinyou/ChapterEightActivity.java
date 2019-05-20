package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChapterEightActivity extends AppCompatActivity {
WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_eight);

        webview = (WebView)findViewById(R.id.webview);
        webview.loadUrl("file:///android_asset/chapter_eight.html");
        webview.getSettings().setJavaScriptEnabled(true);
        setTitle("RESPECTING THE DIGNITY OF OTHERS");
    }
}
