package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class GerakLurus extends AppCompatActivity {
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
    private EditText so, st, t, vo, vt, a;
private double soso, vtvt, stst, vovo, tt,tt2, aa, vo2;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerak_lurus);
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

        so = findViewById(R.id.in_So);
        st = findViewById(R.id.in_St);
        vo = findViewById(R.id.in_Vo);
        vt = findViewById(R.id.in_Vt);
        a = findViewById(R.id.in_a);
        t = findViewById(R.id.in_t );

        Button btns = findViewById ( R.id.btn_St );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnvo = findViewById ( R.id.btn_Vo );
        Button btnvt = findViewById ( R.id.btn_Vt );
        Button btna = findViewById ( R.id.btn_a );
        Button btnglb = findViewById ( R.id.btnglb );
        Button btnclear = findViewById ( R.id.btnclear );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " GLBB : Gerak lurus berubah beraturan; benda bergerak lurus dengan percepatan tetap:" );
                tampilan2.setText ( " Variabel yang digunakan bersifat adaptif dalam arti menyesuaikan persoalan. Contoh: pada kasus jatuh bebas, maka g = a, h = St" );
                tampilan3.setText ( " Variabel yang digunkan:" );
                tampilan4.setText ( " So : posisi awal" );
                tampilan5.setText ( " St : jarak tempuh saat t" );
                tampilan6.setText ( " Vo : kecepatan awal " );
                tampilan7.setText ( " Vt : kecepatan pada saat t" );
                tampilan8.setText ( " a  : percepatan" );
                tampilan9.setText ( "  t : selang waktu " );
                tampilan10.setText ( "" );
                tampilan11.setText ( "Sebelum menggunakan kalkulator silakan tekan Nol " );
                tampilan12.setText ( "selanjutnya isikan variabel sesuai yang diketahui " );
            }} );
        btna.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                DecimalFormat df = new DecimalFormat("#.#####");

            if    ( !so.getText ( ).toString ( ).equals ( "" ) &&
                    !vo.getText ( ).toString ( ).equals ( "" ) &&
                    !st.getText ( ).toString ( ).equals ( "" ) &&
                    !t. getText ( ).toString ( ).equals ( "" )) {
                soso = Double.parseDouble(so.getText().toString());
                stst = Double.parseDouble(st.getText().toString());
                vovo = Double.parseDouble(vo.getText().toString());
                tt   = Double.parseDouble(t.getText().toString());


                tampilan1.setText ( " St = So + Vo t + 0,5 a t^2,  kalikan 2" );
                tampilan2.setText ( " 2 St = 2 So +  2 Vo t +  a t^2" );
                tampilan3.setText ( "  a = 2 (St - Vo t - So)/ t^2" );
                tampilan4.setText ( " catatan t^2 : t kuadrat" );
                tt2 = Math.pow ( tt , 2 );
                aa = 2*(stst - soso - vovo*tt)/tt2;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );


            }else if (  !so.getText ( ).toString ( ).equals ( "" )   &&
                        !st.getText ( ).toString ( ).equals ( "" )  &&
                        !t. getText ( ).toString ( ).equals ( "" )) {
                  soso = Double.parseDouble(so.getText().toString());
                  stst = Double.parseDouble(st.getText().toString());
                  tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                tampilan2.setText ( " Vo = 0" );
                tampilan3.setText ( " St = So + 0,5 a t^2" );
                tampilan4.setText ( " a = 2 (St - So)/ t^2," );
                tt2 = Math.pow ( tt , 2 );
                aa = 2*(stst - soso)/tt2;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );

            } else
            if   (  !vo.getText ( ).toString ( ).equals ( "" ) &&
                    !st.getText ( ).toString ( ).equals ( "" ) &&
                    !t. getText ( ).toString ( ).equals ( "" )) {

                stst = Double.parseDouble(st.getText().toString());
                vovo = Double.parseDouble(vo.getText().toString());
                tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " St = So + Vo t + 0,5 a t^2;  So = 0" );
                tampilan2.setText ( " So = 0" );
                tampilan3.setText ( " St =  Vo t + 0,5 a t^2" );
                tampilan4.setText ( "  a = 2 (St - Vo t)/ t^2," );
                tt2 = Math.pow ( tt , 2 );
                aa = 2*(stst - vovo*tt)/tt2;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );


            }else if
                 (  !st.getText ( ).toString ( ).equals ( "" )   &&
                    !t. getText ( ).toString ( ).equals ( "" )) {

                     stst = Double.parseDouble(st.getText().toString());
                     tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                tampilan2.setText ( " So = 0;  Vo = 0" );
                tampilan3.setText ( " St = 0,5 a t^2" );
                tampilan4.setText ( "  a = 2 St/ t^2,  " );
                tt2 = Math.pow ( tt , 2 );
                aa = 2*stst /tt2;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );


             } else  if
                         ( !st.getText ( ).toString ( ).equals ( "" ) &&
                           !t.getText ( ).toString ( ).equals ( "" )) {

                          stst = Double.parseDouble(st.getText().toString());
                          tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                tampilan2.setText ( " So = 0, Vo = 0" );
                tampilan3.setText ( " St =  0,5 a t^2" );
                tampilan4.setText ( "  a = 2 St/ t^2" );
                tt2 = Math.pow ( tt , 2 );
                aa = 2 * stst / tt2;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );

             } else  if (  !vo.getText ( ).toString ( ).equals ( "" ) &&
                           !t. getText ( ).toString ( ).equals ( "" )&&
                           !vt.getText ( ).toString ( ).equals ( "" ) ) {

                          vovo = Double.parseDouble(vo.getText().toString());
                          vtvt = Double.parseDouble(vt.getText().toString());
                          tt   = Double.parseDouble(t.getText().toString());
                tampilan1.setText(" Vt = Vo + a t");
                tampilan2.setText("  a =(Vt - Vo)/t");
                aa =(vtvt - vovo)/tt;
                tampilan3.setText("a = " + df.format(aa) + "m/s2");

           } else  if
                         ( !t.getText ( ).toString ( ).equals ( "" )&&
                          !vt.getText ( ).toString ( ).equals ( "" ) ) {

                             vtvt = Double.parseDouble(vt.getText().toString());
                             tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " Vt = Vo + a t" );
                tampilan2.setText ( "      Vo = 0" );
                tampilan3.setText ( " Vt =  a t" );
                tampilan4.setText ( "  a = Vt/t" );
                aa = vtvt / tt;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );

           } else  if
                  ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                    !t.getText ( ).toString ( ).equals ( "" )) {

                      vovo = Double.parseDouble(vo.getText().toString());
                      tt   = Double.parseDouble(t.getText().toString());

                tampilan1.setText ( " Vt = Vo + a t" );
                tampilan2.setText ( "      Vt = 0" );
                tampilan3.setText ( "  0 = Vo + a t" );
                tampilan4.setText ( "  a = -Vo/t" );
                aa = -vovo / tt;
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );

         } else  if
                  (  !vo.getText ( ).toString ( ).equals ( "" ) &&
                     !st.getText ( ).toString ( ).equals ( "" ) &&
                     !vt.getText ( ).toString ( ).equals ( "" ) ) {

                       stst = Double.parseDouble(st.getText().toString());
                       vovo = Double.parseDouble(vo.getText().toString());
                       vtvt = Double.parseDouble(vt.getText().toString());

                tampilan1.setText ( " Vt^2 = Vo^2 + 2a St" );
                tampilan2.setText ( "    a = (Vt^2 - Vo^2)/2 St" );
                vtvt = Math.pow ( vtvt , 2 );
                vovo = Math.pow ( vovo , 2 );
                aa = (vtvt - vovo) / (2 * stst);
                tampilan3.setText ( " a = " + df.format ( aa ) + "m/s2" );

       } else  if
                   (  !st.getText ( ).toString ( ).equals ( "" ) &&
                      !vt.getText ( ).toString ( ).equals ( "" ) ) {

                      stst = Double.parseDouble(st.getText().toString());
                      vtvt = Double.parseDouble(vt.getText().toString());

                tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                tampilan2.setText ( "       Vo = 0" );
                tampilan3.setText ( " Vt^2 =  2 a St" );
                tampilan4.setText ( "    a = Vt^2 /2 St" );
                vtvt = Math.pow ( vtvt , 2 );
                vovo = Math.pow ( vovo , 2 );
                aa = vtvt / (2 * stst);
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );

            } else  if
                  (  !vo.getText ( ).toString ( ).equals ( "" ) &&
                     !st.getText ( ).toString ( ).equals ( "" ) ) {

                      stst = Double.parseDouble(st.getText().toString());
                      vovo = Double.parseDouble(vo.getText().toString());

                tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                tampilan2.setText ( "  Vt = 0" );
                tampilan3.setText ( "    0 = Vo^2 + 2 a St" );
                tampilan4.setText ( "    a = - Vo^2 /2 St" );
                vovo = Math.pow ( vovo , 2 );
                aa = - vovo / (2 * stst);
                tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );
            }}
            });


  btnt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");
           if   (!vo.getText ( ).toString ( ).equals ( "" ) &&
                 !vt.getText ( ).toString ( ).equals ( "" ) &&
                 !a.getText ( ).toString ( ).equals ( "" )) {

                vovo = Double.parseDouble(vo.getText().toString());
                vtvt = Double.parseDouble(vt.getText().toString());
                aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText(" Vt = Vo + a t");
                    tampilan2.setText("  t =(Vt - Vo)/a");

                    tt =(vtvt - vovo)/aa;
                    tampilan3.setText(" t =" + df.format(tt) + "s");

             } else  if
                 ( !vt.getText ( ).toString ( ).equals ( "" ) &&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                     vtvt = Double.parseDouble(vt.getText().toString());
                     aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt = Vo + a t" );
                    tampilan1.setText ( "      Vo = 0" );
                    tampilan2.setText ( " Vt =  a t" );
                    tampilan3.setText ( "  t = Vt/a" );
                    tt = vtvt /aa;
                    tampilan4.setText(" t = " + df.format(tt) + "s");

           } else  if
                 ( !so.getText ( ).toString ( ).equals ( "" ) &&
                   !vo.getText ( ).toString ( ).equals ( "" ) &&
                   !st.getText ( ).toString ( ).equals ( "" )  &&
                   !a. getText ( ).toString ( ).equals ( "" )) {

                    soso = Double.parseDouble(so.getText().toString());
                    stst = Double.parseDouble(st.getText().toString());
                    vovo = Double.parseDouble(vo.getText().toString());
                    aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 a t^2; " );
                    tampilan2.setText ( "  0 = 0,5 a t^2 + Vo t + So - St" );
                    tampilan3.setText ( "   gunakan rumus abc" );
                    tampilan4.setText ( "  t = (-Vo +-(Vo^2  + 2 a (St-So))^0,5)/a" );
                    vo2 = Math.pow(vovo,2);
                    tt =vo2 + 2*aa*(stst-soso);
                    tt = Math.pow(tt,0.5);
                    tt = (-vovo + tt)/aa;
                    tampilan5.setText(" t = " + df.format(tt) + "s");

         } else  if
                  ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                    !st.getText ( ).toString ( ).equals ( "" ) &&
                    !a. getText ( ).toString ( ).equals ( "" )) {

                    stst = Double.parseDouble(st.getText().toString());
                    vovo = Double.parseDouble(vo.getText().toString());
                    aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                    tampilan2.setText ( "      So = 0 " );
                    tampilan3.setText ( " St =  Vo t + 0,5 a t^2" );
                    tampilan4.setText ( "  0 = 0,5 a t^2 + Vo t - St" );
                    tampilan5.setText ( "  gunakan rumus abc" );
                    tampilan6.setText ( "  t = (-Vo +-(Vo^2  + 2 a St)^0,5)/a" );
                    vo2 = Math.pow(vovo,2);
                    tt =vo2 + 2*aa*(stst);
                    tt = Math.pow(tt,0.5);
                    tt = (-vovo + tt)/aa;
                    tampilan7.setText(" t = " + df.format(tt) + "s");


         }else if
                     ( !so.getText ( ).toString ( ).equals ( "" ) &&
                       !st.getText ( ).toString ( ).equals ( "" )&&
                       !a.getText ( ).toString ( ).equals ( "" )) {

                   soso = Double.parseDouble(so.getText().toString());
                   stst = Double.parseDouble(st.getText().toString());
                   aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                    tampilan2.setText ( "           Vo = 0" );
                    tampilan3.setText ( " St = So + 0,5 a t^2" );
                    tampilan4.setText ( "  t = (2 (St - So)/ a)^0,5" );
                    tt = 2 * (stst - soso) /aa;
                    tt = Math.pow ( tt ,0.5);
                    tampilan5.setText(" t = " + df.format(tt) + "s");

           } else  if
                 (  !st.getText ( ).toString ( ).equals ( "" )  &&
                    !a.getText ( ).toString ( ).equals ( "" )) {

                    stst = Double.parseDouble(st.getText().toString());
                    aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 a t^2" );
                    tampilan2.setText ( " So = 0 dan Vo = 0" );
                    tampilan3.setText ( " St =  0,5 a t^2" );
                    tampilan4.setText ( "  t = (2 St / a)^0,5" );
                    tt = 2 * stst /aa;
                    tt = Math.pow ( tt ,0.5);
                    tampilan5.setText(" t = " + df.format(tt) + "s");

        } else  if
              ( !so.getText ( ).toString ( ).equals ( "" ) &&
                !vo.getText ( ).toString ( ).equals ( "" ) &&
                !st.getText ( ).toString ( ).equals ( "" ) &&
                !vt. getText ( ).toString ( ).equals ( "" )) {

               soso = Double.parseDouble(so.getText().toString());
               stst = Double.parseDouble(st.getText().toString());
               vovo = Double.parseDouble(vo.getText().toString());
               vtvt = Double.parseDouble(vt.getText().toString());

                    tampilan1.setText ( " St = So + Vo t  + 0,5 a t^2" ) ;
                    tampilan2.setText ( " a = (Vt - Vo)/t" ) ;
                    tampilan3.setText ( " St = So + Vo t  + 0,5 (Vt - Vo)t" ) ;
                    tampilan4.setText ( " St = So  + 0,5 (Vt + Vo)t" ) ;
                    tampilan5.setText ( "  t = 2 (St-So)/ (Vo+vt)" );
                    tt = 2*(stst-soso) /(vovo+vtvt);
                    tampilan6.setText(" t = " + df.format(tt) + "s");

           } else  if
             ( !vo.getText ( ).toString ( ).equals ( "" ) &&
               !st.getText ( ).toString ( ).equals ( "" ) &&
               !vt. getText ( ).toString ( ).equals ( "" )) {

               stst = Double.parseDouble(st.getText().toString());
               vovo = Double.parseDouble(vo.getText().toString());
               vtvt = Double.parseDouble(vt.getText().toString());

               tampilan1.setText ( " St = So + Vo t  + 0,5 a t^2" ) ;
               tampilan2.setText ( " a = (Vt - Vo)/t" ) ;
               tampilan3.setText ( " St = So + Vo t  + 0,5 (Vt - Vo)t" ) ;
               tampilan4.setText ( "      so = 0" ) ;
               tampilan5.setText ( " St =  0,5 (Vt + Vo)t" ) ;
               tampilan6.setText ( "  t = 2 St/ (Vo+vt)" );
               tt = 2*stst /(vovo+vtvt);
               tampilan7.setText(" t = " + df.format(tt) + "s");

           } else  if
              (!vo.getText ( ).toString ( ).equals ( "" ) &&
               !st.getText ( ).toString ( ).equals ( "" )) {

               stst = Double.parseDouble(st.getText().toString());
               vovo = Double.parseDouble(vo.getText().toString());

                    tampilan1.setText ( " St = So + Vo t  + 0,5 a t^2" ) ;
                    tampilan2.setText ( "      So = 0" ) ;
                    tampilan3.setText ( " St = Vo t  + 0,5 a t^2" ) ;
                    tampilan4.setText ( " a = (Vt - Vo)/t" ) ;
                    tampilan5.setText ( " St = Vo t  + 0,5 (Vt - Vo)t" ) ;
                    tampilan6.setText ( " St = 0,5 (Vt + Vo)t" ) ;
                    tampilan7.setText ( "  t = 2 St/ (Vo+vt)" );
                    tt = 2*stst /(vovo+vtvt);
                    tampilan8.setText(" t = " + df.format(tt) + "s");

          } else  if
              ( !st.getText ( ).toString ( ).equals ( "" ) &&
                !vt.getText ( ).toString ( ).equals ( "" ) ) {

                stst = Double.parseDouble(st.getText().toString());
                vtvt = Double.parseDouble(vt.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "        Vo = 0" );
                    tampilan3.setText ( " Vt^2 =  2 a St" );
                    tampilan4.setText ( "  a = vt^2/ 2St" );
                    tampilan5.setText ( "      t = Vt/a" );
                    tampilan6.setText ( "  t =  2St/ Vt" );
                    tt = 2*stst /vtvt;
                    tampilan7.setText(" t = " + df.format(tt) + "s");

           } else  if
              (!vo.getText ( ).toString ( ).equals ( "" ) &&
               !st.getText ( ).toString ( ).equals ( "" ) &&
               !vt.getText ( ).toString ( ).equals ( "" ) &&
                vt.getText ( ).toString ( )== vo.getText ( ).toString ( ) ) {

                stst = Double.parseDouble(st.getText().toString());
                vovo = Double.parseDouble(vo.getText().toString());
                vtvt = Double.parseDouble(vt.getText().toString());

                    tampilan1.setText ( " GLB : " );
                    tampilan2.setText ( " Vo = Vtt" );
                    tampilan3.setText ( " St = Vt * t" );
                    tampilan4.setText ( "  t =  St/ Vt" );
                    tt = stst /vtvt;
                    tampilan5.setText(" t = " + df.format(tt) + "s");
            } }});
        btnvo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            DecimalFormat df = new DecimalFormat("#.#####");
              if
                (!t.getText ( ).toString ( ).equals ( "" )&&
                 !vt.getText ( ).toString ( ).equals ( "" ) &&
                 !a.getText ( ).toString ( ).equals ( "" )) {

                vtvt = Double.parseDouble(vt.getText().toString());
                aa = Double.parseDouble(a.getText().toString());
                tt = Double.parseDouble(t.getText().toString());

                    tampilan1.setText(" Vt = Vo + a t");
                    tampilan2.setText(" Vo = Vt - a t");
                    vovo =vtvt - aa*tt;
                    tampilan3.setText(" Vo = " + df.format(vovo) + "m/s");

             } else  if
                  ( !t.getText ( ).toString ( ).equals ( "" ) &&
                    !a.getText ( ).toString ( ).equals ( "" )) {

                            tt = Double.parseDouble(t.getText().toString());
                            aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt = Vo + a t " );
                    tampilan2.setText ( "   Vt = 0  " );
                    tampilan3.setText ( " 0  = Vo + a t" );
                    tampilan4.setText ( " vo = - at" );
                    vovo = - aa*tt;
                    tampilan5.setText(" Vo = " + df.format(vovo) + "m/s");

              } else  if
                   (  !st.getText ( ).toString ( ).equals ( "" ) &&
                      !vt. getText ( ).toString ( ).equals ( "" ) &&
                      !a. getText ( ).toString ( ).equals ( "" )) {

                             stst = Double.parseDouble(st.getText().toString());
                             vtvt = Double.parseDouble(vt.getText().toString());
                             aa = Double.parseDouble(a.getText().toString());
                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "   Vo = (Vt^2 - 2 a St)^0,5" );
                    vtvt = Math.pow(vtvt,2);
                    vovo = (vtvt - 2*aa*stst);
                    vovo = Math.pow ( vovo ,0.5 );
                    tampilan3.setText(" Vo = " + df.format(vovo) + "m/s");

              } else  if
                   ( !st.getText ( ).toString ( ).equals ( "" ) &&
                     !a.getText ( ).toString ( ).equals ( "" )) {

                     stst = Double.parseDouble(st.getText().toString());
                     aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "   Vt = 0" );
                    tampilan3.setText ( "  0 = Vo^2 + 2 a St" );
                    tampilan4.setText ( " Vo = -( 2 a St)^0,5" );
                    vovo = (2*aa*stst);
                    vovo =- Math.pow ( vovo ,0.5 );
                    tampilan5.setText(" Vo = " + df.format(vovo) + "m/s");

           } else  if
                 (!st.getText ( ).toString ( ).equals ( "" ) &&
                  !t.getText ( ).toString ( ).equals ( "" )) {

                   stst = Double.parseDouble(st.getText().toString());
                   tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " kendaraan bergerak direm setalah menempuh jarak st dalam waktu t hingga berhenti" );
                    tampilan2.setText ( " st = 0,5 a t^2" );
                    tampilan3.setText ( "     a = (2st)/t^2" );
                    tampilan4.setText ( " vt = vo + at " );
                    tampilan5.setText ( " vo = vt - at" );
                    tampilan6.setText ( "      vt = 0 " );
                    tampilan7.setText ( " vo =  - at  " );
                    aa = (-2*stst)/Math.pow(tt,2);
                    vovo = - aa*tt;
                    tampilan8.setText(" perlambatan a = " + df.format(aa) + "m/ss");
                    tampilan9.setText(" Vo = " + df.format(vovo) + "m/s");
                }}
        });

   btnvt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");
           if
             ( !vo.getText ( ).toString ( ).equals ( "" ) &&
               !t.getText ( ).toString ( ).equals ( "" ) &&
               !a.getText ( ).toString ( ).equals ( "" )) {

                vovo = Double.parseDouble(vo.getText().toString());
                aa   = Double.parseDouble(a.getText().toString());
                tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText(" Vt = Vo + a t");
                    vtvt =vovo + aa*tt;
                    tampilan2.setText(" Vt = " + df.format(vtvt) + "m/s");

               } else  if
                  ( !a.getText ( ).toString ( ).equals ( "" ) &&
                    !t.getText ( ).toString ( ).equals ( "" )) {

                             tt = Double.parseDouble(t.getText().toString());
                             aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt = Vo + a t" );
                    tampilan2.setText ( "      Vo = 0" );
                    tampilan3.setText ( " Vt =  a t" );
                    vtvt = aa*tt;
                    tampilan4.setText("Vt =" + df.format(vtvt) + "m/s");

                 } else  if

                (  !vo.getText ( ).toString ( ).equals ( "" ) &&
                   !st.getText ( ).toString ( ).equals ( "" )  &&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                             stst = Double.parseDouble(st.getText().toString());
                             vovo = Double.parseDouble(vo.getText().toString());
                               aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( " Vt = (Vo^2 + 2 a St)^0,5" );
                    vovo = Math.pow(vovo,2);
                    vtvt = (vovo + 2*aa*stst);
                    vtvt = Math.pow ( vtvt ,0.5 );
                    tampilan3.setText(" Vt = " + df.format(vtvt) + "m/s");

           } else  if
                  (  !st.getText ( ).toString ( ).equals ( "" ) &&
                     !a.getText ( ).toString ( ).equals ( "" )) {

                      stst = Double.parseDouble(st.getText().toString());
                      aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "        Vo = 0" );
                    tampilan3.setText ( " Vt^2 =  2 a St" );
                    tampilan4.setText ( "   Vt = ( 2 a St)^0,5" );
                    vtvt = (2*aa*stst);
                    vtvt = Math.pow ( vtvt ,0.5 );
                    tampilan5.setText(" Vt = " + df.format(vtvt) + "m/s");

             } else  if
                  (!st.getText ( ).toString ( ).equals ( "" ) &&
                   !t.getText ( ).toString ( ).equals ( "" )) {

                    stst = Double.parseDouble(st.getText().toString());
                    tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 a t^2 " );
                    tampilan2.setText ( " So = 0, Vo = 0" );
                    tampilan3.setText ( " St = 0,5 a t^2" );
                    tampilan4.setText ( "          a = 2 St/t^2" );
                    tampilan5.setText ( " Vt = at = 2St/t" );
                    vtvt = 2*stst/tt;
                    tampilan6.setText(" Vt = " + df.format(vtvt) + "m/s");

                }}
        });
        btns.setOnClickListener( new View.OnClickListener() {
              @Override
             public void onClick(View view) {
             DecimalFormat df = new DecimalFormat("#.#####");
                 if
                 ( !so.getText ( ).toString ( ).equals ( "" ) &&
                   !vo.getText ( ).toString ( ).equals ( "" )  &&
                   !t. getText ( ).toString ( ).equals ( "" ) &&
                   !a. getText ( ).toString ( ).equals ( "" )) {

                    soso = Double.parseDouble(so.getText().toString());
                    vovo = Double.parseDouble(vo.getText().toString());
                    aa   = Double.parseDouble(a.getText().toString());
                    tt   = Double.parseDouble(t.getText().toString());

                    tampilan1.setText(" St = So + Vo t + 0,5 a t^2");
                    stst = soso + vovo*tt + 0.5*aa*tt*tt;
                    tampilan2.setText(" St = " + df.format(stst) + "m");

           } else  if
                 ( !so.getText ( ).toString ( ).equals ( "" )  &&
                   !t.getText ( ).toString ( ).equals ( "" )&&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                            soso = Double.parseDouble(so.getText().toString());
                            tt   = Double.parseDouble(t.getText().toString());
                            aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText(" St = So + Vo t + 0,5 a t^2");
                    tampilan2.setText ( " vo = 0" );
                    tampilan3.setText ( " St = So + 0,5 a t^2" );
                    stst = soso + 0.5 * aa * Math.pow(tt,2);
                    tampilan4.setText ( " St = " + df.format ( stst ) + "m"  );


       } else  if
                 ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                   !t.getText ( ).toString ( ).equals ( "" ) &&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                            vovo = Double.parseDouble(vo.getText().toString());
                            tt   = Double.parseDouble(t.getText().toString());
                            aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText(" St = So + Vo t + 0,5 a t^2");
                    tampilan2.setText("      So = 0");
                    tampilan3.setText(" St = Vo t + 0,5 a t^2" );
                    stst = vovo * tt + 0.5 * aa * Math.pow(tt,2);
                    tampilan4.setText ( " St = " + df.format ( stst ) + "m" );

             } else  if
                 ( !t.getText ( ).toString ( ).equals ( "" )&&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                             tt = Double.parseDouble(t.getText().toString());
                             aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText(" St = So + Vo t + 0,5 a t^2");
                    tampilan2.setText(" So = 0 ;  Vo = 0");
                    tampilan3.setText ( " St =  0,5 a t^2" );
                    tt = Math.pow ( tt , 2 );
                    stst =  0.5 * aa * tt;
                    tampilan4.setText ( " St = " + df.format ( stst ) + "m" );

            } else  if
                 ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                   !vt.getText ( ).toString ( ).equals ( "" ) &&
                   !a.getText ( ).toString ( ).equals ( "" )) {

                            vovo = Double.parseDouble(vo.getText().toString());
                            vtvt = Double.parseDouble(vt.getText().toString());
                              aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "  St = (Vt^2 - Vo^2)/ 2a" );
                    vtvt = Math.pow(vtvt,2);
                    vovo = Math.pow(vovo,2);
                    stst = (vtvt - vovo)/(2*aa);
                    tampilan3.setText ( " St = " + df.format ( stst ) + "m" );

             } else  if
                 (!vt.getText ( ).toString ( ).equals ( "" ) &&
                  !a. getText ( ).toString ( ).equals ( "" )) {

                    vtvt = Double.parseDouble(vt.getText().toString());
                    aa   = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( "        Vo = 0" );
                    tampilan3.setText ( " Vt^2 =  2 a St" );
                    tampilan4.setText ( "  St = Vt^2/ 2a" );
                     vtvt = Math.pow(vtvt,2);
                     stst = vtvt/(2*aa);
                    tampilan5.setText ( " St = " + df.format ( stst ) + "m" );

            } else  if
                  (!vo.getText ( ).toString ( ).equals ( "" )  &&
                   !a. getText ( ).toString ( ).equals ( "" )) {
                             vovo = Double.parseDouble(vo.getText().toString());
                               aa = Double.parseDouble(a.getText().toString());

                    tampilan1.setText ( " Vt^2 = Vo^2 + 2 a St" );
                    tampilan2.setText ( " Vt = 0" );
                    tampilan3.setText ( " 0 = Vo^2 + 2 a St" );
                    tampilan4.setText ( " St = -Vo^2/ 2a" );
                    vovo = Math.pow(vovo,2);
                    stst = -vovo/(2*aa);
                    tampilan6.setText ( " St = " + df.format ( stst ) + "m" );

             } else  if
                 ( !vo.getText ( ).toString ( ).equals ( "" )  &&
                   !t.getText ( ).toString ( ).equals ( "" )) {

                            vovo = Double.parseDouble(vo.getText().toString());
                              tt = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " St = So + Vo * t + 1/2 a* t^2" );
                    tampilan2.setText ( "       So = 0" );
                    tampilan3.setText ( " St = Vo * t + 1/2 a* t^2" );
                    tampilan4.setText ( "      a = (Vt - vo)/t" );
                    tampilan5.setText ( "           Vt = 0, " );
                    tampilan6.setText ( "      a = - Vo/t" );
                    tampilan7.setText ( "St = 0,5 Vo* t" );
                    stst = 0.5* vovo*tt ;
                    tampilan9.setText ( " St = " + df.format ( stst ) + "m" );

            } else  if
                 ( !t.getText ( ).toString ( ).equals ( "" )&&
                   !vt.getText ( ).toString ( ).equals ( "" ) ) {

                             vtvt = Double.parseDouble(vt.getText().toString());
                             tt = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " St = So + Vo t + 0,5 *a* t^2 " );
                    tampilan2.setText ( "      So = 0, Vo = 0 " );
                    tampilan3.setText ( "          a = vt/t  " );
                    tampilan4.setText ( " St = 0,5 *Vt*t " );
                    aa = vtvt/tt;
                    stst = 0.5*aa*tt*tt;
                    tampilan5.setText ( " St = " + df.format ( stst ) + "m" );

          }
        }});
        btnglb.setOnClickListener( new View.OnClickListener() {
             @Override
               public void onClick ( View view ) {
            Intent intent = new Intent ( GerakLurus.this , GeraklurusBeraturan.class );
            startActivity ( intent ); }
        } );


        btnclear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                st.setText ( "" );
                vo.setText ( "" );
                vt.setText ( "" );
                t.setText ( "" );
                so.setText ( "" );
                a.setText ( "" );
            }
            } );
    }}


