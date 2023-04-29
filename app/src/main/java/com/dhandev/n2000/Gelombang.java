package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Gelombang extends AppCompatActivity {
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

    private EditText ro,B,Y,F,T,u,f,v,vs,vp,P,I1,I2,lamda,y,A,W,t,n,x,R1,R2,k,S;
    private Double roro,BB,YY,FF,TT,uu,ff,fp,vv,vsvs,vpvp,PP,I1I1,I2I2,lmda,yy,AA,WW,tt,nn,xx,R1R1,R2R2,kk,K,L,M, fase,SS,Ti;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gelombang );

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
        ro = findViewById ( R.id.in_ro );
        u = findViewById ( R.id.in_u );
        v = findViewById ( R.id.in_v );
        vs = findViewById ( R.id.in_vs );
        vp = findViewById ( R.id.in_vp );
        Y = findViewById ( R.id.in_Y );
        B = findViewById ( R.id.in_B );
        F = findViewById ( R.id.in_Teg );
        lamda = findViewById ( R.id.in_lamda );
        n = findViewById ( R.id.in_n );
        W = findViewById ( R.id.in_W );
        f = findViewById ( R.id.in_w );
        T = findViewById ( R.id.in_T );
        k = findViewById ( R.id.in_k );
        A = findViewById ( R.id.in_A );
        y = findViewById ( R.id.in_y );
        P = findViewById ( R.id.in_P );
        I1 = findViewById ( R.id.in_I1 );
        I2 = findViewById ( R.id.in_I2 );
        R1 = findViewById ( R.id.in_R1 );
        R2 = findViewById ( R.id.in_R2 );
        x = findViewById ( R.id.in_x );
        t = findViewById ( R.id.in_t );
        S = findViewById ( R.id.in_S );



        Button btnv = findViewById ( R.id.btn_v );
        Button btnf = findViewById ( R.id.btn_f );
        Button btnfp = findViewById ( R.id.btn_fp );
        Button btnfase = findViewById ( R.id.btn_fase );
        Button btnlamda = findViewById ( R.id.btn_lamda );
        Button btny = findViewById ( R.id.btn_y );
        Button btnI1 = findViewById ( R.id.btn_I1 );
        Button btnI2 = findViewById ( R.id.btn_I2 );
        Button btnP = findViewById ( R.id.btn_P );
        Button btnTi = findViewById ( R.id.btn_Ti );
        Button btnx = findViewById ( R.id.btn_x );
        Button btnk = findViewById ( R.id.btn_k );
        Button btnT = findViewById ( R.id.btn_T );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnY = findViewById ( R.id.btn_Y );
        Button btnB = findViewById ( R.id.btn_B );
        Button btnro = findViewById ( R.id.btn_ro );

        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );






        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Gelombang" );
                tampilan2.setText ( "kalkulator gelombang dan bunyi digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. cepat rambat gelombang" );
                tampilan4.setText ( " 2. persamaan gelombang" );
                tampilan5.setText ( " 3. daya gelombang " );
                tampilan6.setText ( " 4. intensitas bunyi" );
                tampilan7.setText ( " 5. taraf intensitas bunyi" );
                tampilan8.setText ( " 6. efek doppler" );
                tampilan9.setText ( " variabel yang digunakan" );
                tampilan10.setText ( " ro : rapat massa" );
                tampilan11.setText ( " Y : modulus Young" );
                tampilan12.setText ( " A: Amplitudo ;  B : modulus Bulk" );
                tampilan13.setText ( " f :frekuensi gelombang; fp : frekuensi pendengar" );
                tampilan14.setText ( " fase : beda fase      T : perioda" );
                tampilan15.setText ( " t : selang waktu;  x = jarak tempuh gelombang" );
                tampilan16.setText ( " k : bilangan gelombang " );
                tampilan17.setText ( " v: cepat rambat gelombang; vs kecepatan sumber gelombang" +
                        " vp : kecepatan gerak pengamat" );
                tampilan18.setText ( " R1, R2 : jarak sumber bunyi ke pengamat" );
                tampilan19.setText ( " P : daya gelombang; Ti : taraf intensitas bunyi" );
                tampilan20.setText ( " I1:intemsitas bunyi di R1, I2 : intensitas bunyi di R2 " );
            }});

        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !u.getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        uu = Double.parseDouble ( u.getText ( ).toString ( ) );

                    tampilan1.setText ( " Cepat rambat gelombang tali dapat dihitung dengan hukum Melde:" );
                    tampilan2.setText ( "  v = (T/u)^1/2" );
                    tampilan3.setText ( "  v = kecepatan gelombang (m/s)" );
                    tampilan4.setText ( " T = tegangan (N)" );
                    tampilan5.setText ( " u = rapat massa tali/satuan panjang (kg/m)" );
                    vv = FF/uu;
                    vv = Math.pow(vv,0.5);
                    tampilan7.setText ( " v = " + df.format (vv ) + "m/s" );
                } else
                if
                            (!Y.getText ( ).toString ( ).equals ( "" )   &&
                            !ro.getText ( ).toString ( ).equals ( "" )) {
                        YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        tampilan1.setText ( " cepat rambat gelombang di zat padat: " );
                        tampilan2.setText ( "  v = (Y/ro)^1/2" );
                        tampilan3.setText ( "  v = kecepatan gelombang (m/s)" );
                        tampilan4.setText ( " Y = konstanta Young (N/m^2)" );
                        tampilan5.setText ( " ro = rapat massa  (kg/m^3)" );
                    K = Math.pow(10,9);
                    vv = K*YY/roro;
                    vv = Math.pow(vv,0.5);
                    tampilan7.setText ( " v = " + df.format (vv ) + "m/s" );
                } else
                if
                            (!B.getText ( ).toString ( ).equals ( "" )   &&
                            !ro.getText ( ).toString ( ).equals ( "" )) {
                        BB   = Double.parseDouble ( B.getText ( ).toString ( ) );
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );

                    tampilan1.setText ( " Cepat rambat gelombang di zat cair atau gas:" );
                    tampilan1.setText ( " v = (B/ro)^1/2" );
                    tampilan3.setText ( "  v = kecepatan gelombang (m/s)" );
                    tampilan4.setText ( " B = modulus Bulk (N/m^2)" );
                    tampilan5.setText ( " ro = rapat massa  (kg/m^3)" );

                    K = Math.pow(10,9);
                    vv = K*BB/roro;
                    vv = Math.pow(vv,0.5);
                    tampilan7.setText ( " v = " + df.format (vv ) + "m/s" );
                } else
                if
                            (!x.getText ( ).toString ( ).equals ( "" )   &&
                             !n.getText ( ).toString ( ).equals ( "" )   &&
                             !f.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        nn  = Double.parseDouble ( n.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );

                    tampilan1.setText ( " Menentukan cepat rambat gelombang bunyi dari tabung resonansi" );
                    tampilan2.setText ( " resonansi pertama: x = 1/4 lamda" );
                    tampilan3.setText ( " lamda n =  4 x /(2n-1)");
                    tampilan4.setText ( "  v = f lamda" );
                    lmda = 4*xx/(2*nn - 1);
                    vv = ff*lmda;
                    tampilan6.setText ( " lamda = " + df.format (lmda ) + "m" );
                    tampilan7.setText ( " v = " + df.format (vv ) + "m/s" );
                } else
                if
                               (!f.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                         ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                        lmda = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                    tampilan1.setText ( " cepat rambat gelombang  v = f lamda" );
                    vv = ff*lmda;
                    tampilan3.setText ( " v = " + df.format (vv ) + "m/s" );

                } else
                if
                               (!T.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                         TT  = Double.parseDouble ( T.getText ( ).toString ( ) );
                        lmda = Double.parseDouble ( lamda.getText ( ).toString ( ) );

                        tampilan1.setText ( " cepat rambat gelombang  v =  lamda/T" );
                    vv = lmda/TT;
                    tampilan3.setText ( " v = " + df.format (vv ) + "m/s" );
                } }});
        btny.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        WW  = Double.parseDouble ( W.getText ( ).toString ( ) );
                        AA  = Double.parseDouble ( A.getText ( ).toString ( ) );
                        tt  = Double.parseDouble ( t.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );

                    tampilan1.setText ( " y = A sin(Wt - (W/v)x)" );
                    tampilan2.setText ( " ingat sudut fase dalam radian" );
                    tampilan3.setText ( " derajat = 57,3248 * radian " );
                    K = WW*tt - xx*WW/vv;
                    yy = AA*Math.sin(K);

                    tampilan5.setText ( " y = " + df.format (yy ) + "m" );

                } else
                if
                           (!A.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !k.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !x.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        WW  = Double.parseDouble ( W.getText ( ).toString ( ) );
                        AA  = Double.parseDouble ( A.getText ( ).toString ( ) );
                        tt  = Double.parseDouble ( t.getText ( ).toString ( ) );
                        kk  = Double.parseDouble ( k.getText ( ).toString ( ) );

                        tampilan1.setText ( " y = A sin(Wt - kx)" );
                        tampilan2.setText ( " ingat sudut fase dalam radian" );
                        tampilan3.setText ( " derajat = 57,3248 * radian " );
                    K = WW*tt - xx*kk;
                    yy = AA*Math.sin(K);
                    tampilan5.setText ( " y = " + df.format (yy ) + "m" );
                } else
                if
                           (!A.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !x.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        WW  = Double.parseDouble ( W.getText ( ).toString ( ) );
                        AA  = Double.parseDouble ( A.getText ( ).toString ( ) );
                        tt  = Double.parseDouble ( t.getText ( ).toString ( ) );
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );

                        tampilan1.setText ( " y = A sin(Wt - 2pix/lamda)" );
                        tampilan2.setText ( " ingat sudut fase dalam radian" );
                        tampilan3.setText ( " sudut derajat = 57,3248 * radian " );
                    K = WW*tt - xx*6.28/lmda;
                    yy = AA*Math.sin(K);
                    tampilan3.setText ( " y = " + df.format (yy ) + "m" );
                } }});
        btnfase.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        TT  = Double.parseDouble ( T.getText ( ).toString ( ) );

                    tampilan1.setText ( " beda fase = 2 pi x/lamda" );
                    tampilan2.setText ( " lamda = v T" );
                    tampilan3.setText ( " beda fase = 2 pi x/(v T)" );
                    lmda = vv * TT;
                    fase = 6.28 * xx / lmda;

                    tampilan5.setText ( " beda fase = " + df.format ( fase ) + "rad" );
                } else
                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                    tampilan1.setText ( " beda fase = 2 pi x/lamda;  lamda = v/f" );
                    tampilan2.setText ( " lamda = v/f" );
                    tampilan3.setText ( " beda fase = 2 pi f x/v;  " );
                    lmda = vv/ff;
                    fase = 6.28 * xx / lmda;

                    tampilan5.setText ( " beda fase = " + df.format ( fase ) + "rad" );

                } }});

        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        nn  = Double.parseDouble ( n.getText ( ).toString ( ) );

                    tampilan1.setText ( " pipa organa terbuka" );
                    tampilan2.setText ( " f =(n+1) v/2x; n = 0 nada dasar" );
                    ff = (nn + 1) * vv / (2 * xx);
                    tampilan3.setText ( "f = " + df.format ( ff ) + "Hz" );

                    tampilan5.setText ( " pipa organa tertutup" );
                    tampilan6.setText ( " f =(2n+1) v/4x; n = 0 nada dasar" );
                    ff = (2 * nn + 1) * vv / (4 * xx);
                    tampilan8.setText ( "f = " + df.format ( ff ) + "Hz" );

                    tampilan10.setText ( "tabung resonansi" );
                    tampilan12.setText ( " f =(2n-1) v/4x, n = 1, 2..dst : resonansi ke" );
                    ff = (2 * nn - 1) * vv / (4 * xx);
                    tampilan13.setText ( "f = " + df.format ( ff ) + "Hz" );
                }else
                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );

                    tampilan1.setText ( " pipa organa terbuka" );
                    tampilan2.setText ( " f =(n+1) v/2x; n = 0 nada dasar" );
                    ff = vv / (2 * xx);
                    tampilan3.setText ( "f = " + df.format ( ff ) + "Hz" );

                    tampilan5.setText ( " pipa organa tertutup" );
                    tampilan6.setText ( " f =(2n+1) v/4x; n = 0 nada dasar" );
                    ff =   vv / (4 * xx);
                    tampilan8.setText ( "f = " + df.format ( ff ) + "Hz" );

                } else
                if
                    (!lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( " f = v/lamda" );
                    ff = vv / lmda;
                    tampilan3.setText ( "f = " + df.format ( ff ) + "Hz" );
                } else
                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                            !u.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        FF  = Double.parseDouble ( F.getText ( ).toString ( ) );
                        uu  = Double.parseDouble ( u.getText ( ).toString ( ) );
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );

                    tampilan1.setText ( " hukum Melde" );
                    tampilan2.setText ( " v = (F/u)^0,5" );
                    tampilan3.setText ( " f = v/lamda" );
                    K = FF/uu;
                    vv = Math.pow(K,0.5);
                    ff = vv/lmda;
                    tampilan5.setText ( "f = " + df.format ( ff ) + "Hz" );
                } }});
        btnT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                       (!lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                          vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( " T = lamda/v" );
                    TT =  lmda/vv;
                    tampilan3.setText ( "T = " + df.format ( TT ) + "s" );
                } else
                if
                    (!f.getText ( ).toString ( ).equals ( "" ))   {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                        tampilan1.setText ( " T = 1/f" );
                    TT = 1/ff;
                    tampilan3.setText ( "T = " + df.format ( TT ) + "s" );
                } }});


        btnI1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!I2.getText ( ).toString ( ).equals ( "" )   &&
                            !R1.getText ( ).toString ( ).equals ( "" )   &&
                            !R2.getText ( ).toString ( ).equals ( "" )) {
                        I2I2  = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                        R2R2  = Double.parseDouble ( R2.getText ( ).toString ( ) );
                    tampilan1.setText ( " I2 = I1*(R1/R2)^2;    I1 = I2 *(R2/R1)^2" );
                    K = R2R2/R1R1;
                    L = Math.pow(K,2);
                    I1I1 = I2I2*L;
                    tampilan3.setText ( "I1 = " + df.format ( I1I1 ) + "W/m2" );
                } else
                if
                           (!P.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );

                    tampilan1.setText ( " I = P/A" );
                   I1I1 = PP/AA;
                    tampilan3.setText ( "I1 = " + df.format ( I1I1 ) + "W/m2" );
                } else
                if
                    (!P.getText ( ).toString ( ).equals ( "" )   &&
                            !R1.getText ( ).toString ( ).equals ( "" )) {
                        PP  = Double.parseDouble ( P.getText ( ).toString ( ) );
                        R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                    tampilan1.setText ( " I = P/A,  dengan A luas bola A = 4 pi R^2" );
                    K = Math.pow(R1R1,2);
                    I1I1 = PP/(12.56*K);
                    tampilan3.setText ( "I1 = " + df.format ( I1I1 ) + "W/m2" );

                } }});

        btnI2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );

                    tampilan1.setText ( " I2 = I1*(R1/R2)^2" );
                    K = R1R1/R2R2;
                    L = Math.pow(K,2);
                    I2I2 = I1I1*L;
                    tampilan3.setText ( "I2 = " + df.format ( I2I2 ) + "W/m2" );

                 }});

        btnk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!W.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        WW  = Double.parseDouble ( W.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( " k = W/v" );

                    kk = WW / vv;
                    tampilan3.setText ( "k = " + df.format ( kk ) + "1/m" );
                }else
                if
                    (!lamda.getText ( ).toString ( ).equals ( "" ) ) {
                        lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                    tampilan1.setText ( " k = 2 pi/lamda" );

                    kk = 6.28 / lmda;
                    tampilan3.setText ( "k = " + df.format ( kk ) + "1/m" );
                } }});

        btnlamda.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )) {
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                        nn = Double.parseDouble ( n.getText ( ).toString ( ) );
                    tampilan1.setText ( " resonansi satu ujung tertutup  lamda = 4x/(2n - 1)" );

                    lmda=4*xx/(2*nn-1);
                    tampilan3.setText ( "lamda = " + df.format ( lmda ) + "m" );
                }else
                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )) {
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( " lamda = v/f" );

                    lmda= vv/ff;
                    tampilan3.setText ( "lamda = " + df.format ( lmda ) + "m" );

                }else
                if
                    (!T.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        TT  = Double.parseDouble ( T.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( " lamda = vT" );

                    lmda= vv*TT;
                    tampilan3.setText ( "lamda = " + df.format ( lmda ) + "m" );
                } }});
        btnfp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )   &&
                            !vp.getText ( ).toString ( ).equals ( "" )   &&
                            !vs.getText ( ).toString ( ).equals ( "" )) {
                    vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                    vpvp = Double.parseDouble ( vp.getText ( ).toString ( ) );
                    vsvs = Double.parseDouble ( vs.getText ( ).toString ( ) );

                    tampilan1.setText ( " efek Doppler" );
                    tampilan2.setText ( " pengamat dan sumber bunyi saling mendekat" );
                    tampilan3.setText ( " rumus umum fp =(v + vp)*fs/(v + vs) " );
                    tampilan4.setText ( " fp = (v + vp) fs/(v-vs)" );
                    fp = (vv + vpvp) * ff / (vv - vsvs);
                    tampilan5.setText ( "fp= " + df.format ( fp ) + "Hz" );

                    tampilan7.setText ( " pengamat dan sumber bunyi saling menjauh" );
                    tampilan8.setText ( " fp = (v - vp) fs/(v+vs)" );
                    fp = (vv - vpvp) * ff / (vv + vsvs);
                    tampilan9.setText ( "fp= " + df.format ( fp ) + "Hz" );

                    tampilan11.setText ( " pengamat dan sumber bunyi bergerak searah; pengamat mendekat sumber menjauh" );
                    tampilan12.setText ( " fp = (v + vp) fs/(v+vs)" );
                    fp = (vv + vpvp) * ff / (vv + vsvs);
                    tampilan13.setText ( "fp= " + df.format ( fp ) + "Hz" );

                    tampilan15.setText ( " pengamat dan sumber bunyi bergerak searah; sumber bunyi mendekat pengamat menjauh" );
                    tampilan16.setText ( " fp = (v - vp) fs/(v - vs)" );
                    fp = (vv + vpvp) * ff / (vv + vsvs);
                    tampilan17.setText ( "fp= " + df.format ( fp ) + "Hz" );

                }else   if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !vp.getText ( ).toString ( ).equals ( "" )   &&
                            !vs.getText ( ).toString ( ).equals ( "" )) {
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                       lmda  = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                        vpvp  = Double.parseDouble (vp.getText ( ).toString ( ) );
                        vsvs  = Double.parseDouble ( vs.getText ( ).toString ( ) );

                        tampilan1.setText ( " efek Doppler" );
                        tampilan2.setText ( " pengamat dan sumber bunyi saling mendekat" );
                        tampilan3.setText ( " rumus umum fp =(v + vp)*fs/(v + vs) " );
                        tampilan4.setText ( " fp = (v + vp) fs/(v-vs)" );
                        tampilan5.setText ( " fs = v/lamda" );
                        ff = vv/lmda;
                        fp = (vv + vpvp) * ff / (vv - vsvs);
                        tampilan6.setText ( "frekuensi sumber = " + df.format ( ff ) + "Hz" );
                        tampilan7.setText ( "fp= " + df.format ( fp ) + "Hz" );

                        tampilan9.setText ( " pengamat dan sumber bunyi saling menjauh" );
                        tampilan10.setText ( " fp = (v - vp) fs/(v+vs)" );
                        fp = (vv - vpvp) * ff / (vv + vsvs);
                        tampilan11.setText ( "fp= " + df.format ( fp ) + "Hz" );

                        tampilan13.setText ( " pengamat dan sumber bunyi bergerak searah; pengamat mendekat sumber menjauh" );
                        tampilan14.setText ( " fp = (v + vp) fs/(v+vs)" );
                        fp = (vv + vpvp) * ff / (vv + vsvs);
                        tampilan15.setText ( "fp= " + df.format ( fp ) + "Hz" );

                        tampilan17.setText ( " pengamat dan sumber bunyi bergerak searah; sumber bunyi mendekat pengamat menjauh" );
                        tampilan18.setText ( " fp = (v - vp) fs/(v - vs)" );
                        fp = (vv + vpvp) * ff / (vv + vsvs);
                        tampilan19.setText ( "fp= " + df.format ( fp ) + "Hz" );


                    } else

                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )   &&
                            !vs.getText ( ).toString ( ).equals ( "" )) {
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                        vsvs  = Double.parseDouble ( vs.getText ( ).toString ( ) );
                    tampilan1.setText ( " efek Doppler" );
                    tampilan2.setText ( " pengamat diam sumber bunyi mendekat" );
                    tampilan3.setText ( " rumus umum fp =(v + vp)*fs/(v + vs) " );

                    tampilan4.setText ( " fp = v fs/(v-vs) " );
                    fp = vv*ff/(vv-vsvs);
                    tampilan5.setText ( "fp= " + df.format ( fp ) + "Hz" );

                    tampilan6.setText ( " pengamat diam sumber bunyi menjauh" );
                    tampilan7.setText ( " fp = v fs/(v+vs) " );
                    fp = vv*ff/(vv+vsvs);
                    tampilan8.setText ( "fp= " + df.format ( fp ) + "Hz" );

                }else
                if
                            (!v.getText ( ).toString ( ).equals ( "" )   &&
                             !f.getText ( ).toString ( ).equals ( "" )   &&
                            !vp.getText ( ).toString ( ).equals ( "" )) {
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                        vpvp= Double.parseDouble ( vp.getText ( ).toString ( ) );

                    tampilan1.setText ( " efek Doppler" );
                    tampilan2.setText ( " pengamat mendekat sumber bunyi diam" );
                    tampilan3.setText ( " rumus umum fp =(v + vp)*fs/(v + vs) " );
                    tampilan4.setText ( " fp = (v + vp) fs/v " );
                    fp = (vv+vpvp)*ff/vv;
                    tampilan5.setText ( "fp= " + df.format ( fp ) + "Hz" );

                    tampilan7.setText ( " pengamat menjauh sumber bunyi diam" );
                    tampilan8.setText ( " fp = (v - vp) fs/v " );
                    fp = (vv-vpvp)*ff/vv;
                    tampilan9.setText ( "fp= " + df.format ( fp ) + "Hz" );

                } }});

        btnY.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                roro = Double.parseDouble (ro.getText ( ).toString ( ) );
                vv= Double.parseDouble ( v.getText ( ).toString ( ) );

                    tampilan1.setText ( " cepat rambat gelombang di zat padat v = (Y/ro)^1/2" );
                    tampilan2.setText ( " Y = ro v^2" );
                    K = Math.pow(vv,2);

                    YY = K*roro;

                    tampilan3.setText ( " Y = " + YY.doubleValue () + "N/m2" );

                 }});

        btnB.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                roro = Double.parseDouble (ro.getText ( ).toString ( ) );
                vv = Double.parseDouble ( v.getText ( ).toString ( ) );


                    tampilan1.setText ( " cepat rambat gelombang di cair atau gas v = (B/ro)^1/2" );
                    tampilan2.setText ( " B = ro v^2" );
                    K = Math.pow(vv,2);

                    BB = K*roro;

                    tampilan3.setText ( " B = " + BB.doubleValue () + "N/m2" );

                 }});

        btnTi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );


                    tampilan1.setText ( " Taraf intensitas bunyi" );
                    tampilan2.setText ( " Ti = 10 log(I/Io)" );
                   Ti = 10*Math.log10(I1I1/Math.pow(10,-12)) ;

                   tampilan3.setText ( " Ti = " +  df.format ( Ti ) + "dB" );

                 }});
    btnx.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )) {
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                        nn  = Double.parseDouble ( n.getText ( ).toString ( ) );
                        tampilan1.setText ( " pipa organa terbuka" );
                    tampilan2.setText ( " f =(n+1) v/2x; n = 0 nada dasar" );
                    tampilan3.setText ( " x =(n+1) v/2f" );
                    xx = (nn + 1) * vv / (2 * ff);
                    tampilan4.setText ( "x = " + df.format ( xx ) + "m" );

                    tampilan6.setText ( " pipa organa tertutup" );
                    tampilan7.setText ( " f =(2n+1) v/4x; n = 0 nada dasar" );
                    tampilan8.setText ( " x =(2n+1) v/4f" );
                    xx = (2 * nn + 1) * vv / (4 * ff);
                    tampilan10.setText ( "x = " + df.format ( xx ) + "m" );

                    tampilan12.setText ( "tabung resonansi" );
                    tampilan13.setText ( " f =(2n-1) v/4x, n = 1, 2..dst : resonansi ke" );
                    tampilan14.setText ( " x =(2n-1) v/4f" );
                    xx = (2 * nn - 1) * vv / (4 * ff);
                    tampilan16.setText ( "x = " + df.format ( xx ) + "m" );
                }else
                if
                           (!v.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )) {
                        vv  = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );

                    tampilan1.setText ( " pipa organa terbuka" );
                    tampilan2.setText ( " x =(n+1) v/2f; n = 0 nada dasar" );
                    xx = vv / (2 *ff);
                    tampilan3.setText ( "x = " + df.format ( xx ) + "m" );

                    tampilan5.setText ( " pipa organa tertutup" );
                    tampilan6.setText ( " x =(2n+1) v/4f; n = 0 nada dasar" );
                    xx =   vv / (4 * ff);
                    tampilan8.setText ( "x = " + df.format ( xx ) + "m" );

                } }});


        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                 if
                    (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )) {
                         xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        lmda = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                         TT  = Double.parseDouble ( T.getText ( ).toString ( ) );
                    tampilan1.setText ( " gelombang merambat" );
                    tampilan2.setText ( " v = lamda/T; x = v t" );
                    tampilan3.setText ( " t = x T/lamda" );
                    tt = xx*TT/lmda;
                    tampilan4.setText ( "t = " + df.format ( tt ) + "s" );

                }else
                if
                    (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )) {
                        xx  = Double.parseDouble ( x.getText ( ).toString ( ) );
                        lmda = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                        ff  = Double.parseDouble ( f.getText ( ).toString ( ) );
                    tampilan1.setText ( " gelombang merambat" );
                    tampilan2.setText ( " v = f lamda; x = v t" );
                    tampilan3.setText ( " t = x / (f lamda)" );
                    tt = xx/(ff*lmda);
                    tampilan4.setText ( "t = " + df.format ( tt ) + "s" );
                }else
                if
                            (!x.getText ( ).toString ( ).equals ( "" )   &&
                             !Y.getText ( ).toString ( ).equals ( "" )   &&
                            !ro.getText ( ).toString ( ).equals ( "" )) {
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                        YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                        roro= Double.parseDouble ( ro.getText ( ).toString ( ) );
                    tampilan1.setText ( " gelombang merambat" );
                    tampilan2.setText ( " v = (Y/ro)^0,5; x = v t" );
                    tampilan3.setText ( " t =  x/(Y/ro)^0,5" );
                    vv = YY/roro;
                    vv = Math.pow(vv,0.5);
                    tt = xx/vv;
                    tampilan4.setText ( "t = " + df.format ( tt ) + "s" );
                }else
                if
                    (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !B.getText ( ).toString ( ).equals ( "" )   &&
                            !ro.getText ( ).toString ( ).equals ( "" )) {
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                        BB = Double.parseDouble ( B.getText ( ).toString ( ) );
                        roro= Double.parseDouble ( ro.getText ( ).toString ( ) );
                    tampilan1.setText ( " gelombang merambat" );
                    tampilan2.setText ( " v = (B/ro)^0,5; x = v t" );
                    tampilan3.setText ( " t =  x/(B/ro)^0,5" );
                    vv = BB/roro;
                    vv = Math.pow(vv,0.5);
                    tt = xx/vv;
                    tampilan4.setText ( "t = " + df.format ( tt ) + "s" );
                    if
                               (!x.getText ( ).toString ( ).equals ( "" )   &&
                                !F.getText ( ).toString ( ).equals ( "" )   &&
                                !u.getText ( ).toString ( ).equals ( "" )) {
                            xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                            FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                            uu = Double.parseDouble ( u.getText ( ).toString ( ) );
                        tampilan1.setText ( " gelombang merambat" );
                        tampilan2.setText ( " v = (F/u)^0,5; x = v t" );
                        tampilan3.setText ( " t =  x/(F/u)^0,5" );
                        vv = FF/uu;
                        vv = Math.pow(vv,0.5);
                        tt = xx/vv;
                        tampilan4.setText ( "t = " + df.format ( tt ) + "s" );
                    }else
                if
                    (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );

                    tampilan1.setText ( " mengukur waktu gema" );
                    tampilan2.setText ( "  2 x = v t" );
                    tampilan3.setText ( " t = 2 x /v" );
                    tt = 2*xx/vv;
                    tampilan4.setText ( "t = " + df.format ( tt ) + "s" );

                } }}});
        btnx.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!t.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )) {
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        lmda = Double.parseDouble (lamda.getText ( ).toString ( ) );
                        TT = Double.parseDouble (T.getText ( ).toString ( ) );

                    tampilan1.setText ( " gelombang merambat" );

                    tampilan2.setText ( " x = lamda t /T" );
                        xx = lmda * tt/TT;
                    tampilan4.setText ( "x = " + df.format ( xx ) + "m" );

                }else
                if
                              (!t.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )   &&
                            !f.getText ( ).toString ( ).equals ( "" )) {
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        lmda = Double.parseDouble (lamda.getText ( ).toString ( ) );
                        ff = Double.parseDouble (f.getText ( ).toString ( ) );

                        tampilan1.setText ( " gelombang merambat" );
                    tampilan2.setText ( " v = f lamda; x = v t" );
                    tampilan3.setText ( " x = f lamda t " );
                    xx = ff*lmda*tt;
                    tampilan4.setText ( "x = " + df.format ( xx ) + "m" );

                }else
                if
                    (!t.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        vv = Double.parseDouble (v.getText ( ).toString ( ) );

                    tampilan1.setText ( " mengukur jarak berdasarkan gema" );
                    tampilan2.setText ( "  2 x = v t" );
                    tampilan3.setText ( " x = v t/2" );
                    xx = vv*tt/2;
                    tampilan4.setText ( "x = " + df.format ( xx ) + "m" );

                } }});


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
                ro.setText ( "" );
                B.setText ( "" );
                Y.setText ( "" );
                F.setText ( "" );
                T.setText ( "" );
                u.setText ( "" );
                f.setText ( "" );
                v.setText ( "" );
                vs.setText ( "" );
                vs.setText ( "" );
                I1.setText ( "" );
                I2.setText ( "" );
                R1.setText ( "" );
                R2.setText ( "" );
                lamda.setText ( "" );
                y.setText ( "" );
                A.setText ( "" );
                W.setText ( "" );
                t.setText ( "" );
                n.setText ( "" );
                x.setText ( "" );
                k.setText ( "" );
                P.setText ( "" );
                S.setText ( "" );
            }
        } );
    }
}
