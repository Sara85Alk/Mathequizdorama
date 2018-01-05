package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ThirteenActivity extends AppCompatActivity {

    int score9 = 0;
    String name9 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteen);

        Bundle twelfthActivity = getIntent().getExtras();
        String name = twelfthActivity.getString("Name");
        int score = twelfthActivity.getInt("Score");
        score9 = score;
        name9 = name;

        TextView nextQuestion9 = (TextView) findViewById(R.id.next_question_nine);
        nextQuestion9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirteenActivity = new Intent(ThirteenActivity.this, FourteenActivity.class);
                thirteenActivity.putExtra("Name", name9);

                if (score9 == 0) {

                    thirteenActivity.putExtra("Score", 0);
                    startActivity(thirteenActivity);
                }

                if (score9 == 1) {

                    thirteenActivity.putExtra("Score", 1);
                    startActivity(thirteenActivity);
                }

                if (score9 == 2) {

                    thirteenActivity.putExtra("Score", 2);
                    startActivity(thirteenActivity);
                }

                if (score9 == 3) {

                    thirteenActivity.putExtra("Score", 3);
                    startActivity(thirteenActivity);
                }

                if (score9 == 4) {

                    thirteenActivity.putExtra("Score", 4);
                    startActivity(thirteenActivity);
                }

                if (score9 == 5) {

                    thirteenActivity.putExtra("Score", 5);
                    startActivity(thirteenActivity);
                }

                if (score9 == 6) {

                    thirteenActivity.putExtra("Score", 6);
                    startActivity(thirteenActivity);
                }

                if (score9 == 7) {

                    thirteenActivity.putExtra("Score", 7);
                    startActivity(thirteenActivity);
                }

                if (score9 == 8) {

                    thirteenActivity.putExtra("Score", 8);
                    startActivity(thirteenActivity);
                }

                if (score9 == 9) {

                    thirteenActivity.putExtra("Score", 9);
                    startActivity(thirteenActivity);
                }

                if (score9 == 10) {

                    thirteenActivity.putExtra("Score", 10);
                    startActivity(thirteenActivity);
                }

                if (score9 == 11) {

                    thirteenActivity.putExtra("Score", 11);
                    startActivity(thirteenActivity);
                }

                if (score9 == 12) {

                    thirteenActivity.putExtra("Score", 12);
                    startActivity(thirteenActivity);
                }


            }
        });


    }


    public void submitNine(View view) {

        MediaPlayer ninthQuestion;
        ninthQuestion = MediaPlayer.create(this, R.raw.button_click);
        ninthQuestion.start();


        RadioButton questionNineOne = (RadioButton) findViewById(R.id.answerNineOne_button);
        boolean question9_1 = questionNineOne.isChecked();

        RadioButton questionNineTwo = (RadioButton) findViewById(R.id.answerNineTwo_button);
        boolean question9_2 = questionNineTwo.isChecked();

        RadioButton questionNineThree = (RadioButton) findViewById(R.id.answerNineThree_button);
        boolean question9_3 = questionNineThree.isChecked();

        RadioButton questionNineFour = (RadioButton) findViewById(R.id.answerNineFour_button);
        boolean question9_4 = questionNineFour.isChecked();

        int finalScore9 = calculateScore9(question9_1, question9_2, question9_3, question9_4, score9);
        score9 = finalScore9;

        TextView summaryNine = (TextView) findViewById(R.id.summary_nine);
        summaryNine.setText(getString(R.string.your_score_is) + " " + finalScore9 + ".");

    }

    private int calculateScore9(boolean question9_1, boolean question9_2, boolean question9_3, boolean question9_4, int score9) {

        if (score9 == 12) {
            return (score9);
        }


        if (question9_1) {
            score9 += 1;
        }


        if (question9_2) {
            score9 = score9;
        }

        if (question9_3) {
            score9 = score9;
        }

        if (question9_4) {
            score9 = score9;
        }

        return (score9);
    }

}
