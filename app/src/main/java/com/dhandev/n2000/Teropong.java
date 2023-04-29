package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Teropong extends AppCompatActivity {
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
    private EditText in_fob, in_fok, in_Pok, in_Pob, in_m, in_L,sok;
    private TextView fob, fok, Pok, Pob, m, L;
    private Double fobfob, fokfok, soksok, LL, Pok2, Pob2;
    private Double M,   fpp;
    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_teropong );

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

        //textView
        fob = findViewById ( R.id.fob );
        fok = findViewById ( R.id.fok );
        Pob = findViewById ( R.id.Pob );
        L = findViewById ( R.id.R2 );
        Pok = findViewById ( R.id.Pok );
        m = findViewById ( R.id.M );
        fob.setText ( Html.fromHtml ( "f<small><sub>ob</sub></small>=" ) );
        fok.setText ( Html.fromHtml ( "f<small><sub>ok</sub></small>=" ) );
        Pob.setText ( Html.fromHtml ( "P<small><sub>ob</sub></small>=" ) );
        Pok.setText ( Html.fromHtml ( "P<small><sub>ok</sub></small>=" ) );




        //editText
        in_fob = findViewById ( R.id.in_fob );
        in_fok = findViewById ( R.id.in_fok );
        in_Pob = findViewById ( R.id.in_Pob );
        in_L = findViewById ( R.id.in_R2 );
        in_Pok = findViewById ( R.id.in_Pok );
        in_m = findViewById ( R.id.in_M );



        Button rileks = findViewById ( R.id.btn_Mr );
        Button akomodasi = findViewById ( R.id.btn_Ma );
        Button btnfob = findViewById ( R.id.btn_fob );
        Button btnfok = findViewById ( R.id.btn_fok );
        Button Lrilek = findViewById ( R.id.btn_Lr);
        Button Lakom = findViewById ( R.id.btn_La );
        Button fobakom = findViewById ( R.id.btn_fobA );
        Button fokakom = findViewById ( R.id.btn_fokA );
        Button info = findViewById ( R.id.btn_Info );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button Keker = findViewById ( R.id.btn_Keker );

        btnfob.setText ( Html.fromHtml ( "f<small><sub>ob</sub></small>" ) );
        btnfok.setText ( Html.fromHtml ( "f<small><sub>ok</sub></small>" ) );
        Lrilek.setText ( Html.fromHtml ( "L<small><sub>rileks</sub></small>" ) );
        Lakom.setText ( Html.fromHtml ( "L<small><sub>akom</sub></small>" ) );
        fobakom.setText ( Html.fromHtml ( "f<small><sub>ob akom</sub></small>" ) );
        fokakom.setText ( Html.fromHtml ( "f<small><sub>ok akom</sub></small>" ) );
        rileks.setText ( Html.fromHtml ( "M<small><sub> rileks</sub></small>" ) );
        akomodasi.setText ( Html.fromHtml ( "M<small><sub> akom</sub></small>" ) );





        info.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Teropong ada dua jenis: teropong bintang dan teropong bumi:" );
                tampilan2.setText ( "Kondisi mata: Akomodasi maksimum dan rileks" );
                tampilan3.setText ( " " );
                tampilan4.setText ( " Variabel yang digunakan:" );
                tampilan5.setText ( " fob : jarak fokus lensa obyektif" );
                tampilan6.setText ( " fok : jarak fokus lensa okuler" );
                tampilan7.setText ( " Pob : kekuatan lensa obyektif (dioptri)" +
                        "Pok : kekuatan lensa okuler (dioptri)" );
                tampilan8.setText ( " sok : jarak benda dari lensa okuler (bayangan lensa obyekti)" );
                tampilan9.setText ( "  L : panjang teropong " );
                tampilan10.setText ( "M.rileks : perbesaran yang diamati oleh mata rileks" );
                tampilan11.setText ( " M.akom : perbesaran yang diamati mata berakomodasi maksimum" );
                tampilan12.setText ( " L.rileks : panjang teropong digunakan pengamat rileks" );
                tampilan13.setText ( " L.akom : panjang teropong yang diamati pengamat berakomodasi maksimum" );
                tampilan14.setText ( " " );
                tampilan15.setText ( " " );
            }});

        rileks.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ){
            DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/fok" );
                    M = fobfob / fokfok;
                    tampilan2.setText ( "Perbesaran bayangan benda yang diamati dengan teropong bintang:" );
                    tampilan3.setText ( "M = " + df.format ( M ) + "kali" );
                } else if
                             (!in_fok.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" )) {
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fob = L - fok " );
                    tampilan4.setText ( " M = (L - fok)/fok)" );
                    tampilan5.setText ( " Perbesaran anguler: " );

                    M = (LL -fokfok)/fokfok;
                    tampilan7.setText ( " M = " + df.format (M ) + "kali" );

                } else if
                             (!in_Pok.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" )) {
                    Pok2 = Double.parseDouble ( in_Pok.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fob = L - fok " );
                    tampilan4.setText ( " fob = L - 1/Pok " );
                    tampilan5.setText ( " M = (L - 1/pok)*Pok" );
                    tampilan6.setText ( " M = Pok*L - 1" );
                    tampilan7.setText ( " Perbesaran anguler: " );
                    fokfok = 100/Pok2;
                    M = (LL -fokfok)/fokfok;
                    tampilan8.setText ( " M = " + df.format (M ) + "kali" );


                } else if
                             (!in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" )) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fok = L - fob " );
                    tampilan4.setText ( " M = fob/(L - fob)" );
                    tampilan5.setText ( " Perbesaran anguler: " );

                    M = fobfob/( LL - fobfob);
                    tampilan7.setText ( " M =" + df.format (M ) + "kali" );
                } else if
                (!in_Pob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" )) {
                    Pob2 = Double.parseDouble ( in_Pob.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fok = L - fob " );
                    tampilan3.setText ( " fok = L - 1/Pob " );
                    tampilan4.setText ( " M = fob/(L - fob)" );
                    tampilan4.setText ( " M = (1/Pob)/(L - 1/Pob)" );
                    tampilan5.setText ( " Perbesaran anguler: " );
                    fobfob = 100/Pob2;
                    M = fobfob/( LL - fobfob);
                    tampilan7.setText ( " M = " + df.format (M ) + "kali" );


                }
        } }
        );

        akomodasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/Sok" );
                    tampilan2.setText ( " Sok = Siok*fok/(fok - siok)");
                    tampilan3.setText ( " Sok = 25*fok/(fok + 25)");

                    soksok = 25*fokfok/(fokfok+25);
                    M = fobfob / soksok;
                    tampilan4.setText ( "Perbesaran bayangan benda yangdiamati dengan teropong kondisi mata berakomodasi:" );
                    tampilan6.setText ( " M = " + df.format ( M ) + "kali" );


                } else if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                  !in_L.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " L = fob + sok" );
                    tampilan2.setText ( " sok = L - fob" );
                    tampilan3.setText ( " M = fob/Sok" );

                    soksok = LL - fobfob;

                    M = fobfob / soksok;

                    tampilan5.setText ( "Sok = " + df.format ( soksok ) + "cm" );
                    tampilan6.setText ( "Perbesaran bayangan benda yang diamati dengan teropong kondisi mata berakomodasi:" );
                    tampilan7.setText ( " M = " + df.format ( M ) + "kali" );

                } else if
                               ( !in_Pob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" ) ) {
                   Pob2 = Double.parseDouble ( in_Pob.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( " L = fob + sok" );
                    tampilan2.setText ( " sok = L - fob" );
                    tampilan2.setText ( " fob =1/Pob" );
                    tampilan3.setText ( " M = fob/Sok" );
                    fobfob = 100/Pob2;
                   soksok = LL - fobfob;

                    M = fobfob / soksok;
                    tampilan5.setText ( "fob = " + df.format ( fobfob ) + "cm" );
                    tampilan6.setText ( "Sok = " + df.format ( soksok ) + "cm" );
                    tampilan7.setText ( "Perbesaran bayangan benda yang diamati dengan teropong kondisi mata berakomodasi:" );
                    tampilan8.setText ( " M = " + df.format ( M ) + "kali" );


                }
            }} );
        Lrilek.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );


               if
               (!in_fob.getText ( ).toString ( ).equals ( "" ) &&
                      !in_fok.getText ( ).toString ( ).equals ( "" )) {
                   fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                   fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                   tampilan1.setText ( " Panjang teropong " );
                   tampilan2.setText ( " L = fob + fok " );

                   LL = fobfob + fokfok;
                   tampilan4.setText ( "L =" + df.format ( LL ) + "cm" );
               }else if
                         (!in_fob.getText ( ).toString ( ).equals ( "" ) &&
                            !in_m.getText ( ).toString ( ).equals ( "" )) {
                   fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                   M = Double.parseDouble ( in_m.getText ( ).toString ( ) );
                   tampilan1.setText ( " M = fob/fok " );
                   tampilan2.setText ( " fok = fob/M " );
                   tampilan3.setText ( " L = fob + fok " );
                   tampilan4.setText ( " L = fob + fob/M " );
                   tampilan5.setText ( " L = fob( 1 + 1/M)" );
                   tampilan6.setText ( " Panjang teropong: " );

                   LL = fobfob*(1+ 1/M);
                   tampilan8.setText ( " L = " + df.format ( LL) + "cm" );
           }else if
                             (!in_fok.getText ( ).toString ( ).equals ( "" ) &&
                               !in_m.getText ( ).toString ( ).equals ( "" )) {
                   fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                   M = Double.parseDouble ( in_m.getText ( ).toString ( ) );

                   tampilan1.setText ( " M = fob/fok " );
                   tampilan2.setText ( " fob = M*fok " );
                   tampilan3.setText ( " L = fob + fok " );
                   tampilan4.setText ( " L = M*fok + fok " );
                   tampilan5.setText ( " L = fok( 1 + M)" );
                   tampilan6.setText ( " Panjang teropong: " );

                   LL = fokfok*(1+ M);
                   tampilan8.setText ( " L = " + df.format ( LL) + "cm" );
      }else if
               (!in_Pob.getText ( ).toString ( ).equals ( "" ) &&
                               !in_m.getText ( ).toString ( ).equals ( "" )) {
                   Pob2 = Double.parseDouble ( in_Pob.getText ( ).toString ( ) );
                   M = Double.parseDouble ( in_m.getText ( ).toString ( ) );

                   tampilan1.setText ( " M = fob/fok " );
                   tampilan2.setText ( " fob = 1/Pob " );
                   tampilan3.setText ( " L = fob + fok " );
                   tampilan4.setText ( " fok = fob/M " );
                   tampilan5.setText ( " L = fob + fob/M)" );
                   tampilan6.setText ( " Panjang teropong: " );
                    fobfob = 100/Pob2;
                   LL = fobfob*(1+ 1/ M);
                   tampilan8.setText ( " L = " + df.format ( LL) + "cm" );



               }}}
        );

        fobakom.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                ( !in_fok.getText ( ).toString ( ).equals ( "" ) &&
                        !in_L.getText ( ).toString ( ).equals ( "" ) ) {
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob + Sok" );
                    tampilan2.setText ( " Sok = Siok*fok/(fok - siok)");
                    tampilan3.setText ( " Sok = 25*fok/(fok + 25)");
                    tampilan4.setText ( " fob = L - Sok");

                    soksok = 25*fokfok/(fokfok+25);
                    fobfob = LL - soksok;
                    tampilan6.setText ( " Sok= " + df.format ( soksok ) + "cm" );
                    tampilan5.setText ( " panjang fukus obyektif teropong kondisi mata berakomodasi:" );
                    tampilan6.setText ( " fob = " + df.format ( fobfob ) + "cm" );


                } else if
                             ( !in_fok.getText ( ).toString ( ).equals ( "" ) &&
                                !in_m.getText ( ).toString ( ).equals ( "" ) ) {
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    M = Double.parseDouble ( in_m.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob + Sok" );
                    tampilan2.setText ( " Sok = Siok*fok/(fok - siok)");
                    tampilan3.setText ( " Sok = 25*fok/(fok + 25)");
                    tampilan4.setText ( " M = fob/sok");
                    tampilan5.setText ( " fob = M * sok");

                    soksok = 25*fokfok/(fokfok+25);

                    fobfob = M * soksok;

                    tampilan6.setText ( "Sok = " + df.format ( soksok ) + "cm" );
                    tampilan7.setText ( "Panjang fokus lensa obyektif:" );
                    tampilan8.setText ( " fob = " + df.format ( fobfob ) + " cm" );

                } else if
                ( !in_Pok.getText ( ).toString ( ).equals ( "" ) &&
                                !in_m.getText ( ).toString ( ).equals ( "" ) ) {
                    Pok2 = Double.parseDouble ( in_Pok.getText ( ).toString ( ) );
                    M = Double.parseDouble ( in_m.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob + Sok" );
                    tampilan2.setText ( " Sok = Siok*fok/(fok - siok)");
                    tampilan3.setText ( " Sok = 25*fok/(fok + 25)");
                    tampilan3.setText ( " fok = 1/Pok");
                    tampilan4.setText ( " M = fob/sok");
                    tampilan5.setText ( " fob = M * sok");
                    fokfok = 100/Pok2;
                    soksok = 25*fokfok/(fokfok+25);

                    fobfob = M * soksok;

                    tampilan6.setText ( "Sok = " + df.format ( soksok ) + "cm" );
                    tampilan7.setText ( "Panjang fokus lensa obyektif:" );
                    tampilan8.setText ( " fob = " + df.format ( fobfob ) + " cm" );

                }
            }} );

        fokakom.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_L.getText ( ).toString ( ).equals ( "" ) ) {
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob + Sok" );
                    tampilan2.setText ( " fok = Siok*sok/(Sok + Siok)");
                    tampilan3.setText ( " fok = 25*Sok/(Sok + 25)");

                    soksok = LL - fobfob;
                    fokfok = 25*soksok/(soksok+25);

                    tampilan5.setText ( " Sok= " + df.format ( soksok ) + "cm" );
                    tampilan6.setText ( " panjang fukus okuler teropong kondisi mata berakomodasi:" );
                    tampilan7.setText ( " fok = " + df.format ( fokfok ) + "cm" );


                } else if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_m.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    M = Double.parseDouble ( in_m.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob / Sok" );
                    tampilan1.setText ( " Sok = fob / M" );
                    tampilan2.setText ( " fok = Siok*sok/(Sok + Siok)");
                    tampilan3.setText ( " fok = 25*Sok/(Sok + 25)");

                    soksok = fobfob/M;

                  fokfok = 25*soksok/(soksok +25);

                    tampilan6.setText ( "Sok = " + df.format ( soksok ) + "cm" );
                    tampilan7.setText ( "Panjang fokus lensa okuler:" );
                    tampilan8.setText ( " fok = " + df.format ( fobfob ) + " cm" );


                }
            }} );




        btnfok.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                (!in_m.getText ( ).toString ( ).equals ( "" ) &&
                        !in_L.getText ( ).toString ( ).equals ( "" )) {
                    M = Double.parseDouble ( in_m.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " fob = M * fok " );
                    tampilan3.setText ( " L = fob + fok " );
                    tampilan4.setText ( " L = M*fok + fok " );
                    tampilan5.setText ( " L = fok(M + 1) " );
                    tampilan6.setText ( " fok = L/(M + 1) " );

                    fokfok = LL / (M + 1);
                    tampilan8.setText ( " fok = " + df.format ( fokfok ) + "cm" );
                } else if
                    (!in_fob.getText ( ).toString ( ).equals ( "" ) &&
                            !in_L.getText ( ).toString ( ).equals ( "" )) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );

                    tampilan1.setText ( " Panjang teropong " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fok = L - fob " );
                    tampilan4.setText ( " panjang fokus okuler: " );

                    fokfok = LL - fobfob ;
                    tampilan4.setText ( " fok = " + df.format ( fokfok ) + "cm" );
                }}}
        );

        btnfob.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                (!in_m.getText ( ).toString ( ).equals ( "" ) &&
                        !in_L.getText ( ).toString ( ).equals ( "" )) {
                    M = Double.parseDouble ( in_m.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/fok " );
                    tampilan2.setText ( " fok = fob/M " );
                    tampilan3.setText ( " L = fob + fok " );
                    tampilan4.setText ( " L = fob + fob/M " );
                    tampilan5.setText ( " L = fob(1 + 1/M) " );
                    tampilan6.setText ( " fob = L/(1 + 1/M) " );
                    tampilan7.setText ( " panjang fokus obyektif teropong: " );


                    fobfob = LL/(1 + 1/M);
                    tampilan8.setText ( " fob = " + df.format ( fobfob ) + "cm" );
                } else if
                (!in_fok.getText ( ).toString ( ).equals ( "" ) &&
                                !in_L.getText ( ).toString ( ).equals ( "" )) {
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );

                    tampilan1.setText ( " Panjang teropong " );
                    tampilan2.setText ( " L = fob + fok " );
                    tampilan3.setText ( " fob = L - fok " );
                    tampilan4.setText ( " panjang fokus okuler: " );

                    fobfob = LL - fokfok ;
                    tampilan4.setText ( " fob = " + df.format ( fobfob ) + "cm" );

                }}}
        );

        Lakom.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                    ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&

                      !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                        fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                        fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " Akomodasi  L = fob + Sok " );
                    tampilan2.setText ( "  sok = 25*fok/(25+fok)" );
                    soksok=25*fokfok/(25+fokfok);
                    LL = fobfob + soksok;
                    tampilan3.setText ( "sok =" + df.format ( soksok ) + "cm" );
                    tampilan4.setText ( "Panjang teropong dengan  kondisi mata berakomodasi:" );
                    tampilan5.setText ( " L = " + df.format ( LL ) + "cm" );
                } else  if
                    ( !in_Pob.getText ( ).toString ( ).equals ( "" ) &&
                  !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    Pob2 = Double.parseDouble ( in_Pob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob + Sok " );
                    tampilan2.setText ( "  sok = 25*fok/(25+fok)" );
                    tampilan3.setText ( " L = fob + Sok " );
                    soksok=25*fokfok/(25+fokfok);
                    fobfob = 100/Pob2;
                         LL = fobfob + soksok;
                    tampilan4.setText ( "Panjang teropong dengan  kondisi mata berakomodasi:" );
                    tampilan5.setText ( " L = " + df.format ( LL ) + "cm" );

                 }}}
        );
        Keker.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( Teropong.this , Keker.class );
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

                in_fob.setText ( "" );
                in_fok.setText ( "" );
                in_Pok.setText ( "" );
                in_Pob.setText ( "" );
                in_m.setText ( "" );

                in_L.setText ( "" );

            }
        } );




    }

}
