
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ArusBolakBalik extends AppCompatActivity {
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


    private EditText v, r, L, C, freq, fo, Wo, Wk, omega;
    private Double vv, rr,rr2, LL, CC, phase2, phase_der, freq2, fofo, WoWo,WkWk,omega2;
    private Double Xl, Xc, Xlc, Vr, VL, Vc, Z,I, P, deg;
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_arus_bolak_balik );

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

        r = findViewById ( R.id.in_r );
        L = findViewById ( R.id.in_L );
        C = findViewById ( R.id.in_C );
        Wo = findViewById ( R.id.in_Wo );
        omega = findViewById ( R.id.in_omega );
        freq = findViewById ( R.id.in_freq );
        fo = findViewById ( R.id.in_fo );
        v = findViewById ( R.id.in_v );

        Button btnXL = findViewById ( R.id.btn_Xl );
        Button btnXC = findViewById ( R.id.btn_Xc );
        Button btnZ = findViewById ( R.id.btn_Z );
        Button btnIrms = findViewById ( R.id.btn_Irms );
        Button btnfo = findViewById ( R.id.btn_f );
        Button btnWo = findViewById ( R.id.btn_Wo );
        Button btnWk = findViewById ( R.id.btn_Wk );
        Button btnVR = findViewById ( R.id.btn_Vr );
        Button btnVC = findViewById ( R.id.btn_Vc );
        Button btnVL = findViewById ( R.id.btn_VL );
        Button btndaya = findViewById ( R.id.btn_P );
        Button btnphase = findViewById ( R.id.btn_Phase );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btnXL.setText ( Html.fromHtml ( "X<small><sub>L</sub></small>" ) );
        btnXC.setText ( Html.fromHtml ( "X<small><sub>C</sub></small>" ) );
        btnIrms.setText ( Html.fromHtml ( "I<small><sub>rms</sub></small>" ) );
        btnVC.setText ( Html.fromHtml ( "V<small><sub>C</sub></small>" ) );
        btnVL.setText ( Html.fromHtml ( "V<small><sub>L</sub></small>" ) );
        btnVR.setText ( Html.fromHtml ( "V<small><sub>R</sub></small>" ) );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Arus bolak-balik" );
                tampilan2.setText ( "kalkulator inidigunakan untuk menghitung:" );
                tampilan3.setText ( " 1. reaktansi induktif XL)" );
                tampilan4.setText ( " 2. reaktansi kapasitif Xc" );
                tampilan5.setText ( " 3. impedansi " );
                tampilan6.setText ( " 4. beda potensial kaki-kaki resistor VR" );
                tampilan7.setText ( " 5. beda potensial kaki-kaki induktor VL" );
                tampilan8.setText ( " 6. beda potensial kaki-kaki kapasitor Vc" );
                tampilan9.setText ( " 7. arus efektif Irms " );
                tampilan10.setText ( "8. sudut phase " );
                tampilan11.setText ( " 9. frekuensi resonansi Wo " );
                tampilan12.setText ( " 10. frekuensi kutub Wk " );
                tampilan13.setText ( " 10. daya  P" );
                tampilan13.setText ( "  frekuensi   f" );

            }});

        btnXL.setOnClickListener ( new View.OnClickListener ( ) {
                                       @Override
                public void onClick ( View view ) {
               DecimalFormat df = new DecimalFormat ( "#.#####" );

              if
                             (!L.getText ( ).toString ( ).equals ( "" )   &&
                          !omega.getText ( ).toString ( ).equals ( "" )) {
                          LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                      omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );

                      LL = LL/1000;

             tampilan1.setText ( " Xl = j omega L" );
              Xl = omega2 * LL;
             tampilan2.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
            } else
             if
                           (!L.getText ( ).toString ( ).equals ( "" )   &&
                         !freq.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                     freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                 LL = LL/1000;
            tampilan1.setText ( " Xl = j 2 pi freg L" );
            Xl = 6.28*freq2 * LL;
            tampilan2.setText ( " Xl = j" + df.format ( Xl ) + "ohm" );
             } }}
        );

   btnXC.setOnClickListener ( new View.OnClickListener ( ) {
          @Override
         public void onClick ( View view ) {
         DecimalFormat df = new DecimalFormat ( "#.#####" );
           if
                         (!C.getText ( ).toString ( ).equals ( "" )   &&
                      !omega.getText ( ).toString ( ).equals ( "" )) {
                  CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                  omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                  CC =CC/1000000;


           tampilan1.setText ( " Xc = -j 1/omega C" );
                    Xc = 1/(omega2 * CC);
           tampilan2.setText ( " Xc = -j  " + df.format ( Xc ) + "ohm" );

          } else
         if
                       (!C.getText ( ).toString ( ).equals ( "" )   &&
                     !freq.getText ( ).toString ( ).equals ( "" )) {
                    CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                 freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
             CC =CC/1000000;
             tampilan1.setText ( " Xc = -j 1/ (2 pi freg C)" );
           Xc = 1/(6.28*freq2 * CC);
          tampilan2.setText ( " Xc = - j" + df.format ( Xc ) + "ohm" );
         } }}
        );

 btnZ.setOnClickListener ( new View.OnClickListener ( ) {
         @Override
         public void onClick ( View view ) {
         DecimalFormat df = new DecimalFormat ( "#.#####" );
         if
           (!C.getText ( ).toString ( ).equals ( "" )   &&
                   !omega.getText ( ).toString ( ).equals ( "" )   &&
                   !L.getText ( ).toString ( ).equals ( "" )   &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
               CC = Double.parseDouble ( C.getText ( ).toString ( ) );
               LL = Double.parseDouble ( L.getText ( ).toString ( ) );
               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
               omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
             CC = CC/1000000;
             LL = LL/1000;


             tampilan1.setText ( " Xl = j omega L" );
             tampilan2.setText ( " Xc = -j 1/omega C" );
             tampilan3.setText ( " Z kompleks =  R + (Xl - Xc)" );
             tampilan4.setText ( " Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
             tampilan6.setText ( " R = " + df.format ( rr ) + "ohm" );
                  Xc = 1/(omega2 * CC);
             tampilan7.setText ( " Xc =-j" + df.format ( Xc ) + "ohm" );
                  Xl = omega2 * LL;
             tampilan8.setText ( " Xl = j" + df.format ( Xl ) + "ohm" );
                  Xlc = Xl - Xc;
             tampilan9.setText ( " Z = (" + df.format ( rr ) +"  +  " + "j" + df.format ( Xlc )  + ") ohm" );
                  rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                     Z = rr + Xlc;
                     Z = Math.pow(Z,0.5);
             tampilan10.setText ( " Z = " + df.format ( Z ) + "ohm" );

        } else
   if
       (!C.getText ( ).toString ( ).equals ( "" )   &&
               !omega.getText ( ).toString ( ).equals ( "" )   &&
               !r.getText ( ).toString ( ).equals ( "" )) {
           CC = Double.parseDouble ( C.getText ( ).toString ( ) );
           rr = Double.parseDouble ( r.getText ( ).toString ( ) );
           omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
       CC = CC/1000000;

       tampilan1.setText ( " Zkompleks = ( R + (Xl - Xc)" );
       tampilan2.setText ( " Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
       tampilan3.setText ( " Xl = j omega L" );
       tampilan4.setText ( " Xc = -j 1/omega C" );
       tampilan5.setText ( " karena L = 0" );
       tampilan6.setText ( " karena L = 0, maka Z = ( R^2 + (Xc)^2 )^0,5" );

           Xc = 1/(omega2 * CC);
       tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
       tampilan9.setText ( " Zkompleks = (" + df.format ( rr ) + "-j " +df.format(Xc) +"ohm" );
           rr = Math.pow(rr,2);
           Xc = Math.pow(Xc,2);
           Z = rr + Xc;
           Z = Math.pow(Z,0.5);

           tampilan10.setText ( " Z = " + df.format ( Z ) + "ohm" );
       } else
       if
           (!L.getText ( ).toString ( ).equals ( "" )   &&
                   !omega.getText ( ).toString ( ).equals ( "" )   &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
               LL = Double.parseDouble ( L.getText ( ).toString ( ) );
               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
               omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );


           LL = LL/1000;

           tampilan1.setText ( " Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
           tampilan2.setText ( " Xl = j omega L" );
           tampilan3.setText ( " Xc = -j 1/omega C" );
           tampilan4.setText ( " karena C = 0, maka" );
           tampilan5.setText ( " Z = ( R^2 + (Xl)^2 )^0,5" );

           Xl = omega2 * LL;
           tampilan7.setText ( " Xl = j" + df.format ( Xl ) + "ohm" );
           tampilan8.setText ( " Zkompleks = " + df.format ( rr ) +"j"+ df.format ( Xl ) + "ohm" );
           rr = Math.pow(rr,2);
           Xl = Math.pow(Xl,2);
           Z = rr + Xl;
           Z = Math.pow(Z,0.5);

           tampilan8.setText ( " Z = " + df.format ( Z ) + "ohm" );
       } else
       if
           (!C.getText ( ).toString ( ).equals ( "" )   &&
                   !freq.getText ( ).toString ( ).equals ( "" )   &&
                   !L.getText ( ).toString ( ).equals ( "" )   &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
               CC = Double.parseDouble ( C.getText ( ).toString ( ) );
               LL = Double.parseDouble ( L.getText ( ).toString ( ) );
               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
               freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
           CC = CC/1000000;
           LL = LL/1000;

           tampilan1.setText ( " Zkompleks = ( R + (Xl - Xc)" );
           tampilan2.setText ( " Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
           tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
           tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );

            Xc = 1/(6.28*freq2 * CC);
            Xl = 6.28*freq2 * LL;
           tampilan6.setText ( " Xc = " +"-j" + df.format ( Xc ) + "ohm" );
           tampilan7.setText ( " Xl = " + "+ j"+ df.format ( Xl ) + "ohm" );
           Xlc = Xl - Xc;
          tampilan9.setText ( " Zkompleks = (" + df.format ( rr ) +"+ j"+ df.format ( Xlc ) +") ohm" );

          rr = Math.pow(rr,2);
            Xlc = Math.pow(Xlc,2);
            Z = rr + Xlc;
             Z = Math.pow(Z,0.5);
            tampilan11.setText ( " Z = " + df.format ( Z ) + "ohm" );
            }
       else
       if
           (!C.getText ( ).toString ( ).equals ( "" )   &&
                   !freq.getText ( ).toString ( ).equals ( "" )   &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
               CC = Double.parseDouble ( C.getText ( ).toString ( ) );
               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
               freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
           CC = CC/1000000;


           tampilan1.setText ( " Z kompleks = ( R + (Xl - Xc)" );
           tampilan2.setText ( " Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
           tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
           tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
           tampilan5.setText ( " L = 0, maka" );
           tampilan6.setText ( " Z = ( R^2 + (Xc)^2 )^0,5" );
           Xc = 1/(6.28*freq2 * CC);
           tampilan7.setText ( " Xc = " +"-j" + df.format ( Xc ) + "ohm" );
           tampilan8.setText ( " Zkompleks = (" + df.format ( rr ) +" -j"+ df.format ( Xc )+ ") ohm" );
           rr = Math.pow(rr,2);
           Xc = Math.pow(Xc,2);
           Z = rr + Xc;
           Z = Math.pow(Z,0.5);
           tampilan9.setText ( " Z = " + df.format ( Z ) + "ohm" );
       }
       else
       if
           (!L.getText ( ).toString ( ).equals ( "" )   &&
                   !freq.getText ( ).toString ( ).equals ( "" )   &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
               LL = Double.parseDouble ( L.getText ( ).toString ( ) );
               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
               freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );


           LL = LL/1000;

           tampilan1.setText ( " Zkompleks = ( R + (Xl - Xc)" );
           tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
           tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
           tampilan5.setText ( " C = 0, maka" );
           tampilan6.setText ( " Z = ( R^2 + (Xl)^2 )^0,5" );


           Xl = 6.28*freq2 * LL;
           tampilan8.setText ( " Xl = j" + df.format ( Xl ) + "ohm" );
           tampilan9.setText ( " Zkompleks = (" + df.format ( rr ) +"j"+ df.format ( Xl )+ ") ohm" );
           rr = Math.pow(rr,2);
           Xl = Math.pow(Xl,2);
           Z = rr + Xlc;
           Z = Math.pow(Z,0.5);
           tampilan10.setText ( " Z = " + df.format ( Z ) + "ohm" );
       }
      }}
        );
        btnIrms.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#########" );

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );

                    CC = CC/1000000;
                    LL = LL/1000;

                    tampilan1.setText ( "  Irms = Vrms/ Z; " );
                    tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                    Xc = 1/(omega2 * CC);
                    Xl = omega2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    tampilan6.setText ( " z = " + df.format ( Z ) + "ohm" );
                    tampilan7.setText ( " Irms = " + df.format ( I ) + "ampere" );
                } else
                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;



                    tampilan1.setText ( "  Irms = Vrms/ Z; " );
                    tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                    tampilan5.setText ( " karena L = 0, maka" );
                    tampilan6.setText ( "  Z = ( R^2 + Xc)^2 )^0,5" );

                    Xc = 1/(omega2 * CC);
                    rr = Math.pow(rr,2);
                    Xc = Math.pow(Xc,2);
                    Z = rr + Xc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    tampilan8.setText ( " z = " + df.format ( Z ) + "ohm" );
                    tampilan9.setText ( " Irms = " + df.format ( I ) + "ampere" );
                } else
                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );


                    LL = LL/1000;

                    tampilan1.setText ( "  Irms = Vrms/ Z; " );
                    tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                    tampilan5.setText ( " karena C = 0, maka" );
                    tampilan6.setText ( "  Z = ( R^2 + (Xl)^2 )^0,5" );

                    Xl = omega2 * LL;
                    rr = Math.pow(rr,2);
                    Xl = Math.pow(Xl,2);
                    Z = rr + Xl;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    tampilan8.setText ( " z = " + df.format ( Z ) + "ohm" );
                    tampilan9.setText ( " Irms = " + df.format ( I ) + "ampere" );
                } else

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;

                    tampilan1.setText ( "  Irms = Vrms/ Z; " );
                    tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                    Xc = 1 / (6.28 * freq2 * CC);
                    Xl = 6.28 * freq2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow ( rr , 2 );
                    Xlc = Math.pow ( Xlc , 2 );
                    Z = rr + Xlc;
                    Z = Math.pow ( Z , 0.5 );
                    I = vv / Z;
                    tampilan6.setText ( " z = " + df.format ( Z ) + "ohm" );
                    tampilan7.setText ( " Irms = " + df.format ( I ) + "ampere" );
                }
                  else

                    if
                        (!C.getText ( ).toString ( ).equals ( "" )   &&
                                !v.getText ( ).toString ( ).equals ( "" )   &&
                                !freq.getText ( ).toString ( ).equals ( "" )   &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                            CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );

                        CC = CC/1000000;

                        tampilan1.setText ( "  Irms = Vrms/ Z; " );
                        tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                        tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                        tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                        tampilan5.setText ( " karena L = 0, maka" );
                        tampilan6.setText ( "  Z = ( R^2 + Xc)^2 )^0,5" );
                        Xc = 1 / (6.28 * freq2 * CC);
                        rr = Math.pow ( rr , 2 );
                        Xc = Math.pow ( Xc , 2 );
                        Z = rr + Xc;
                        Z = Math.pow ( Z , 0.5 );
                        I = vv / Z;
                        tampilan8.setText ( " z = " + df.format ( Z ) + "ohm" );
                        tampilan9.setText ( " Irms = " + df.format ( I ) + "ampere" );
                    }
                    else
                        if
                                   (!L.getText ( ).toString ( ).equals ( "" )   &&
                                    !v.getText ( ).toString ( ).equals ( "" )   &&
                                    !freq.getText ( ).toString ( ).equals ( "" )   &&
                                    !r.getText ( ).toString ( ).equals ( "" )) {
                                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                                vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );


                            LL = LL/1000;

                            tampilan1.setText ( "  Irms = Vrms/ Z; " );
                            tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                            tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
                            tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                            tampilan5.setText ( " karena C = 0, maka" );
                            tampilan6.setText ( "  Z = ( R^2 + (Xl)^2 )^0,5" );

                            Xl = 6.28*freq2 * LL;
                            rr = Math.pow(rr,2);
                            Xl = Math.pow(Xl,2);
                            Z = rr + Xl;
                            Z = Math.pow(Z,0.5);
                            I = vv/Z;
                            tampilan8.setText ( " z = " + df.format ( Z ) + "ohm" );
                            tampilan9.setText ( " Irms = " + df.format ( I ) + "ampere" );
                }

          else
        if
        (!C.getText ( ).toString ( ).equals ( "" )   &&
                !v.getText ( ).toString ( ).equals ( "" )   &&
                !freq.getText ( ).toString ( ).equals ( "" )) {
            CC = Double.parseDouble ( C.getText ( ).toString ( ) );
            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
            freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
            CC = CC/1000000;


            tampilan1.setText ( "  Irms = Vrms/ Z; " );
            tampilan2.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
            tampilan3.setText ( " Xl = j omega L = j 2 pi f L" );
            tampilan4.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
            tampilan5.setText ( " karena C = 0, maka" );
            tampilan6.setText ( "  Z = ( R^2 + (Xl)^2 )^0,5" );

            Xc = 1 / (6.28 * freq2);

            I = vv / Xc;
            tampilan8.setText ( " z = " + df.format ( Xc ) + "ohm" );
            tampilan9.setText ( " Irms = " + df.format ( I ) + "ampere" );

        }}}
        );
        btnVL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;

                    tampilan1.setText ( "  VL = I Xl" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) " );

                    Xc = 1/(omega2 * CC);
                    Xl = omega2 * LL;

                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    VL = I * Xl;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc =  " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z = j " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VL = j " + df.format ( VL ) + "volt" );
                } else
                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );

                    LL = LL/1000;
                    tampilan1.setText ( "  VL = I Xl" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j w L" );
                    tampilan5.setText ( "  Xl = j w L" );
                    tampilan6.setText ( "  karena C = 0, maka" );
                    tampilan7.setText ( "  Z = ( R^2 + (Xl)^2 )^0,5" );

                    Xl = omega2 * LL;

                    rr = Math.pow(rr,2);
                    Xl = Math.pow(Xl,2);
                    Z = rr + Xl;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    Xl = Math.pow(Xl,0.5);
                    VL = I * Xl;

                    tampilan8.setText ( " Xc =  " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z = j " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VL = j " + df.format ( VL ) + "volt" );
                } else


                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;
                    tampilan1.setText ( "  VL = I Xl" );
                    tampilan2.setText ( " cari arus dari, I = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan5.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );

                    Xc = 1/(6.28*freq2 * CC);
                    Xl = 6.28*freq2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;

                    VL = I * Xl;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc =  " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z = j " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VL = j " + df.format ( VL ) + "volt" );
                }
                else


                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );

                    LL = LL/1000;
                    tampilan1.setText ( "  VL = I Xl" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L = j 2 pi f L" );
                    tampilan5.setText ( "  XC = -j /(omega C) = -j/(2 pi f C)" );
                    tampilan6.setText ( "  karena C = 0, maka" );
                    tampilan7.setText ( "  Z = ( R^2 + (Xl)^2 )^0,5" );


                    Xl = 6.28*freq2 * LL;
                    rr = Math.pow(rr,2);
                    Xl = Math.pow(Xl,2);
                    Z = rr + Xl;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    Xl = Math.pow(Xl,0.5);
                    VL = I * Xl;
                    tampilan8.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan9.setText ( " Z = j " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VL = j " + df.format ( VL ) + "volt" );
                }

            }}
        );
        btnVC.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                 if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                     CC = CC/1000000;
                     LL = LL/1000;
                     tampilan1.setText ( "  Vc = I Xc" );
                     tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                     tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                     tampilan4.setText ( "  Xl = j omega L" );
                     tampilan5.setText ( "  Xc = -j 1/(omega C) " );
                    Xc = 1/(omega2 * CC);
                    Xl = omega2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    Vc = I * Xc;
                     tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                     tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                     tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                     tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                     tampilan11.setText ( " Vc = -j " + df.format ( Vc ) + "volt" );
                } else
                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;


                    tampilan1.setText ( "  Vc = I Xc" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L,  L = 0" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) " );
                    tampilan6.setText ( "  Z = ( R^2 + (Xc)^2 )^0,5" );
                    Xc = 1/(omega2 * CC);
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    rr = Math.pow(rr,2);
                    Xc = Math.pow(Xc,2);
                    Z = rr + Xc;
                    Z = Math.pow(Z,0.5);
                    Xc = Math.pow(Xc,0.5);
                    I = vv/Z;
                    Vc = I * Xc;


                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " Vc = j " + df.format ( Vc ) + "volt" );
                } else


                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;

                    tampilan1.setText ( "  Vc = I Xc" );
                    tampilan2.setText ( " cari arus dari, I = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( " Xl = j omega L = j 2 pi f L" );
                    tampilan5.setText ( " Xc = -j 1/omega C = -j 1/(2pi f C)" );
                    Xc = 1/(6.28*freq2 * CC);
                    Xl = 6.28*freq2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    Vc = I * Xc;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " Vc = -j " + df.format ( Vc ) + "volt" );
                }
                else

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;


                    tampilan1.setText ( "  Vc = I Xc" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L = j 2 pi f L,  L = 0" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                    tampilan6.setText ( "  Z = ( R^2 + (Xc)^2 )^0,5" );
                    Xc = 1/(6.28*freq2 * CC);
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    rr = Math.pow(rr,2);
                    Xc = Math.pow(Xc,2);
                    Z = rr + Xc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    Xc = Math.pow(Xc,0.5);

                    Vc = I * Xc;


                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " Vc = -j " + df.format ( Vc ) + "volt" );
                }
            }}
        );
        btnVR.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;

                    tampilan1.setText ( " Vr = I R" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) " );
                    Xc = 1/(omega2 * CC);
                    Xl = omega2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                } else
                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );

                    LL = LL/1000;
                    tampilan1.setText ( " Vr = I R" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) " );

                    Xl = omega2 * LL;
                    rr = Math.pow(rr,2);
                    Xl = Math.pow(Xl,2);
                    Z = rr + Xl;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                } else
                if
                           (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;


                        tampilan1.setText ( " Vr = I R" );
                        tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                        tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                        tampilan4.setText ( "  Xl = j omega L" );
                        tampilan5.setText ( "  Xc = -j 1/(omega C) " );
                    Xc = 1/(omega2 * CC);
                    rr = Math.pow(rr,2);
                    Xc = Math.pow(Xc,2);
                    Z = rr + Xl;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                        tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                        tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                        tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                        tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                        tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                } else

                if
                (!C.getText ( ).toString ( ).equals ( "" )   &&
                        !v.getText ( ).toString ( ).equals ( "" )   &&
                        !L.getText ( ).toString ( ).equals ( "" )   &&
                        !freq.getText ( ).toString ( ).equals ( "" )   &&
                        !r.getText ( ).toString ( ).equals ( "" )) {
                    CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                    vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                    freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;
                    tampilan1.setText ( " Vr = I R" );
                    tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                    tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                    tampilan4.setText ( "  Xl = j omega L = j 2 pi f L" );
                    tampilan5.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                    Xc = 1/(6.28*freq2 * CC);
                    Xl = 6.28*freq2 * LL;
                    Xlc = Xl - Xc;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                }
                else

                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );

                    LL = LL/1000;
                        tampilan1.setText ( " Vr = I R" );
                        tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                        tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                        tampilan4.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan5.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                    Xl = 6.28*freq2 * LL;
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xl,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                        tampilan8.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                        tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                        tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                        tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                }
                else

                if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;


                        tampilan1.setText ( " Vr = I R" );
                        tampilan2.setText ( " cari arus dari, i = Vrms/Z" );
                        tampilan3.setText ( "  Z = ( R^2 + (Xl - Xc)^2 )^0,5" );
                        tampilan4.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan5.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                    Xc = 1/(6.28*freq2 * CC);
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    rr = Math.pow(rr,0.5);
                    Vr = I * rr;
                    tampilan8.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    tampilan9.setText ( " Z =  " + df.format ( Z ) + "ohm" );
                    tampilan10.setText ( " I =  " + df.format ( I ) + "ampere" );
                    tampilan11.setText ( " VR = " + df.format ( Vr ) + "volt" );
                }
            }}
        );
        btnphase.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !C.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;
                        tampilan1.setText ( "  phase = atan (Xl - Xc)/R" );
                        tampilan2.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan3.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                        tampilan4.setText ( "  phase = atan (Xl - Xc)/R" );
                            Xc = 1/(6.28*freq2 * CC);
                            Xl = 6.28*freq2 * LL;

                    tampilan6.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    tampilan7.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    Xlc = Xl - Xc;
                            phase2 = Xlc/rr;
                           phase2 =Math.atan(phase2);
                           phase_der = phase2 * 57.32;
                       tampilan9.setText ( " Phase = " + df.format ( phase2 ) + "rad  =   " +df.format ( phase_der ) + "derajat");
                } else
                if
                (!L.getText ( ).toString ( ).equals ( "" )   &&

                        !freq.getText ( ).toString ( ).equals ( "" )   &&
                        !r.getText ( ).toString ( ).equals ( "" )) {
                    LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                    freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );

                    LL = LL/1000;
                    tampilan1.setText ( "  phase = atan (Xl - Xc)/R" );
                    tampilan2.setText ( "  Xl = j omega L = j 2 pi f L" );
                    tampilan3.setText ( " C = 0 " );
                    tampilan4.setText ( "  phase = atan (Xl)/R" );
                    Xl = 6.28*freq2 * LL;
                    tampilan6.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );

                    phase2 = Xl/rr;
                    phase2 =Math.atan(phase2);
                    phase_der = phase2 * 57.32;
                    tampilan7.setText ( " Phase = " + df.format ( phase2 ) + "rad  =   " +df.format ( phase_der ) + "derajat");


                } else
                if
                (!C.getText ( ).toString ( ).equals ( "" )   &&

                        !freq.getText ( ).toString ( ).equals ( "" )   &&
                        !r.getText ( ).toString ( ).equals ( "" )) {
                    CC = Double.parseDouble(C.getText().toString());

                    rr = Double.parseDouble(r.getText().toString());
                    freq2 = Double.parseDouble(freq.getText().toString());
                    CC = CC / 1000000;

                    tampilan1.setText("  phase = atan (Xl - Xc)/R");
                    tampilan2.setText("  L = 0");
                    tampilan3.setText(" XC = -j/omega C = -j/(2 pi f C) ");
                    tampilan4.setText("  phase = atan (Xl)/R");
                    Xc = 1 / (6.28 * freq2 * CC);

                    tampilan6.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                    phase2 = Xc / rr;
                    phase2 = Math.atan(phase2);
                    phase_der = phase2 * 57.32;
                    tampilan7.setText(" Phase = " + df.format(phase2) + "rad  =   " + df.format(phase_der) + "derajat");


                }else

                    if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !C.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                        CC = CC/1000000;
                        LL = LL/1000;
                        tampilan1.setText ( "  phase = atan (Xl - Xc)/R" );
                        tampilan2.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan3.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );
                        Xc = 1/(omega2 * CC);
                        Xl = omega2 * LL;
                        tampilan5.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                        tampilan6.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                        Xlc = Xl - Xc;
                        phase2 = Xlc/rr;
                        phase2 =Math.atan(phase2);
                        phase_der = phase2 * 57.32;
                        tampilan7.setText ( " Phase = " + df.format ( phase2 ) + "rad  =   " +df.format ( phase_der ) + "derajat");

                    } else
                    if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&

                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );

                        LL = LL/1000;
                        tampilan1.setText ( "  phase = atan (Xl - Xc)/R" );
                        tampilan2.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan3.setText ( " C = 0 " );
                        tampilan4.setText ( "  phase = atan (Xl)/R" );
                        Xl = omega2 * LL;
                        tampilan6.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );

                        phase2 = Xl/rr;
                        phase2 =Math.atan(phase2);
                        phase_der = phase2 * 57.32;
                        tampilan7.setText ( " Phase = " + df.format ( phase2 ) + "rad  =   " +df.format ( phase_der ) + "derajat");


                    } else
                    if
                    (!C.getText ( ).toString ( ).equals ( "" )   &&

                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );

                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                        CC = CC/1000000;

                        tampilan1.setText ( "  phase = atan (Xl - Xc)/R" );
                        tampilan2.setText ( "  L = 0" );
                        tampilan3.setText ( " XC = -j/omega C = -j/(2 pi f C) " );
                        tampilan4.setText ( "  phase = atan (Xl)/R" );
                           Xc = 1/(omega2 * CC);

                        tampilan6.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );
                           phase2 = Xc/rr;
                           phase2 =Math.atan(phase2);
                           phase_der = phase2 * 57.32;
                        tampilan7.setText ( " Phase = " + df.format ( phase2 ) + "rad  =   " +df.format ( phase_der ) + "derajat");





                    }
            }}
        );

        btndaya.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###############" );

                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !C.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                    CC = CC/1000000;
                    LL = LL/1000;
                        tampilan1.setText ( "  P = V I cos phase" );
                        tampilan2.setText ( "  phase = arctan{(Xl -Xc)/R}" );
                        tampilan3.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan4.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );

                    Xc = 1/(omega2 * CC);
                    Xl = omega2 * LL;
                    tampilan6.setText ( " Xc = -j" + df.format ( Xc ) + "ohm" );
                    tampilan7.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                    Xlc = Xl - Xc;
                    phase2 = Xlc/rr;
                    phase2 =Math.atan(phase2);
                    tampilan8.setText ( " phase = " + df.format ( phase2 ) + "radian" );
                    deg = phase2*57.32;
                    tampilan9.setText ( " phase = " + df.format ( deg ) + "derajat" );
                    rr = Math.pow(rr,2);
                    Xlc = Math.pow(Xlc,2);
                    Z = rr + Xlc;
                    Z = Math.pow(Z,0.5);
                    I = vv/Z;
                    phase2 = Math.cos(phase2);
                    P = vv * I* phase2;
                    tampilan10.setText ( " impedansi = " + df.format ( Z ) + "ohm" );
                    tampilan11.setText ( " tegangan = " + df.format ( vv ) + "volt" );
                    tampilan12.setText ( " arus = " + df.format ( I ) + "ampere" );
                    tampilan13.setText ( " Daya = " + df.format ( P ) + "watt" );
                } else
                if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !C.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                    LL = Double.parseDouble(L.getText().toString());
                    vv = Double.parseDouble(v.getText().toString());
                    CC = Double.parseDouble(C.getText().toString());
                    rr = Double.parseDouble(r.getText().toString());
                    freq2 = Double.parseDouble(freq.getText().toString());
                    CC = CC / 1000000;
                    LL = LL / 1000;
                    tampilan1.setText("  P = V I cos phase");
                    tampilan2.setText("  phase = arctan{(Xl -Xc)/R}");
                    tampilan3.setText("  Xl = j omega L = j 2 pi f L");
                    tampilan4.setText("  Xc = -j 1/(omega C) = - j/(2 pi f C) ");

                        Xc = 1 / (6.28 * freq2 * CC);
                        Xl = 6.28 * freq2 * LL;
                    tampilan6.setText(" Xc = -j " + df.format(Xc) + "ohm");
                    tampilan7.setText(" Xl = j " + df.format(Xl) + "ohm");
                        Xlc = Xl - Xc;
                        phase2 = Xlc / rr;
                        phase2 = Math.atan(phase2);
                    tampilan8.setText(" phase = " + df.format(phase2) + "radian");
                        deg = phase2 * 57.32;
                    tampilan9.setText(" phase = " + df.format(deg) + "derajat");
                       rr = Math.pow(rr, 2);
                       Xlc = Math.pow(Xlc, 2);
                       Z = rr + Xlc;
                       Z = Math.pow(Z, 0.5);
                       I = vv / Z;
                    phase2 = Math.cos(phase2);
                       P = vv * I * phase2;
                    tampilan10.setText(" impedansi = " + df.format(Z) + "ohm");
                    tampilan11.setText(" tegangan = " + df.format(vv) + "volt");
                    tampilan12.setText(" arus = " + df.format(I) + "ampere");
                    tampilan13.setText(" Daya = " + df.format(P) + "watt");


                } else
                    if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !omega.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                            LL = LL/1000;
                        tampilan1.setText ( "  P = V I cos phase" );
                        tampilan2.setText ( "  phase = arctan{(Xl -Xc)/R}" );
                        tampilan3.setText ( "  Xl = j omega L = j 2 pi f L" );
                        tampilan4.setText ( "  C = 0 " );

                             Xl = omega2 * LL;

                        tampilan6.setText ( " Xl = j " + df.format ( Xl ) + "ohm" );
                             phase2 = Xl/rr;
                             phase2 =Math.atan(phase2);
                        tampilan8.setText ( " phase = " + df.format ( phase2 ) + "radian" );
                             deg = phase2*57.32;
                        tampilan9.setText ( " phase = " + df.format ( deg ) + "derajat" );
                             rr = Math.pow(rr,2);
                             Xl = Math.pow(Xl,2);
                             Z = rr + Xl;
                             Z = Math.pow(Z,0.5);
                             I = vv/Z;
                             phase2 = Math.cos(phase2);
                             P = vv * I* phase2;
                        tampilan10.setText ( " impedansi = " + df.format ( Z ) + "ohm" );
                        tampilan11.setText ( " tegangan = " + df.format ( vv ) + "volt" );
                        tampilan12.setText ( " arus = " + df.format ( I ) + "ampere" );
                        tampilan13.setText ( " Daya = " + df.format ( P ) + "watt" );
                    } else
                    if
                    (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !freq.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble(L.getText().toString());
                        vv = Double.parseDouble(v.getText().toString());
                        rr = Double.parseDouble(r.getText().toString());
                        freq2 = Double.parseDouble(freq.getText().toString());
                        LL = LL / 1000;
                        tampilan1.setText("  P = V I cos phase");
                        tampilan2.setText("  phase = arctan{(Xl -Xc)/R}");
                        tampilan3.setText("  Xl = j omega L = j 2 pi f L");
                        tampilan4.setText("  C = 0 ");
                            Xl = 6.28 * freq2 * LL;
                        tampilan6.setText(" Xl = j " + df.format(Xl) + "ohm");
                            phase2 = Xl / rr;
                            phase2 = Math.atan(phase2);
                        tampilan8.setText(" phase = " + df.format(phase2) + "radian");
                            deg = phase2 * 57.32;
                        tampilan9.setText(" phase = " + df.format(deg) + "derajat");
                            rr = Math.pow(rr, 2);
                            Xl = Math.pow(Xl, 2);
                            Z = rr + Xl;
                            Z = Math.pow(Z, 0.5);
                            I = vv / Z;
                            phase2 = Math.cos(phase2);
                            P = vv * I * phase2;
                        tampilan10.setText(" impedansi = " + df.format(Z) + "ohm");
                        tampilan11.setText(" tegangan = " + df.format(vv) + "volt");
                        tampilan12.setText(" arus = " + df.format(I) + "ampere");
                        tampilan13.setText(" Daya = " + df.format(P) + "watt");


                    } else       if
                        (!C.getText ( ).toString ( ).equals ( "" )   &&
                                !v.getText ( ).toString ( ).equals ( "" )   &&
                                !omega.getText ( ).toString ( ).equals ( "" )   &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            omega2 = Double.parseDouble ( omega.getText ( ).toString ( ) );
                            CC = CC/1000000;
                            tampilan1.setText ( "  P = V I cos phase" );
                            tampilan2.setText ( "  phase = arctan{(Xl -Xc)/R}" );
                            tampilan3.setText ( "  L = 0" );
                            tampilan4.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );

                            Xc = 1/(omega2 * CC);
                            tampilan6.setText ( " Xc = -j" + df.format ( Xc ) + "ohm" );

                            phase2 = Xc/rr;
                            phase2 =Math.atan(phase2);
                            tampilan8.setText ( " phase = " + df.format ( phase2 ) + "radian" );
                            deg = phase2*57.32;
                            tampilan9.setText ( " phase = " + df.format ( deg ) + "derajat" );
                            rr = Math.pow(rr,2);
                            Xc = Math.pow(Xc,2);
                            Z = rr + Xc;
                            Z = Math.pow(Z,0.5);
                            I = vv/Z;
                            phase2 = Math.cos(phase2);
                            P = vv * I* phase2;
                            tampilan10.setText ( " impedansi = " + df.format ( Z ) + "ohm" );
                            tampilan11.setText ( " tegangan = " + df.format ( vv ) + "volt" );
                            tampilan12.setText ( " arus = " + df.format ( I ) + "ampere" );
                            tampilan13.setText ( " Daya = " + df.format ( P ) + "watt" );
                        } else
                        if
                        (!C.getText ( ).toString ( ).equals ( "" )   &&
                                !v.getText ( ).toString ( ).equals ( "" )   &&
                                !freq.getText ( ).toString ( ).equals ( "" )   &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            CC = Double.parseDouble ( C.getText ( ).toString ( ) );
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            freq2 = Double.parseDouble ( freq.getText ( ).toString ( ) );
                            CC = CC/1000000;
                            tampilan1.setText ( "  P = V I cos phase" );
                            tampilan2.setText ( "  phase = arctan{(Xl -Xc)/R}" );
                            tampilan3.setText ( "  L = 0" );
                            tampilan4.setText ( "  Xc = -j 1/(omega C) = - j/(2 pi f C) " );

                            Xc = 1/(6.28*freq2 * CC);
                            tampilan6.setText ( " Xc = -j " + df.format ( Xc ) + "ohm" );

                            phase2 = Xc/rr;
                            phase2 =Math.atan(phase2);
                            tampilan8.setText ( " phase = " + df.format ( phase2 ) + "radian" );
                            deg = phase2*57.32;
                            tampilan9.setText ( " phase = " + df.format ( deg ) + "derajat" );
                            rr = Math.pow(rr,2);
                            Xc = Math.pow(Xc,2);
                            Z = rr + Xc;
                            Z = Math.pow(Z,0.5);
                            I = vv/Z;
                            phase2 = Math.cos(phase2);
                            P = vv * I* phase2;
                            tampilan10.setText ( " impedansi = " + df.format ( Z ) + "ohm" );
                            tampilan11.setText ( " tegangan = " + df.format ( vv ) + "volt" );
                            tampilan12.setText ( " arus = " + df.format ( I ) + "ampere" );
                            tampilan13.setText ( " Daya = " + df.format ( P ) + "watt" );









                }
            }}
        );
        btnWo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                CC = Double.parseDouble ( C.getText ( ).toString ( ) );

                if ( CC != 0 &&  LL !=0 ) {
                    CC = CC/1000000;
                    LL = LL/1000;
                    tampilan1.setText ( "  Wo = 1/(L C)^0,5" );
                    WoWo = LL * CC;
                    WoWo = Math.pow(WoWo,0.5);
                    WoWo = 1/WoWo;
                    tampilan2.setText ( " Wo = " + df.format ( WoWo ) + "rad/s" );

                }
            }}
        );
        btnWk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.########" );

                rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                CC = Double.parseDouble ( C.getText ( ).toString ( ) );

                if ( CC != 0 &&  rr !=0 ) {
                    CC = CC/1000000;


                    tampilan1.setText ( "  Wk = 1/(R C)^0,5" );
                    WkWk = rr * CC;
                    WkWk = 1/WkWk;
                    WkWk = Math.pow(WkWk,0.5);
                    tampilan2.setText ( " Wk = " + df.format ( WkWk ) + "rad/s" );
                }
            }}
        );
        btnfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                CC = Double.parseDouble ( C.getText ( ).toString ( ) );

                if ( CC != 0 &&  LL !=0 ) {
                    CC = CC/1000000;
                    LL = LL/1000;
                    tampilan1.setText ( " fo =Wo/ 2 pi;  Wo = 1/(L C)^0,5" );
                    WoWo = LL * CC;
                    WoWo = Math.pow(WoWo,0.5);
                    WoWo = 1/WoWo;
                    fofo = WoWo/6.28;
                    tampilan2.setText ( " fo = " + df.format ( fofo ) + "Hz" );

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
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                v.setText ( "" );
                r.setText ( "" );
                L.setText ( "" );
                C.setText ( "" );

                freq.setText ( "" );
                fo.setText ( "" );
                Wo.setText ( "" );
                omega.setText ( "" );

            }
        } );
    }
}
