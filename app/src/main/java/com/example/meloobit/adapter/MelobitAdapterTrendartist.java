package com.example.meloobit.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.meloobit.R;
import com.example.meloobit.Song;
import com.example.meloobit.models.MelobitData;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MelobitAdapterTrendartist extends RecyclerView.Adapter<MelobitViewHolderTerndartist>{
    Context context;
    List<MelobitData> list;

    public MelobitAdapterTrendartist(Context context, List<MelobitData>list){this.context = context; this.list = list;}

    @NonNull
    @Override
    public MelobitViewHolderTerndartist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MelobitViewHolderTerndartist(LayoutInflater.from(context).inflate(R.layout.rv_item , parent , false));
    }

    @Override
    public void onBindViewHolder(@NonNull MelobitViewHolderTerndartist holder, int position) {
        Picasso.get().load(list.get(position).image.cover_small.url).into(holder.imageView);
        holder.namenewsong.setText(list.get(position).title);
        holder.namenewsinger.setText(list.get(position).fullName);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class MelobitViewHolderTerndartist extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView namenewsong,namenewsinger;


    public MelobitViewHolderTerndartist(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.image_song1);
        namenewsinger = itemView.findViewById(R.id.txt_namesinger);
        namenewsong = itemView.findViewById(R.id.txt_namesong);
    }
}
