package com.example.a19124034_3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button GButton;
    private EditText input1;
    private EditText input2;
    private EditText input3;
    private TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        GButton = findViewById(R.id.great);
        answer = findViewById(R.id.answer);

        GButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer I1 = Integer.parseInt(input1.getText().toString());
                Integer I2 = Integer.parseInt(input2.getText().toString());
                Integer I3 = Integer.parseInt(input3.getText().toString());
                if(I1>I2 && I1>I3){
                    answer.setText(Integer.toString(I1));
                }
                else if(I2>I1 && I2>I3){
                    answer.setText(Integer.toString(I2));
                }
                else{
                    answer.setText(Integer.toString(I3));
                }
            }
        });
    }
}