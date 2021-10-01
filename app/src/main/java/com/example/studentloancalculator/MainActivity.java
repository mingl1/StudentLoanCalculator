package com.example.studentloancalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText loanAmount,interestRate, loanTerm, minimumPayment, loanFees;
    private TextView mPayment, totalPayment;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loanAmount = (EditText) findViewById(R.id.editTextNumber);
        interestRate = (EditText) findViewById(R.id.editTextNumber2);
        loanTerm = (EditText) findViewById(R.id.editTextNumber3);
        minimumPayment = (EditText) findViewById(R.id.editTextNumber4);
        loanFees = (EditText) findViewById(R.id.editTextNumber5);
        mPayment=(TextView)findViewById(R.id.monthly);
        totalPayment=(TextView)findViewById(R.id.total);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // String value1 = loanAmount.getText().toString();
               // String value2 = interestRate.getText().toString();
               // String value3 = loanTerm.getText().toString();
               // String value4 = minimumPayment.getText().toString();
               // String value5 = loanFees.getText().toString();
              //  int a = Integer.parseInt(value1);
             //   int b = Integer.parseInt(value2);
              //  int c = Integer.parseInt(value3);
              //  int d = Integer.parseInt(value4);
              //  int e = Integer.parseInt(value5);
                int a= Integer.parseInt(loanAmount.getText().toString());
                int b= Integer.parseInt(interestRate.getText().toString());
                int c= Integer.parseInt(loanTerm.getText().toString());
                int d= Integer.parseInt(minimumPayment.getText().toString());
                int e= Integer.parseInt(loanFees.getText().toString());


                int calculation = (a*b/100*c);
                int calculation2 = (d*b/100*c + e);
               mPayment.setText(""+calculation);
               totalPayment.setText(""+calculation2);
            }
        });

    }

    }