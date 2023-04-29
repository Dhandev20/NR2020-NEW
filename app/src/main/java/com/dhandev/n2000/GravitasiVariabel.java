package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GravitasiVariabel extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;
    private TextView tampilan9;
    private TextView tampilan10;
    private TextView tampilan11;
    private TextView tampilan12;


    private EditText M1, M2, R1, R2, g1, g2, h1, h2, F1, F2;

    private Double M1M1, M2M2, R1R1, R2R2, F1F1,F2F2, g1g1, g2g2,h1h1,h2h2, Ep, F0, A,B,C,D,E;


    private Double result;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gravitasi_variabel );

        tampilan1 = findViewById ( R.id.tampilan1 );
        tampilan2 = findViewById ( R.id.tampilan2 );
        tampilan3 = findViewById ( R.id.tampilan3 );
        tampilan4 = findViewById ( R.id.tampilan4 );
        tampilan5 = findViewById ( R.id.tampilan5 );
        tampilan6 = findViewById ( R.id.tampilan6 );
        tampilan7 = findViewById ( R.id.tampilan7 );
        tampilan8 = findViewById ( R.id.tampilan8 );
        tampilan9 = findViewById ( R.id.tampilan9 );
        tampilan10 = findViewById ( R.id.tampilan10 );
        tampilan11 = findViewById ( R.id.tampilan11 );
        tampilan12 = findViewById ( R.id.tampilan12 );


        M1 = findViewById ( R.id.in_M1 );
        M2 = findViewById ( R.id.in_M2 );
        R1 = findViewById ( R.id.in_R10 );
        R2 = findViewById ( R.id.in_R20 );
        h1 = findViewById ( R.id.in_h1 );
        h2 = findViewById ( R.id.in_h2 );
        F1 = findViewById ( R.id.in_F1);
        F2 = findViewById ( R.id.in_F2);
        g1 = findViewById ( R.id.in_g );
        g2 = findViewById ( R.id.in_g2 );


        Button btnm2 = findViewById ( R.id.btn_M2 );
        Button btnGrav = findViewById ( R.id.btn_Grav );
        Button btnr2 = findViewById ( R.id.btn_R2 );
        Button btnf0 = findViewById ( R.id.btn_F0 );
        Button btnf2 = findViewById ( R.id.btn_F );
        Button btng = findViewById ( R.id.btn_g2 );
        Button btnh2 = findViewById ( R.id.btn_h2 );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hukum Gravitasi" );
                tampilan2.setText ( "M1 : massa benda 1 atau kondisi 1" );
                tampilan3.setText ( "M2 : massa benda 2 atau kondisi 2" );
                tampilan4.setText ( " R1 : jari-jari benda 1 atau jarak antara dua benda atau kondisi 1" );
                tampilan5.setText ( " R2 : jari-jari benda 2 atau  kondisi 2" );
                tampilan6.setText ( " g1 : percepatan gravitasi 1 atau kondisi 1" );
                tampilan7.setText ( " g2 : percepatan gravitasi 2 atau kondisi 2" );
                tampilan8.setText ( " F0 : kondisi gravitasi nol" );
                tampilan9.setText ( " g : percepatan gravitasi" );
                tampilan10.setText ( " h1, h2  : ketinggian di atas bumi" );
                tampilan11.setText ( " Jarak antara dua pusat titik massa gunakan R1 " );

            }});
        btng.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if 
                    (!M2.getText ( ).toString ( ).equals ( "" )   &&
                            !M1.getText ( ).toString ( ).equals ( "" )   &&
                            !R1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )   &&
                            !g1. getText ( ).toString ( ).equals ( "" )) {
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        R1R1 = Double.parseDouble(R1.getText().toString());
                        R2R2 = Double.parseDouble(R2.getText().toString());
                        g1g1 = Double.parseDouble(g1.getText().toString());

                    tampilan1.setText ( " Perbandingan gravitasi jika massa dan jari-jari berbeda" );
                    tampilan2.setText ( " g2/g1 = (-GM2/r2^2)/(-GM1/r1^2)" );
                    tampilan3.setText ( " g2 = (g1 M2 r1^2)/(M1 r2^2)" );
                    A = R1R1 / R2R2;
                    B = Math.pow ( A , 2 );
                    C = M2M2 / M1M1;
                    g2g2 = g1g1 * B * C;
                    tampilan5.setText ( " g2 = " + df.format ( g2g2 ) + " g1" );

                } else

                if
                    (!R1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )   &&
                            !g1. getText ( ).toString ( ).equals ( "" )) {
                        R1R1 = Double.parseDouble(R1.getText().toString());
                        R2R2 = Double.parseDouble(R2.getText().toString());
                        g1g1 = Double.parseDouble(g1.getText().toString());
                    tampilan1.setText ( " Perbandingan gravitasi jika massa tetap dan jari-jari berubah" );
                    tampilan2.setText ( " g2/g1 = (-GM1/r1^2)/(-GM1/r2^2)" );
                    tampilan3.setText ( " g2 = (g1*(r1/r2)^2" );
                    A = R1R1/R2R2;
                    B = Math.pow(A,2);
                    g2g2 = g1g1*B;
                    tampilan5.setText ( " g2 = " + df.format ( g2g2 ) + " g1" );
                } else

                if
                    (!h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                            !g1. getText ( ).toString ( ).equals ( "" )) {
                        h1h1 = Double.parseDouble(h1.getText().toString());
                        h2h2 = Double.parseDouble(h2.getText().toString());
                        g1g1 = Double.parseDouble(g1.getText().toString());
                    tampilan1.setText ( " Perbandingan gravitasi pada ketinggian h" );
                    tampilan2.setText ( " g2/g1 = (-GM1/r2^2)/(-GM1/r1^2)" );
                    tampilan3.setText ( " r1 = h1 + R;  r2 = h2 + R  " );
                    tampilan4.setText ( " g2 = g1*(r1/r2)^2  " );
                    R1R1 = h1h1 + 1;
                    R2R2 = h2h2 + 1;
                    A = R1R1/R2R2;
                    B = Math.pow(A,2);
                    g2g2 = g1g1*B;
                    tampilan6.setText ( " Jarak A dari pusat bumi = " + df.format ( R1R1 ) + " R" );
                    tampilan7.setText ( " Jarak B dari pusat bumi = " + df.format ( R2R2 ) + " R" );
                    tampilan8.setText ( " g2 = " + df.format ( g2g2 ) + " g1" );
                }} });
        btnf2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!R1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )   &&
                            !F1. getText ( ).toString ( ).equals ( "" )) {
                        R1R1 = Double.parseDouble(R1.getText().toString());
                        R2R2 = Double.parseDouble(R2.getText().toString());
                        F1F1 = Double.parseDouble(F1.getText().toString());
                    tampilan1.setText ( " Perbandingan gaya gravitasi jika massa tetap dan jari-jari berbeda" );
                    tampilan2.setText ( " F2/F1 = (-GM2/r2^2)/(-GM1/r1^2)" );
                    tampilan3.setText ( " F2 = (F1  r1^2)/( r2^2)" );
                    A = R1R1 / R2R2;
                    B = Math.pow ( A , 2 );
                    F2F2 = F1F1 * B ;
                    tampilan5.setText ( " F2 = " + df.format ( F2F2 ) + " sama satuan F1" );

                } else

                if
                    (!F1.getText ( ).toString ( ).equals ( "" )   &&
                            !h2. getText ( ).toString ( ).equals ( "" )) {
                        F1F1 = Double.parseDouble(F1.getText().toString());
                        h2h2 = Double.parseDouble(h2.getText().toString());
                    tampilan1.setText ( " Perbandingan gaya gravitasi jika ketinggian berbeda" );
                    tampilan2.setText ( " F2/F1 = (-GM1/r1^2)/(-GM1/r2^2)" );
                    tampilan3.setText ( " F2 = (F1*(r1/r2)^2" );
                    tampilan4.setText ( " r1 = h1 + R;  r2 = h2 + R  " );
                    A =  R1R1;
                    B = R1R1+ h2h2;
                    C = A/B;
                    F2F2 = F1F1*Math.pow(C,2);
                    tampilan5.setText ( " F2 = " + df.format ( F2F2) + " sama satuan F1" );

                }} });

        btnm2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!g2.getText ( ).toString ( ).equals ( "" )   &&
                            !M1.getText ( ).toString ( ).equals ( "" )   &&
                            !R1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )   &&
                            !g1. getText ( ).toString ( ).equals ( "" )) {
                        g2g2 = Double.parseDouble(g2.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        R1R1 = Double.parseDouble(R1.getText().toString());
                        R2R2 = Double.parseDouble(R2.getText().toString());
                        g1g1 = Double.parseDouble(g1.getText().toString());

                        tampilan1.setText ( " Perbandingan massa jika gravitasi dan jari-jari berbeda" );
                    tampilan2.setText ( " g2/g1 = (-GM2/r2^2)/(-GM1/r1^2)" );
                    tampilan3.setText ( " M2 = (g2* r1^2)/(g1*M1*r2^2)" );
                    A = R2R2 / R1R1;
                    B = Math.pow ( A , 2 );
                    C = g2g2 / g1g1;
                    M2M2 = M1M1*B * C;
                    tampilan5.setText ( " M2 = " + df.format ( M2M2 ) + " M1" );

                } else

                if
                    (!M1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )   &&
                            !R1. getText ( ).toString ( ).equals ( "" )) {
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        R1R1 = Double.parseDouble(R1.getText().toString());
                        R2R2 = Double.parseDouble(R2.getText().toString());

                        tampilan1.setText ( " Perbandingan massa jika gravitasi sama dan jari-jari bebeda" );
                    tampilan2.setText ( " g2/g1 = (-GM1/r1^2)/(-GM2/r2^2)" );
                    tampilan3.setText ( " 1 = (-GM1/r1^2)/(-GM2/r2^2)" );
                    tampilan4.setText ( " M2 = M1* (r2/r1)^2" );
                    A = R2R2 / R1R1;
                    B = Math.pow ( A , 2 );
                    M2M2 = M1M1 * B;
                    tampilan6.setText ( " M2 = " + df.format ( M2M2 ) + " M1" );
                } else
                if
                    (!M1.getText ( ).toString ( ).equals ( "" )   &&
                            !g2.getText ( ).toString ( ).equals ( "" )   &&
                            !g1. getText ( ).toString ( ).equals ( "" )) {
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        g1g1 = Double.parseDouble(g1.getText().toString());
                        g2g2 = Double.parseDouble(g2.getText().toString());
                    tampilan1.setText ( "Dua benda ukurannya (vulumenya sama) gravitasinya berbeda)" );
                    tampilan2.setText ( "Menentukan perbandingan massa" );
                    tampilan3.setText ( "Percepatan gravitasi berbading lurus dengan massa, g = -G M/r^2" );
                    tampilan3.setText ( "g1/g2 = M1/M2;  M2 = M1 g2/g1" );
                    M2M2 = M1M1*g2g2/M1M1;

                    tampilan2.setText ( " M2 = " + df.format ( M2M2 ) + " M1" );

                }} });

        btnh2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                M2M2 = Double.parseDouble ( M2.getText ( ).toString ( ) );
                M1M1 = Double.parseDouble ( M1.getText ( ).toString ( ) );
                g1g1 = Double.parseDouble ( g1.getText ( ).toString ( ) );
                g2g2 = Double.parseDouble ( g2.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                h1h1 = Double.parseDouble ( h1.getText ( ).toString ( ) );
                h2h2 = Double.parseDouble ( h2.getText ( ).toString ( ) );
                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );

                if (g2g2!=0 &&  g1g1 !=0) {

                    tampilan1.setText ( " Perbandingan gravitasi pada ketinggian h" );
                    tampilan2.setText ( " g2/g1 = (-GM1/r2^2)/(-GM1/r1^2)" );
                    tampilan3.setText ( " r1 = h1 + R;  r2 = h2 + R  " );
                    tampilan4.setText ( " g2 = g1*(r1/r2)^2  " );
                    tampilan5.setText ( " g1/g2 = (r2/r1)^2  " );
                    tampilan6.setText ( "  (r2/r1) = (g1/g2)^0,5 " );
                    tampilan7.setText ( "  (h2 +R)/R = (g1/g2)^0,5 " );
                    tampilan8.setText ( " Gunakan R sebagai satuan " );
                    tampilan9.setText ( "  h2 = -1 + (g1/g2)^0,5 " );

                    A = g1g1/g2g2;
                    B = Math.pow(A,0.5);
                    h2h2 = B - 1 ;
                    tampilan11.setText ( " h2 = " + df.format ( h2h2 ) + " R" );

                }} });
        btnr2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                M2M2 = Double.parseDouble ( M2.getText ( ).toString ( ) );
                M1M1 = Double.parseDouble ( M1.getText ( ).toString ( ) );
                g1g1 = Double.parseDouble ( g1.getText ( ).toString ( ) );
                g2g2 = Double.parseDouble ( g2.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                h1h1 = Double.parseDouble ( h1.getText ( ).toString ( ) );
                h2h2 = Double.parseDouble ( h2.getText ( ).toString ( ) );
                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );

                if (g2g2!=0 &&  g1g1 !=0 && R1R1 !=0) {
                    tampilan1.setText ( " Perbandingan gravitasi pada ketinggian h" );
                    tampilan2.setText ( " g2/g1 = (-GM1/R2^2)/(-GM1/R1^2)" );
                    tampilan3.setText ( " g1/g2 = (R2/R1)^2  " );
                    tampilan4.setText ( "  (R2/R1) = (g1/g2)^0,5 " );
                    tampilan5.setText ( "  R2 = R1 * (g1/g2)^0,5 " );
                    tampilan6.setText ( " Gunakan R1 sebagai satuan " );
                    tampilan7.setText ( "  R2 =  (g1/g2)^0,5 " );

                    A = g1g1/g2g2;
                    B = Math.pow(A,0.5);
                    h2h2 = B  ;
                    tampilan11.setText ( " R2 = " + df.format ( h2h2 ) + " R" );

                }} });

        btnf0.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                M2M2 = Double.parseDouble ( M2.getText ( ).toString ( ) );
                M1M1 = Double.parseDouble ( M1.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );

                if (M1M1!=0 &&  M2M2 !=0 && R1R1 !=0) {
                    tampilan1.setText ( " Medan gravitasi nol diantara dua massa" );
                    tampilan2.setText ( " g1 = g2" );
                    tampilan3.setText ( " GM1/r1^2 = GM2/r2^2 " );
                    tampilan4.setText ( "  r1 + r2 = R " );
                    tampilan5.setText ( "  kita ganti r1 = x, r2 = R - x " );
                    tampilan6.setText ( " M1/x^2 = M2/(R-x)^2 " );
                    tampilan7.setText ( "  x = R * (M1^0,5)/((M1^0,5) + M2^0,5)" );

                    A = Math.pow(M1M1,0.5);
                    B = Math.pow(M2M2,0.5);
                    h2h2 = R1R1*A/(A+B)  ;
                    tampilan9.setText ( " x = " + df.format ( h2h2 ) + " sama dengan satuan R" );

                }} });

        btnGrav.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent (  GravitasiVariabel.this , Gravitasi.class );
                startActivity ( intent ); }
        } );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                tampilan1.setText ( "" );
                tampilan2.setText ( "" );
                tampilan3.setText ( "" );
                tampilan4.setText ( "" );
                tampilan5.setText ( "" );
                tampilan6.setText ( "" );
                tampilan7.setText ( "" );
                tampilan8.setText ( "" );
                tampilan9.setText ( "" );
                tampilan10.setText ( "" );
                tampilan11.setText ( "" );
                tampilan12.setText ( "" );
                M1.setText ( "" );
                M2.setText ( "" );
                R1.setText ( "" );
                R2.setText ( "" );
                g1.setText ( "" );
                g2.setText ( "" );
                h1.setText ( "" );
                h2.setText ( "" );
                F1.setText ( "" );
                F2.setText ( "" );

            }});
    }
}
