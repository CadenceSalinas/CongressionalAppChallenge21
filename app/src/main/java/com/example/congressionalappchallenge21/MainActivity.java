package com.example.congressionalappchallenge21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void playClick(View v)
    {
        Toast.makeText(this, "You clicked play", Toast.LENGTH_SHORT).show();
        Log.i("info", "The user clicked play");
    }
}