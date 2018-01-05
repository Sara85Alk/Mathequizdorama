package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class EighthActivity extends AppCompatActivity {


    int score5 = 0;
    String name5 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eighth);

        Bundle seventhActivity = getIntent().getExtras();
        String name = seventhActivity.getString("Name");
        int score = seventhActivity.getInt("Score");
        score5 = score;
        name5 = name;


        TextView nextQuestion5 = (TextView) findViewById(R.id.next_question_five);


        nextQuestion5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent eighthActivity = new Intent(EighthActivity.this, NinthActivity.class);
                eighthActivity.putExtra("Name", name5);

                if (score5 == 0) {

                    eighthActivity.putExtra("Score", 0);
                    startActivity(eighthActivity);
                }

                if (score5 == 1) {

                    eighthActivity.putExtra("Score", 1);
                    startActivity(eighthActivity);
                }

                if (score5 == 2) {

                    eighthActivity.putExtra("Score", 2);
                    startActivity(eighthActivity);
                }

                if (score5 == 3) {

                    eighthActivity.putExtra("Score", 3);
                    startActivity(eighthActivity);
                }

                if (score5 == 4) {

                    eighthActivity.putExtra("Score", 4);
                    startActivity(eighthActivity);
                }

                if (score5 == 5) {

                    eighthActivity.putExtra("Score", 5);
                    startActivity(eighthActivity);
                }

                if (score5 == 6) {

                    eighthActivity.putExtra("Score", 6);
                    startActivity(eighthActivity);
                }

                if (score5 == 7) {

                    eighthActivity.putExtra("Score", 7);
                    startActivity(eighthActivity);
                }

                if (score5 == 8) {

                    eighthActivity.putExtra("Score", 8);
                    startActivity(eighthActivity);
                }
            }
        });

    }


    public void submitFive(View view) {

        MediaPlayer fifthQuestion;
        fifthQuestion = MediaPlayer.create(this, R.raw.button_click);
        fifthQuestion.start();


        CheckBox questionFiveOne = (CheckBox) findViewById(R.id.answerFiveOne_check_box);
        boolean question5_1 = questionFiveOne.isChecked();

        CheckBox questionFiveTwo = (CheckBox) findViewById(R.id.answerFiveTwo_check_box);
        boolean question5_2 = questionFiveTwo.isChecked();

        CheckBox questionFiveThree = (CheckBox) findViewById(R.id.answerFiveThree_check_box);
        boolean question5_3 = questionFiveThree.isChecked();

        CheckBox questionFiveFour = (CheckBox) findViewById(R.id.answerFiveFour_check_box);
        boolean question5_4 = questionFiveFour.isChecked();

        int finalScore5 = calculateScore5(question5_1, question5_2, question5_3, question5_4, score5);
        score5 = finalScore5;

        TextView summaryFive = (TextView) findViewById(R.id.summary_five);
        summaryFive.setText(getString(R.string.your_score_is) + " " + finalScore5 + ".");

    }


    private int calculateScore5(boolean question5_1, boolean question5_2, boolean question5_3, boolean question5_4, int score5) {

        if (score5 == 8) {
            return (score5);
        }

        if (question5_1) {
            score5 += 1;
        }

        if (question5_2) {
            score5 += 1;
        }

        if (question5_3) {
            score5 = score5;
        }

        if (question5_4) {
            score5 += 1;
        }

        return (score5);
    }


}
