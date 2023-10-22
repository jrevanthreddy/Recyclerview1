package com.example.recyclerviewexample2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewexample2.MainActivity;
import com.example.recyclerviewexample2.R;
import com.example.recyclerviewexample2.model.WhatsApp;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.WhatsAppViewHolder> {

    List<WhatsApp> whatsAppList;

    public MyCustomAdapter(List<WhatsApp> whatsAppList) {
        this.whatsAppList = whatsAppList;
    }

    @NonNull
    @Override
    public MyCustomAdapter.WhatsAppViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view,parent,false);
        return new WhatsAppViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.WhatsAppViewHolder holder, int position) {

        WhatsApp whatsApp = whatsAppList.get(position);

        holder.name.setText(whatsApp.getName());
        holder.message.setText(whatsApp.getMessage());
        holder.imageView.setImageResource(whatsApp.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return whatsAppList.size();
    }

    public static class WhatsAppViewHolder extends RecyclerView.ViewHolder{
        TextView name,message;
        ImageView imageView;
        public WhatsAppViewHolder(@NonNull View itemView) {
            super(itemView);

            name  = itemView.findViewById(R.id.name);
            message = itemView.findViewById(R.id.message);
            imageView = itemView.findViewById(R.id.image);
        }
    }
}
