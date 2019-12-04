package com.example.myapplication;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListPemainAdapter extends RecyclerView.Adapter<ListPemainAdapter.ListViewHolder> {
    private ArrayList<Pemain> listpemain;

    public ListPemainAdapter(ArrayList<Pemain> list) {
        this.listpemain =list;
    }


    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.listnya,parent,false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Pemain pemain=listpemain.get(position);

        Glide.with(holder.itemView.getContext())
                .load(pemain.getPhoto())
                .apply(new RequestOptions()).override(55,55)
                .into(holder.imgphoto);

        holder.tvName.setText(pemain.getName());
        holder.tvDetail.setText(pemain.getDetail());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(),pemainDetail.class);
                intent.putExtra("objek",listpemain.get(position));
                view.getContext().startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listpemain.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgphoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
