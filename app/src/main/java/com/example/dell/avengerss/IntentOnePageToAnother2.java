package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IntentOnePageToAnother2 extends AppCompatActivity {


    EditText text;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_one_page_to_another2);

        text = findViewById(R.id.editText3);
        button = findViewById(R.id.button5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s1 = text.getText().toString();

                Intent intent = new Intent(getApplicationContext(),Main5ActivityWelcome.class);
                intent.putExtra("value",s1);
                startActivity(intent);
            }
        });
    }
}
