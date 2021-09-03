package com.example.a19124034_5b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText fname, lname, email, contact;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname = findViewById(R.id.firstNameEdit);
        lname = findViewById(R.id.lastNameEdit);
        email = findViewById(R.id.emailEdit);
        contact = findViewById(R.id.contactEdit);
        gender = findViewById(R.id.genderRadio);
        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("firstName", fname.getText().toString());
                intent.putExtra("lastName", lname.getText().toString());
                intent.putExtra("email", email.getText().toString());
                intent.putExtra("contact", contact.getText().toString());
                int selectedId = gender.getCheckedRadioButtonId();
                RadioButton r = (RadioButton) findViewById(selectedId);
                intent.putExtra("gender", r.getText().toString());
                startActivity(intent);
            }
        });
    }
}