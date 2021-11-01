package com.example.congressionalappchallenge21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

//    String correctAnswer;
//
//    Boolean correct1;
//    Boolean correct2;
//    Boolean correct3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backButton = (Button)findViewById(R.id.back);

        //question
        question = getIntent().getStringExtra("question");
        TextView setQuestion = (TextView) findViewById(R.id.question);
        setQuestion.setText(question);

        //answers
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

        //correct answers
//        correct1 = getIntent().getBooleanExtra("check1", false);
//        correct2 = getIntent().getBooleanExtra("check2", false);
//        correct3 = getIntent().getBooleanExtra("check3", false);

        //set correct answer
//        if(correct1)
//        {
//            correctAnswer = txtAnswer1;
//        }
//        else if(correct2)
//        {
//            correctAnswer = txtAnswer2;
//        }
//        else if(correct3)
//        {
//            correctAnswer = txtAnswer3;
//        }
//        else
//        {
//            correctAnswer = txtAnswer4;
//        }
//
                backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent homeScreen = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(homeScreen);
            }
        });
//
//        //check correct answer
//        answer1.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v)
//            {
//                if(txtAnswer1 == correctAnswer)
//                {
//                    Log.i("click", "You clicked the correct button 1");
//                }
//                else
//                {
//                    Log.i("click", "You clicked the incorrect button 1");
//                }
//            }
//        });
//
//        answer2.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v)
//            {
//                if(txtAnswer2 == correctAnswer)
//                {
//                    Log.i("click", "You clicked the correct button 2");
//                }
//                else
//                {
//                    Log.i("click", "You clicked the incorrect button 2");
//                }
//            }
//        });
//
//        answer3.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v)
//            {
//                if(txtAnswer3 == correctAnswer)
//                {
//                    Log.i("click", "You clicked the correct button 3");
//                }
//                else
//                {
//                    Log.i("click", "You clicked the incorrect button 3");
//                }
//            }
//        });
//
//        answer4.setOnClickListener(new View.OnClickListener() {
//
//            public void onClick(View v)
//            {
//                if(txtAnswer4 == correctAnswer)
//                {
//                    Log.i("click", "You clicked the correct button 4");
//                }
//                else
//                {
//                    Log.i("click", "You clicked the incorrect button 4");
//                }
//            }
//        });

    } //end onCreate
}