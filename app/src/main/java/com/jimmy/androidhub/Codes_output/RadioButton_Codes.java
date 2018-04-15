package com.jimmy.androidhub.Codes_output;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/28/2018.
 */

public class RadioButton_Codes extends AppCompatActivity {

    RadioGroup rg;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.radiobutton_codes);
        Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        rg = findViewById(R.id.radioGroup);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                String text = "You selected: ";

                if (R.id.radioMale == i){
                    text = "Male";
                }else
                    text = "Female";
                Toast.makeText(RadioButton_Codes.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}