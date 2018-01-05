package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView blackboard = findViewById(R.id.blackboard);

        blackboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startGame = new Intent(MainActivity.this, FirstActivity.class);
                startActivity(startGame);

            }
        });


    }
}
