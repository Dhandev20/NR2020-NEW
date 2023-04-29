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

public class Keker extends AppCompatActivity {
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
    private EditText in_fob, in_fok, in_sok, in_fp, in_m, in_L;
    private TextView fob, fok, sok, fp,m, L;
    private Double fobfob, fokfok, soksok, LL;
    private Double M,   fpp;
    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_keker );

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

        fob = findViewById ( R.id.fob );
        fok = findViewById ( R.id.fok );
        sok = findViewById ( R.id.etsok );
        L = findViewById ( R.id.etL );
        fp = findViewById ( R.id.fp );
        fob.setText ( Html.fromHtml ( "f<small><sub>ob</sub></small>=" ) );
        fok.setText ( Html.fromHtml ( "f<small><sub>ok</sub></small>=" ) );
        sok.setText ( Html.fromHtml ( "S<small><sub>ok</sub></small>=" ) );

        in_fob = findViewById ( R.id.in_fob );
        in_fok = findViewById ( R.id.in_fok );
        in_sok = findViewById ( R.id.in_sok );
        in_L = findViewById ( R.id.in_R2 );
        in_fp = findViewById ( R.id.in_fp );

        Button rileks = findViewById ( R.id.btn_Mr );
        Button akomodasi = findViewById ( R.id.btn_Ma );
        Button btnfob = findViewById ( R.id.btn_fob );
        Button btnfok = findViewById ( R.id.btn_fok );
        Button Lrilek = findViewById ( R.id.btn_Lr);
        Button Lakom = findViewById ( R.id.btn_La );
        Button info = findViewById ( R.id.btn_Info );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button Tropong = findViewById ( R.id.btn_Tropong );

        btnfob.setText ( Html.fromHtml ( "f<small><sub>ob</sub></small>" ) );
        btnfok.setText ( Html.fromHtml ( "f<small><sub>ok</sub></small>" ) );
        Lrilek.setText ( Html.fromHtml ( "L<small><sub>rileks</sub></small>" ) );
        Lakom.setText ( Html.fromHtml ( "L<small><sub>akom</sub></small>" ) );
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
                tampilan7.setText ( " fp : jarak fokus lensa pembalik" );
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
                fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                tampilan1.setText ( " M = fob/fok" );
                M = fobfob / fokfok;
                tampilan2.setText ( "Perbesaran bayangan benda yangdiamati dengan teropong kondisi mata rileks:" );
                tampilan3.setText ( "M =" + df.format ( M ) + "kali" );
            } }
        );

        akomodasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
                if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_sok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    soksok = Double.parseDouble ( in_sok.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/Sok" );
                    M = fobfob / soksok;
                    tampilan2.setText ( "Perbesaran bayangan benda yangdiamati dengan teropong kondisi mata berakomodasi:" );
                    tampilan3.setText ( "M =" + df.format ( M ) + "kali" );


                } else if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " M = fob/Sok;  sok = 25*fok/(25+fok)" );
                    soksok = 25 * fokfok / (25 + fokfok);
                    M = fobfob / soksok;
                    tampilan2.setText ( "Sok =" + df.format ( soksok ) + "cm" );
                    tampilan3.setText ( "Perbesaran bayangan benda yang diamati dengan teropong kondisi mata berakomodasi:" );
                    tampilan4.setText ( "M =" + df.format ( M ) + "kali" );
                }
            }} );
        Lrilek.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );


                if
                      ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fp.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    fpp = Double.parseDouble ( in_fp.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = Siob + 4 fp + fok " );
                    tampilan2.setText ( "Siob = fob  karena  Sob sangat jauh"  );
                    tampilan3.setText ( " L =  fob + 4 fp + fok"  );
                    LL = fobfob + 4 * fpp + fokfok;
                    tampilan3.setText ( "Panjang teropong dengan  kondisi mata rileks:" );
                    tampilan4.setText ( "L =" + df.format ( LL ) + "cm" );
                } else if

                              ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    tampilan1.setText ( " L = fob - fok " );
                    LL = fobfob - fokfok;
                    tampilan2.setText ( "Panjang teropong dengan  kondisi mata rileks:" );
                    tampilan3.setText ( "L =" + df.format ( LL ) + "cm" );
                }  }}
        );
        Lakom.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fp.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    fpp = Double.parseDouble ( in_fp.getText ( ).toString ( ) );

                    tampilan1.setText ( " Akomodasi  L = Siob + 4 fp + sok " );
                    tampilan2.setText ( "  sok = 25*fok/(25+fok)" );
                    soksok=25*fokfok/(25+fokfok);
                    LL = fobfob + 4 * fpp + soksok;
                    tampilan3.setText ( "sok =" + df.format ( soksok ) + "cm" );
                    tampilan4.setText ( "Panjang teropong dengan  kondisi mata berakomodasi:" );
                    tampilan5.setText ( "L =" + df.format ( LL ) + "cm" );
                } else  if
                ( !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                !in_fok.getText ( ).toString ( ).equals ( "" ) ) {
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = fob - fok " );
                    LL = fobfob - fokfok;
                    tampilan2.setText ( "Panjang teropong dengan  kondisi mata berakomodasi:" );
                    tampilan3.setText ( "L =" + df.format ( LL ) + "cm" );

                }}}
        );

        Tropong.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( Keker.this , Teropong.class );
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
                in_sok.setText ( "" );
                in_fp.setText ( "" );

                in_L.setText ( "" );

            }
        } );




    }

}
