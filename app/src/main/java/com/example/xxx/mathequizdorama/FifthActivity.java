package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class FifthActivity extends AppCompatActivity {

    int score3 = 0;
    String name3 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        Bundle fourthActivity = getIntent().getExtras();
        String name = fourthActivity.getString("Name");
        int score = fourthActivity.getInt("Score");
        score3 = score;
        name3 = name;

        TextView nextQuestion3 = (TextView) findViewById(R.id.next_question_three);

        nextQuestion3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fifthActivity = new Intent(FifthActivity.this, SixthActivity.class);
                fifthActivity.putExtra("Name", name3);

                if (score3 == 0) {
                    fifthActivity.putExtra("Score", 0);
                    startActivity(fifthActivity);
                }

                if (score3 == 1) {
                    fifthActivity.putExtra("Score", 1);
                    startActivity(fifthActivity);

                }

                if (score3 == 2) {
                    fifthActivity.putExtra("Score", 2);
                    startActivity(fifthActivity);

                }

                if (score3 == 3) {
                    fifthActivity.putExtra("Score", 3);
                    startActivity(fifthActivity);

                }

            }
        });


    }


    public void submitThree(View view) {

        MediaPlayer thirdQuestion;
        thirdQuestion = MediaPlayer.create(this, R.raw.button_click);
        thirdQuestion.start();


        EditText answerThree = (EditText) findViewById(R.id.answerThree_edit_text);
        String answer3 = answerThree.getText().toString();

        int finalScore3 = calculateScore(answer3, score3);
        score3 = finalScore3;

        TextView summaryThree = (TextView) findViewById(R.id.summary_three);
        summaryThree.setText(getString(R.string.your_score_is) + " " + finalScore3 + ".");
    }


    private int calculateScore(String answer3, int score3) {

        if (score3 == 3) {
            return (score3);
        }

        if (answer3.equals("Leibniz")) {
            score3 += 1;
        } else {
            score3 = score3;
        }

        return (score3);
    }


}
