package com.example.dell.avengerss;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.TimePicker;

public class TimePickerTest extends AppCompatActivity {

    TimePicker time;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_picker_test);

        time = findViewById(R.id.timePicker);
        text = findViewById(R.id.textViewTime);

        time.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {
                text.setText(i+":"+i1);
            }
        });

    }
}
