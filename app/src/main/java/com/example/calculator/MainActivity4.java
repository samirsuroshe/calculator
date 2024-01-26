package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    EditText editText,editText2,editText3;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editText = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        editText3 = findViewById(R.id.editTextText3);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().toString().isEmpty()){
                    editText.setError("Enter your name");
                    return;
                }

                if(editText2.getText().toString().isEmpty()){
                    editText2.setError("Enter your number");
                    return;
                }

                if(editText3.getText().toString().isEmpty()){
                    editText3.setError("Enter your name");
                    return;
                }
                String name =editText.getText().toString();
                String number =editText2.getText().toString();
                String collage =editText3.getText().toString();

                SharedPreferences sp = getSharedPreferences("userdata", MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("name", name);
                editor.putString("number", number);
                editor.putString("collage", collage);
                editor.apply();

                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);

                Toast.makeText(MainActivity4.this, "Data saved Successfully", Toast.LENGTH_SHORT).show();

                editText.setText("");
                editText2.setText("");
                editText3.setText("");

                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}