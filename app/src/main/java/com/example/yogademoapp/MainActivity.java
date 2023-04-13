package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1 = findViewById(R.id.startgym);
        button2 = findViewById(R.id.startyoga);
        button3 = findViewById(R.id.startmeditation);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, GymActivity.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, YogaActivity.class);
                startActivity(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, YogaActivity.class);
                startActivity(intent);
            }
        });
    }

    public void gymexersice(View view) {
//bracket mai source aur destination likhte hai file
//ka kahan se kahan jaa rahe click krne pe
        Intent intent = new Intent(MainActivity.this, GymActivity.class);
        startActivity(intent);

    }

    public void yogaexersice(View view) {

        Intent intent = new Intent(MainActivity.this, YogaActivity.class);
        startActivity(intent);
    }

    public void meditation(View view) {
        Intent intent = new Intent(MainActivity.this, FoodActivity.class);
        startActivity(intent);
    }
}