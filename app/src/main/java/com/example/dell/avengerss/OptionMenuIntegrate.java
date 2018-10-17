package com.example.dell.avengerss;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionMenuIntegrate extends AppCompatActivity {

    RelativeLayout relative;
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu_integrate);

        relative = findViewById(R.id.relative);
        but = findViewById(R.id.button16);


        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),OptionsMenuIntegrate2.class);
                startActivity(intent);
            }
        });

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            onBackPressed();
        }
        if (id == R.id.yellow)
        {
            relative.setBackgroundColor(Color.YELLOW);
        }
        if (id == R.id.red)
        {
            relative.setBackgroundColor(Color.RED);
        }
        if (id == R.id.black)
        {
            relative.setBackgroundColor(Color.BLACK);
        }
        if (id == R.id.logout)
        {
            Toast.makeText(this, "Logout pressed", Toast.LENGTH_SHORT).show();
        }
        if (id == R.id.ironMan)
        {
            relative.setBackgroundResource(R.drawable.aa);
        }
        if (id == R.id.captainAmerica)
        {
            relative.setBackgroundResource(R.drawable.bbb);
        }

        if (id == R.id.thor)
        {
            relative.setBackgroundResource(R.drawable.cc);
        }
        if (id == R.id.hulk)
        {
            relative.setBackgroundResource(R.drawable.hulk);
        }
        if (id == R.id.blackWidow)
        {
            relative.setBackgroundResource(R.drawable.blac);
        }
        if (id == R.id.hawkeye)
        {
            relative.setBackgroundResource(R.drawable.hawk);
        }
        return super.onOptionsItemSelected(item);
    }
}
