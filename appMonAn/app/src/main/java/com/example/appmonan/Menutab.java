package com.example.appmonan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import Apapter.ViewPaperMenu;
import FragmentLayout.callmainscreen;
import FragmentLayout.callsugetfood;

public class Menutab extends AppCompatActivity {
    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPaperMenu adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menutab);

        tabLayout = (TabLayout) findViewById(R.id.tab_id) ;
        viewPager = (ViewPager) findViewById(R.id.view_id) ;
        adapter = new ViewPaperMenu(getSupportFragmentManager());
        adapter.addFragment(new callmainscreen() , "");
        adapter.addFragment(new callsugetfood() , "");
        adapter.addFragment(new callmainscreen() , "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0) .setIcon(R.drawable.home);
        tabLayout.getTabAt(1).setIcon(R.drawable.sea);
        tabLayout.getTabAt(2).setIcon(R.drawable.favorite);
    }
}
