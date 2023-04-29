
package com.dhandev.n2000;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.text.DecimalFormat;

public class TermoMeter extends AppCompatActivity {
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

    private EditText cel, rea, fah, kel, tes, td, tx;
    private Double celcel, rearea, fahfah, kelkel, testes, tdtd, txtx;
    private Double suhu1, suhu2, suhu3, suhu4;

    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_termo_meter );

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

        cel = findViewById ( R.id.in_Celsius );
        rea = findViewById ( R.id.in_Reamur );
        fah = findViewById ( R.id.in_Fahrenheit );
        kel = findViewById ( R.id.in_Kelvin );
        tes = findViewById ( R.id.in_Tlebur );
        td = findViewById ( R.id.in_Didih );
        tx = findViewById ( R.id.in_TX );
        Button btnc = findViewById ( R.id.btnC );
        Button btnr = findViewById ( R.id.btnR );
        Button btnf = findViewById ( R.id.btnF );
        Button btnk = findViewById ( R.id.btnK );
        Button btnx = findViewById ( R.id.btnX );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info);


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Termometer" );
                tampilan2.setText ( "Kalkulator ini digunakan menghitung konversi skala termometer" );
                tampilan3.setText ( "1. Skala Celsius ke skala Reamur, fahrenheit, dan Kelvin" );
                tampilan4.setText ( "2. Skala Reamur ke skala Celsius, Fahrenheit, dan Kelvin" );
                tampilan5.setText ( "3. Skala Fahrenheit ke skala Celsius, Reamur, dan Kelvin " );
                tampilan6.setText ( "4. Skala Kelvin ke skala Celsius, Reamur, dan Fahrenheit" );
                tampilan7.setText ( "6. Skala umum X, ke skala Celsius, Kelvin, Reamur dan Fahrenheit" );
                tampilan8.setText ( " " );
                tampilan9.setText ( "Selamat belajar" );

            }} );

        btnc.setOnClickListener ( new View.OnClickListener ( ) {
          @Override
           public void onClick ( View view ) {
           DecimalFormat df = new DecimalFormat ( "#.##" );

              if (
                      !rea.getText ( ).toString ( ).equals ( "" )) {
                  rearea = Double.parseDouble ( rea.getText ( ).toString ( ) );

                  suhu1 = 1.25 * rearea;
                  tampilan1.setText ( " Konversi skala Reamur ke skala Celsius " );
                  tampilan3.setText ( " TC =  5/4 * TR " );
                  tampilan4.setText ( (rearea) + "der R  = " + df.format ( suhu1 ) + " der C" );

              } else if (
                      !fah.getText ( ).toString ( ).equals ( "" )) {
                  fahfah = Double.parseDouble ( fah.getText ( ).toString ( ) );
                  suhu2 = (fahfah - 32) * 5 / 9;
                  tampilan1.setText ( " Konversi skala Fahrenheit ke skala Celsius " );
                  tampilan3.setText ( " TC = (TF - 32) * 5/9 " );
                  tampilan4.setText ( (fahfah) + "derF = " + df.format ( suhu2 ) + "derC" );
              } else if
              (!kel.getText ( ).toString ( ).equals ( "" )) {
                  kelkel = Double.parseDouble ( kel.getText ( ).toString ( ) );

                  suhu3 = kelkel - 273;
                  tampilan1.setText ( " Konversi skala Kelvin ke skala Celsius " );
                  tampilan3.setText ( " TC =  K - 273 " );
                  tampilan4.setText ( (kelkel) + "K = " + df.format ( suhu3 ) + "derC" );
              } else if
              (!tx.getText ( ).toString ( ).equals ( "" )&&
              !tes.getText ( ).toString ( ).equals ( ""  ) &&
               !td.getText ( ).toString ( ).equals ( "" )){
                  testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                  tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                  txtx = Double.parseDouble ( tx.getText ( ).toString ( ) );

                  suhu4 = (txtx - testes) * 100 / (tdtd - testes);
                  tampilan1.setText ( " Konversi skala X ke skala Celsius)" );
                  tampilan3.setText ( " TC = (TX - Tes)*100/(Td - Tes)" );
                  tampilan4.setText ( (txtx) + "derX = " + df.format ( suhu4 ) + "derC" );
              }
              }
           }
        );

        btnr.setOnClickListener ( new View.OnClickListener ( ) {
          @Override
          public void onClick ( View view ) {
          DecimalFormat df = new DecimalFormat ( "#.##" );


              if (
                   !cel.getText ( ).toString ( ).equals ( "" )) {
                  celcel = Double.parseDouble ( cel.getText ( ).toString ( ) );

                  suhu1 = 0.8 * celcel;
                  tampilan1.setText ( " Konversi skala Celsius ke skala Reamur" );
                  tampilan3.setText ( " TR =  4/5 * TC " );
                  tampilan4.setText ( +celcel + "derC  = " + df.format ( suhu1 ) + "derR" );
              } else if (
                      !fah.getText ( ).toString ( ).equals ( "" )) {
                  fahfah = Double.parseDouble ( fah.getText ( ).toString ( ) );
                  suhu2 = (fahfah - 32) * 4 / 9;
                  tampilan1.setText ( " Konversi skala Fahrenheit ke skala Reamur" );
                  tampilan3.setText ( " TR =  (TF - 32) * 4/9 " );
                  tampilan4.setText ( +fahfah + "derF = " + df.format ( suhu2 ) + "derR" );

              } else if (
                      !kel.getText ( ).toString ( ).equals ( "" )) {
                  kelkel = Double.parseDouble ( kel.getText ( ).toString ( ) );
                  suhu3 = (kelkel - 273) * 4 / 5;
                  tampilan1.setText ( " Konversi skala Kelvin ke skala Reamur" );
                  tampilan3.setText ( " TR =  (TK - 273) * 4/5 " );
                  tampilan4.setText ( +kelkel + "K = " + df.format ( suhu3 ) + "derR" );

              } else if (
                      !tx.getText ( ).toString ( ).equals ( "" ) &&
                     !tes.getText ( ).toString ( ).equals ( ""  ) &&
                     !td.getText ( ).toString ( ).equals ( "" )){
                  testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                  tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                  txtx = Double.parseDouble ( tx.getText ( ).toString ( ) );

                  suhu4 = (txtx - testes) * 80 / (tdtd - testes);
                  tampilan1.setText ( " Konversi skala X  ke skala Reamur" );
                  tampilan3.setText ( " TR = (TX - tes)*80/(Td - Tes) " );
                  tampilan4.setText (  +txtx+"derX = " + df.format ( suhu4 ) + "derR" );
          }}}
        );
    btnf.setOnClickListener ( new View.OnClickListener ( ) {
        @Override
        public void onClick ( View view ) {
        DecimalFormat df = new DecimalFormat ( "#.##" );

            if (
                    !cel.getText ( ).toString ( ).equals ( "" )) {
                celcel = Double.parseDouble ( cel.getText ( ).toString ( ) );

                suhu1 = 0.8 * celcel;
                tampilan1.setText ( " Konversi skala Celsius ke skala Fahrenheit" );
                suhu1 = celcel * 9 / 5 + 32;
                tampilan3.setText ( " TF =  9/5 * TC  + 32 " );
                tampilan4.setText ( +celcel + "derC = " + df.format ( suhu1 ) + "derF" );


            }else if (
                       !rea.getText ( ).toString ( ).equals ( "" )) {
                       rearea = Double.parseDouble ( rea.getText ( ).toString ( ) );

                    suhu2 = rearea * 9 / 4 + 32;
                tampilan1.setText ( " Konversi skala Reamur ke skala Fahrenheit" );
                tampilan3.setText ( " TF =  (TR * 9/4) + 32 " );
                tampilan4.setText ( +rearea + "derR = " + df.format ( suhu2 ) + "derF" );


            } else if (
                 !kel.getText ( ).toString ( ).equals ( "" )) {
                kelkel = Double.parseDouble ( kel.getText ( ).toString ( ) );

                suhu3 = (kelkel - 273)*9/5 +32;

                tampilan1.setText ( " Konversi skala Kelvin ke skala Fahrenheit" );
                tampilan3.setText ( " TF =  ((TK - 273) * 9/5) + 32 " );
                tampilan4.setText ( +kelkel + "K = " + df.format ( suhu3 ) + "derF" );

            } else  if (
                    !tx.getText ( ).toString ( ).equals ( "" )&&
                   !tes.getText ( ).toString ( ).equals ( "" )&&
                    !td.getText ( ).toString ( ).equals ( "" )) {
                txtx = Double.parseDouble ( tx.getText ( ).toString ( ) );
                testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );

                suhu4 = ((txtx - testes) * 180 / (tdtd - testes)) + 32;
                tampilan1.setText ( " Konversi skala X ke skala Fahrenheit" );
                tampilan3.setText ( " TF = (TX-tes)*180/(Td-Tes)+32 " );
                tampilan4.setText ( + txtx + "derX = "+ df.format ( suhu4 ) + "derF" );
            }}
    }
        );
   btnk.setOnClickListener ( new View.OnClickListener ( ) {
        @Override
        public void onClick ( View view ) {
        DecimalFormat df = new DecimalFormat ( "#.##" );

            if (
                !cel.getText ( ).toString ( ).equals ( "" )) {
                celcel = Double.parseDouble ( cel.getText ( ).toString ( ) );

                suhu4 = celcel + 273;
                tampilan1.setText ( " Konversi skala Celsiuske skala Kelvin" );
                tampilan3.setText ( " TK =   TC + 273 " );
                tampilan4.setText ( +celcel + "derC = " + df.format ( suhu4 ) + "K" );

            } else    if (
                        !rea.getText ( ).toString ( ).equals ( "" )) {
                    rearea = Double.parseDouble ( rea.getText ( ).toString ( ) );

                suhu2 = (rearea * 5/4) + 273 ;

                tampilan1.setText ( " Konversi skala Reamur skala Kelvin" );
                tampilan3.setText ( " TK = ( TR * 5/4) + 273 " );
                tampilan4.setText ( +rearea+"derR = "+ df.format ( suhu2 ) + "K" );

            } else    if (
                 !fah.getText ( ).toString ( ).equals ( "" )) {
                fahfah = Double.parseDouble ( fah.getText ( ).toString ( ) );

                suhu3 = ((fahfah - 32) * 5/9 ) + 273 ;

                tampilan1.setText ( " Konversi skala Fahrenheit ke skala Kelvin" );
                tampilan3.setText ( " TK =  (TF - 32) * 5/9 + 273 " );
                tampilan4.setText ( +fahfah+"derF = "+ df.format ( suhu3 ) + "K" );

            } else    if (
                !tx.getText ( ).toString ( ).equals ( "" )&&
               !tes.getText ( ).toString ( ).equals ( ""  ) &&
                !td.getText ( ).toString ( ).equals ( "" )){

                testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                txtx = Double.parseDouble ( tx.getText ( ).toString ( ) );

                suhu4 = ((txtx - testes) * 100 / (tdtd - testes)) + 273;

                tampilan1.setText ( " Konversi skala X ke skala Kelvin" );
                tampilan3.setText ( " TK = (TX-Tes)*100/(Td-Tes)+273 K" );
                tampilan4.setText ( +txtx + "derX = " + df.format ( suhu4 ) + "K" );

            }}
        } );
        btnx.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if (
                    !cel.getText ( ).toString ( ).equals ( "" )&&
                    !tes.getText ( ).toString ( ).equals ( ""  ) &&
                     !td.getText ( ).toString ( ).equals ( "" )){
                    celcel = Double.parseDouble ( cel.getText ( ).toString ( ) );
                    testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                    tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );


                    suhu1 = (celcel * (tdtd - testes) / 100) + testes;

                    tampilan1.setText ( " Konversi skala Celsius ke skala X" );
                    tampilan3.setText ( " TX = TC *(Td-Tes)/100  + Tes " );
                    tampilan4.setText ( +celcel + "derC = " + df.format ( suhu1 ) + "derX" );


                } else if
                   ( !rea.getText ( ).toString ( ).equals ( "" ) &&
                    !tes.getText ( ).toString ( ).equals ( ""  ) &&
                        !td.getText ( ).toString ( ).equals ( "" )){

                    testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                      tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                    rearea = Double.parseDouble ( cel.getText ( ).toString ( ) );

                        tampilan1.setText ( " Konversi skala Reamur ke skala X" );
                        suhu2 = (rearea * (tdtd-testes)/80)  + testes ;

                        tampilan3.setText ( " TX = TR*(Td-Tes)/80  + Tes  " );
                        tampilan4.setText (  +rearea+"derR = "+ df.format ( suhu2 ) + "derX" );


                } else    if (
                        !fah.getText ( ).toString ( ).equals ( "" )&&
                        !tes.getText ( ).toString ( ).equals ( ""  ) &&
                         !td.getText ( ).toString ( ).equals ( "" )){

                    testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                    tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                    fahfah = Double.parseDouble ( fah.getText ( ).toString ( ) );

                    suhu3 = ((fahfah - 32) * (tdtd-testes)/180 ) + testes ;

                    tampilan1.setText ( " Konversi skala Fahrenheit ke skala X" );
                    tampilan3.setText ( " TX = (TF-32)*(Td-Tes)/180 +Tes  " );
                    tampilan4.setText (+fahfah+"derF = " + df.format ( suhu3 ) + "derX" );


                } else    if (
                        !kel.getText ( ).toString ( ).equals ( "" ) &&
                        !tes.getText ( ).toString ( ).equals ( ""  ) &&
                         !td.getText ( ).toString ( ).equals ( "" )){
                    testes = Double.parseDouble ( tes.getText ( ).toString ( ) );
                    tdtd = Double.parseDouble ( td.getText ( ).toString ( ) );
                    kelkel = Double.parseDouble ( kel.getText ( ).toString ( ) );

                    suhu4 = ((txtx - testes) * 100 / (tdtd - testes)) + 273;

                    tampilan1.setText ( " Konversi skala X ke skala Kelvin" );
                    tampilan3.setText ( " TX = (TK-273)*(Td-Tes)/100  +273   " );
                    tampilan4.setText ( +kelkel + "K = " + df.format ( suhu4 ) + "derX" );

                }
            }}
        );

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
    cel.setText ( "" );
    rea.setText ( "" );
    fah.setText ( "" );
    kel.setText ( "" );
    tes.setText ( "" );
    td.setText ( "" );
    tx.setText ( "" );
        }
        } );
        }
        }
