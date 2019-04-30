package com.yusx.demo.recycler;

import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.yusx.demo.R;

public class LinearVerRecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_ver_recycler);

        recyclerView = findViewById(R.id.lin_ver_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(LinearVerRecyclerActivity.this));
        recyclerView.addItemDecoration(new MyDecoration());
        recyclerView.setAdapter(new LinearVerRecyclerAdapter(LinearVerRecyclerActivity.this, new LinearVerRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Toast.makeText(LinearVerRecyclerActivity.this,"Click "+pos,Toast.LENGTH_SHORT).show();
            }
        }));
    }

    class MyDecoration extends RecyclerView.ItemDecoration{

        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.set(0,0,0,getResources().getDimensionPixelOffset(R.dimen.divider_height));
        }
    }
}
