package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class IntentNewPageWelcome extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_new_page_welcome);

        textView = findViewById(R.id.textView19);
        Intent intent = getIntent();

        String receivedName = intent.getStringExtra("Name");
        String receivedAge = intent.getStringExtra("Age");
        String receivedEmail = intent.getStringExtra("Email");

        textView.setText("Hello, "+receivedName+"\nYour age is "+receivedAge+"\nYour email is "+receivedEmail);
    }
}
