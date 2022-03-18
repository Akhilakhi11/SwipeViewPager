package com.example.swipeviewpager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import fragments.PageFragment1;
import fragments.PageFragment2;
import fragments.PageFragment3;

public class MainActivity extends AppCompatActivity {

    
    private ViewPagerAdapter viewPagerAdapter;
    private  ViewPager viewPager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.add(new PageFragment1(), "pager1");
        viewPagerAdapter.add(new PageFragment2(), "pager2");
        viewPagerAdapter.add(new PageFragment3(), "pager3");


        viewPager.setAdapter(viewPagerAdapter);

    }

}