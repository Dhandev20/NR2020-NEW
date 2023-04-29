package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HukumHooke extends AppCompatActivity {
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


    private EditText F1, F2, x0, x1, x2, k1, k2, k3, dx,g, m1,m2;

    private Double kseri, kparalel, F1F1, F2F2, x0x0, x1x1, x2x2, k1k1, k2k2, k3k3, m1m1, m2m2, k, dxdx, gg, Ep;


    private Double result;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hukum_hooke );

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
        tampilan13 = findViewById ( R.id.tampilan13 );
        tampilan14 = findViewById ( R.id.tampilan14 );
        tampilan15 = findViewById ( R.id.tampilan15 );


        F1 = findViewById ( R.id.in_Rf );
        F2 = findViewById ( R.id.in_F2 );
        k1 = findViewById ( R.id.in_k1 );
        k2 = findViewById ( R.id.in_k2 );
        k3 = findViewById ( R.id.in_k3 );
        x0 = findViewById ( R.id.in_x0);
        x1 = findViewById ( R.id.in_x1);
        x2 = findViewById ( R.id.in_x2);
        m1 = findViewById ( R.id.in_m1 );
        m2 = findViewById ( R.id.in_m2 );
        dx = findViewById ( R.id.in_dx );
        g = findViewById ( R.id.in_g );

        Button btnF1 = findViewById ( R.id.btn_F );
        Button btnF2 = findViewById ( R.id.btn_F21 );
        Button btnm1 = findViewById ( R.id.btn_M1 );
        Button btnm2 = findViewById ( R.id.btn_M2 );

        Button btnk = findViewById ( R.id.btn_k );
        Button btnx0 = findViewById ( R.id.btn_X0 );
        Button btnx1 = findViewById ( R.id.btn_X1 );
        Button btnx2 = findViewById ( R.id.btn_X2 );
        Button btndx = findViewById ( R.id.btn_dx );
        Button btnSeri = findViewById ( R.id.btn_Seri );
        Button btnPar = findViewById ( R.id.btn_Par );
        Button btnEp = findViewById ( R.id.btn_Ep );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnhapus = findViewById ( R.id.btn_Hapus );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hukum Hooke" );
                tampilan2.setText ( "F1, F2 : gaya " );
                tampilan3.setText ( "m1, m2 : massa" );
                tampilan4.setText ( " X0 : panjang pegas awal" );
                tampilan5.setText ( " X1 : panjang pegas setelah diberi gaya F1" );
                tampilan6.setText ( " X2 : Panjang pegas setelah diberi gaya F2" );
                tampilan7.setText ( " dx : X1 - X0" );
                tampilan8.setText ( " k1, k2, k3 : konstanta pegas " );
                tampilan9.setText ( " X1 : Panjang pegas setelah diberi F1" );
                tampilan10.setText ( " X2 : Panjang pegas setelah diberi F2" );
                tampilan11.setText ( " g : percepatan gravitasi bumi" );
                tampilan12.setText ( " " );

            }});
        btnF1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                    if
                        (!k1.getText ( ).toString ( ).equals ( "" )   &&
                        !x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2. getText ( ).toString ( ).equals ( "" )) {

                k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x2 - x1)" );
                    F1F1 = k1k1 * (x2x2 - x1x1);
                    tampilan2.setText ( " F1 = " + df.format (F1F1)+ "N");

                } else if
                            (!k1.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );

                        tampilan1.setText ( " F = k dx" );
                    F1F1 = k1k1 * dxdx;
                    tampilan2.setText ( " F1 = " + df.format ( F1F1 ) + "N" );
                }
            }})  ;
        btnk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
             if
                (!F1.getText ( ).toString ( ).equals ( "" )   &&
                        !x1.getText ( ).toString ( ).equals ( "" )   &&
                        !x2. getText ( ).toString ( ).equals ( "" )) {

                    F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                    x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x2 - x1);   k = F/(x2 - x1)" );
                    k = F1F1 /(x2x2 - x1x1);
                    tampilan2.setText ( " k = " + df.format (k)+ "N/m");

                } else if
                            (!F1.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {

                        F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                        dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );
                    tampilan1.setText ( " F = k dx,     k = F/dx" );
                    k = F1F1/dxdx;
                    tampilan2.setText ( " k = " + df.format ( k ) + "N/m" );

                }else if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {

                       m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k dx,     k = F/dx,  k = m g/dx" );
                    k = m1m1 * gg / dxdx;
                    tampilan2.setText ( " k = " + df.format ( k ) + "N/m" );
                } else if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2. getText ( ).toString ( ).equals ( "" )) {

                        m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x2 - x1)" );
                 tampilan2.setText ( " k = F/(x2 - x1))" );
                 tampilan3.setText ( " k = mg /(x2 - x1)" );
                    k = m1m1 * gg / (x2x2 - x1x1);
                    tampilan5.setText ( " k = " + df.format ( k ) + "N/m" );
                }}})  ;
        btndx.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

               if ( !g.getText ( ).toString ( ).equals ( "" )   &&
                               !k1.getText ( ).toString ( ).equals ( "" )   &&
                               !k2.getText ( ).toString ( ).equals ( "" )   &&
                               !k3.getText ( ).toString ( ).equals ( "" )   &&
                               !m1. getText ( ).toString ( ).equals ( "" )) {

                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                   k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                   k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );
                   k3k3 = Double.parseDouble ( k3.getText ( ).toString ( ) );
                   m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );

                   tampilan1.setText ( " Pegas SERI" );
                   tampilan2.setText ( " 1/k = 1/k1 + 1/k2 + 1/k3" );
                   tampilan3.setText ( " Setelah diperoleh k lanjutkan" );
                   tampilan4.setText ( " dx = F/k = m*g/k " );
                   kseri = (1/k1k1) + (1/k2k2) +(1/k3k3);
                   kseri = 1/kseri;
                   dxdx = gg*m1m1/kseri;
                   tampilan5.setText ( " k seri = " + df.format ( kseri ) + "N/m" );
                   tampilan6.setText ( " dx = " + df.format ( dxdx ) + "m" );


                   tampilan8.setText ( " Pegas PARALEL" );
                   tampilan9.setText ( " k = k1 + k2 + k3" );
                   tampilan10.setText ( " Setelah diperoleh k lanjutkan" );
                   tampilan11.setText ( " dx = F/k = m*g/k " );
                   kparalel = (k1k1) + (k2k2) +(k3k3);
                   dxdx = gg*m1m1/kparalel;
                   tampilan12.setText ( " k paralel = " + df.format ( kparalel ) + "N/m" );
                   tampilan13.setText ( " dx = " + df.format ( dxdx ) + "m" );


               } else if

               ( !g.getText ( ).toString ( ).equals ( "" )   &&
                               !k1.getText ( ).toString ( ).equals ( "" )   &&
                               !k2.getText ( ).toString ( ).equals ( "" )   &&
                               !m1. getText ( ).toString ( ).equals ( "" )) {

                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                   k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                   k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );
                   m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );

                   tampilan1.setText ( " Pegas SERI" );
                   tampilan2.setText ( " 1/k = 1/k1 + 1/k2 " );
                   tampilan3.setText ( " Setelah diperoleh k lanjutkan" );
                   tampilan4.setText ( " dx = F/k = m*g/k " );
                   kseri = (1 / k1k1) + (1 / k2k2);
                   kseri = 1 / kseri;
                   dxdx = gg * m1m1 / kseri;
                   tampilan5.setText ( " k seri = " + df.format ( kseri ) + "N/m" );
                   tampilan6.setText ( " dx = " + df.format ( dxdx ) + "m" );
                   tampilan8.setText ( " Pegas PARALEL" );
                   tampilan9.setText ( " k = k1 + k2 " );
                   tampilan10.setText ( " Setelah diperoleh k lanjutkan" );
                   tampilan11.setText ( " dx = F/k = m*g/k " );
                   kparalel = (k1k1) + (k2k2);
                   dxdx = gg * m1m1 / kparalel;
                   tampilan12.setText ( " k paralel = " + df.format ( kparalel ) + "N/m" );
                   tampilan13.setText ( " dx = " + df.format ( dxdx ) + "m" );

               }else     if (!F1.getText ( ).toString ( ).equals ( "" )   &&
                           !k1. getText ( ).toString ( ).equals ( "" )) {

                       F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                       k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                       tampilan1.setText ( " F = k dx" );
                       tampilan2.setText ( " dx = F/k" );
                       dxdx = F1F1/k1k1;
                       tampilan4.setText ( " dx = " + df.format (dxdx)+ "m");
                   } else if

                   ( !g.getText ( ).toString ( ).equals ( "" )   &&
                                   !m1.getText ( ).toString ( ).equals ( "" )   &&
                                   !k1. getText ( ).toString ( ).equals ( "" )) {

                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                       m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                       k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                       tampilan1.setText ( " F = k dx" );
                       tampilan2.setText ( " dx = F/k  " );
                       tampilan3.setText ( " dx = mg/k" );
                       dxdx = gg*m1m1/k1k1;
                       tampilan5.setText ( " dx = " + df.format ( dxdx ) + "m" );
               }
            }})  ;
        btnx0.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


                if
                    ( !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !k1. getText ( ).toString ( ).equals ( "" )) {

                        F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                    tampilan1.setText ( " F1 = k (x1 - x0)" );
                    tampilan2.setText ( " x0 = x1 - (F/k)" );
                    x0x0 = x1x1 - (F1F1/k1k1);
                    tampilan4.setText ( " x0 = " + df.format (x0x0)+ "m");
                } else
                if
                    ( !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !k1. getText ( ).toString ( ).equals ( "" )) {

                        m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x1 - x0)" );
                    tampilan2.setText ( " x0 = x1 - (mg/k)" );
                    x0x0 = x1x1 - (m1m1*gg/k1k1);
                    tampilan4.setText ( " x0 = " + df.format (x0x0)+ "m");
                }
            }})  ;

        btnx1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !x0.getText ( ).toString ( ).equals ( "" )   &&
                            !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !k1. getText ( ).toString ( ).equals ( "" )) {

                        F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                        x0x0 = Double.parseDouble ( x0.getText ( ).toString ( ) );
                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                    tampilan1.setText ( " F1 = k (x1 - x0)" );
                    tampilan2.setText ( " x1 = x0 + (F/k)" );
                    x1x1 = x0x0 + (F1F1/k1k1);
                    tampilan4.setText ( " x1 = " + df.format (x1x1)+ "m");
                } else
                if
                    ( !x0.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !k1. getText ( ).toString ( ).equals ( "" )) {

                        m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                        x0x0 = Double.parseDouble ( x0.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x1 - x0)" );
                    tampilan2.setText ( " x1 = x0 + (mg/k)" );
                    x1x1 = x0x0 + (m1m1*gg/k1k1);
                    tampilan4.setText ( " x1 = " + df.format (x1x1)+ "m");
                }
            }})  ;



        btnx2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                    ( !x0.getText ( ).toString ( ).equals ( "" )   &&
                            !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !F2.getText ( ).toString ( ).equals ( "" )   &&
                            !x0. getText ( ).toString ( ).equals ( "" )) {

                        F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                        F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );
                        x0x0 = Double.parseDouble ( x0.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                    tampilan1.setText ( " Cari k:  k = F1/(x1 - x0)" );
                    tampilan2.setText ( "Gunakan k untuk mencari x2" );
                    tampilan3.setText ( " F2 = k (x2 - x0) " );
                    tampilan4.setText ( " x2 = ( F2/k + x0) " );
                    k = F1F1/(x1x1 - x0x0);
                    x2x2 = x0x0 + F2F2/k;
                    tampilan6.setText ( " k = " + df.format (k)+ "N/m");
                    tampilan7.setText ( " x2 = " + df.format (x2x2)+ "m");
                } else
                if
                    ( !g.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !m2.getText ( ).toString ( ).equals ( "" )   &&
                            !x0. getText ( ).toString ( ).equals ( "" )) {

                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x0x0 = Double.parseDouble ( x0.getText ( ).toString ( ) );
                        m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                        m2m2 = Double.parseDouble ( m2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Cari k:  k = m1 g/(x1 - x0)" );
                    tampilan2.setText ( "Gunakan k untuk mencari x2" );
                    tampilan3.setText ( " F2 = k (x2 - x0) = m2 g = k (x2 - x0) " );
                    tampilan4.setText ( " x2 = ( m2 g/k + x0) " );
                    k = (m1m1*gg)/(x1x1 - x0x0);
                    x2x2 =((m2m2 *gg)/k) + x0x0;
                    tampilan6.setText ( " k = " + df.format (k)+ "N/m");
                    tampilan7.setText ( " x2 = " + df.format (x2x2)+ "m");
                }
            }})  ;
        btnm1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !x2. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( " F = k (x2 - x1)" );
                    tampilan2.setText ( " m =  k *(x2 - x1)/g" );
                    m1m1 = k1k1 * (x2x2 - x1x1)/gg;
                    tampilan4.setText ( " m1 = " + df.format (m1m1)+ "kg");
                } else
                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    tampilan1.setText ( " F = k dx" );
                    tampilan2.setText ( " F = mg" );
                    tampilan3.setText ( " m =  k * dx/g" );
                    m1m1 = k1k1 * dxdx/gg;
                    tampilan5.setText ( " m1 = " + df.format ( m1m1 ) + "kg" );
                }}})  ;
        btnSeri.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !k2.getText ( ).toString ( ).equals ( "" )   &&
                            !k3. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );
                        k3k3= Double.parseDouble ( k3.getText ( ).toString ( ) );

                    tampilan1.setText ( " 1/k seri = 1/k1 + 1/k2 + 1/k3)" );
                    kseri =(1/k1k1) + (1/k2k2) + (1/k3k3);
                    kseri = 1/kseri;
                    tampilan2.setText ( " k seri = " + df.format (kseri)+ "N/m");
                } else
                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !k2. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );

                        tampilan1.setText ( " 1/k seri = 1/k1 + 1/k2 )" );
                    tampilan2.setText ( " k seri = k1*k2/(k1 + k2)" );
                    kseri =(1/k1k1) + (1/k2k2);
                    kseri = 1/kseri;
                    tampilan4.setText ( " k seri = " + df.format (kseri)+ "N/m");
                }
            }})  ;
        btnPar.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !k2.getText ( ).toString ( ).equals ( "" )   &&
                            !k3. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );
                        k3k3= Double.parseDouble ( k3.getText ( ).toString ( ) );

                    tampilan1.setText ( " k par = k1 + k2 + k3" );
                    kparalel =  k1k1 + k2k2 + k3k3;
                    tampilan2.setText ( " k par = " + df.format (kparalel)+ "N/m");
                } else
                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !k2. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        k2k2 = Double.parseDouble ( k2.getText ( ).toString ( ) );

                        tampilan1.setText ( " k par = k1 + k2 " );
                    kparalel =  k1k1 + k2k2 ;
                    tampilan2.setText ( " k par = " + df.format (kparalel)+ "N/m");
                }
            }})  ;
        btnEp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );

                        tampilan1.setText ( " Ep = 1/2 k dx^2" );
                    Ep = 0.5* k1k1 * dxdx*dxdx;
                    tampilan2.setText ( " Ep = " + df.format (Ep)+ "joule");

                }
                else if
                    ( !k1.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2. getText ( ).toString ( ).equals ( "" )) {

                        k1k1 = Double.parseDouble ( k1.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Ep = 1/2 k dx^2; Ep = 1/2 k (x2 - x1)^2 " );
                    dxdx = (x2x2 - x1x1);
                    Ep = 0.5 * k1k1 * Math.pow(dxdx,2);
                    tampilan2.setText ( " Ep = " + df.format ( Ep ) + "joule" );
                }
            }  });


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

                F1.setText ( "" );
                F2.setText ( "" );
                x0.setText ( "" );
                x1.setText ( "" );
                x2.setText ( "" );
                k1.setText ( "" );
                k2.setText ( "" );
                k3.setText ( "" );
                dx.setText ( "" );
                g.setText ( "" );
                m1.setText ( "" );
                m2.setText ( "" );
            }});

    }
}

