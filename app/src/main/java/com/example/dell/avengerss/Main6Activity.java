package com.example.dell.avengerss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Log.i("My Position","I am onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("My Position","I am onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("My Position","I am onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("My Position","I am onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("My Position","I am onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("My Position","I am onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("My Position","I am onDestroy");
    }
}
