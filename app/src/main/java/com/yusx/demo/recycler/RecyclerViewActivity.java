package com.yusx.demo.recycler;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.yusx.demo.R;

public class RecyclerViewActivity extends AppCompatActivity {

    private Button rcvBtn ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        rcvBtn = findViewById(R.id.rcv_list);
        rcvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecyclerViewActivity.this,LinearVerRecyclerActivity.class);
                startActivity(intent);
            }
        });
    }


}
