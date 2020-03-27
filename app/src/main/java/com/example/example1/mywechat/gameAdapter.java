package com.example.example1.mywechat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class gameAdapter extends RecyclerView.Adapter<gameAdapter.myViewHolder> {

        private List<Game> list;
        private Context context;
        private View inflater;

    public gameAdapter(List<Game> gameList) {
        list = gameList;
    }

    @NonNull
    @Override
    public gameAdapter.myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        myViewHolder myViewHolder = new myViewHolder(inflater);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull gameAdapter.myViewHolder holder, int position) {
        Game game = list.get(position);
        holder.playerImage.setImageResource(game.getImageid());
        holder.playerName.setText(game.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class myViewHolder extends RecyclerView.ViewHolder{
        View playerView;
        ImageView playerImage;
        TextView playerName;

        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            playerView = itemView;
            playerImage = itemView.findViewById(R.id.imageView);
            playerName = itemView.findViewById(R.id.textViewPlayerName);
        }
    }

}
