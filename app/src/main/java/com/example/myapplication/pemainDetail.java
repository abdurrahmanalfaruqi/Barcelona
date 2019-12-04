package com.example.myapplication;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class pemainDetail extends AppCompatActivity {
    public TextView tvDetail,tvnama;
    public ImageView imgPhoto;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilepemain);

        tvDetail =findViewById(R.id.tv_overview);
        imgPhoto =findViewById(R.id.img_wisataphoto);
        tvnama =findViewById(R.id.tv_judul);




        Pemain extra =getIntent().getParcelableExtra("objek");
       imgPhoto.setImageResource(extra.getPhoto());
        tvDetail.setText(extra.getDetail());
        tvnama.setText(extra.getName());

    }
}








