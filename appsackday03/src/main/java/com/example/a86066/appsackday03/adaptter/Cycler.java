package com.example.a86066.appsackday03.adaptter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.a86066.appsackday03.R;
import com.example.a86066.appsackday03.dean.Userbean;

import java.util.List;

public class Cycler extends RecyclerView.Adapter<Cycler.ViewHolder> {
    private List<Userbean.ResultsBean> list ;
    private Context context;

    public Cycler(List<Userbean.ResultsBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.cyclered, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(list.get(position).getUrl()).into(holder.image);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        public ViewHolder(View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.imagecyc);
        }
    }
}
