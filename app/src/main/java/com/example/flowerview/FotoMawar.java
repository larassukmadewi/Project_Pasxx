package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoMawar extends AppCompatActivity {
    Button btnBackFotoMawar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_mawar);
        btnBackFotoMawar =(Button) findViewById(R.id.btn_fotoMawar);

        btnBackFotoMawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnFotoMawar = new Intent(FotoMawar.this,MainActivity.class);
                startActivity(pindahBtnFotoMawar);
            }
        });
    }
}