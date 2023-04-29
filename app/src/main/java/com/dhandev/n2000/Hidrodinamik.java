package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;

public class Hidrodinamik extends AppCompatActivity {
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

    private EditText ro1, ro2, A1,  A2, h1, h2, p1, p2, r1, r2, v1,v2,g;
    private Double ro1ro1, ro2ro2, A1A1, A2A2, h1h1, h2h2, r1r1, r2r2, p1p1, p2p2, v1v1, v2v2, gg,
            P, Q, S,T ;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hidrodinamik );

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
        ro1 = findViewById ( R.id.in_ro1 );
        ro2 = findViewById ( R.id.in_ro2 );
        h1 = findViewById ( R.id.in_h1 );
        h2 = findViewById ( R.id.in_h2 );
        r1 = findViewById ( R.id.in_r1 );
        r2 = findViewById ( R.id.in_r2 );
        A1 = findViewById ( R.id.in_A1 );
        A2 = findViewById ( R.id.in_A2 );
        p1 = findViewById ( R.id.in_p1 );
        p2 = findViewById ( R.id.in_p2 );
        v1 = findViewById ( R.id.in_u );
        v2 = findViewById ( R.id.in_W );
       g = findViewById ( R.id.in_g );

        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnp1 = findViewById ( R.id.btn_p1 );
        Button btnp2 = findViewById ( R.id.btn_p2 );
        Button btnro1 = findViewById ( R.id.btn_ro1 );
        Button btnro2 = findViewById ( R.id.btn_ro2 );
        Button btnA1 = findViewById ( R.id.btn_A1 );
        Button btnA2 = findViewById ( R.id.btn_A2 );
        Button btnv1 = findViewById ( R.id.btn_v1 );
        Button btnv2 = findViewById ( R.id.btn_v2 );
        Button btnh1 = findViewById ( R.id.btn_h1 );
        Button btnh2 = findViewById ( R.id.btn_h2 );
        Button btnr1 = findViewById ( R.id.btn_r1 );
        Button btnr2 = findViewById ( R.id.btn_r2 );
        Button btnPois = findViewById ( R.id.btn_Pois );
        Button btnhapus = findViewById ( R.id.btn_Hapus );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hidrodinamik" );
                tampilan2.setText ( "kalkulator momentum digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Hukum kontinuitas" );
                tampilan4.setText ( " 2. Hukum Bernaulli" );
                tampilan5.setText ( "  " );
                tampilan6.setText ( " Varibel yang digunakan" );
                tampilan7.setText ( " ro1, ro2 : massa fluida 1, 2" );
                tampilan8.setText ( " A1, A2 : luas penampang pipa 1, 2" );
                tampilan9.setText ( " V1, v2 : kecepatan aliran pada titik 1, 2" );
                tampilan10.setText ( "p1, p2 : tekanan pada titik 1, 2 " );
                tampilan11.setText ( " r1, r2 : jari-jari silinder di titik 1, 2" );
                tampilan12.setText ( " h1, h2 : tinggi fluida 1, 2" );
            }});

        btnv1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                ro1ro1 = Double.parseDouble ( ro1.getText ( ).toString ( ) );
                ro2ro2 = Double.parseDouble ( ro2.getText ( ).toString ( ) );
                A1A1 = Double.parseDouble ( A1.getText ( ).toString ( ) );
                A2A2 = Double.parseDouble ( A2.getText ( ).toString ( ) );
                p1p1 = Double.parseDouble ( p1.getText ( ).toString ( ) );
                p2p2 = Double.parseDouble ( p2.getText ( ).toString ( ) );
                r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );
                h1h1= Double.parseDouble ( h1.getText ( ).toString ( ) );
                h2h2 = Double.parseDouble ( h2.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                if
                    (!ro1.getText ( ).toString ( ).equals ( "" )   &&
                            !A1.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !h1.getText ( ).toString ( ).equals ( "" )   &&
                            !h2.getText ( ).toString ( ).equals ( "" )   &&
                            !ro2. getText ( ).toString ( ).equals ( "" )) {
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        h1h1 = Double.parseDouble(h1.getText().toString());
                        ro1ro1 = Double.parseDouble(ro1.getText().toString());
                        h2h2 = Double.parseDouble(h2.getText().toString());
                        ro2ro2   = Double.parseDouble(ro2.getText().toString());
                        A2A2  = Double.parseDouble(A2.getText().toString());
                    tampilan1.setText ( " penerapan hukum Bernaulli: Venturi dengan manometer" );
                    tampilan3.setText ( " v1^2 = 2(ro2 - ro1)A2^2 (h2-h1)/(A1^2 - A2^2) " );
                    tampilan4.setText ( " v1 = {2(ro2 - ro1)A2^2 (h2-h1)/(A1^2 - A2^2)}^0,5 " );

                    A1A1 = Math.pow ( A1A1 , 2 );
                    A2A2 = Math.pow ( A2A2 , 2 );
                    v1v1 = 2 * gg * (ro1ro1 - ro2ro2) * (h2h2 - h1h1) / (ro1ro1 * ((A1A1 / A2A2) - 1));
                    v1v1 = Math.pow ( v1v1 , 0.5 );

                    tampilan5.setText ( " v1 = " + df.format ( v1v1 ) + "m/s" );
                } else
                if
                    (!A1.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !h1.getText ( ).toString ( ).equals ( "" )   &&
                            !h2. getText ( ).toString ( ).equals ( "" )) {
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        h1h1 = Double.parseDouble(h1.getText().toString());
                        h2h2 = Double.parseDouble(h2.getText().toString());
                        A2A2  = Double.parseDouble(A2.getText().toString());

                    tampilan1.setText ( "  Venturi tanpa manometer" );
                    tampilan3.setText ( " v1 = A2^2 { 2g (h2-h1)/(A1^2 - A2^2)}^0,5 " );

                    A1A1 = Math.pow ( A1A1 , 2 );
                    A2A2 = Math.pow ( A2A2 , 2 );
                    v1v1 = 2 * gg  * (h2h2 - h1h1) /  ((A1A1 / A2A2) - 1);
                    v1v1 = Math.pow ( v1v1 , 0.5 );

                    tampilan5.setText ( " v1 = " + df.format ( v1v1 ) + "m/s" );


                } else
                if
                    (!A1.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !v2. getText ( ).toString ( ).equals ( "" )) {
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        v2v2 = Double.parseDouble(v2.getText().toString());
                        A2A2  = Double.parseDouble(A2.getText().toString());
                    tampilan1.setText ( " penerapan hukum kontinuitas" );
                    tampilan3.setText ( " A1 * v1 = A2 *v2 " );

                    v1v1 = A2A2 * v2v2 / A1A1;

                    tampilan5.setText ( " v1 = " + df.format ( v1v1 ) + "m/s" );

                }}});
        btnp1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                (!p2.getText ( ).toString ( ).equals ( "" )   &&
                        !v2.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )   &&
                        !A1.getText ( ).toString ( ).equals ( "" )   &&
                        !A2.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    v2v2 = Double.parseDouble(v2.getText().toString());
                   ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    A1A1 = Double.parseDouble(A1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    A2A2  = Double.parseDouble(A2.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());


                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " p1 = p2 + ro*g*(h2 - h1) + 0,5*ro *(v2^2 - v1^2)" );
                    tampilan4.setText ( "  A1*v1 = A2*v2;  " );
                    tampilan5.setText ( " p1 = p2 + ro*g*(h2 - h1) + 0,5*ro *(v2^2 (1 - A2/A1))" );
                       P = A2A2/A1A1;
                       Q = Math.pow(v2v2,2);
                    p1p1 = p2p2 + ro1ro1*gg*(h2h2 - h1h1) + 0.5*ro1ro1*Q*(1 - P);

                    tampilan6.setText ( " p1 = " + df.format (p1p1 ) + "N/m^2" );

                } else
                if
                (!p2.getText ( ).toString ( ).equals ( "" )   &&
                        !v2.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )   &&
                        !r1.getText ( ).toString ( ).equals ( "" )   &&
                        !r2.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    v2v2 = Double.parseDouble(v2.getText().toString());
                    ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    r1r1 = Double.parseDouble(r1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    r2r2  = Double.parseDouble(r2.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " p1 = p2 + ro*g*(h2 - h1) + 0,5*ro *(v2^2 - v1^2)" );
                    tampilan4.setText ( "  A1*v1 = A2*v2;  " );
                    tampilan5.setText ( " p1 = p2 + ro*g*(h2 - h1) + 0,5*ro *(v2^2 (1 - r2^2/r1^2))" );
                    P = Math.pow(r2r2,2)/Math.pow(r1r1,2);
                    Q = Math.pow(v2v2,2);
                    p1p1 = p2p2 + ro1ro1*gg*(h2h2 - h1h1) + 0.5*ro1ro1*Q*(1 - P);

                    tampilan6.setText ( " p1 = " + df.format (p1p1 ) + "N/m^2" );

                 } }} );

        btnp2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                (!p1.getText ( ).toString ( ).equals ( "" )   &&
                        !v1.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )   &&
                        !A1.getText ( ).toString ( ).equals ( "" )   &&
                        !A2.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    v1v1 = Double.parseDouble(v1.getText().toString());
                    ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    A1A1 = Double.parseDouble(A1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    A2A2  = Double.parseDouble(A2.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());


                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " p2 = p1 + ro*g*(h1 - h2) + 0,5*ro *(v1^2 - v2^2)" );
                    tampilan4.setText ( "  A1*v1 = A2*v2;  " );
                    tampilan5.setText ( " p2 = p1 + ro*g*(h1 - h2) + 0,5*ro *(v1^2 (1 - A1/A2))" );

                    p2p2 = p1p1 + ro1ro1*gg*(h1h1 - h2h2) + 0.5*ro1ro1*v1v1*(1 - (A1A1/A2A2));

                    tampilan6.setText ( " p2 = " + df.format (p2p2 ) + "N/m^2" );

                } else
                if
                (!p1.getText ( ).toString ( ).equals ( "" )   &&
                        !v1.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )   &&
                        !r1.getText ( ).toString ( ).equals ( "" )   &&
                        !r2.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    v1v1 = Double.parseDouble(v1.getText().toString());
                    ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    r1r1 = Double.parseDouble(r1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    r2r2  = Double.parseDouble(r2.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());


                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " p2 = p1 + ro*g*(h1 - h2) + 0,5*ro *(v1^2 - v2^2)" );
                    tampilan4.setText ( "  A1*v1 = A2*v2;  " );
                    tampilan5.setText ( " p2 = p1 + ro*g*(h1 - h2) + 0,5*ro *(v1^2 (1 - r1^2/r2^2))" );

                    P = Math.pow(r1r1,2);
                    Q = Math.pow(r2r2,2);
                    S = P/Q;
                    p2p2 = p1p1 + ro1ro1*gg*(h1h1 - h2h2) + 0.5*ro1ro1*v1v1*(1 - S);

                    tampilan6.setText ( " p2 = " + df.format (p2p2 ) + "N/m^2" );


                }}});
        btnA1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                (!p1.getText ( ).toString ( ).equals ( "" )   &&
                        !p2.getText ( ).toString ( ).equals ( "" )   &&
                        !v1.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )   &&
                        !A2.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    v1v1 = Double.parseDouble(v1.getText().toString());
                    ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    A2A2  = Double.parseDouble(A2.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " A1*v1 = A2*v2; " );
                    tampilan4.setText ( "  p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro (A1v1/A2)^2  " );
                    tampilan5.setText ( " A1 = {2* A2^2 *(p1 -p2) + g(h1-h2))/v1 + A2}^2" );

                    P = Math.pow(A2A2,2);
                    A1A1 = (2*P*(p1p1 -p2p2) + gg*(h1h1-h2h2))/v1v1 + A2A2;
                    A1A1 = Math.pow(A1A1,0.5);

                    tampilan6.setText ( " A1 = " + df.format (A1A1 ) + "m^2" );
                }}});
        btnA2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                (!p2.getText ( ).toString ( ).equals ( "" )   &&
                        !p1.getText ( ).toString ( ).equals ( "" )   &&
                        !v1.getText ( ).toString ( ).equals ( "" )   &&
                        !ro1.getText ( ).toString ( ).equals ( "" )  &&
                        !A1.getText ( ).toString ( ).equals ( "" )   &&
                        !h1.getText ( ).toString ( ).equals ( "" )   &&
                        !h2.getText ( ).toString ( ).equals ( "" )   &&
                        !g. getText ( ).toString ( ).equals ( "" )) {
                    p1p1 = Double.parseDouble(p1.getText().toString());
                    p2p2 = Double.parseDouble(p2.getText().toString());
                    v1v1 = Double.parseDouble(v1.getText().toString());
                    ro1ro1 = Double.parseDouble(ro1.getText().toString());
                    h1h1 = Double.parseDouble(h1.getText().toString());
                    h2h2 = Double.parseDouble(h2.getText().toString());
                    A1A1 = Double.parseDouble(A1.getText().toString());
                    gg  = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "  Hukum Bernaulli)");
                    tampilan2.setText ( " p1 + ro*g*h1 + 0,5 ro v1^2 = p2 + ro * g* h2 + 0,5 ro v2^2" );
                    tampilan3.setText ( " A1*v1 = A2*v2; " );
                    tampilan4.setText ( " p1 + ro*g*h1 + 0,5 ro(v2*A1/A2)^2 = p2 + ro * g* h2 + 0,5 ro v2^2  " );
                    tampilan5.setText ( " A2 = {2* A1^2 *(p2 -p1 + g(h2-h1))/v2 + A1}^2" );

                    P = Math.pow(A1A1,2);
                    A2A2 = (2*P*(p2p2 -p1p1) + gg*(h2h2-h1h1))/v2v2 + A1A1;
                    A2A2 = Math.pow(A2A2,0.5);

                    tampilan6.setText ( " A2 = " + df.format (A2A2 ) + "m^2" );

                }}});
        btnPois.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( Hidrodinamik.this , Poisueille.class );
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
                ro1.setText ( "" );
                ro2.setText ( "" );
                r1.setText ( "" );
                r2.setText ( "" );
                A1.setText ( "" );
                A2.setText ( "" );
                p1.setText ( "" );
                p2.setText ( "" );
                g.setText ( "" );
                h1.setText ( "" );
                h2.setText ( "" );
                v1.setText ( "" );
                v2.setText ( "" );
            }
        } );
    }
}
