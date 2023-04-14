package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.vigour.R;

public class BackActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.back1, R.id.back2, R.id.back3, R.id.back4, R.id.back5,

        };
    }

    public void Imagebuttonclicked(View view) {

        for(int i=0; i<newArray.length; i++){

            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));
                Intent intent = new Intent(BackActivity.this, BackActivity2.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }



    }
}