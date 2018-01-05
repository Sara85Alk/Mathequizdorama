package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class SeventhActivity extends AppCompatActivity {

    int score4 = 0;
    String name4 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);

        Bundle sixthActivity = getIntent().getExtras();
        String name = sixthActivity.getString("Name");
        int score = sixthActivity.getInt("Score");
        name4 = name;
        score4 = score;



        TextView nextQuestion4 = (TextView) findViewById(R.id.next_question_four);

        nextQuestion4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent seventhActivity = new Intent(SeventhActivity.this, EighthActivity.class);
                seventhActivity.putExtra("Name", name4);

                if (score4 == 0) {

                    seventhActivity.putExtra("Score", 0);
                    startActivity(seventhActivity);
                }

                if (score4 == 1) {

                    seventhActivity.putExtra("Score", 1);
                    startActivity(seventhActivity);
                }

                if (score4 == 2) {

                    seventhActivity.putExtra("Score", 2);
                    startActivity(seventhActivity);
                }

                if (score4 == 3) {

                    seventhActivity.putExtra("Score", 3);
                    startActivity(seventhActivity);
                }

                if (score4 == 4) {

                    seventhActivity.putExtra("Score", 4);
                    startActivity(seventhActivity);
                }

                if (score4 == 5) {

                    seventhActivity.putExtra("Score", 5);
                    startActivity(seventhActivity);
                }
            }
        });


    }


    public void submitFour(View view) {

        MediaPlayer fourthQuestion;
        fourthQuestion = MediaPlayer.create(this, R.raw.button_click);
        fourthQuestion.start();


        CheckBox questionFourOne = (CheckBox) findViewById(R.id.answerFourOne_check_box);
        boolean question4_1 = questionFourOne.isChecked();

        CheckBox questionFourTwo = (CheckBox) findViewById(R.id.answerFourTwo_check_box);
        boolean question4_2 = questionFourTwo.isChecked();

        CheckBox questionFourThree = (CheckBox) findViewById(R.id.answerFourThree_check_box);
        boolean question4_3 = questionFourThree.isChecked();

        CheckBox questionFourFour = (CheckBox) findViewById(R.id.answerFourFour_check_box);
        boolean question4_4 = questionFourFour.isChecked();

        int finalScore4 = calculateScore4(question4_1, question4_2, question4_3, question4_4, score4);
        score4 = finalScore4;

        TextView summaryFour = (TextView) findViewById(R.id.summary_four);
        summaryFour.setText(getString(R.string.your_score_is) + " " + finalScore4 + ".");

    }

    private int calculateScore4(boolean question4_1, boolean question4_2, boolean question4_3, boolean question4_4, int score4) {

        if (score4 == 5) {
            return (score4);
        }


        if (question4_1) {
            score4 += 1;
        }

        if (question4_2) {
            score4 = score4;
        }


        if (question4_3) {
            score4 = score4;
        }

        if (question4_4) {
            score4 += 1;
        }

        return (score4);
    }


}

