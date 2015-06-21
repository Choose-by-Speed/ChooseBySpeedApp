package com.epam.hack.choosebyspeed.android.choosebyspeedapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.epam.hack.choosebyspeed.android.domain.Delivery;
import com.epam.hack.choosebyspeed.android.domain.OrdersDas;


//import com.epam.hack.choosebyspeed.android.choosebyspeedapp.dummy.DummyContent;

/**
 * A fragment representing a single Order detail screen.
 * This fragment is either contained in a {@link OrderListActivity}
 * in two-pane mode (on tablets) or a {@link OrderDetailActivity}
 * on handsets.
 */
public class OrderDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private Delivery mDelivery;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public OrderDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mDelivery = OrdersDas.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_order_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (mDelivery != null) {
            ((TextView) rootView.findViewById(R.id.order_name)).setText(mDelivery.getCategoryProviderString());
            ((TextView) rootView.findViewById(R.id.order_phone)).setText(mDelivery.provider.phoneNumber);
            ((TextView) rootView.findViewById(R.id.order_time_start)).setText(mDelivery.getTimeStartString());
            ((TextView) rootView.findViewById(R.id.order_time_end)).setText(mDelivery.getTimeEndString());
        }

        return rootView;
    }
}
