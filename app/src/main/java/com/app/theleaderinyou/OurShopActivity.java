package com.app.theleaderinyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class OurShopActivity extends AppCompatActivity {
Toolbar toolbar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_shop);
        toolbar1 = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar1);
    }
}
