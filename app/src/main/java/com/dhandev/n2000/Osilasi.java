package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class Osilasi extends AppCompatActivity {
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
    private EditText m, g, L, W, f, dy, T,A, k, t;

    private Double mm, gg, LL, WW, ff, dydy, TT, kk, AA, acc, vv,vtvt, tt;
    private Double X,Y,Z;
    private Double cos, sin, tan, deg;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_osilasi );
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
        m = findViewById ( R.id.in_m );
        k = findViewById ( R.id.in_k );
        L = findViewById ( R.id.in_L );
        T = findViewById ( R.id.in_T );
        g = findViewById ( R.id.in_g );
        f = findViewById ( R.id.in_f );
        W = findViewById ( R.id.in_W );
        dy = findViewById ( R.id.in_dy );
        A = findViewById ( R.id.in_A );
        t = findViewById ( R.id.in_time );

        Button btnk = findViewById ( R.id.btn_k );
        Button btnm = findViewById ( R.id.btn_m );
        Button btnf = findViewById ( R.id.btn_f );
        Button btnl = findViewById ( R.id.btn_L );
        Button btnW = findViewById ( R.id.btn_W );
        Button btnT = findViewById ( R.id.btn_T );
        Button btng = findViewById ( R.id.btn_g );
        Button btnacc = findViewById ( R.id.btn_amax );
        Button btnvt = findViewById ( R.id.btn_Vt );
        Button btnvmax = findViewById ( R.id.btn_v );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnhapus = findViewById ( R.id.btn_Hapus );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {

                tampilan1.setText ( " Osilasi" );
                tampilan2.setText ( " Variabel yang digunakan" );
                tampilan3.setText ( " k : konstanta pegas" );
                tampilan4.setText ( " m : massa beban" );
                tampilan5.setText ( " L : panjang tali" );
                tampilan6.setText ( " dy : perubahan panjang pegas" );
                tampilan7.setText ( " g : percepatan gravitasi" );
                tampilan8.setText ( " W : dibaca omega : kecepatan sudut" );
                tampilan9.setText ( " f : frekuensi" );
                tampilan10.setText ( " T : periode osilasi" );
                tampilan11.setText ( " t : selang waktu" );
                tampilan12.setText ( " A : amplitudo" );
                tampilan13.setText ( " Vt : kecepatan saat t" );
                tampilan14.setText ( " v.max : kecepatan maksimum" );
                tampilan15.setText ( " a.max : percepatan maksimum" );

            }});



        btnk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );
                if
                (!m.getText ( ).toString ( ).equals ( "" ) &&
                        !dy.getText ( ).toString ( ).equals ( "" ) &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "Sebuah pegas dengan konstanta pegas k diberikan " +
                            "gaya F mengalami pertambahan panjang dy" );
                    tampilan2.setText ( " F = k dy " );
                    tampilan3.setText ( " k = F/dy " );
                    tampilan4.setText ( " F = m g " );
                    tampilan5.setText ( " k = m g/dy " );
                    kk = mm*gg/dydy;
                    tampilan6.setText ( " k =" + df.format ( kk ) + "N/m" );

                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !W.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( " W = (k/m)^0,5 ;  W = omega" );
                    tampilan2.setText ( " k = m W^2 " );
                    kk = mm*Math.pow(WW,2);
                    tampilan3.setText ( " k =" + df.format ( kk ) + "N/m" );

                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !f.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    ff = Double.parseDouble(f.getText().toString());

                    tampilan1.setText ( " Sistem massa pegas " );
                    tampilan2.setText ( " W = (k/m)^0,5;  W = omega " );
                    tampilan3.setText ( " k = m W^2;   " );
                    tampilan4.setText ( " W = 2 pi f " );
                    tampilan5.setText ( " k = m ( 2 pi f)^2 " );
                    WW = 6.28*ff;
                    Y = Math.pow(WW,2);
                    kk = mm*Y;
                    tampilan6.setText ( " k =" + df.format ( kk ) + "N/m" );
                }
            }}
        );
        btnm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                (!k.getText ( ).toString ( ).equals ( "" ) &&
                        !dy.getText ( ).toString ( ).equals ( "" ) &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    kk = Double.parseDouble(k.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Sistem massa pegas" );
                    tampilan2.setText ( " F = k dy" );
                    tampilan3.setText ( " F = mg " );
                    tampilan4.setText ( " m = k dy/g " );
                    mm = kk*dydy/gg;
                    tampilan5.setText ( " m =" + df.format ( mm ) + "kg" );

                } else if

                (!k.getText ( ).toString ( ).equals ( "" ) &&
                                !W.getText ( ).toString ( ).equals ( "" )){

                    kk = Double.parseDouble(k.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( "W = (k/m)^0,5" );
                    tampilan2.setText ( "      m = k/ W^2 " );
                    mm = kk/Math.pow(WW,2);
                    tampilan4.setText ( "m =" + df.format ( mm ) + "kg" );

                } else if

                (!k.getText ( ).toString ( ).equals ( "" )   &&
                                !f.getText ( ).toString ( ).equals ( "" )) {

                    kk = Double.parseDouble(k.getText().toString());
                    ff = Double.parseDouble(f.getText().toString());

                    tampilan1.setText ( " Sistem massa pegas" );
                    tampilan2.setText ( " W = (k/m)^0,5, W ( omega)" );
                    tampilan3.setText ( " W = 2 pi f " );
                    tampilan4.setText ( " m = k/ (2 pi f)^2 " );
                    WW = 6.28*ff;
                    mm = kk/Math.pow(WW,2);

                    tampilan5.setText ( "m =" + df.format ( mm ) + "kg" );
                }
            }}
        );
        btnl.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                (!W.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    WW = Double.parseDouble(W.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Sistem ayunan massa (m) dengan panjang tali l " );
                    tampilan2.setText ( " W = (g/l)^0,5; W (omega) " );
                    tampilan3.setText ( " l = g/ W^2 " );

                    LL = gg/Math.pow(WW,2);

                    tampilan4.setText ( "Panjang tali, L =" + df.format ( LL ) + "m" );
                } else if

                (!f.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )) {

                    ff = Double.parseDouble(f.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Sistem ayunan massa (m) dengan panjang tali l " );
                    tampilan2.setText ( " W = (g/l)^0,5; W (omega) " );
                    tampilan3.setText ( " l = g/W^2  " );
                    tampilan4.setText ( " W = 2 pi f " );
                    tampilan5.setText ( " l = g /(2 pi f)^2 " );
                    WW = 6.28*ff;
                    X = Math.pow(WW,2);
                    LL = gg/X;
                    tampilan6.setText ( " Panjang tali, L =" + df.format ( LL ) + "m" );
                }
            }}
        );
        btnW.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#######" );

                if
                (!L.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    LL = Double.parseDouble(L.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Sistem ayunan massa (m) dengan panjang tali l " );
                    tampilan2.setText ( " omega = (g/l)^0,5" );
                    X = gg/LL;
                    WW = Math.pow(X,0.5);
                    tampilan3.setText ( "W =" + df.format ( WW ) + "rad/s" );
                } else if

                (!k.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )) {

                    kk = Double.parseDouble(k.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());

                    tampilan1.setText ( "Sistem massa pegas" );
                    tampilan2.setText ( "W = (k/m)^0,5;  W (omega)" );
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    tampilan3.setText ( "W =" + df.format ( WW ) + "rad/s" );
                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !dy.getText ( ).toString ( ).equals ( "" )  &&
                                !g.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    tampilan1.setText ( "Sistem massa pegas" );
                    tampilan2.setText ( " W = (k/m)^0,5" );
                    tampilan3.setText ( " k = m*g/dy" );

                    kk = mm*gg/dydy;
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    tampilan4.setText ( "k =" + df.format ( kk ) + "N/m"  );
                    tampilan5.setText ( "W =" + df.format ( WW )  + "rad/s" );
                }
            }}
        );
        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                (!L.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    LL = Double.parseDouble(L.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Ayunan masa yang diikat tali " );
                    tampilan2.setText ( " W = (g/l)^0,5 " );
                    tampilan3.setText ( " W = 2 pi f     " );
                    tampilan4.setText ( " f = W /2 pi ; f = ((g/l)^0,5)/2 pi" );
                    tampilan5.setText ( " f = ((g/l)^0,5)/2 pi" );
                    X = gg/LL;
                    WW = Math.pow(X,0.5);
                    ff = WW/6.28;
                    tampilan6.setText ( "f =" + df.format ( ff ) + "Hz" );
                } else if

                (!k.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )) {

                    kk = Double.parseDouble(k.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());

                    tampilan1.setText ( " Sistem ayunan massa-pegas" );
                    tampilan2.setText ( " W = (k/m)^0,5" );
                    tampilan3.setText ( " W = 2 pi f,  " );
                    tampilan4.setText ( " f = ((k/m)^0,5)/2 pi" );

                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    ff = WW/ 6.28;
                    tampilan5.setText ( "f = " + df.format ( ff ) + "Hz" );
                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !dy.getText ( ).toString ( ).equals ( "" )  &&
                                !g.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Sistem ayunan massa-pegas" );
                    tampilan2.setText ( " W = (k/m)^0,5" );
                    tampilan3.setText ( " f = ((k/m)^0,5)/2 pi" );
                    tampilan4.setText ( " k = m*g/dy" );

                    kk = mm*gg/dydy;
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    ff = WW/6.28;
                    tampilan5.setText ( "k = " + df.format ( kk ) + "N/m"  );
                    tampilan6.setText ( "W = " + df.format ( WW )  + "rad/s" );
                    tampilan7.setText ( "f = " + df.format ( ff )  + "Hz" );
                }
            }}
        );
        btnT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if

                (!L.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    LL = Double.parseDouble(L.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Ayunan masa yang diikat tali " );
                    tampilan2.setText ( " W = (g/l)^0,5)" );
                    tampilan3.setText ( " W = 2 pi/ T   " );
                    tampilan4.setText ( "  T = 2 pi/(g/l)^0,5)" );
                    X = gg/LL;
                    WW = Math.pow(X,0.5);
                    TT = 6.28/WW;
                    tampilan5.setText ( " freluensi sudut  W =" + df.format ( WW ) + "rad/s" );
                    tampilan6.setText ( " Perioda  T =" + df.format ( TT ) + "s" );

                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !k.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    kk = Double.parseDouble(k.getText().toString());
                    tampilan1.setText ( " Ayunan sistem massa pegas" );
                    tampilan2.setText ( " W = (k/m)^0,5;   W = omega = kecepatan anguler" );
                    tampilan3.setText ( " W = 2 pi /T  " );
                    tampilan4.setText ( " T = 2 pi /W  " );
                    tampilan5.setText ( " T = 2 pi/((k/m)^0,5" );
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    TT =  6.28/WW;
                    tampilan6.setText ( " Perioda T =" + df.format ( TT ) + "s" );
                    tampilan7.setText ( " W =" + df.format ( WW ) + "rad/s" );

                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !dy.getText ( ).toString ( ).equals ( "" )  &&
                                !g.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( " Ayunan sistem massa pegas" );
                    tampilan2.setText ( " W = ((k/m)^0,5)" );
                    tampilan3.setText ( " k = m*g/dy" );
                    tampilan4.setText ( " T = 2 pi/W " );
                    kk = mm*gg/dydy;
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    TT = 6.28/WW;
                    tampilan5.setText ( "k = " + df.format ( kk ) + "N/m"  );
                    tampilan6.setText ( "W = " + df.format ( WW )  + "rad/s" );
                    tampilan7.setText ( "T = " + df.format ( TT )  + "s" );
                }
            }}
        );
        btng.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                (!L.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )) {

                    LL= Double.parseDouble(L.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( " Ayunan masa yang diikat tali " );
                    tampilan2.setText ( " W = (g/l)^0,5" );
                    tampilan3.setText ( " g = l*W^2" );
                    gg = Math.pow(WW,2);
                    gg = LL*gg;
                    tampilan4.setText ( "g =" + df.format ( gg ) + "m/s2" );

                } else if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !dy.getText ( ).toString ( ).equals ( "" )  &&
                                !k.getText ( ).toString ( ).equals ( "" )) {

                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    tampilan1.setText ( " Ayunan sistem massa pegas" );
                    tampilan2.setText ( "F = k dy  " );
                    tampilan3.setText ( "  F = mg " );
                    tampilan4.setText ( "  g = k dy/m" );
                    gg = kk * dydy/mm;
                    tampilan5.setText ( "g =" + df.format ( gg ) + "m/s2" );

                } else if

                (!L.getText ( ).toString ( ).equals ( "" )   &&
                                !W.getText ( ).toString ( ).equals ( "" )) {

                    WW = Double.parseDouble(W.getText().toString());
                    LL = Double.parseDouble(L.getText().toString());

                    tampilan1.setText ( " Ayunan masa yang diikat tali " );
                    tampilan2.setText ( " W = (g/L)^0,5" );
                    tampilan3.setText ( " g = L * W^2" );
                    gg = Math.pow(WW,2);
                    gg = dydy*gg;
                    tampilan4.setText ( "g =" + df.format ( gg ) + "m/s2" );
                }}}
        );

        btnacc.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if

                (!A.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )) {

                    AA = Double.parseDouble(A.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( "a_max =A W^2   terjadi saat simpangan maksimum " );
                    acc = AA*Math.pow(WW,2);
                    tampilan2.setText ( "a_max =" + df.format ( acc ) + "m/s2" );
                }else
                if

                (!L.getText ( ).toString ( ).equals ( "" )   &&
                        !A.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )) {

                    AA = Double.parseDouble(A.getText().toString());
                    LL = Double.parseDouble(L.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "a_max =A W^2   terjadi saat simpangan maksimum " );
                    tampilan2.setText ( "W = (g/l)^0,5" );
                    X = gg/LL;
                    WW = Math.pow(X,0.5);
                    acc = AA*WW;
                    WW = Math.pow(WW,0.5);
                    tampilan3.setText ( " W =" + df.format ( WW ) + "rad/s" );
                    tampilan4.setText ( "a_max =" + df.format ( acc ) + "m/s2" );

                } else if

                (!k.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )) {

                    AA = Double.parseDouble(A.getText().toString());
                    kk = Double.parseDouble(k.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());

                    tampilan1.setText ( "a_max =A W^2   terjadi saat simpangan maksimum " );
                    tampilan2.setText ( "W = (k/m)^0,5" );
                    X = kk/mm;
                    WW = Math.pow(WW,0.5);
                    acc = AA*WW;
                    WW = Math.pow(WW,0.5);
                    tampilan3.setText ( "W =" + df.format ( WW ) + "rad/s" );
                    tampilan4.setText ( "a_max =" + df.format ( acc ) + "m/s2" );
                } else if

                (!dy.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )) {

                    AA = Double.parseDouble(A.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());


                    tampilan1.setText ( "a_max =A W^2   terjadi saat simpangan maksimum " );
                    tampilan2.setText ( "W = (k/m)^0,5;  k = m*g/dy" );
                    kk = mm*gg/dydy;
                    X = kk/mm;
                    acc = AA*X;
                    WW = Math.pow(X,0.5);
                    tampilan3.setText ( "k =" + df.format ( kk ) + "N/m"  );
                    tampilan4.setText ( "W =" + df.format ( WW )  + "rad/s" );
                    tampilan5.setText ( "a_max =" + df.format ( acc ) + "m/s2" );

                }}}
        );
        btnvmax.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                (!A.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )) {

                    AA = Double.parseDouble(A.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( "v.max = A W , dicapai di titik setimbang" );
                    vv = AA*WW;
                    tampilan2.setText ( "v.max =" + df.format ( vv) + "m/s" );

                }else if
                (!L.getText ( ).toString ( ).equals ( "" ) &&
                                !g.getText ( ).toString ( ).equals ( "" ) &&
                                W.getText ( ).toString ( ).equals ( "" )) {
                    gg = Double.parseDouble(g.getText().toString());
                    LL = Double.parseDouble(L.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( "W = (g/l)^0,5;  vmax = A W ; dicapai di titik setimbang" );
                    WW = gg/LL;
                    WW = Math.pow(WW,0.5);
                    vv = AA*WW;
                    tampilan2.setText ( " W = " + df.format ( WW ) + "rad/s" );
                    tampilan3.setText ( "v_max = " + df.format ( vv ) + "m/s" );

                } else if

                (!k.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());
                    kk = Double.parseDouble(k.getText().toString());

                    tampilan1.setText ( " W = (k/m)^0,5" );
                    tampilan2.setText ( " vmax = A W ; dicapai di titik setimbang" );
                    WW = kk/mm;
                    WW = Math.pow(WW,0.5);
                    vv = AA*WW;
                    tampilan3.setText ( " W =" + df.format ( WW ) + "rad/s" );
                    tampilan4.setText ( " v_max =" + df.format ( vv ) + "m/s" );
                } else if

                (!g.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )   &&
                                !dy.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());

                    tampilan1.setText ( " v.max =A W , dicapai di titik setimbang" );
                    tampilan2.setText ( " W = (k/m)^0,5;  k = m*g/dy" );
                    kk = mm*gg/dydy;
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    vv = AA*WW;
                    tampilan3.setText ( " k = " + df.format ( kk ) + "N/m"  );
                    tampilan4.setText ( " W = " + df.format ( WW )  + "rad/s" );
                    tampilan5.setText ( " v_max = " + df.format ( vv ) + "m/s" );

                }

            }}
        );
        btnvt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                (!t.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )   &&
                        !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    tt = Double.parseDouble(t.getText().toString());
                    WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( " vt = Acos(wt) , kecepatan saat t" );
                    Y = WW*tt;
                    cos = Math.cos(Y);
                    vtvt = AA*cos;
                    tampilan2.setText ( " vt = " + df.format ( vtvt) + "m/s" );

                }else
                if
                (!t.getText ( ).toString ( ).equals ( "" )   &&
                        !L.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )   &&
                        !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    tt = Double.parseDouble(t.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    LL = Double.parseDouble(L.getText().toString());

                    tampilan1.setText ( " vt = A cos (Wt);  W = (g/l)^0,5; " );
                    X = gg/LL;
                    WW = Math.pow(X,0.5);
                    tampilan2.setText ( "W =" + df.format ( WW )  + "rad/s" );
                    Y = WW*tt;
                    cos = Math.cos(Y);
                    vtvt = AA*cos;
                    tampilan3.setText ( "vt =" + df.format ( vtvt ) + "m/s" );

                } else if

                (!t.getText ( ).toString ( ).equals ( "" )   &&
                                !k.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    tt = Double.parseDouble(t.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());
                    kk = Double.parseDouble(k.getText().toString());

                    tampilan1.setText ( "vt = A cos (Wt); W = (k/m)^0,5" );
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    tampilan2.setText ( "W =" + df.format ( WW )  + "rad/s" );
                    Y = WW * tt;
                    cos = Math.cos(Y);
                    vtvt = AA*cos;
                    tampilan3.setText ( "vt =" + df.format ( vtvt ) + "m/s" );

                } else if
                (!dy.getText ( ).toString ( ).equals ( "" )   &&
                                !k.getText ( ).toString ( ).equals ( "" )   &&
                                !m.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble(A.getText().toString());
                    dydy = Double.parseDouble(dy.getText().toString());
                    mm = Double.parseDouble(m.getText().toString());
                    kk = Double.parseDouble(k.getText().toString());

                    tampilan1.setText ( " W = (k/m)^0,5;  k = m*g/dy" );
                    kk = mm*gg/dydy;
                    tampilan2.setText ( "k = " + df.format ( kk ) + "N/m"  );
                    X = kk/mm;
                    WW = Math.pow(X,0.5);
                    tampilan3.setText ( "W = " + df.format ( WW )  + "rad/s" );
                    Y = WW * tt;
                    cos = Math.cos(Y);
                    vtvt = AA*cos;
                    tampilan4.setText ( "v_max = " + df.format ( vtvt ) + "m/s" );

                }

            }}
        );


        btnhapus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                m.setText("");
                g.setText("");
                L.setText("");
                W.setText("");
                f.setText("");
                dy.setText("");
                T.setText("");
                t.setText("");
                A.setText("");
                k.setText("");

            }
        });


    }
}
