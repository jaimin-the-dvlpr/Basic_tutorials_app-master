package com.jimmy.androidhub;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.jimmy.androidhub.Adapter.Codes_Java_Adapter;
import com.jimmy.androidhub.Fragment.CodesFragment;
import com.jimmy.androidhub.Fragment.FavouriteFragment;
import com.jimmy.androidhub.Fragment.HomeFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    private Codes_Java_Adapter myAppAdapter;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mTextMessage = (TextView) findViewById(R.id.message);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, new HomeFragment()).commit();
        }


        CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) navigation.getLayoutParams();
        layoutParams.setBehavior(new BottomNavigationBehavior());




    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.home:
                    fragment = new HomeFragment();
                    loadfragment(fragment);
                    return true;

                case R.id.code:
                    fragment = new CodesFragment();
                    loadfragment(fragment);
                    return true;

                case R.id.favorite:
                    fragment = new FavouriteFragment();
                    loadfragment(fragment);
                    return true;
            }

            return false;
        }

    };
    private void loadfragment(Fragment fragment) {
        // load fragments here..

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}



