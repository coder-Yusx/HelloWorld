package com.yusx.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class CheckBoxActivity extends AppCompatActivity {

    private CheckBox cb1,cb2,cb3,cb4,cb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);

        cb1 = findViewById(R.id.cb_1);
        cb2 = findViewById(R.id.cb_2);
        cb3 = findViewById(R.id.cb_3);
        cb4 = findViewById(R.id.cb_4);
        cb5 = findViewById(R.id.cb_5);

        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText().toString()+"被选中":buttonView.getText().toString()+"未被选中",Toast.LENGTH_SHORT).show();
            }
        });

        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText().toString()+"被选中":buttonView.getText().toString()+"未被选中",Toast.LENGTH_SHORT).show();
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText().toString()+"被选中":buttonView.getText().toString()+"未被选中",Toast.LENGTH_SHORT).show();
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText().toString()+"被选中":buttonView.getText().toString()+"未被选中",Toast.LENGTH_SHORT).show();
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(CheckBoxActivity.this,isChecked?buttonView.getText().toString()+"被选中":buttonView.getText().toString()+"未被选中",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
