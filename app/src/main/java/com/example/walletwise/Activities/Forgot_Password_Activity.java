package com.example.walletwise.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.walletwise.R;

public class Forgot_Password_Activity extends AppCompatActivity {
    ImageButton Continue;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        Continue=findViewById(R.id.cntForgotScreen);
        Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Forgot_Password_Activity.this, EmailSentActivity.class);
                startActivity(intent);
            }
        });


    }
}