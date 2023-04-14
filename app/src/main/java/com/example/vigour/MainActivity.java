package com.example.vigour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.example.vigour.R;

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.id_privacy){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);

            return true;


        }
        if(id == R.id.id_term){

            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
            startActivity(intent);
            return true;
        }
        if(id == R.id.rate){
            return true;
        }
        if(id == R.id.share){

            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "This app is created by Kumar Bimal, Prachi Bhati, Aditya Teotia, Nikita Agarwal \n This is the free app download now \n"+"https://play.google.com/store/apps/details?id=com.example.yogademoapp&hl=en";
            String sharehub = "Vigour";
            myIntent.putExtra(Intent.EXTRA_SUBJECT, sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT, sharebody);
            startActivity(Intent.createChooser(myIntent, "share using"));

            return true;
        }
        return true;
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