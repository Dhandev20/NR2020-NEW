package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Optik extends AppCompatActivity {
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

    private EditText d,p,L,lamda,n1,n2,i,r,m,N,Io,teta,t,v,v1,v2;
    private Double dd,pp,dp,LL,lmda,n1n1,n2n2,ii,rr,mm,NN,IoIo,tetat,tt,vv,v1v1,v2v2,sin,cos,tan,pt,pg,II, S,T,U;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_optik );

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
        d = findViewById ( R.id.in_h );
        p = findViewById ( R.id.in_p );
        m = findViewById ( R.id.in_m );
        L = findViewById ( R.id.in_L );
        lamda = findViewById ( R.id.in_lamda );
        n1 = findViewById ( R.id.in_n1 );
        n2 = findViewById ( R.id.in_n2 );
        i = findViewById ( R.id.in_i );
        r = findViewById ( R.id.in_r );
        N = findViewById ( R.id.in_N );
        Io = findViewById ( R.id.in_Io );
        teta = findViewById ( R.id.in_teta );
        t = findViewById ( R.id.in_t );
        v = findViewById ( R.id.in_v );
        v1 = findViewById ( R.id.in_v1 );
        v2 = findViewById ( R.id.in_f );


        Button btnp = findViewById ( R.id.btn_p );
        Button btndp = findViewById ( R.id.btn_dp );
        Button btnlamda = findViewById ( R.id.btn_lamda );
        Button btnd = findViewById ( R.id.btn_d );
        Button btnn1= findViewById ( R.id.btn_n1 );
        Button btnn2 = findViewById ( R.id.btn_n2);
        Button btnv1= findViewById ( R.id.btn_v1 );
        Button btnv2 = findViewById ( R.id.btn_v2);
        Button btni = findViewById ( R.id.btn_i );
        Button btnr = findViewById ( R.id.btn_r );
        Button btnI = findViewById ( R.id.btn_alfa );
        Button btnIo = findViewById ( R.id.btn_Io );
        Button btnioi = findViewById ( R.id.btn_io );
        Button btns = findViewById ( R.id.btn_s );

        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );






        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Sifat optik" );
                tampilan2.setText ( "kalkulator gelombang dan bunyi digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. interferensi Young" );
                tampilan4.setText ( " 2. interferensi selaput tipis" );
                tampilan5.setText ( " 3. difraksi celah tunggal " );
                tampilan6.setText ( " 4. difraksi celah banyak" );
                tampilan7.setText ( " 5. kisi difraksi" );
                tampilan8.setText ( " 6. polarisasi cahaya" );
                tampilan9.setText ( "7. pembiasan hukum Snellius " );
                tampilan10.setText ( " 8. pantulan/gema" );
                tampilan11.setText ( " " );
                tampilan12.setText ( "variabel yang digunakan " );
                tampilan13.setText ( " lamda = panjang gelombang" );
                tampilan14.setText ( " N : jumlah celah" );
                tampilan15.setText ( " d : jarak celah" );
                tampilan16.setText ( " p : jarak kepusat terang" );
                tampilan17.setText ( " dp : jarak antar bayangan terang" );
                tampilan18.setText ( " L :jarak layar" );
                tampilan19.setText ( " r : sudut bias" );
                tampilan20.setText ( " i : sudut datang" );
                tampilan21.setText ( " Io : intensiatas awal " );
                tampilan22.setText ( " v: cepat rambat gelombang" );
                tampilan23.setText ( " teta: sudut antar sumbu polarisator-analisator; atau sudut bias" );
                tampilan24.setText ( " n1, n2 : indeks bias medium 1,2" );
                tampilan25.setText ( " s : jarak pantul " );
                tampilan26.setText ( " v1 : cepat rambat gelombang dalam medium 1" );
                tampilan27.setText ( " v2 : cepat rambat gelombang dalam medium 2" );
                tampilan28.setText ( " I/Io :perbandingan intensitas yang ditransmisikan terhadap intensitas semula" );
                tampilan29.setText ( " lamda : panjang gelombang" );
                tampilan30.setText ( " t : selang waktu" );

            }});

        btnr.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!i.getText ( ).toString ( ).equals ( "" )   &&
                            !v1.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )) {
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        v1v1  = Double.parseDouble ( v1.getText ( ).toString ( ) );
                        v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = v1/v2" );
                    tampilan2.setText ( "  sin r = v2 sin i/v1" );
                    tampilan3.setText ( "   r = arc sin(v2 sin i/v1)" );
                    ii = 0.017444 * ii;
                    sin = Math.sin ( ii );
                    rr = v2v2 * sin / v1v1;
                    rr = Math.asin ( rr );
                    rr = rr / 0.017444;
                    tampilan5.setText ( " r = " + df.format ( rr ) + " derajat" );
                }else
                if
                    (!i.getText ( ).toString ( ).equals ( "" )   &&
                            !n1.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )) {
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = n2/n1" );
                    tampilan2.setText ( "  sin r = n1 sin i/n2" );
                    tampilan3.setText ( "   r = arc sin(n1 sin i/n2)" );
                    ii = 0.017444 * ii;
                    sin = Math.sin ( ii );
                    rr = n1n1 * sin / n2n2;
                    rr = Math.asin ( rr );
                    rr = rr / 0.017444;
                    tampilan5.setText ( " r = " + df.format ( rr ) + " derajat" );
                }}});
        btni.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !v1.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )) {
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        v1v1  = Double.parseDouble ( v1.getText ( ).toString ( ) );
                        v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = v1/v2" );
                    tampilan2.setText ( "  sin i = v1 sin r/v2" );
                    tampilan3.setText ( "   i = arc sin(v1 sin r/v2)" );
                    rr = 0.017444 * rr;
                    sin = Math.sin ( rr );
                    ii = v1v1 * sin / v2v2;
                    ii = Math.asin ( ii );
                    ii = ii / 0.017444;
                    tampilan5.setText ( " i = " + df.format ( ii ) + " derajat" );
                }else
                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !n1.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )) {
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = n2/n1" );
                    tampilan2.setText ( "  sin i = n2 sin r/n1" );
                    tampilan3.setText ( "   i = arc sin(n2 sin i/n1)" );
                    rr = 0.017444 * rr;
                    sin = Math.sin ( rr );
                    ii = n2n2 * sin / n1n1;
                    ii = Math.asin ( ii );
                    ii = ii / 0.017444;
                    tampilan5.setText ( " i = " + df.format ( ii ) + " derajat" );
                }else
                if
                    (!n1.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )) {

                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );
                    tampilan1.setText ( " polarisasi liner karena pantulan" );
                    tampilan2.setText ( "  sudut Brewster i = arc tan(n2/n1) " );
                    ii = Math.atan(n2n2/n1n1);
                    ii = ii / 0.017444;
                    tampilan5.setText ( " i = " + df.format ( ii ) + " derajat" );
                }}});
        btnn1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!i.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )) {
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = n2/n1" );
                    tampilan2.setText ( "  n1 = n2 sin r/sin i" );

                    rr = 0.017444 * rr;
                    ii = 0.017444 * ii;
                    sin = Math.sin ( rr );
                    n1n1 = n2n2 * sin / Math.sin ( ii );

                    tampilan5.setText ( " n1 = " + df.format ( n1n1 ) );
                } else
                    if
                               (!v1.getText ( ).toString ( ).equals ( "" )   &&
                                !v2.getText ( ).toString ( ).equals ( "" )) {
                            v1v1  = Double.parseDouble ( v1.getText ( ).toString ( ) );
                            v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );
                        tampilan1.setText ( " cepat rambat cahaya dalam medium " );
                        tampilan2.setText ( " n1/n2 = v2/v1" );
                        tampilan3.setText ( " n1 = n2 v2/v1" );
                        n1n1 = n2n2*v2v2/v1v1;
                        tampilan5.setText ( " n1 = " + df.format ( n1n1 ) );
                }}});
        btnn2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!i.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )   &&
                            !n1.getText ( ).toString ( ).equals ( "" )) {
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = n2/n1" );
                    tampilan2.setText ( "  n2 = n1 sin i/sin r" );

                    rr = 0.017444 * rr;
                    ii = 0.017444 * ii;
                    sin = Math.sin ( ii );
                    n2n2 = n1n1 * sin / Math.sin(rr);

                    tampilan5.setText ( " n2 = " + df.format (n2n2 )  );

                } else
                if
                    (!v1.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )) {
                        v1v1  = Double.parseDouble ( v1.getText ( ).toString ( ) );
                        v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );
                    tampilan1.setText ( " cepat rambat cahaya dalam medium " );
                    tampilan2.setText ( " n1/n2 = v2/v1" );
                    tampilan3.setText ( " n2 = n1 v1/v2" );
                    n2n2 = n1n1*v1v1/v2v2;
                    tampilan5.setText ( " n2 = " + df.format ( n2n2 ) );
                }}});

        btnv1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !i.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )) {
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = v1/v2" );
                    tampilan2.setText ( "  v1 = v2 sin i/sin r" );

                    rr = 0.017444 * rr;
                    ii = 0.017444 * ii;
                    sin = Math.sin ( rr );
                    v1v1 = v2v2 *  Math.sin(ii)/sin;
                    tampilan5.setText ( " v1 = " + df.format (v1v1)  );

                } else
                if
                    (!n1.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )) {
                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                        v2v2 = Double.parseDouble ( v2.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );
                    tampilan1.setText ( " cepat rambat cahaya dalam medium " );
                    tampilan2.setText ( " n1/n2 = v2/v1" );
                    tampilan3.setText ( " v1 = n2 v2/n1" );
                    v1v1 = n2n2*v2v2/n1n1;
                    tampilan5.setText ( " v1 = " + df.format (v1v1)  );
                }}});
        btnv2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !i.getText ( ).toString ( ).equals ( "" )   &&
                            !v1.getText ( ).toString ( ).equals ( "" )) {
                        rr  = Double.parseDouble ( r.getText ( ).toString ( ) );
                        ii  = Double.parseDouble ( i.getText ( ).toString ( ) );
                        v1v1  = Double.parseDouble ( v1.getText ( ).toString ( ) );
                    tampilan1.setText ( " Hukum Snellius; sin i/sin r = v1/v2" );
                    tampilan2.setText ( "  v2 = v1 sin r/sin i" );

                    rr = 0.017444 * rr;
                    ii = 0.017444 * ii;
                    sin = Math.sin ( rr );
                    v2v2 = v1v1 * sin/ Math.sin(ii);
                    tampilan5.setText ( " v2 = " + df.format (v2v2)  );

                } else
                if
                    (!n1.getText ( ).toString ( ).equals ( "" )   &&
                            !n2.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )) {
                        n1n1  = Double.parseDouble ( n1.getText ( ).toString ( ) );
                        n2n2  = Double.parseDouble ( n2.getText ( ).toString ( ) );
                        v2v2  = Double.parseDouble ( v2.getText ( ).toString ( ) );
                    tampilan1.setText ( " cepat rambat cahaya dalam medium " );
                    tampilan2.setText ( " n1/n2 = v2/v1" );
                    tampilan3.setText ( " v2 = n1 v1/n2" );
                    v2v2 = n1n1*v1v1/n2n2;
                    tampilan5.setText ( " v2 = " + df.format (v2v2)  );
                }}});

        btnp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                if
                    (!d.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                       dd  = Double.parseDouble ( d.getText ( ).toString ( ) );
                        LL  = Double.parseDouble ( L.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );

                    lmda = lmda*Math.pow(10,-10);
                    tampilan1.setText ( " interferensi Young" );
                    tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                    tampilan3.setText ( "   atau dp/L = m lamda" );
                    tampilan4.setText ( " p = L m lamda/d" );
                    pt = LL*mm*lmda/dd;
                    tampilan6.setText ( " p = " + df.format ( pt ) + "m" );
                    S = 1000*pt;
                    tampilan7.setText ( " p = " + df.format ( S ) + "mm" );
                    tampilan9.setText ( " interferensi Young" );
                    tampilan10.setText ( " pola GELAP: d sin teta = (m - 0,5) lamda" );
                    tampilan11.setText ( "   atau dp/L = (m - 0,5) lamda" );
                    tampilan12.setText ( " p = L (m - 0,5) lamda/d" );
                    pg = LL*(mm-0.5)*lmda/dd;
                    tampilan14.setText ( " p = " + df.format ( pg ) + "m" );
                    T = 1000* pg;
                    tampilan15.setText ( " p = " + df.format (T ) + "mm" );
                }}});

        btndp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                if
                    (!d.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        dd  = Double.parseDouble ( d.getText ( ).toString ( ) );
                        LL  = Double.parseDouble ( L.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                        lmda = lmda * Math.pow ( 10 , -10 );
                        tampilan1.setText ( " interferensi Young" );
                        tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                        tampilan3.setText ( "   atau dp/L = m lamda" );
                        tampilan4.setText ( " p = L m lamda/d" );
                        pt = LL * mm * lmda / dd;
                        tampilan6.setText ( " p = " + df.format ( pt ) + "m" );
                        S = 1000 * pt;
                        tampilan7.setText ( " p = " + df.format ( S ) + "mm" );
                        tampilan9.setText ( " interferensi Young" );
                        tampilan10.setText ( " pola GELAP: d sin teta = (m - 0,5) lamda" );
                        tampilan11.setText ( "   atau dp/L = (m - 0,5) lamda" );
                        tampilan12.setText ( " p = L (m - 0,5) lamda/d" );
                        pg = LL * (mm - 0.5) * lmda / dd;
                        tampilan14.setText ( " p = " + df.format ( pg ) + "m" );
                        T = 1000 * pg;
                        tampilan15.setText ( " p = " + df.format ( T ) + "mm" );
                        dp = pt - pg;
                        tampilan16.setText ( " jarak antara pita terang ke" + (mm) + "ke pita gelap ke " + (mm) + " = " + df.format ( dp ) + "m" );
                        dp = 1000 * dp;
                        tampilan17.setText ( "  = " + df.format ( dp ) + "mm" );

                    } }});
        btnd.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                if
                    (!d.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        dd  = Double.parseDouble ( d.getText ( ).toString ( ) );
                        LL  = Double.parseDouble ( L.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                    lmda = lmda * Math.pow ( 10 , -10 );
                    tampilan1.setText ( " interferensi Young" );
                    tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                    tampilan3.setText ( "   atau dp/L = m lamda" );
                    tampilan4.setText ( " p = L m lamda/d" );
                    pt = LL * mm * lmda / dd;
                    tampilan6.setText ( " p = " + df.format ( pt ) + "m" );
                    S = 1000 * pt;
                    tampilan7.setText ( " p = " + df.format ( S ) + "mm" );
                    tampilan9.setText ( " interferensi Young" );
                    tampilan10.setText ( " pola GELAP: d sin teta = (m - 0,5) lamda" );
                    tampilan11.setText ( "   atau dp/L = (m - 0,5) lamda" );
                    tampilan12.setText ( " p = L (m - 0,5) lamda/d" );
                    pg = LL * (mm - 0.5) * lmda / dd;
                    tampilan14.setText ( " p = " + df.format ( pg ) + "m" );
                    T = 1000 * pg;
                    tampilan15.setText ( " p = " + df.format ( T ) + "mm" );
                    dp = pt - pg;
                    tampilan16.setText ( " jarak antara pita terang ke" + (mm) + "ke pita gelap ke " + (mm) + " = " + df.format ( dp ) + "m" );
                    dp = 1000 * dp;
                    tampilan17.setText ( "  = " + df.format ( dp ) + "mm" );

                } }});
        btnlamda.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                if
                    (!d.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !p.getText ( ).toString ( ).equals ( "" )) {
                        dd  = Double.parseDouble ( d.getText ( ).toString ( ) );
                        LL  = Double.parseDouble ( L.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        pp  = Double.parseDouble ( p.getText ( ).toString ( ) );

                    tampilan1.setText ( " interferensi Young" );
                    tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                    tampilan3.setText ( "   atau dp/L = m lamda" );
                    tampilan4.setText ( " lamda = dp/Lm" );
                    lmda = dd * pp / (LL * mm);
                    tampilan6.setText ( " lamda = " + df.format ( lmda ) + "m" );
                    lmda = lmda * Math.pow ( 10 , 10 );

                    tampilan7.setText ( " lamda = " + df.format ( lmda ) + "Angrum" );
                    tampilan9.setText ( " interferensi Young" );
                    tampilan10.setText ( " pola GELAP: d sin teta = (m - 0,5) lamda" );
                    tampilan11.setText ( "   atau dp/L = (m - 0,5) lamda" );
                    tampilan12.setText ( " lamda = dp/ L (m - 0,5)" );
                    lmda = dd * pp / (LL * (mm - 0.5));
                    tampilan14.setText ( " lamda = " + df.format ( lmda ) + "m" );
                    lmda = lmda * Math.pow ( 10 , 10 );
                    tampilan15.setText ( " lamda = " + df.format ( lmda ) + "Angstrum" );
                } else
                if
                    (!d.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )) {
                        dd  = Double.parseDouble ( d.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        tetat  = Double.parseDouble ( teta.getText ( ).toString ( ) );

                    tetat = 0.017444 * tetat;
                    sin = Math.sin ( tetat );
                    tampilan1.setText ( " kisi difraksi" );
                    tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                    tampilan3.setText ( " lamda = d sin teta/m" );

                    lmda = dd * sin / mm;
                    tampilan6.setText ( " lamda = " + df.format ( lmda ) + "m" );
                    lmda = lmda * Math.pow ( 10 , 10 );
                    tampilan7.setText ( " lamda = " + df.format ( lmda ) + "Angrum" );
                } else
                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )) {
                        NN  = Double.parseDouble ( N.getText ( ).toString ( ) );
                        mm  = Double.parseDouble ( m.getText ( ).toString ( ) );
                        tetat  = Double.parseDouble ( teta.getText ( ).toString ( ) );

                        tetat = 0.017444 * tetat;
                    sin = Math.sin ( tetat );
                    tampilan1.setText ( " kisi difraksi" );
                    tampilan2.setText ( " pola TERANG: d sin teta = m lamda" );
                    tampilan3.setText ( " lamda = d sin teta/m" );
                    tampilan4.setText ( " d = 1/N;   N: jumlah celah" );
                    dd = 1/NN;
                    lmda = dd * sin / mm;
                    tampilan6.setText ( " lamda = " + df.format ( lmda ) + "m" );
                    lmda = lmda * Math.pow ( 10 , 10 );
                    tampilan7.setText ( " lamda = " + df.format ( lmda ) + "Angrum" );

                } }});
        btnI.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                tetat= Double.parseDouble ( teta.getText ( ).toString ( ) );
                IoIo = Double.parseDouble (Io.getText ( ).toString ( ) );

                if
                    (!Io.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )) {
                        IoIo  = Double.parseDouble ( Io.getText ( ).toString ( ) );
                        tetat  = Double.parseDouble ( teta.getText ( ).toString ( ) );
                    tampilan1.setText ( " Serapan masalah polarisasi" );
                    tampilan2.setText ( " I = Io (cos teta)^2" );
                    tetat = tetat*0.017444;
                    tetat = Math.cos(tetat);
                    tetat = Math.pow(tetat,2);
                    II = IoIo*tetat;

                    tampilan6.setText ( " I = " + df.format ( II ) + "W/m2" );

                } }});
        btnioi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.####" );

                tetat= Double.parseDouble ( teta.getText ( ).toString ( ) );

                    tampilan1.setText ( " Serapan masalah polarisasi" );
                    tampilan2.setText ( " I/Io = 0,5 (cos teta)^2" );
                    tetat = tetat*0.017444;
                    tetat = Math.cos(tetat);
                    tetat = Math.pow(tetat,2);
                    II = 50*tetat;

                    tampilan4.setText ( " I/Io = " + df.format ( II ) + "%" );

                 }});


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
                d.setText ( "" );
                p.setText ( "" );
                L.setText ( "" );
                m.setText ( "" );
                N.setText ( "" );
                i.setText ( "" );
                r.setText ( "" );
                v.setText ( "" );
                lamda.setText ( "" );
                teta.setText ( "" );
                Io.setText ( "" );
                t.setText ( "" );
                n1.setText ( "" );
                n2.setText ( "" );
                v1.setText ( "" );
                v2.setText ( "" );
            }
        } );
    }
}

