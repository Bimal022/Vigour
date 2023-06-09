package com.example.vigour;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.vigour.R;

public class GymActivity extends AppCompatActivity {
    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{
                R.id.chest, R.id.back, R.id.shoulder, R.id.biceps, R.id.triceps, R.id.leg,
        };
    }

    public void chest(View view) {
//bracket mai source aur destination likhte hai file
//ka kahan se kahan jaa rahe click krne pe
        Intent intent = new Intent(GymActivity.this, ChestActivity.class);
        startActivity(intent);

    }

    public void back(View view) {

        Intent intent = new Intent(GymActivity.this, BackActivity.class);
        startActivity(intent);
    }

    public void shoulder(View view) {
        Intent intent = new Intent(GymActivity.this, ShoulderActivity.class);
        startActivity(intent);
    }

    public void biceps(View view) {
//bracket mai source aur destination likhte hai file
//ka kahan se kahan jaa rahe click krne pe
        Intent intent = new Intent(GymActivity.this, BiActivity.class);
        startActivity(intent);

    }

    public void triceps(View view) {
//bracket mai source aur destination likhte hai file
//ka kahan se kahan jaa rahe click krne pe
        Intent intent = new Intent(GymActivity.this, TriActivity.class);
        startActivity(intent);

    }

    public void leg(View view) {

        Intent intent = new Intent(GymActivity.this, LegActivity.class);
        startActivity(intent);
    }
}
