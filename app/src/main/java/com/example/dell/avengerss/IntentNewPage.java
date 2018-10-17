package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentNewPage extends AppCompatActivity {

    EditText name, age, email;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_new_page);

        name = findViewById(R.id.editText11);
        age = findViewById(R.id.editText12);
        email = findViewById(R.id.editText13);
        button = findViewById(R.id.button15);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameText = name.getText().toString();
                String ageText = age.getText().toString();
                String emailText = email.getText().toString();

                Intent intent = new Intent(getApplicationContext(),IntentNewPageWelcome.class);
                intent.putExtra("Name",nameText);
                intent.putExtra("Age",ageText);
                intent.putExtra("Email",emailText);

                startActivity(intent);
            }
        });
    }
}
