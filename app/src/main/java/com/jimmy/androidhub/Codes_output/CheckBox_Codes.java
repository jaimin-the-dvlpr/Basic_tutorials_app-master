package com.jimmy.androidhub.Codes_output;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/28/2018.
 */

public class CheckBox_Codes extends AppCompatActivity {

    CheckBox check;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox_codes);

      Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        check = findViewById(R.id.checkBox);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                String text = "You selected: ";
                if (isChecked){
                    text = "Checked";
                }else
                    text = "unchecked";
                Toast.makeText(CheckBox_Codes.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}