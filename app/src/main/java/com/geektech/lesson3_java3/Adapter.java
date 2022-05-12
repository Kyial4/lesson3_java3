package com.geektech.lesson3_java3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<NameViewHolder> {
    private ArrayList<String> name= new ArrayList<>();

    public Adapter(ArrayList<String> name) {
        this.name = name;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
    holder.bind(name.get(position));
    }

    @Override
    public int getItemCount() {
        return name.size();
    }
}
