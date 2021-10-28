package com.example.congressionalappchallenge21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button playButton;
    EditText questionText;
    EditText answerText1;
    String setQuestion;
    String setAnswer1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (Button)findViewById(R.id.play);


        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                questionText = (EditText)findViewById(R.id.questionText);

                answerText1 = (EditText)findViewById(R.id.answer1);

                //question
                setQuestion = questionText.getText().toString();
                String question = setQuestion;

                //answers
                setAnswer1 = answerText1.getText().toString();
                String answer1 = setAnswer1;


                Intent test = new Intent(MainActivity.this, MainActivity2.class);
                test.putExtra("question",question);
                test.putExtra("answer1",answer1);
                startActivity(test);
            }
        });
    }//end onCreate
}