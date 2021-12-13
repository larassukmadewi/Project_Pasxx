package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FotoTulip extends AppCompatActivity {
    Button btnBackFotoTulip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto_tulip);
        btnBackFotoTulip =(Button) findViewById(R.id.btn_fotoTulip);

        btnBackFotoTulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnFotoTulip = new Intent(FotoTulip.this,MainActivity.class);
                startActivity(pindahBtnFotoTulip);
            }
        });
    }
}