package com.example.walletwise.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.walletwise.R;

public class EmailSentActivity extends AppCompatActivity {
    Button continueBtn,backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sent);
        continueBtn=findViewById(R.id.continueBtn);
        backbtn=findViewById(R.id.backtologin);
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(EmailSentActivity.this, ResetPasswordActivity.class);
//                startActivity(intent);
            }
        });
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EmailSentActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
    }
}