package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoMelati extends AppCompatActivity {
    Button btnBackFotoMelati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_melati);
        btnBackFotoMelati = (Button) findViewById(R.id.btn_fotoMelati);

        btnBackFotoMelati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnFotoMelati = new Intent(FotoMelati.this,MainActivity.class);
                startActivity(pindahBtnFotoMelati);
            }
        });
    }
}