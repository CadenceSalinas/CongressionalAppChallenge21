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
    EditText mEdit;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = (Button)findViewById(R.id.play);


        playButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                mEdit = (EditText)findViewById(R.id.editText);
                a = mEdit.getText().toString();

                String value = a;
                Intent test = new Intent(MainActivity.this, MainActivity2.class);
                test.putExtra("key",value);
                startActivity(test);
            }
        });
    }//end onCreate
}