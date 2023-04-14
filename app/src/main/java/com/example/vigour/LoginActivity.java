package com.example.vigour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        TextView username =(TextView) findViewById(R.id.username);
        TextView password =(TextView) findViewById(R.id.password);

        MaterialButton loginbtn = (MaterialButton) findViewById(R.id.loginbtn);

        //admin and admin

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("Bimal022") && password.getText().toString().equals("heheboi")){
                    //correct
                    Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
                else if(username.getText().toString().equals("Prachi022") && password.getText().toString().equals("puchuu")){
                    //correct
                    Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
                else if(username.getText().toString().equals("Aditya") && password.getText().toString().equals("jaatbrand")){
                    //correct
                    Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }
                else if(username.getText().toString().equals("Nikita") && password.getText().toString().equals("cutupanda")){
                    //correct
                    Toast.makeText(LoginActivity.this,"LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                }


                else
                    //incorrect
                    Toast.makeText(LoginActivity.this,"LOGIN FAILED !!!",Toast.LENGTH_SHORT).show();
            }
        });


    }
}
