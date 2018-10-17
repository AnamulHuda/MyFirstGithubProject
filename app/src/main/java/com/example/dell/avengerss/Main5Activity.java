package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        tv1 = findViewById(R.id.textView8);
        tv2 = findViewById(R.id.textView9);
        tv3 = findViewById(R.id.textView10);
        tv4 = findViewById(R.id.textView11);
        tv5 = findViewById(R.id.textView12);
        tv6 = findViewById(R.id.textView13);

        Intent intent = getIntent();
        String s1 = intent.getStringExtra("value");
        String s2 = intent.getStringExtra("value2");
        String s3 = intent.getStringExtra("value3");

        tv4.setText(s1);
        tv5.setText(s2);
        tv6.setText(s3);
    }
}
