package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.vigour.R;

public class ChestActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.chest1, R.id.chest2, R.id.chest3, R.id.chest4,
        };
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(ChestActivity.this, ChestActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }



    }
}