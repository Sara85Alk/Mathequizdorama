package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    String name2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle firstActivity = getIntent().getExtras();
        name2 = firstActivity.getString("Name");


        TextView nameUser = (TextView) findViewById(R.id.welcome1);
        nameUser.setText(getString(R.string.hello) + " " + name2 + "!");


        TextView firstGuideline = (TextView) findViewById(R.id.first_guideline);

        firstGuideline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent secondActivity = new Intent(SecondActivity.this, ThirdActivity.class);
                secondActivity.putExtra("Name", name2);
                startActivity(secondActivity);


            }
        });


    }


}
