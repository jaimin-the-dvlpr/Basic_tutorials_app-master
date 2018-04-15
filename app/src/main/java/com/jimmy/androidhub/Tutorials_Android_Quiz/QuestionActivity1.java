package com.jimmy.androidhub.Tutorials_Android_Quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jimmy.androidhub.R;

import java.util.List;

/**
 * Created by Jaimin_Patel on 2/21/2018.
 */

public class QuestionActivity1 extends Activity {
    List<Question> quesList;
    int score = 0;
    int qid = 0;
    Question currentQ;
    TextView txtQuestion, times, scored;
    Button button1, button2, button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_quiz);
        QuizHelper db = new QuizHelper(this); // my question bank class
        quesList = db.getAllQuestions(); // this will fetch all quetonall questions
        currentQ = quesList.get(qid); // the current question
        txtQuestion = (TextView) findViewById(R.id.txtQuestion);
        times = (TextView) findViewById(R.id.timers);
        times.setText("");
// the textview in which the question will be displayed
// the three buttons,
// the idea is to set the text of three buttons with the options from question bank
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
// the textview in which score will be displayed
        scored = (TextView) findViewById(R.id.score);

// method which will set the things up for our game
        setQuestionView();
// button click listeners
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// passing the button text to other method
// to check whether the anser is correct or not
// same for all three buttons
                getAnswer(button1.getText().toString());
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button2.getText().toString());
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getAnswer(button3.getText().toString());
            }
        });
    }
    public void getAnswer(String AnswerString) {
        if (currentQ.getANSWER().equals(AnswerString)) {
// if conditions matches increase the int (score) by 1
// and set the text of the score view
            score++;
            scored.setText("Score : " + score);
        } else {
// if unlucky start activity and finish the game
            Intent intent = new Intent(QuestionActivity1.this,
                    ResultActivity.class);
// passing the int value
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }
        if (qid < 20) {
// if questions are not over then do this
            currentQ = quesList.get(qid);
            setQuestionView();
        } else {
// if over do this
            Intent intent = new Intent(QuestionActivity1.this,
                    ResultActivity.class);
            Bundle b = new Bundle();
            b.putInt("score", score); // Your score
            intent.putExtras(b); // Put your score to your next
            startActivity(intent);
            finish();
        }
    }

    private void setQuestionView() {
// the method which will put all things together
        txtQuestion.setText(currentQ.getQUESTION());
        button1.setText(currentQ.getOPTA());
        button2.setText(currentQ.getOPTB());
        button3.setText(currentQ.getOPTC());
        qid++;
    }
}
