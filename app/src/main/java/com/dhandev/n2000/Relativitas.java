package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class Relativitas extends AppCompatActivity {
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

    private EditText v,to,t,Lo,L,mo,m,fo,lamda,lamdanol,dt,dL,dm;

    private Double vv,toto,tt,LoLo,LL,momo,mm,fofo,ff,A, B,C,D,E,g,p,Ek,laamda,laamdanol;
    private Double dt2,dL2,dm2;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_relativitas );

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



        v = findViewById ( R.id.in_v );
        to = findViewById ( R.id.in_to );
        t = findViewById ( R.id.in_t );
        Lo = findViewById ( R.id.in_Lo );
        L = findViewById ( R.id.in_L );
        mo = findViewById ( R.id.in_mo );
        m = findViewById ( R.id.in_m );
        fo = findViewById ( R.id.in_fo );
        dL = findViewById ( R.id.in_dL );
        dm = findViewById ( R.id.in_dm );
        dt = findViewById ( R.id.in_dt );
        lamda = findViewById ( R.id.in_lamda );
        lamdanol = findViewById ( R.id.in_lamdanol );



        Button btnlamda = findViewById ( R.id.btn_lamda );
        Button btnlamdanol = findViewById ( R.id.btn_lamdanol );
        Button btnv = findViewById ( R.id.btn_v );
        Button btnto = findViewById ( R.id.btn_to );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnLo = findViewById ( R.id.btn_Lo );
        Button btnL = findViewById ( R.id.btn_L );
        Button btnmo = findViewById ( R.id.btn_mo );
        Button btnm = findViewById ( R.id.btn_m );
        Button btnf = findViewById ( R.id.btn_f );
        Button btnp = findViewById ( R.id.btn_p);
        Button btnEk = findViewById ( R.id.btn_Ek );
        Button btnE = findViewById ( R.id.btn_E );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator ini digunakan untuk menghitung: :" );
                tampilan2.setText ( "1. Dilatasi waktu" );
                tampilan3.setText ( "2. Konstraksi panjang " );
                tampilan4.setText ( "3. Massa relativistik" );
                tampilan5.setText ( "4. Momentum relativistik" );
                tampilan6.setText ( "5. Energi kinetik relativistik" );
                tampilan7.setText ( "6. Efek Doppler cahaya" );
                tampilan8.setText ( "7. kesetaraan massa - energi" );

                tampilan10.setText ( "m : massa,  mo = masssa diam, dm = perubahan massa" );
                tampilan11.setText ( "t : waktu, to = waktu proper, dt = dilatasi waktu" );

                tampilan12.setText ( "L : panjang, Lo = panjang proper, dL = kontraksi panjang" );

                tampilan13.setText ( "C : laju cahaya" );




            }} );

        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!to.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )) {
                    toto = Double.parseDouble ( to.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                    tampilan1.setText ( " dilatasi waktu" );
                    tampilan2.setText ( " t = to/(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " v = C(1-(to/t)^2)^0,5" );
                    A = toto / tt;
                    B = Math.pow ( A , 2 );
                    C = (1 - B);
                    D = Math.pow ( C , 0.5 );
                    vv = 3 * Math.pow ( 10 , 8 ) * D;

                    tampilan4.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                    vv = D;
                    tampilan5.setText ( "v = " + vv.doubleValue ( ) + " C" );
                } else  if
                    (!to.getText ( ).toString ( ).equals ( "" )   &&
                            !dt.getText ( ).toString ( ).equals ( "" )) {
                        toto = Double.parseDouble ( to.getText ( ).toString ( ) );
                        dt2 = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        tampilan1.setText ( " dilatasi waktu" );
                        tampilan2.setText ( " t = to/(1-(v/c)^2)^0,5" );
                        tampilan3.setText ( " v = C(1-(to/t)^2)^0,5" );
                        tampilan4.setText ( "dt = t - to" );
                        tampilan5.setText ( "t = dt + to" );
                        tt = toto+dt2;
                        A = toto / tt;
                        B = Math.pow ( A , 2 );
                        C = (1 - B);
                        D = Math.pow ( C , 0.5 );
                        vv = 3 * Math.pow ( 10 , 8 ) * D;

                        tampilan6.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                        vv = D;
                        tampilan7.setText ( "v = " + vv.doubleValue ( ) + " C" );



              } else
                if

                    (!Lo.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )) {
                        LoLo = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                    tampilan1.setText ( " kontraksi panjang" );
                    tampilan2.setText ( " L = Lo(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " v = C(1-(L/Lo)^2)^0,5" );
                    A = LL / LoLo;
                    B = Math.pow ( A , 2 );
                    C = (1 - B);
                    D = Math.pow ( C , 0.5 );
                    vv = 3 * Math.pow ( 10 , 8 ) * D;

                    tampilan4.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                    vv = D;
                    tampilan5.setText ( "v = " + vv.doubleValue ( ) + " C" );

                } else
                if

                (!Lo.getText ( ).toString ( ).equals ( "" )   &&
                        !dL.getText ( ).toString ( ).equals ( "" )) {
                    LoLo = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                    dL2 = Double.parseDouble ( dL.getText ( ).toString ( ) );
                    tampilan1.setText ( " kontraksi panjang" );
                    tampilan2.setText ( " L = Lo(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " v = C(1-(L/Lo)^2)^0,5" );
                    tampilan4.setText ( " dL = Lo - L" );
                    tampilan5.setText ( " L = Lo - dL" );
                    LL = LoLo - dL2;
                    A = LL / LoLo;
                    B = Math.pow ( A , 2 );
                    C = (1 - B);
                    D = Math.pow ( C , 0.5 );
                    vv = 3 * Math.pow ( 10 , 8 ) * D;

                    tampilan6.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                    vv = D;
                    tampilan7.setText ( "v = " + vv.doubleValue ( ) + " C" );

                } else if

                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !mo.getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                        momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                    tampilan1.setText ( " pembesaran massa" );
                    tampilan2.setText ( " m = mo/(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " v = C(1-(mo/m)^2)^0,5" );
                    A = momo / mm;
                    B = Math.pow ( A , 2 );
                    C = (1 - B);
                    D = Math.pow ( C , 0.5 );
                    vv = 3 * Math.pow ( 10 , 8 ) * D;

                    tampilan4.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                    vv = D;
                    tampilan5.setText ( "v = " + vv.doubleValue ( ) + " C" );


                } else if

                (!dm.getText ( ).toString ( ).equals ( "" )   &&
                                !mo.getText ( ).toString ( ).equals ( "" )) {
                    dm2 = Double.parseDouble ( dm.getText ( ).toString ( ) );
                    momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                    tampilan1.setText ( " pembesaran massa" );
                    tampilan2.setText ( " m = mo/(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " v = C(1-(mo/m)^2)^0,5" );
                    tampilan4.setText ( " m = mo + dm" );
                    mm = momo + dm2;
                    A = momo / mm;
                    B = Math.pow ( A , 2 );
                    C = (1 - B);
                    D = Math.pow ( C , 0.5 );
                    vv = 3 * Math.pow ( 10 , 8 ) * D;

                    tampilan4.setText ( "v = " + vv.doubleValue ( ) + " m/s" );
                    vv = D;
                    tampilan5.setText ( "v = " + vv.doubleValue ( ) + " C" );
                }}});

        btnto.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                           (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                    tampilan1.setText ( " dilatasi waktu" );
                    tampilan2.setText ( " t = to/(1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " to = t * (1 - (v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    toto = tt*E;

                    tampilan4.setText ( "to = " + toto.doubleValue ( ) + " s" );

                }}});
        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !to.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        toto = Double.parseDouble ( to.getText ( ).toString ( ) );
                        tampilan1.setText ( " dilatasi waktu" );
                    tampilan2.setText ( " t = to/(1-(v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    tt = toto/E;

                    tampilan4.setText ( "to = " + toto.doubleValue ( ) + " s" );
                }}});
        btnLo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        tampilan1.setText ( " kontraksi panjang" );
                    tampilan2.setText ( " L = Lo (1-(v/c)^2)^0,5" );
                    tampilan3.setText ( " Lo = L/ (1 - (v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    LoLo = LL/E;

                    tampilan4.setText ( "Lo = " + LoLo.doubleValue ( ) + " m" );

                }}});
        btnL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !Lo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        LoLo = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        tampilan1.setText ( " kontraksi panjang" );
                    tampilan2.setText ( " L = Lo (1-(v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    LL = LoLo*E;

                    tampilan4.setText ( "L = " + LL.doubleValue ( ) + " m" );
                }}});
        btnm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !mo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                        tampilan1.setText ( " pembesaran massa" );
                    tampilan2.setText ( " m = mo/(1-(v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    mm = momo/E;

                    tampilan4.setText ( "m = " + mm.doubleValue ( ) + " kg" );
                }}});
        btnmo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                        tampilan1.setText ( " pembesaran massa" );
                    tampilan2.setText ( " mo = m(1-(v/c)^2)^0,5" );
                    vv=vv*Math.pow(10,6);
                    C = 3*Math.pow(10,8);
                    A = vv / C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    momo = mm*E;

                    tampilan4.setText ( "mo = " + momo.doubleValue ( ) + " kg" );
                }}});
        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !fo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        fofo = Double.parseDouble ( fo.getText ( ).toString ( ) );
                        tampilan1.setText ( " Efek Doppler logitudinal" );
                    tampilan2.setText ( " fo = f ((1+b)/(1-b))^0,5 " );
                    tampilan3.setText ( " b = v/C,  b > 0; saling menjauh" );
                    fofo = fofo*Math.pow(10,12);
                    C = 3 * Math.pow ( 10 , 8 );
                    vv=vv*Math.pow(10,6);
                    A = vv / C;
                    B = (1 + A) / (1 - A);
                    D = Math.pow ( B , 0.5 );
                    ff = fofo / D;
                    tampilan4.setText ( "f = " + ff.doubleValue ( ) + " Hz" );


                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;
                    tampilan5.setText ( " efek Doppler transversal pendekatan geometris terdekat; blueshift" );
                    ff = fofo*g;
                    tampilan6.setText ( "f = " + ff.doubleValue ( ) + " Hz" );

                    tampilan8.setText ( " efek Doppler transversal penedkatan visual terdekat; redshift" );
                    ff = fofo/g;
                    tampilan9.setText ( "f = " + ff.doubleValue ( ) + " Hz" );

                    tampilan11.setText ( " efek Doppler transversal pengamat melingkari sumber; blueshift" );
                    ff = fofo*g;
                    tampilan12.setText ( "f = " + ff.doubleValue ( ) + " Hz" );

                    tampilan14.setText ( " efek Doppler transversal sumber melingkari pengamat; redshift" );
                    ff = fofo/g;
                    tampilan15.setText ( "f = " + ff.doubleValue ( ) + " Hz" );

                }}});

        btnp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !mo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                        tampilan1.setText ( " momentum relatifistik" );
                    tampilan2.setText ( " p = gamma mv " );
                    vv=vv*Math.pow(10,6);
                    C = 3 * Math.pow ( 10 , 8 );
                    A = vv/C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;

                    p = momo*vv*g;
                    tampilan6.setText ( "p = " + p.doubleValue ( ) + " kgm/s" );
                }}});
        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !mo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                        tampilan1.setText ( " Energi kinetik relatifistik" );
                    tampilan2.setText ( " Ek =(gamma - 1) mo C^2 " );
                    vv=vv*Math.pow(10,6);
                    C = 3 * Math.pow ( 10 , 8 );
                    A = vv/C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;
                    C = Math.pow(C,2);
                    Ek = momo*C*(g-1);
                    tampilan4.setText ( "Ek = " + Ek.doubleValue ( ) + " joule" );
                }}});
        btnE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !mo.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        momo = Double.parseDouble ( mo.getText ( ).toString ( ) );
                    tampilan1.setText ( " Energi  relatifistik" );
                    tampilan2.setText ( " Ek = gamma  mo C^2 " );
                    vv=vv*Math.pow(10,6);
                    C = 3 * Math.pow ( 10 , 8 );
                    A = vv/C;
                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;
                    C = Math.pow(C,2);
                    Ek = momo*C*g;
                    tampilan4.setText ( "E = " + E.doubleValue ( ) + " joule" );
                }}});
        btnlamda.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !lamdanol.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        laamdanol = Double.parseDouble ( lamdanol.getText ( ).toString ( ) );
                    tampilan1.setText ( " Efek Doppler logitudinal" );
                    tampilan2.setText ( " lamda = lamdanol ((1+b)/(1-b))^0,5 " );
                    tampilan3.setText ( " b = v/C,  b > 0; saling menjauh; redshift" );
                    laamdanol=laamdanol*Math.pow(10,-12);
                    C = 3 * Math.pow ( 10 , 8 );
                    vv=vv*Math.pow(10,6);
                    A = vv / C;
                    B = (1 + A) / (1 - A);
                    D = Math.pow ( B , 0.5 );
                    laamda = laamdanol* D;
                    tampilan4.setText ( "lamda = " + laamda.doubleValue ( ) + " m" );


                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;
                    tampilan5.setText ( " efek Doppler transversal pendekatan geometris terdekat; blueshift" );
                    tampilan6.setText ( " lamda = lamdanol/gamma");
                    laamda = laamdanol/g;
                    tampilan7.setText ( "lamda = " + laamda.doubleValue ( ) + " m" );

                    tampilan8.setText ( " efek Doppler transversal penedkatan visual terdekat; redshift" );
                    tampilan9.setText ( " lamda = lamdanol*gamma");
                    laamda = laamdanol*g;
                    tampilan11.setText ( "lamda = " + laamda.doubleValue ( ) + " m" );

                    tampilan13.setText ( " efek Doppler transversal pengamat melingkari sumber; blueshift" );
                    tampilan14.setText ( " lamda = lamdanol/gamma");
                    laamda = laamdanol/g;
                    tampilan15.setText ( "lamda = " + laamda.doubleValue ( ) + " m" );

                    tampilan17.setText ( " efek Doppler transversal sumber melingkari pengamat; redshift" );
                    tampilan18.setText ( " lamda = lamdanol*gamma");
                    laamda = laamdanol*g;
                    tampilan20.setText ( "lamda = " + laamda.doubleValue ( ) + " m" );

                }}});
        btnlamdanol.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        laamda = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                    tampilan1.setText ( " Efek Doppler logitudinal" );
                    tampilan2.setText ( " lamda = lamdanol ((1+b)/(1-b))^0,5 " );
                    tampilan3.setText ( " b = v/C,  b > 0; saling menjauh; redshift" );
                    laamda=laamda*Math.pow(10,-12);
                    C = 3 * Math.pow ( 10 , 8 );
                    vv=vv*Math.pow(10,6);
                    A = vv / C;
                    B = (1 + A) / (1 - A);
                    D = Math.pow ( B , 0.5 );
                    laamdanol = laamda/D;
                    tampilan4.setText ( "lamdanol = " + laamdanol.doubleValue ( ) + " m" );


                    B = Math.pow ( A , 2 );
                    D = (1 - B);
                    E = Math.pow ( D , 0.5 );
                    g = 1/E;
                    tampilan5.setText ( " efek Doppler transversal pendekatan geometris terdekat; blueshift" );
                    tampilan6.setText ( " lamdanol = lamda*gamma");
                    laamdanol = laamda*g;
                    tampilan7.setText ( "lamdanol = " + laamdanol.doubleValue ( ) + " m" );

                    tampilan8.setText ( " efek Doppler transversal penedkatan visual terdekat; redshift" );
                    tampilan9.setText ( " lamdanol = lamda/gamma");
                    laamdanol = laamda/g;
                    tampilan11.setText ( "lamdanol = " + laamdanol.doubleValue ( ) + " m" );

                    tampilan13.setText ( " efek Doppler transversal pengamat melingkari sumber; blueshift" );
                    tampilan14.setText ( " lamdanol = lamda*gamma");
                    laamda = laamdanol/g;
                    tampilan15.setText ( "lamdanol = " + laamdanol.doubleValue ( ) + " m" );

                    tampilan17.setText ( " efek Doppler transversal sumber melingkari pengamat; redshift" );
                    tampilan18.setText ( " lamdanol = lamda/gamma");
                    laamda = laamdanol*g;
                    tampilan20.setText ( "lamdanol = " + laamdanol.doubleValue ( ) + " m" );

                }}});



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
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                tampilan16.setText ( "" );
                tampilan17.setText ( "" );
                tampilan18.setText ( "" );
                tampilan19.setText ( "" );
                tampilan20.setText ( "" );


                v.setText ( "" );
                to.setText ( "" );
                t.setText ( "" );
                Lo.setText ( "" );
                L.setText ( "" );
                mo.setText ( "" );
                m.setText ( "" );
                fo.setText ( "" );
                dL.setText ( "" );
                dm.setText ( "" );
                dt.setText ( "" );
                lamda.setText ( "" );
                lamdanol.setText ( "" );
            }
        } );
    }
}
