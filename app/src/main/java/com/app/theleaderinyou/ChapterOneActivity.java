package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class ChapterOneActivity extends AppCompatActivity {
    WebView webview;
    int textSize;
     int diff =5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_one);

        webview = (WebView)findViewById(R.id.webview);

        webview.loadUrl("file:///android_asset/chapter_one.html");
        webview.getSettings().setJavaScriptEnabled(true);

        setTitle("FINDING THE LEADER IN YOU");

    }
    //adding menus

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       getMenuInflater().inflate(R.menu.introduction_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

   // @Override
   /* public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.zoomin){
            textSize = diff*50;
            webview.getSettings().setTextZoom(textSize);
        }else if(id==R.id.zoomout){
            webview.getSettings().setTextZoom(diff/50);
    }return true;
    }*/
}
