package ayushi.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ayushi.R;
import ayushi.util.Utils;
import ayushi.view.activities.ECartHomeActivity;

/**
 * Created by lenovo on 27-01-2017.
 */

public class ActiviytySelectionFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.frag_activity_selection,container,false);
        Button purchaseButton=(Button)view.findViewById(R.id.purchaseButton);
        Button sellButton=(Button)view.findViewById(R.id.sellButton);
        purchaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.switchFragmentWithAnimation(
                        R.id.frag_container,
                        new ProductOverviewFragment(),
                        ((ECartHomeActivity) getActivity()), null,
                        Utils.AnimationType.SLIDE_LEFT);
            }
        });
        sellButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.switchFragmentWithAnimation(
                        R.id.frag_container,
                        new SaleOverviewFragment(),
                        ((ECartHomeActivity) getActivity()), null,
                        Utils.AnimationType.SLIDE_LEFT);

            }
        });
        return  view;
    }
}
