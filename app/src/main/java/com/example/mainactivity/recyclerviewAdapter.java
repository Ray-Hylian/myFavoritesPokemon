package com.example.mainactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerviewAdapter extends RecyclerView.Adapter<recyclerviewAdapter.ViewHolder> {

    Context context;
    String[] pokemonList;
    int[] pokemonImages;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        TextView pokemonName;
        ImageView pokemonImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            pokemonName = itemView.findViewById(R.id.pokemonName);
            pokemonImage = itemView.findViewById(R.id.pokemonImg);

        }
    }

    public recyclerviewAdapter (Context context, String[] pokemonList, int[] pokemonImages){
        this.context = context;
        this.pokemonList = pokemonList;
        this.pokemonImages = pokemonImages;
    }

    @NonNull
    @Override
    public recyclerviewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_items, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewAdapter.ViewHolder holder, int position) {
        holder.pokemonName.setText(pokemonList[position]);
        holder.pokemonImage.setImageResource(pokemonImages[position]);
    }

    @Override
    public int getItemCount() {
        return pokemonList.length;
    }
}
