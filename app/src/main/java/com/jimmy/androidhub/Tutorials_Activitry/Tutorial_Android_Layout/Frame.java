package com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Frame extends AppCompatActivity {

    TextView j1,j2,j3,j4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame);
        setTitle("Frame Layout");

        j1 = findViewById(R.id.li3);

       j1.setText("1\t\n" +
               "android:id\n" +
               "\n" +
               "=> This is the ID which uniquely identifies the layout.\n" +
               "\n" +
               "2\t\n" +
               "android:foreground\n" +
               "\n" +
               "=> This defines the drawable to draw over the content and possible values may be a color value, in the form of \"#rgb\", \"#argb\", \"#rrggbb\", or \"#aarrggbb\".\n" +
               "\n" +
               "3\t\n" +
               "android:foregroundGravity\n" +
               "\n" +
               "=> Defines the gravity to apply to the foreground drawable. The gravity defaults to fill. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.\n" +
               "\n" +
               "4\t\n" +
               "android:measureAllChildren\n" +
               "\n" +
               "=> Determines whether to measure all children or just those in the VISIBLE or INVISIBLE state when measuring. Defaults to false.");


    }
}
