package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FourteenActivity extends AppCompatActivity {

    int scoreFinal = 0;
    String nameFinal = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourteen);

        Bundle thirteenActivity = getIntent().getExtras();
        String name = thirteenActivity.getString("Name");
        int score = thirteenActivity.getInt("Score");
        scoreFinal = score;
        nameFinal = name;

        TextView finalResult = (TextView) findViewById(R.id.final_result);
        finalResult.setText(nameFinal + " " + getString(R.string.your_final_result_is) + " " + scoreFinal + "!");
        ImageView resultImage = (ImageView) findViewById(R.id.result_image);

        if (scoreFinal <= 6) {


            resultImage.setImageResource(R.drawable.sad_face);
        }

        if (scoreFinal > 6) {

            resultImage.setImageResource(R.drawable.happy_face);
        }


        TextView startOver = (TextView) findViewById(R.id.start_over);
        startOver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fourteenActivity = new Intent(FourteenActivity.this, MainActivity.class);
                startActivity(fourteenActivity);


            }
        });


    }
}
