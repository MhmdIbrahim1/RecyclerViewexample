package com.example.recyclerviewexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShoeAdapter extends RecyclerView.Adapter<ShoeAdapter.ViewHolder> {

    private List<Shoe> shoeList;

    public ShoeAdapter(List<Shoe> shoeList) {
        this.shoeList = shoeList;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView sizeTextView;
        TextView priceTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.show_image);
            nameTextView = itemView.findViewById(R.id.show_name);
            sizeTextView = itemView.findViewById(R.id.show_size);
            priceTextView = itemView.findViewById(R.id.show_price);
        }

        public void bindData(Shoe shoe) {
            imageView.setImageResource(shoe.getImageResId());
            nameTextView.setText(shoe.getName());
            sizeTextView.setText(shoe.getSize());
            priceTextView.setText(shoe.getPrice());
            nameTextView.setMaxLines(1);
        }
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShoeAdapter.ViewHolder holder, int position) {
        holder.bindData(shoeList.get(position));
    }

    @Override
    public int getItemCount() {
        return shoeList.size();
    }
}