package com.example.congressionalappchallenge21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    Button playButton;

    TextInputLayout userInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (Button)findViewById(R.id.play);

        userInput = findViewById(R.id.user);
        String value = userInput.getHint() + "";

        // String value = "applesauce";
        Intent test = new Intent(MainActivity.this, MainActivity2.class);
        test.putExtra("key",value);


        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                startActivity(test);
            }
        });
    }//end onCreate
}