package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class NinthActivity extends AppCompatActivity {

    int score6 = 0;
    String name6 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninth);

        Bundle eighthActivity = getIntent().getExtras();
        String name = eighthActivity.getString("Name");
        int score = eighthActivity.getInt("Score");
        score6 = score;
        name6 = name;


        TextView nextQuestion6 = (TextView) findViewById(R.id.next_question_six);

        nextQuestion6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ninthActivity = new Intent(NinthActivity.this, TenthActivity.class);
                ninthActivity.putExtra("Name", name6);

                if (score6 == 0) {

                    ninthActivity.putExtra("Score", 0);
                    startActivity(ninthActivity);
                }

                if (score6 == 1) {

                    ninthActivity.putExtra("Score", 1);
                    startActivity(ninthActivity);
                }

                if (score6 == 2) {

                    ninthActivity.putExtra("Score", 2);
                    startActivity(ninthActivity);
                }

                if (score6 == 3) {

                    ninthActivity.putExtra("Score", 3);
                    startActivity(ninthActivity);
                }

                if (score6 == 4) {

                    ninthActivity.putExtra("Score", 4);
                    startActivity(ninthActivity);
                }

                if (score6 == 5) {

                    ninthActivity.putExtra("Score", 5);
                    startActivity(ninthActivity);
                }

                if (score6 == 6) {

                    ninthActivity.putExtra("Score", 6);
                    startActivity(ninthActivity);
                }

                if (score6 == 7) {

                    ninthActivity.putExtra("Score", 7);
                    startActivity(ninthActivity);
                }

                if (score6 == 8) {

                    ninthActivity.putExtra("Score", 8);
                    startActivity(ninthActivity);
                }

                if (score6 == 9) {

                    ninthActivity.putExtra("Score", 9);
                    startActivity(ninthActivity);
                }

            }
        });

    }


    public void submitSix(View view) {

        MediaPlayer sixthQuestion;
        sixthQuestion = MediaPlayer.create(this, R.raw.button_click);
        sixthQuestion.start();


        CheckBox questionSixOne = (CheckBox) findViewById(R.id.answerSixOne_check_box);
        boolean question6_1 = questionSixOne.isChecked();

        CheckBox questionSixTwo = (CheckBox) findViewById(R.id.answerSixTwo_check_box);
        boolean question6_2 = questionSixTwo.isChecked();

        CheckBox questionSixThree = (CheckBox) findViewById(R.id.answerSixThree_check_box);
        boolean question6_3 = questionSixThree.isChecked();

        CheckBox questionSixFour = (CheckBox) findViewById(R.id.answerSixFour_check_box);
        boolean question6_4 = questionSixFour.isChecked();


        int finalScore6 = calculateScore6(question6_1, question6_2, question6_3, question6_4, score6);
        score6 = finalScore6;

        TextView summarySix = (TextView) findViewById(R.id.summary_six);
        summarySix.setText(getString(R.string.your_score_is) + " " + finalScore6 + ".");

    }


    private int calculateScore6(boolean question6_1, boolean question6_2, boolean question6_3, boolean question6_4, int score6) {

        if (question6_1) {
            score6 = score6;
        }

        if (question6_2) {
            score6 = score6;
        }

        if (question6_3) {
            score6 = score6;
        }

        if (question6_4) {
            score6 += 1;
        }

        return (score6);
    }

}
