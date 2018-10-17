package com.example.dell.avengerss;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class OptionsMenuIntegrate2 extends AppCompatActivity {

    RelativeLayout rel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu_integrate2);

        rel = findViewById(R.id.relativeLay);


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null)
        {
            actionBar.setHomeButtonEnabled(true);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(OptionsMenuIntegrate2.this,OptionMenuIntegrate.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menutwo,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home)
        {
            onBackPressed();
        }
        if (id == R.id.messi)
        {
            rel.setBackgroundResource(R.drawable.messi);
        }
        if (id == R.id.ronaldo)
        {
            rel.setBackgroundResource(R.drawable.ronaldo);
        }
        if (id == R.id.dybala)
        {
            rel.setBackgroundResource(R.drawable.dybala);
        }
        if (id == R.id.modric)
        {
            rel.setBackgroundResource(R.drawable.modric);
        }
        if (id == R.id.hazard)
        {
            rel.setBackgroundResource(R.drawable.hazard);
        }
        if (id == R.id.neymar)
        {
            rel.setBackgroundResource(R.drawable.neymar);
        }
        if (id == R.id.logOut)
        {
            Toast.makeText(this, "Logged Out", Toast.LENGTH_SHORT).show();
        }


        return super.onOptionsItemSelected(item);
    }
}
