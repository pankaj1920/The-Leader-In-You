package com.app.theleaderinyou;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Toolbar toolbar;
    private ShareActionProvider mShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        //Recycler View
        RecyclerView recycle = (RecyclerView)findViewById(R.id.recycle);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this);
        recycle.setLayoutManager(layoutManager);

        //Adding item in recycleview

        ArrayList<Index_item_list> list_item = new ArrayList<>();
        list_item.add(new Index_item_list("0","Introduction"));
        list_item.add(new Index_item_list("1","Finding The Leader In YOU"));
        list_item.add(new Index_item_list("2","Starting To Communicate"));
        list_item.add(new Index_item_list("3","Motivating People"));
        list_item.add(new Index_item_list("4","Expressing Genuine Intrest In Other"));
        list_item.add(new Index_item_list("5","Seeing Things From The Other Person Point Of View"));
        list_item.add(new Index_item_list("6","Listening To Learn"));
        list_item.add(new Index_item_list("7","Teaming Up For Tomorrow"));
        list_item.add(new Index_item_list("8","Respecting The Dignity Of Other"));
        list_item.add(new Index_item_list("9","Recgnition, Praise And Reward"));
        list_item.add(new Index_item_list("10","Handling Mistake, Complaints, And Criticism"));
        list_item.add(new Index_item_list("11","Setting Goals"));
        list_item.add(new Index_item_list("12","Focus and Discipline"));
        list_item.add(new Index_item_list("13","Achieving Balance"));
        list_item.add(new Index_item_list("14","Creating A Positive Mental Attitude"));
        list_item.add(new Index_item_list("15","Learning Not To Worry"));
        list_item.add(new Index_item_list("16","The Power Of Enthusiasm"));
        list_item.add(new Index_item_list("17","Conclusion"));

        //creating obj for adapter
        IndexBookAdapter obj = new IndexBookAdapter(list_item);
        recycle.setAdapter(obj);

    }
    //Creating Menu Option

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.app_related_info_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.Share:
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String url = "http://bohraconsolidate.com";
                sharingIntent.putExtra(Intent.EXTRA_SUBJECT, "link");
                sharingIntent.putExtra(Intent.EXTRA_TEXT, url);
                startActivity(sharingIntent);
                break;
            case R.id.cart:
                Intent intent = new Intent(MainActivity.this,OurShopActivity.class);
                startActivity(intent);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
