package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ThirdActivity extends AppCompatActivity {

    int score1 = 0;
    String name2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Bundle secondActivity = getIntent().getExtras();
        String name = secondActivity.getString("Name");
        name2 = name;


        TextView nextQuestion1 = (TextView) findViewById(R.id.next_question_one);

        nextQuestion1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent thirdActivity = new Intent(ThirdActivity.this, FourthActivity.class);
                thirdActivity.putExtra("Name", name2);

                if (score1 == 0) {
                    thirdActivity.putExtra("Score", 0);
                    startActivity(thirdActivity);
                }

                if (score1 == 1) {
                    thirdActivity.putExtra("Score", 1);
                    startActivity(thirdActivity);
                }
            }
        });


    }


    public void submitOne(View view) {

        MediaPlayer firstQuestion;
        firstQuestion = MediaPlayer.create(this, R.raw.button_click);
        firstQuestion.start();

        EditText answerOne = (EditText) findViewById(R.id.answerOne_edit_text);
        String answer1 = answerOne.getText().toString();

        int finalScore1 = calculateScore1(answer1, score1);
        score1 = finalScore1;


        TextView summaryOne = (TextView) findViewById(R.id.summary_one);
        summaryOne.setText(getString(R.string.your_score_is) + " " + finalScore1 + ".");

    }


    private int calculateScore1(String answer1, int score1) {

        if (score1 == 1) {
            return (score1);
        }

        if (answer1.equals("Gauss")) {
            score1 += 1;
        } else {
            score1 = score1;
        }


        return (score1);

    }


}
