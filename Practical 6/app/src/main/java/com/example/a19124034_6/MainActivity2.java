package com.example.a19124034_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView language, content, video, document;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        language = findViewById(R.id.language);
        content = findViewById(R.id.content);
        document = findViewById(R.id.document);
        video = findViewById(R.id.video);
        ImageView logo = findViewById(R.id.logo);

        Intent i = getIntent();
        String tempText;
        tempText = i.getStringExtra("language");
        String link1 = null;
        String link2 = null;


        switch (tempText){
            case "Java Script": {
                language.setText(tempText);
                content.setText("JavaScript (JS) is a lightweight, interpreted, or just-in-time compiled programming language with first-class functions. While it is most well-known as the scripting language for Web pages, many non-browser environments also use it, such as Node.js, Apache CouchDB and Adobe Acrobat.");
                logo.setImageResource(R.drawable.js);
                link1 = "https://www.javascript.com/";
                link2 = "https://youtu.be/hdI2bqOjy3c";
            }
            break;

            case "RUST": {
                language.setText(tempText);
                content.setText("Rust has been Stack Overflow's most loved language for four years in a row, indicating that many of those who have had the opportunity to use Rust have fallen in love with it. However, the roughly 97% of survey respondents who haven't used Rust may wonder, \"What's the deal with Rust?");
                logo.setImageResource(R.drawable.rust);
                link1 = "https://www.rust-lang.org/";
                link2 = "https://youtu.be/zF34dRivLOw";
            }
            break;
            case "Elixir": {
                language.setText(tempText);
                content.setText("Elixir is a dynamic, functional language for building scalable and maintainable applications.\n" + "\n" + "Elixir leverages the Erlang VM, known for running low-latency, distributed, and fault-tolerant systems. Elixir is successfully used in web development, embedded software, data ingestion, and multimedia processing, across a wide range of industries.");
                logo.setImageResource(R.drawable.elixir);
                link1 = "https://elixir-lang.org";
                link2 = "https://youtu.be/pBNOavRoNL0";
                }
            break;
            case "COBOL": {
                language.setText(tempText);
                content.setText("COBOL stands for Common Business Oriented Language.The US Department of Defense, in a conference, formed CODASYL (Conference on Data Systems Language) to develop a language for business data processing needs which is now known as COBOL.\n" + "\n" + "COBOL is used for writing application programs and we cannot use it to write system software. The applications like those in defense domain, insurance domain, etc. which require huge data processing make extensive use of COBOL.");
                logo.setImageResource(R.drawable.cobol);
                link1 = "https://developer.ibm.com/languages/cobol/";
                link2 = "https://youtu.be/TBs7HXI76yU";
            }
            break;
        }
        String finalLink1 = link1;
        document.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCardClick(finalLink1);
            }
        });
        String finalLink2 = link2;
        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onCardClick(finalLink2);
            }
        });


    }
    public void onCardClick(String link) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(link));
        startActivity(intent);
    }
}