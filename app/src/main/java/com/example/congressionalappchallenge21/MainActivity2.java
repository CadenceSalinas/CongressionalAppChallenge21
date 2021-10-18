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
    TextView setQuestion;
    String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        backButton = (Button)findViewById(R.id.back);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getString("key");
        }
        setQuestion = (TextView) findViewById(R.id.question);
        setQuestion.setText(value);

        backButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                Intent homeScreen = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(homeScreen);
            }
        });
    }
}