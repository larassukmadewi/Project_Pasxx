package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tulip extends AppCompatActivity {
    Button btnTulip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tulip);
        btnTulip = (Button) findViewById(R.id.button_tulip);

        btnTulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnTulip = new Intent(Tulip.this,FotoTulip.class);
                startActivity(pindahBtnTulip);
            }
        });
    }
}