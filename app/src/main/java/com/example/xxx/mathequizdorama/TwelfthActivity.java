package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class TwelfthActivity extends AppCompatActivity {

    int score8 = 0;
    String name8 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twelfth);

        Bundle eleventhActivity = getIntent().getExtras();
        String name = eleventhActivity.getString("Name");
        int score = eleventhActivity.getInt("Score");
        score8 = score;
        name8 = name;


        TextView nextQuestion8 = (TextView) findViewById(R.id.next_question_eight);

        nextQuestion8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent twelfthActivity = new Intent(TwelfthActivity.this, ThirteenActivity.class);
                twelfthActivity.putExtra("Name", name8);

                if (score8 == 0) {

                    twelfthActivity.putExtra("Score", 0);
                    startActivity(twelfthActivity);
                }

                if (score8 == 1) {

                    twelfthActivity.putExtra("Score", 1);
                    startActivity(twelfthActivity);
                }

                if (score8 == 2) {

                    twelfthActivity.putExtra("Score", 2);
                    startActivity(twelfthActivity);
                }

                if (score8 == 3) {

                    twelfthActivity.putExtra("Score", 3);
                    startActivity(twelfthActivity);
                }

                if (score8 == 4) {

                    twelfthActivity.putExtra("Score", 4);
                    startActivity(twelfthActivity);
                }

                if (score8 == 5) {

                    twelfthActivity.putExtra("Score", 5);
                    startActivity(twelfthActivity);
                }

                if (score8 == 6) {

                    twelfthActivity.putExtra("Score", 6);
                    startActivity(twelfthActivity);
                }

                if (score8 == 7) {

                    twelfthActivity.putExtra("Score", 7);
                    startActivity(twelfthActivity);
                }

                if (score8 == 8) {

                    twelfthActivity.putExtra("Score", 8);
                    startActivity(twelfthActivity);
                }

                if (score8 == 9) {

                    twelfthActivity.putExtra("Score", 9);
                    startActivity(twelfthActivity);
                }

                if (score8 == 10) {

                    twelfthActivity.putExtra("Score", 10);
                    startActivity(twelfthActivity);
                }

                if (score8 == 11) {

                    twelfthActivity.putExtra("Score", 11);
                    startActivity(twelfthActivity);
                }

            }
        });


    }

    public void submitEight(View view) {

        MediaPlayer eighthQuestion;
        eighthQuestion = MediaPlayer.create(this, R.raw.button_click);
        eighthQuestion.start();


        RadioButton questionEightOne = (RadioButton) findViewById(R.id.answerEightOne_button);
        boolean question8_1 = questionEightOne.isChecked();


        RadioButton questionEightTwo = (RadioButton) findViewById(R.id.answerEightTwo_button);
        boolean question8_2 = questionEightTwo.isChecked();


        RadioButton questionEightThree = (RadioButton) findViewById(R.id.answerEightThree_button);
        boolean question8_3 = questionEightThree.isChecked();


        RadioButton questionEightFour = (RadioButton) findViewById(R.id.answerEightFour_button);
        boolean question8_4 = questionEightFour.isChecked();

        int finalScore8 = calculateScore8(question8_1, question8_2, question8_3, question8_4, score8);
        score8 = finalScore8;

        TextView summaryEight = (TextView) findViewById(R.id.summary_eight);
        summaryEight.setText(getString(R.string.your_score_is) + " " + finalScore8 + ".");

    }


    private int calculateScore8(boolean question8_1, boolean question8_2, boolean question8_3, boolean question8_4, int score8) {

        if (score8 == 11) {
            return (score8);
        }

        if (question8_1) {
            score8 = score8;
        }

        if (question8_2) {
            score8 = score8;
        }

        if (question8_3) {
            score8 = score8;
        }

        if (question8_4) {
            score8 += 1;
        }

        return (score8);

    }

}
