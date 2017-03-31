package com.example.csaenz.hungrysf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by csaenz on 3/29/2017.
 */

public class AsianFragment extends Fragment {

    public AsianFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate fragment xml
        View rootView = inflater.inflate(R.layout.fragments, container, false);

        // Bind recycler view to variable
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerView);

        // Create Array list for adapter
        ArrayList<Restaurant> restaurantsList = new ArrayList();

        // Populate Array with Static Data
        restaurantsList.add(0, new Restaurant(
                getString(R.string.asian_rest_one_name),
                getString(R.string.asian_rest_one_location),
                R.drawable.asian_rest_one_image));
        restaurantsList.add(1, new Restaurant(
                getString(R.string.asian_rest_two_name),
                getString(R.string.asian_rest_two_location),
                R.drawable.asian_rest_two_image));
        restaurantsList.add(2, new Restaurant(
                getString(R.string.asian_rest_three_name),
                getString(R.string.asian_rest_three_location),
                R.drawable.asian_rest_three_image));
        restaurantsList.add(3, new Restaurant(
                getString(R.string.asian_rest_four_name),
                getString(R.string.asian_rest_four_location),
                R.drawable.asian_rest_four_image));

        // Create instance of adapter
        RecycleViewAdapter adapter = new RecycleViewAdapter(getActivity(), restaurantsList);

        // Set adapter to recycler view
        recyclerView.setAdapter(adapter);

        // Configure Layout for recycler view
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Return view
        return rootView;
    }
}
