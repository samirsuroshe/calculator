package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    TextView result, getResult, setResult, samir;
    Button add,sub,mul,div,clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1=findViewById(R.id.input1);
        input2=findViewById(R.id.input2);
        result=findViewById(R.id.result);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        clear=findViewById(R.id.reset);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double num1 = Double.parseDouble(input1.getText().toString());
                    Double num2 = Double.parseDouble(input2.getText().toString());
                    Double res = num1 + num2;

                    input1.setText("");
                    input2.setText("");
                    result.setText(res.toString());

                    Toast.makeText(MainActivity.this, "Addition is : " + res, Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double num1 = Double.parseDouble(input1.getText().toString());
                    Double num2 = Double.parseDouble(input2.getText().toString());
                    Double res = num1 - num2;

                    input1.setText("");
                    input2.setText("");
                    result.setText(res.toString());

                    Toast.makeText(MainActivity.this, "Subtraction is : " + res, Toast.LENGTH_SHORT).show();
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double num1 = Double.parseDouble(input1.getText().toString());
                    Double num2 = Double.parseDouble(input2.getText().toString());
                    Double res = num1 * num2;

                    input1.setText("");
                    input2.setText("");
                    result.setText(res.toString());

                    Toast.makeText(MainActivity.this, "Multiplication is : " + res, Toast.LENGTH_SHORT).show();
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (input1.getText().toString().isEmpty() || input2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter valid numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    Double num1 = Double.parseDouble(input1.getText().toString());
                    Double num2 = Double.parseDouble(input2.getText().toString());
                    Double res = num1 / num2;

                    input1.setText("");
                    input2.setText("");
                    result.setText(res.toString());

                    Toast.makeText(MainActivity.this, "Division is : " + res, Toast.LENGTH_SHORT).show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                result.setText("");

                Toast.makeText(MainActivity.this, "Fields cleared", Toast.LENGTH_SHORT).show();
            }
        });

    }
}