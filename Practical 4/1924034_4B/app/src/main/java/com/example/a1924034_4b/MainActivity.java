package com.example.a1924034_4b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button submit;
    private EditText interest;
    private EditText amount;
    private EditText years;
    private TextView answers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button2);
        interest = findViewById(R.id.interest);
        amount = findViewById(R.id.interest);
        years = findViewById(R.id.years);
        answers = findViewById(R.id.textView2);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double interest_ = Double.parseDouble(interest.getText().toString());
                Double amount_ = Double.parseDouble(amount.getText().toString());
                Double years_ = Double.parseDouble(years.getText().toString());
                Double answers_ = (interest_ * amount_ * years_)/100;
                answers.setText("Interest: " + Double.toString(answers_) + "\n" + "Total: " + Double.toString(answers_ + amount_));
            }
        });
    }
}