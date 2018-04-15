package com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Linear extends AppCompatActivity {

    TextView j1,j2,j3,j4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);
        setTitle("Linear Layout");

        j1 = findViewById(R.id.li3);

        j1.setText("1\t\n" +
                "android:id\n" +
                "\n" +
                "=> This is the ID which uniquely identifies the layout.\n" +
                "\n" +
                "2\t\n" +
                "android:baselineAligned\n" +
                "\n" +
                "=> This must be a boolean value, either \"true\" or \"false\" and prevents the layout from aligning its children's baselines.\n" +
                "\n" +
                "3\t\n" +
                "android:baselineAlignedChildIndex\n" +
                "\n" +
                "=> When a linear layout is part of another layout that is baseline aligned, it can specify which of its children to baseline align.\n" +
                "\n" +
                "4\t\n" +
                "android:divider\n" +
                "\n" +
                "=> This is drawable to use as a vertical divider between buttons. You use a color value, in the form of \"#rgb\", \"#argb\", \"#rrggbb\", or \"#aarrggbb\".\n" +
                "\n" +
                "5\t\n" +
                "android:gravity\n" +
                "\n" +
                "=> This specifies how an object should position its content, on both the X and Y axes. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.\n" +
                "\n" +
                "6\t\n" +
                "android:orientation\n" +
                "\n" +
                "=> This specifies the direction of arrangement and you will use \"horizontal\" for a row, \"vertical\" for a column. The default is horizontal.\n" +
                "\n" +
                "7\t\n" +
                "android:weightSum\n" +
                "\n" +
                "=> Sum up of child weight");


    }
}
