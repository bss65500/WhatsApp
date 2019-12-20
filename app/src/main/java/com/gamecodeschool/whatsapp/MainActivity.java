package com.gamecodeschool.whatsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private PageFragmentAdapter myPageFragmentAdapter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myTabLayout = findViewById(R.id.sliding_tabs);
        myTabLayout.setupWithViewPager(myViewPager);



        myViewPager = findViewById(R.id.viewpager);
        myPageFragmentAdapter = new PageFragmentAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(myPageFragmentAdapter);












/*
        // Получаем ViewPager и устанавливаем в него адаптер
        ViewPager viewPager = findViewById(R.id.viewpager);
        FragmentPagerAdapter adapter =new FragmentPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);

        // Передаём ViewPager в TabLayout
        TabLayout tabLayout = findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);
        */

    }
}
