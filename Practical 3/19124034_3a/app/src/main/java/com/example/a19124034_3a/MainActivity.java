package com.example.a19124034_3a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText input1;
    private EditText input2;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        answer = findViewById(R.id.answer);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer input1_ = Integer.parseInt(input1.getText().toString());
                Integer input2_ = Integer.parseInt(input2.getText().toString());
                Integer answer_ = input1_+input2_;
                answer.setText(Integer.toString(answer_));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer input1_ = Integer.parseInt(input1.getText().toString());
                Integer input2_ = Integer.parseInt(input2.getText().toString());
                Integer answer_ = input1_ - input2_;
                answer.setText(Integer.toString(answer_));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer input1_ = Integer.parseInt(input1.getText().toString());
                Integer input2_ = Integer.parseInt(input2.getText().toString());
                Integer answer_ = input1_ * input2_;
                answer.setText(Integer.toString(answer_));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double input1_ = Double.parseDouble(input1.getText().toString());
                Double input2_ = Double.parseDouble(input2.getText().toString());
                Double answer_ = input1_/input2_;
                answer.setText(Double.toString(answer_));
            }
        });
    }
}