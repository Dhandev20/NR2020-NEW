package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Gravitasi extends AppCompatActivity {
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


    private EditText M1, M2, r, h, F, g;

    private Double M1M1, M2M2, rr, hh, FF, gg, Vesc, Ep;


    private Double result;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gravitasi );

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


        M1 = findViewById ( R.id.in_M1 );
        M2 = findViewById ( R.id.in_M2 );
        r = findViewById ( R.id.in_r );
        h = findViewById ( R.id.in_I3 );
        F = findViewById ( R.id.in_F);
        g = findViewById ( R.id.in_g );

        Button btnm1 = findViewById ( R.id.btn_M1 );
        Button btnm2 = findViewById ( R.id.btn_M2 );
        Button btnr = findViewById ( R.id.btn_r );
        Button btnh = findViewById ( R.id.btn_h );
        Button btnf = findViewById ( R.id.btn_F );
        Button btng = findViewById ( R.id.btn_g );
        Button btnlepas = findViewById ( R.id.btn_vlepas );
        Button btnEp = findViewById ( R.id.btn_Ep );
        Button btnvar = findViewById ( R.id.btn_Var );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hukum Gravitasi" );
                tampilan2.setText ( "M1 : massa benda 1" );
                tampilan3.setText ( "M2 : massa benda 2" );
                tampilan4.setText ( " R : jari-jari bumi/benda" );
                tampilan5.setText ( " h : tinggi dari permukaan bumi" );
                tampilan6.setText ( " F : gaya tarik gravitasi" );
                tampilan7.setText ( " g : percepatan gravitasi" );
                tampilan8.setText ( " Ep : Energi potensial" );
                tampilan9.setText ( " Vesc: kecepatan lepas" );

            }});

        btnm1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                    !M2.getText ( ).toString ( ).equals ( "" )   &&
                    !r. getText ( ).toString ( ).equals ( "" )) {
                        FF = Double.parseDouble(F.getText().toString());
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        rr   = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( "F = - G*(M1* M2)/ R^2 ;  M1 = (F * R^2)/(G*M2)" );
                            M1M1 = (FF*Math.pow(rr,2))/(M2M2*6.67*Math.pow(10,-11));
                    tampilan2.setText ( " M1 = " + df.format ( M1M1 ) + " kg" );

            } else if

                    (!g.getText ( ).toString ( ).equals ( "" )   &&
                    !r. getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble(g.getText().toString());
                        rr   = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( "g = - G* M1/ R^2,  M1 = (g * R^2)/G " );

                    M1M1 = (gg*Math.pow(rr,2))/(6.67*Math.pow(10,-11));
                    tampilan2.setText ( " M1 = " + df.format ( M1M1 ) + " kg" );
        } }});

     btnm2.setOnClickListener ( new View.OnClickListener ( ) {
                    @Override
                    public void onClick ( View view ) {
                        DecimalFormat df = new DecimalFormat ( "#.###" );
                        
                        if
                            (!F.getText ( ).toString ( ).equals ( "" )   &&
                                    !M1.getText ( ).toString ( ).equals ( "" )   &&
                                    !r. getText ( ).toString ( ).equals ( "" )) {
                                FF = Double.parseDouble(F.getText().toString());
                                M1M1 = Double.parseDouble(M1.getText().toString());
                                rr   = Double.parseDouble(r.getText().toString());

                            tampilan1.setText ( "F = - G*(M1* M2)/ R^2 ; M2 = (F * R^2)/(G*M1)" );

                            M1M1 = (FF*Math.pow(rr,2))/(M1M1*6.67*Math.pow(10,-11));
                            tampilan2.setText ( " M1 = " + df.format ( M2M2 ) + " kg" );
                        } else if
                            (!g.getText ( ).toString ( ).equals ( "" )   &&
                            !r. getText ( ).toString ( ).equals ( "" )) {
                                gg = Double.parseDouble(g.getText().toString());
                                rr = Double.parseDouble(r.getText().toString());

                                tampilan1.setText ( "g = - G* M1/ R^2;   M1 = (g * R^2)/G " );

                            M1M1 = (gg*Math.pow(rr,2))/(6.67*Math.pow(10,-11));
                            tampilan2.setText ( " M1 = " + df.format ( M1M1 ) + " kg" );
                        }} });
        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##################" );

                if
                    (!M2.getText ( ).toString ( ).equals ( "" )   &&
                            !M1.getText ( ).toString ( ).equals ( "" )   &&
                            !r. getText ( ).toString ( ).equals ( "" )) {
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        rr   = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( "F = - G*(M1* M2)/ R^2" );

                    FF = M1M1 * M2M2 * 6.67 * Math.pow ( 10 , -11 ) / Math.pow ( rr , 2 );
                    tampilan2.setText ( " F = " + df.format ( FF ) + " N" );
                } else if

                    (!g.getText ( ).toString ( ).equals ( "" )   &&
                            !M1. getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble(g.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());

                    tampilan1.setText ( "F = M1 * g" );

                    FF = M1M1 * gg;
                    tampilan2.setText ( " F = " + df.format ( FF ) + " N" );
                }else if

                    (!g.getText ( ).toString ( ).equals ( "" )   &&
                            !M2. getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble(g.getText().toString());
                        M2M2 = Double.parseDouble(M2.getText().toString());

                    tampilan1.setText ( "F = M2 * g" );

                    FF = M2M2 * gg;
                    tampilan2.setText ( " F = " + df.format ( FF ) + " N" );
                }}
            });
        btnr.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M2.getText ( ).toString ( ).equals ( "" )   &&
                            !M1.getText ( ).toString ( ).equals ( "" )   &&
                            !F. getText ( ).toString ( ).equals ( "" )) {
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        FF   = Double.parseDouble(F.getText().toString());

                        tampilan1.setText ( "F = - G*(M1* M2)/ R^2;  r = -(G*(M1* M2)/FF) " );

                    rr = M1M1*M2M2* 6.67 * Math.pow ( 10 , -11 ) / FF;
                    rr = Math.pow(rr,0.5);
                    tampilan2.setText ( " F = " + df.format ( rr ) + " N" );
                } else if

                        (!M1.getText ( ).toString ( ).equals ( "" )   &&
                                !g. getText ( ).toString ( ).equals ( "" )) {
                            M1M1 = Double.parseDouble(M1.getText().toString());
                            gg   = Double.parseDouble(g.getText().toString());

                            tampilan1.setText ( "r = (G *  M1)/gg" );

                    rr =M1M1* 6.67* Math.pow(10,-11);
                    rr = Math.pow(rr,0.5);
                    tampilan2.setText ( " R = " + df.format ( rr ) + " N" );
                }else if

                    (!M2.getText ( ).toString ( ).equals ( "" )   &&
                            !g. getText ( ).toString ( ).equals ( "" )) {
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        gg   = Double.parseDouble(g.getText().toString());


                        tampilan1.setText ( "r = (G *  M1)/gg" );

                    rr =M2M2* 6.67* Math.pow(10,-11);
                    rr = Math.pow(rr,0.5);
                    tampilan2.setText ( " R = " + df.format ( rr ) + " N" );
                }}
        });
        btng.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M1.getText ( ).toString ( ).equals ( "" )   &&
                            !F. getText ( ).toString ( ).equals ( "" )) {
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        FF  = Double.parseDouble(F.getText().toString());

                    tampilan1.setText ( "F = - M * g,  g = -F/M" );

                    gg = -FF/M1M1;
                    tampilan2.setText ( " g = " + df.format ( gg ) + " m/s2" );

              } else  if
                        (!M1.getText ( ).toString ( ).equals ( "" )   &&
                                !r. getText ( ).toString ( ).equals ( "" )) {
                            M1M1 = Double.parseDouble(M1.getText().toString());
                            rr   = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( "g = - G * M/ R^2" );

                    gg = - M1M1 * 6.67 * Math.pow ( 10 , -11 ) / Math.pow ( rr , 2 );
                    tampilan2.setText ( " g = " + df.format ( gg ) + " m/s2" );
                }}})  ;
       btnlepas.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!M1.getText ( ).toString ( ).equals ( "" )   &&
                            !r. getText ( ).toString ( ).equals ( "" )) {
                        M1M1 = Double.parseDouble(M1.getText().toString());
                        rr  = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( "Ek = Ep,  0,5 M v^2 = GMm/R,    Vesc = (2 G M/ r)^0,5" );
                    Vesc = 2*0.0000000000674*M1M1/rr;
                    Vesc = Math.pow(Vesc,0.5);
                    tampilan2.setText ( " kecepatan lepas = Vesc = " + df.format (Vesc ) + " m/s" );

                } else if
                        (!r.getText ( ).toString ( ).equals ( "" )   &&
                                !g. getText ( ).toString ( ).equals ( "" )) {
                            rr = Double.parseDouble(r.getText().toString());
                            gg   = Double.parseDouble(g.getText().toString());

                    tampilan1.setText ( "Ek = Ep,  0,5 M v^2 = GMm/R,    Vesc = (2 g r)^0,5" );
                    Vesc = 2 * gg * rr;
                    Vesc = Math.pow ( Vesc , 0.5 );
                    tampilan2.setText ( " kecepatan lepas = Vesc = " + df.format ( Vesc ) + " m/s" );
                }
            }});
        btnEp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##############" );

                if
                    (!M2.getText ( ).toString ( ).equals ( "" )   &&
                            !M1.getText ( ).toString ( ).equals ( "" )   &&
                            !r. getText ( ).toString ( ).equals ( "" )) {
                        M2M2 = Double.parseDouble(M2.getText().toString());
                        M1M1 = Double.parseDouble(M1.getText().toString());
                       rr   = Double.parseDouble(r.getText().toString());

                    tampilan1.setText ( " Energi Potensial gravitasi Ep = - G M1 M2/r" );
                    Ep = - 0.0000000000674*M1M1*M2M2/rr;
                    tampilan2.setText ( " Ep = " + df.format (Ep) + " joule" );


                } }});
        btnvar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( Gravitasi.this , GravitasiVariabel.class );
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
                M1.setText ( "" );
                M2.setText ( "" );
                r.setText ( "" );
                h.setText ( "" );
                F.setText ( "" );
                g.setText ( "" );
            }});
    }
}

