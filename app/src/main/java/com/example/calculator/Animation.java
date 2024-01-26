package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class Animation extends AppCompatActivity {

    Button button1, button2, button3, button4;
    ImageView imageView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        imageView4 = findViewById(R.id.imageView4);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.view.animation.Animation scale = AnimationUtils.loadAnimation(Animation.this, R.anim.scale);
                imageView4.startAnimation(scale);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.view.animation.Animation scale = AnimationUtils.loadAnimation(Animation.this, R.anim.translate);
                imageView4.startAnimation(scale);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                android.view.animation.Animation scale = AnimationUtils.loadAnimation(Animation.this, R.anim.rotate);
                imageView4.startAnimation(scale);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              android.view.animation.Animation scale = AnimationUtils.loadAnimation(Animation.this, R.anim.alpha);
                imageView4.startAnimation(scale);
            }
        });


    }
}