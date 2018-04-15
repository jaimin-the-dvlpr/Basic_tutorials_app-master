package com.jimmy.androidhub.Codes_output;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/28/2018.
 */

public class Edittext_Codes extends AppCompatActivity {

  EditText edittext;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edittext_codes);

        Toolbar tool = findViewById(R.id.tool);
        setSupportActionBar(tool);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        edittext = findViewById(R.id.editText);
      edittext.addTextChangedListener(new TextWatcher() {


          @Override
          public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

          }

          @Override
          public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            String  s = edittext.getText().toString();
              Toast.makeText(Edittext_Codes.this, s, Toast.LENGTH_SHORT).show();
          }

          @Override
          public void afterTextChanged(Editable editable) {

          }
      });

        }
    }