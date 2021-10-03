package com.example.studentloancalculator;

import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class calculator extends AppCompatActivity{
    private EditText loanAmount,interestRate, loanTerm, loanFees;
    private TextView mPayment, totalPayment;
    public calculator(EditText x,EditText y,EditText z, EditText j, TextView b, TextView l ) {
        loanAmount =  x;
        interestRate = y;
        loanTerm =  z;
        loanFees =  j;
        mPayment = b;
        totalPayment = l;
    }

    public void calculate(){
        double a= Integer.parseInt(loanAmount.getText().toString());
        double b= (Integer.parseInt(interestRate.getText().toString())/100.0);
        double c= Integer.parseInt(loanTerm.getText().toString());
        double e= Integer.parseInt(loanFees.getText().toString());
        double r=b/12;
        double calculation = (a+e)/((Math.pow(1+r, (c*12))-1)/(r*Math.pow(1+r,(c*12))));
        double calculation2 = calculation*c*12-a-e;
        mPayment.setText("$"+round(calculation));
        totalPayment.setText("$"+round(calculation2));
    }
    private double round(double x){
        BigDecimal y = new BigDecimal(Double.toString(x));
        y=y.setScale(2, RoundingMode.HALF_UP);
        return y.doubleValue();
    }
}
