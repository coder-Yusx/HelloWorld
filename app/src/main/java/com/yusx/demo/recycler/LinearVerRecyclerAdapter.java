package com.yusx.demo.recycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.yusx.demo.R;

public class LinearVerRecyclerAdapter extends RecyclerView.Adapter<LinearVerRecyclerAdapter.LinearVerRecyclerHolder> {

    private Context context;

    private OnItemClickListener listener;

    public LinearVerRecyclerAdapter(Context context , OnItemClickListener onItemClickListener) {
        this.context = context;
        this.listener = onItemClickListener;
    }

    @NonNull
    @Override
    public LinearVerRecyclerAdapter.LinearVerRecyclerHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(context).inflate(R.layout.activity_linear_ver_recycler_item, viewGroup, false);
        LinearVerRecyclerHolder linearVerRecyclerHolder = new LinearVerRecyclerHolder(view);
        return linearVerRecyclerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LinearVerRecyclerAdapter.LinearVerRecyclerHolder viewHolder,final int i) {
        viewHolder.textView.setText("没毅力");
        viewHolder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(context,"Click "+i,Toast.LENGTH_SHORT).show();*/
                listener.onClick(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 20;
    }

    class LinearVerRecyclerHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public LinearVerRecyclerHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.lin_ver_rec_item);
        }
    }

    interface OnItemClickListener{
        void onClick(int pos);
    }
}
