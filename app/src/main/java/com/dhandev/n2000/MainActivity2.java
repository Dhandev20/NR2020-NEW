package com.dhandev.n2000;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button Info = findViewById(R.id.btn_Info);
        Button panjang = findViewById(R.id.btn_Panjang);
        Button massa = findViewById(R.id.btn_Massa);
        Button waktu = findViewById(R.id.btn_Time);
        Button kecepatan = findViewById(R.id.btn_Kecepatan);
        Button luas = findViewById(R.id.btn_Luas);
        Button volume = findViewById(R.id.btn_Volume);
        Button sudut = findViewById(R.id.btn_Sudut);
        Button gaya = findViewById(R.id.btn_Gaya);
        Button tekanan = findViewById(R.id.btn_Tekanan);
        Button energi = findViewById(R.id.btn_Energi);
        Button daya = findViewById(R.id.btn_Daya);
        Button termometer = findViewById(R.id.btn_Termometer);
//buat perubahan pada code
        panjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Panjang.class);
                startActivity(intent);
            }} );
        massa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Massa.class);
                startActivity(intent);
            }} );
        luas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Luas.class);
                startActivity(intent);
            }} );
        volume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Volume.class);
                startActivity(intent);
            }} );
        kecepatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Kecepatan.class);
                startActivity(intent);
            }} );
        sudut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Sudut.class);
                startActivity(intent);
            }} );
        waktu.setOnClickListener(new View.OnClickListener() {
          @Override
           public void onClick(View view) {
               Intent intent = new Intent(MainActivity2.this, Waktu.class);
                startActivity(intent);
          }} );
        gaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Gaya.class);
                startActivity(intent);
            }} );
        tekanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Tekanan.class);
                startActivity(intent);
            }} );
        energi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Energi.class);
                startActivity(intent);
            }} );
        daya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, Daya.class);
                startActivity(intent);
            }} );
        termometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, TermoMeter.class);
                startActivity(intent);



                    }
                });

            }}

