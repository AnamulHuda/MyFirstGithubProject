package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentTo1 extends AppCompatActivity {

    EditText et1, et2, et3;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_to1);

        et1 = findViewById(R.id.editText5);
        et2 = findViewById(R.id.editText6);
        et3 = findViewById(R.id.editText7);
        button = findViewById(R.id.button13);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = et1.getText().toString();
                String s2 = et2.getText().toString();
                String s3 = et3.getText().toString();

                Intent intent = new Intent(getApplicationContext(),Main5Activity.class);
                intent.putExtra("value",s1);
                intent.putExtra("value2",s2);
                intent.putExtra("value3",s3);
                startActivity(intent);


            }
        });
    }
}
