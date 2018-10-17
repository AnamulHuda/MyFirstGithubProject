package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5ActivityWelcome extends AppCompatActivity {

    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_welcome);

        textview = findViewById(R.id.textView6);
        Intent intent = getIntent();
        String s1 = intent.getStringExtra("value");
        textview.setText(s1);
    }
}
