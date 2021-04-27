package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewpager;
    private TabItem tabitem1, tabitem2, tabitem3;
    public PagerAdapter pageadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabitem1 = (TabItem) findViewById(R.id.Tab1);
        tabitem2 = (TabItem) findViewById(R.id.Tab2);
        tabitem3 = (TabItem) findViewById(R.id.Tab3);
        viewpager = findViewById(R.id.viewpager);

        pageadapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewpager.setAdapter(pageadapter);


        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
               viewpager.setCurrentItem(tab.getPosition());
               if (tab.getPosition() == 0) {
                   pageadapter.notifyDataSetChanged();
               } else if (tab.getPosition() == 1) {
                   pageadapter.notifyDataSetChanged();
                    }  else if(tab.getPosition() == 2) {
                        pageadapter.notifyDataSetChanged();
               }


            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));


    }
}