package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChapterSixteenActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_sixteen);
        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/chapter_sixteen.html");
        webView.getSettings().setJavaScriptEnabled(true);
        setTitle("Learning Not To Worry");
    }
}
