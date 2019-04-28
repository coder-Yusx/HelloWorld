package com.yusx.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button loButton;

    private Button tvButton;

    private Button btButton;

    private Button etButton;

    private Button rbButton;

    private Button cbButton;

    private Button ivButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loButton = findViewById(R.id.lo);
        loButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,HorizontalLinearLayoutActivity.class);
                startActivity(intent);
            }
        });

        tvButton = findViewById(R.id.tv);
        tvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        btButton = findViewById(R.id.btv);
        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });

        etButton = findViewById(R.id.btet);
        etButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,EditTextActivity.class);
                startActivity(intent);
            }
        });

        rbButton = findViewById(R.id.btrb);
        rbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RadioButtonActivity.class);
                startActivity(intent);
            }
        });

        cbButton = findViewById(R.id.btcb);
        cbButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CheckBoxActivity.class);
                startActivity(intent);
            }
        });

        ivButton = findViewById(R.id.btiv);
        ivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ImageViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
