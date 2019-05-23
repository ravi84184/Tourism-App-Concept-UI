package com.nikdemo.foodapplication.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.nikdemo.foodapplication.R;


public class SliderAdapter extends RecyclerView.Adapter {

    private Context context;
    private int[] list;
    public SliderAdapter(Context context, int[] list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_slider_view,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        MyViewHolder holder = (MyViewHolder) viewHolder;
        holder.row_img.setImageDrawable(ContextCompat.getDrawable(context,list[position]));

    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView row_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            row_img = itemView.findViewById(R.id.row_img);

        }
    }
}
