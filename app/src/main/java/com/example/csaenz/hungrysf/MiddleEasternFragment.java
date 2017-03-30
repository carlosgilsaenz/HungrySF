package com.example.csaenz.hungrysf;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by csaenz on 3/29/2017.
 */

public class MiddleEasternFragment extends Fragment{

    public MiddleEasternFragment(){
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragments, container, false);
        return rootView;
    }
}
