package com.example.android.messages;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalizedActivity extends AppCompatActivity {
    TextView full_name;
    TextView full_title;
    TextView full_text;
    TextView full_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalized);

        Intent intent = getIntent();

        full_name = findViewById(R.id.full_name);
        full_title = findViewById(R.id.full_title);
        full_text = findViewById(R.id.full_text);
        full_time = findViewById(R.id.full_time);

        String iName = intent.getStringExtra("name");
        String iTitle = intent.getStringExtra("title");
        String iText = intent.getStringExtra("text");
        String iTime = intent.getStringExtra("time");

        full_name.setText(iName);
        full_title.setText(iTitle);
        full_text.setText(iText);
        full_time.setText(iTime);
    }
}
