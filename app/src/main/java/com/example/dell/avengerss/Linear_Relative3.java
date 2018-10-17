package com.example.dell.avengerss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Linear_Relative3 extends AppCompatActivity {

    Button button, button2, button3, button4, button5, button6;
    ImageView image, image2, image3, image4, image5, image6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear__relative3);

        button = findViewById(R.id.button6);
        button2 = findViewById(R.id.button7);
        button3 = findViewById(R.id.button8);
        button4 = findViewById(R.id.button9);
        button5 = findViewById(R.id.button10);
        button6 = findViewById(R.id.button11);

        image = findViewById(R.id.imageView2);
        image2 = findViewById(R.id.imageView8);
        image3 = findViewById(R.id.imageView9);
        image4 = findViewById(R.id.imageView10);
        image5 = findViewById(R.id.imageView11);
        image6 = findViewById(R.id.imageView12);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image.setImageResource(R.drawable.batman);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image2.setImageResource(R.drawable.wonderwoman);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image3.setImageResource(R.drawable.superman);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image4.setImageResource(R.drawable.aqua);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image5.setImageResource(R.drawable.cyborg);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image6.setImageResource(R.drawable.flash);
            }
        });



    }
}
