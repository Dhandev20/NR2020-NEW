package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Termodinamika extends AppCompatActivity {
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
    private EditText p1,p2,V1,V2,T1,T2,Qp,Qd,W,n,gm, efi,cp,cv;
    private Double p1p1,p2p2,V1V1,V2V2,T1T1,T2T2,QdQd, QpQp,nn,Wip, WiV,
            Wadia,WiT, e,s,K,L,M,WW,efii,gm2,cp2,cv2, Ek;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_termodinamika );

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
        tampilan21= findViewById ( R.id.tampilan21 );
        tampilan22= findViewById ( R.id.tampilan22 );
        tampilan23= findViewById ( R.id.tampilan23 );
        tampilan24= findViewById ( R.id.tampilan24 );
        p1 = findViewById ( R.id.in_p1 );
        p2 = findViewById ( R.id.in_p2 );
        V1 = findViewById ( R.id.in_V1 );
        V2 = findViewById ( R.id.in_V2 );
        T1 = findViewById ( R.id.in_T1 );
        T2 = findViewById ( R.id.in_T2 );
        Qd = findViewById ( R.id.in_Qd );
        Qp = findViewById ( R.id.in_Qp );
        n = findViewById ( R.id.in_n );
        W = findViewById ( R.id.in_w );
        efi = findViewById ( R.id.in_efi );
        gm = findViewById ( R.id.in_gm );
        cp = findViewById ( R.id.in_cp );
        cv = findViewById ( R.id.in_cv );

        Button btnp1 = findViewById ( R.id.btn_p1 );
        Button btnp2 = findViewById ( R.id.btn_p2 );
        Button btnV1 = findViewById ( R.id.btn_V1 );
        Button btnV2 = findViewById ( R.id.btn_V2 );
        Button btnT1 = findViewById ( R.id.btn_T1 );
        Button btnT2 = findViewById ( R.id.btn_T2 );

        Button btnwip= findViewById ( R.id.btn_Wip );
        Button btnwiv = findViewById ( R.id.btn_WiV );
        Button btnwit= findViewById ( R.id.btn_WiT );
        Button btnwadia = findViewById ( R.id.btn_Wadia );
        Button btnwcar = findViewById ( R.id.btn_Wcar );
        Button btnefi= findViewById ( R.id.btn_Efi );
        Button btncperf = findViewById ( R.id.btn_Cperf );
        Button btns = findViewById ( R.id.btn_S );
        Button btnEk = findViewById ( R.id.btn_U );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Termodinamika" );
                tampilan2.setText ( "kalkulator momentum digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Hubungan pVT" );
                tampilan4.setText ( " 2. Usaha pada proses: isobar, isotermal, politropik, adiabat" );
                tampilan5.setText ( " 3. Efisiensi mesin Carnot " );
                tampilan6.setText ( " 4. Koefisien performance mesin pendingn" );
                tampilan7.setText ( " V1, V2 :volume gas keadaan 1, 2" );
                tampilan8.setText ( " T1, T2 : temperatur gas, untuk mesin Carnot T1 > T2 " );
                tampilan9.setText ( " p1, p2 : tekanan gas keadaan 1, 2" );
                tampilan10.setText ( "Qp : kalor temperatur tinggi" );
                tampilan11.setText ( "Qd : kalor temperatur rendah" );
                tampilan12.setText ( " W : usaha" );
                tampilan13.setText ( " Wip : usaha pada proses isobar" );
                tampilan14.setText ( " WiT : usaha pada proses isotermal " );
                tampilan15.setText ( " WiV : usaha pada proses isovolum  " );
                tampilan16.setText ( " Wadia : usaha pada proses adiabatik,  " );
                tampilan17.setText ( " Efisien : efisiensi mesin " );
                tampilan18.setText ( " Cperf : performa mesin pendingin  " );
                tampilan19.setText ( " Entropi: entropi sistem = S " );
                tampilan20.setText ( " Wcar: usaha mesin Carnot" );
                tampilan21.setText ( " n: mol gas" );
                tampilan22.setText ( " konstanta laplace gm = gamma = cp/cv " );
                tampilan23.setText ( " " );
                tampilan24.setText ( " " );
            }});

        btnp1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2.getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( "Bila sistem gas berlaku hukum Boyle Gay Lussac:" );
                    tampilan2.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " p1 = p2V2T1/V1 T2" );
                    p1p1 = p2p2 * V2V2 * T1T1 / (V1V1 * T2T2);
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );
                } else
                if
                           (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !gm.getText ( ).toString ( ).equals ( "" )   &&
                           !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        gm2 = Double.parseDouble(gm.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());



                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " p1V1^gamma = p2V2^gamma" );
                    tampilan3.setText ( " p1 = p2(V2/V1)^gamma " );
                    K =(V2V2/V1V1);
                    L = Math.pow(K,gm2);
                    p1p1 = p2p2*L;
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );

                } else
                if
                            (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                           !V1. getText ( ).toString ( ).equals ( "" )) {
                        nn = Double.parseDouble(n.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( "  R = 0,08206 L atm/mol.K   " );
                    tampilan4.setText ( " p = n RT/V " );
                    p1p1 = nn * 0.08206 * T1T1 / V1V1;
                    tampilan6.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );

                } else
                if
                        (!p2.getText ( ).toString ( ).equals ( "" )   &&
                         !V2.getText ( ).toString ( ).equals ( "" )   &&
                        !V1. getText ( ).toString ( ).equals ( "" )) {
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    V1V1 = Double.parseDouble(V1.getText().toString());
                    V2V2 = Double.parseDouble(V2.getText().toString());

                    tampilan1.setText ( " Proses isotermal berlaku:" );
                    tampilan2.setText ( "  p1V1 = p2 V2" );
                    tampilan3.setText ( " p1 = p2 V2/ V1  " );
                    p1p1 = p2p2 *V2V2 / V1V1;
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );

                } }});

        btnp2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                            (!p1.getText ( ).toString ( ).equals ( "" )   &&
                             !T1.getText ( ).toString ( ).equals ( "" )   &&
                             !T2.getText ( ).toString ( ).equals ( "" )   &&
                             !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " Hukum Boyle Gay Lussac:" );
                    tampilan2.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " p2 = p1V1T2/V2T1" );
                    p2p2 = p1p1 * V1V1 * T2T2 / (V2V2 * T1T1);
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "atm" );
                } else
                if
                            (!p2.getText ( ).toString ( ).equals ( "" )   &&
                             !V1.getText ( ).toString ( ).equals ( "" )   &&
                             !gm.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                         gm2 = Double.parseDouble(gm.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " p1V1^gamma = p2V2^gamma" );
                    tampilan4.setText ( " p2 = p1(V1/V2)^gamma T2/T1" );
                    K =(V1V1/V2V2);
                    L = Math.pow(K,gm2);
                    p2p2 = p1p1*L*T2T2/T1T1;
                    tampilan12.setText ( " p2 = " + df.format ( p2p2 ) + "atm" );
                } else
                if
                        (!p1.getText ( ).toString ( ).equals ( "" )   &&
                         !V2.getText ( ).toString ( ).equals ( "" )   &&
                        !V1. getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    V1V1 = Double.parseDouble(V1.getText().toString());
                    V2V2 = Double.parseDouble(V2.getText().toString());

                    tampilan1.setText ( " Proses isotermal berlaku:" );
                    tampilan2.setText ( "  p1V1 = p2 V2" );
                    tampilan3.setText ( " p2 = p1 V1/ V2  " );
                    p2p2 = p1p1 *V1V1 / V2V2;
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "atm" );


                }
            }});

        btnV1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                            (!p1.getText ( ).toString ( ).equals ( "" )   &&
                             !T1.getText ( ).toString ( ).equals ( "" )   &&
                             !T2.getText ( ).toString ( ).equals ( "" )   &&
                             !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( "Hukum Boyle GayLussac" );
                    tampilan2.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " V1 = p2V2T1/p1T2" );
                    V1V1 = p2p2 * V2V2 * T1T1 / (p1p1 * T2T2);
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
                }else
                if
                            (!p1.getText ( ).toString ( ).equals ( "" )   &&
                             !p2.getText ( ).toString ( ).equals ( "" )   &&
                             !V2.getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());

                    tampilan1.setText ( "hukum Boyle pada proses isotermal berlaku " );
                    tampilan2.setText ( " p1V1 = p2V2" );
                    tampilan3.setText ( " V1 = p2V2/p1" );
                    V1V1 = p2p2 * V2V2 / p1p1;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
                } else
                if
                       (!p1.getText ( ).toString ( ).equals ( "" )   &&
                        !p2.getText ( ).toString ( ).equals ( "" )   &&
                        !gm.getText ( ).toString ( ).equals ( "" )   &&
                        !V2.getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    V2V2 = Double.parseDouble(V2.getText().toString());
                    gm2 = Double.parseDouble(gm.getText().toString());
                    p2p2 = Double.parseDouble(p2.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " p1 v1^gamma = p2V2^gamma" );
                    tampilan3.setText ( " V1 = v2(p2/p1)^1/gamma" );
                    K = (p2p2 / p1p1);
                    gm2 = 1/gm2;
                    L = Math.pow ( K , gm2 );
                    V1V1 = V2V2 * L;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
                } else
                    if
                               (!T1.getText ( ).toString ( ).equals ( "" )   &&
                                !V2.getText ( ).toString ( ).equals ( "" )   &&
                                !gm.getText ( ).toString ( ).equals ( "" )   &&
                                !T2.getText ( ).toString ( ).equals ( "" )) {
                            T1T1 = Double.parseDouble(T1.getText().toString());
                            V2V2 = Double.parseDouble(V2.getText().toString());
                            gm2 = Double.parseDouble(gm.getText().toString());
                            T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " T1V1^(gamma-1) = T2V2^(gamma-1)" );
                    tampilan3 .setText ( " V1 = V2*(T2/T1)^(- (gamma-1))" );
                    K =(T2T2/T1T1);
                    gm2 = - (gm2-1);
                    L = Math.pow(K,gm2);
                    V1V1 = V2V2*L;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
                } else
                if
                            (!T1.getText ( ).toString ( ).equals ( "" )   &&
                             !gm.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());

                    tampilan1.setText ( " Gas ideal berlaku:" );
                    tampilan2.setText ( "  pV = n R T" );
                    tampilan4.setText ( "   R = 0,08206 L atm/mol.K   " );
                    tampilan5.setText ( " v = n RT/p;  " );
                    V1V1 = nn * 0.08206 * T1T1 / p1p1;
                    tampilan7.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );

                } }});
        btnV2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " V2 = p1V1T2/p2T1" );
                    V2V2 = p1p1 * V1V1 * T2T2 / (p2p2 * T1T1);
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "liter" );
                } else
                if
                           (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());

                    tampilan1.setText ( "hukum Boyle pada proses isotermal berlaku p1V1 = p2V2" );
                    tampilan3.setText ( " V2 = p1V1/p2" );
                    V2V2 = p1p1 * V1V1 / p2p2;
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "liter" );
                } else
                if
                       (!p2.getText ( ).toString ( ).equals ( "" )   &&
                        !p1.getText ( ).toString ( ).equals ( "" )   &&
                        !gm.getText ( ).toString ( ).equals ( "" )   &&
                        !V1.getText ( ).toString ( ).equals ( "" )) {
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    V1V1 = Double.parseDouble(V1.getText().toString());
                    gm2 = Double.parseDouble(gm.getText().toString());
                    p1p1 = Double.parseDouble(p1.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " p1 v1^gamma = p2V2^gamma" );
                    tampilan3.setText ( " V2 = v1(p1/p2)^1/gamma" );
                    K = (p1p1 / p2p2);
                    gm2 = 1/gm2;
                    L = Math.pow ( K , gm2 );
                    V2V2 = V1V1 * L;
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "liter" );
                } else
                    if
                               (!T1.getText ( ).toString ( ).equals ( "" )   &&
                                !V1.getText ( ).toString ( ).equals ( "" )   &&
                                !gm.getText ( ).toString ( ).equals ( "" )   &&
                                !T2.getText ( ).toString ( ).equals ( "" )) {
                            T1T1 = Double.parseDouble(T1.getText().toString());
                            V1V1 = Double.parseDouble(V1.getText().toString());
                            gm2 = Double.parseDouble(gm.getText().toString());
                            T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " T1V1^(gamma-1) = T2V2^(gamma-1)" );
                    tampilan3.setText ( " V2 = V1*(T1/T2)^(- (gamma-1))" );
                    K =(T1T1/T2T2);
                    gm2=-(gm2-1);
                    L = Math.pow(K,-0.4);
                    V2V2 = V1V1*L;
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "liter" );

                } }});
        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " T1 = p1V1T2/p2V2" );
                    T1T1 = p1p1 * V1V1 * T2T2 / (p2p2 * V2V2);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1=T1T1-273;
                    tampilan6.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                }else
                if
                           (!T2.getText ( ).toString ( ).equals ( "" )   &&
                            !V2.getText ( ).toString ( ).equals ( "" )   &&
                            !gm.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )) {
                        gm2 = Double.parseDouble(gm.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());


                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " T1V1^(gamma-1) = T2V2^(gamma-1)" );
                    tampilan3.setText ( " T1 = T2*(V2/V1)^(gamma-1)" );
                    K =(V2V2/V1V1);
                    gm2 = gm2 - 1;
                    L = Math.pow(K,gm2);
                    T1T1 = T2T2*L;
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1=T1T1-273;
                    tampilan6.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                }else
                if
                            (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());


                    tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( "  R = 0,08206 L atm/mol.K " );
                    tampilan4.setText ( " T = p V/ n R  " );
                    T1T1 = p1p1 * V1V1 / (nn * 0.08206);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1=T1T1-273;
                    tampilan6.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                }else
                if
                          (!efi.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )) {
                        efii = Double.parseDouble(efi.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " efi = 1-(T2/T1)" );
                    tampilan3.setText ( " T1 = T2/(1-efi)" );
                    efii = efii/100;
                    T2T2 =  T1T1/(1-efii);

                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1=T1T1-273;
                    tampilan6.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );

                } }});

        btnT2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());

                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " T2 = p2V2T1/p1V1" );
                    T2T2 = p2p2 * V2V2 * T1T1 / (p1p1 * V1V1);
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "kelvin" );
                    T2T2 = T2T2 - 273;
                    tampilan6.setText ( " T2 = " + df.format ( T2T2 ) + "celsius" );
                }else
                if
                       (!V2.getText ( ).toString ( ).equals ( "" )   &&
                        !T1.getText ( ).toString ( ).equals ( "" )   &&
                        !gm.getText ( ).toString ( ).equals ( "" )   &&
                        !V1.getText ( ).toString ( ).equals ( "" )) {
                    gm2 = Double.parseDouble(gm.getText().toString());
                    V1V1 = Double.parseDouble(V1.getText().toString());
                    T1T1 = Double.parseDouble(T1.getText().toString());
                    V2V2 = Double.parseDouble(V2.getText().toString());

                    tampilan1.setText ( " khusus proses adiabatik" );
                    tampilan2.setText ( " T1V1^(gamma-1) = T2V2^(gamma-1)" );
                    tampilan3.setText ( " T2 = T1*(V1/V2)^(gamma-1)" );
                    K = (V1V1 / V2V2);
                    gm2 = gm2 - 1;
                    L = Math.pow ( K , gm2 );
                    T2T2 = T1T1 * L;
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "kelvin" );
                    T2T2=T2T2-273;
                    tampilan6.setText ( " T2 = " + df.format ( T2T2 ) + "celsius" );
                }
                    else
                    if
                              (!efi.getText ( ).toString ( ).equals ( "" )   &&
                                !T1.getText ( ).toString ( ).equals ( "" )) {
                            efii = Double.parseDouble(efi.getText().toString());
                            T1T1 = Double.parseDouble(T1.getText().toString());

                        tampilan1.setText ( " efi = 1-(T2/T1)" );
                        tampilan3.setText ( " T2 =T1*(1-efi)" );
                        efii = efii/100;
                        T2T2 =  T1T1*(1-efii);
                        tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "kelvin" );
                        T2T2=T2T2-273;
                        tampilan6.setText ( " T2 = " + df.format ( T2T2 ) + "celsius" );


                    }}});
        btnwip.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                    V1V1 = Double.parseDouble ( V1.getText ( ).toString ( ) );
                    V2V2 = Double.parseDouble ( V2.getText ( ).toString ( ) );
                    p1p1 = Double.parseDouble ( p1.getText ( ).toString ( ) );
                    tampilan1.setText ( " usaha pada proses isobar W = p dV = p (V2 - V1)" );
                    Wip = p1p1 * (V2V2 - V1V1);
                    tampilan3.setText ( " W = " + df.format ( Wip ) + "liter atmosfir" );
                    Wip = 101.325 * Wip;
                    tampilan5.setText ( " 1 liter admosfir = 101,325 joule" );
                    tampilan7.setText ( " W = " + df.format ( Wip ) + "joule" );

                }});
        btnwiv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {



                tampilan1.setText ( " usaha pada proses isovolum = nol" );

            }});
        btnwit.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );


                V1V1 = Double.parseDouble ( V1.getText ( ).toString ( ) );
                V2V2 = Double.parseDouble ( V2.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                nn = Double.parseDouble ( n.getText ( ).toString ( ) );


                tampilan1.setText ( " usaha pada proses isotermal:" );
                tampilan2.setText ( "  W = n R T ln(V2/V1)" );
                tampilan3.setText ( "  R = 0,08206 liter atm/ mol.K" );
                    K = V2V2/V1V1;
                    L = Math.log(K);
                    WiT = nn*0.08206*T1T1*L;
                    tampilan4.setText ( " W = " + df.format ( WiT ) + "liter atmosfir" );
                    WiT = 101.325*WiT;
                    tampilan5.setText ( " 1 liter admosfir = 101,325 joule" );
                    tampilan7.setText ( " W = " + df.format ( WiT ) + "joule" );

                }});
        btnwadia.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                p1p1 = Double.parseDouble (p1.getText ( ).toString ( ) );
                p2p2 = Double.parseDouble ( p2.getText ( ).toString ( ) );
                V1V1 = Double.parseDouble ( V1.getText ( ).toString ( ) );
                V2V2 = Double.parseDouble ( V2.getText ( ).toString ( ) );
                gm2 = Double.parseDouble ( gm.getText ( ).toString ( ) );

                    tampilan1.setText ( " usaha pada proses adiabat, usaha pada proses ini tidak ada pertukaran kalor" );
                    tampilan3.setText ( " W = (1/(1-gamma))*(p2V2 - p1V1)" );
                        gm2 = 1/(1-gm2);
                    Wadia = gm2*((p2p2*V2V2)- (p1p1*V1V1));
                    tampilan5.setText ( " W = " + df.format ( Wadia ) + "liter atmosfir" );
                    Wadia = 101.325*Wadia;
                    tampilan7.setText ( " 1 liter admosfir = 101,325 joule" );
                    tampilan9.setText ( " W = " + df.format ( Wadia ) + "joule" );

                }});

        btnwcar.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                QpQp = Double.parseDouble (Qp.getText ( ).toString ( ) );
                QdQd = Double.parseDouble ( Qd.getText ( ).toString ( ) );


                if ( QpQp !=0 && QdQd !=0  ) {
                    tampilan1.setText ( " usaha pada mesin Carnot" );
                    tampilan3.setText ( " W = Qp - Qd" );
                    WW = QpQp - QdQd;
                    tampilan5.setText ( " W = " + df.format ( WW ) + "kalori" );
                    WW = 4.2 * WW;
                    tampilan7.setText ( " 1 kalori = 4,2 joule" );
                    tampilan9.setText ( " W = " + df.format ( WW ) + "joule" );


                }}});

        btnefi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                           (!Qp.getText ( ).toString ( ).equals ( "" )   &&
                            !Qd.getText ( ).toString ( ).equals ( "" )) {
                        QpQp = Double.parseDouble(Qp.getText().toString());
                        QdQd = Double.parseDouble(Qd.getText().toString());

                    tampilan1.setText ( " efisiensi pada mesin Carnot" );
                    tampilan3.setText ( " eta = 1 - (Qd/Qp)" );
                    e = 100 * (1 - (QdQd / QpQp));
                    tampilan5.setText ( " e = " + df.format ( e ) + "%" );

                } else
                if
                           (!T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());


                    tampilan1.setText ( " efisiensi pada mesin Carnot; T1 > T2" );
                    tampilan3.setText ( " eta = 1 - (T2/T1)" );
                    e = 100 * (1 - (T2T2 / T1T1));
                    tampilan5.setText ( " efisiensi = " + df.format ( e ) + "%" );

                }}});


        btncperf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );

                if
                           (!Qp.getText ( ).toString ( ).equals ( "" )   &&
                            !Qd.getText ( ).toString ( ).equals ( "" )) {
                        QpQp = Double.parseDouble(Qp.getText().toString());
                        QdQd = Double.parseDouble(Qd.getText().toString());

                    tampilan1.setText ( " koefisien performa pada mesin pendingin Carnot" );
                    tampilan3.setText ( " eta =Qd/W =  Qd/( Qp -Qd)" );
                    e = 100 * QdQd / (QpQp-QdQd);
                    tampilan5.setText ( " C performa = " + df.format ( e ) + "%" );

                } else
                if
                           (!T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                        tampilan1.setText ( " koefisien performa pada mesin pendingin Carnot" );
                    tampilan3.setText ( " eta = Qd/W =  Qd/( Qp -Qd)= Td/(Tp - Td)= T2/(T1 - T2)" );
                    e = 100 * T2T2 / (T1T1-T2T2);
                    tampilan5.setText ( "  C performa = " + df.format ( e ) + "%" );

                }}});
        btns.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );
                if
                       (!V1.getText ( ).toString ( ).equals ( "" )   &&
                         !n.getText ( ).toString ( ).equals ( "" )   &&
                        !V2.getText ( ).toString ( ).equals ( "" )) {
                    V1V1 = Double.parseDouble ( V1.getText ( ).toString ( ) );
                    nn = Double.parseDouble ( n.getText ( ).toString ( ) );
                    V2V2 = Double.parseDouble ( V2.getText ( ).toString ( ) );


                    tampilan1.setText ( " Entropi pada proses pemuaian reversibel" );
                    tampilan3.setText ( " ds = n*R*ln (V2/V1)" );
                    s = nn * 8.314 * Math.log ( V2V2 / V1V1 );
                    tampilan5.setText ( " Perubahan entropi = " + df.format ( s ) + "kal/kelvin" );

                } else if
                               (!cp.getText ( ).toString ( ).equals ( "" )   &&
                                !T1.getText ( ).toString ( ).equals ( "" )   &&
                                !T2.getText ( ).toString ( ).equals ( "" )) {
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                    cp2 = Double.parseDouble ( cp.getText ( ).toString ( ) );
                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Perubahan entropi pada isobar:" );
                    tampilan3.setText ( " s2 - s1 = cp ln (T2/T1)" );
                    s = cp2 * Math.log ( T2T2 / T1T1 );
                    tampilan5.setText ( " Perubahan entropi = " + df.format ( s ) + "kal/kelvin" );

                } else if
                               (!cv.getText ( ).toString ( ).equals ( "" )   &&
                                !T1.getText ( ).toString ( ).equals ( "" )   &&
                                !T2.getText ( ).toString ( ).equals ( "" )) {
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                    cv2 = Double.parseDouble ( cv.getText ( ).toString ( ) );
                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );


                    tampilan1.setText ( " Perubahan entropi pada isovplume:" );
                    tampilan3.setText ( " s2 - s1 = cv ln (T2/T1)" );
                    s = cp2 * Math.log ( V2V2 / V1V1 );
                    tampilan5.setText ( " Perubahan entropi = " + df.format ( s ) + "kal/kelvin" );
                }}});

        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.######" );
                if
                (
                        !T1.getText ( ).toString ( ).equals ( "" )) {
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );


                    tampilan1.setText ( " Energi kinetik molekul gas monoatomik" );
                    tampilan2.setText ( " Ek = 3/2 kT" );
                    Ek = 1.5* 8.314*T1T1;
                    tampilan4.setText ( " Ek = " + df.format ( Ek ) + "joule" );

                    tampilan6.setText ( " Energi kinetik molekul gas dioatomik" );
                    tampilan7.setText ( " Ek = 5/2 kT" );
                    Ek = 2.5* 8.314*T1T1;
                    tampilan9.setText ( " Ek = " + df.format ( Ek ) + "joule" );

                    tampilan11.setText ( " Energi kinetik molekul gas polioatomik" );
                    tampilan12.setText ( " Ek = 7/2 kT" );
                    Ek = 3.5* 8.314*T1T1;
                    tampilan14.setText ( " Ek = " + df.format ( Ek ) + "joule" );


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
                p1.setText ( "" );
                p2.setText ( "" );
                V1.setText ( "" );
                V2.setText ( "" );
                T1.setText ( "" );
                T2.setText ( "" );
                Qp.setText ( "" );
                Qd.setText ( "" );
                n.setText ( "" );
                W.setText ( "" );
                efi.setText ( "" );
                gm.setText ( "");
                cp.setText ( "" );
                cv.setText ( "");
            }
        } );
    }
}
