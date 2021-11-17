package com.example.a19124034_10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, email;
    Spinner city;
    RadioGroup gender;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        save = findViewById(R.id.save);
        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        city = findViewById(R.id.city);
        gender = findViewById(R.id.gender);

        String[] items = new String[]{"Vadodara", "Mumbai", "Banglore", "New Delhi"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        city.setAdapter(adapter);

        final String[] city_ = new String[1];

        city.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                city_[0] = (String) adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                city_[0] = "Vadodara";
            }
        });

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "test").build();
        UserDao userDao = db.userDao();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectGender = gender.getCheckedRadioButtonId();
                View radioButton = gender.findViewById(selectGender);
                int idx = gender.indexOfChild(radioButton);
                RadioButton r = (RadioButton) gender.getChildAt(idx);
                String selectedtext = r.getText().toString();
                User x = new User();
                x.name = name.getText().toString();
                x.email = email.getText().toString();
                x.gender = selectedtext;
                x.city = city_[0];
                new Thread(() -> {
                    userDao.insertAll(x);
                }).start();
                Toast.makeText(MainActivity.this, "Data added to db!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}