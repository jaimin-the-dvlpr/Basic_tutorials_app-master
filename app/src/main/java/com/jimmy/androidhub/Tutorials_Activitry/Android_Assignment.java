package com.jimmy.androidhub.Tutorials_Activitry;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/19/2018.
 */

public class Android_Assignment extends AppCompatActivity {

    TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorials_android_assignment);
        setTitle("Android Assignment");


        t1 = findViewById(R.id.assignment);
        t2 = findViewById(R.id.assignment2);
        t3 = findViewById(R.id.assignment3);
        t4 = findViewById(R.id.assignment4);

        t1.setText("1. What is Layout?\n" +
                "2. Explain Listview in detail.\n" +
                "3. What is Adapter? List down the types of adapter.\n" +
                "4. Explain custom adapter in detail.\n" +
                "5. Explain array adapter in detail.\n" +
                "6. Explain Linear layout with suitable example.\n" +
                "7. Explain Relative layout with suitable example.\n" +
                "8. What is Fragment? Explain use of fragment in detail.\n" +
                "9. Explain floating button in detail with suitable example.\n" +
                "10. What is snack bar? Explain snack bar in detail.");

        t2.setText("1. What is dialog? Explain use of it in detail.\n" +
                "2. Explain Alert dialog in detail with all properties and methods in detail.\n" +
                "3. What is spinner? Explain spinner in detail with all properties and methods in detail.\n" +
                "4. What is Recycler view? Explain Recycle view with proper example.\n" +
                "5. What is card view? Explain card view with suitable example.\n" +
                "6. What is drawer layout? Explain in detail.\n" +
                "7. What is animation? Explain types of tag of animation in detail.\n" +
                "8. What is Map? Explain Map in detail.\n" +
                "9. What is Gridview? Explain Gridview with proper example.\n" +
                "10. What is style?\n" +
                "11. What is theme? Explain style and theme in detail.\n" +
                "12. What is Inflater?");

        t3.setText("1. What is DDMS?\n" +
                "2. Explain shared preferences with proper example.\n" +
                "3. Write a code for call in android? Explain in brief.\n" +
                "4. Write a code for sms in android? Explain in brief.\n" +
                "5. Explain Telephone Manager Class in brief.\n" +
                "6. What is File?\n" +
                "7. How to create a file in android.\n" +
                "8. Explain types of storage in android.\n" +
                "9. What is SQLite?\n" +
                "10. What Content Value? Explain in detail.\n" +
                "11. Explain types of method of SQLite in detail.\n" +
                "12. Explain file and directories in detail.\n" +
                "13. Explain database helper class in detail.");

        t4.setText("1. What is Web service?\n" +
                "2. What is Volley libray?\n" +
                "3. Explain Architecture of Web service in detail.\n" +
                "4. Explain Json parsing with suitable example.\n" +
                "5. Explain JsonArrayRequest, JsonObjectRequest, StringRequest class in detail.\n" +
                "6. What is XML Parsing? Explain XML Parsing with proper example.\n" +
                "7. Explain XmlPullParser class in detail.");
    }
}