package Mainmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.appmonan.Menutab;
import com.example.appmonan.R;
import Apapter.SliderAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager mSliViewPager ;
    private LinearLayout mDotLayout ;

    private TextView[] mDots ;
    private SliderAdapter sliderAdapter ;
    private Button next ;
    private Button back ;
    private int dem ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSliViewPager = (ViewPager) findViewById(R.id.sildeViewPager) ;
        mDotLayout = (LinearLayout) findViewById(R.id.dotsLayout) ;
        sliderAdapter = new SliderAdapter(this) ;
        mSliViewPager.setAdapter(sliderAdapter);
        next = (Button) findViewById(R.id.next) ;
        back = (Button) findViewById(R.id.back) ;
        Themnut(0 );
        mSliViewPager.addOnPageChangeListener(viewListener);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSliViewPager.setCurrentItem(dem - 1);

            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(dem==mDots.length-1){
                   screen();
               }else {
                   mSliViewPager.setCurrentItem(dem +1);
               }
            }
        });

    }
    public void screen (){
        Intent intent = new Intent(this , Menutab.class);
        startActivity(intent);
    }

    public void Themnut(int position){
        mDots = new TextView[3] ;
        mDotLayout.removeAllViews();
        for(int i = 0 ; i < mDots.length ; i++){
            mDots[i] = new TextView(this) ;
            mDots[i].setText(Html.fromHtml("&#8226;"));
            mDots[i].setTextSize(45);
            mDots[i].setTextColor(getResources().getColor(R.color.colorTransparentWhite));

            mDotLayout.addView(mDots[i]);
        }
        if(mDots.length > 0){
            mDots[position].setTextColor(getResources().getColor(R.color.mau));
        }

    }
    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            Themnut(position);
            dem = position ;
            if(position == 0){
                back.setVisibility(View.INVISIBLE);
                next.setEnabled(true);
                back.setEnabled(false);
                next.setText("Next");
                back.setText("");

            }else if (position == mDots.length - 1){
                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);
                next.setText("Finish");
                back.setText("Back");

            }else {
                next.setEnabled(true);
                back.setEnabled(true);
                back.setVisibility(View.VISIBLE);

                next.setText("Next");
                back.setText("Back");

            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}
