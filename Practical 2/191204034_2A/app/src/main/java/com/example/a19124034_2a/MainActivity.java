package com.example.a19124034_2a;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView content;
    private Button small;
    private Button medium;
    private Button large;
    private Button orange;
    private Button magenta;
    private Button gray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        content = findViewById(R.id.tv1);
        orange = findViewById(R.id.orange);
        magenta = findViewById(R.id.magenta);
        gray = findViewById(R.id.gray);
        small  = findViewById(R.id.small);
        medium  = findViewById(R.id.medium);
        large  = findViewById(R.id.large);

        orange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setTextColor(Color.RED);
            }
        });
        magenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setTextColor(Color.MAGENTA);
            }
        });
        gray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                content.setTextColor(Color.LTGRAY);
            }
        });
        small.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 18;
                content.setTextSize(size);
            }
        });
        medium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 20;
                content.setTextSize(size);
            }
        });
        large.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int size = 22;
                content.setTextSize(size);
            }
        });
    }
}