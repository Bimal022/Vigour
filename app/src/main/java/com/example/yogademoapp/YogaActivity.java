package com.example.yogademoapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class YogaActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.yoga1, R.id.yoga2, R.id.yoga3, R.id.yoga4, R.id.yoga5,
                R.id.yoga6, R.id.yoga7, R.id.yoga8, R.id.yoga9, R.id.yoga10,
        };
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(YogaActivity.this, YogaActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }



    }
}