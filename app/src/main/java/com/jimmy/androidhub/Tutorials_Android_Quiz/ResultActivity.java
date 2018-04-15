package com.jimmy.androidhub.Tutorials_Android_Quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jimmy.androidhub.MainActivity;
import com.jimmy.androidhub.R;

/**
 * Created by Jaimin_Patel on 2/21/2018.
 */

public class ResultActivity extends Activity {

     Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textResult = (TextView) findViewById(R.id.textResult);
        TextView textscore  = (TextView) findViewById(R.id.textscore);
        btn2 = findViewById(R.id.btn2);
        Bundle b = getIntent().getExtras();
        int score = b.getInt("score");
        textscore.setText(" " + " " + score + " ");

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    public void playagain(View o) {
        Intent intent = new Intent(this, QuestionActivity.class);
        startActivity(intent);
    }


}