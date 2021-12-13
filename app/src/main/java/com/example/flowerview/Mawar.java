package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mawar extends AppCompatActivity {
    Button btnMawar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mawar);
        btnMawar = (Button) findViewById(R.id.button_mawar);

        btnMawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnMawar = new Intent(Mawar.this,FotoMawar.class);
                startActivity(pindahBtnMawar);
            }
        });
    }
}