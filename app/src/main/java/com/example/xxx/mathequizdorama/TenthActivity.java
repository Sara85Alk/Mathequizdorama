package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TenthActivity extends AppCompatActivity {

    int score66 = 0;
    String name66 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tenth);

        Bundle ninthActivity = getIntent().getExtras();
        String name = ninthActivity.getString("Name");
        int score = ninthActivity.getInt("Score");
        score66 = score;
        name66 = name;

        TextView nameAndScore3 = findViewById(R.id.welcome3);
        nameAndScore3.setText(name66 + " " + getString(R.string.your_score_is_2) + " " + score66 + ".");

        TextView thirdGuideline = (TextView) findViewById(R.id.third_guideline);

        thirdGuideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tenthActivity = new Intent(TenthActivity.this, EleventhActivity.class);
                tenthActivity.putExtra("Name", name66);
                tenthActivity.putExtra("Score", score66);
                startActivity(tenthActivity);
            }
        });


    }
}
