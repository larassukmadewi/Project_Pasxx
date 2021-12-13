package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Anggrek extends AppCompatActivity {
    Button btnAnggrek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anggrek);
        btnAnggrek = (Button) findViewById(R.id.button_anggrek);

        btnAnggrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnAnggrek =new Intent(Anggrek.this,FotoAnggrek.class);
                startActivity(pindahBtnAnggrek);
            }
        });
    }
}