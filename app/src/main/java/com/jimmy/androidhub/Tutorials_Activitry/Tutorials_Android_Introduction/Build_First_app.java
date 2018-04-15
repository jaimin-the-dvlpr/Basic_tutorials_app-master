package com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Build_First_app extends AppCompatActivity {

        TextView a,b,c,d,e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.build_first_app);
        setTitle("Building Your First App");

      Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        a = findViewById(R.id.b2);
        b = findViewById(R.id.b3);
        c = findViewById(R.id.b4);
        d = findViewById(R.id.b6);
        e = findViewById(R.id.b7);


        a.setText("1. In the Welcome to Android Studio window, click Start a new Android Studio project.");
        b.setText("2. In the Create New Project window, enter the following values:\n" +
                "=> Application Name: \"My First App\"\n" +
                "=> Company Domain: \"example.com\"\n" +
                "=> You might want to change the project location. Also, if you want to write a Kotlin app, check the Include Kotlin support checkbox. Leave the other options as they are.");

        c.setText("3. In the Target Android Devices screen, keep the default values and click Next.");
        d.setText("4. In the Add an Activity to Mobile screen, select Empty Activity and click Next.");
        e.setText("5. In the Configure Activity screen, keep the default values and click Finish.");
    }
}

