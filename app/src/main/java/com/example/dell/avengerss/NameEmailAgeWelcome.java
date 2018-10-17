package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NameEmailAgeWelcome extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_email_age_welcome);

        tv1 = findViewById(R.id.textView7);
        tv2 = findViewById(R.id.textView14);
        tv3 = findViewById(R.id.textView15);
        tv4 = findViewById(R.id.textView16);
        tv5 = findViewById(R.id.textView17);
        tv6 = findViewById(R.id.textView18);

        Intent intent = getIntent();
        String s1 = intent.getStringExtra("value");
        String s2 = intent.getStringExtra("value2");
        String s3 = intent.getStringExtra("value3");

        tv4.setText(s1);
        tv5.setText(s2);
        tv6.setText(s3);
    }
}
