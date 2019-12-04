package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class INTRO extends AppCompatActivity implements View.OnClickListener {
    private Button button ;
    private ImageView foto;
    private TextView tulisan1,tulisan2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awal);

        Button btnmoveactivity = findViewById(R.id.button);
        btnmoveactivity.setOnClickListener(this);

        button =findViewById(R.id.button);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent moveIntent = new Intent(INTRO.this, MainActivity.class);
                startActivity(moveIntent);
                break;
        }


    }
}
