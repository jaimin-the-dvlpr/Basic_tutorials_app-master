package com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Relative extends AppCompatActivity {

    TextView j1,j2,j3,j4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative);
        setTitle("Relative Layout");

        j1 = findViewById(R.id.li3);
        j2 = findViewById(R.id.li5);


        j1.setText("1\t\n" +
                "android:id\n" +
                "\n" +
                "=> This is the ID which uniquely identifies the layout.\n" +
                "\n" +
                "2\t\n" +
                "android:gravity\n" +
                "\n" +
                "=> This specifies how an object should position its content, on both the X and Y axes. Possible values are top, bottom, left, right, center, center_vertical, center_horizontal etc.\n" +
                "\n" +
                "3\t\n" +
                "android:ignoreGravity\n" +
                "\n" +
                "=> This indicates what view should not be affected by gravity.");

        j2.setText("1\t\n" +
                "android:layout_above\n" +
                "\n" +
                "=> Positions the bottom edge of this view above the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\"\n" +
                "\n" +
                "2\t\n" +
                "android:layout_alignBottom\n" +
                "\n" +
                "=> Makes the bottom edge of this view match the bottom edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "3\t\n" +
                "android:layout_alignLeft\n" +
                "\n" +
                "=> Makes the left edge of this view match the left edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "4\t\n" +
                "android:layout_alignParentBottom\n" +
                "\n" +
                "=> If true, makes the bottom edge of this view match the bottom edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "5\t\n" +
                "android:layout_alignParentEnd\n" +
                "\n" +
                "=> If true, makes the end edge of this view match the end edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "6\t\n" +
                "android:layout_alignParentLeft\n" +
                "\n" +
                "=> If true, makes the left edge of this view match the left edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "7\t\n" +
                "android:layout_alignParentRight\n" +
                "\n" +
                "=> If true, makes the right edge of this view match the right edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "8\t\n" +
                "android:layout_alignParentStart\n" +
                "\n" +
                "=> If true, makes the start edge of this view match the start edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "9\t\n" +
                "android:layout_alignParentTop\n" +
                "\n" +
                "=> If true, makes the top edge of this view match the top edge of the parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "10\t\n" +
                "android:layout_alignRight\n" +
                "\n" +
                "=> Makes the right edge of this view match the right edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "11\t\n" +
                "android:layout_alignStart\n" +
                "\n" +
                "=> Makes the start edge of this view match the start edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "12\t\n" +
                "android:layout_alignTop\n" +
                "\n" +
                "=> Makes the top edge of this view match the top edge of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "13\t\n" +
                "android:layout_below\n" +
                "\n" +
                "=> Positions the top edge of this view below the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "14\t\n" +
                "android:layout_centerHorizontal\n" +
                "\n" +
                "=> If true, centers this child horizontally within its parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "15\t\n" +
                "android:layout_centerInParent\n" +
                "\n" +
                "=> If true, centers this child horizontally and vertically within its parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "16\t\n" +
                "android:layout_centerVertical\n" +
                "\n" +
                "=> If true, centers this child vertically within its parent. Must be a boolean value, either \"true\" or \"false\".\n" +
                "\n" +
                "17\t\n" +
                "android:layout_toEndOf\n" +
                "\n" +
                "=> Positions the start edge of this view to the end of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "18\t\n" +
                "android:layout_toLeftOf\n" +
                "\n" +
                "=> Positions the right edge of this view to the left of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "19\t\n" +
                "android:layout_toRightOf\n" +
                "\n" +
                "=> Positions the left edge of this view to the right of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".\n" +
                "\n" +
                "20\t\n" +
                "android:layout_toStartOf\n" +
                "\n" +
                "=> Positions the end edge of this view to the start of the given anchor view ID and must be a reference to another resource, in the form \"@[+][package:]type:name\".");
    }
}
