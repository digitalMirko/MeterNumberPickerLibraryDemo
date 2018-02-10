package com.digitalmirko.meternumberpickerlibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alexzaitsev.meternumberpicker.MeterView;

public class MainActivity extends AppCompatActivity {

    // Top and Bottom Meters
    MeterView meterNumberPicker, meterNumberPickerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Top Meter
        meterNumberPicker = (MeterView) findViewById(R.id.meterView);
        meterNumberPicker.setValue(123450);

        // Bottom Meter
        meterNumberPickerTwo = (MeterView) findViewById(R.id.meterViewTwo);
        meterNumberPickerTwo.setValue(43210);

        // Top Toast Mark Button
        Button button = (Button)findViewById(R.id.button);

        // Bottom Toast Mark Button
        Button button2 = (Button)findViewById(R.id.button2);

        // Top Toast Mark Button Clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = meterNumberPicker.getValue();
                Toast.makeText(MainActivity.this, "Top Mark: " + number, Toast.LENGTH_LONG).show();
            }
        });

        // Bottom Toast Mark Button Clicked
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = meterNumberPickerTwo.getValue();
                Toast.makeText(MainActivity.this,"Bottom Mark: " + number, Toast.LENGTH_LONG).show();
            }
        });
    }
}
