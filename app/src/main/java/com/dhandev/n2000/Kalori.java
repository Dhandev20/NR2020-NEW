
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Kalori extends AppCompatActivity {
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


    private EditText ma, mb, ca, cb, ces, Ta, Tb, Tset, Kl, Ku, dT, Q;
    private Double ma2, mb2, ca2, cb2, ces2, Ta2, Tb2, Tset2, Kl2, Ku2, dT2, Q2;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kalori );

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

        ma = findViewById ( R.id.in_ma );
        mb = findViewById ( R.id.in_mb );
        ca = findViewById ( R.id.in_ca );
        cb = findViewById ( R.id.in_cb );
        ces = findViewById ( R.id.in_ces );
        dT = findViewById ( R.id.in_dT );
        Ta = findViewById ( R.id.in_Ta );
        Tb = findViewById ( R.id.in_Tb );
        Kl = findViewById ( R.id.in_Kl );
        Ku = findViewById ( R.id.in_Ku );
        Q = findViewById ( R.id.in_Q );
        Tset = findViewById ( R.id.in_Tset );


        Button btnma = findViewById ( R.id.btn_ma );
        Button btnmb = findViewById ( R.id.btn_mb );
        Button btnca = findViewById ( R.id.btn_ca );
        Button btncb = findViewById ( R.id.btn_cb );
        Button btnTa = findViewById ( R.id.btn_Ta );
        Button btnTb = findViewById ( R.id.btn_Tb );
        Button btnTset = findViewById ( R.id.btn_Tset );
        Button btnKl = findViewById ( R.id.btn_Kl );
        Button btnKu = findViewById ( R.id.btn_Ku );
        Button btnQ = findViewById ( R.id.btn_Q );
        Button btndT = findViewById ( R.id.btn_dT );
        Button btnPindah = findViewById ( R.id.btn_alir );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button info= findViewById ( R.id.btn_Info );

        info.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalori:" );
                tampilan2.setText ( "Variabel yang digunakan: " );
                tampilan3.setText ( " ma : massa beda A" );
                tampilan4.setText ( " mb : massa beda B:" );
                tampilan5.setText ( " ca :kalor jenis benda A" );
                tampilan6.setText ( " cb :kalor jenis benda B" );
                tampilan7.setText ( " Ta: temperatur awal benda A  " );
                tampilan8.setText ( " Tb: temperatur awal benda B " );
                tampilan9.setText ( " Tset : temperatur akhir benda A  atau temperatur A = B " );
                tampilan10.setText ( " dT : perubahan temperatur " );
                tampilan11.setText ( " Kl : kalor lebur" );
                tampilan12.setText ( " Ku : kalor uap " );
                tampilan13.setText ( " Q : kalor" );
                tampilan14.setText ( " ces : kalor jenis es" );
                tampilan15.setText ( " " );
                tampilan16.setText ( "  " );
                tampilan17.setText ( " " );
                tampilan18.setText ( " " );
                tampilan19.setText ( " " );
                tampilan20.setText ( " " );

            }});

    btnQ.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
         DecimalFormat df = new DecimalFormat ( "#.#####" );

         if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                     !ca.getText ( ).toString ( ).equals ( "" ) &&
                     !ces.getText ( ).toString ( ).equals ( "" ) &&
                     !Ta.getText ( ).toString ( ).equals ( "" ) &&
                     !Tset.getText ( ).toString ( ).equals ( "" ) &&
                     !Kl.getText ( ).toString ( ).equals ( "" )) {
                 ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                 ces2 = Double.parseDouble ( ces.getText ( ).toString ( ) );
                 Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                 Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                 Kl2= Double.parseDouble ( Kl.getText ( ).toString ( ) );

             if (Ta2 < 0 && Tset2 > 0){

             tampilan1.setText ( "Q = m ces * (0 - T1) + m Kl + m c (T2 - 0)" );
             Q2 = (ma2 * ces2 * (0 - Ta2)) + (ma2 * Kl2) + (ma2 * ca2 * (Tset2 - 0));
             tampilan2.setText ( " Q = " + df.format ( Q2 ) + "joule" );
             Q2 = Q2/4.1868;
             tampilan3.setText ( " Q = " + df.format ( Q2 ) + "kalori" );

         }} else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                     !ca.getText ( ).toString ( ).equals ( "" ) &&
                     !dT.getText ( ).toString ( ).equals ( "" )) {
                 ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                 dT2 = Double.parseDouble ( dT.getText ( ).toString ( ) );

             tampilan1.setText ( " Q =  m c dT" );
             Q2 = ma2 * ca2 * dT2;
             tampilan2.setText ( " Q = " + df.format ( Q2 ) + "joule" );
             Q2 = Q2/4.1868;
             tampilan3.setText ( " Q = " + df.format ( Q2 ) + "kalori" );

         } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                     !ca.getText ( ).toString ( ).equals ( "" ) &&
                     !Ta.getText ( ).toString ( ).equals ( "" ) &&
                     !Tset.getText ( ).toString ( ).equals ( "" )) {
                 ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                 Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                 Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );

             tampilan1.setText ( " Q =  m c (T2 - T1)" );
             Q2 = ma2 * ca2 * (Tset2 - Ta2);
             tampilan2.setText ( " Q = " + df.format ( Q2 ) + "joule" );
             Q2 = Q2/4.1868;
             tampilan3.setText ( " Q = " + df.format ( Q2 ) + "kalori" );
         }
         else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                     !Kl.getText ( ).toString ( ).equals ( "" )) {
                 ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 Kl2= Double.parseDouble ( Kl.getText ( ).toString ( ) );

             tampilan1.setText("Q = m Kl ");
             Q2 = (ma2 * Kl2);
             tampilan2.setText ( " Q = " + df.format ( Q2 ) + "joule" );
             Q2 = Q2/4.1868;
             tampilan3.setText ( " Q = " + df.format ( Q2 ) + "kalori" );

         }else if
                 ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                         !Ku.getText ( ).toString ( ).equals ( "" )) {
                     ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     Ku2= Double.parseDouble ( Kl.getText ( ).toString ( ) );

             tampilan1.setText ( "Q = m Ku " );
             Q2 = (ma2 * Ku2);
             tampilan2.setText ( " Q = " + df.format ( Q2 ) + "joule" );
             Q2 = Q2/4.1868;
             tampilan3.setText ( " Q = " + df.format ( Q2 ) + "kalori" );
         }}}
        );
        btnTset.setOnClickListener ( new View.OnClickListener ( ) {
            // hukum Black menentukan suhu akhir campuran
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );


                    tampilan1.setText ( "Tsetimbang = (Q + m c T1)/(m*c) " );
                    Tset2 = (Q2 + ma2 * ca2 * Ta2) / (ma2 * ca2);
                    tampilan2.setText ( " Tsetimbang = " + df.format ( Tset2 ) + "derC" );
                } else
                if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !mb.getText ( ).toString ( ).equals ( "" ) &&
                            !cb.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tb.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                        Tb2 = Double.parseDouble ( Tb.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );

                    tampilan1.setText ( "Tsetimbang = (ma* ca * Ta + mb * cb * Tb)/(ma * ca + mb * cb) " );
                    Tset2 = (ma2*ca2*Ta2 + mb2*cb2*Tb2)/(ma2*ca2 + mb2*cb2);
                    tampilan2.setText ( " T setimbang = " + df.format ( Tset2 ) + "derC" );
                }
                else if
                   // suhu akhir dari es yang dipanaskan
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !ces.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !Kl.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        ces2 = Double.parseDouble ( ces.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        Kl2= Double.parseDouble ( Kl.getText ( ).toString ( ) );

                    Tset2 = (Q2-(ma2*Kl2 - ma2*ces2*Ta2));
                    if (Tset2 > 0){
                    // es telah menjadi air
                        Tset2=(Q2-(ma2*Kl2 - ma2*ces2*Ta2))/(ma2*ca2);
                        tampilan1.setText ( "Tsetimbang = ((Q -(m Kl- m ces Ta))/(m cair) " );
                        tampilan2.setText ( " Tsetimbang = " + df.format ( Tset2 ) + "derC" );
                    } else if (Tset2 <0){
                        Tset2 = (Q2 + ma2*ces2*Ta2);
                        if (Tset2 > 0){

                        // kalor pas untuk melebur
                            tampilan1.setText ( "karena Q - (m Ces T1 + m Kl) < 0 dan (Q - (m ces T1) > 0 maka tepat kondisi melebur  " );
                            tampilan2.setText ( " Tsetimbang = 0 der C "  );
                        } else if (Tset2 < 0){
                            //tetap es
                            Tset2 = (Q2 + ma2*ces2*Ta2)/(ma2 *ces2);
                            tampilan1.setText ( "Tsetimbang = (Q + m ces T1)/(m*ces) " );
                        tampilan2.setText ( " Tsetimbang = " + df.format ( Tset2 ) + "derC" );

                        }}} }}
        );

        btndT.setOnClickListener ( new View.OnClickListener ( ) {
            // hukum Black menentukan suhu akhir campuran
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );

               dT2 = Q2/(ma2*ca2);
                            tampilan1.setText ( " delta T = Q /(m c) " );
                            tampilan2.setText ( " dT = " + df.format ( dT2 ) + "C der" );

                        }}
        );
        btnma.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
               if
                    ( !mb.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !cb.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Tb.getText ( ).toString ( ).equals ( "" )) {
                        mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                        Tb2= Double.parseDouble ( Tb.getText ( ).toString ( ) );
                    if (Ta2 > Tset2){
                    tampilan1.setText ( " ma = mb cb (Tsetimbang - Tb)/(ca (Ta - Tsetimbang)" );
                    ma2 = mb2*cb2*(Tset2 -Tb2)/(ca2*(Ta2 - Tset2));
                    tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );
                    } else if ( Ta2 < Tset2) {
                        tampilan1.setText ( " ma = mb cb ( Tb - Tsetimbang)/(ca (Tsetimbang - Ta)" );
                        ma2 = mb2 * cb2 * (Tb2 - Tset2) / (ca2 * (Tset2 - Ta2));
                        tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );

                    } } else if
                    ( !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                       Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                         ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                          Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );
                         Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                    tampilan1.setText ( " m = Q /  c (Tset - Tawal)" );
                    ma2 = Q2/ (ca2*(Tset2 - Ta2));
                    tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );
                }
                else if
                    ( !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !dT.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        dT2 = Double.parseDouble ( dT.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( " m = Q /  c dT" );
                    ma2 = Q2/ (ca2*dT2);
                    tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );
                }else if
                    ( !Kl.getText ( ).toString ( ).equals ( "" ) &&
                       !Q.getText ( ).toString ( ).equals ( "" )) {
                        Kl2 = Double.parseDouble ( Kl.getText ( ).toString ( ) );
                        Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( " m = Q /Kl" );
                    ma2 = Q2 / Kl2;
                    tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );
                }   else if
                    ( !Ku.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        Ku2 = Double.parseDouble ( Kl.getText ( ).toString ( ) );
                        Q2 = Double.parseDouble ( Q.getText ( ).toString ( ) );
                    tampilan1.setText ( " m = Q /Ku" );
                    ma2 = Q2 / Ku2;
                    tampilan2.setText ( " ma = " + df.format ( ma2 ) + "kg" );
                }}}
        );
        btnca.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                dT2 = Double.parseDouble ( dT.getText ( ).toString ( ) );
                mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                Tb2 = Double.parseDouble ( Tb.getText ( ).toString ( ) );
                Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                Q2 = Double.parseDouble(Q.getText().toString ());

                if
                    ( !mb.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !cb.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Tb.getText ( ).toString ( ).equals ( "" )) {
                        mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                        Tb2= Double.parseDouble ( Tb.getText ( ).toString ( ) );
                   if (Ta2 > Tset2)  {

                    tampilan1.setText ( " Percampuran benda A dan benda B" );
                    tampilan2.setText ( " ca = mb cb (Tsetimbang - Tb)/(ma (Ta - Tsetimbang)" );
                    ca2 = mb2*cb2*(Tset2 - Tb2)/(ma2*(Ta2 - Tset2));
                    tampilan3.setText ( " ca = " + df.format ( ca2 ) + "j/kgC" );
                } else if (Ta2 > Tset2) {
                       tampilan1.setText ( " ca = mb cb ( Tb - Tsetimbang)/(ma (Tsetimbang - Ta)" );
                       ca2 = mb2 * cb2 * (Tb2 - Tset2) / (ma2 * (Tset2 - Ta2));
                       tampilan2.setText ( " ca = " + df.format ( ca2 ) + "j/kgC" );
                   }
                } else if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                        Q2= Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( " Benda A diberi kalor Q untuk menentukan kalor jenis benda A, ca" );
                    tampilan2.setText ( " ca = Q /  ma (Tset - Tawal)" );
                    ca2 = Q2/ (ca2*(Tset2 - Ta2));
                    tampilan3.setText ( " ca = " + df.format ( ca2 ) + "j/kgC" );
                }
                else if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !dT.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        dT2 = Double.parseDouble ( dT.getText ( ).toString ( ) );
                        Q2= Double.parseDouble ( Q.getText ( ).toString ( ) );
                    tampilan1.setText ( " Benda A diberi kalor Q untuk menentukan kalor jenis benda A, ca" );
                    tampilan2.setText ( " ca = Q /  ma dT" );
                    ca2 = Q2/ (ma2*dT2);
                    tampilan3.setText ( " ca = " + df.format ( ca2 ) + "j/kgC" );

                }}}
        );
        btnmb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
            if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !cb.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Tb.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                        Tb2= Double.parseDouble ( Tb.getText ( ).toString ( ) );
                    if ( Ta2 < Tset2){
                    tampilan1.setText ( " mb = ma ca (Tsetimbang - Ta)/(cb (Tb - Tsetimbang)" );
                    mb2 = ma2*ca2*(Tset2 -Ta2)/(cb2*(Tb2 - Tset2));
                    tampilan2.setText ( " mb = " + df.format ( mb2 ) + "kg" );
                 } else if ( Ta2 > Tset2) {
                        tampilan1.setText ( " mb = ma ca ( Ta - Tsetimbang)/(cb (Tsetimbang - Tb)" );
                        mb2 = ma2 * ca2 * (Ta2 - Tset2) / (cb2 * (Tset2 - Tb2));
                        tampilan2.setText ( " mb = " + df.format ( mb2 ) + "kg" );


                    }}}}
        );
        btncb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !mb.getText ( ).toString ( ).equals ( "" ) &&
                            !ca.getText ( ).toString ( ).equals ( "" ) &&
                            !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !Ta.getText ( ).toString ( ).equals ( "" ) &&
                            !Tset.getText ( ).toString ( ).equals ( "" ) &&
                            !Tb.getText ( ).toString ( ).equals ( "" )) {
                        mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                        ma2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                        Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                        Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );
                        Tb2= Double.parseDouble ( Tb.getText ( ).toString ( ) );
                        if (Ta2 < Tset2)  {

                    tampilan1.setText ( " cb = ma ca (Tsetimbang - Ta)/(mb (Tb - Tsetimbang)" );
                    cb2 = ma2*ca2*(Tset2 -Ta2)/(mb2*(Tb2 - Tset2));
                    tampilan2.setText ( " cb = " + df.format ( cb2 ) + "J/kgC" );
                } else if ( Ta2 > Tset2) {
                            tampilan1.setText ( " cb = ma ca ( Ta - Tsetimbang)/(mb (Tsetimbang - Tb)" );
                            cb2 = ma2 * ca2 * (Ta2 - Tset2) / (mb2 * (Tset2 - Tb2));
                            tampilan2.setText ( " cb = " + df.format ( cb2 ) + "J/kgC" );
                        }

                } }}
        );
        btnKl.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        Q2= Double.parseDouble ( Q.getText ( ).toString ( ) );
                    tampilan1.setText ( " Kl = Q/ m" );
                    Kl2 = Q2/ma2;
                    tampilan2.setText ( " Kl = " + df.format ( Kl2 ) + "J/kg" );
                }}}
        );
        btnKu.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        Q2= Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( " Ku = Q/ m" );
                    Ku2 = Q2/ma2;
                    tampilan2.setText ( " Ku = " + df.format ( Ku2 ) + "J/kg" );
                }}}
        );
        btnTa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                Tb2 = Double.parseDouble ( Tb.getText ( ).toString ( ) );
                Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );


                    tampilan1.setText ( " Ta = (Takhir(ma * ca + mb*cb) - mb * cb * Tb))/(ma*ca)" );
                    Ta2 = (Tset2 *(ma2 * ca2 + mb2 * cb2) - (mb2 * cb2 * Tb2))/(ma2 * ca2);
                    tampilan2.setText ( " Ta = " + df.format ( Ta2 ) + "derC" );

                }}
        );
        btnTb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                ma2 = Double.parseDouble ( ma.getText ( ).toString ( ) );
                ca2 = Double.parseDouble ( ca.getText ( ).toString ( ) );
                dT2 = Double.parseDouble ( dT.getText ( ).toString ( ) );
                mb2 = Double.parseDouble ( mb.getText ( ).toString ( ) );
                cb2 = Double.parseDouble ( cb.getText ( ).toString ( ) );
                Ta2 = Double.parseDouble ( Ta.getText ( ).toString ( ) );
                Tset2 = Double.parseDouble ( Tset.getText ( ).toString ( ) );

                    tampilan1.setText ( " Tb = (Takhir(ma * ca + mb*cb) - ma * ca * Ta))/(mb*cb)" );
                    Tb2 = (Tset2 *(ma2 * ca2 + mb2 * cb2) - (ma2 * ca2 * Ta2))/(mb2 * cb2);
                    tampilan2.setText ( " Ta = " + df.format ( Tb2 ) + "derC" );

                }}
        );
        btnPindah.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kalori.this, PindahPanas.class);
                startActivity(intent);
            }
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
                ma.setText ( "" );
                mb.setText ( "" );
                ca.setText ( "" );
                cb.setText ( "" );
                ces.setText ( "" );
                Ta.setText ( "" );
                Tb.setText ( "" );
                Tset.setText ( "" );
                Kl.setText ( "" );
                Ku.setText ( "" );
                dT.setText ( "" );
                Q.setText ( "" );
            }
        } );
    }
}