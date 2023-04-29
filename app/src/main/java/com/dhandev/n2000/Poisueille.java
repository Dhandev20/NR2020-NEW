
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Poisueille extends AppCompatActivity {
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

    private EditText D, H, Q, g, e,ro,p,L;
    private Double DD, HH, QQ, gg, ee,roro,pp,LL, pi, rr;


    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_poisueille );

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
        D = findViewById ( R.id.in_D );
        ro = findViewById ( R.id.in_ro );
        H = findViewById ( R.id.in_H );
        Q = findViewById ( R.id.in_Q );
        e = findViewById ( R.id.in_e );
        g = findViewById ( R.id.in_g );
        p = findViewById ( R.id.in_P );
        L = findViewById ( R.id.in_L );

        Button btnQ = findViewById ( R.id.btnQ );
        Button btnD = findViewById ( R.id.btnD );
        Button btnH = findViewById ( R.id.btnH );
        Button btne = findViewById ( R.id.btn_e );
        Button btnp = findViewById ( R.id.btnP );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info);


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Hukum Poiseuille" );
                tampilan2.setText ( "Kalkulator ini digunakan menghitung aliran fluida kental/viskus" );
                tampilan3.setText ( "1. Menentukan debit" );
                tampilan4.setText ( "2. Menentukan diameter pipa" );
                tampilan5.setText ( "3. Menentukan tekanan " );
                tampilan6.setText ( "4. Menetukan viskositas" );
                tampilan7.setText ( "5. Menentukan beda ketinggian ujung-ujung pipa" );
                tampilan8.setText ( " " );
                tampilan9.setText ( "Selamat belajar" );

            }} );

        btnQ.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
                                          DecimalFormat df = new DecimalFormat ( "#.#####" );

                                          if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !p.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = DD/2;
                                              rr = rr*0.0254;
                                              QQ = ((pp-roro*gg*HH)*pi*Math.pow(rr,4))/(8*LL*ee);
                                              tampilan1.setText ( " Kasus 1: Mengalirkan fluida ke tempat yang lebih tinggi " );
                                              tampilan2.setText ( " Q = p pi r^4/(8 e L)= (p - ro g H) pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " (p - ro g H): tekanan yang diberikan melawan tekanan hidrostatik " );
                                              tampilan4.setText ( " e =  viskositas " );
                                              tampilan6.setText ( "Debit = " + df.format ( QQ ) + "m3/s");
                                                QQ = 3600*QQ;
                                              tampilan7.setText ( "Debit = " + df.format ( QQ ) + "m3/jam");

                                              tampilan9.setText ( " Kasus 2: Mengalirkan fluida ke tempat yang lebih rendah " );
                                              QQ = ((pp+roro*gg*HH)*pi*Math.pow(rr,4))/(8*LL*ee);
                                              tampilan10.setText ( " Q = p pi r^4/(8 e L)= (p + ro g H) pi r^4 /(8 e L) " );
                                              tampilan11.setText ( " (p + ro g H): tekanan yang diberikan menambah tekanan hidrostatik " );
                                              tampilan12.setText ( " e =  viskositas " );
                                              tampilan14.setText ( "Debit = " + df.format ( QQ ) + "m3/s");
                                              QQ = 1000*QQ;
                                              tampilan15.setText ( "Debit = " + df.format ( QQ ) + "liter/s");
                                              QQ = QQ*3600;
                                              tampilan16.setText ( "Debit = " + df.format ( QQ ) + "liter/jam");



                                          } else  if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = DD/2;
                                              rr = rr*0.0254;
                                              QQ = (roro*gg*HH*pi*Math.pow(rr,4))/(8*LL*ee);
                                              tampilan1.setText ( " Q = P pi r^4/(8 e L)= ro g H pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " e =  viskositas " );
                                              tampilan4.setText ( "Debit = " + df.format ( QQ ) + "m3/s");
                                              QQ = 1000*QQ;
                                              tampilan6.setText ( "Debit = " + df.format ( QQ ) + "liter/s");
                                              QQ = 3600*QQ;
                                              tampilan6.setText ( "Debit = " + df.format ( QQ ) + "liter/jam");


                                          } else  if  ( !p.getText ( ).toString ( ).equals ( "" ) &&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = DD/2;
                                              rr = rr*0.0254;
                                              QQ = (pp*pi*Math.pow(rr,4))/(8*LL*ee);
                                              tampilan1.setText ( " Q = P pi r^4/(8 e L) " );
                                              tampilan3.setText ( " e =  viskositas " );
                                              tampilan4.setText ( "Debit = " + df.format ( QQ ) + "m3/s");
                                              QQ = 1000*QQ;
                                              tampilan6.setText ( "Debit = " + df.format ( QQ ) + "liter/s");
                                              QQ = 3600*QQ;
                                              tampilan7.setText ( "Debit = " + df.format ( QQ ) + "liter/jam");
                                          }
                                      }
                                  }
        );

        btnD.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
                                          DecimalFormat df = new DecimalFormat ( "#.#####" );

                                          if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !p.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                                QQ = QQ/1000;
                                              rr = 8*ee*LL*QQ/((pp - roro*gg*HH)*pi);
                                              rr = Math.pow(rr,0.25);
                                              DD = 2*rr;
                                              tampilan1.setText ( " Kasus 1: Mengalirkan fluida ke tempat yang lebih tinggi " );
                                              tampilan2.setText ( " Q = p pi r^4/(e L)= (p - ro g H) pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " (p - ro g H): tekanan yang diberikan melawan tekanan hidrostatik " );
                                              tampilan4.setText ( " r = (8 e L Q/(p - ro gh)pi )^0,25" );
                                              tampilan6.setText ( "Diameter pipa = " + df.format ( DD ) + "m");
                                              DD = DD/0.0254;
                                              tampilan7.setText ( "Diameter pipa = " + df.format ( DD ) + "inci");

                                              tampilan9.setText ( " Kasus 2: Mengalirkan fluida ke tempat yang lebih rendah " );
                                              rr = 8*ee*LL*QQ/((pp + roro*gg*HH)*pi);
                                              rr = Math.pow(rr,0.25);
                                              DD = 2*rr;
                                              tampilan11.setText ( " Q = p pi r^4/(e L)= (p + ro g H) pi r^4 /(8 e L) " );
                                              tampilan12.setText ( " (p - ro g H): tekanan yang diberikan melawan tekanan hidrostatik " );
                                              tampilan13.setText ( " r = (8 e L Q/(p - ro gh)pi )^0,25" );
                                              tampilan15.setText ( "Diameter pipa = " + df.format ( DD ) + "m");
                                              DD = DD/0.0254;
                                              tampilan16.setText ( "Diameter pipa = " + df.format ( DD ) + "inci");

                                          } else  if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = 8*ee*LL*QQ/((roro*gg*HH)*pi);
                                              rr = Math.pow(rr,0.25);
                                              DD = 2*rr;
                                              QQ = QQ/1000;
                                              tampilan1.setText ( " Q = P pi r^4/(e L)= ro g H pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " r = (8 e L Q/(ro g h)pi )^0,25" );
                                              tampilan4.setText ( "Diameter pipa = " + df.format ( DD ) + "m");
                                              DD = DD/0.0254;
                                              tampilan6.setText ( "Diameter pipa = " + df.format ( DD ) + "inci");

                                          } else  if  ( !p.getText ( ).toString ( ).equals ( "" ) &&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = 8*ee*LL*QQ/((pp)*pi);
                                              rr = Math.pow(rr,0.25);
                                              DD = 2*rr;
                                              QQ = QQ/1000;
                                              tampilan1.setText ( " Q = P pi r^4/(e L)= " );
                                              tampilan2.setText ( " r = (8 e L Q/p pi )^0,25" );
                                              tampilan4.setText ( "Diameter pipa = " + df.format ( DD ) + "m");
                                              DD = DD/0.0254;
                                              tampilan6.setText ( "Diameter pipa = " + df.format ( DD ) + "inci");
                                          }
                                      }
                                  }
        );


        btnp.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
                                          DecimalFormat df = new DecimalFormat ( "#.#####" );

                                          if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                                rr = DD/2;
                                                rr = rr*0.0254;
                                              QQ = QQ/1000;
                                              pp = (8*ee*LL*QQ/ pi*Math.pow(rr,4)) + (roro*gg*HH);

                                              tampilan1.setText ( " Kasus 1: Mengalirkan fluida ke tempat yang lebih tinggi " );
                                              tampilan2.setText ( " Q = p pi r^4/(e L)= (p - ro g H) pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " (p - ro g H)= 8 e L Q/ pi r^4 " );
                                              tampilan4.setText ( " p = (8 e L Q/pi r^4 ) - ro g H" );
                                              tampilan6.setText ( "Tekanan = " + df.format ( pp ) + "Pa");
                                              pp= pp/101325;
                                              tampilan7.setText ( "Tekanan = " + df.format ( DD ) + "atm");

                                              tampilan9.setText ( " Kasus 2: Mengalirkan fluida ke tempat yang lebih rendah " );
                                              pp = (8*ee*LL*QQ/ pi*Math.pow(rr,4)) - (roro*gg*HH);


                                              tampilan11.setText ( " Q = p pi r^4/(e L)= (p + ro g H) pi r^4 /(8 e L) " );
                                              tampilan12.setText ( " (p + ro g H)= 8 e L Q/ pi r^4 " );
                                              tampilan13.setText ( " p = (8 e L Q/pi r^4 ) - ro g H" );
                                              tampilan15.setText ( "Tekanan = " + df.format ( pp ) + "Pa");
                                              pp= pp/101325;
                                              tampilan16.setText ( "Tekanan = " + df.format ( pp ) + "atm");



                                          } else  if  ( !D.getText ( ).toString ( ).equals ( "" ) &&
                                                  !e.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              rr = DD/2;
                                              rr = rr*0.0254;
                                              QQ = QQ/1000;
                                              pp = 8*ee*LL*QQ/(pi*Math.pow(rr,4));

                                              tampilan1.setText ( " Q = P pi r^4/(e L)= " );
                                              tampilan2.setText ( " p = (8 e L Q / pi r^4 )" );
                                              tampilan4.setText ( "Tekanan = " + df.format ( pp ) + "Pa");
                                              pp= pp/101325;
                                              tampilan5.setText ( "Tekanan = " + df.format ( pp ) + "atm");

                                          }
                                      }
                                  }
        );

        btne.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
                                          DecimalFormat df = new DecimalFormat ( "#.#####" );

                                          if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !p.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                              QQ = QQ/1000;
                                              rr = DD/2;
                                              rr = rr*0.0254;
                                              ee = ((pp - roro*gg*HH)*pi*Math.pow(rr,4))/(8*LL*QQ);

                                              tampilan1.setText ( " Kasus 1: Mengalirkan fluida ke tempat yang lebih tinggi " );
                                              tampilan2.setText ( " Q = p pi r^4/(e L)= (p - ro g H) pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " (p - ro g H): tekanan yang diberikan melawan tekanan hidrostatik " );
                                              tampilan4.setText ( " e = (p - ro gh)pi r^4/8LQ" );
                                              tampilan6.setText ( "Viskositas = " + df.format ( ee ) + "poise");


                                              tampilan9.setText ( " Kasus 2: Mengalirkan fluida ke tempat yang lebih rendah " );
                                              ee = ((pp + roro*gg*HH)*pi*Math.pow(rr,4))/(8*LL*QQ);

                                              tampilan11.setText ( " Kasus 1: Mengalirkan fluida ke tempat yang lebih tinggi " );
                                              tampilan12.setText ( " Q = p pi r^4/(e L)= (p + ro g H) pi r^4 /(8 e L) " );
                                              tampilan13.setText ( " (p - ro g H): tekanan yang diberikan melawan tekanan hidrostatik " );
                                              tampilan14.setText ( " e = (p + ro gh)pi r^4/(8 L Q)" );
                                              tampilan15.setText ( "Viskositas = " + df.format ( ee ) + "poise");

                                          } else  if  ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                                  !g.getText ( ).toString ( ).equals ( "" ) &&
                                                  !H.getText ( ).toString ( ).equals ( "" )&&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                              HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                             rr = DD/2;
                                             rr = rr * 0.0254;
                                              QQ = QQ/1000;
                                              ee = roro * gg* HH*Math.pow(rr,4)/(8*LL*QQ);
                                              tampilan1.setText ( " Q = P pi r^4/(e L)= ro g H pi r^4 /(8 e L) " );
                                              tampilan3.setText ( " e = (ro g h)pi r^4 /(8 LQ)" );
                                              tampilan4.setText ( "Viskositas = " + df.format ( ee ) + "poise");


                                          } else  if  ( !p.getText ( ).toString ( ).equals ( "" ) &&
                                                  !D.getText ( ).toString ( ).equals ( "" )&&
                                                  !Q.getText ( ).toString ( ).equals ( "" )&&
                                                  !L.getText ( ).toString ( ).equals ( "" )) {
                                              pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                                              DD = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              QQ = Double.parseDouble ( D.getText ( ).toString ( ) );
                                              LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                              pi = 3.1415926536;
                                             rr = DD/2;
                                             rr = rr*0.0254;
                                              QQ = QQ/1000;

                                              ee = pp*pi*Math.pow(rr,4)/(8*QQ*LL);
                                              tampilan1.setText ( " Q = P pi r^4/(8 e L) " );
                                              tampilan2.setText ( " e = p pi r^4 / (8 QL)" );
                                              tampilan4.setText ( "Viskositas= " + df.format ( ee ) + "poise");

                                          }
                                      }
                                  }
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
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                tampilan16.setText ( "" );
                g.setText ( "" );
                D.setText ( "" );
                H.setText ( "" );
                e.setText ( "" );
                L.setText ( "" );
                p.setText ( "" );
                Q.setText ( "" );
                ro.setText ( "" );

            }
        } );
    }
}
