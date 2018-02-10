package com.digitalmirko.meternumberpickerlibrarydemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alexzaitsev.meternumberpicker.MeterView;

public class MainActivity extends AppCompatActivity {

    MeterView meterNumberPicker, meterNumberPickerTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meterNumberPicker = (MeterView) findViewById(R.id.meterView);
        meterNumberPicker.setValue(123450);

        meterNumberPickerTwo = (MeterView) findViewById(R.id.meterViewTwo);
        meterNumberPickerTwo.setValue(43210);

        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = meterNumberPicker.getValue();
                Toast.makeText(MainActivity.this, "Top Mark: " + number, Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number = meterNumberPickerTwo.getValue();
                Toast.makeText(MainActivity.this,"Bottom Mark: " + number, Toast.LENGTH_LONG).show();
            }
        });
    }
}
