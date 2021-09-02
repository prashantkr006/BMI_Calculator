package com.example.android.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etTextHeight, etTextWeight;
    Button BtBMI;
    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etTextHeight = findViewById(R.id.etTextHeight);
        etTextWeight = findViewById(R.id.etTextWeight);
        BtBMI = findViewById(R.id.BtBmiCalculate);
        tvAns = findViewById(R.id.etResult);

        BtBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float height, weight, result;

                height = Float.parseFloat(etTextHeight.getText().toString());
                weight =  Float.parseFloat(etTextWeight.getText().toString());

                result = weight / (height * height);
                tvAns.setText("BMI = " + String.format("%.2f", result));
            }
        });
    }
}