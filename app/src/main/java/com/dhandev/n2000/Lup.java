package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Lup extends AppCompatActivity {
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

    private EditText so, p;
    private EditText f, h, hi, m;
    private Double soso, hh,hihi, ff, mm, pp;


    private Double result1, result2, H1, H2;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_lup );

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
        hi = findViewById ( R.id.in_hi );
        f = findViewById ( R.id.in_f );
        h = findViewById ( R.id.in_I3 );
        p = findViewById ( R.id.in_P );
        so = findViewById ( R.id.in_so );
        m = findViewById ( R.id.in_m );
        Button btnM = findViewById ( R.id.btn_M );
        Button btnf = findViewById ( R.id.btn_f );
        Button btnso = findViewById ( R.id.btn_So );
        Button btnP = findViewById ( R.id.btn_P );
        Button btnh = findViewById ( R.id.btn_h );
        Button btnhi = findViewById ( R.id.btn_hi );
        Button btnkacamata = findViewById ( R.id.btn_Kacamata );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button info = findViewById ( R.id.btn_Info );

        info.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Lup digunakan dalam dua kondisi:" );
                tampilan2.setText ( "1. Akomodasi maksimum" );
                tampilan3.setText ( " 2. Rileks" );
                tampilan4.setText ( " Variabel yang digunakan:" );
                tampilan5.setText ( " f : jarak fokus" );
                tampilan6.setText ( " P : kekuatan lensa" );
                tampilan7.setText ( " M : perbesaran " );
                tampilan8.setText ( " h : tinggi benda" );
                tampilan9.setText ( " hi : tinggi bayangan" );
                tampilan10.setText ( " So : jarak benda " );
                tampilan11.setText ( " " );
                tampilan12.setText ( " " );
                tampilan13.setText ( " " );
                tampilan14.setText ( " " );
                tampilan15.setText ( " " );
            }});

        btnM.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                      (!so.getText ( ).toString ( ).equals ( "" ) &&
                        !f.getText ( ).toString ( ).equals ( "" )) {
                              soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                                ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                          result1 = (25 / ff) + (25 / soso);
                          result2 = 25 / ff;
                    tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi  m = 25/f  + 25/So" );
                    tampilan2.setText ( " dan bila rileks m = 25/f " );
                    tampilan3.setText ( "M = " + df.format ( result1 ) + "kali" +  "  (akomodasi maks)" );
                    tampilan4.setText ( "M = " + df.format ( result2 ) + "kali" +  "  (rileks)" );


                } else if

                    (!so.getText ( ).toString ( ).equals ( "" ) &&
                      !p.getText ( ).toString ( ).equals ( "" )) {
                          soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                            pp = Double.parseDouble ( p.getText ( ).toString ( ) );


                        result1 = (0.25 *pp) + (25 / soso);
                        result2 = 0.25 *pp;
                    tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi  m = 0,25 * P  + 25/So" );
                    tampilan2.setText ( " dan bila rileks m = 0,25 * P" );
                    tampilan3.setText ( "M = " + df.format ( result1 ) + "kali"  + "  (akomodasi maks)" );
                    tampilan4.setText ( "M = " + df.format ( result2 )  + "kali"  + "  (rileks)" );

                } else if
                    (!p.getText ( ).toString ( ).equals ( "" )) {
                         pp = Double.parseDouble ( p.getText ( ).toString ( ) );


                    result1 = (0.25 *pp) ;
                    result2 = (0.25 *pp) + 1 ;
                    tampilan1.setText ( " Bila rileks m = 0,25 * P" );
                    tampilan2.setText ( " Bila akomodasi maks m = 0,25 * P  + 1" );
                    tampilan3.setText ( "M = " + df.format ( result1 ) + "kali"  + "  (rileks)" );
                    tampilan4.setText ( "M = " + df.format ( result2 ) + "kali"  + "  (akomodasi maks)" );

                } else

                    if
                        (!so.getText ( ).toString ( ).equals ( "" )) {
                            soso = Double.parseDouble ( so.getText ( ).toString ( ) );

                            result1 = (25 / soso) ;
                        tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi maksimum m = 25/So " );
                        tampilan2.setText ( "  " );
                        tampilan3.setText ( "M = " + df.format ( result1 ) + "kali"  +  "  (akomodasi maks)" );

                    } else if

                        (!f.getText ( ).toString ( ).equals ( "" )) {
                            ff = Double.parseDouble ( f.getText ( ).toString ( ) );


                            result1 = (25 / ff) + 1;
                        result2 = 25 / ff;
                        tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi maksimum m = 25/f  + 1" );
                        tampilan2.setText ( " dan bila rileks m = 25/f " );
                        tampilan3.setText ( "M = " + df.format ( result1 ) + "kali" + "  (akomodasi maks)" );
                        tampilan4.setText ( "M = " + df.format ( result2 ) + "kali" + "   (rileks)" );

                    }
            }
        }
        );

        btnhi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
             if
                    (!f.getText ( ).toString ( ).equals ( "" ) &&
                     !h.getText ( ).toString ( ).equals ( "" ) &&
                    !so.getText ( ).toString ( ).equals ( "" )) {
                        soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                          ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                          hh = Double.parseDouble ( h.getText ( ).toString ( ) );


                    result1 = (25 / ff) + (25 / soso);
                    result2 = 25 / ff;
                    H1 = result1 * hh;
                    H2 = result2 * hh;
                    tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi  m = 25/f  + 25/So;  hi = M * h" );
                    tampilan2.setText ( " dan bila rileks m = 25/f ; hi = M * h" );
                    tampilan3.setText ( "hi = " + df.format ( H1 ) + "cm" +  "  (akomodasi maks)" );
                    tampilan4.setText ( "hi = " + df.format ( H2 ) + "cm" +  "  (rileks)" );

          } else if
                 (!p.getText ( ).toString ( ).equals ( "" ) &&
                  !h.getText ( ).toString ( ).equals ( "" ) &&
                 !so.getText ( ).toString ( ).equals ( "" )) {
                     soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                     pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                     hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                    result1 = (0.25 *pp) + (25 / soso);
                    result2 = 0.25 *pp;
                    H1 = result1 * hh;
                    H2 = result2 * hh;
                    tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi  m = 0,25 * P  + 25/So;  hi = M * h" );
                    tampilan2.setText ( " dan bila rileks m = 25 * P" );
                    tampilan3.setText ( "hi = " + df.format ( H1 ) + "cm" +  "  (akomodasi maks)" );
                    tampilan4.setText ( "hi = " + df.format ( H2 ) + "cm" +  "  (rileks)" );


             } else if
                 (!p.getText ( ).toString ( ).equals ( "" ) &&
                  !h.getText ( ).toString ( ).equals ( "" )) {
                     pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                     hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                       result1 = (0.25 *pp) ;
                       result2 = (0.25 *pp)+ 1 ;
                            H1 = result1 * hh;
                            H2 = result2 * hh;
                    tampilan1.setText ( " Bila rileks m = 0,25 * P; hi = M * h" );
                    tampilan2.setText ( " Bila rileks m = 0,25 * P  + 1; hi = M * h" );
                    tampilan3.setText ( "hi = " + df.format ( H1 ) + "cm" +  "  (rileks)" );
                    tampilan4.setText ( "hi = " + df.format ( H2 ) + "cm" +  "  (akomodasi maks)" );

                } else
                    if
                        (!so.getText ( ).toString ( ).equals ( "" ) &&
                          !h.getText ( ).toString ( ).equals ( "" )) {
                            soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                            hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                        result1 = (25 / soso) ;
                        H1 = result1 * hh;
                        tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi maksimum m = 25/So; hi = M * h " );
                        tampilan3.setText ( "hi = " + df.format ( H1 ) + "cm" +  "  (akomodasi maks)" );

                    } else if
                        (!f.getText ( ).toString ( ).equals ( "" ) &&
                         !h.getText ( ).toString ( ).equals ( "" )) {
                            ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                            hh = Double.parseDouble ( h.getText ( ).toString ( ) );


                            result1 = (25 / ff) + 1;
                            result2 = 25 / ff;

                        H1 = result1 * hh;
                        H2 = result2 * hh;
                        tampilan1.setText ( "Perbesaran bayangan bila mata berakomodasi  m = 25/f  + 1;  hi = M * h" );
                        tampilan2.setText ( " dan bila rileks m = 25/f ; hi = M * h" );
                        tampilan3.setText ( "hi = " + df.format ( H1 ) + "cm" +  "  (akomodasi maks)" );
                        tampilan4.setText ( "hi = " + df.format ( H2 ) + "cm" +  "  (rileks)" );
                    } }}
        );
        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                    (!m.getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );

                        result1 = 25 /(mm-1);
                    result2 = 25 / mm;

                    tampilan1.setText ( "jarak fukus  m = 25/f  + 1;  f = 25/(m-1)" );
                    tampilan2.setText ( " dan bila rileks m = 25/f ; f = 25/m" );
                    tampilan3.setText ( "hi = " + df.format ( result1 ) + "cm" +  "  (akomodasi maks)" );
                    tampilan4.setText ( "hi = " + df.format ( result2 ) + "cm" +  "  (rileks)" );

                } }}
        );
        btnso.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                    (!p.getText ( ).toString ( ).equals ( "" )) {
                        pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                    ff = 100 / pp;
                    soso = 25 * ff / (25 + ff);
                    tampilan1.setText ( "jarak benda  So = 25*f/(25-f), f = 100/p" );
                    tampilan2.setText ( " " );
                    tampilan3.setText ( "So = " + df.format ( soso ) + "cm" );
                }
                if
                    (!f.getText ( ).toString ( ).equals ( "" )) {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                    soso = 25 * ff / (25 + ff);
                    tampilan1.setText ( "jarak benda  So = 25*f/(25+f)" );
                    tampilan2.setText ( " " );
                    tampilan3.setText ( "So = " + df.format ( soso ) + "cm" );
            }}});

        btnkacamata.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( Lup.this , Kacamata.class );
                startActivity ( intent ); }
        } );


        hapus.setOnClickListener ( new View.OnClickListener ( ) {
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
                f.setText ( "" );
                so.setText ( "" );
                p.setText ( "" );
                hi.setText ( "" );
                h.setText ( "" );
                m.setText ( "" );

            }
        } );

    }

};


