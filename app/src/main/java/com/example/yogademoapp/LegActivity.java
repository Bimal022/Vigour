package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LegActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leg);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.leg1, R.id.leg2, R.id.leg3, R.id.leg4, R.id.leg5,
        };
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(LegActivity.this, LegActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }



    }
}