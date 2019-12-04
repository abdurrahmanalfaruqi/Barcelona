package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public RecyclerView rvpemain;
    public ArrayList<Pemain> list=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


        rvpemain =findViewById(R.id.rv_pemain);
        rvpemain.setHasFixedSize(true);

        list.addAll(datapemain.getListData());
        showRecylerlist();



    }

    private void showRecylerlist() {
        rvpemain.setLayoutManager(new LinearLayoutManager(this));
        ListPemainAdapter listPemainAdapter =new ListPemainAdapter(list);
        rvpemain.setAdapter(listPemainAdapter);
    }
}
