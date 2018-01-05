package com.example.xxx.mathequizdorama;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    String name1 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }

    public void startGame(View view) {

        MediaPlayer startGame;
        startGame = MediaPlayer.create(this, R.raw.button_click);
        startGame.start();

        EditText nameUser = (EditText) findViewById(R.id.name_edit_text);
        name1 = nameUser.getText().toString();

        Intent firstActivity = new Intent(FirstActivity.this, SecondActivity.class);
        firstActivity.putExtra("Name", name1);
        startActivity(firstActivity);

    }


}