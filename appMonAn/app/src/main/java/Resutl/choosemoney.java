package Resutl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.lang.Thread ;
import java.lang.InterruptedException ;

import com.example.appmonan.R;
import com.spark.submitbutton.SubmitButton;

public class choosemoney extends AppCompatActivity implements View.OnClickListener {
    private SubmitButton submit_button ;
    private Handler setDelay ;
    private Runnable starDelay ;
    private CardView money1 , money2 , money3 ;
    private int choose ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosemoney);
        submit_button = (SubmitButton) findViewById(R.id.submitmoney);
        setDelay = new Handler() ;
        money1 = (CardView) findViewById(R.id.money1);
        money2 = (CardView) findViewById(R.id.money2);
        money3 = (CardView) findViewById(R.id.money3);
        money1.setOnClickListener(this);
        money2.setOnClickListener(this);
        money3.setOnClickListener(this);
        submit_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                starDelay = new Runnable() {
                    @Override
                    public void run() {
                        openresutl();
                    }
                };
                setDelay.postDelayed(starDelay, 400) ;
            }
        });


    }
    public void openresutl(){

        Intent intent = new Intent(this , priceandmake.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.money1 :  money1.setVisibility(View.VISIBLE);
                                money2.setVisibility(View.INVISIBLE);
                                money3.setVisibility(View.INVISIBLE);
                                choose = 1 ;
                                break;
            case R.id.money2 : money1.setVisibility(View.INVISIBLE);
                                money3.setVisibility(View.INVISIBLE);
                                choose = 2 ;
                                break;
            case R.id.money3 : money1.setVisibility(View.INVISIBLE);
                                money2.setVisibility(View.INVISIBLE);
                                 choose = 3 ;
                                 break;
        }

    }
}
