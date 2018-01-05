package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

        Bundle fifthActivity = getIntent().getExtras();
        final String name55 = fifthActivity.getString("Name");
        final int score55 = fifthActivity.getInt("Score");

        TextView nameAndScore2 = (TextView) findViewById(R.id.welcome2);
        nameAndScore2.setText(name55 + " " + getString(R.string.your_score_is_2) + " " + score55 + ".");


        TextView secondGuideline = (TextView) findViewById(R.id.second_guideline);

        secondGuideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sixthActivity = new Intent(SixthActivity.this, SeventhActivity.class);
                sixthActivity.putExtra("Name", name55);
                sixthActivity.putExtra("Score", score55);
                startActivity(sixthActivity);

            }
        });


    }
}
