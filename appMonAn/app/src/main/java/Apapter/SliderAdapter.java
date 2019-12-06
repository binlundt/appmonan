package Apapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.appmonan.R;

import java.security.PublicKey;

public class SliderAdapter extends PagerAdapter {

    Context context ;
    LayoutInflater layoutInflater ;
    //Khai báo context để gọi sang main
    public SliderAdapter(Context context){
        this.context = context ;
    }

    public int[] slide_image = {
      R.drawable.m1,
      R.drawable.m2,
      R.drawable.m3
    };


    @Override
    public int getCount() {
        return slide_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout , container , false) ;
        ImageView slideimage = (ImageView) view.findViewById(R.id.slide_image) ;
        slideimage.setImageResource(slide_image[position]);
        container.addView(view);
        return view ;
    }

    @Override
    public void destroyItem( ViewGroup container, int position, Object object) {
         container.removeView((RelativeLayout) object);
    }
}
