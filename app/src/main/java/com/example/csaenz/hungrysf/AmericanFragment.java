package com.example.csaenz.hungrysf;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by csaenz on 3/29/2017.
 */

public class AmericanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragments, container, false);

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        ArrayList<Restaurant> restaurantsList = new ArrayList();

        restaurantsList.add(0, new Restaurant(
                getString(R.string.american_rest_one_name),
                getString(R.string.american_rest_one_location),
                R.drawable.american_rest_one_image));

        RecycleViewAdapter adapter = new RecycleViewAdapter(getActivity(), restaurantsList);

        recyclerView.setAdapter(adapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
}
