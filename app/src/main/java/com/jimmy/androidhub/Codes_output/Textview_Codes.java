package com.jimmy.androidhub.Codes_output;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/28/2018.
 */

public class Textview_Codes extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview_codes);

        Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        text = findViewById(R.id.textViewcodes);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Textview_Codes.this, "Good Morning", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
