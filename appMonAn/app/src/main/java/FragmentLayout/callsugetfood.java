package FragmentLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.appmonan.R;

import Resutl.choosemoney;
import Resutl.priceandmake;

public class callsugetfood extends Fragment implements View.OnClickListener {
    private CardView food1 , food2 , food3 , food4 , food5 , food6 ;
    public int check ;

    public callsugetfood(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_sugget_food, container , false) ;
        food1 = (CardView) v.findViewById(R.id.food1);
        food2 = (CardView) v.findViewById(R.id.food2);
        food3 = (CardView) v.findViewById(R.id.food3) ;
        food4 = (CardView) v.findViewById(R.id.food4) ;
        food5 = (CardView) v.findViewById(R.id.food5);
        food6 = (CardView) v.findViewById(R.id.food6) ;
        food1.setOnClickListener(this);
        food2.setOnClickListener(this);
        food3.setOnClickListener(this);
        food4.setOnClickListener(this);
        food5.setOnClickListener(this);
        food6.setOnClickListener(this);
        return v ;
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.food1: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 1 ;
            case R.id.food2: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 2 ;
                break;
            case R.id.food3: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 3 ;
                break;
            case R.id.food4: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 4 ;
                break;
            case R.id.food5: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 5 ;
                break;
            case R.id.food6: startActivity(new Intent(getActivity(), choosemoney.class));
                check = 6 ;
                break;


        }
    }
}
