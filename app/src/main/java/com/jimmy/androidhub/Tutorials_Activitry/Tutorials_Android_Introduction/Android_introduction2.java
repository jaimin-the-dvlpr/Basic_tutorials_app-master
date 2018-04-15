package com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/23/2018.
 */

public class Android_introduction2 extends AppCompatActivity {

    TextView t;

    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Android Introduction");
        setContentView(R.layout.tutorial_introduction_tutorial);
       t = findViewById(R.id.intro1);

       img = findViewById(R.id.ads);


       t.setText("=> Android is a stack of software for mobile devices which includes an Operating System, middleware and some key applications. The application executes within its own process and its own instance of Dalvik Virtual Machine. Many Virtual Machines run efficiently by a DVM device. DVM executes Java languages byte code which later transforms into .dex format files.");

        }
    }