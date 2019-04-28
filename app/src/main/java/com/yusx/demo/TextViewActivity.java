package com.yusx.demo;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.yusx.demo.R;

public class TextViewActivity extends AppCompatActivity {

    private TextView tv_4;
    private TextView tv_5;
    private TextView tv_6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        tv_4 = findViewById(R.id.v4);
        tv_4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);  //下划线
        tv_4.getPaint().setAntiAlias(true);

        tv_5 = findViewById(R.id.v5);
        tv_5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);    //中划线

        tv_6 = findViewById(R.id.v6);
        tv_6.setText(Html.fromHtml("<u>I am Running</u>")); //html下下划线
    }
}
