package com.example.walletwise.Activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.walletwise.R;

public class ResetPasswordActivity extends AppCompatActivity {
   Button ResetBtn;
   TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
      ResetBtn=findViewById(R.id.resetpassBtn);
      login=findViewById(R.id.login_sign);
      changeStatusBarColor(getResources().getColor(R.color.status_signup));


        ResetBtn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(ResetPasswordActivity.this, LogInActivity.class);
              startActivity(intent);
          }
      });
      login.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(ResetPasswordActivity.this, LogInActivity.class);
              startActivity(intent);
          }
      });

    }
    private void changeStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }

}