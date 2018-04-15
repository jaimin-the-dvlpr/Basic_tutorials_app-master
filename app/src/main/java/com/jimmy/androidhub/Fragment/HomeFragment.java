package com.jimmy.androidhub.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.jimmy.androidhub.Adapter.Tutorials_Adapter;
import com.jimmy.androidhub.Model.Tutorials_Model;
import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Settings_Activitys.About_US_Android;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;


/**
 * Created by PARIN on 1/30/2018.
 */

public class HomeFragment extends android.support.v4.app.Fragment {
    private List<Tutorials_Model> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private Tutorials_Adapter mAdapter;
    CardView card;
    Toolbar toolbar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.home_fragment, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Tutorials");


        toolbar = getView().findViewById(R.id.toolhome); // get the reference of Toolbar
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        recyclerView = (RecyclerView) getView().findViewById(R.id.rv);
        card = getView().findViewById(R.id.card_view);
        mAdapter = new Tutorials_Adapter(movieList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Tutorials_Model tutorial = new Tutorials_Model("Android Introduction", R.drawable.intro);
        movieList.add(tutorial);

        Tutorials_Model layouts = new Tutorials_Model("Android Layouts", R.drawable.layout);
        movieList.add(layouts);
        Tutorials_Model kotlin = new Tutorials_Model("Kotlin for Android Development", R.drawable.kotlinandroid);
        movieList.add(kotlin);

        Tutorials_Model kotlin1 = new Tutorials_Model("Kotlin ServerSide", R.drawable.kotlinserver);
        movieList.add(kotlin1);

        Tutorials_Model tutorial1 = new Tutorials_Model("Android Assignments", R.drawable.assignment_tutorials);
        movieList.add(tutorial1);

        Tutorials_Model tutorial2 = new Tutorials_Model("Android Interview Questions", R.drawable.interview_tutorials);
        movieList.add(tutorial2);

        Tutorials_Model tutorial3 = new Tutorials_Model("Android Quiz", R.drawable.quiz);
        movieList.add(tutorial3);

        mAdapter.notifyDataSetChanged();
    }


        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setHasOptionsMenu(true);

        }

        @Override
        public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            inflater.inflate(R.menu.settings_menu, menu);
            super.onCreateOptionsMenu(menu, inflater);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {

                case R.id.rateus:
                    Intent rateIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + getActivity().getPackageName()));
                    startActivity(rateIntent);
                    return false;
                case R.id.share:
                    Intent sendIntent = new Intent();
                    sendIntent.setAction(Intent.ACTION_SEND);
                    sendIntent.putExtra(Intent.EXTRA_TEXT,
                            "Hey check out my app at: https://drive.google.com/drive/u/1/folders/0B9e9WhouihsHSVdHV3R6YXBHT3c");
                    sendIntent.setType("text/plain");
                    startActivity(sendIntent);
                    return true;

                case R.id.about:
                    Intent intent = new Intent(getActivity(), About_US_Android.class);
                    getActivity().startActivity(intent);
                    return true;

                default:
                    break;
            }

            return false;
        }
    }


