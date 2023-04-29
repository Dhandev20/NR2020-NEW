package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class HukumCoulomb extends AppCompatActivity {
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
    private TextView tampilan13;
    private TextView tampilan14;
    private TextView tampilan15;
    private TextView tampilan16;
    private TextView tampilan17;
    private TextView tampilan18;
    private TextView tampilan19;
    private TextView tampilan20;
    private TextView tampilan21;
    private TextView tampilan22;
    private TextView tampilan23;
    private TextView tampilan24;
    private TextView tampilan25;
    private TextView tampilan26;
    private TextView tampilan27;
    private TextView tampilan28;
    private TextView tampilan29;
    private TextView tampilan30;
    private EditText q1;
    private EditText q2,q3;
    private EditText x;
    private EditText x1;
    private EditText x2,x3;
    private EditText xf;
    private EditText y;
    private EditText y1;
    private EditText y2, y3;
    private EditText yf;
    private EditText z;
    private EditText z1;
    private EditText z2, z3;
    private EditText zf;

    private Double q1q1,q3q3, k;
    private Double q2q2;
    private Double xx;
    private Double x1x1,xfxf;
    private Double x2x2,x3x3;
    private Double yy;
    private Double y1y1,yfyf;
    private Double y2y2,y3y3;
    private Double zz,z3z3;
    private Double z1z1;
    private Double z2z2,zfzf;
    private Double r12, r13;
    private Double r12i;
    private Double r12j;
    private Double r12k;
    private Double r21, r23, r32,r31;
    private Double r21i;
    private Double r21j;
    private Double r21k;
    private Double r1, r1i, r1j, r1k,rf1i,rf1j,rf1k,rf2i,rf2j,rf2k,rf1,rf2;
    private Double r2, r2i, r2j, r2k;
    private Double r13i, r13j, r13k, r23i,r23j,r23k,r31i,r31j,r31k,r32i,r32j,r32k;

    private Double F12, F13, F31, F1t,F2t,F3t,F1i,F1j,F1k,F2i,F2j,F2k,F3i,F3j,F3k;
    private Double F21, F23, F32;
    private Double nF;
    private Double E, Ei, Ej, Ek, E1i,E1j,E1k,E2i,E2j,E2k;
    private Double EE;
    private Double V,V1,V2;
    private Double Ep,Ep1,Ep2,Epf1,Epf2, W,K,L,M,N,cx,cy,cz;




    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hukum_coulomb );
        tampilan1 = findViewById ( R.id.tampilan1 );
        tampilan2 = findViewById ( R.id.tampilan2 );
        tampilan3 = findViewById ( R.id.tampilan3 );
        tampilan4 = findViewById ( R.id.tampilan4 );
        tampilan5 = findViewById ( R.id.tampilan5 );
        tampilan6 = findViewById ( R.id.tampilan6 );
        tampilan7 = findViewById ( R.id.tampilan7 );
        tampilan8 = findViewById ( R.id.tampilan8 );
        tampilan9 = findViewById ( R.id.tampilan9 );
        tampilan10= findViewById ( R.id.tampilan10 );
        tampilan11 = findViewById ( R.id.tampilan11 );
        tampilan12 = findViewById ( R.id.tampilan12 );
        tampilan13 = findViewById ( R.id.tampilan13 );
        tampilan14 = findViewById ( R.id.tampilan14 );
        tampilan15 = findViewById ( R.id.tampilan15 );
        tampilan16 = findViewById ( R.id.tampilan16 );
        tampilan17 = findViewById ( R.id.tampilan17 );
        tampilan18 = findViewById ( R.id.tampilan18 );
        tampilan19 = findViewById ( R.id.tampilan19 );
        tampilan20= findViewById ( R.id.tampilan20 );
        tampilan21 = findViewById ( R.id.tampilan21 );
        tampilan22 = findViewById ( R.id.tampilan22 );
        tampilan23 = findViewById ( R.id.tampilan23 );
        tampilan24 = findViewById ( R.id.tampilan24 );
        tampilan25 = findViewById ( R.id.tampilan25 );
        tampilan26 = findViewById ( R.id.tampilan26 );
        tampilan27 = findViewById ( R.id.tampilan27 );
        tampilan28 = findViewById ( R.id.tampilan28 );
        tampilan29 = findViewById ( R.id.tampilan29 );
        tampilan30= findViewById ( R.id.tampilan30 );
        q1 = findViewById ( R.id.in_q1 );
        q2 = findViewById ( R.id.in_q2 );
        q3 = findViewById ( R.id.in_q3 );
        x = findViewById ( R.id.in_x );
        x1 = findViewById ( R.id.in_x1 );
        x2 = findViewById ( R.id.in_x2 );
        x3 = findViewById ( R.id.in_x3 );
        xf = findViewById ( R.id.in_xf );
        y = findViewById ( R.id.in_y );
        y1 = findViewById ( R.id.in_y1 );
        y2 = findViewById ( R.id.in_y2 );
        y3 = findViewById ( R.id.in_y3 );
        yf = findViewById ( R.id.in_yf );
        z = findViewById ( R.id.in_z );
        z1 = findViewById ( R.id.in_z1 );
        z2 = findViewById ( R.id.in_z2 );
        z3 = findViewById ( R.id.in_z3 );
        zf = findViewById ( R.id.in_zf );


        Button btnF1t = findViewById ( R.id.btn_F1t );
        Button btnF2t = findViewById ( R.id.btn_F2t );
        Button btnF3t = findViewById ( R.id.btn_F3t );
        Button btnF1 = findViewById ( R.id.btn_F1 );
        Button btnF2 = findViewById ( R.id.btn_F2 );
        Button btnF = findViewById ( R.id.btn_F );
        Button btnE = findViewById ( R.id.btn_E );
        Button btnnE = findViewById ( R.id.btn_nE );
        Button btnV = findViewById ( R.id.btn_V );
        Button btnEp = findViewById ( R.id.btn_Ep );
        Button nol = findViewById ( R.id.btn_Nol );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnW = findViewById ( R.id.btn_W );
        Button btnE0 = findViewById ( R.id.btn_E0 );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hukum Coulomb" );
                tampilan2.setText ( "kalkulator inidigunakan untuk menghitung:" );
                tampilan3.setText ( " 1. gaya Coulomb (vektor)" );
                tampilan4.setText ( " 2. besar gaya Coulomb" );
                tampilan5.setText ( " 3. medan listrik (vektor) " );
                tampilan6.setText ( " 4. besar medan listrik" );
                tampilan7.setText ( " 5. potensial listrik" );
                tampilan8.setText ( " 6. energi potensial listrik" );
                tampilan9.setText ( "7. usaha memindahkan muatan " );
                tampilan10.setText ( " " );
                tampilan11.setText ( " variabel yang digunakan" );
                tampilan12.setText ( "q1 : muatan 1 yatakan miro coulomb " );
                tampilan13.setText ( " q2 : muatan 2 yatakan miro coulomb" );
                tampilan14.setText ( " x1, y1, z1 : posisi q1 " );
                tampilan15.setText ( " x2, y2, z2 : posisi q2" );
                tampilan16.setText ( " xf, yf, zf : posisi akhir q1 atau q2 " );
                tampilan17.setText ( " " );
                tampilan18.setText ( " F12 : gaya [vektor] yang dialami q1, karena keberadaan q2; " );
                tampilan19.setText ( " F21 : gaya [vektor] yang dialami q2, karena keberadaan q1" );
                tampilan20.setText ( " norm F : besar F12 = besar F21" );
                tampilan21.setText ( " E : medan [vektor] listrik oleh q1 dan q2 " );
                tampilan22.setText ( " norm E: besar medan listrik oleh q1 dan q2" );
                tampilan23.setText ( " V potensial listrik oleh q1 dan q2" );
                tampilan24.setText ( " Ep : energi potensial listrik q1 dqn q2" );
                tampilan25.setText ( " W : usaha untuk memindahkan q1 atau q2 ke posisi (xf,yf,zf) " );
                tampilan26.setText ( " E0 : penentuan posisi yang E = 0" );
                tampilan28.setText ( "F1t, F2t, F3t: merupakan gaya Coulomb total pada muatan 1, 2 dan 3" );
                tampilan29.setText ( "SELAMAT BELAJAR" );
                tampilan30.setText ( "SELAMAT BELAJAR" );
            }});
        btnF1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                       (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );


                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;
                    r12k = z1z1 - z2z2;
                    tampilan2.setText ( " " );
                    tampilan3.setText ( "r12 = " + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j + " + df.format ( r12k ) + "k" );
                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 ) + Math.pow ( r12k , 2 );
                    tampilan4.setText ( "r12^2 = " + df.format ( r12 ) );
                    r12 = Math.pow ( r12 , 1.5 );
                    tampilan5.setText ( "r12^3 = " + df.format ( r12 ) );
                    k = 9 * Math.pow ( 10 , 9 );
                    F12 = k * q1q1 * q2q2 / r12;
                    tampilan6.setText ( " " );
                    tampilan7.setText ( "F12 = " + df.format ( F12 ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j + " + df.format ( r12k ) + "k )N" );
                    tampilan8.setText ( "F12 = " + F12.doubleValue ( ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j + " + df.format ( r12k ) + "k )N" );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );
                } else if
                (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );

                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;

                    tampilan2.setText ( " " );
                    tampilan3.setText ( "r12 = " + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j" );
                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 ) ;
                    tampilan4.setText ( "r12^2 = " + df.format ( r12 ) );
                    r12 = Math.pow ( r12 , 1.5 );
                    tampilan5.setText ( "r12^3 = " + df.format ( r12 ) );
                    k = 9 * Math.pow ( 10 , 9 );
                    F12 = k * q1q1 * q2q2 / r12;
                    tampilan6.setText ( " " );
                    tampilan7.setText ( "F12 = " + df.format ( F12 ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j ) N" );
                    tampilan8.setText ( "F12 = " + F12.doubleValue ( ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j )N" );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );

            } }

        });
                btnF2.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick ( View view ) {
                        DecimalFormat df = new DecimalFormat ( "#.#####" );
                        if
                        (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )   &&
                                !z1.getText ( ).toString ( ).equals ( "" )   &&
                                !z2.getText ( ).toString ( ).equals ( "" )) {
                            x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                            x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                            y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                            y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                            z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                            q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                            q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                            z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );


                            tampilan1.setText ( " Gaya listrik pada q2 oleh kehadiran q1 " );
                            tampilan2.setText ( " F21 = k*q1*q2*r21/(r21)^3" );
                            q1q1 = q1q1 * Math.pow ( 10 , -6 );
                            q2q2 = q2q2 * Math.pow ( 10 , -6 );

                                 r21i = x2x2 - x1x1;
                                 r21j = y2y2 - y1y1;
                                 r21k = z2z2 - z1z1;
                            tampilan3.setText ( " " );
                            tampilan4.setText ( "r21 = " + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j + " + df.format ( r21k ) + "k" );
                            r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 ) + Math.pow ( r21k , 2 );
                            tampilan5.setText ( "r21^2 = " + df.format ( r21 ) );
                            r21 = Math.pow ( r21 , 1.5 );
                            tampilan6.setText ( "r21^3 = " + df.format ( r21 ) );
                                    k = 9 * Math.pow ( 10 , 9 );
                                  F21 = k * q1q1 * q2q2 / r21;
                            tampilan7.setText ( "F21 = " + df.format ( F21 ) + " (" + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j + " + df.format ( r21k ) + "k )N" );
                            tampilan8.setText ( "F21 = " + F21.doubleValue ( ) + " (" + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j + " + df.format ( r21k ) + "k )N" );
                            tampilan9.setText ( " " );
                            tampilan10.setText ( " " );
                            tampilan11.setText ( " " );
                        } else if
                        (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                                        !q2.getText ( ).toString ( ).equals ( "" )) {
                            x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                            x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                            y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                            y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                            q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                            q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                            tampilan1.setText ( " Gaya listrik pada q2 oleh kehadiran q1 " );
                            tampilan2.setText ( " F21 = k*q1*q2*r21/(r21)^3" );
                            q1q1 = q1q1 * Math.pow ( 10 , -6 );
                            q2q2 = q2q2 * Math.pow ( 10 , -6 );

                                  r21i = x2x2 - x1x1;
                                  r21j = y2y2 - y1y1;

                            tampilan3.setText ( " " );
                            tampilan4.setText ( "r21 = " + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j "  );
                                     r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 ) ;
                            tampilan5.setText ( "r21^2 = " + df.format ( r21 ) );
                            r21 = Math.pow ( r21 , 1.5 );
                            tampilan6.setText ( "r21^3 = " + df.format ( r21 ) );
                                       k = 9 * Math.pow ( 10 , 9 );
                                     F21 = k* q1q1 * q2q2 / r21;
                            tampilan7.setText ( "F21 = " + df.format ( F21 ) + " (" + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j N " );
                            tampilan8.setText ( "F21 = " + F21.doubleValue ( ) + " (" + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j N " );
                            tampilan9.setText ( " " );
                            tampilan10.setText ( " " );
                            tampilan11.setText ( " " );
                    }

                }}

        );
        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.############" );

                if
                (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );


                    tampilan1.setText ( "Gaya Coulomb antara q1 dan q2 " );
                    tampilan2.setText ( " F = k*q1*q2/(r)^2" );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;
                    r21k = z2z2 - z1z1;
                    r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 ) + Math.pow ( r21k , 2 );
                    tampilan3.setText ( " " );
                    tampilan4.setText ( "r^2 = " + df.format ( r21 ) + " m" );
                    F21 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r21;
                    tampilan5.setText ( "F = " + df.format ( F21 ) + "N" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                } else if
                               (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )) {
                          x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                          x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                          y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                          y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                          q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                          q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    tampilan1.setText ( "Gaya Coulomb antara q1 dan q2 " );
                    tampilan2.setText ( " F = k*q1*q2/(r)^2" );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;

                    r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 ) ;
                    tampilan3.setText ( " " );
                    tampilan4.setText ( "r^2 = " + df.format ( r21 ) + " m" );
                    F21 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r21;
                    tampilan5.setText ( "F = " + df.format ( F21 ) + "N" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
            }}
        }
        );
        btnE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                (!x.getText ( ).toString ( ).equals ( "" )   &&
                        !y.getText ( ).toString ( ).equals ( "" )   &&
                        !z.getText ( ).toString ( ).equals ( "" )   &&
                        !x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                      xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                    yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                    zz = Double.parseDouble ( z.getText ( ).toString ( ) );
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );

                q1q1 =q1q1 * Math.pow(10,-6);
                q2q2 =q2q2 * Math.pow(10,-6);

                tampilan1.setText ( " E = E1 + E2 = k*q1*(r - r1)/(r - r1)^3 + k*q2*(r - r2)/(r - r2)^3" );
                r1i = xx - x1x1;
                r1j = yy - y1y1;
                r1k = zz - z1z1;
                tampilan2.setText ( "r - r1  = " + df.format ( r1i )+" i +"+ df.format ( r1j )+" j +"+ df.format ( r1k )+" k");
                r1 = Math.pow(r1i,2)+Math.pow(r1j,2)+Math.pow(r1k,2);
                tampilan3.setText ( "(r - r1)^2  = " + df.format ( r1 ));
                r1 = Math.pow(r1,1.5);
                tampilan4.setText ( "(r - r1)^3  = " + df.format ( r1 ));
                E1i = 9*Math.pow(10,9)*(q1q1*r1i/r1);
                E1j = 9*Math.pow(10,9)*(q1q1*r1j/r1);
                E1k = 9*Math.pow(10,9)*(q1q1*r1k/r1);
                tampilan5.setText ( "E1 = " + df.format ( E1i ) +" i + "+ df.format ( E1j ) +" j + "+ df.format ( E1k ) +" k   N/C");
                r2i = xx - x2x2;
                r2j = yy - y2y2;
                r2k = zz - z2z2;
                tampilan6.setText ( " " );
                tampilan7.setText ( "r - r2  = " + df.format ( r2i )+" i +"+ df.format ( r2j )+" j + "+ df.format ( r2k )+" k");
                r2 = Math.pow(r2i,2)+Math.pow(r2j,2)+Math.pow(r2k,2);
                tampilan8.setText ( "(r - r2)^2  = " + df.format ( r2 ));
                r2 = Math.pow(r2,1.5);
                tampilan9.setText ( "(r - r1)^3  = " + df.format ( r2 ));
                E2i = 9*Math.pow(10,9)*(q2q2*r2i/r2);
                E2j = 9*Math.pow(10,9)*(q2q2*r2j/r2);
                E2k = 9*Math.pow(10,9)*(q2q2*r2k/r2);
                tampilan10.setText ( "E2 = " + df.format ( E2i ) +" i + "+ df.format ( E2j ) +" j + "+ df.format ( E2k ) +" k   N/C");

                Ei = 9*Math.pow(10,9)*((q1q1*r1i/r1)+(q2q2*r2i/r2));
                Ej = 9*Math.pow(10,9)*((q1q1*r1j/r1)+(q2q2*r2j/r2));
                Ek = 9*Math.pow(10,9)*((q1q1*r1k/r1)+(q2q2*r2k/r2));
                tampilan11.setText ( " " );
                tampilan12.setText ( "E = E1 + E2 =  " + df.format ( Ei ) +" i + "+ df.format ( Ej ) +" j + "+ df.format ( Ek ) +" k  N/C");


                } else if
                (!x.getText ( ).toString ( ).equals ( "" )   &&
                                !y.getText ( ).toString ( ).equals ( "" )   &&
                                !x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )) {
                      xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                    yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );

                    q1q1 =q1q1 * Math.pow(10,-6);
                    q2q2 =q2q2 * Math.pow(10,-6);

                    tampilan1.setText ( " E = E1 + E2 = k*q1*(r - r1)/(r - r1)^3 + k*q2*(r - r2)/(r - r2)^3" );
                    r1i = xx - x1x1;
                    r1j = yy - y1y1;

                    tampilan2.setText ( "r - r1  = " + df.format ( r1i )+" i +"+ df.format ( r1j )+" j ");
                    r1 = Math.pow(r1i,2)+Math.pow(r1j,2)+Math.pow(r1k,2);
                    tampilan3.setText ( "(r - r1)^2  = " + df.format ( r1 ));
                    r1 = Math.pow(r1,1.5);
                    tampilan4.setText ( "(r - r1)^3  = " + df.format ( r1 ));
                    E1i = 9*Math.pow(10,9)*(q1q1*r1i/r1);
                    E1j = 9*Math.pow(10,9)*(q1q1*r1j/r1);

                    tampilan5.setText ( "E1 = " + df.format ( E1i ) +" i + "+ df.format ( E1j ) +" j   N/C ");
                    r2i = xx - x2x2;
                    r2j = yy - y2y2;

                    tampilan6.setText ( " " );
                    tampilan7.setText ( "r - r2  = " + df.format ( r2i )+" i +"+ df.format ( r2j )+" j ");
                    r2 = Math.pow(r2i,2)+Math.pow(r2j,2)+Math.pow(r2k,2);
                    tampilan8.setText ( "(r - r2)^2  = " + df.format ( r2 ));
                    r2 = Math.pow(r2,1.5);
                    tampilan9.setText ( "(r - r1)^3  = " + df.format ( r2 ));
                    E2i = 9*Math.pow(10,9)*(q2q2*r2i/r2);
                    E2j = 9*Math.pow(10,9)*(q2q2*r2j/r2);

                    tampilan10.setText ( "E2 = " + df.format ( E2i ) +" i + "+ df.format ( E2j ) +" j ");

                    Ei = 9*Math.pow(10,9)*((q1q1*r1i/r1)+(q2q2*r2i/r2));
                    Ej = 9*Math.pow(10,9)*((q1q1*r1j/r1)+(q2q2*r2j/r2));

                    tampilan11.setText ( " " );
                    tampilan12.setText ( "E = E1 + E2 =  " + df.format ( Ei ) +" i + "+ df.format ( Ej ) +" j    N/C ");
                }}
        }
        );
        btnnE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );
               if  (!x.getText ( ).toString ( ).equals ( "" )   &&
                       !y.getText ( ).toString ( ).equals ( "" )   &&
                       !z.getText ( ).toString ( ).equals ( "" )   &&
                       !x1.getText ( ).toString ( ).equals ( "" )   &&
                       !x2.getText ( ).toString ( ).equals ( "" )   &&
                       !y1.getText ( ).toString ( ).equals ( "" )   &&
                       !y2.getText ( ).toString ( ).equals ( "" )   &&
                       !q1.getText ( ).toString ( ).equals ( "" )   &&
                       !q2.getText ( ).toString ( ).equals ( "" )   &&
                       !z1.getText ( ).toString ( ).equals ( "" )   &&
                       !z2.getText ( ).toString ( ).equals ( "" )) {
                   xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                   yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                   zz = Double.parseDouble ( z.getText ( ).toString ( ) );
                   x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                   x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                   y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                   y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                   z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                   q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                   q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                   z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );



                   q1q1 = q1q1 * Math.pow(10,-6);
                q2q2 = q2q2 * Math.pow(10,-6);
                tampilan1.setText ( " Medan Listrik oleh q1 dan q2 " );
                tampilan2.setText ( " norm E = (E1^2 + E2^2)^0,5 " );
                r1i = xx - x1x1;
                r1j = yy - y1y1;
                r1k = zz - z1z1;

                r2i = xx - x2x2;
                r2j = yy - y2y2;
                r2k = zz - z2z2;
                r1 = Math.pow(r1i,2)+Math.pow(r1j,2)+Math.pow(r1k,2);
                r1 = Math.pow(r1,1.5);
                r2 = Math.pow(r2i,2)+Math.pow(r2j,2)+Math.pow(r2k,2);
                r2 = Math.pow(r2,1.5);
                Ei = 9*Math.pow(10,9)*((q1q1*r1i/r1)+(q2q2*r2i/r2));
                Ej = 9*Math.pow(10,9)*((q1q1*r1j/r1)+(q2q2*r2j/r2));
                Ek = 9*Math.pow(10,9)*((q1q1*r1k/r1)+(q2q2*r2k/r2));
                EE = Math.pow(Ei,2)+Math.pow(Ej,2)+ Math.pow(Ek,2);
                EE = Math.pow(EE,0.5);
                tampilan3.setText ( " " );
                tampilan4.setText ( "E = " + df.format ( Ei ) +" i +    "+ df.format ( Ej ) +" j +    "+ df.format ( Ek ) +" k            " + "norm E = "+ df.format ( EE ) +"N/C");
                tampilan5.setText ( " " );
                tampilan6.setText ( " " );
                tampilan7.setText ( " " );
                tampilan8.setText ( " " );
                tampilan9.setText ( " " );
                tampilan10.setText ( " " );
               } else if
               (!x.getText ( ).toString ( ).equals ( "" )   &&
                               !y.getText ( ).toString ( ).equals ( "" )   &&
                               !x1.getText ( ).toString ( ).equals ( "" )   &&
                               !x2.getText ( ).toString ( ).equals ( "" )   &&
                               !y1.getText ( ).toString ( ).equals ( "" )   &&
                               !y2.getText ( ).toString ( ).equals ( "" )   &&
                               !q1.getText ( ).toString ( ).equals ( "" )   &&
                               !q2.getText ( ).toString ( ).equals ( "" )) {
                   xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                   yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                   x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                   x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                   y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                   y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                   q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                   q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );

                   q1q1 = q1q1 * Math.pow(10,-6);
                   q2q2 = q2q2 * Math.pow(10,-6);
                   tampilan1.setText ( " Medan Listrik oleh q1 dan q2 " );
                   tampilan2.setText ( " norm E = (E1^2 + E2^2)^0,5 " );
                   r1i = xx - x1x1;
                   r1j = yy - y1y1;

                   r2i = xx - x2x2;
                   r2j = yy - y2y2;

                   r1 = Math.pow(r1i,2)+Math.pow(r1j,2);
                   r1 = Math.pow(r1,1.5);
                   r2 = Math.pow(r2i,2)+Math.pow(r2j,2);
                   r2 = Math.pow(r2,1.5);
                   Ei = 9*Math.pow(10,9)*((q1q1*r1i/r1)+(q2q2*r2i/r2));
                   Ej = 9*Math.pow(10,9)*((q1q1*r1j/r1)+(q2q2*r2j/r2));

                   EE = Math.pow(Ei,2)+Math.pow(Ej,2);
                   EE = Math.pow(EE,0.5);
                   tampilan3.setText ( " " );
                   tampilan4.setText ( "E = " + df.format ( Ei ) +" i +    "+ df.format ( Ej ) +" j   " + "norm E = "+ df.format ( EE ) +"N/C");
                   tampilan5.setText ( " " );
                   tampilan6.setText ( " " );
                   tampilan7.setText ( " " );
                   tampilan8.setText ( " " );
                   tampilan9.setText ( " " );
                   tampilan10.setText ( " " );
            }}
        }
        );
        btnV.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.############" );
                if ( !x.getText ( ).toString ( ).equals ( "" )   &&
                        !y.getText ( ).toString ( ).equals ( "" )   &&
                        !z.getText ( ).toString ( ).equals ( "" )   &&
                        !x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                    xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                    yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                    zz = Double.parseDouble ( z.getText ( ).toString ( ) );
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );

                q1q1 =q1q1 * Math.pow(10,-6);
                q2q2 =q2q2 * Math.pow(10,-6);

                tampilan1.setText ( " V = V1 + v2 " );
                r1i = xx - x1x1;
                r1j = yy - y1y1;
                r1k = zz - z1z1;

                r2i = xx - x2x2;
                r2j = yy - y2y2;
                r2k = zz - z2z2;
                r1 = Math.pow(r1i,2)+Math.pow(r1j,2)+Math.pow(r1k,2);
                r1 = Math.pow(r1,0.5);
                tampilan2.setText ( "|r - r1| = " + df.format ( r1 ) +"m");
                V1 = 9*Math.pow(10,9)*(q1q1/r1);
                tampilan3.setText ( "V1 = " + df.format ( V1 ) +" volt");

                r2 = Math.pow(r2i,2)+Math.pow(r2j,2)+Math.pow(r2k,2);
                r2 = Math.pow(r2,0.5);
                tampilan4.setText ( "|r - r2| = " + df.format ( r2 ) +"m");
                V2 = 9*Math.pow(10,9)*(q2q2/r2);
                tampilan5.setText ( "V2 = " + df.format ( V2 ) +" volt");
                V = 9*Math.pow(10,9)*((q1q1/r1)+(q2q2/r2));

                tampilan6.setText ( "V = V1 + V2 = " + df.format ( V ) +" volt");
                tampilan7.setText ( " " );
                tampilan8.setText ( " " );
                tampilan9.setText ( " " );
                tampilan10.setText ( " " );

          } else if
                (!x.getText ( ).toString ( ).equals ( "" )   &&
                                !y.getText ( ).toString ( ).equals ( "" )   &&
                                !x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )) {
                    xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                    yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( " V = V1 + v2 " );
                    r1i = xx - x1x1;
                    r1j = yy - y1y1;

                    r2i = xx - x2x2;
                    r2j = yy - y2y2;

                    r1 = Math.pow ( r1i , 2 ) + Math.pow ( r1j , 2 );
                    r1 = Math.pow ( r1 , 0.5 );
                    tampilan2.setText ( "|r - r1| = " + df.format ( r1 ) + "m" );
                    V1 = 9 * Math.pow ( 10 , 9 ) * (q1q1 / r1);
                    tampilan3.setText ( "V1 = " + df.format ( V1 ) + " volt" );

                    r2 = Math.pow ( r2i , 2 ) + Math.pow ( r2j , 2 );
                    r2 = Math.pow ( r2 , 0.5 );
                    tampilan4.setText ( "|r - r2| = " + df.format ( r2 ) + "m" );
                    V2 = 9 * Math.pow ( 10 , 9 ) * (q2q2 / r2);
                    tampilan5.setText ( "V2 = " + df.format ( V2 ) + " volt" );
                    V = 9 * Math.pow ( 10 , 9 ) * ((q1q1 / r1) + (q2q2 / r2));

                    tampilan6.setText ( "V = V1 + V2 = " + df.format ( V ) + " volt" );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                }  }}

        );
        btnEp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.############" );
                if (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );;

                q1q1 =q1q1 * Math.pow(10,-6);
                q2q2 =q2q2 * Math.pow(10,-6);

                tampilan1.setText ( "Energi potensial oleh muatan q1 dan q2 " );
                tampilan2.setText ( " Ep = k*q1*q2/(r12)" );
                r12i = x1x1 -x2x2;
                r12j = y1y1 - y2y2;
                r12k = z1z1 - z2z2;
                r12 = Math.pow(r12i,2)+Math.pow(r12j,2)+Math.pow(r12k,2);
                r12 = Math.pow(r12,0.5);
                Ep = 9*Math.pow(10,9)*q1q1*q2q2/r12;
                tampilan3.setText ( "" );
                tampilan4.setText ( "|r12| = " + df.format ( r12 ) + "m");
                tampilan5.setText ( "Ep = " + df.format ( Ep ) + "joule");
                tampilan6.setText ( " " );
                tampilan7.setText ( " " );
                tampilan8.setText ( " " );
                tampilan9.setText ( " " );
                tampilan10.setText ( " " );
           } else if
                               (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )) {

                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( "Energi potensial oleh muatan q1 dan q2 " );
                    tampilan2.setText ( " Ep = k*q1*q2/(r12)" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;

                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                    r12 = Math.pow ( r12 , 0.5 );
                    Ep = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                    tampilan3.setText ( "" );
                    tampilan4.setText ( "|r12| = " + df.format ( r12 ) + "m" );
                    tampilan5.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                }  }

        });
        btnW.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.############" );
                if
                (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !xf.getText ( ).toString ( ).equals ( "" )   &&
                        !yf.getText ( ).toString ( ).equals ( "" )   &&
                        !zf.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );
                    xfxf = Double.parseDouble ( xf.getText ( ).toString ( ) );
                    yfyf = Double.parseDouble ( yf.getText ( ).toString ( ) );
                    zfzf = Double.parseDouble ( zf.getText ( ).toString ( ) );

                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    tampilan1.setText ( " W =  q (V2 - V1) = Ep2 - Ep1" );
                    tampilan2.setText ( " Ep awal = k q1q2/r awal;  Ep akhir = k q1q2/r akhir" );
                    tampilan3.setText ( " q1 tetap q2 berpindah" );
                    tampilan4.setText ( " r awal = |r1-r2|;   r akhir = |rf - r1|" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;
                    r12k = z1z1 - z2z2;
                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 ) + Math.pow ( r12k , 2 );
                    r12 = Math.pow ( r12 , 0.5 );
                    tampilan5.setText ( " " );
                    tampilan6.setText ( "|r1 - r2| = " + df.format ( r12 ) + "m" );
                    Ep1 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                    tampilan7.setText ( "Ep1 = " + df.format ( Ep1 ) + "joule" );

                    rf1i = xfxf - x1x1;
                    rf1j = yfyf - y1y1;
                    rf1k = zfzf - z1z1;
                    rf1 = Math.pow ( rf1i , 2 ) + Math.pow ( rf1j , 2 ) + Math.pow ( rf1k , 2 );
                    rf1 = Math.pow ( rf1 , 0.5 );
                    tampilan9.setText ( "|rf - r1| = " + df.format ( rf1 ) + "m" );
                    Epf1 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / rf1;
                    tampilan10.setText ( "Epf1 = " + df.format ( Epf1 ) + "joule" );
                    W = Epf1 - Ep1;
                    tampilan11.setText ( " " );
                    tampilan12.setText ( "W = " + df.format ( W ) + "joule" );

                    tampilan13.setText ( " " );
                    tampilan14.setText ( " q2 tetap q1 berpindah" );
                    tampilan15.setText ( " r awal = |r1-r2|;   r akhir = |rf - r2|" );
                    tampilan16.setText ( " " );
                    rf2i = xfxf - x2x2;
                    rf2j = yfyf - y2y2;
                    rf2k = zfzf - z2z2;
                    rf2 = Math.pow ( rf2i , 2 ) + Math.pow ( rf2j , 2 ) + Math.pow ( rf2k , 2 );
                    rf2 = Math.pow ( rf2 , 0.5 );
                    tampilan17.setText ( "|rf - r2| = " + df.format ( rf2 ) + "m" );
                    Epf2 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / rf2;
                    tampilan18.setText ( "Epf2 = " + df.format ( Epf2 ) + "joule" );
                    W = Epf2 - Ep1;
                    tampilan19.setText ( " " );
                    tampilan20.setText ( "W = " + df.format ( W ) + "joule" );

                }else if
                (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !xf.getText ( ).toString ( ).equals ( "" )   &&
                                !yf.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    xfxf = Double.parseDouble ( xf.getText ( ).toString ( ) );
                    yfyf = Double.parseDouble ( yf.getText ( ).toString ( ) );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    tampilan1.setText ( " W =  q (V2 - V1) = Ep2 - Ep1" );
                    tampilan2.setText ( " Ep awal = k q1q2/r awal;  Ep akhir = k q1q2/r akhir" );
                    tampilan3.setText ( " q1 tetap q2 berpindah" );
                    tampilan4.setText ( " r awal = |r1-r2|;   r akhir = |rf - r1|" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;

                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                    r12 = Math.pow ( r12 , 0.5 );
                    tampilan5.setText ( " " );
                    tampilan6.setText ( "|r1 - r2| = " + df.format ( r12 ) + "m" );
                    Ep1 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                    tampilan7.setText ( "Ep1 = " + df.format ( Ep1 ) + "joule" );

                    rf1i = xfxf - x1x1;
                    rf1j = yfyf - y1y1;

                    rf1 = Math.pow ( rf1i , 2 ) + Math.pow ( rf1j , 2 );
                    rf1 = Math.pow ( rf1 , 0.5 );
                    tampilan9.setText ( "|rf - r1| = " + df.format ( rf1 ) + "m" );
                    Epf1 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / rf1;
                    tampilan10.setText ( "Epf1 = " + df.format ( Epf1 ) + "joule" );
                    W = Epf1 - Ep1;
                    tampilan11.setText ( " " );
                    tampilan12.setText ( "W = " + df.format ( W ) + "joule" );

                    tampilan13.setText ( " " );
                    tampilan14.setText ( " q2 tetap q1 berpindah" );
                    tampilan15.setText ( " r awal = |r1-r2|;   r akhir = |rf - r2|" );
                    tampilan16.setText ( " " );
                    rf2i = xfxf - x2x2;
                    rf2j = yfyf - y2y2;

                    rf2 = Math.pow ( rf2i , 2 ) + Math.pow ( rf2j , 2 );
                    rf2 = Math.pow ( rf2 , 0.5 );
                    tampilan17.setText ( "|rf - r2| = " + df.format ( rf2 ) + "m" );
                    Epf2 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / rf2;
                    tampilan18.setText ( "Epf2 = " + df.format ( Epf2 ) + "joule" );
                    W = Epf2 - Ep1;
                    tampilan19.setText ( " " );
                    tampilan20.setText ( "W = " + df.format ( W ) + "joule" );

                }

                }
        });

        btnE0.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick ( View view ) {
                        DecimalFormat df = new DecimalFormat ( "#.######" );
                        if
                        (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                !x2.getText ( ).toString ( ).equals ( "" )   &&
                                !y1.getText ( ).toString ( ).equals ( "" )   &&
                                !y2.getText ( ).toString ( ).equals ( "" )   &&
                                !q1.getText ( ).toString ( ).equals ( "" )   &&
                                !q2.getText ( ).toString ( ).equals ( "" )   &&
                                !z1.getText ( ).toString ( ).equals ( "" )   &&
                                !z2.getText ( ).toString ( ).equals ( "" )) {
                            x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                            x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                            y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                            y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                            z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                            q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                            q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                            z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );


                        q1q1 =q1q1 * Math.pow(10,-6);
                        q2q2 =q2q2 * Math.pow(10,-6);

                        tampilan1.setText ( " Menentukan posisi diantara q1 dan q2 yang E = 0" );
                        tampilan2.setText ( " Misal E = 0 di C(xc,yc),zc) maka kuat medan yang dihasilkan oleh muatan" +
                                "q1 = sama besar dengan kuat medan yang dihasilkan oleh q2, dengan arah berlawanan" );
                        tampilan3.setText ( " Jika muatan sejenis maka medan E = 0 terletak segaris diantara dua muatan tersebut" );
                        tampilan4.setText ( " Jika muatan tidak sejenis maka E = 0 terletak segaris di luar dua muatan tersebut" );
                        tampilan5.setText ( " Jika jarak antara dua muatan adalah L, jarak antara muatan q1 dan Eo adalah r, maka" );
                        tampilan6.setText ( " k q1/r^2 = kq2/(L-r)^2" );
                        tampilan7.setText ( " r = L/((q2/q1)^0,5 +1)" );
                        r21i =  x2x2 - x1x1;
                        r21j = y2y2 - y1y1 ;
                        r21k = z2z2 - z1z1 ;
                        tampilan8.setText ( "r2 - r1  = " + df.format ( r21i )+" i +"+ df.format ( r21j )+" j +"+ df.format ( r21k )+" k");
                        r21 = Math.pow(r21i,2)+Math.pow(r21j,2)+Math.pow(r21k,2);
                        tampilan9.setText ( "(r2 - r1)^2  = " + df.format ( r21 ));
                        r21 = Math.pow(r21,0.5);
                        tampilan10.setText ( "|r2 - r1|  = " + df.format ( r21 ));
                        K = q2q2/q1q1;
                if (K>0) {
                        L = Math.pow(K,0.5);
                        M = L + 1;
                        N = r21/M;
                        tampilan11.setText ( "jarak E0 dari q1  = " + df.format ( N ));
                        cx =x1x1 + r21i/M;
                        cy =y1y1 + r21j/M;
                        cz =z1z1 + r21k/M;
                        tampilan12.setText ( "posisi E0  = " + df.format ( cx )+ "i +  "+ df.format ( cy )+"j +  "+ df.format ( cz )+"k");

                    }
                tampilan14.setText ( "Salah satu muatan negatif");

                K = -K;
                        L = Math.pow(K,0.5);
                        cx = (L*x1x1 - x2x2)/(L-1);
                        cy = (L*y1y1 -y2y2)/(L-1);
                        cz = (L*z1z1 - z2z2)/(L-1);
                        tampilan15.setText ( "posisi E0  = " + df.format ( cx )+"i +  "+ df.format ( cy )+"j +  "+ df.format ( cz )+"k");

                        tampilan16.setText ( " " );
                        tampilan17.setText ( " " );

             } else if
                                       (!x1.getText ( ).toString ( ).equals ( "" )   &&
                                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                                        !q2.getText ( ).toString ( ).equals ( "" )) {
                            x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                            x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                            y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                            y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                            q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                            q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );

                            q1q1 = q1q1 * Math.pow ( 10 , -6 );
                            q2q2 = q2q2 * Math.pow ( 10 , -6 );

                            tampilan1.setText ( " menentukan posisi diantara q1 dan q2 yang E = 0" );
                            r21i = x2x2 - x1x1;
                            r21j = y2y2 - y1y1;

                            tampilan2.setText ( "r2 - r1  = " + df.format ( r21i ) + " i +" + df.format ( r21j ) + " j" );
                            r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 ) ;
                            tampilan3.setText ( "(r2 - r1)^2  = " + df.format ( r21 ) );
                            r21 = Math.pow ( r21 , 0.5 );
                            tampilan4.setText ( "|r2 - r1|  = " + df.format ( r21 ) );
                            K = q2q2 / q1q1;
                            if ( K > 0 ) {
                                L = Math.pow ( K , 0.5 );
                                M = L + 1;
                                N = r21 / M;
                                tampilan5.setText ( "jarak E0 dari q1  = " + df.format ( N ) );
                                cx = x1x1 + r21i / M;
                                cy = y1y1 + r21j / M;

                                tampilan6.setText ( "posisi E0  = " + df.format ( cx ) + "i +  " + df.format ( cy ) + "j " );

                            }
                            tampilan7.setText ( "Salah satu muatan negatif" );

                            K = -K;
                            L = Math.pow ( K , 0.5 );
                            cx = (L * x1x1 - x2x2) / (L - 1);
                            cy = (L * y1y1 - y2y2) / (L - 1);

                            tampilan8.setText ( "posisi E0  = " + df.format ( cx ) + "i +  " + df.format ( cy ) + "j" );

                            tampilan9.setText ( " " );
                            tampilan10.setText ( " " );

                        }      }
        }
        );

        btnF1t.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
            if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !q3.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )   &&
                        !z3.getText ( ).toString ( ).equals ( "" )) {
                x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );
                z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );
                z3z3 = Double.parseDouble ( z3.getText ( ).toString ( ) );

                q1q1 = q1q1 * Math.pow ( 10 , -6 );
                q2q2 = q2q2 * Math.pow ( 10 , -6 );
                q3q3 = q3q3 * Math.pow ( 10 , -6 );
                tampilan1.setText ( " MENENTUKAN  GAYA dari q1, q2 dan q3" );
                tampilan2.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                r12i = x1x1 - x2x2;
                r12j = y1y1 - y2y2;
                r12k = z1z1 - z2z2;
                tampilan3.setText ( " " );
                tampilan4.setText ( "r12 = " + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j + " + df.format ( r12k ) + "k" );
                r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 ) + Math.pow ( r12k , 2 );
                tampilan5.setText ( "r12^2 = " + df.format ( r12 ) );
                F12 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                tampilan6.setText ( "besar gaya F12 = " + df.format ( F12 ) + "N" );
                r12 = Math.pow ( r12 , 1.5 );
                tampilan7.setText ( "r12^3 = " + df.format ( r12 ) );
                F12 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                tampilan8.setText ( "F12 = " + df.format ( F12 ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j + " + df.format ( r12k ) + "k )N" );

                tampilan9.setText ( " F13 = k*q1*q3*r13/(r13)^3" );
                r13i = x1x1 - x3x3;
                r13j = y1y1 - y3y3;
                r13k = z1z1 - z3z3;
                tampilan10.setText ( "r13 = " + df.format ( r13i ) + "i + " + df.format ( r13j ) + "j + " + df.format ( r13k ) + "k" );
                r13 = Math.pow ( r13i , 2 ) + Math.pow ( r13j , 2 ) + Math.pow ( r13k , 2 );
                tampilan11.setText ( "r13^2 = " + df.format ( r13 ) );
                F13 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r13;
                tampilan11.setText ( "besar gaya F13 = " + df.format ( F13 ) + "N" );
                r13 = Math.pow ( r13 , 1.5 );
                tampilan12.setText ( "r13^3 = " + df.format ( r13 ) );
                F13 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r13;

                tampilan13.setText ( "F13 = " + df.format ( F13 ) + " (" + df.format ( r13i ) + "i + " + df.format ( r13j ) + "j + " + df.format ( r13k ) + "k )N" );
                F1i = 9 * Math.pow ( 10 , 9 ) * ((q1q1 * q3q3 * r13i / r13) + (q1q1 * q2q2 * r12i / r12));
                F1j = 9 * Math.pow ( 10 , 9 ) * ((q1q1 * q3q3 * r13j / r13) + (q1q1 * q2q2 * r12j / r12));
                F1k = 9 * Math.pow ( 10 , 9 ) * ((q1q1 * q3q3 * r13k / r13) + (q1q1 * q2q2 * r12k / r12));
                tampilan14.setText ( "F1t = " + df.format ( F1i ) + "i + " + df.format ( F1j ) + "j + " + df.format ( F1k ) + "k " );
                F1t = Math.pow ( F1i , 2 ) + Math.pow ( F1j , 2 ) + Math.pow ( F1k , 2 );
                F1t = Math.pow ( F1t , 0.5 );
                tampilan15.setText ( " Besar gaya pada q1 = " + df.format ( F1t ) + "N" );


            } else        if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&

                        !q3.getText ( ).toString ( ).equals ( "" )) {
                x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );


                q1q1 = q1q1 * Math.pow ( 10 , -6 );
                q2q2 = q2q2 * Math.pow ( 10 , -6 );
                q3q3 = q3q3 * Math.pow ( 10 , -6 );
                tampilan1.setText ( " MENENTUKAN  GAYA dari q1, q2 dan q3" );
                tampilan2.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                r12i = x1x1 - x2x2;
                r12j = y1y1 - y2y2;

                tampilan3.setText ( " " );
                tampilan4.setText ( "r12 = " + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j " );
                r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                tampilan5.setText ( "r12^2 = " + df.format ( r12 ) );
                F12 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                tampilan6.setText ( "besar gaya F12 = " + df.format ( F12 ) + "N" );
                r12 = Math.pow ( r12 , 1.5 );
                tampilan7.setText ( "r12^3 = " + df.format ( r12 ) );
                F12 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r12;
                tampilan8.setText ( "F12 = " + df.format ( F12 ) + " (" + df.format ( r12i ) + "i + " + df.format ( r12j ) + "j )N" );

                tampilan9.setText ( " F13 = k*q1*q3*r13/(r13)^3" );
                r13i = x1x1 - x3x3;
                r13j = y1y1 - y3y3;

                tampilan10.setText ( "r13 = " + df.format ( r13i ) + "i + " + df.format ( r13j ) + "j " );
                r13 = Math.pow ( r13i , 2 ) + Math.pow ( r13j , 2 ) ;
                tampilan11.setText ( "r13^2 = " + df.format ( r13 ) );
                F13 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r13;
                tampilan11.setText ( "besar gaya F13 = " + df.format ( F13 ) + "N" );
                r13 = Math.pow ( r13 , 1.5 );
                tampilan12.setText ( "r13^3 = " + df.format ( r13 ) );
                F13 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r13;

                tampilan13.setText ( "F13 = " + df.format ( F13 ) + " (" + df.format ( r13i ) + "i + " + df.format ( r13j ) + "j )N" );
                F1i = 9 * Math.pow ( 10 , 9 ) * ((q1q1 * q3q3 * r13i / r13) + (q1q1 * q2q2 * r12i / r12));
                F1j = 9 * Math.pow ( 10 , 9 ) * ((q1q1 * q3q3 * r13j / r13) + (q1q1 * q2q2 * r12j / r12));

                tampilan14.setText ( "F1t = " + df.format ( F1i ) + "i + " + df.format ( F1j ) + "j " );
                F1t = Math.pow ( F1i , 2 ) + Math.pow ( F1j , 2 )
                ;
                F1t = Math.pow ( F1t , 0.5 );
                tampilan15.setText ( " Besar gaya pada q1 = " + df.format ( F1t ) + "N" );


            }     }

});

        btnF2t.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !q3.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )   &&
                        !z3.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );
                    z3z3 = Double.parseDouble ( z3.getText ( ).toString ( ) );

                q1q1 =q1q1 * Math.pow(10,-6);
                q2q2 =q2q2 * Math.pow(10,-6);
                q3q3 =q3q3 * Math.pow(10,-6);

                tampilan1.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                r21i = x2x2 -x1x1;
                r21j = y2y2 - y1y1;
                r21k = z2z2 - z1z1;
                tampilan2.setText ( "r21 = " + df.format ( r21i )+"i + " +df.format ( r21j )+"j + "+ df.format ( r21k )+"k");
                r21 = Math.pow(r21i,2)+Math.pow(r21j,2)+Math.pow(r21k,2);
                tampilan3.setText ( "r21^2 = " + df.format ( r21 ));
                F21 = 9*Math.pow(10,9)*q1q1*q2q2/r21;
                tampilan4.setText ( "besar gaya F21 = " + df.format ( F21 )+"N");
                r21 = Math.pow(r21,1.5);
                tampilan5.setText ( "r21^3 = " + df.format ( r21 ));
                F21 = 9*Math.pow(10,9)*q1q1*q2q2/r21;
                tampilan6.setText ( "F12 = " + df.format ( F21 ) + " (" +df.format ( r21i )+ "i + " +df.format ( r21j )+ "j + " +df.format ( r21k )+"k )N");

                tampilan8.setText ( " F23 = k*q2*q3*r13/(r23)^3" );
                r23i = x2x2 -x3x3;
                r23j = y2y2 - y3y3;
                r23k = z2z2 - z3z3;
                tampilan9.setText ( "r23 = " + df.format ( r23i )+"i + " +df.format ( r23j )+"j + "+ df.format ( r23k )+"k");
                r23 = Math.pow(r23i,2)+Math.pow(r23j,2)+Math.pow(r23k,2);
                tampilan10.setText ( "r23^2 = " + df.format ( r23 ));
                F23 = 9*Math.pow(10,9)*q2q2*q3q3/r23;
                tampilan11.setText ( "besar gaya F23 = " + df.format ( F23 )+"N");
                r23 = Math.pow(r23,1.5);
                tampilan12.setText ( "r23^3 = " + df.format ( r23 ));
                F23 = 9*Math.pow(10,9)*q2q2*q3q3/r23;

                tampilan13.setText ( "F23 = " + df.format ( F23 ) + " (" +df.format ( r23i )+ "i + " +df.format ( r23j )+ "j + " +df.format ( r23k )+"k )N");
                F2i = 9*Math.pow(10,9)*((q2q2*q3q3*r13i/r23)+(q1q1*q2q2*r12i/r21));
                F2j = 9*Math.pow(10,9)*((q2q2*q3q3*r13j/r23)+(q1q1*q2q2*r12j/r21));
                F2k = 9*Math.pow(10,9)*((q2q2*q3q3*r13k/r23)+(q1q1*q2q2*r12k/r21));
                tampilan14.setText ( "F2t = "  +df.format ( F2i )+ "i + " +df.format ( F2j )+ "j + " +df.format ( F2k )+ "k   N");
                F2t = Math.pow(F2i,2)+ Math.pow(F2j,2)+ Math.pow(F2k,2);
                F2t = Math.pow(F2t,0.5);
                tampilan15.setText ( " Besar gaya pada q2 = "  +df.format ( F2t )+ "N" );

                } else        if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !q3.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    q3q3 = q3q3 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( " F12 = k*q1*q2*r12/(r12)^3" );
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;

                    tampilan2.setText ( "r21 = " + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j " );
                    r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 );
                    tampilan3.setText ( "r21^2 = " + df.format ( r21 ) );
                    F21 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r21;
                    tampilan4.setText ( "besar gaya F21 = " + df.format ( F21 ) + "N" );
                    r21 = Math.pow ( r21 , 1.5 );
                    tampilan5.setText ( "r21^3 = " + df.format ( r21 ) );
                    F21 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q2q2 / r21;
                    tampilan6.setText ( "F12 = " + df.format ( F21 ) + " (" + df.format ( r21i ) + "i + " + df.format ( r21j ) + "j )N" );

                    tampilan8.setText ( " F23 = k*q2*q3*r13/(r23)^3" );
                    r23i = x2x2 - x3x3;
                    r23j = y2y2 - y3y3;

                    tampilan9.setText ( "r23 = " + df.format ( r23i ) + "i + " + df.format ( r23j ) + "j" );
                    r23 = Math.pow ( r23i , 2 ) + Math.pow ( r23j , 2 ) + Math.pow ( r23k , 2 );
                    tampilan10.setText ( "r23^2 = " + df.format ( r23 ) );
                    F23 = 9 * Math.pow ( 10 , 9 ) * q2q2 * q3q3 / r23;
                    tampilan11.setText ( "besar gaya F23 = " + df.format ( F23 ) + "N" );
                    r23 = Math.pow ( r23 , 1.5 );
                    tampilan12.setText ( "r23^3 = " + df.format ( r23 ) );
                    F23 = 9 * Math.pow ( 10 , 9 ) * q2q2 * q3q3 / r23;

                    tampilan13.setText ( "F23 = " + df.format ( F23 ) + " (" + df.format ( r23i ) + "i + " + df.format ( r23j ) + "j  )N" );
                    F2i = 9 * Math.pow ( 10 , 9 ) * ((q2q2 * q3q3 * r13i / r23) + (q1q1 * q2q2 * r12i / r21));
                    F2j = 9 * Math.pow ( 10 , 9 ) * ((q2q2 * q3q3 * r13j / r23) + (q1q1 * q2q2 * r12j / r21));

                    tampilan14.setText ( "F2t = " + df.format ( F2i ) + "i + " + df.format ( F2j ) + "j  N" );
                    F2t = Math.pow ( F2i , 2 ) + Math.pow ( F2j , 2 );
                    F2t = Math.pow ( F2t , 0.5 );
                    tampilan15.setText ( " Besar gaya pada q2 = " + df.format ( F2t ) + "N" );
                }  }

        });

        btnF3t.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !q3.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                        !z2.getText ( ).toString ( ).equals ( "" )   &&
                        !z3.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                    z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );
                    z2z2 = Double.parseDouble ( z2.getText ( ).toString ( ) );
                    z3z3 = Double.parseDouble ( z3.getText ( ).toString ( ) );

                    q1q1 =q1q1 * Math.pow(10,-6);
                q2q2 =q2q2 * Math.pow(10,-6);
                q3q3 =q3q3 * Math.pow(10,-6);

                tampilan1.setText ( " F31 = k*q1*q3*r31/(r31)^3" );
                r31i = x3x3 -x1x1;
                r31j = y3y3 - y1y1;
                r31k = z3z3 - z1z1;
                tampilan2.setText ( "r31 = " + df.format ( r31i )+"i + " +df.format ( r31j )+"j + "+ df.format ( r31k )+"k");
                r31 = Math.pow(r31i,2)+Math.pow(r31j,2)+Math.pow(r31k,2);
                tampilan3.setText ( "r21^2 = " + df.format ( r21 ));
                F31 = 9*Math.pow(10,9)*q1q1*q3q3/r31;
                tampilan4.setText ( "besar gaya F31 = " + df.format ( F31 )+"N");
                r31 = Math.pow(r31,1.5);
                tampilan5.setText ( "r31^3 = " + df.format ( r31 ));
                F31 = 9*Math.pow(10,9)*q1q1*q3q3/r31;
                tampilan6.setText ( "F31 = " + df.format ( F31 ) + " (" +df.format ( r31i )+ "i + " +df.format ( r31j )+ "j + " +df.format ( r31k )+"k )N");

                tampilan8.setText ( " F32 = k*q2*q3*r32/(r32)^3" );
                r32i = x3x3 -x2x2;
                r32j = y3y3 - y2y2;
                r32k = z3z3 - z2z2;
                tampilan9.setText ( "r32 = " + df.format ( r32i )+"i + " +df.format ( r32j )+"j + "+ df.format ( r32k )+"k");
                r32 = Math.pow(r32i,2)+Math.pow(r32j,2)+Math.pow(r32k,2);
                tampilan10.setText ( "r32^2 = " + df.format ( r32 ));
                F32 = 9*Math.pow(10,9)*q2q2*q3q3/r32;
                tampilan11.setText ( "besar gaya F32 = " + df.format ( F32 )+"N");
                r32 = Math.pow(r32,1.5);
                tampilan12.setText ( "r32^3 = " + df.format ( r32 ));
                F32 = 9*Math.pow(10,9)*q2q2*q3q3/r32;

                tampilan13.setText ( "F32 = " + df.format ( F32 ) + " (" +df.format ( r32i )+ "i + " +df.format ( r32j )+ "j + " +df.format ( r32k )+"k )N");
                F3i = 9*Math.pow(10,9)*((q2q2*q3q3*r32i/r32)+(q1q1*q3q3*r31i/r31));
                F3j = 9*Math.pow(10,9)*((q2q2*q3q3*r32j/r32)+(q1q1*q3q3*r31j/r31));
                F3k = 9*Math.pow(10,9)*((q2q2*q3q3*r32k/r23)+(q1q1*q3q3*r31k/r31));
                tampilan14.setText ( "F3t = "  +df.format ( F3i )+ "i + " +df.format ( F3j )+ "j + " +df.format ( F3k )+ "k   N");
                F3t = Math.pow(F3i,2)+ Math.pow(F3j,2)+ Math.pow(F3k,2);
                F3t = Math.pow(F3t,0.5);
                tampilan15.setText ( " Besar gaya pada q3 = "  +df.format ( F3t )+ "N" );

                } else        if    (!x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2.getText ( ).toString ( ).equals ( "" )   &&
                        !x3.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !y2.getText ( ).toString ( ).equals ( "" )   &&
                        !y3.getText ( ).toString ( ).equals ( "" )   &&
                        !q1.getText ( ).toString ( ).equals ( "" )   &&
                        !q2.getText ( ).toString ( ).equals ( "" )   &&
                        !q3.getText ( ).toString ( ).equals ( "" )) {
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                    y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                    y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    y3y3 = Double.parseDouble ( y3.getText ( ).toString ( ) );
                    q1q1 = Double.parseDouble ( q1.getText ( ).toString ( ) );
                    q2q2 = Double.parseDouble ( q2.getText ( ).toString ( ) );
                    q3q3 = Double.parseDouble ( q3.getText ( ).toString ( ) );
                    q1q1 = q1q1 * Math.pow ( 10 , -6 );
                    q2q2 = q2q2 * Math.pow ( 10 , -6 );
                    q3q3 = q3q3 * Math.pow ( 10 , -6 );

                    tampilan1.setText ( " F31 = k*q1*q3*r31/(r31)^3" );
                    r31i = x3x3 - x1x1;
                    r31j = y3y3 - y1y1;

                    tampilan2.setText ( "r31 = " + df.format ( r31i ) + "i + " + df.format ( r31j ) + "j " );
                    r31 = Math.pow ( r31i , 2 ) + Math.pow ( r31j , 2 ) + Math.pow ( r31k , 2 );
                    tampilan3.setText ( "r21^2 = " + df.format ( r21 ) );
                    F31 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r31;
                    tampilan4.setText ( "besar gaya F31 = " + df.format ( F31 ) + "N" );
                    r31 = Math.pow ( r31 , 1.5 );
                    tampilan5.setText ( "r31^3 = " + df.format ( r31 ) );
                    F31 = 9 * Math.pow ( 10 , 9 ) * q1q1 * q3q3 / r31;
                    tampilan6.setText ( "F31 = " + df.format ( F31 ) + " (" + df.format ( r31i ) + "i + " + df.format ( r31j ) + "j)N" );

                    tampilan8.setText ( " F32 = k*q2*q3*r32/(r32)^3" );
                    r32i = x3x3 - x2x2;
                    r32j = y3y3 - y2y2;

                    tampilan9.setText ( "r32 = " + df.format ( r32i ) + "i + " + df.format ( r32j ) + "j " );
                    r32 = Math.pow ( r32i , 2 ) + Math.pow ( r32j , 2 ) + Math.pow ( r32k , 2 );
                    tampilan10.setText ( "r32^2 = " + df.format ( r32 ) );
                    F32 = 9 * Math.pow ( 10 , 9 ) * q2q2 * q3q3 / r32;
                    tampilan11.setText ( "besar gaya F32 = " + df.format ( F32 ) + "N" );
                    r32 = Math.pow ( r32 , 1.5 );
                    tampilan12.setText ( "r32^3 = " + df.format ( r32 ) );
                    F32 = 9 * Math.pow ( 10 , 9 ) * q2q2 * q3q3 / r32;

                    tampilan13.setText ( "F32 = " + df.format ( F32 ) + " (" + df.format ( r32i ) + "i + " + df.format ( r32j ) + "j  )N" );
                    F3i = 9 * Math.pow ( 10 , 9 ) * ((q2q2 * q3q3 * r32i / r32) + (q1q1 * q3q3 * r31i / r31));
                    F3j = 9 * Math.pow ( 10 , 9 ) * ((q2q2 * q3q3 * r32j / r32) + (q1q1 * q3q3 * r31j / r31));

                    tampilan14.setText ( "F3t = " + df.format ( F3i ) + "i + " + df.format ( F3j ) + "j ) N" );
                    F3t = Math.pow ( F3i , 2 ) + Math.pow ( F3j , 2 ) ;
                    F3t = Math.pow ( F3t , 0.5 );
                    tampilan15.setText ( " Besar gaya pada q3 = " + df.format ( F3t ) + "N" );

                }    }

        });


        hapus.setOnClickListener ( new View.OnClickListener ( ) {
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
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                tampilan16.setText ( "" );
                tampilan17.setText ( "" );
                tampilan18.setText ( "" );
                tampilan19.setText ( "" );
                tampilan20.setText ( "" );
                tampilan21.setText ( "" );
                tampilan22.setText ( "" );
                tampilan23.setText ( "" );
                tampilan24.setText ( "" );
                tampilan25.setText ( "" );
                tampilan26.setText ( "" );
                tampilan27.setText ( "" );
                tampilan28.setText ( "" );
                tampilan29.setText ( "" );
                tampilan30.setText ( "" );

                q1.setText ( "" );
                q2.setText ( "" );
                q3.setText ( "" );
                x.setText ( "" );
                x1.setText ( "" );
                x2.setText ( "" );
                x3.setText ( "" );
                y.setText ( "" );
                y1.setText ( "" );
                y2.setText ( "" );
                y3.setText ( "" );
                z.setText ( "" );
                z1.setText ( "" );
                z2.setText ( "" );
                z3.setText ( "" );
                xf.setText ( "" );
                yf.setText ( "" );
                zf.setText ( "" );

            }
        } );
    }
}















