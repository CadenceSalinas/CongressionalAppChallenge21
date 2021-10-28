package com.example.congressionalappchallenge21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Button backButton;
    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;

    String question;
    String txtAnswer1;
    String txtAnswer2;
    String txtAnswer3;
    String txtAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backButton = (Button)findViewById(R.id.back);

        question = getIntent().getStringExtra("question");
        TextView setQuestion = (TextView) findViewById(R.id.question);
        setQuestion.setText(question);

        txtAnswer1 = getIntent().getStringExtra("answer1");
        answer1 = (Button)findViewById(R.id.answer1);
        answer1.setText(txtAnswer1);

        txtAnswer2 = getIntent().getStringExtra("answer2");
        answer2 = (Button)findViewById(R.id.answer2);
        answer2.setText(txtAnswer2);

        txtAnswer3 = getIntent().getStringExtra("answer3");
        answer3 = (Button)findViewById(R.id.answer3);
        answer3.setText(txtAnswer3);

        txtAnswer4 = getIntent().getStringExtra("answer4");
        answer4 = (Button)findViewById(R.id.answer4);
        answer4.setText(txtAnswer4);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent homeScreen = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(homeScreen);
            }
        });
    } //end onCreate
}