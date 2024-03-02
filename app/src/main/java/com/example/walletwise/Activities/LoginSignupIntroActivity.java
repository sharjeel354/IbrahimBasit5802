package com.example.walletwise.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.walletwise.Fragments.FragmentOne;
import com.example.walletwise.Fragments.FragmentThree;
import com.example.walletwise.Fragments.FragmentTwo;
import com.example.walletwise.R;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

public class LoginSignupIntroActivity extends AppCompatActivity {

    private DotsIndicator springDotsIndicator;
    private ViewPager horizontalviewPager;
    private ImageButton Signup;
    private ImageButton Login;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_signup_intro);
        springDotsIndicator =findViewById(R.id.spring_dots_indicator);
        horizontalviewPager=findViewById(R.id.horizontalviewpager);
        Signup=findViewById(R.id.sign_up);
        Login =findViewById(R.id.log_in);
        changeStatusBarColor(getResources().getColor(R.color.login_status));
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignupIntroActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginSignupIntroActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
        CustomPagerAdapter pagerAdapter = new CustomPagerAdapter(getSupportFragmentManager());
        horizontalviewPager.setAdapter(pagerAdapter);
        springDotsIndicator.setViewPager(horizontalviewPager);

    }

    public class CustomPagerAdapter extends FragmentPagerAdapter {

        public CustomPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new FragmentOne();
                case 1:
                    return new FragmentTwo();
                case 2:
                    return new FragmentThree();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 3; // Number of fragments
        }
    }
    private void changeStatusBarColor(int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }
}