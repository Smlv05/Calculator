package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button sum;
    private Button multiply;
    private Button subtraction;
    private Button division;
    private EditText a;
    private EditText b;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sum = findViewById(R.id.sum);
        multiply = findViewById(R.id.multiply);
        subtraction = findViewById(R.id.subtraction);
        division = findViewById(R.id.division);
        a = findViewById(R.id.et_first);
        b = findViewById(R.id.et_second);
        result = findViewById(R.id.result);

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(Integer.parseInt(a.getText().toString()) + Integer.parseInt(b.getText().toString())));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(Integer.parseInt(a.getText().toString()) * Integer.parseInt(b.getText().toString())));
            }
        });

        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(Integer.parseInt(a.getText().toString()) - Integer.parseInt(b.getText().toString())));
            }
        });

        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(String.valueOf(Integer.parseInt(a.getText().toString()) / Integer.parseInt(b.getText().toString())));
            }
        });
    }
}