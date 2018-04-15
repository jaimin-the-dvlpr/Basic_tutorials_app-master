package com.jimmy.androidhub.Fragment;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.jimmy.androidhub.Favourite_DataBase.DBManager;
import com.jimmy.androidhub.Favourite_DataBase.DatabaseHelper;
import com.jimmy.androidhub.R;
import com.jimmy.androidhub.Tab_Layout_Codes;

/**
 * Created by Jaimin_Patel on 2/22/2018.
 */

public class FavouriteFragment extends android.support.v4.app.Fragment {


    private DBManager dbManager;
    final String[] from = new String[] { DatabaseHelper._ID,
            DatabaseHelper.Name, DatabaseHelper.Image};

    ListView listview;
    Toolbar toolbar;
    FloatingActionButton fab;
    private SimpleCursorAdapter adapter;
    final int[] to = new int[] { R.id.iddemo, R.id.name, R.id.imaged };


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.favourite_fragment, container, false);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getActivity().setTitle("Favourite");

        toolbar = getView().findViewById(R.id.toolfav); // get the reference of Toolbar
        AppCompatActivity activity = (AppCompatActivity) getActivity();
        activity.setSupportActionBar(toolbar);
        dbManager = new DBManager(getActivity());
        dbManager.open();

        Cursor cursor = dbManager.getAllCode();
        cursor.moveToNext();

        listview = (ListView) getView().findViewById(R.id.favlistfrag);
        listview.setEmptyView(getView().findViewById(R.id.empty));
        adapter = new SimpleCursorAdapter(getActivity(), R.layout.row_item, cursor, from, to, 0);
        adapter.notifyDataSetChanged();
        listview.setAdapter(adapter);



       listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

               Toast.makeText(getActivity(), ""+ i, Toast.LENGTH_SHORT).show();
           }
       });

    }
}