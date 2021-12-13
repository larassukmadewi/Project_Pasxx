package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Melati extends AppCompatActivity {
    Button btnMelati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melati);
        btnMelati = (Button) findViewById(R.id.button_melati);

        btnMelati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnMelati = new Intent(Melati.this,FotoMelati.class);
                startActivity(pindahBtnMelati);
            }
        });
    }
}