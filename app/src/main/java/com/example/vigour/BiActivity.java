package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.vigour.R;

public class BiActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bi);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.bi1, R.id.bi2, R.id.bi3, R.id.bi4,
        };
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(BiActivity.this, BiActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }



    }
}