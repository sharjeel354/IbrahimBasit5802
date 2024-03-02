package com.example.walletwise.Activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.walletwise.R;

public class SignUpActivity extends AppCompatActivity {
    Spinner countrySpinner,citySpinner;
    ImageButton sign_up_btn;
    TextView login_click;
    ImageView countryList;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        countrySpinner = findViewById(R.id.selectCountry);
        citySpinner = findViewById(R.id.selectCity);
        countryList = findViewById(R.id.countryList);
        login_click = findViewById(R.id.login_sign);
        sign_up_btn = findViewById(R.id.sign_up_btn);

        changeStatusBarColor(getResources().getColor(R.color.status_signup));
        String[] countries = getResources().getStringArray(R.array.countries_array);
        final String[][] cities = {new String[0]};
        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, countries);
        countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        countrySpinner.setAdapter(countryAdapter);

        login_click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUpActivity.this, LogInActivity.class);
                startActivity(intent);
            }
        });
        sign_up_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUpActivity.this, SetupAccountActivity.class);
                startActivity(intent);
            }
        });
        citySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK); // Change to your desired color

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK); // Change to your desired color

            }
        });
        countrySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK); // Change to your desired color
                String selectedCountry = (String) parent.getItemAtPosition(position);
                if (selectedCountry.equals("France")) {
                    cities[0] = new String[]{"Select City","Paris", "Lyon", "Marseille"};
                } else if (selectedCountry.equals("Germany")) {
                    cities[0] = new String[]{"Select City","Berlin", "Hamburg", "Munich"};
                } else if (selectedCountry.equals("Pakistan")) {
                    cities[0] = new String[]{"Select City","Islamabad", "Multan", "Lahore","Karachi"};
                } else {
                    cities[0] = new String[]{"Select City","Rome", "Milan", "Venice"};
                }

                ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(view.getContext(), android.R.layout.simple_spinner_item, cities[0]);
                cityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                citySpinner.setAdapter(cityAdapter);
            }


            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                ((TextView) parent.getChildAt(0)).setTextColor(Color.BLACK); // Change to your desired color

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