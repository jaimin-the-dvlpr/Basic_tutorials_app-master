package com.jimmy.androidhub;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import com.jimmy.androidhub.Codes_java.Activity_Main_java;
import com.jimmy.androidhub.Codes_java.Main_Activity_java;
import com.jimmy.androidhub.Codes_java.fragment3;
import com.jimmy.androidhub.Favourite_DataBase.DBManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Tab_Layout_Codes extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    DBManager dbO;
    android.support.v7.widget.Toolbar toolbar;
    String isChecked;
    String name = "";
    int image = 0;
    TextView txt;
    Button favcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout_codes);

        toolbar = findViewById(R.id.tooltabcodelay);
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        txt = findViewById(R.id.main);

        favcode = findViewById(R.id.favfavfav);

        viewPager = findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        int cnt = getIntent().getIntExtra("count",0);
        String header[] = getIntent().getStringArrayExtra("header");

        if (cnt == 2) {
            adapter.addFragment(new Main_Activity_java(), header[0]);
            adapter.addFragment(new Activity_Main_java(), header[1]);
        } else if (cnt == 3) {
            adapter.addFragment(new Main_Activity_java(), header[0]);
            adapter.addFragment(new Activity_Main_java(), header[1]);
            adapter.addFragment(new fragment3(), header[2]);
        } else {
            adapter.addFragment(new Main_Activity_java(), "Main_Actity.kt");
            adapter.addFragment(new Activity_Main_java(), "activity_main.xml");

        }
        //   adapter.addFragment(new ThreeFragment(), "THREE");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.codes_menu, menu);
        return true;
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.black) {

            viewPager.setBackgroundColor(Color.parseColor("#090909"));
        }

        if (id == R.id.blue) {
            viewPager.setBackgroundColor(Color.parseColor("#FF3355FF"));
        }

        if (id == R.id.green) {
            viewPager.setBackgroundColor(Color.parseColor("#FF00AC0B"));
        }
        //noinspection SimplifiableIfStatement
        Drawable drawable = item.getIcon();
//
        return super.onOptionsItemSelected(item);
    }
}
