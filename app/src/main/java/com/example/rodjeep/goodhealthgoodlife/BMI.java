package com.example.rodjeep.goodhealthgoodlife;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity  {
float numInput1=0;
float numInput2=0;
    float BMI=0;
    EditText input1;
    EditText input2;
    TextView Bm;
    Button calbmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        input1 = (EditText) findViewById(R.id.edwi);
        input2 = (EditText) findViewById(R.id.edhi);
        Bm = (TextView) findViewById(R.id.textView7);
        calbmi =(Button)findViewById(R.id.button2);
        calbmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numInput1 = Float.parseFloat(input1.getText().toString());
                numInput2 = Float.parseFloat(input2.getText().toString());
                numInput2=(numInput2/100);
                numInput2=(numInput2*numInput2);
                BMI = (numInput1/numInput2);
                Bm.setText("ค่า BMI ของคุณ คือ" + String.valueOf(BMI));

            }
        });

        }
    }

