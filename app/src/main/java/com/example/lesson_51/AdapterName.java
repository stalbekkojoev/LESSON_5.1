package com.example.lesson_51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterName extends RecyclerView.Adapter<AdapterName.ViewHolderName> {
    private ArrayList<String> list;

    public AdapterName(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolderName onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolderName(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderName holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolderName extends RecyclerView.ViewHolder {
        private TextView textView;
        public ViewHolderName(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.tv_contact);
        }

        public void bind(String name) {
            textView.setText(name);
        }
    }
}
