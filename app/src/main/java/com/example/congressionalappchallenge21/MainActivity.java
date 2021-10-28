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
    EditText answerText2;
    EditText answerText3;
    EditText answerText4;

    String setQuestion;
    String setAnswer1;
    String setAnswer2;
    String setAnswer3;
    String setAnswer4;

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
                answerText2 = (EditText)findViewById(R.id.answer2);
                answerText3 = (EditText)findViewById(R.id.answer3);
                answerText4 = (EditText)findViewById(R.id.answer4);

                //question
                setQuestion = questionText.getText().toString();
                String question = setQuestion;

                //answers
                setAnswer1 = answerText1.getText().toString();
                String answer1 = setAnswer1;
                setAnswer2 = answerText2.getText().toString();
                String answer2 = setAnswer2;
                setAnswer3 = answerText3.getText().toString();
                String answer3 = setAnswer3;
                setAnswer4 = answerText4.getText().toString();
                String answer4 = setAnswer4;


                Intent test = new Intent(MainActivity.this, MainActivity2.class);
                test.putExtra("question",question);
                test.putExtra("answer1",answer1);
                test.putExtra("answer2",answer2);
                test.putExtra("answer3",answer3);
                test.putExtra("answer4",answer4);
                startActivity(test);
            }
        });
    }//end onCreate
}