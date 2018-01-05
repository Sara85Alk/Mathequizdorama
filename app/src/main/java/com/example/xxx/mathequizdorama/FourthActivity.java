package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class FourthActivity extends AppCompatActivity {

    int score2;
    String name2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Bundle thirdActivity = getIntent().getExtras();
        String name = thirdActivity.getString("Name");
        int score = thirdActivity.getInt("Score");
        score2 = score;
        name2 = name;



        TextView nextQuestion2 = (TextView) findViewById(R.id.next_question_two);


        nextQuestion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fourthActivity = new Intent(FourthActivity.this, FifthActivity.class);
                fourthActivity.putExtra("Name", name2);

                if (score2 == 0) {
                    fourthActivity.putExtra("Score", 0);
                    startActivity(fourthActivity);

                }

                if (score2 == 1) {
                    fourthActivity.putExtra("Score", 1);
                    startActivity(fourthActivity);
                }

                if (score2 == 2) {
                    fourthActivity.putExtra("Score", 2);
                    startActivity(fourthActivity);
                }
            }
        });


    }


    public void submitTwo(View view) {

        MediaPlayer secondQuestion;
        secondQuestion = MediaPlayer.create(this, R.raw.button_click);
        secondQuestion.start();


        EditText answerTwo = (EditText) findViewById(R.id.answerTwo_edit_text);
        String answer2 = answerTwo.getText().toString();

        int finalScore2 = calculateScore2(answer2, score2);
        score2 = finalScore2;

        TextView summaryTwo = (TextView) findViewById(R.id.summary_two);
        summaryTwo.setText(getString(R.string.your_score_is) + " " + finalScore2 + ".");


    }


    private int calculateScore2(String answer2, int score2) {

        if (score2 == 2) {
            return (score2);
        }

        if (answer2.equals("Perelman")) {
            score2 += 1;
        } else {
            score2 = score2;
        }

        return (score2);
    }


}
