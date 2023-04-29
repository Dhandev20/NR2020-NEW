package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GasIdealVariabel extends AppCompatActivity {
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

    private EditText p1,p2,V1,V2,T1,T2,M,m,n,vrms, ek;
    private Double p1p1,p2p2,V1V1,V2V2,T1T1,T2T2,MM,mm,vrmsvrms,nn,Ek,N, k, A,B,C;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gas_ideal_variabel );

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
        ek = findViewById ( R.id.in_ek );
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
        Button btnn = findViewById ( R.id.btn_n );
        Button btnvrms = findViewById ( R.id.btn_vrms );
        Button btngas = findViewById ( R.id.btn_Gas );
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
                tampilan13.setText ( " n : mol gas" );
                tampilan14.setText ( " N : jumlah molekul gas " );
                tampilan15.setText ( " vrms : kecepatan efektif gas " );
                tampilan16.setText ( " Ek : energi kinetik gas " );
            }});

        btnp1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   V1 = V2" );
                    tampilan3.setText ( " p1 = p2T1/ T2" );
                    p1p1 = p2p2*T1T1/(T2T2);
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "p" );
                } else
                if
                    (!p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   T1 = T2" );
                    tampilan3.setText ( " p1 = p2V2/ V1" );
                    p1p1 = p2p2*V2V2/V1V1;
                    tampilan5.setText ( " p1 = " + df.format ( p1p1 ) + "p" );

                } }});

        btnp2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        p1p1 = Double.parseDouble(p1.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   V1 = V2" );
                    tampilan3.setText ( " p2 = p1T2/ T1" );
                    p2p2 = p1p1*T2T2/(T1T1);
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "p" );
                } else
                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   T1 = T2" );
                    tampilan3.setText ( " p2 = p1V1/ V2" );
                    p2p2 = p1p1*V1V1/V2V2;
                    tampilan5.setText ( " p2 = " + df.format ( p2p2 ) + "p" );

                } }});

        btnV1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!V2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   p1 = p2" );
                    tampilan3.setText ( " V1 = T1 V2/ T2" );
                    V1V1 = T1T1*V2V2/(T2T2);
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "V" );
                } else
                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   T1 = T2" );
                    tampilan3.setText ( " V1 = p2V2/ p1" );
                    V1V1 = p2p2*V2V2/p1p1;
                    tampilan5.setText ( " V1 = " + df.format ( V1V1 ) + "V" );

                } }});
        btnV2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!V1.getText ( ).toString ( ).equals ( "" )   &&
                            !T1.getText ( ).toString ( ).equals ( "" )   &&
                            !T2. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   p1 = p2" );
                    tampilan3.setText ( " V2 =V1 T2/ T1" );
                    V2V2 = T2T2*V1V1/(T1T1);
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "V" );
                } else
                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   T1 = T2" );
                    tampilan3.setText ( " V2 = p1V1/ p2" );
                    V2V2 = p1p1 * V1V1 / p2p2;
                    tampilan5.setText ( " V2 = " + df.format ( V2V2 ) + "V" );
                } }});
        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!T2.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   p1 = p2" );
                    tampilan3.setText ( " T1 = T2 V1/ V2" );
                    T1T1 = T2T2*V1V1/(V2V2);
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "T" );
                } else
                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        T2T2 = Double.parseDouble(T2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   V1 = V2" );
                    tampilan3.setText ( " T1 = p1T2/ p2" );
                    T1T1 = p1p1*T2T2/p2p2;
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + "T" );

                } }});
        btnT2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!T1.getText ( ).toString ( ).equals ( "" )   &&
                            !V1.getText ( ).toString ( ).equals ( "" )   &&
                            !V2. getText ( ).toString ( ).equals ( "" )) {
                        T1T1 = Double.parseDouble(T1.getText().toString());
                        V1V1 = Double.parseDouble(V1.getText().toString());
                        V2V2 = Double.parseDouble(V2.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   p1 = p2" );
                    tampilan3.setText ( " T2 = T1 V2/ V1" );
                    T2T2 = T1T1*V2V2/(V1V1);
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "T" );
                } else
                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2.getText ( ).toString ( ).equals ( "" )   &&
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                    tampilan1.setText ( " p1V1/T1 = p2V2/T2,   V1 = V2" );
                    tampilan3.setText ( " T2 = p2T1/ p1" );
                    T2T2 = p2p2*T1T1/p1p1;
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + "T" );

                } }});
        btnvrms.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                         (!T2.getText ( ).toString ( ).equals ( "" )   && !
                          !T1. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                    tampilan1.setText ( " vrms = (3R T/M)^0,5" );
                    tampilan2.setText ( " vrms sebanding dengan akar kuadrat T" );
                    tampilan3.setText ( " vrms pada T2 = vrmas pada T1 * (T2/T1)^0,5" );

                    A =vrmsvrms* T2T2/T1T1;
                    vrmsvrms = Math.pow(A,0.5);
                    tampilan5.setText ( " vrms = " + df.format (vrmsvrms ) + "v" );
                    tampilan6.setText ( " vrms = " + vrmsvrms.doubleValue ( ) + "v" );
                } else
                if
                            (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !p2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());

                    tampilan1.setText ( " vrms = (3R T/M)^0,5; pada volume tetap berlaku T2 = P2 T1/p1" );
                    tampilan2.setText ( "temperatur berbanding lurus dengan tekanan" );
                    tampilan3.setText ( " vrms sebanding dengan akar kuadrat p" );
                    A = vrmsvrms*p2p2 / p1p1;
                    vrmsvrms =  Math.pow ( A , 0.5 );
                    tampilan5.setText ( " vrms = " + df.format ( vrmsvrms ) + "v" );
                    tampilan6.setText ( " vrms = " + vrmsvrms.doubleValue ( ) + "v" );
                }
            }});
        btnEk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    (!p1.getText ( ).toString ( ).equals ( "" )   &&
                            !ek.getText ( ).toString ( ).equals ( "" )   &&
                            !p2. getText ( ).toString ( ).equals ( "" )) {
                        p1p1 = Double.parseDouble(p1.getText().toString());
                        Ek = Double.parseDouble(ek.getText().toString());
                        p2p2 = Double.parseDouble(p2.getText().toString());
                    tampilan1.setText ( " Ek = 3 PV/2N  " );
                    tampilan2.setText ( " untuk V1 = V2, maka Ek berbanding lurus dengan p  " );
                    tampilan3.setText ( " Ek = Ek p2/p1 " );

                    Ek = Ek* p2p2/p1p1;
                    tampilan4.setText ( " Ek2 = " + Ek.doubleValue ( ) + "Ek" );
                } else

                if
                            (!T2.getText ( ).toString ( ).equals ( "" )   && !
                            !T1. getText ( ).toString ( ).equals ( "" )) {
                        T2T2 = Double.parseDouble(T2.getText().toString());
                        T1T1 = Double.parseDouble(T1.getText().toString());
                    tampilan1.setText ( " Ek = 3 n R T/2" );
                    tampilan2.setText ( " Ek berbanding lurus dengan T" );
                    tampilan3.setText ( " Ek2 = Ek T2/T1 " );

                    Ek= Ek*T2T2/T1T1;
                    tampilan5.setText ( " Ek2 = " + df.format (Ek ) + "Ek" );

                }
            }});

        btnm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                nn = Double.parseDouble ( n.getText ( ).toString ( ) );

                    tampilan1.setText ( " massa molekul gas = M/jumlah molekul" );
                    tampilan3.setText ( " m = M/(n*bilangan Avogadro)" );
                    mm = MM/(nn*6.022*Math.pow(10,23));

                    tampilan5.setText ( " massa molekul gas, m = " + mm.doubleValue() + "g" );

                 }});


        btnn.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                p1p1 = Double.parseDouble (p1.getText ( ).toString ( ) );
                V1V1 = Double.parseDouble ( V1.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );

                if (V1V1 !=0 && T1T1 !=0 && p1p1!=0 ) {
                    tampilan1.setText ( " PV = n RT" );
                    tampilan3.setText ( " n = PV/RT" );
                    nn = (p1p1*V1V1)/(0.0821*T1T1);

                    tampilan5.setText ( " jumlah mol gas, n = " + nn.doubleValue() + "mol" );

                } }});
        btnN.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                nn = Double.parseDouble ( n.getText ( ).toString ( ) );

                if (MM !=0 && mm !=0  ) {
                    tampilan1.setText ( " n = m/M,     N = n NA" );
                    tampilan3.setText ( " N = m NA/M" );
                    N = mm*6.022*Math.pow(10,23) ;
                    N =N/MM;

                    tampilan5.setText ( " jumlah molekul gas, N = " + N.doubleValue() + "molekul" );

                } }});
        btngas.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( GasIdealVariabel.this , GasIdeal.class );
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
                ek.setText ( "" );
                m.setText ( "" );
                n.setText ( "" );
                vrms.setText ( "" );
            }
        } );
    }
}
