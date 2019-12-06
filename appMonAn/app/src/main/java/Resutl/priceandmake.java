package Resutl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.appmonan.R;
import com.google.android.material.tabs.TabLayout;

import Apapter.ViewPaperMenu;

public class priceandmake extends AppCompatActivity {
    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPaperMenu adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_priceandmake);

        tabLayout = (TabLayout) findViewById(R.id.tab_make) ;
        viewPager = (ViewPager) findViewById(R.id.view_make) ;
        adapter = new ViewPaperMenu(getSupportFragmentManager());
        adapter.addFragment(new resutl_price() , "");
        adapter.addFragment(new resutl_make() , "");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0) .setIcon(R.drawable.price);
        tabLayout.getTabAt(1).setIcon(R.drawable.cooking);
    }
}
