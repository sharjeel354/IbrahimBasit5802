package com.example.walletwise.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.walletwise.R;

public class PinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);

        GridLayout gridLayout = findViewById(R.id.grid_layout);

        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            View childView = gridLayout.getChildAt(i);

            if (childView instanceof ImageView) {
                final int position = i;  // Save the position for reference in the OnClickListener
                ImageView imageView = (ImageView) childView;

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Handle click event for the ImageView
                        switch (position) {
                            case 0:
                                Toast.makeText(PinActivity.this, "1", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(PinActivity.this, "2", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(PinActivity.this, "3", Toast.LENGTH_SHORT).show();
                                break;
                            case 3:
                                Toast.makeText(PinActivity.this, "4", Toast.LENGTH_SHORT).show();
                                break;
                            case 4:
                                Toast.makeText(PinActivity.this, "5", Toast.LENGTH_SHORT).show();
                                break;
                            case 5:
                                Toast.makeText(PinActivity.this, "6", Toast.LENGTH_SHORT).show();
                                break;
                            case 6:
                                Toast.makeText(PinActivity.this, "7", Toast.LENGTH_SHORT).show();
                                break;
                            case 7:
                                Toast.makeText(PinActivity.this, "8", Toast.LENGTH_SHORT).show();
                                break;
                            case 8:
                                Toast.makeText(PinActivity.this, "9", Toast.LENGTH_SHORT).show();
                                break;
                            case 9:
                                Toast.makeText(PinActivity.this, "backspace", Toast.LENGTH_SHORT).show();
                                break;
                            case 10:
                                Toast.makeText(PinActivity.this, "0", Toast.LENGTH_SHORT).show();
                                break;
                            case 11:
                                Toast.makeText(PinActivity.this, "Next", Toast.LENGTH_SHORT).show();
                                break;
                            // Add cases for other ImageViews as needed
                        }
                    }
                });
            }
    }
    }}