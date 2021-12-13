package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoAnggrek extends AppCompatActivity {
    Button btnBackFotoAnggrek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_anggrek);
        btnBackFotoAnggrek = (Button) findViewById(R.id.btn_fotoAnggrek);

        btnBackFotoAnggrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnFotoAnggrek = new Intent(FotoAnggrek.this,MainActivity.class);
                startActivity(pindahBtnFotoAnggrek);
            }
        });
    }
}