package com.jimmy.androidhub.Tutorials_Activitry.Tutorials_Android_Introduction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/23/2018.
 */

public class Android_History_Versions extends AppCompatActivity {

        TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_history_versions);
        setTitle("History And Versions");

        t1 = findViewById(R.id.text2);
        t2 = findViewById(R.id.text4);

        t1.setText("=> The history and versions of android are interesting to know. The code names of android ranges from A to J currently, such as Aestro, Blender, Cupcake, Donut, Eclair, Froyo, Gingerbread, Honeycomb, Ice Cream Sandwitch, Jelly Bean, KitKat and Lollipop. Let's understand the android history in a sequence.\n" +
                "\n" +
                "1) Initially, Andy Rubin founded Android Incorporation in Palo Alto, California, United States in October, 2003.\n" +
                "\n" +
                "2) In 17th August 2005, Google acquired android Incorporation. Since then, it is in the subsidiary of Google Incorporation.\n" +
                "\n" +
                "3) The key employees of Android Incorporation are Andy Rubin, Rich Miner, Chris White and Nick Sears.\n" +
                "\n" +
                "4) Originally intended for camera but shifted to smart phones later because of low market for camera only.\n" +
                "\n" +
                "5) Android is the nick name of Andy Rubin given by coworkers because of his love to robots.\n" +
                "\n" +
                "6) In 2007, Google announces the development of android OS.\n" +
                "\n" +
                "7) In 2008, HTC launched the first android mobile.");

        t2.setText("=> The version history of the Android mobile operating system began with the public release of the Android beta in November 5, 2007. The first commercial version, Android 1.0, was released in September 2008. Android is continually developed by Google and the Open Handset Alliance, and it has seen a number of updates to its base operating system since the initial release.");
    }
}
