package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class second_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i1= getIntent();

        String x=i1.getStringExtra("num1");
        String y=i1.getStringExtra("num2");

        int sum=Integer.parseInt(x)+Integer.parseInt(y);
        TextView r=(TextView) findViewById(R.id.result);

        r.setText("The sum of "+x+" and "+y+" is : "+sum);
    }
}