package com.example.dell.avengerss;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ConextMenu extends AppCompatActivity {

    TextView text;
    RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conext_menu);

        text = findViewById(R.id.textView20);
        relativeLayout = findViewById(R.id.rela);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(ConextMenu.this,text);

                popupMenu.getMenuInflater().inflate(R.menu.popupmenu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();

                        if (id == R.id.yellow)
                        {
                            relativeLayout.setBackgroundColor(Color.YELLOW);
                        }
                        if (id == R.id.red)
                        {
                            text.setTextColor(Color.RED);
                        }
                        if (id == R.id.black)
                        {
                            text.setTextColor(Color.BLACK);
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}
