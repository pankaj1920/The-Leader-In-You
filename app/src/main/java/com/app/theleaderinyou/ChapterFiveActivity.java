package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ChapterFiveActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_five);

        webView = (WebView)findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/chapter_five.html");
        webView.getSettings().setJavaScriptEnabled(true);
        setTitle("SeeingThings From The Other Person Point Of View");
    }
}
