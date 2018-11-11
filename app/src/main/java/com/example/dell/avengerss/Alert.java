package com.example.dell.avengerss;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Alert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);
    }

    @Override
    public void onBackPressed() {
        alertShow();
    }

    private void alertShow() {

        final AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Exit");
        b.setMessage("Are you sure?");
        b.setCancelable(false);

        b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        b.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });

        b.create().show();
    }
}
