package com.example.a19124034_9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name, email;
    private Button save;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        save = findViewById(R.id.save);
        sharedPreferences = getSharedPreferences("MyPref", Context.MODE_PRIVATE);

        name.setText(sharedPreferences.getString("Name", ""));
        name.setText(sharedPreferences.getString("Email", ""));

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences.edit().putString("Name", name.getText().toString()).apply();
                sharedPreferences.edit().putString("Email", email.getText().toString()).apply();
                Toast.makeText(MainActivity.this, "Saved", Toast.LENGTH_SHORT).show();
            }
        });

    }
}