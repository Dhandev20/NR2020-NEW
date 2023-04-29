
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DinamikaRotasi extends AppCompatActivity {
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



    private EditText T1, F1, r1, m1, I, teta, T2, F2, r2, h, m2, alfa, W, v, mk, g,rk, Ek,wo,t;
    private Double T1T1, F1F1, r1r1, m1m1, II, tetateta, T2T2, F2F2, r2r2, hh, m2m2, alfaalfa, WW, vv, mkmk, gg, rkrk, EkEk, aa,wowo,tt;
    private Double sin, cos, L, deg, A,B;

    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_dinamika_rotasi );


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
        tampilan16 = findViewById ( R.id.tampilan16 );
        tampilan17 = findViewById ( R.id.tampilan17 );
        tampilan18 = findViewById ( R.id.tampilan18 );
        tampilan19 = findViewById ( R.id.tampilan19 );
        tampilan20 = findViewById ( R.id.tampilan20 );
        tampilan21 = findViewById ( R.id.tampilan21 );
        tampilan22 = findViewById ( R.id.tampilan22 );
        tampilan23 = findViewById ( R.id.tampilan23 );
        tampilan24 = findViewById ( R.id.tampilan24 );
        tampilan25 = findViewById ( R.id.tampilan25 );
        tampilan26 = findViewById ( R.id.tampilan26 );
        tampilan27 = findViewById ( R.id.tampilan27 );
        tampilan28 = findViewById ( R.id.tampilan28 );
        tampilan29 = findViewById ( R.id.tampilan29 );
        tampilan30 = findViewById ( R.id.tampilan30 );
        //tampilan11 = findViewById ( R.id.tvtampilan11 );

        alfa = findViewById ( R.id.in_alfa );
        teta = findViewById ( R.id.in_teta );
        T1 = findViewById ( R.id.in_T1 );
        T2 = findViewById ( R.id.in_T2 );
        r1 = findViewById ( R.id.in_r1 );
        r2 = findViewById ( R.id.in_r2 );
        m1 = findViewById ( R.id.in_m1 );
        m2 = findViewById ( R.id.in_m2 );
        I = findViewById ( R.id.in_I );
        t = findViewById ( R.id.in_t );
        h = findViewById ( R.id.in_h );
        F1 = findViewById ( R.id.in_F1 );
        F2 = findViewById ( R.id.in_F2 );
        W = findViewById ( R.id.in_W );
        wo = findViewById ( R.id.in_Wo );
        v = findViewById ( R.id.in_v );
        mk = findViewById ( R.id.in_mk );
        g = findViewById ( R.id.in_g );
        rk = findViewById ( R.id.in_rk );
        Ek = findViewById ( R.id.in_Ek );

        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnT1 = findViewById ( R.id.btn_T1 );
        Button btnF1 = findViewById ( R.id.btn_F1 );
        Button btnF2 = findViewById ( R.id.btn_F2 );
        Button btnr1 = findViewById ( R.id.btn_r1 );
        Button btnr2 = findViewById ( R.id.btn_r2 );
        Button btnm1 = findViewById ( R.id.btn_m1 );
        Button btnm2 = findViewById ( R.id.btn_m2 );
        Button btnw = findViewById ( R.id.btn_W );
        Button btnEk = findViewById ( R.id.btn_Ek );
        Button btnL = findViewById ( R.id.btn_L );
        Button btnv = findViewById ( R.id.btn_v );
        Button btnI = findViewById ( R.id.btn_i );
        Button btna = findViewById ( R.id.btn_a );
        Button btnWork = findViewById ( R.id.btn_Work );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnalfa = findViewById ( R.id.btn_alfa );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                tampilan1.setText ( " Kalkulator ini digunakan untuk menghitung:" );
                tampilan2.setText ( "1. Torsi" );
                tampilan3.setText ( "2. Kesetimbangan" );
                tampilan4.setText ( "3. Sistem massa-katrol dengan momen inersia & percobaan Atwod" );
                tampilan5.setText ( "4. Momentum sudut" );
                tampilan6.setText ( "5. Kesetimbangan rotasi; 6. Gerak translasi rotasi" );
                tampilan7.setText ( " F1 : agaya 1, F2 : gaya 2" );
                tampilan8.setText ( " m1 : massa benda1, m2 : massa benda 2" );
                tampilan9.setText ( " I : momen inersia benda  " );
                tampilan10.setText ( " T1 : torsi 1, T2 torsi benda 2" );
                tampilan11.setText ( " teta : sudut antara  r dan F" );
                tampilan12.setText ( " W1 : dibaca omega 1 : kecepatan sudut sistem 1" );
                tampilan13.setText ( " r1, r2 : radius atau lengan torsi " );
                tampilan14.setText ( " mk : massa katrol " );
                tampilan15.setText ( " v : kecepatan linear atau tangensial" );
                tampilan16.setText ( " g : percepatan gravitasi" );
                tampilan17.setText ( " L : momentum sudut" );
                tampilan18.setText ( " Ek : energi kinetik" );
                tampilan19.setText ( " rk : jari-jari katrol" );
                tampilan20.setText ( " a : percepatan; h : ketinggian puncak bidang miring" );

            }
        } );

        btnI.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );

                m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );

                // ( r1r1 != 0 && m1m1!= 0  )
                    tampilan1.setText ( " momen inersia titik massa I = m r^2 " );
                    II = m1m1 * Math.pow ( r1r1 , 2 );
                    tampilan2.setText ( "momen inersia titik massa = " + df.format ( II ) + "kgm2" );
                    tampilan4.setText ( " momen inersia silinder pejal pusat rotasi di sumbu I = 0,5 m r^2 " );
                    II= 0.5 * m1m1 * Math.pow ( r1r1 , 2 );
                    tampilan5.setText ( "momen inersia silinder pejal = " + df.format (II ) + "kgm2" );
                    tampilan7.setText ( " momen inersia silinder tipis pusat rotasi di sumbu I =  m r^2 " );
                    II = m1m1 * Math.pow ( r1r1 , 2 );
                    tampilan8.setText ( "momen inersia silinder tipis = " + df.format ( II ) + "kgm2" );
                    tampilan10.setText ( " momen inersia bola pejal pusat rotasi di sumbu I = 2/5 m r^2 " );
                    II = 0.4 * m1m1 * Math.pow ( r1r1 , 2 );
                    tampilan11.setText ( "momen inersia bola pejal = " + df.format ( II ) + "kgm2" );
                    tampilan13.setText ( " momen inersia bola kulit pusat rotasi di sumbu I = 2/3 m r^2 " );
                    II = 0.66666 * m1m1 * Math.pow ( r1r1 , 2 );
                    tampilan14.setText ( "momen inersia bola kulit= " + df.format ( II ) + "kgm2" );
                    tampilan16.setText ( " momen inersia batang dengan panjang r, rotasi di sumbu I = 1/12 m r^2 " );
                    II = m1m1 * Math.pow ( r1r1 , 2 ) / 12;
                    tampilan17.setText ( "momen inersia batang = " + df.format (II ) + "kgm2" );

                }
        } );



        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
@Override
public void onClick ( final View view ) {
        DecimalFormat df = new DecimalFormat ( "#.###" );

        if
            (!r1.getText ( ).toString ( ).equals ( "" )   &&
                    !F1.getText ( ).toString ( ).equals ( "" )   &&
                    !teta. getText ( ).toString ( ).equals ( "" )) {
                r1r1 = Double.parseDouble(r1.getText().toString());
                F1F1 = Double.parseDouble(F1.getText().toString());
                tetateta   = Double.parseDouble(teta.getText().toString());

            tampilan1.setText ( " torsi T = r x F; besar torsi =  r F sin(teta) " );
            deg = 0.01744444 * alfaalfa;
            sin = Math.sin ( deg );
        T1T1 = r1r1 *F1F1*sin;
        tampilan2.setText ( "T = " + df.format (T1T1) + "Nm" );
        } else

    if
        (!I.getText ( ).toString ( ).equals ( "" )   &&
                !alfa. getText ( ).toString ( ).equals ( "" )) {
            II = Double.parseDouble(I.getText().toString());
            alfaalfa = Double.parseDouble(F1.getText().toString());

        tampilan1.setText ( " torsi T = I * alfa " );

        T1T1 = II*alfaalfa;
        tampilan2.setText ( "T = " + df.format (T1T1) + "Nm" );
        }
        }} );

        btnw.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                (!alfa.getText ( ).toString ( ).equals ( "" )   &&
                        !t. getText ( ).toString ( ).equals ( "" )) {
                    alfaalfa = Double.parseDouble(alfa.getText().toString());
                    tt = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " w = wo + alfa*t " );
                    tampilan2.setText ( " wo = 0 " );
                    tampilan3.setText ( " w = alfa*t " );
                 WW = alfaalfa*tt;
                    tampilan2.setText ( " w = " + df.format (WW) + "rad/s" );
                } else

                if
                (!wo.getText ( ).toString ( ).equals ( "" )   &&
                        !t.getText ( ).toString ( ).equals ( "" )   &&
                        !alfa. getText ( ).toString ( ).equals ( "" )) {
                    wowo = Double.parseDouble ( wo.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( F1.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " w = wo + alfa*t " );

                    WW = wowo + alfaalfa * tt;
                    tampilan2.setText ( " w = " + df.format ( WW ) + "rad/s" );
                }else if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !wo.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        wowo = Double.parseDouble(wo.getText().toString());
                        m1m1 = Double.parseDouble(m1.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                        tampilan1.setText ( " w = wo + alfa*t " );
                        tampilan2.setText ( " alfa = torsi/I " );
                        tampilan3.setText ( " 1. Kasus CINCIN TIPIS " );
                        tampilan4.setText ( " cincin tipis I = mr^2 " );
                        II = m1m1*r1r1*r1r1;
                        alfaalfa= T1T1/II;
                        WW = wowo+ alfaalfa*tt;
                        tampilan5.setText ( " I = " + df.format (II) + "kgm^2" );
                        tampilan6.setText ( " alfa = " + df.format (alfaalfa) + "rad/s^2" );
                        tampilan7.setText ( " w = " + df.format (WW) + "rad/s" );

                        tampilan9.setText ( " w = wo + alfa*t " );
                        tampilan10.setText ( " alfa = torsi/I " );
                        tampilan11.setText ( " 2. Kasus SILINDER PEJAL " );
                        tampilan12.setText ( " cincin tipis I = 1/2mr^2 " );
                        II = m1m1*r1r1*r1r1/2;
                        alfaalfa= T1T1/II;
                        WW = wowo+ alfaalfa*tt;
                        tampilan13.setText ( " I = " + df.format (II) + "kgm^2" );
                        tampilan14.setText ( " alfa = " + df.format (alfaalfa) + "rad/s^2" );
                        tampilan15.setText ( " w = " + df.format (WW) + "rad/s" );

                }else if
                (!m1.getText ( ).toString ( ).equals ( "" )   &&
                                !r1.getText ( ).toString ( ).equals ( "" )   &&
                                !t.getText ( ).toString ( ).equals ( "" )   &&
                                !T1. getText ( ).toString ( ).equals ( "" )) {
                    m1m1 = Double.parseDouble(m1.getText().toString());
                    r1r1 = Double.parseDouble(r1.getText().toString());
                    tt = Double.parseDouble(t.getText().toString());
                    T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " w = wo + alfa*t " );
                    tampilan2.setText ( " wo = 0" );
                    tampilan3.setText ( " alfa = torsi/I " );
                    tampilan4.setText ( " 1. Kasus CINCIN TIPIS " );
                    tampilan5.setText ( " cincin tipis I = mr^2 " );
                    II = m1m1*r1r1*r1r1;
                    alfaalfa= T1T1/II;
                    WW = alfaalfa*tt;
                    tampilan6.setText ( " I = " + df.format (II) + "kgm^2" );
                    tampilan7.setText ( " alfa = " + df.format (alfaalfa) + "rad/s^2" );
                    tampilan8.setText ( " w = " + df.format (WW) + "rad/s" );

                    tampilan10.setText ( " w = wo + alfa*t " );
                    tampilan11.setText ( " wo = 0" );
                    tampilan12.setText ( " alfa = torsi/I " );
                    tampilan13.setText ( " 2. Kasus SILINDER PEJAL " );
                    tampilan14.setText ( " cincin tipis I = 1/2mr^2 " );
                    II = m1m1*r1r1*r1r1/2;
                    alfaalfa= T1T1/II;
                    WW = wowo+ alfaalfa*tt;
                    tampilan15.setText ( " I = " + df.format (II) + "kgm^2" );
                    tampilan16.setText ( " alfa = " + df.format (alfaalfa) + "rad/s^2" );
                    tampilan17.setText ( " w = " + df.format (WW) + "rad/s" );


                } else if
                (!rk.getText ( ).toString ( ).equals ( "" )   &&
                        !mk.getText ( ).toString ( ).equals ( "" )   &&
                        !m1.getText ( ).toString ( ).equals ( "" )   &&
                        !t.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    rkrk = Double.parseDouble ( rk.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    mkmk = Double.parseDouble ( mk.getText ( ).toString ( ) );
                    m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " katrol (mk, rk) yang diputar oleh tali yang ujungnya diikatkan massa (m1) " );
                    tampilan2.setText ( " dalam kasus ini percepatan maksumum selalu alfa * rk =< g " );
                    tampilan3.setText ( " pada beban berlaku: tegangan tali = m1*(g-a). " );
                    tampilan4.setText ( " pada katrol: torsi = I*alfa " );
                    tampilan5.setText ( " rk * tegangan tali = I*alfa " );
                    tampilan6.setText ( " percepatan linear: a = r*alfa " );
                    tampilan7.setText ( " tegangan tali = I a/rk^2 " );
                    tampilan8.setText ( " m1*(g-a) = I a/rk^2 " );
                    tampilan9.setText ( " a = (m1*g*rk^2)/(I + m1*rk^2) " );
                    tampilan10.setText ( " untuk katrol silender pejal I = 0,5 mk*rk^2" );
                    tampilan11.setText ( "  percepatan linear a = m1*g/(0,5 mk + m1) " );
                    tampilan12.setText ( "  kecepatan sudut, omega = alfa*t " );
                    aa = m1m1 * gg / (0.5 * mkmk + m1m1);
                    alfaalfa = aa / rkrk;
                    WW = alfaalfa * tt;
                    tampilan13.setText ( "alfa = " + df.format ( alfaalfa ) + "rad/s2" );
                    tampilan14.setText ( "a = " + df.format ( aa ) + "m/s2" );
                    tampilan15.setText ( "  kecepatan sudut setelah t = "+ df.format ( tt ) + "s" );
                    tampilan16.setText ( " omega = " + df.format ( WW ) + "rad/s" );

                    tampilan18.setText ( "untuk katrol silender tipis I =  mk*rk^2" );
                    tampilan19.setText ( "  percepatan linear a = m1g/(mk + m1) " );
                    aa = m1m1 * gg / (mkmk + m1m1);
                    alfaalfa = aa / rkrk;
                    WW = alfaalfa * tt;

                    tampilan20.setText ( "a = " + df.format ( aa ) + "m/s2" );
                    tampilan21.setText ( "alfa = " + df.format ( alfaalfa ) + "rad/s2" );
                    tampilan22.setText ( "  kecepatan sudut setelah t = "+ df.format ( tt ) + "s" );
                    tampilan23.setText ( " omega = " + df.format ( WW ) + "rad/s" );

                } else if
                (!r1.getText ( ).toString ( ).equals ( "" )   &&
                                !m1.getText ( ).toString ( ).equals ( "" )   &&
                                !m2.getText ( ).toString ( ).equals ( "" )   &&
                                !t.getText ( ).toString ( ).equals ( "" )   &&
                                !g. getText ( ).toString ( ).equals ( "" )) {
                    r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );
                    m2m2 = Double.parseDouble ( m2.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " katrol (m1, r1)yang diputar oleh tali yang ujungnya diikatkan massa m2 " );
                    tampilan2.setText ( " dalam kasus ini percepatan maksumum selalu alfa * r1 =< g " );
                    tampilan3.setText ( " pada beban berlaku: tegangan tali = m2*(g-a). " );
                    tampilan4.setText ( " pada katrol: torsi = I*alfa " );
                    tampilan5.setText ( " r1 * tegangan tali = I*alfa " );
                    tampilan6.setText ( " percepatan linear: a = r1*alfa " );
                    tampilan7.setText ( " tegangan tali = I a/r1^2 " );
                    tampilan8.setText ( " m2*(g-a) = I a/r1^2 " );
                    tampilan9.setText ( " a = (m1*g*r1^2)/(I + m1*r1^2) " );
                    tampilan10.setText ( " untuk katrol silender pejal: I = 0,5 m1*r1^2" );
                    tampilan11.setText ( " percepatan linear: a = m2*g/(0,5 m1 + m2) " );
                    tampilan12.setText ( " kecepatan sudut: omega = alfa*t " );
                    aa = m2m2 * gg / (0.5 * m1m1 + m2m2);
                    alfaalfa = aa / r1r1;
                    WW = alfaalfa * tt;

                    tampilan13.setText ( " a = " + df.format ( aa ) + "m/s2" );
                    tampilan14.setText ( " alfa = " + df.format ( alfaalfa ) + "rad/s2" );
                    tampilan15.setText ( " kecepatan sudut setelah t = "+ df.format ( tt ) + "s" );
                    tampilan16.setText ( " omega = " + df.format ( WW ) + "rad/s" );


                    tampilan18.setText ( " untuk katrol silender tipis I =  m1 r1^2" );
                    tampilan19.setText ( " percepatan linear a = m2g/(m1 + m2) " );
                    aa = m2m2 * gg / (m1m1 + m2m2);
                    alfaalfa = aa / r1r1;
                    WW = alfaalfa * tt;
                    tampilan20.setText ( " a = " + df.format ( aa ) + "m/s2" );
                    tampilan21.setText ( " alfa = " + df.format ( alfaalfa ) + "rad/s2" );
                    tampilan22.setText ( " kecepatan sudut setelah t = "+ df.format ( tt ) + "s" );
                    tampilan23.setText ( " omega = " + df.format ( WW ) + "rad/s" );



                }
            }} );




        btnF1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !F2.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        F2F2 = Double.parseDouble(F2.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F1 = r2 * F2 /r1 " );
                    F1F1 = r2r2 * F2F2/r1r1;
                    tampilan5.setText ( "F1 = " + df.format (F1F1) + "N" );
                } else
                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !m2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                       m2m2  = Double.parseDouble(m2.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F1 = r2 * m2m2*gg /r1 " );
                    F1F1 = r2r2 * F2F2/r1r1;
                    tampilan5.setText ( "F1 = " + df.format (F1F1) + "N" );
            }}} );
        btnm1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !F2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                        F2F2  = Double.parseDouble(F2.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F1 = r2 * F2 /r1;  F1 = m1 g ;  m1 = r2*F2/(g*r1) " );
                    m1m1 = r2r2 * F2F2/(gg*r1r1);
                    tampilan5.setText ( "m1 = " + df.format (m1m1) + "kg" );
                } else
                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !m2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                        m2m2  = Double.parseDouble(m2.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  m1 = r2 * m2m2*gg / (g*r1);   m1 = m2 * r2/r1 " );
                    m1m1 = r2r2 * m2m2/r1r1;
                    tampilan5.setText ( "m1 = " + df.format (m1m1) + "kg" );
                }}} );

        btnF2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                       F1F1  = Double.parseDouble(F1.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F2 = r1 * F1 /r2 " );
                    F2F2 = r1r1 * F1F1/r2r2;
                    tampilan5.setText ( "F2 = " + df.format (F2F2) + "N" );
                } else

                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                        m1m1  = Double.parseDouble(m1.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F2 = r1 * m1m1*gg /r2 " );
                    F2F2 = r1r1 * F1F1/r2r2;
                    tampilan5.setText ( "F2 = " + df.format (F2F2) + "N" );
            }}} );

        btnm2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                        F1F1  = Double.parseDouble(F1.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F2 = r1 * F1 /r2;  F2 = m2 g ;  m2 = r1*F1/(g*r2) " );
                    m2m2 = r1r1 * F1F1/(gg*r2r2);
                    tampilan5.setText ( "m2 = " + df.format (m2m2) + "kg" );
                } else
                if
                    (!r1.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r2. getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r2r2   = Double.parseDouble(r2.getText().toString());
                        m1m1  = Double.parseDouble(m1.getText().toString());

                    tampilan1.setText ( " syarat kesetimbangan rotasi: jumlah torsi nol " );
                    tampilan2.setText ( " perlu diperhatikan arah gaya dan arah vektor r " );
                    tampilan3.setText ( " pangkal vektor r ada di sumbu rotasi; vektor mengarah ke kanan positif; gaya ke atas positif dan sebaliknya " );
                    tampilan4.setText ( "  F2 = r1 * F1 /r2;  F1 = m1 g ;  m2 = r1*m1*g/(g*r2); m2 = r1 * m1/r2 " );
                    m2m2 = r1r1 * m1m1/r2r2;
                    tampilan5.setText ( "m2 = " + df.format (m2m2) + "kg" );
                }}} );



        btnalfa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!rk.getText ( ).toString ( ).equals ( "" )   &&
                            !mk.getText ( ).toString ( ).equals ( "" )   &&
                            !m1.getText ( ).toString ( ).equals ( "" )   &&
                            !m2.getText ( ).toString ( ).equals ( "" )   &&
                            !g. getText ( ).toString ( ).equals ( "" )) {
                        rkrk = Double.parseDouble(rk.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        mkmk = Double.parseDouble(mk.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());
                        m2m2   = Double.parseDouble(m2.getText().toString());
                 if(m1m1 < m2m2) {

                    tampilan1.setText ( " ini adalah model alat Atwod, dua beda m1 dan m2 dihubungkan tali melalui katrol dengan massa mk dan jari-jari rk " );
                    tampilan2.setText ( " dalam kasus ini percepatan maksimum : alfa * r =< g " );
                    tampilan3.setText ( " pada m1 berlaku tegangan T1 - m1g = m1 a1 " );
                    tampilan4.setText ( " pada katrol torsi rk(T2 - T1) = I alfa " );
                    tampilan5.setText ( " pada m2 berlaku m2g - T2 = m2 a2 " );
                    tampilan6.setText ( " ingat a1 = a2 = a = alfa/r, maka  " );
                    tampilan7.setText ( " percepatan a = (m2 - m1)/(I/r^2 + (m1 + m2)) " );
                    aa = (m2m2-m1m1)*gg/(0.5*mkmk + m1m1+m2m2);
                    alfaalfa = aa/rkrk;
                    tampilan8.setText ( "untuk katrol silender pejal I = 0,5 mk rk^2" );
                    tampilan9.setText ( "a = " + df.format (aa) + "m/s2" );
                    tampilan10.setText ( "alfa = " + df.format (alfaalfa) + "rad/s2" );
                    tampilan11.setText ( "untuk katrol silender tipis I = mk rk^2" );
                    aa = (m2m2-m1m1)*gg/(mkmk + m1m1+m2m2);
                    alfaalfa = aa/rkrk;
                    tampilan12.setText ( "a = " + df.format (aa) + "m/s2" );
                    tampilan13.setText ( "alfa = " + df.format (alfaalfa) + "rad/s2" );
                } else
                if (  m1m1 > m2m2 ) {
                    tampilan1.setText ( " ini adalah model alat Atwod, dua beda m1 dan m2 dihubungkan tali melalui katrol dengan massa mk dan jari-jari rk " );
                    tampilan2.setText ( " dalam kasus ini percepatan maksumum : alfa * r =< g " );
                    tampilan3.setText ( " pada m1 berlaku tegangan  m1g - T1 = m1 a1 " );
                    tampilan4.setText ( " pada katrol torsi rk(T1 - T2) = I alfa " );
                    tampilan5.setText ( " pada m2 berlaku T2 - m2g = m2 a2 " );
                    tampilan6.setText ( " ingat a1 = a2 = a = alfa/r, maka  " );
                    tampilan7.setText ( " percepatan a = (m1 - m2)/(I/r^2 + (m1 + m2)) " );
                    aa = (m1m1-m2m2)*gg/(0.5*mkmk + m1m1+m2m2);
                    alfaalfa = aa/rkrk;
                    tampilan8.setText ( "untuk katrol silender pejal I = 0,5 mk rk^2" );
                    tampilan9.setText ( "a = " + df.format (aa) + "m/s2" );
                    tampilan10.setText ( "alfa = " + df.format (alfaalfa) + "rad/s2" );
                    tampilan11.setText ( "untuk katrol silender tipis I = mk rk^2" );
                    aa = (m1m1-m2m2)*gg/(mkmk + m1m1+m2m2);
                    alfaalfa = aa/rkrk;
                    tampilan12.setText ( "a = " + df.format (aa) + "m/s2" );
                    tampilan13.setText ( "alfa = " + df.format (alfaalfa) + "rad/s2" );
            }} else
                if
                    (!rk.getText ( ).toString ( ).equals ( "" )   &&
                     !mk.getText ( ).toString ( ).equals ( "" )   &&
                     !m1.getText ( ).toString ( ).equals ( "" )   &&
                     !g. getText ( ).toString ( ).equals ( "" )) {
                    rkrk = Double.parseDouble ( rk.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    mkmk = Double.parseDouble ( mk.getText ( ).toString ( ) );
                    m1m1 = Double.parseDouble ( m1.getText ( ).toString ( ) );

                    tampilan1.setText ( " katrol yang diputar oleh tali yang ujungnya diikatkan massa " );
                    tampilan2.setText ( " dalam kasus ini percepatan maksumum atasi alfa * r =< g " );
                    tampilan3.setText ( " pada beban berlaku tegangan tali = m(g-a). " );
                    tampilan4.setText ( " pada katrol torsi = I alfa; rk tegangan tali = I alfa " );
                    tampilan5.setText ( "  percepatan linear a = r alfa;  tegangan tali = I a/r^2 " );
                    tampilan6.setText ( "  percepatan linear a = m g/(0,5 mk + m) " );
                    aa = m1m1 * gg / (0.5 * mkmk + m1m1);
                    alfaalfa = aa / rkrk;
                    tampilan8.setText ( "untuk katrol silender pejal I = 0,5 mk rk^2" );
                    tampilan9.setText ( "a = " + df.format ( aa ) + "m/s2" );
                    tampilan10.setText ( "alfa = " + df.format ( alfaalfa ) + "rad/s2" );
                    tampilan11.setText ( "  percepatan linear a = mg/(mk + m) " );
                    aa = m1m1 * gg / (mkmk + m1m1);
                    alfaalfa = aa / rkrk;
                    tampilan12.setText ( "untuk katrol silender tipis I =  mk rk^2" );
                    tampilan13.setText ( "a = " + df.format ( aa ) + "m/s2" );
                    tampilan14.setText ( "alfa = " + df.format ( alfaalfa ) + "rad/s2" );


                } } } );

        btnL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !teta. getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble(v.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());
                        tetateta   = Double.parseDouble(teta.getText().toString());
                    tampilan1.setText ( " momentum sudut " );
                    tampilan2.setText ( " L = r x p = r x mv  (cross) " );
                    tampilan3.setText ( " besar momentum sudut L = r m v sin teta " );
                    deg = 0.01744444 * tetateta;
                    sin = Math.sin ( deg );
                    L = r1r1*m1m1*vv*sin;
                    tampilan4.setText ( "L = " + df.format (L) + "kgm2/s" );

                } else
                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !teta. getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble(W.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());
                        tetateta   = Double.parseDouble(teta.getText().toString());

                    tampilan1.setText ( " momentum sudut " );
                    tampilan2.setText ( " L = r x p = r x m Wr  (cross) " );
                    tampilan3.setText ( " besar momentum sudut L = m Wr^2  sin teta " );
                    deg = 0.01744444 * tetateta;
                    sin = Math.sin ( deg );
                    L = Math.pow(r1r1,2)*m1m1*WW*sin;
                    tampilan4.setText ( "L = " + df.format (L) + "kgm2/s" );
                } else
                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble(W.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());


                    tampilan1.setText ( " momentum sudut " );
                    tampilan2.setText ( " L = r x p = r x m Wr  (cross) " );
                    tampilan3.setText ( " kasus v tegak lurus r, besar momentum sudut L = m Wr^2 " );
                    L = Math.pow ( r1r1 , 2 ) * m1m1 * WW;
                    tampilan4.setText ( "L = " + df.format ( L ) + "kgm2/s" );
                }

            }} );
        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble(W.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());

                    tampilan1.setText ( " Energi kinetik rotasi " );

                    II = m1m1*Math.pow(r1r1,2);
                   EkEk = 0.5*II*Math.pow(WW,2);
                    tampilan2.setText ( " Energi kinetik rotasi  Ek = 0,5 I W^2  " );
                    tampilan3.setText ( " untuk silinder tipis I = m r^2" );
                    tampilan4.setText ( " momen inersia I = " + df.format (II) + " kgm^2" );
                    tampilan5.setText ( " Ek = " + df.format (EkEk) + " J" );

                    II= 0.5*m1m1*Math.pow(r1r1,2);
                    EkEk = 0.5*II*Math.pow(WW,2);
                    tampilan7.setText ( " silinder pejal I = 0,5 mr^2 " );
                    tampilan8.setText ( " momen inersia I = " + df.format (II) + " kgm^2" );
                    tampilan9.setText ( " Ek = " + df.format (EkEk) + " J" );

                    II = 0.666667*m1m1*Math.pow(r1r1,2);
                    EkEk = 0.5*II*Math.pow(WW,2);
                    tampilan11.setText ( " bola kulit I = 2/3 mr^2  " );
                    tampilan12.setText ( " momen inersia I = " + df.format (II) + " kgm^2" );
                    tampilan13.setText ( " Ek = " + df.format (EkEk) + " J" );


                    II = 0.4*m1m1*Math.pow(r1r1,2);
                    EkEk = 0.5*II*Math.pow(WW,2);
                    tampilan15.setText ( " bola pejal I = 2/5 mr^2" );
                    tampilan16.setText ( " momen inersia I = " + df.format (II) + " kgm^2" );
                    tampilan17.setText ( " Ek = " + df.format (EkEk) + " J" );



                } else
                if
                    (!I.getText ( ).toString ( ).equals ( "" )   &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble(W.getText().toString());
                        II = Double.parseDouble(I.getText().toString());


                    tampilan1.setText ( "Energi kinetik rotasi " );
                    tampilan2.setText ( "Ek = 0,5 I W^2 " );

                    EkEk = 0.5*II*Math.pow(WW,2);
                    tampilan3.setText ( "Energi kinetik rotasi  " );
                    tampilan4.setText ( "Ek = " + df.format (EkEk) + " J" );


                } else
                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble(v.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());


                    tampilan1.setText ( "Energi kinetik rotasi& traslasi " );
                    tampilan2.setText ( "Ek = 0,5 I W^2 + 0,5 mv^2 " );
                    tampilan3.setText ( " Energi kinetik translasi rotasi (Ektr) bergantung bentuk benda " );

                    tampilan4.setText ( " Silinder tipis I = mr^2 " );
                    tampilan5.setText ( " Ektr = 0,5 mv^2 + 0,5(mr^2)W^2 " );
                    tampilan6.setText ( " Ektr = mv^2" );
                    EkEk = m1m1 * Math.pow ( vv , 2 );
                    tampilan7.setText ( "Ektr = " + df.format ( EkEk ) + " J" );

                    tampilan9.setText ( " Silinder pejal I = 0,5mr^2 " );
                    tampilan10.setText ( " Ektr = 0,5 mv^2 + 0,5(0,5mr^2)W^2 " );
                    tampilan11.setText ( " Ektr = 0,75 mv^2" );

                    EkEk = 0.75*m1m1 * Math.pow ( vv , 2 );
                    tampilan12.setText ( "Ektr = " + df.format ( EkEk ) + " J" );

                    tampilan14.setText ( " bola kulit I = 2/3*mr^2" );
                    tampilan15.setText ( " Ektr = 0,5 mv^2 + 0,5(2/3 mr^2)W^2 " );
                    tampilan16.setText ( " Ektr =  5/6 mv^2" );
                    EkEk = 0.833333*m1m1 * Math.pow ( vv , 2 );
                    tampilan17.setText ( "Ektr = " + df.format ( EkEk ) + " J" );

                    tampilan19.setText ( " bola pejal I = 2/5*mr^2 " );
                    tampilan20.setText ( " Ektr = 0,5 mv^2 + 0,5(2/5 mr^2)W^2 " );
                    tampilan21.setText ( " Ektr = 7/10 mv^2" );
                    EkEk = 0.7*m1m1 * Math.pow ( vv , 2 );
                    tampilan22.setText ( "Ektr = " + df.format ( EkEk ) + " J" );


                }

                }} );

        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m1.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r1.getText ( ).toString ( ).equals ( "" )   &&
                            !h. getText ( ).toString ( ).equals ( "" )) {
                       gg = Double.parseDouble(g.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        m1m1= Double.parseDouble(m1.getText().toString());
                        hh   = Double.parseDouble(h.getText().toString());

                    tampilan1.setText ( "Hukum kekekalan energi, energi potensial = Energi kinetik translasi rotasi " );
                    tampilan2.setText ( "mgh = 1/2*mv^2  + 1/2 I W^2 " );
                    tampilan3.setText ( "silinder tipis I = m r^2" );
                    tampilan4.setText ( "mgh = 0,5 mv^2 + 0,5 mr^2 W^r " );
                    tampilan5.setText ( "mgh = mv^2 " );
                    tampilan6.setText ( "v = (gh)^0,5 " );
                    vv = gg*hh;
                   vv = Math.pow(vv,0.5);
                    tampilan7.setText ( "Kecepatan silinder tipis menggelinding adalah" );
                    tampilan8.setText ( "v = " + df.format (vv) + "m/s" );

                    tampilan10.setText ( "silinder pejal I = 0,5 m r^2 " );
                    tampilan11.setText ( "mgh = 0,5 mv^2 + 0,5 *0,5*mr^2 W^r " );
                    tampilan12.setText ( "mgh = 0,75 mv^2 " );
                    tampilan13.setText ( "v = (4/3*gh)^0,5 " );
                    vv = 4*gg*hh/3;
                    vv = Math.pow(vv,0.5);
                    tampilan14.setText ( "Kecepatan silinder pejal menggelinding adalah" );
                    tampilan15.setText ( "v = " + df.format (vv) + "m/s" );


                    tampilan17.setText ( "bola kulit I = 2/3 m r^2 " );
                    tampilan18.setText ( "mgh = 0,5 mv^2 + 0,5 *2/3*mr^2 W^r  " );
                    tampilan19.setText ( "mgh = 5/6* mv^2 " );
                    tampilan20.setText ( "v = (6/5*gh)^0,5 " );
                    vv = 6*gg*hh/5;
                    vv = Math.pow(vv,0.5);
                    tampilan21.setText ( "Kecepatan bola kulit menggelinding adalah" );
                    tampilan22.setText ( "v = " + df.format (vv) + "m/s" );

                    tampilan24.setText ( "bola pejal I = 2/5 m r^2" );
                    tampilan25.setText ( "mgh = 0,5 mv^2 + 0,5 *2/5*mr^2 W^r  " );
                    tampilan26.setText ( "mgh = 7/10* mv^2 " );
                    tampilan27.setText ( "v = (10/7*gh)^0,5 " );
                    vv = 10*gg*hh/7;
                    vv = Math.pow(vv,0.5);
                    tampilan28.setText ( "Kecepatan bola pejal menggelinding adalah" );
                    tampilan29.setText ( "v = " + df.format (vv) + "m/s" );



                }

            }} );


        btnWork.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                (!wo.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )   &&
                        !I. getText ( ).toString ( ).equals ( "" )) {
                    wowo = Double.parseDouble ( wo.getText ( ).toString ( ) );
                    WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                    II = Double.parseDouble ( I.getText ( ).toString ( ) );


                    tampilan1.setText ( "Usaha = perubahan Energi kinetik rotasi " );
                    tampilan2.setText ( "Energi kinetik rotasi Ek =0,5*I*w^2 " );
                    tampilan3.setText ( "Usaha W =0,5*I*(wb^2 - w^2)" );
                    A = Math.pow ( wowo , 2 );
                    B = Math.pow ( WW , 2 );
                    wowo = 0.5 * II * (B - A);

                    tampilan5.setText ( "Usaha = " + df.format ( wowo ) + " J" );

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

                T1.setText ( "" );
                T2.setText ( "" );
                F1.setText ( "" );
                F2.setText ( "" );
                r1.setText ( "" );
                r2.setText ( "" );
                m1.setText ( "" );
                m2.setText ( "" );
                I.setText ( "" );
                h.setText ( "" );
                teta.setText ( "" );
                alfa.setText ( "" );
                v.setText ( "" );
                W.setText ( "" );
                mk.setText ( "" );
                g.setText ( "" );
                Ek.setText ( "" );
                rk.setText ( "" );
            }
        } );

    }

}


