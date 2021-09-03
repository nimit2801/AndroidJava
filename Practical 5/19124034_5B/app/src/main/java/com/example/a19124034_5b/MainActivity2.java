package com.example.a19124034_5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView fname, lname, gender, email, contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fname = findViewById(R.id.nothing1);
        lname = findViewById(R.id.nothing2);
        gender = findViewById(R.id.nothing3);
        email = findViewById(R.id.nothing4);
        contact = findViewById(R.id.nothing5);

        Intent i = getIntent();

        String tempText;

        tempText = i.getStringExtra("firstName");
        fname.setText("First Name: "+ tempText);
        tempText = i.getStringExtra("lastName");
        lname.setText("Last Name: "+ tempText);
        tempText = i.getStringExtra("gender");
        gender.setText("Gender: "+ tempText);
        tempText = i.getStringExtra("email");
        email.setText("Email: "+ tempText);
        tempText = i.getStringExtra("contact");
        contact.setText("Contact: "+ tempText);
    }
}