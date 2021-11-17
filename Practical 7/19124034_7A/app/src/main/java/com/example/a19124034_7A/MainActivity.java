package com.example.a19124034_7A;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout constraintLayout;
    TextView textView;
    Button popup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popup = (Button) findViewById(R.id.button);
        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popmenu = new PopupMenu(MainActivity.this, popup);
                popmenu.getMenuInflater().inflate(R.menu.popup_menu, popmenu.getMenu());

                popmenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this,"You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });
                popmenu.show();
            }
        });

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
        textView = findViewById(R.id.textView);
        registerForContextMenu(textView);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.optionmenu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(this, "Apple", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Cone", Toast.LENGTH_LONG).show();
                return true;

            case R.id.item3:
                Toast.makeText(this, "Unicorn", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose a color");
        menu.add(0, v.getId(), 0, "Yellow");
        menu.add(0, v.getId(), 0, "Gray");
        menu.add(0, v.getId(), 0, "Cyan");
    }
    // menu item select listener
    @Override
    public boolean onContextItemSelected(MenuItem item) {

        if (item.getTitle() == "Yellow") {
            constraintLayout.setBackgroundColor(Color.YELLOW);
        } else if (item.getTitle() == "Gray") {
            constraintLayout.setBackgroundColor(Color.GRAY);
        } else if (item.getTitle() == "Cyan") {
            constraintLayout.setBackgroundColor(Color.CYAN);
        }

        return true;
    }

}