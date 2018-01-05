package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class EleventhActivity extends AppCompatActivity {

    int score7 = 0;
    String name7 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleventh);


        Bundle tenthActivity = getIntent().getExtras();
        String name = tenthActivity.getString("Name");
        int score = tenthActivity.getInt("Score");
        score7 = score;
        name7 = name;


        TextView nextQuestion7 = (TextView) findViewById(R.id.next_question_seven);

        nextQuestion7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent eleventhActivity = new Intent(EleventhActivity.this, TwelfthActivity.class);
                eleventhActivity.putExtra("Name", name7);

                if (score7 == 0) {

                    eleventhActivity.putExtra("Score", 0);
                    startActivity(eleventhActivity);
                }

                if (score7 == 1) {

                    eleventhActivity.putExtra("Score", 1);
                    startActivity(eleventhActivity);
                }

                if (score7 == 2) {

                    eleventhActivity.putExtra("Score", 2);
                    startActivity(eleventhActivity);
                }

                if (score7 == 3) {

                    eleventhActivity.putExtra("Score", 3);
                    startActivity(eleventhActivity);
                }

                if (score7 == 4) {

                    eleventhActivity.putExtra("Score", 4);
                    startActivity(eleventhActivity);
                }

                if (score7 == 5) {

                    eleventhActivity.putExtra("Score", 5);
                    startActivity(eleventhActivity);
                }

                if (score7 == 6) {

                    eleventhActivity.putExtra("Score", 6);
                    startActivity(eleventhActivity);
                }

                if (score7 == 7) {

                    eleventhActivity.putExtra("Score", 7);
                    startActivity(eleventhActivity);
                }

                if (score7 == 8) {

                    eleventhActivity.putExtra("Score", 8);
                    startActivity(eleventhActivity);
                }

                if (score7 == 9) {

                    eleventhActivity.putExtra("Score", 9);
                    startActivity(eleventhActivity);
                }

                if (score7 == 10) {

                    eleventhActivity.putExtra("Score", 10);
                    startActivity(eleventhActivity);
                }

            }
        });


    }


    public void submitSeven(View view) {

        MediaPlayer seventhQuestion;
        seventhQuestion = MediaPlayer.create(this, R.raw.button_click);
        seventhQuestion.start();


        RadioButton questionSevenOne = (RadioButton) findViewById(R.id.answerSevenOne_button);
        boolean question7_1 = questionSevenOne.isChecked();

        RadioButton questionSevenTwo = (RadioButton) findViewById(R.id.answerSevenTwo_button);
        boolean question7_2 = questionSevenTwo.isChecked();

        RadioButton questionSevenThree = (RadioButton) findViewById(R.id.answerSevenThree_button);
        boolean question7_3 = questionSevenThree.isChecked();

        RadioButton questionSevenFour = (RadioButton) findViewById(R.id.answerSevenFour_button);
        boolean question7_4 = questionSevenFour.isChecked();

        int finalScore7 = calculateScore7(question7_1, question7_2, question7_3, question7_4, score7);
        score7 = finalScore7;

        TextView summarySeven = (TextView) findViewById(R.id.summary_seven);
        summarySeven.setText(getString(R.string.your_score_is) + " " + finalScore7 + ".");

    }

    private int calculateScore7(boolean question7_1, boolean question7_2, boolean question7_3, boolean question7_4, int score7) {

        if (score7 == 10) {
            return (score7);
        }

        if (question7_1) {

            score7 = score7;
        }

        if (question7_2) {

            score7 += 1;
        }

        if (question7_3) {

            score7 = score7;
        }

        if (question7_4) {

            score7 = score7;
        }

        return (score7);
    }


}
