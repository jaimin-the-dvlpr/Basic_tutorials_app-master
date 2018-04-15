package com.jimmy.androidhub.Codes_java;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Activity_Main_java extends Fragment {


    TextView t;
    public Activity_Main_java() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tab_activity_main, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        t = getView().findViewById(R.id.activitydemo);
        t.setText(getActivity().getIntent().getStringExtra("activity"));

    }
}
