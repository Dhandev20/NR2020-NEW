package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GasIdeal extends AppCompatActivity {
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

    private EditText p1,p2,V1,V2,T1,T2,M,m,N,n,vrms;
    private Double p1p1,p2p2,V1V1,V2V2,T1T1,T2T2,MM,mm,vrmsvrms,nn,Ek,NN,NA, k;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gas_ideal );

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
        p1 = findViewById ( R.id.in_p1 );
        p2 = findViewById ( R.id.in_p2 );
        V1 = findViewById ( R.id.in_V1 );
        V2 = findViewById ( R.id.in_V2 );
        T1 = findViewById ( R.id.in_T1 );
        T2 = findViewById ( R.id.in_T2 );
        M = findViewById ( R.id.in_M );
        m = findViewById ( R.id.in_m );
        n = findViewById ( R.id.in_n );
        vrms = findViewById ( R.id.in_vrms );

        Button btnp1 = findViewById ( R.id.btn_p1 );
        Button btnp2 = findViewById ( R.id.btn_p2 );
        Button btnV1 = findViewById ( R.id.btn_V1 );
        Button btnV2 = findViewById ( R.id.btn_V2 );
        Button btnT1 = findViewById ( R.id.btn_T1 );
        Button btnT2 = findViewById ( R.id.btn_T2 );
        Button btnN = findViewById ( R.id.btn_N );
        Button btnEk = findViewById ( R.id.btn_Ek );
        Button btnm = findViewById ( R.id.btn_m );
        Button btnmmo = findViewById ( R.id.btn_mmo );
        Button btnn = findViewById ( R.id.btn_n );
        Button btnvrms = findViewById ( R.id.btn_vrms );
        Button btnvar = findViewById ( R.id.btn_Var );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );



        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Teori kinetik gas" );
                tampilan2.setText ( "kalkulator momentum digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Hukum Boyle" );
                tampilan4.setText ( " 2. Persamaan gas ideal" );
                tampilan5.setText ( "  " );
                tampilan6.setText ( " Varibel yang digunakan" );
                tampilan7.setText ( " V1, V2 :volume gas keadaan 1, 2" );
                tampilan8.setText ( " T1, T2 : temperatur gas " );
                tampilan9.setText ( " p1, p2 : tekanan gas keadaan 1, 2" );
                tampilan10.setText ( " " );
                tampilan11.setText ( " M : berat molekul gas" );
                tampilan12.setText ( " m : massa gas" );
                tampilan13.setText ( " mmo : massa molekul" );
                tampilan14.setText ( " n : mol gas" );
                tampilan15.setText ( " N : jumlah molekul gas " );
                tampilan16.setText ( " vrms : kecepatan efektif gas " );
                tampilan17.setText ( " Ek : energi kinetik gas " );
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
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                       T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " p1 = p2V2T1/V1 T2" );
                    p1p1 = p2p2*V2V2*T1T1/(V1V1*T2T2);
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );
                } else if
                    (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !V1. getText ( ).toString ( ).equals ( "" )) {
                    nn = Double.parseDouble(n.getText().toString());
                    V1V1 = Double.parseDouble(V1.getText().toString());
                    T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " p = n RT/V;  R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    p1p1 = nn * 0.08206 * T1T1 / V1V1;
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "atm" );
                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !M.getText ( ).toString ( ).equals ( "" )   &&
                            !V1. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        MM = Double.parseDouble(M.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " p = n RT/V;  n = m/M;  R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    nn = mm/MM;
                    p1p1 = nn * 0.08206 * T1T1 / V1V1;
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

                        tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " p2 = p1V1T2/V2T1" );
                    p2p2 = p1p1 * V1V1 * T2T2 /(V2V2* T1T1);
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "atm" );
                }
            }});

        btnV1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " V1 = p2V2T1/p1T2" );
                    V1V1 = p2p2 * V2V2 * T1T1 / (p1p1*T2T2);
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "atm2" );
                } else
                if
                    (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        nn = Double.parseDouble(n.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                        tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " v = n RT/p;  R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    V1V1 = nn * 0.08206 * T1T1 / p1p1;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !M.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        MM = Double.parseDouble(M.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());


                        tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " v = n RT/p;  n = m/M; R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    nn = mm/MM;
                    V1V1 = nn * 0.08206 * T1T1 / p1p1;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "liter" );
            } }});
        btnV2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V1. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                        tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " V2 = p1V1T2/p2T1" );
                    V2V2 = p1p1 * V1V1 * T2T2 / (p2p2*T1T1);
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "liter" );
                } }});
        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());

                        tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " T1 = p1V1T2/p2V2" );
                    T1T1 = p1p1 * V1V1 * T2T2 / (p2p2 * V2V2);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1 = T1T1-273;
                    tampilan7.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                }else
                if
                    (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        nn = Double.parseDouble(n.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());


                        tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " T = p V/ n R;  R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    T1T1 = p1p1 * V1V1 / (nn * 0.08206);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1 = T1T1-273;
                    tampilan7.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !M.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                       MM = Double.parseDouble(M.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());


                        tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " T = p V/ n R;   n = m/M ;  R = 8,314 J/mol.K = 0,08206 L atm/mol.K   " );
                    nn = mm/MM;
                    T1T1 = p1p1 * V1V1 / (nn * 0.08206);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "kelvin" );
                    T1T1 = T1T1-273;
                    tampilan7.setText ( " T1 = " + df.format ( T1T1 ) + "celsius" );
                } }});

        btnT2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2" );
                    tampilan3.setText ( " T2 = p2V2T1/p1V1" );
                    T2T2 = p2p2 * V2V2 * T1T1 / (p1p1 * V1V1);
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "kelvin" );
                    T2T2 = T2T2-273;
                    tampilan7.setText ( " T2 = " + df.format ( T2T2 ) + "celsius" );

                }else
                if
                           (!V2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        V2V2 = Double.parseDouble(V2.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                        tampilan1.setText ( " pV = n R T" );
                    tampilan3.setText ( " Proses isobar, berlaku V1/T1 = V2/T2 " );
                    tampilan4.setText ( " T2 = V2*T1/V1 " );
                    T2T2 = T1T1 * V2V2 / V1V1;
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "kelvin" );
                    T2T2 = T2T2-273;
                    tampilan7.setText ( " T2 = " + df.format ( T2T2 ) + "celsius" );
                } }});
        btnvrms.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        MM = Double.parseDouble(M.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " vrms = (3R T/M)^0,5" );
                    tampilan2.setText ( " nyatakan T dalam kelvin dan M dalam kg" );
                    MM = MM/1000;
                    vrmsvrms = 3*8.314*T1T1/MM;
                    vrmsvrms = Math.pow(vrmsvrms,0.5);
                    tampilan3.setText ( " vrms = " + df.format (vrmsvrms ) + "m/s" );
                } else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " vrms = (3R T/M)^0,5;  M = m/n" );
                    MM = mm/nn;
                    MM = MM/1000;
                    vrmsvrms = 3*8.314*T1T1/MM;
                    vrmsvrms = Math.pow(vrmsvrms,0.5);
                    tampilan3.setText ( " vrms = " + df.format (vrmsvrms ) + "m/s" );
                } else
                if
                           (!V1.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());

                    tampilan1.setText ( " vrms = (3pV/m)^0,5" );

                    vrmsvrms = 3*p1p1*101000*V1V1/(0.001*mm);
                    vrmsvrms = Math.pow(vrmsvrms,0.5);
                    tampilan3.setText ( " vrms = " + df.format (vrmsvrms ) + "m/s" );
                }
            }});
        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                          (!V1.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                    tampilan1.setText ( " Ek = 3 PV/2N;  N = Na*n" );
                    NN = nn * 6.022 * Math.pow ( 10 , 23 );
                    Ek = 3 * p1p1 * 101 * V1V1 / (2 * NN);
                    tampilan3.setText ( " Ek = " + Ek.doubleValue ( ) + "joule" );
                } else
                if
                            (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !M.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                          MM = Double.parseDouble(M.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());

                    tampilan1.setText ( " Ek = 3 PV/2N;  N = Na*n;  n = m/M" );
                    nn = mm/MM;
                    NN = nn * 6.022 * Math.pow ( 10 , 23 );
                    Ek = 3 * p1p1 * 101 * V1V1 / (2 * NN);
                    tampilan3.setText ( " Ek = " + Ek.doubleValue ( ) + "joule" );

                } else
                if
                             (!n.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());

                    tampilan1.setText ( " Ek = 3 n R T/2" );

                    Ek= 3*nn*8.314*T1T1/2;
                    tampilan3.setText ( " Ek total = " + df.format (Ek ) + "joule" );
                } else
                if
                            ( !T1. getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());

                    tampilan1.setText ( " Ek = 3 k T/2;  k = 1,380658 x 10-23jK" );
                    k =1.380658*Math.pow(10,-23);
                    Ek = 3*k*T1T1/2;
                    tampilan3.setText ( " Ek = " + Ek.doubleValue() + "joule" );
                }
            }});

        btnmmo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M.getText ( ).toString ( ).equals ( "" ) ) {
                        MM = Double.parseDouble(M.getText().toString());

                    tampilan1.setText ( " massa molekul gas = M/jumlah molekul" );
                    tampilan3.setText ( " m = M/(n*bilangan Avogadro)" );
                    mm = MM/(6.022*Math.pow(10,23));

                    tampilan5.setText ( " massa molekul gas, mmo = " + mm.doubleValue() + "g" );

                } }});


        btnn.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!V1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !p1. getText ( ).toString ( ).equals ( "" )) {
                        V1V1 = Double.parseDouble(V1.getText().toString());
                       T1T1 = Double.parseDouble(T1.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());

                    tampilan1.setText ( " PV = n RT" );
                    tampilan3.setText ( " n = PV/RT" );
                    nn = (p1p1*V1V1)/(0.0821*T1T1);

                    tampilan5.setText ( " jumlah mol gas, n = " + nn.doubleValue() + "mol" );

                } }});
        btnN.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M.getText ( ).toString ( ).equals ( "" )   &&
                            !m. getText ( ).toString ( ).equals ( "" )) {
                        MM = Double.parseDouble(M.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());

                    tampilan1.setText ( " n = m/M,     N = n NA" );
                    tampilan3.setText ( " N = m NA/M" );
                    NN = mm*6.022*Math.pow(10,23) ;
                    NN = NN/MM;

                    tampilan5.setText ( " jumlah molekul gas, N = " + NN.doubleValue() + "molekul" );

                } }});
        btnm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
           
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M.getText ( ).toString ( ).equals ( "" )   &&
                            !n. getText ( ).toString ( ).equals ( "" )) {
                        MM = Double.parseDouble(M.getText().toString());
                        nn = Double.parseDouble(n.getText().toString());

                        tampilan1.setText ( " m = n M" );
                        mm = nn*MM;
                        tampilan3.setText ( " massa gas, m = " + mm.doubleValue() + "g" );


                    } }});
        btnvar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( GasIdeal.this , GasIdealVariabel.class );
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
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                tampilan16.setText ( "" );
                tampilan17.setText ( "" );
                tampilan18.setText ( "" );
                tampilan19.setText ( "" );
                tampilan20.setText ( "" );
                p1.setText ( "" );
                p2.setText ( "" );
                V1.setText ( "" );
                V2.setText ( "" );
                T1.setText ( "" );
                T2.setText ( "" );
                M.setText ( "" );
                m.setText ( "" );
                n.setText ( "" );
                vrms.setText ( "" );
            }
        } );
    }
}
