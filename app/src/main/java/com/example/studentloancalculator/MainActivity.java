package com.example.studentloancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText loanAmount,interestRate, loanTerm, loanFees;
    private TextView mPayment, totalPayment;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanAmount = (EditText) findViewById(R.id.editTextNumber);
        interestRate = (EditText) findViewById(R.id.editTextNumber2);
        loanTerm = (EditText) findViewById(R.id.editTextNumber3);
        loanFees = (EditText) findViewById(R.id.editTextNumber5);
        mPayment=(TextView)findViewById(R.id.monthly);
        totalPayment=(TextView)findViewById(R.id.total);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Integer.parseInt(loanAmount.getText().toString());
                double b= (Integer.parseInt(interestRate.getText().toString())/100.0);
                double c= Integer.parseInt(loanTerm.getText().toString());
                double e= Integer.parseInt(loanFees.getText().toString());
                double r=b/12;
                double calculation = (a+e)/((Math.pow(1+r, (c*12))-1)/(r*Math.pow(1+r,(c*12))));
                double calculation2 = calculation*c*12-a-e;
               mPayment.setText(""+calculation);
               totalPayment.setText(""+calculation2);
            }
        });

    }

    }