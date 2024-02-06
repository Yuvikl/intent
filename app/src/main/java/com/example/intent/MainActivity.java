package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText t1=(EditText) findViewById(R.id.n1);
                EditText t2=(EditText) findViewById(R.id.n2);

               String a=String.valueOf(t1.getText());
               String b=String.valueOf(t2.getText());

                Intent i=new Intent(MainActivity.this,second_activity.class);

                i.putExtra("num1",a);
                i.putExtra("num2",b);
                startActivity(i);
            }
        });

    }
}