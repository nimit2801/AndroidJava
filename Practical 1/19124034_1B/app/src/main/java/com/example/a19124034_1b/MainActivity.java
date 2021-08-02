package com.example.a19124034_1b;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Submit;
    private TextView data;
    private EditText fn;
    private EditText ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Submit = findViewById(R.id.Login);
        fn = findViewById(R.id.fname);
        ln = findViewById(R.id.Lname);
        data = findViewById(R.id.answer);
        Submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String editTextTextPersonName= fn.getText().toString().trim();
                String editTextTextPersonName2 = ln.getText().toString().trim();
                data.setText("Welcome " + editTextTextPersonName + " " + editTextTextPersonName2 );
            }
        });
    }
}