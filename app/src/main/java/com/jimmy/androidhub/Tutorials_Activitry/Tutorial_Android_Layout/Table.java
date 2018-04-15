package com.jimmy.androidhub.Tutorials_Activitry.Tutorial_Android_Layout;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/25/2018.
 */

public class Table extends AppCompatActivity {

    TextView j1,j2,j3,j4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table);
        setTitle("Table Layout");

        j1 = findViewById(R.id.li3);
        j2 = findViewById(R.id.li1);

       j1.setText("1\t\n" +
               "android:id\n" +
               "\n" +
               "=> This is the ID which uniquely identifies the layout.\n" +
               "\n" +
               "2\t\n" +
               "android:collapseColumns\n" +
               "\n" +
               "=> This specifies the zero-based index of the columns to collapse. The column indices must be separated by a comma: 1, 2, 5.\n" +
               "\n" +
               "3\t\n" +
               "android:shrinkColumns\n" +
               "\n" +
               "=>The zero-based index of the columns to shrink. The column indices must be separated by a comma: 1, 2, 5.\n" +
               "\n" +
               "4\t\n" +
               "android:stretchColumns\n" +
               "\n" +
               "=> The zero-based index of the columns to stretch. The column indices must be separated by a comma: 1, 2, 5.");

       j2.setText("Android TableLayout going to be arranged groups of views into rows and columns. You will use the <TableRow> element to build a row in the table. Each row has zero or more cells; each cell can hold one View object.\n" +
               "\n" +
               "TableLayout containers do not display border lines for their rows, columns, or cells.");

    }
}
