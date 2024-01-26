package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button btnSignUp;
    TextView etUserName, etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp = findViewById(R.id.btnSignUp);
        etUserName = findViewById(R.id.etUserName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etUserName.getText().toString().isEmpty()){
                    etUserName.setError("Enter user name");
                    return;
                }

                if (etEmail.getText().toString().isEmpty()){
                    etEmail.setError("Enter email");
                    return;
                }

                if (etPassword.getText().toString().isEmpty()){
                    etUserName.setError("Enter password");
                    return;
                }

                etUserName.setText("");
                etEmail.setText("");
                etPassword.setText("");
                Toast.makeText(SignUpActivity.this, "Account has created successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}