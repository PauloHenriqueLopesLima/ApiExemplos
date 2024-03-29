package com.example.apiexemplos.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.apiexemplos.R;
import com.example.apiexemplos.model.Game;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.ViewHolder> {

    private List<Game> gameList = new ArrayList<>();

    public void atualizarGames(List<Game> gameList){
        this.gameList = gameList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game_cell,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Game game = gameList.get(position);
        holder.bind(game);

    }

    @Override
    public int getItemCount() {
        return gameList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tituloTextView;
        private TextView descricaoTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tituloTextView = itemView.findViewById(R.id.titulo_textView_id);
            descricaoTextView = itemView.findViewById(R.id.descricao_textView_id);
        }

        public void bind(Game game) {

            tituloTextView.setText(game.getTitulo());
            descricaoTextView.setText(game.getDescricao());

        }
    }
}
