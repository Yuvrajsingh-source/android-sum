package com.example.sumapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber2;
    EditText editTextNumber3;
    TextView textView4;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNumber2=findViewById(R.id.editTextNumber2);
        editTextNumber3=findViewById(R.id.editTextNumber3);
        textView4=findViewById(R.id.textView4);
        button=findViewById(R.id.button);


    }
    public void sum(View view){
        int sum;
        String s=editTextNumber2.getText().toString();
        int a=Integer.parseInt(s);
        String t=editTextNumber3.getText().toString();
        int b=Integer.parseInt(t);
        sum= a+b;
        textView4.setText("Your Sum is:"+sum);
        Toast.makeText(this, "Thanks for choosing this app", Toast.LENGTH_SHORT).show();

    }
    }

