package com.example.a19124034_2b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button changeColor;
    private ConstraintLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changeColor = findViewById(R.id.bt1);
        layout = findViewById(R.id.layout);
        changeColor.setOnClickListener(new View.OnClickListener() {
            int click = 0;
            @Override
            public void onClick(View v) {
                click++;
                switch (click){
                    case 1: {
                        layout.setBackgroundColor(Color.parseColor("#343A40"));
                    }
                    break;
                    case 2: {
                        layout.setBackgroundColor(Color.parseColor("#7952B3"));
                    }
                    break;
                    case 3: {
                        layout.setBackgroundColor(Color.parseColor("#FFC107"));
                    }
                    break;
                    case 4: {
                        layout.setBackgroundColor(Color.parseColor("#EEEEEE"));
                        click=0;
                    }
                    break;
                }
            }
        });
    }
}