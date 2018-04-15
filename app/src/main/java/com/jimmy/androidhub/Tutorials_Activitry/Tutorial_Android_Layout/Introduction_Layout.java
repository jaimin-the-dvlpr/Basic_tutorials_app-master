package com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Introduction_Layout extends AppCompatActivity {

    TextView j1,j2,j3,j4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_introduction_layout);
        setTitle("Introduction Layouts");
       Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        j1 = findViewById(R.id.t1);
        j2 = findViewById(R.id.t2);
        j3 = findViewById(R.id.t4);

        j1.setText("The basic building block for user interface is a View object which is created from the View class and occupies a rectangular area on the screen and is responsible for drawing and event handling. View is the base class for widgets, which are used to create interactive UI components like buttons, text fields, etc.\n" +
                "\n" +
                "The ViewGroup is a subclass of View and provides invisible container that hold other Views or other ViewGroups and define their layout properties.\n" +
                "\n" +
                "At third level we have different layouts which are subclasses of ViewGroup class and a typical layout defines the visual structure for an Android user interface and can be created either at run time using View/ViewGroup objects or you can declare your layout using simple XML file main_layout.xml which is located in the res/layout folder of your project.");

    j2.setText("This tutorial is more about creating your GUI based on layouts defined in XML file. A layout may contain any type of widgets such as buttons, labels, textboxes, and so on.");

    j3.setText("1.\tLinear Layout\n" +
            "=> LinearLayout is a view group that aligns all children in a single direction, vertically or horizontally.\n" +
            "\n" +
            "2\tRelative Layout\n" +
            "=> RelativeLayout is a view group that displays child views in relative positions.\n" +
            "\n" +
            "3\tTable Layout\n" +
            "=> TableLayout is a view that groups views into rows and columns.\n" +
            "\n" +
            "4\tAbsolute Layout\n" +
            "=> AbsoluteLayout enables you to specify the exact location of its children.\n" +
            "\n" +
            "5\tFrame Layout\n" +
            "=> The FrameLayout is a placeholder on screen that you can use to display a single view.\n" +
            "\n" +
            "6\tGrid View\n" +
            "=> GridView is a ViewGroup that displays items in a two-dimensional, scrollable grid.");

        }
    }