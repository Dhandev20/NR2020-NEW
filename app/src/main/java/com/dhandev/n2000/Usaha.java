package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class Usaha extends AppCompatActivity {
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
    private EditText m, g, h, F, S,  k, dx, alfa, teta, uk, v, v2,t, W;

    private Double mm, gg,dxdx, FF,Fe, WW,We, hh, Ek, Ep, tt, kk, SS, aalfa, teeta, ukuk, vv,v2v2, P,Wg, a, Fg;

    private Double cos, sin, tan, deg;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_usaha );

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
        dx = findViewById ( R.id.in_dx );
        S = findViewById ( R.id.in_S );
        t = findViewById ( R.id.in_t );
        g = findViewById ( R.id.in_g );
        F = findViewById ( R.id.in_F );
        uk = findViewById ( R.id.in_uk );
        v = findViewById ( R.id.in_v );
        v2 = findViewById ( R.id.in_f );
        alfa = findViewById ( R.id.in_alfa );
        teta = findViewById ( R.id.in_teta );
        h = findViewById ( R.id.in_h );
        W = findViewById ( R.id.in_W );
        Button btnk = findViewById ( R.id.btn_k );
        Button btnm = findViewById ( R.id.btn_m );
        Button btnF = findViewById ( R.id.btn_F );
        Button btndx = findViewById ( R.id.btn_dx );
        Button btnEk = findViewById ( R.id.btn_Ek );
        Button btnW = findViewById ( R.id.btn_W );
        Button btnEp = findViewById ( R.id.btn_Ep );
        Button btnuk = findViewById ( R.id.btn_uk );
        Button btnalfa = findViewById ( R.id.btn_alfa );
        Button btnteta = findViewById ( R.id.btn_teta );
        Button btnv = findViewById ( R.id.btn_v );
        Button btnh = findViewById ( R.id.btn_h );
        Button btnS = findViewById ( R.id.btn_S );
        Button btnP = findViewById ( R.id.btn_P );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Usaha dan Energi:" );
                tampilan2.setText ( "Peristiwa mencakup: Usaha pada bidang miring dengan atau tanpa gesekan, " +
                        "memindah beda pada lantai licin atau kasar dengan gaya membentuk sudut atau sejajar, " +
                        "  usaha pada gerak vertikal, " +
                        "  usaha pada pegas, " +
                        "  usha dan dan perubahan energi kinetik" );
                tampilan3.setText ( " Variabel yang digunakan" );
                tampilan4.setText ( "alfa : sudut bidang miring" );
                tampilan5.setText ( " g : percepatan gravitasi bumi" );
                tampilan6.setText ( " m : massa" );
                tampilan7.setText ( " V1 : kecepatan ; bila tidak ada kecepatan lain gunakan v1" );
                tampilan8.setText ( " k : konstanta pegas" );
                tampilan9.setText ( " dx : pertambahan panjang pegas" );
                tampilan10.setText ( " h : ketinggian " );
                tampilan11.setText ( " teta : sudut antara perpindahan dan gaya" );
                tampilan12.setText ( " uk : koefisien gesek kinetis" );
                tampilan13.setText ( " W : usaha " );
                tampilan14.setText ( " t : selang waktu " );
                tampilan15.setText ( " V2: kecepatan akhir saat t" );
                tampilan16.setText ( " " );
                tampilan17.setText ( " F : gaya" );
                tampilan18.setText ( " S : perpindahan" );
                tampilan19.setText ( " " );
                tampilan20.setText ( " " );

            }});

        btnW.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                 if
                     (!m.getText ( ).toString ( ).equals ( "" )   &&
                             !g.getText ( ).toString ( ).equals ( "" )   &&
                             !uk.getText ( ).toString ( ).equals ( "" )  &&
                             !alfa.getText ( ).toString ( ).equals ( "" )  &&
                             !S. getText ( ).toString ( ).equals ( "" )) {
                         mm = Double.parseDouble(m.getText().toString());
                         gg = Double.parseDouble(g.getText().toString());
                         ukuk   = Double.parseDouble(uk.getText().toString());
                         SS   = Double.parseDouble(S.getText().toString());
                         aalfa   = Double.parseDouble(alfa.getText().toString());

                     tampilan1.setText ( " usaha gaya dorong ke atas pada bidang miring dengan sudut alfa dan koefisien gesek kinetik uk " );
                     tampilan2.setText ( "  W = F S = (uk N + mgsin alfa) S = ( uk mg cos alfa + mgsin alfa) S " );
                     deg = 0.01744444 * aalfa;
                     sin = Math.sin ( deg );
                     cos = Math.cos(deg);
                     WW = mm * gg * SS*(ukuk*cos+sin);

                     tampilan3.setText ( "W = " + df.format ( WW ) + "joule" );
                 }else
                 if
                     (!m.getText ( ).toString ( ).equals ( "" )   &&
                             !g.getText ( ).toString ( ).equals ( "" )   &&
                             !alfa.getText ( ).toString ( ).equals ( "" )  &&
                             !S. getText ( ).toString ( ).equals ( "" )) {
                         mm = Double.parseDouble(m.getText().toString());
                         gg = Double.parseDouble(g.getText().toString());
                         SS   = Double.parseDouble(S.getText().toString());
                         aalfa   = Double.parseDouble(alfa.getText().toString());

                     tampilan1.setText ( " usaha  gaya mendorong benda ke atas  pada bidang miring dengan sudut alfa tanpa gesekan" );
                     tampilan2.setText ( " W =   m g S sin (alfa) " );
                     deg = 0.01744444 * aalfa;
                     sin = Math.sin ( deg );

                     WW = mm * gg * SS * sin;
                     tampilan3.setText ( "W = " + df.format ( WW ) + "joule" );
                 } else if
                         (!m.getText ( ).toString ( ).equals ( "" )   &&
                                 !g.getText ( ).toString ( ).equals ( "" )   &&
                                 !uk.getText ( ).toString ( ).equals ( "" )  &&
                                 !F.getText ( ).toString ( ).equals ( "" )  &&
                                 !teta.getText ( ).toString ( ).equals ( "" )  &&
                                 !S. getText ( ).toString ( ).equals ( "" )) {
                             mm = Double.parseDouble(m.getText().toString());
                             gg = Double.parseDouble(g.getText().toString());
                             FF = Double.parseDouble(F.getText().toString());
                             ukuk   = Double.parseDouble(uk.getText().toString());
                             SS   = Double.parseDouble(S.getText().toString());
                             teeta   = Double.parseDouble(teta.getText().toString());

                     tampilan1.setText ( "usaha gaya memindahkan benda pada bidang datar kasar, gaya membentuk sudut teta  " +
                             " perpindahan sejauh S " );
                     tampilan2.setText ( "usaha gaya W = F cos(teta);  usaha gaya gesek Wg = - uk (mg - Fsin (teta)) S ");
                     deg = 0.01744444 * teeta;
                     WW = FF * SS * Math.cos ( deg );
                     tampilan3.setText ( " usaha oleh gaya W = " + df.format ( WW ) + "joule" );
                     tampilan4.setText ( " " );
                     Wg = - ukuk*SS*(mm*gg - FF* Math.sin ( deg ));
                     tampilan5.setText ( " Usahan gaya gesek Wg = " + df.format ( Wg ) + "joule" );
                     tampilan6.setText ( " " );
                     WW = WW + Wg;
                     tampilan7.setText ( " usaha efektif pada benda= perubahan energi kinetik benda = W + Wg = " + df.format ( WW ) + "joule" );
                     tampilan8.setText ( " " );
                     tampilan9.setText ( " " );
                     tampilan10.setText ( " " );
                     tampilan11.setText ( " " );

                 } else if
                             (!m.getText ( ).toString ( ).equals ( "" )   &&
                                     !g.getText ( ).toString ( ).equals ( "" )   &&
                                     !uk.getText ( ).toString ( ).equals ( "" )  &&
                                     !F.getText ( ).toString ( ).equals ( "" )  &&
                                     !S. getText ( ).toString ( ).equals ( "" )) {
                                 mm = Double.parseDouble(m.getText().toString());
                                 gg = Double.parseDouble(g.getText().toString());
                                 ukuk   = Double.parseDouble(uk.getText().toString());
                                 SS   = Double.parseDouble(S.getText().toString());
                                 FF   = Double.parseDouble(F.getText().toString());

                     tampilan1.setText ( "usaha gaya memindahkan benda pada bidang datar kasar, gaya sejajar  " +
                             " perpindahan sejauh S " );
                     tampilan2.setText ( " ");
                     tampilan3.setText ( "Gaya efektif = F - gaya gesek  ");
                     tampilan4.setText ( "Gaya gesek Fg = mg uk ");
                     tampilan5.setText ( "usaha gaya = F S ");
                     tampilan6.setText ( "usaha gaya efektif = gaya efektif *S ");
                    Fg = mm*gg*ukuk;
                    Fe = FF-Fg;
                    Wg = Fg*SS;
                    WW = FF*SS;
                    We = Fe*SS;
                     tampilan7.setText ( " usaha gaya gesek Wg = " + df.format ( Wg ) + "N" );
                     tampilan8.setText ( " usaha oleh gaya W = " + df.format ( WW ) + "joule" );
                     tampilan9.setText ( " " );
                     tampilan10.setText ( " usaha efektif pada benda =  " + df.format ( We ) + "joule" );
                     tampilan11.setText ( " " );
                     tampilan12.setText ( " " );
                     tampilan13.setText ( " " );
                     tampilan14.setText ( " " );




                 } else if
                                 (!F.getText ( ).toString ( ).equals ( "" )   &&
                                         !teta.getText ( ).toString ( ).equals ( "" )   &&
                                         !S. getText ( ).toString ( ).equals ( "" )) {
                                     FF = Double.parseDouble(F.getText().toString());
                                     teeta = Double.parseDouble(teta.getText().toString());
                                     SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "usaha gaya memindahkan benda pada bidang datar licin, gaya membentuk sudut teta terhadap perpindahan " +
                            "terhadap perpindahan  W = F S cos (teta) " );
                    deg = 0.01744444 * teeta;
                    WW = FF * SS * Math.cos ( deg );
                    tampilan2.setText ( "W = " + df.format ( WW ) + "joule" );
                     tampilan3.setText ( " " );
                     tampilan4.setText ( " " );
                     tampilan5.setText ( " " );
                     tampilan6.setText ( " " );



                } else
                if
                            (!F.getText ( ).toString ( ).equals ( "" )   &&
                             !S. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());

                        SS   = Double.parseDouble(S.getText().toString());


                    tampilan1.setText ( "usaha gaya memindahkan benda, arah gaya searah perpindahan W = F S " );
                    WW = FF * SS ;
                    tampilan2.setText ( "W = " + df.format ( WW ) + "joule" );

                } else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !F.getText ( ).toString ( ).equals ( "" )   &&
                                !uk.getText ( ).toString ( ).equals ( "" )  &&
                                !teta.getText ( ).toString ( ).equals ( "" )  &&
                                !t. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            FF = Double.parseDouble(F.getText().toString());
                            ukuk   = Double.parseDouble(uk.getText().toString());
                            tt   = Double.parseDouble(t.getText().toString());
                            teeta   = Double.parseDouble(teta.getText().toString());


                    tampilan1.setText ( " Balok ditarik di lantai kasar oleh gaya yang membentuk sudut teta dalam selang waktu t  " );
                    tampilan2.setText ( " usaha gaya berubah menjadi energi kinetik, W = usaha gaya - usaha gaya gesek  " );
                    tampilan3.setText ( " usaha gaya W = F S  cos teta  " );
                    tampilan4.setText ( " S = 0,5 a t^2  " );
                    tampilan5.setText ( " a = F/m;  dengan F jumlah gaya  " );
                    tampilan6.setText ( " F = F cos teta - uk (mg - F sin teta) " );
                    tampilan7.setText ( " " );
                    deg = 0.01744444 * teeta;
                    cos = Math.cos(deg);
                    sin = Math.sin ( deg );
                    Fg = ukuk*(mm*gg-FF*sin);
                    Wg = Fg*SS;

                    Fe = FF*cos - ukuk*(mm*gg-FF*sin);
                    a = Fe/mm;
                    SS = 0.5*a*Math.pow(tt,2);
                    WW= FF*SS*cos;
                    We = Fe*SS;
                    tampilan8.setText ( " Gaya gesek  Fg = " + df.format ( Fg ) + "N" );
                    tampilan9.setText ( " Gaya total  F = " + df.format ( Fe ) + "N" );
                    tampilan10.setText ( "  " );
                    tampilan11.setText ( "  Perpindahan S = " + df.format ( SS ) + "m" );
                    tampilan12.setText ( "  Usaha gaya = " + df.format ( WW ) + "J" );
                    tampilan13.setText ( "  Usaha efektif = " + df.format ( We ) + "J" );
                    tampilan14.setText ( " " );
                    tampilan15.setText ( " " );





                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( "benda di lantai licin diberi gaya dalam waktu t " );
                    tampilan2.setText ( "timbul percepatan a = F/m; perpindahan s = 0,5 a t^2 " );
                    tampilan3.setText ( "usaha yang dilakukan gaya: W = F S  " );
                    a = FF /mm ;
                    tampilan5.setText ( "a = " + df.format ( a ) + "m/s2" );
                    SS =0.5*a*tt*tt;
                    WW = FF*SS;
                    tampilan6.setText ( "S = " + df.format ( SS ) + "m" );
                    tampilan7.setText ( "W = " + df.format ( WW ) + "joule" );

                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "usaha oleh gaya gesek; W = uk mg  S  " );
                    WW = mm * gg*ukuk * SS ;
                    tampilan2.setText ( "W = " + df.format ( WW ) + "joule" );
                }else
                if
                    (!k.getText ( ).toString ( ).equals ( "" )   &&
                     !dx. getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble(k.getText().toString());
                        dxdx = Double.parseDouble(dx.getText().toString());

                    tampilan1.setText ( "usaha meregangkan atau memendekkan pegas; W = Ep = 0,5 k dx^2" );
                    WW = 0.5 * kk *  Math.pow (dxdx,2);
                    tampilan2.setText ( "W =" + df.format ( WW ) + "joule" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !h. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        hh   = Double.parseDouble(h.getText().toString());

                    tampilan1.setText ( "usaha memindahkan benda arah vertikal ke atas; W = Ep = m g h" );
                    WW = mm * gg * hh;
                    tampilan2.setText ( "W = " + df.format ( WW ) + "joule" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )  &&
                            !v2.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        vv   = Double.parseDouble(v.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        v2v2   = Double.parseDouble(v2.getText().toString());

                    tampilan1.setText ( " gaya bekerja pada benda dilantai  sehingga berpindah sejau S dan kecepatannya berubah dari v1 menjadi v2" );
                    tampilan2.setText ( "W = Perubahan Ek + usaha gaya gesek" );
                    tampilan3.setText ( "W =  0,5 m (v2^2 - v1^2)+ F S" );
                    vv = Math.pow(vv,2);
                    v2v2 = Math.pow(v2v2,2);
                    WW =0.5*mm*(v2v2-vv)+ (FF*SS);
                    tampilan5.setText ( "W = " + df.format ( WW ) + "joule" );

            }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v2.getText ( ).toString ( ).equals ( "" )  &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv   = Double.parseDouble(v.getText().toString());
                        v2v2   = Double.parseDouble(v2.getText().toString());

                    tampilan1.setText ( " gaya bekerja pada benda sehingga terjadi perubahan kecepatan; besar usaha:" );
                    tampilan2.setText ( "W = Perubahan Ek = 0,5 m (v2^2 - v1^2)" );
                    vv = Math.pow(vv,2);
                    v2v2 = Math.pow(v2v2,2);
                    WW =0.5*mm*(v2v2-vv);
                    tampilan3.setText ( "W = " + df.format ( WW ) + "joule" );
            }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());

                    tampilan1.setText ( "W = Perubahan Ek = 0,5 m v^2)" );
                    vv = Math.pow ( vv , 2 );
                    WW = 0.5 * mm * vv;
                    tampilan2.setText ( "W = " + df.format ( WW ) + "joule" );
                }}
        });
        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!W.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble(W.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());


                    tampilan1.setText ( "usaha oleh gaya konstan F yang membentuk sudut teta terhadap perpindahan  " );
                    tampilan2.setText ( "W = F S cos (teta),  F = W/S cos(teta)   " );
                    deg = 0.01744444 * teeta;
                    FF = FF / (SS * Math.cos ( deg ));
                    tampilan3.setText ( "F = " + df.format ( FF ) + "N" );

                }else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !v.getText ( ).toString ( ).equals ( "" )   &&
                                !S. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            vv = Double.parseDouble(v.getText().toString());
                            SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( " gaya bekerja pada benda bermassa m yang mula-mula diam kemudian bergerak menempuh perpindahan S dan kecepatan menjadi v" );
                    tampilan2.setText ( " W = perubahan Ek; F S = Ek ;  F = 0,5 m v^2/S " );
                    vv = Math.pow ( vv , 2 );
                    FF = 0.5 * mm * vv / SS;
                    tampilan3.setText ( "F = " + df.format ( FF ) + "N" );

                } else if
                            (!F.getText ( ).toString ( ).equals ( "" )   &&
                                    !S. getText ( ).toString ( ).equals ( "" )) {
                                FF = Double.parseDouble(F.getText().toString());
                                SS   = Double.parseDouble(S.getText().toString());

                            tampilan1.setText ( "gaya bekerja pada beda sehingga berpindah sejauh S" );
                    tampilan2.setText ( "W = F S '   F = W/S" );
                    FF = WW / SS;
                    tampilan3.setText ( "F = " + df.format ( FF ) + "N" );

                } else if
                                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !uk.getText ( ).toString ( ).equals ( "" )  &&
                                        !alfa.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    mm = Double.parseDouble(m.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    ukuk   = Double.parseDouble(uk.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());
                                    aalfa   = Double.parseDouble(alfa.getText().toString());

                     tampilan1.setText ( " gaya mendorong benda ke atas pada bidang miring dengan sudut alfa dengan koefisien gesekan gesekan uk" +
                            "F = mg(uk cos alfa + sin alfa)" );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin ( deg );
                    cos = Math.cos (deg);
                    FF = mm * gg * (ukuk *cos +  sin);

                    tampilan2.setText ( "F = " + df.format ( FF ) + "N" );
                } else if
                                    (!k.getText ( ).toString ( ).equals ( "" )   &&
                                            !dx. getText ( ).toString ( ).equals ( "" )) {
                                        kk = Double.parseDouble(k.getText().toString());
                                        dxdx = Double.parseDouble(dx.getText().toString());

                    tampilan1.setText ( "gaya untuk meregangkan atau menekan pegas " );
                    tampilan2.setText ( "F = k dx " );
                    FF = kk * dxdx;
                    tampilan3.setText ( "F = " + df.format ( FF ) + "N" );

                } else if
                                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                                !v.getText ( ).toString ( ).equals ( "" )   &&
                                                !v2.getText ( ).toString ( ).equals ( "" )  &&
                                                !S. getText ( ).toString ( ).equals ( "" )) {
                                            mm = Double.parseDouble(m.getText().toString());
                                            vv = Double.parseDouble(v.getText().toString());
                                            v2v2   = Double.parseDouble(v2.getText().toString());
                                            SS   = Double.parseDouble(S.getText().toString());

                   tampilan1.setText ( " benda dengan massa m berkecepatan v1 diberikan gaya, sehingga kecepatan menjadi v2 setelah menempuh perpindahan S" );
                    tampilan1.setText ( " W = F.S = perubahan Ek; F = 0,5 m( v2^2 - v^2)/S " );
                    vv = Math.pow(vv,2);
                    v2v2 = Math.pow(v2v2,2);
                    FF = 0.5*mm*(v2v2-vv)/SS;
                    tampilan2.setText ( "F = " + df.format ( FF ) + "N" );

                }}
        });


        btnS.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        WW   = Double.parseDouble(W.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());


                    tampilan1.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta))S, S = W/uk( mg - F sin (teta))" );
                    deg = 0.01744444 * teeta;
                    sin = Math.sin(deg);
                    SS = WW/(ukuk*(mm*gg - FF*sin));
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );
                } else

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(m.getText().toString());
                        teeta = Double.parseDouble(teta.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());


                    tampilan1.setText ( "W = F S cos (teta); S = W/F cos(teta) " );
                    deg = 0.01744444 * teeta;
                    SS = WW/(FF * Math.cos ( deg ));
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );


                } else
                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(m.getText().toString());
                        WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( "W = F S ,    S = W/F" );
                    SS = WW/FF  ;
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );

                } else  if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !F.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !uk.getText ( ).toString ( ).equals ( "" )  &&
                                !teta.getText ( ).toString ( ).equals ( "" )  &&
                                !W. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            WW = Double.parseDouble(W.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            ukuk   = Double.parseDouble(uk.getText().toString());
                            FF   = Double.parseDouble(F.getText().toString());
                            teeta   = Double.parseDouble(teta.getText().toString());

                        tampilan1.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta)) S,  S = W/uk( mg - F sin (teta)) " );
                    deg = 0.01744444 * teeta;
                    sin = Math.sin(deg);
                    SS = WW/(ukuk*(mm*gg - FF*sin));
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );

                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !W.getText ( ).toString ( ).equals ( "" )  &&
                            !g. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        WW  = Double.parseDouble(W.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());

                    tampilan1.setText ( "W = uk mg  S ,   S = W/uk mg" );
                    SS = WW/(mm * gg*ukuk );
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );


                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        WW = Double.parseDouble(W.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());


                    tampilan1.setText ( "W = Ep = m g S sin (alfa),  S = W/mgsin(alfa)" );
                    deg = 0.01744444 * aalfa;
                    SS = WW/( gg * SS* Math.sin(deg));
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        WW   = Double.parseDouble(W.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( "usaha melawan gaya gravitasi pada bidang miring dengan gaya gesek: W = uk mg S cos(alfa) +  m g S sin (alfa) = mgS( uk cos(alfa) + sin(alfa)" );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin(deg);
                    cos = Math.cos(deg);
                    SS = WW/(mm * gg * (ukuk*cos + sin));
                    tampilan2.setText ( "S = " + df.format ( SS ) + "m" );
                }else
                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !v2.getText ( ).toString ( ).equals ( "" )  &&
                            !g. getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble(v.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        v2v2   = Double.parseDouble(v2.getText().toString());

                    tampilan1.setText ( " benda meluncur karena gesekan kecepatan berkurang; perubahan Ek = usaha gaya gesek " );
                    tampilan2.setText ( "  0,5 m (v1^2 - v2^2)= Fg S = uk mg S " );
                    tampilan3.setText ( " S = 0,5 (v1^2 - v2^2)/(uk g) " );
                    vv = Math.pow ( vv , 2 );
                    v2v2 = Math.pow ( v2v2 , 2 );
                    SS = 0.5 *(vv - v2v2) / (ukuk * gg );
                    tampilan4.setText ( "S = " + df.format ( SS ) + "m" );
                } else
                    if
                        (!g.getText ( ).toString ( ).equals ( "" )   &&
                                !uk.getText ( ).toString ( ).equals ( "" )  &&
                                !v. getText ( ).toString ( ).equals ( "" )) {
                            vv = Double.parseDouble(v.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            ukuk   = Double.parseDouble(uk.getText().toString());

                        tampilan1.setText ( "benda meluncur dilantai dan berhenti karena gesekan " );
                        tampilan2.setText ( "Ek = W = F.S ; S = Ek/F = 0,5 m v^2/(uk mg) " );
                        vv = Math.pow ( vv , 2 );
                        SS = 0.5 * vv / (ukuk *  gg);
                        tampilan3.setText ( "S = " + df.format ( SS ) + "m" );

                }}
        });
        btnteta.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());
                        WW = Double.parseDouble(W.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "W = F S cos (teta), teta = acos(W/FS) " );
                    teeta= Math.acos ( WW / (FF * SS) );
                    teeta = 57.33 * teeta;
                    tampilan2.setText ( "teta = " + df.format ( teeta ) + "joule" );



                }
            }
        });
        btnEp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( " mendorong benda pada bidang miring licin, usaha total tersimpan sebagai energi potensial " );

                    tampilan2.setText ( " Ep = F s sin(alfa)" );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin ( deg );
                    Ep = FF * SS * sin;

                    tampilan3.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                } else
               if
                   (!m.getText ( ).toString ( ).equals ( "" )   &&
                           !g.getText ( ).toString ( ).equals ( "" )   &&
                           !alfa.getText ( ).toString ( ).equals ( "" )  &&
                           !S. getText ( ).toString ( ).equals ( "" )) {
                       mm = Double.parseDouble(m.getText().toString());
                       gg = Double.parseDouble(g.getText().toString());
                       SS   = Double.parseDouble(S.getText().toString());
                       aalfa   = Double.parseDouble(alfa.getText().toString());


                   tampilan1.setText ( " mendorong benda pada bidang miring licin, usaha total tersimpan sebagai energi potensial " );

                        tampilan2.setText ( " Ep = mgs sin(alfa)" );
                        deg = 0.01744444 * aalfa;
                        sin = Math.sin(deg);
                        cos = Math.cos(deg);
                        Ep = mm*gg*SS*sin;

                        tampilan3.setText ( "Ep = " + df.format ( Ep ) + "joule" );

                }else
                if
                    (!k.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {
                       kk = Double.parseDouble(k.getText().toString());
                        dxdx = Double.parseDouble(dx.getText().toString());

                    tampilan1.setText ( "W = Ep = 0,5 k dx^2" );
                    Ep = 0.5 * kk *  Math.pow (dxdx,2);
                    tampilan2.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !h. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        hh   = Double.parseDouble(h.getText().toString());

                    tampilan1.setText ( "Ep = m g h" );
                    Ep = mm * gg * hh;
                    tampilan2.setText ( "Ep = " + df.format ( Ep ) + "joule" );

                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !v2. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());
                        v2v2   = Double.parseDouble(v2.getText().toString());


                    tampilan1.setText ( "perubahan Ek tersimpan sebagai Ep; Ep = 0,5 m(v2^2 - v1^2) " );
                    vv = Math.pow ( vv , 2 );
                    v2v2 = Math.pow ( v2v2 , 2 );
                    Ep = 0.5 * mm * (v2v2 - vv);
                    tampilan2.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());


                    tampilan1.setText ( "perubahan Ek tersimpan sebagai Ep; Ep = 0,5 m v^2 " );
                    vv = Math.pow ( vv , 2 );
                    Ep = 0.5 * mm * vv;
                    tampilan2.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                }}

        });
        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());

                    tampilan1.setText ( "Ek = 1/2 m v^2 " );
                    Ek = 0.5 * mm * Math.pow ( vv , 2 );
                    tampilan2.setText ( "Ek = " + df.format ( Ek ) + "joule" );

                } else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !F.getText ( ).toString ( ).equals ( "" )   &&
                                !uk.getText ( ).toString ( ).equals ( "" )  &&
                                !teta.getText ( ).toString ( ).equals ( "" )  &&
                                !S. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            FF = Double.parseDouble(F.getText().toString());
                            ukuk   = Double.parseDouble(uk.getText().toString());
                            SS   = Double.parseDouble(S.getText().toString());
                            teeta   = Double.parseDouble(teta.getText().toString());


                        tampilan1.setText ( " Balok ditarik di lantai kasar oleh gaya yang membentuk sudut teta berpindah sejauh S  " );
                    tampilan2.setText ( " usaha gaya berubah menjadi energi kinetik, W = usha gaya - usaha gaya gesek  " );
                    tampilan3.setText ( " usaha gaya W = F S  cos teta  " );
                    tampilan4.setText ( "   " );
                    deg = 0.01744444 * teeta;
                    cos = Math.cos(deg);
                    sin = Math.sin ( deg );
                    WW = FF * SS * cos;
                    tampilan5.setText ( " Usaha gaya W =" + df.format ( WW ) + "joule" );
                    tampilan6.setText ( " usaha gaya gesek =- uk (mg - F sin teta)* S  " );
                    tampilan7.setText ( " " );
                    Wg = - ukuk*SS*(mm*gg - FF*sin);
                    tampilan8.setText ( " Usahan gaya gesek Wg = " + df.format ( Wg ) + "joule" );
                    Ek = WW + Wg;
                    tampilan10.setText ( " usaha yang dikerjakan pada benda= perubahan energi kinetik benda " );
                    tampilan12.setText ( "  energi benda kinetik  Ek = W + Wg = " + df.format ( Ek ) + "joule" );
                    tampilan13.setText ( " " );
                    tampilan14.setText ( " " );

                } else if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());

                            tampilan1.setText ( " Balok ditarik di lantai kasar oleh gaya yang membentuk sudut teta dalam selang waktu t  " );
                    tampilan2.setText ( " usaha gaya berubah menjadi energi kinetik, W = usaha gaya - usaha gaya gesek  " );
                    tampilan3.setText ( " usaha gaya W = F S  cos teta  " );
                    tampilan4.setText ( " S = 0,5 a t^2  " );
                    tampilan5.setText ( " a = F/m;  dengan F jumlah gaya  " );
                    tampilan6.setText ( " F = F cos teta - uk (mg - F sin teta) " );
                    tampilan7.setText ( " " );
                    deg = 0.01744444 * teeta;
                    cos = Math.cos(deg);
                    sin = Math.sin ( deg );
                    Fg = ukuk*(mm*gg-FF*sin);
                    FF = FF*cos - ukuk*(mm*gg-FF*sin);
                    a = FF/mm;
                    SS = 0.5*a*Math.pow(tt,2);
                    WW= FF*SS;
                    tampilan8.setText ( " Gaya gesek  Fg = " + df.format ( Fg ) + "N" );
                    tampilan9.setText ( " Gaya total  F = " + df.format ( FF ) + "N" );
                    tampilan10.setText ( "  Percepatan a = " + df.format ( a ) + "m/s2" );
                    tampilan11.setText ( "  Perpindahan S = " + df.format ( SS ) + "m" );
                    tampilan12.setText ( "  Energi kinetik Ek = " + df.format ( WW ) + "J" );
                    tampilan13.setText ( " " );
                    tampilan14.setText ( " " );


                } else if
                                (!F.getText ( ).toString ( ).equals ( "" )   &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    FF = Double.parseDouble(F.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( " usaha gaya berubah menjadi energi kinetik, W = F . S = Ek  " );
                    Ek = FF * SS;
                    tampilan2.setText ( "Ek =" + df.format ( Ek ) + "joule" );

                } else if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                     !F.getText ( ).toString ( ).equals ( "" )   &&
                     t. getText ( ).toString ( ).equals ( "" )) {
                                        mm = Double.parseDouble(m.getText().toString());
                                        FF = Double.parseDouble(F.getText().toString());
                                        tt   = Double.parseDouble(t.getText().toString());


                  tampilan1.setText ( " benda diam diberi gaya selama t, energi kinetik benda menjadi: " );
                    tampilan2.setText ( " Ek = 0,5 mv^2 " );
                    tampilan3.setText ( " v adalah kecepatan akhir = Vt = a t " );
                    tampilan4.setText ( " a = F/m " );
                    a = FF/mm;
                    vv = a*tt;
                    Ek = 0.5*mm*vv*vv;
                    tampilan5.setText ( "a =" + df.format (a ) + "m/s2" );
                    tampilan6.setText ( "v =" + df.format ( vv ) + "m/s" );
                    tampilan7.setText ( "Ek =" + df.format ( Ek ) + "joule" );
                } else if
                (!m.getText ( ).toString ( ).equals ( "" )   &&
                     !m.getText ( ).toString ( ).equals ( "" )   &&
                     !h. getText ( ).toString ( ).equals ( "" )) {
                                            mm = Double.parseDouble(m.getText().toString());
                                            gg = Double.parseDouble(g.getText().toString());
                                            hh  = Double.parseDouble(h.getText().toString());

                   tampilan1.setText ( " energi potensial berubah menjadi energi kinetik, Ep = mgh = Ek  " );
                    Ek = mm * gg * hh;
                    tampilan2.setText ( "Ek = " + df.format ( Ek ) + "joule" );

                }
            }
        });
        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !W. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        WW = Double.parseDouble(W.getText().toString());

                    tampilan1.setText ( " usaha menekan pegas W, usaha ini tersimpan sebagai energi poensial, massa terlempar oleh potensial pegas  " );
                    tampilan2.setText ( " W = Ek = Ep  =1/2 m v^2, maka v = (2W/m)^0,5 " );
                    vv = 2*WW/mm;
                    vv = Math.pow(vv,0.5);
                    tampilan3.setText ( "  " );
                    tampilan4.setText ( "v =" + df.format ( vv ) + "m/s" );
                    tampilan5.setText ( "  " );
                    tampilan6.setText ( "  " );


                }else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !k.getText ( ).toString ( ).equals ( "" )   &&
                                !dx. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            kk = Double.parseDouble(k.getText().toString());
                            dxdx   = Double.parseDouble(dx.getText().toString());

                        tampilan1.setText ( " benda meluncur menumbuk pegas atau pegas melempar benda " );
                    tampilan2.setText ( " energi kinetik berubah menjadi energi potensial atau sebaliknya " );
                    tampilan3.setText ( " W = Ek = Ep  = 1/2 k dx^2 = 1/2 m v^2, maka v = dx *(k/m)^0,5 " );
                    vv = kk/mm;
                    vv = Math.pow(vv,0.5);
                    vv = dxdx*vv;
                    tampilan5.setText ( "v =" + df.format ( vv ) + "m/s" );
                    tampilan4.setText ( "  " );
                    tampilan6.setText ( "  " );


                }else if
                            (!m.getText ( ).toString ( ).equals ( "" )   &&
                                    !g.getText ( ).toString ( ).equals ( "" )   &&
                                    !uk.getText ( ).toString ( ).equals ( "" )  &&
                                    !alfa.getText ( ).toString ( ).equals ( "" )  &&
                                    !h. getText ( ).toString ( ).equals ( "" )) {
                                mm = Double.parseDouble(m.getText().toString());
                                gg = Double.parseDouble(g.getText().toString());
                                ukuk   = Double.parseDouble(uk.getText().toString());
                                hh   = Double.parseDouble(h.getText().toString());
                                aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( " benda (m) meluncur pada bidang miring (alfa) kasar (uk), tinggi h  " );
                    tampilan2.setText ( "  energi potensial berubah menjadi enegi kinetik dikurangi usaha gaya gesek " );
                    tampilan3.setText ( " Ep = mgh; W gesek = uk mg s cos alfa; s = h/sin (alfa) " );
                    tampilan4.setText ( " Ek = Ep - Wgesek; 0,5 m v^2 = Ep - Wgesek" );
                    tampilan5.setText ( " v = (2 (Ep - Wgesek)/m)^0,5 " );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin(deg);
                    cos = Math.cos(deg);
                    Ep = mm*gg*hh;
                    WW = ukuk*mm*gg*cos;
                    tampilan6.setText ( "Ep = " + df.format ( Ep ) + "joule" );
                    tampilan7.setText ( "Wgesek = " + df.format ( WW ) + "joule" );
                    vv = 2*(Ep-WW)/mm;
                    vv = Math.pow(vv,0.5);
                    tampilan8.setText ( "v = " + df.format ( vv ) + "m/s" );
                    tampilan9.setText ( "  " );
                    tampilan10.setText ( "  " );
                    tampilan11.setText ( "  " );


                }else if
                                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                        !F.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !uk.getText ( ).toString ( ).equals ( "" )  &&
                                        !teta.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    mm = Double.parseDouble(m.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    FF = Double.parseDouble(F.getText().toString());
                                    ukuk   = Double.parseDouble(uk.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());
                                    teeta   = Double.parseDouble(teta.getText().toString());


                    deg = 0.01744444 * teeta;
                    cos = Math.cos ( deg );
                    sin = Math.sin ( deg );
                    tampilan1.setText ( " Balok mula-mula diam di lantai kasar ditarik F membentuk sudut teta berpindah sejauh S " );
                    tampilan2.setText ( "usaha gaya W = F S cos(teta);   ");
                    tampilan3.setText ( " usaha gaya gesek Wg = - uk (mg - Fsin (teta)) S ");
                    tampilan4.setText ( " " );
                    WW = FF * SS * cos;
                    tampilan5.setText ( " usaha oleh gaya W = " + df.format ( WW ) + "joule" );

                    Wg = - ukuk*SS*(mm*gg - FF*sin);
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " Usahan gaya gesek Wg = " + df.format ( Wg ) + "joule" );
                    WW = WW + Wg;
                    tampilan8.setText ( " usaha yang dikerjakan pada benda= perubahan energi kinetik benda = W + Wg = " + df.format ( WW ) + "joule" );
                       vv = 2*WW/mm;
                       vv = Math.pow(vv,0.5);
                    tampilan9.setText ( " Ek = 0,5 m v^2;      v = (2 Ek/m)^0,5" );
                    tampilan10.setText ( " Kecepatan balok = " + df.format ( vv ) + "m/s" );
                    tampilan11.setText ( " " );
                    tampilan12.setText ( " " );

                } else if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());
                    tampilan1.setText ( " Balok ditarik di lantai kasar oleh gaya yang membentuk sudut teta dalam selang waktu t  " );
                    tampilan2.setText ( " usaha gaya berubah menjadi energi kinetik, W = usaha gaya - usaha gaya gesek  " );
                    tampilan3.setText ( " usaha gaya W = F S  cos teta  " );
                    tampilan4.setText ( " V = a t  " );
                    tampilan5.setText ( " a = F/m;  dengan F jumlah gaya  " );
                    tampilan6.setText ( " F = F cos teta - uk (mg - F sin teta) " );
                    tampilan7.setText ( " " );
                    deg = 0.01744444 * teeta;
                    cos = Math.cos(deg);
                    sin = Math.sin ( deg );
                    Fg = ukuk*(mm*gg-FF*sin);
                    FF = FF*cos - ukuk*(mm*gg-FF*sin);
                    a = FF/mm;
                    vv = a*tt;

                    tampilan8.setText ( " Gaya gesek  Fg = " + df.format ( Fg ) + "N" );
                    tampilan9.setText ( " Gaya total  F = " + df.format ( FF ) + "N" );
                    tampilan10.setText ( "  Percepatan a = " + df.format ( a ) + "m/s2" );
                    tampilan11.setText ( "  kacepatan  = " + df.format ( vv ) + "m/s" );
                    tampilan12.setText ( "  " );
                    tampilan13.setText ( " " );
                    tampilan14.setText ( " " );



                } else
                if
                    (!g.getText ( ).toString ( ).equals ( "" )   &&

                            !h. getText ( ).toString ( ).equals ( "" )) {
                        hh = Double.parseDouble(h.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());

                   tampilan1.setText ( "Ek = Ep = mgh =1/2 m v^2, maka v = (2gh)^0,5 " );
                    vv = 2*gg*hh;
                    vv = Math.pow(vv,0.5);
                    tampilan2.setText ( "v = " + df.format ( vv ) + "m/s" );
                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !F. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( "Vt = Vo + a t " );
                    tampilan2.setText ( "Vo = 0 ,  a = F/m " );
                    tampilan3.setText ( "Vt =  F t/m " );
                    vv = FF*tt/mm;
                    tampilan4.setText ( "v = " + df.format ( vv ) + "m/s" );

            }}

        });
         btnh.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
                public void onClick ( final View view ) {
                    DecimalFormat df = new DecimalFormat ( "#.###" );

                    if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !v. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            vv   = Double.parseDouble(v.getText().toString());

                        tampilan1.setText ( "Ek = Ep = mgh =1/2 m v^2, maka h =( v^2)/2g " );
                        hh = Math.pow(vv,2);
                        hh = hh/(2*gg);
                        tampilan2.setText ( "h = " + df.format ( hh ) + "m" );

                    } else if
                            (!m.getText ( ).toString ( ).equals ( "" )   &&
                                    !g.getText ( ).toString ( ).equals ( "" )   &&
                                    !W. getText ( ).toString ( ).equals ( "" )) {
                                mm = Double.parseDouble(m.getText().toString());
                                gg = Double.parseDouble(g.getText().toString());
                                WW   = Double.parseDouble(W.getText().toString());

                        tampilan1.setText ( " W = Ek = Ep = mgh ,  maka h = W/mg " );
                        hh = WW/(mm*gg);
                        tampilan2.setText ( "h = " + df.format ( hh ) + "m" );

                    }else if
                                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !k.getText ( ).toString ( ).equals ( "" )  &&
                                        !dx. getText ( ).toString ( ).equals ( "" )) {
                                    mm = Double.parseDouble(m.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    kk   = Double.parseDouble(k.getText().toString());
                                    dxdx   = Double.parseDouble(dx.getText().toString());

                        tampilan1.setText ( " energi potensial pegas untuk meluncurkan benda ke atas, ketinggian yang dicapai " );
                        tampilan2.setText ( " W = Ek = Ep = 0,5 k dx^2 = mgh ,  maka h = 0,5 * k dx^2/mg " );
                        dxdx = Math.pow ( dxdx , 2 );
                        hh = 0.5 * kk * dxdx / (mm * gg);
                        tampilan3.setText ( "h = " + df.format ( hh ) + "m" );
                        tampilan4.setText ( " " );
                        tampilan5.setText ( " " );
                        tampilan6.setText ( " " );


                }}
                });

        btndx.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !k. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());
                        kk   = Double.parseDouble(k.getText().toString());

                    tampilan1.setText ( "benda meluncur menumbuk pegas; energi kinetik berubah menjadi energi potensial " );
                    tampilan2.setText ( "Ek = Ep = 1/2 mv^2 = 1/2 k dx^2,  dx = v (m/k)^0,5 " );
                    dxdx = mm/kk ;
                    dxdx = Math.pow(dxdx,0.5);
                    dxdx = vv*dxdx;
                    tampilan3.setText ( "dx = " + df.format ( dxdx ) + "m" );

                } else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !h. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            hh   = Double.parseDouble(h.getText().toString());

                    tampilan1.setText ( " benda jatuh menekan pegas; energi potensial gravitasi berubah menjadi energi potensial pegas" );
                    tampilan2.setText ( " Ep = mgh = 1/2 k dx^2,  maka dx = (2mgh/k)^0,5 " );
                    dxdx = 2 * mm * gg * hh / kk;
                    dxdx = Math.pow ( dxdx , 0.5 );
                    tampilan3.setText ( "dx =" + df.format ( dxdx ) + "m" );

                }
            }
        });

        btnk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !dx. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());
                        dxdx   = Double.parseDouble(dx.getText().toString());

                    tampilan1.setText ( "benda meluncur menumbuk pegas; energi kinetik berubah menjadi energi potensial " );
                    tampilan2.setText ( "Ek = Ep = 1/2 mv^2  " );
                    tampilan3.setText ( " Ep = 1/2 k dx^2  " );
                    tampilan4.setText ( " k = 2 Ep / dx^2  " );
                    Ek = 0.5*mm*Math.pow(vv,2);
                    kk = 2*Ek/Math.pow(dxdx,2);

                    tampilan5.setText ( "  " );
                    tampilan6.setText ( " Energi kinetik Ek = " + df.format (Ek ) + "J" );
                    tampilan7.setText ( "  " );
                    tampilan8.setText ( " konstanta pegas k = " + df.format (kk ) + "N/m" );
                    tampilan9.setText ( "  " );

                } else if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !dx.getText ( ).toString ( ).equals ( "" )  &&
                                !h. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            dxdx = Double.parseDouble(dx.getText().toString());
                            hh   = Double.parseDouble(h.getText().toString());

                    tampilan1.setText ( " benda jatuh menekan pegas; energi potensial gravitasi berubah menjadi energi potensial pegas" );
                    tampilan2.setText ( " Ep = mgh = 1/2 k dx^2,  maka k = 2mgh/dx^2 " );
                    dxdx = dxdx*dxdx;
                    kk = 2 * mm * gg * hh / dxdx;

                    tampilan3.setText ( "k =" + df.format ( kk ) + "N/m" );

                }
            }
        });


        btnalfa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                //usaha menarik benda di bidang miring dengan tanpa gaya gesek
                    if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !W.getText ( ).toString ( ).equals ( "" )  &&
                                !S. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            WW   = Double.parseDouble(W.getText().toString());
                            SS   = Double.parseDouble(S.getText().toString());

                        tampilan1.setText ( "usaha melawan gaya gravitasi dan gaya gesek: W =  m g S sin (alfa),  alfa = asin(W/mgs)" );
                       deg = WW/(mm*gg*SS);
                       deg = Math.asin(deg);
                       aalfa = deg*57.32;
                        tampilan2.setText ( "alfa =" + df.format (aalfa ) + "deg" );
                }
                }

        });
        btnuk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        WW = Double.parseDouble(W.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());

                    tampilan1.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta))S,  uk = W/(mg - Fsin(teta) " );
                    deg = 0.01744444 * teeta;
                    sin = Math.sin ( deg );
                    ukuk = WW /((mm * gg - FF * sin) * SS);

                    tampilan2.setText ( "uk =" + df.format ( ukuk )) ;
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( "usaha melawan gaya gravitasi dan gaya gesek: W = uk mg S cos(alfa) +  m g S sin (alfa) = mgS( uk cos(alfa) + sin(alfa), uk = (W -mgs sin(alfa))/(mgs cos (alfa)" );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    ukuk = (WW - (mm * gg * sin))/(mm*gg*SS*cos);
                    tampilan2.setText ( "uk =" + df.format ( ukuk )) ;

                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        WW   = Double.parseDouble(W.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "usaha menarik benda di lantai kasar " );
                    tampilan2.setText ( "W = uk mg  S ,   uk = W/mgS " );
                    ukuk = WW / (mm * gg * SS);
                    tampilan3.setText ( "uk =" + df.format ( ukuk ) );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )  &&
                            !v2.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        vv   = Double.parseDouble(v.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        v2v2 = Double.parseDouble(v2.getText().toString());

                    tampilan1.setText ( "usaha = perubahan Ek; Fgesek S = 0,5 m(v2^2 - v1^2); uk =0,5 m(v2^2 - v1^2)/mgS  " );
                    vv = Math.pow ( vv , 2 );
                    v2v2 = Math.pow ( v2v2 , 2 );
                    ukuk = 0.5*mm*(v2v2 - vv)/(mm*gg*SS);
                    tampilan2.setText ( "uk =" + df.format ( ukuk ) );
                }else
                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble(v.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "usaha = perubahan Ek  " );
                    tampilan2.setText ( " Fgesek S = 0,5 m v1^2  " );
                    tampilan3.setText ( " uk =0,5 m v1^2/mgS  " );
                    tampilan4.setText ( " uk =0,5  v1^2/gS  " );
                    vv = Math.pow ( vv , 2 );

                    ukuk = 0.5*vv/(gg*SS);
                    tampilan5.setText ( "uk =" + df.format ( ukuk ) );
                }}

        });
        btnP.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


// daya proses menarik benda di lantai dengan gaya membentuk sudut teta
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());

                        tampilan1.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta))" );
                        tampilan2.setText ( "  P = W/t " );
                        tampilan3.setText ( "  P =uk( mg - F sin (teta)) S/t" );

                        deg = 0.01744444 * teeta;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    P = ukuk * (mm * gg - FF * sin) * SS/tt;

                    tampilan4.setText ( "daya yang hilang oleh gaya gesek P =" + df.format ( P ) + "watt" );
                    P = FF*SS*cos/tt;

                    tampilan5.setText ( "daya yang dilakukan oleh gaya F : P =" + df.format ( P ) + "watt" );

                }else if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !F.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !teta.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        FF = Double.parseDouble(F.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        vv   = Double.parseDouble(v.getText().toString());
                        teeta   = Double.parseDouble(teta.getText().toString());

                    tampilan1.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta))S" );
                    tampilan2.setText ( "  P = W/t " );
                    tampilan3.setText ( " Daya, P =uk( mg - F sin (teta)) v" );
                    tampilan4.setText ( "  P =uk( mg - F sin (teta)) v" );

                    deg = 0.01744444 * teeta;
                    sin = Math.sin ( deg );
                    P = ukuk * (mm * gg - FF * sin) * vv;

                    tampilan5.setText ( "P =" + df.format ( P ) + "watt" );
                } else
                if // bidang miring dengan gaya gesek

                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !t.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());
                    tampilan1.setText ( "usaha melawan gaya gravitasi dan gaya gesek: W = uk mg S cos(alfa) +  m g S sin (alfa) " );
                    tampilan2.setText ( " P = W/t" );

                    deg = 0.01744444 * aalfa;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    P = mm * gg * SS * (ukuk * cos + sin)/tt;
                    tampilan4.setText ( "P =" + df.format ( P ) + "watt" );
                } else
                if // bidang miring dengan gaya gesek
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());
                        vv   = Double.parseDouble(v.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( "usaha melawan gaya gravitasi dan gaya gesek: W = uk mg S cos(alfa) +  m g S sin (alfa) = mgS( uk cos(alfa) + sin(alfa), P = W/t" );
                    deg = 0.01744444 * aalfa;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    P = mm * gg * vv * (ukuk * cos + sin);
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                } else


              if
                        (!F.getText ( ).toString ( ).equals ( "" )   &&
                                !S.getText ( ).toString ( ).equals ( "" )   &&
                                !teta.getText ( ).toString ( ).equals ( "" )  &&
                                !t. getText ( ).toString ( ).equals ( "" )) {
                            FF = Double.parseDouble(F.getText().toString());
                            tt = Double.parseDouble(t.getText().toString());
                            teeta   = Double.parseDouble(teta.getText().toString());
                            SS   = Double.parseDouble(S.getText().toString());

                    tampilan1.setText ( "W = F S cos (teta), P = W/t,  P = F S cos(teta)/t " );
                    deg = 0.01744444 * teeta;
                    P = FF * SS * Math.cos ( deg );
                        tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                } else

                    if
                        (!F.getText ( ).toString ( ).equals ( "" )   &&
                                !teta.getText ( ).toString ( ).equals ( "" )   &&
                                !v. getText ( ).toString ( ).equals ( "" )) {
                            FF = Double.parseDouble(F.getText().toString());
                            teeta = Double.parseDouble(teta.getText().toString());
                            vv   = Double.parseDouble(v.getText().toString());


                        tampilan1.setText ( "W = F S cos (teta), P = W/t,  P = F v cos(teta)/t " );
                        deg = 0.01744444 * teeta;
                        P = FF * vv * Math.cos ( deg );
                        tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                    } else
                if
                (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !S.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());
                        SS = Double.parseDouble(S.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( "W = F S,  P = W/t ;  P = F S/t " );
                    P = FF * SS/tt ;
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );

                } else
                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !v. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());

                    tampilan1.setText ( "W = F S,  P = W/t ;  P = F v " );
                    P = FF * vv;
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !uk.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        ukuk   = Double.parseDouble(uk.getText().toString());

                    tampilan1.setText ( "W = uk mg  S ;  P = W/t,  P = uk mg S/t " );
                    P = mm * gg*ukuk * SS/tt ;
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                } else

                    if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !uk.getText ( ).toString ( ).equals ( "" )  &&
                                !v. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            ukuk   = Double.parseDouble(uk.getText().toString());
                            vv   = Double.parseDouble(v.getText().toString());

                        tampilan1.setText ( "W = uk mg  S ;  P = W/t,  P = uk mg S/t " );
                        P = mm * gg*ukuk * vv ;
                        tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                 }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )  &&
                            !h. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        hh   = Double.parseDouble(h.getText().toString());
                        tt  = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( "W = Ep = m g h,  P = W/t,   P = mgh/t" );
                    P = mm * gg * hh/tt;
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )  &&
                            !alfa.getText ( ).toString ( ).equals ( "" )  &&
                            !S. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        tt   = Double.parseDouble(t.getText().toString());
                        SS   = Double.parseDouble(S.getText().toString());
                        aalfa   = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( "W = Ep = m g S sin (alfa),  P =m g S sin (alfa)/t " );
                    deg = 0.01744444 * aalfa;
                    P = mm * gg * SS* Math.sin(deg)/tt;
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                }else  if
                        (!m.getText ( ).toString ( ).equals ( "" )   &&
                                !g.getText ( ).toString ( ).equals ( "" )   &&
                                !alfa.getText ( ).toString ( ).equals ( "" )  &&
                                !v. getText ( ).toString ( ).equals ( "" )) {
                            mm = Double.parseDouble(m.getText().toString());
                            gg = Double.parseDouble(g.getText().toString());
                            vv = Double.parseDouble(v.getText().toString());
                            aalfa = Double.parseDouble(alfa.getText().toString());

                    tampilan1.setText ( "W = Ep = m g v sin (alfa),  P =m g v sin (alfa) " );
                    deg = 0.01744444 * aalfa;
                    P = mm * gg * vv * Math.sin ( deg );
                    tampilan2.setText ( "P =" + df.format ( P ) + "watt" );
                }}});

        btnm.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
                        public void onClick ( final View view ) {
                            DecimalFormat df = new DecimalFormat ( "#.###" );

                            if
                                (!F.getText ( ).toString ( ).equals ( "" )   &&
                                        !W.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !uk.getText ( ).toString ( ).equals ( "" )  &&
                                        !teta.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    FF = Double.parseDouble(F.getText().toString());
                                    WW = Double.parseDouble(W.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    ukuk   = Double.parseDouble(uk.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());
                                    teeta   = Double.parseDouble(teta.getText().toString());

                                tampilan1.setText ( " " );
                                tampilan2.setText ( " usaha melawan gaya gesek W = uk( mg - F sin (teta))S, m = (W + uk S Fsin(teta))/(uk g S)" );
                                deg = 0.01744444 * teeta;
                                sin = Math.sin(deg);
                                mm = (WW + ukuk*SS*FF*sin)/(ukuk*gg*SS);

                                tampilan3.setText ( "m =" + df.format ( mm ) + "kg" );
                            } else
                            if
                                (!W.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !uk.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    WW = Double.parseDouble(W.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    ukuk   = Double.parseDouble(uk.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());

                                tampilan1.setText ( "W = uk mg  S ,   m = W/(uk g S) " );
                                mm = WW/(gg*ukuk*SS);
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );
                            }else

                            if
                                (!W.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !h. getText ( ).toString ( ).equals ( "" )) {
                                    WW = Double.parseDouble(W.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    hh = Double.parseDouble(h.getText().toString());


                                tampilan1.setText ( "W = Ep = m g h,    m = W/gh" );
                                mm = WW/(gg*hh);
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );
                            }else
                            if
                                (!W.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !alfa.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    WW = Double.parseDouble(W.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());
                                    aalfa   = Double.parseDouble(alfa.getText().toString());


                                tampilan1.setText ( "W = Ep = m g S sin (alfa),  m = W/gS sin(alfa)" );
                                deg = 0.01744444 * aalfa;
                                sin = Math.sin(deg);
                                mm = WW /(gg * SS* sin);
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );
                            }else
                            if
                                (!m.getText ( ).toString ( ).equals ( "" )   &&
                                        !g.getText ( ).toString ( ).equals ( "" )   &&
                                        !uk.getText ( ).toString ( ).equals ( "" )  &&
                                        !alfa.getText ( ).toString ( ).equals ( "" )  &&
                                        !S. getText ( ).toString ( ).equals ( "" )) {
                                    mm = Double.parseDouble(m.getText().toString());
                                    gg = Double.parseDouble(g.getText().toString());
                                    ukuk   = Double.parseDouble(uk.getText().toString());
                                    SS   = Double.parseDouble(S.getText().toString());
                                    aalfa   = Double.parseDouble(alfa.getText().toString());

                                tampilan1.setText ( "usaha melawan gaya gravitasi dan gaya gesek: W = uk mg S cos(alfa) +  m g S sin (alfa) = mgS( uk cos(alfa) + sin(alfa)" );
                                deg = 0.01744444 * aalfa;
                                sin = Math.sin(deg);
                                cos = Math.cos(deg);
                                mm = WW / (gg * SS*(ukuk*cos + sin));
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );
                            }else

                            if
                                (!W.getText ( ).toString ( ).equals ( "" )   &&
                                        !v.getText ( ).toString ( ).equals ( "" )   &&
                                        !v2. getText ( ).toString ( ).equals ( "" )) {
                                    WW = Double.parseDouble(W.getText().toString());
                                    vv = Double.parseDouble(v.getText().toString());
                                    v2v2   = Double.parseDouble(uk.getText().toString());

                                tampilan1.setText ( "W = perubahan Ek ,    m = 2W/(v2^2 - v1^2" );
                                vv = Math.pow(vv,2);
                                v2v2 = Math.pow(v2v2,2);
                                mm = 2 * WW/(v2v2 - vv);
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );

                            }  if
                                    (!W.getText ( ).toString ( ).equals ( "" )   &&
                                            !v. getText ( ).toString ( ).equals ( "" )) {
                                        WW = Double.parseDouble(W.getText().toString());
                                        vv = Double.parseDouble(v.getText().toString());

                                tampilan1.setText ( "W = perubahan Ek ,    m = 2W/v^2" );
                                vv = Math.pow ( vv , 2 );
                                mm = 2 * WW / vv;
                                tampilan2.setText ( "m =" + df.format ( mm ) + "kg" );

                            }}
        });

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
                m.setText ( "" );
                g.setText ( "" );
                h.setText ( "" );
                W.setText ( "" );
                F.setText ( "" );
                S.setText ( "" );
                k.setText ( "" );
                dx.setText ( "" );
                uk.setText ( "" );
                alfa.setText ( "" );
                teta.setText ( "" );
                v.setText ( "" );
                v2.setText ( "" );
                t.setText ( "" );
            }
        } );
}}
