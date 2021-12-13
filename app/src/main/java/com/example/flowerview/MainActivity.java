package com.example.flowerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgMawar,imgMelati,imgAnggrek,imgTulip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgMawar = (CircleImageView) findViewById(R.id.mawar);
        imgMelati = (CircleImageView) findViewById(R.id.melati);
        imgAnggrek = (CircleImageView) findViewById(R.id.anggrek);
        imgTulip = (CircleImageView) findViewById(R.id.tulip);

        imgMawar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahMawar = new Intent(MainActivity.this,Mawar.class);
                startActivity(pindahMawar);
            }
        });
        imgMelati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahMelati = new Intent(MainActivity.this,Melati.class);
                startActivity(pindahMelati);
            }
        });
        imgAnggrek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahAnggrek = new Intent(MainActivity.this,Anggrek.class);
                startActivity(pindahAnggrek);
            }
        });
        imgTulip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahTulip = new Intent(MainActivity.this,Tulip.class);
                startActivity(pindahTulip);
            }
        });
    }
}