package com.yusx.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yusx.demo.layout.HorizontalLinearLayoutActivity;

public class MainActivity extends AppCompatActivity {

    private Button loButton;

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
    }
}
