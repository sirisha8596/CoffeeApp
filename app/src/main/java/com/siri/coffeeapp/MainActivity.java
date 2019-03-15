package com.siri.coffeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    String n,c1,i,j;
    double cost;
    TextView ctv,ctv2,tv,tv1;
    int nc1,no,nc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.count);
        tv1 = findViewById(R.id.tcost);
        ctv=findViewById(R.id.ccount);
        ctv2=findViewById(R.id.c2count);
    }

    public void add(View view) {
        n = tv.getText().toString();
        no = Integer.parseInt(n);
        no = no + 1;
        cost = 20.0 * no;
        n = String.valueOf(no);
        c1 = String.valueOf(cost);
        tv.setText(n);
        tv1.setText(c1);
    }
    public void minus(View view) {
        n = tv.getText().toString();
        no = Integer.parseInt(n);
        c1 = tv1.getText().toString();
        cost = Double.parseDouble(c1);
        if (no <= 0) {

            Toast.makeText(this, "count reaches Zero", Toast.LENGTH_SHORT).show();
        } else {
            no = no - 1;
            cost = cost-20.0;
            n = String.valueOf(no);
            c1 = String.valueOf(cost);
            tv.setText(n);
            tv1.setText(c1);
        }
    }

    public void cadd(View view) {
        i=ctv.getText().toString();
        nc=Integer.parseInt(i);
        nc=nc+1;
        i=String.valueOf(nc);
        ctv.setText(i);
    }
    public void cminus(View view) {

     i=ctv.getText().toString();
     nc=Integer.parseInt(i);
     if(nc<=0)
     {
         Toast.makeText(this, "count reaches Zero", Toast.LENGTH_SHORT).show();
     }else {

         nc = nc - 1;
         i = String.valueOf(nc);
         ctv.setText(i);
     }
    }
    public void c2add(View view) {
        j=ctv2.getText().toString();
        nc1=Integer.parseInt(j);
        nc1=nc1+1;
        j=String.valueOf(nc1);
        ctv2.setText(j);
    }
    public void c2minus(View view) {
        j=ctv2.getText().toString();
        nc1=Integer.parseInt(j);
        if(nc1<=0)
        {
            Toast.makeText(this, "count reaches Zero", Toast.LENGTH_SHORT).show();
        }else {

            nc1 = nc1 - 1;
            j = String.valueOf(nc1);
            ctv2.setText(j);
        }
    }
}






