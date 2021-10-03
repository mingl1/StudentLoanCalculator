package com.example.studentloancalculator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText loanAmount,interestRate, loanTerm, loanFees;
    private TextView mPayment, totalPayment;
    private Button button;
    private calculator x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        loanAmount =  findViewById(R.id.editTextNumber);
        interestRate = findViewById(R.id.editTextNumber2);
        loanTerm =  findViewById(R.id.editTextNumber3);
        loanFees =  findViewById(R.id.editTextNumber5);
        mPayment = findViewById(R.id.monthly);
        totalPayment = findViewById(R.id.total);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                x=new calculator(loanAmount, interestRate,loanTerm,loanFees,mPayment,totalPayment);
                x.calculate();
            }
        });

    }



    }