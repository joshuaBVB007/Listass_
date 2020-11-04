package com.example.listass_;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    Context context;
    String data1[];
    String data2[];
    public MyAdapter(Context cont,String s1[],String s2[]){
        context=cont;
        data1=s1;
        data2=s2;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.my_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.Text_1.setText(data1[position]);
        holder.Text_2.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView Text_1,Text_2;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            Text_1=itemView.findViewById(R.id.Text_1);
            Text_2=itemView.findViewById(R.id.Text_2);
        }
    }
}
