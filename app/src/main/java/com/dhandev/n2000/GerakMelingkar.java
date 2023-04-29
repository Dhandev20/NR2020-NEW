package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class GerakMelingkar extends AppCompatActivity {
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
    private EditText r;
    private EditText T;
    private EditText Ti;
    private EditText W;
    private EditText f;
    private EditText m;
    private EditText s;
    private EditText ar;
    private EditText at;
    private EditText alfa;
    private EditText v;
    private EditText n;
    private EditText force;
    private Double rr;
    private Double TT;
    private Double TiTi;
    private Double WW;
    private Double ff;
    private Double mm, ss;
    private Double arar;
    private Double atat;
    private Double alfaalfa;
    private Double vv;
    private Double nn;
    private Double forceforce;
    private Double result;
    private Double reset;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gerak_melingkar );
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
        r = findViewById ( R.id.in_R );
        T = findViewById ( R.id.in_T );
        W = findViewById ( R.id.in_w );
        Ti = findViewById ( R.id.in_t );
        f = findViewById ( R.id.in_f );
        m = findViewById ( R.id.in_M );
        s = findViewById ( R.id.in_S );
        ar = findViewById ( R.id.in_ar );
        force = findViewById ( R.id.in_F );
        n = findViewById ( R.id.in_n );
        v = findViewById ( R.id.in_v );
        at = findViewById ( R.id.in_at );
        alfa = findViewById ( R.id.in_alfa );

        Button br = findViewById ( R.id.btn1 );
        Button bT = findViewById ( R.id.btn2 );
        Button bw = findViewById ( R.id.btn3 );
        Button balfa = findViewById ( R.id.btn4 );
        Button bm = findViewById ( R.id.btn5 );
        Button bs = findViewById ( R.id.btn6 );
        Button bt = findViewById ( R.id.btn7 );
        Button bar = findViewById ( R.id.btn8 );
        Button bv = findViewById ( R.id.btn9 );
        Button bat = findViewById ( R.id.btn10 );
        Button bf = findViewById ( R.id.btn11 );
        Button bF = findViewById ( R.id.btn12 );
        Button hapus = findViewById ( R.id.btnhapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Gerak melingkar, mencakup gerak melingkar dengan kecepatan sudut tetap maupun berubah." );
                tampilan2.setText ( " Variabel" );
                tampilan3.setText ( " R : Jar-jari lingkaran " );
                tampilan4.setText ( " S : panjang lintasan/keliling " );
                tampilan5.setText ( " W : dibaca omega : kecepatan sudut " );
                tampilan6.setText ( " T : perioda " );
                tampilan7.setText ( " f : frekuensi " );
                tampilan8.setText ( " M : massa" );
                tampilan9.setText ( " ar : percepatan sentripetal" );
                tampilan10.setText ( " F : gaya sentripetal " );
                tampilan11.setText ( " n : jumlah putaran " );
                tampilan12.setText ( " V : kecepatan linear " );
                tampilan13.setText ( " t : selang waktu " );
                tampilan14.setText ( " at : percepatan tangensial " );
                tampilan15.setText ( " alfa : percepatan sudut. " );


            }});


        br.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
             DecimalFormat df = new DecimalFormat ( "#.###" );


               if   ( !v.getText ( ).toString ( ).equals ( "" ) &&
                     !ar.getText ( ).toString ( ).equals ( "" )) {
                    vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                  arar = Double.parseDouble ( ar.getText ( ).toString ( ) );
                     result = Math.pow ( vv , 2 ) / arar;
                      tampilan1.setText ( " Percepatan sentripetal ar = v^2 /r" );
                      tampilan2.setText ( "  maka  r = v^2/ar" );
                      tampilan3.setText ( "r =" + df.format ( result ) + "m" );

             }else     if ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !T.getText ( ).toString ( ).equals ( "" ) ) {

                              vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                              TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                                result = vv * TT / 6.28;
                              tampilan1.setText ( "Perioda T = 2 pi r/v" );
                              tampilan2.setText ( " maka  r = T V/2 pi" );
                              tampilan3.setText ( "r =" + df.format ( result ) + "m" );

                }else  if ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !W.getText ( ).toString ( ).equals ( "" ) ) {
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );

                              result = vv / WW;
                            tampilan1.setText ( " v = W r, maka   r = v/w" );
                            tampilan2.setText ( "r =" + df.format ( result ) + "m" );

              } else if ( !ar.getText ( ).toString ( ).equals ( "" ) &&
                           !W.getText ( ).toString ( ).equals ( "" ) ) {
                              arar = Double.parseDouble ( ar.getText ( ).toString ( ) );
                                WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                result = Math.pow ( WW , 2 ) / arar;
                             tampilan1.setText ( " percepatan sentripetal ar = W^2/r, " );
                             tampilan2.setText ( " maka r = W^2/ar" );
                             tampilan3.setText ( "r =" + df.format ( result ) + "m" );

             } else if ( !alfa.getText ( ).toString ( ).equals ( "" ) &&
                         !at.getText ( ).toString ( ).equals ( "" ) ) {
                       alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                           atat = Double.parseDouble ( at.getText ( ).toString ( ) );
                           result = atat / alfaalfa;
                          tampilan1.setText ( "percepatan tangensial at = alfa * r" );
                          tampilan2.setText ( " maka r = at/alfa" );
                          tampilan3.setText ( "r =" + df.format ( result ) + "m" );

             } else if ( !v.getText ( ).toString ( ).equals ( "" ) &&
                         !f.getText ( ).toString ( ).equals ( "" ) ) {

                          vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                          ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                                            result = vv / (6.28 * ff);
                                            tampilan1.setText ( " v = W r = 2 pi f r, " );
                                            tampilan2.setText ( "  r = v/(2pi f)" );
                                            tampilan3.setText ( "r =" + df.format ( result ) + "m" );

              }else   if ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !m.getText ( ).toString ( ).equals ( "" ) &&
                             !force.getText ( ).toString ( ).equals ( "" ) ) {

                             vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                             mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                             forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                              result = mm * (Math.pow ( vv , 2 )) / forceforce;
                              tampilan1.setText ( "gaya sentripetal F = mv^2/r" );
                               tampilan2.setText ( " r = mv^2/F" );
                               tampilan3.setText ( "r =" + df.format ( result ) + "m" );
              }else      if ( !W.getText ( ).toString ( ).equals ( "" )&&
                                                !m.getText ( ).toString ( ).equals ( "" )&&
                                                !force.getText ( ).toString ( ).equals ( "" )) {

                                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                            mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                                            forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = forceforce / (mm * Math.pow ( WW , 2 ));
                                            tampilan1.setText ( " gaya sentripetal F = m W^2 r " );
                                            tampilan2.setText ( "  r = F/(m w^2)" );
                                            tampilan3.setText ( "r =" + df.format ( result ) + "m" );

                                        }else  if ( !at.getText ( ).toString ( ).equals ( "" )&&
                                                !alfa.getText ( ).toString ( ).equals ( "" )) {


                                                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                                atat = Double.parseDouble ( at.getText ( ).toString ( ) );


                                                    result = atat / alfaalfa;
                                                    tampilan1.setText ( "percepatan tangensial at = alfa r, " );
                                                    tampilan1.setText ( "r = at/alfa" );
                                                    tampilan2.setText ( "r =" + df.format ( result ) + "m" );

                                                }
                                            }
                                        }
        );
        bT.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
                                        DecimalFormat df = new DecimalFormat ( "#.###" );

                                    if ( !f.getText ( ).toString ( ).equals ( "" )) {

                                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                                        result = 1 / ff;
                                        tampilan1.setText ( "Perioda T = 1/f" );
                                        tampilan2.setText ( "T =" + df.format ( result ) + "s" );

                                    } else      if ( !v.getText ( ).toString ( ).equals ( "" )&&
                                            !r.getText ( ).toString ( ).equals ( "" )) {

                                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                                        result = 6.28 * rr / vv;
                                        tampilan1.setText ( "v = W r = 2 pi f r = 2pi r/T, " );
                                        tampilan2.setText ( " T = 2pi r/v" );
                                        tampilan3.setText ( "T =" + df.format ( result ) + "s" );

                                    } else
                                        if ( !W.getText ( ).toString ( ).equals ( "" )) {
                                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );

                                        result = 6.28 / WW;
                                        tampilan1.setText ( "kecepatan sudut W = 2 pi f = 2 pi/T" );
                                        tampilan2.setText ( " T = 2 pi /w" );
                                        tampilan3.setText ( "T =" + df.format ( result ) + "s" );

                                    }else     if ( !Ti.getText ( ).toString ( ).equals ( "" )&&
                                            !n.getText ( ).toString ( ).equals ( "" )) {

                                        TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );
                                        nn = Double.parseDouble ( n.getText ( ).toString ( ) );

                                        result = TiTi / nn;
                                        tampilan1.setText ( "perioda = waktu yg dipelukan sekali putaran, T = t/n" );
                                        tampilan2.setText ( "T =" + df.format ( result ) + "s" );

                                    }else      if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !ar.getText ( ).toString ( ).equals ( "" )) {


                                        arar = Double.parseDouble ( ar.getText ( ).toString ( ) );
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                                        result = 6.28 * Math.pow ( (rr / arar) , 0.5 );
                                        tampilan1.setText ( "ar = W^2 r = (2pi f)^2 r = (2pi /T)^2  r" );
                                        tampilan2.setText ( " T = 2 pi (r/ar)^0.5" );
                                        tampilan3.setText ( "T =" + df.format ( result ) + "s" );

                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !m.getText ( ).toString ( ).equals ( "" )&&
                                            !force.getText ( ).toString ( ).equals ( "" )) {

                                            mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                                            forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );
                                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                                            result = (6.28 * Math.pow ( (rr * mm / forceforce) , 0.5 ));
                                            tampilan1.setText ( " gaya sentripetal F = m ar = m W^2 r = m (2pi/T)^2  r" );
                                            tampilan2.setText ( "  T = (2 pi (mr/F)^0.5)" );
                                            tampilan3.setText ( "T =" + df.format ( result ) + "s" );

                                        }
                                    }
                                }
        );
        bw.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {

                                        DecimalFormat df = new DecimalFormat ( "#.###" );

                                    if ( !f.getText ( ).toString ( ).equals ( "" )) {

                                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                                            result = 6.28 * ff;
                                            tampilan1.setText ( "W = 2 pi f" );
                                            tampilan2.setText ( "W =" + df.format ( result ) + "rad/s" );

                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !v.getText ( ).toString ( ).equals ( "" )) {
                                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                            result = vv / rr;
                                            tampilan1.setText ( "W = v/r" );
                                            tampilan2.setText ( "W =" + df.format ( result ) + "rad/s" );

                                    }else  if ( !T.getText ( ).toString ( ).equals ( "" )) {
                                        TT= Double.parseDouble ( T.getText ( ).toString ( ) );

                                            result = 6.28 / TT;
                                            tampilan1.setText ( "W = 2 pi /T" );
                                            tampilan2.setText ( "W =" + df.format ( result ) + "rad/s" );

                                    }else  if ( !Ti.getText ( ).toString ( ).equals ( "" )&&
                                            !n.getText ( ).toString ( ).equals ( "" )) {
                                        TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );
                                        nn = Double.parseDouble ( n.getText ( ).toString ( ) );

                                            result = 6.28 * nn / TiTi;
                                            tampilan1.setText ( "W = 2 pi f, f = n/t, " );
                                            tampilan2.setText ( "W = 2 pi n/t" );
                                            tampilan3.setText ( "W =" + df.format ( result ) + "rad/s" );

                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !ar.getText ( ).toString ( ).equals ( "" )) {
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                        arar = Double.parseDouble ( ar.getText ( ).toString ( ) );

                                            result = Math.pow ( (arar / rr) , 0.5 );
                                            tampilan1.setText ( "ar = W^2 r, " );
                                            tampilan2.setText ( " W = (ar/r)^0.5" );
                                            tampilan3.setText ( "W =" + df.format ( result ) + "rad/s" );
                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !m.getText ( ).toString ( ).equals ( "" )&&
                                            !force.getText ( ).toString ( ).equals ( "" )) {
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                                        forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = Math.pow ( (forceforce / rr * mm) , 0.5 );
                                            tampilan1.setText ( " F = m ar = m W^2 r," );
                                            tampilan2.setText ( " W = (F/mr)^0.5" );
                                            tampilan4.setText ( "W =" + df.format ( result ) + "rad/s" );

                                        }
                                    }
                                }
        );
        bf.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
                                        DecimalFormat df = new DecimalFormat ( "#.###" );
                                    if ( !T.getText ( ).toString ( ).equals ( "" )) {

                                        TT = Double.parseDouble ( T.getText ( ).toString ( ) );

                                            result = 1 / TT;
                                            tampilan1.setText ( "f = 1/T" );
                                            tampilan2.setText ( "f =" + df.format ( result ) + "Hz" );
                                    }else  if ( !v.getText ( ).toString ( ).equals ( "" )&&
                                            !r.getText ( ).toString ( ).equals ( "" )) {
                                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                            result = vv / 6.28 * rr;
                                            tampilan1.setText ( " v = W r = 2pi f r," );
                                            tampilan2.setText ( " f = v/2pi r" );
                                            tampilan3.setText ( "f =" + df.format ( result ) + "Hz" );

                                    }else  if
                                          ( !W.getText ( ).toString ( ).equals ( "" )) {
                                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                            result = WW / 6.28;
                                            tampilan1.setText ( " W = 2 pi f," );
                                            tampilan2.setText ( " f = W/ 2 pi" );
                                            tampilan3.setText ( "f =" + df.format ( result ) + "Hz" );

                                    }else
                                        if ( !Ti.getText ( ).toString ( ).equals ( "" )&&
                                              !n.getText ( ).toString ( ).equals ( "" )) {
                                        TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );
                                        nn = Double.parseDouble ( n.getText ( ).toString ( ) );
                                            result = nn / TiTi;
                                            tampilan1.setText ( "f = n/t" );
                                            tampilan2.setText ( "f =" + df.format ( result ) + "Hz" );
                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !ar.getText ( ).toString ( ).equals ( "" )) {
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                        arar = Double.parseDouble ( ar.getText ( ).toString ( ) );

                                            result = (Math.pow ( (arar / rr) , 0.5 )) / 6.28;
                                            tampilan1.setText ( "ar = W^2 r = (2 pi f)^2  r, " );
                                            tampilan2.setText ( "f = (ar/r)^0.5  /2pi" );
                                            tampilan3.setText ( "f =" + df.format ( result ) + "Hz" );
                                    }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                            !m.getText ( ).toString ( ).equals ( "") &&
                                            !force.getText ( ).toString ( ).equals ("") ) {
                                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                                        forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = (Math.pow ( (forceforce / rr * mm) , 0.5 )) / 6.28;
                                            tampilan1.setText ( "F = m ar = m W^2 r " );
                                            tampilan2.setText ( "f = (F/mr)^0.5/ 2 pi" );
                                            tampilan3.setText ( "f =" + df.format ( result ) + "Hz" );

                                        }
                                    }
                                }
        );
        bm.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
                   DecimalFormat df = new DecimalFormat ( "#.###" );

                     if ( !force.getText ( ).toString ( ).equals ( "" )&&
                             !ar.getText ( ).toString ( ).equals ( "")) {
                             forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );
                              arar = Double.parseDouble ( ar.getText ( ).toString ( ) );

                                            result = forceforce / arar;
                                            tampilan1.setText ( "F =  m ar" );
                                            tampilan2.setText ( "m = F/ar" );
                                            tampilan3.setText ( "m =" + df.format ( result ) + "kg" );

                                     }else  if ( !v.getText ( ).toString ( ).equals ( "" )&&
                                             !r.getText ( ).toString ( ).equals ( "") &&
                                             !force.getText ( ).toString ( ).equals ("") ) {
                                         rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                         vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                         forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = forceforce * rr / Math.pow ( vv , 2 );
                                            tampilan1.setText ( "F =  m ar" );
                                            tampilan2.setText ( "m = F/ar;  ar = v^2/r" );
                                            tampilan3.setText ( "m = F .r/ v^2" );
                                            tampilan4.setText ( "m =" + df.format ( result ) + "kg" );
                                     }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                             !W.getText ( ).toString ( ).equals ( "") &&
                                             !force.getText ( ).toString ( ).equals ("") ) {
                                         rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                         WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                         forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = forceforce / (rr * Math.pow ( WW , 2 ));
                                            tampilan1.setText ( "F =  m ar" );
                                            tampilan2.setText ( "m =  F/ ar" );
                                            tampilan3.setText ( " ar = w^2 r" );
                                            tampilan4.setText ( "m = F/ r w^2" );
                                            tampilan5.setText ( "m =" + df.format ( result ) + "kg" );

                                     }else  if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                             !r.getText ( ).toString ( ).equals ( "") &&
                                             !force.getText ( ).toString ( ).equals ("") ) {
                                         rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                         ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                         forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = forceforce / (39.4383 * rr * Math.pow ( ff , 2 ));
                                            tampilan1.setText ( "F =  m ar" );
                                            tampilan2.setText ( "m =  F/ar" );
                                            tampilan3.setText ( "ar =  w^2 r" );
                                            tampilan4.setText ( " w =  2 pi f" );
                                            tampilan5.setText ( " m = F/(4 pi^2 * f^2  * r)" );
                                            tampilan6.setText ( "m =" + df.format ( result ) + "kg" );
                                     }else  if ( !r.getText ( ).toString ( ).equals ( "" )&&
                                             !T.getText ( ).toString ( ).equals ( "") &&
                                             !force.getText ( ).toString ( ).equals ("") ) {
                                         rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                         TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                                         forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = forceforce * Math.pow ( TT , 2 ) / (39.4383 * rr);
                                            tampilan1.setText ( "F =  m ar" );
                                            tampilan2.setText ( "m =  F/ar" );
                                            tampilan3.setText ( "ar =  w^2 r" );
                                            tampilan4.setText ( " w =  2 pi/ T" );
                                            tampilan5.setText ( "m = F T^2/(4 pi^2 * r)" );
                                            tampilan6.setText ( "m =" + df.format ( result ) + "kg" );


                                        }
                                    }
                                }
        );
        bs.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
                                        DecimalFormat df = new DecimalFormat ( "#.###" );
                                        if ( !W.getText ( ).toString ( ).equals ( "" )&&
                                                !Ti.getText ( ).toString ( ).equals ( "")  ) {
                                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                            TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );


                                            result = WW * TiTi * 57.96;
                                            tampilan1.setText ( "s =  W t" );
                                            tampilan2.setText ( "s =" + df.format ( result ) + "deg" );

                                        }else
                                            if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                                !Ti.getText ( ).toString ( ).equals ( "")  ) {
                                                ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                                TiTi = Double.parseDouble (Ti.getText ( ).toString ( ) );

                                            result = 6.28 * 57.96 * ff * TiTi;
                                            tampilan1.setText ( "s = 2 pi f t" );
                                            tampilan2.setText ( "s =" + df.format ( result ) + "deg" );
                                        }else      if ( !T.getText ( ).toString ( ).equals ( "" )&&
                                                !Ti.getText ( ).toString ( ).equals ( "")  ) {
                                            TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                                            TiTi = Double.parseDouble (Ti.getText ( ).toString ( ) );

                                            result = 6.28 * 57.96 * TiTi / TT;
                                            tampilan1.setText ( "s = 2 pi  t/T" );
                                            tampilan2.setText ( "s =" + df.format ( result ) + "deg" );


                                        }
                                    }
                                }
        );

        bar.setOnClickListener ( new View.OnClickListener ( ) {
                                     @Override
                                     public void onClick ( View view ) {


                                         DecimalFormat df = new DecimalFormat ( "#.###" );

                                         if ( !force.getText ( ).toString ( ).equals ( "" )&&
                                                 !m.getText ( ).toString ( ).equals ( "")  ) {
                                             forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );
                                             mm = Double.parseDouble ( m.getText ( ).toString ( ) );

                                             result = forceforce / mm;
                                             tampilan1.setText ( "ar = F/m" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }else
                                             if ( !v.getText ( ).toString ( ).equals ( "" )&&
                                                 !r.getText ( ).toString ( ).equals ( "")  ) {
                                                 vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                                 rr = Double.parseDouble (r.getText ( ).toString ( ) );

                                             result = Math.pow ( vv , 2 ) / rr;
                                             tampilan1.setText ( "ar = v^2/r" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }else
                                             if ( !W.getText ( ).toString ( ).equals ( "" )&&
                                                 !r.getText ( ).toString ( ).equals ( "")  ) {
                                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                             rr = Double.parseDouble (r.getText ( ).toString ( ) );

                                             result = Math.pow ( WW , 2 ) * rr;
                                             tampilan1.setText ( "ar = w^2 * r" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }else
                                             if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                                 !r.getText ( ).toString ( ).equals ( "")  ) {
                                             ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                             rr = Double.parseDouble (r.getText ( ).toString ( ) );
                                             result = 39.4383 * rr * Math.pow ( ff , 2 );
                                             tampilan1.setText ( "ar = 4 pi^2 * r * f^2" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }else
                                             if ( !T.getText ( ).toString ( ).equals ( "" )&&
                                                 !r.getText ( ).toString ( ).equals ( "")  ) {
                                             TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                                             rr = Double.parseDouble (r.getText ( ).toString ( ) );
                                             result = 39.4383 * rr / Math.pow ( TT , 2 );
                                             tampilan1.setText ( "ar = 4 pi^2 * r / T^2" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }else
                                             if ( !Ti.getText ( ).toString ( ).equals ( "" )&&
                                                 !r.getText ( ).toString ( ).equals ( "") &&
                                                 !n.getText ( ).toString ( ).equals ( "") ) {
                                             TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );
                                             rr = Double.parseDouble (r.getText ( ).toString ( ) );
                                             nn = Double.parseDouble (n.getText ( ).toString ( ) );
                                             result = 39.4383 * rr * Math.pow ( (nn / TiTi) , 2 );
                                             tampilan1.setText ( "ar = 4 pi^2 *r * (n/T)^2" );
                                             tampilan2.setText ( "ar =" + df.format ( result ) + "m/ss" );

                                         }
                                     }
                                 }
        );
        bF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                     ( !ar.getText ( ).toString ( ).equals ( "" )&&
                        !m.getText ( ).toString ( ).equals ( "")  ) {
                    arar = Double.parseDouble ( ar.getText ( ).toString ( ) );
                    mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                    result = mm * arar;
                    tampilan1.setText ( " Gaya sentripetal:" );
                    tampilan2.setText ( " F = m*ar" );
                    tampilan3.setText ( " F = " + df.format ( result ) + "N" );

               } else     if

                        (!m.getText ( ).toString ( ).equals ( "") &&
                         !r.getText ( ).toString ( ).equals ( "") &&
                         !v.getText ( ).toString ( ).equals ( "") ) {
                        rr = Double.parseDouble (r.getText ( ).toString ( ) );
                        mm = Double.parseDouble (m.getText ( ).toString ( ) );
                        vv = Double.parseDouble (v.getText ( ).toString ( ) );
                    result = mm * Math.pow ( vv , 2 ) / rr;
                    tampilan1.setText ( " Gaya sentripetal:" );
                    tampilan2.setText ( " F = m * v^2/r" );
                    tampilan3.setText ( " F = " + df.format ( result ) + "N" );

                } else
                    if ( !m.getText ( ).toString ( ).equals ( "" )&&
                        !W.getText ( ).toString ( ).equals ( "") &&
                        !r.getText ( ).toString ( ).equals ( "") ) {
                    WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                    mm = Double.parseDouble (m.getText ( ).toString ( ) );
                    rr = Double.parseDouble (r.getText ( ).toString ( ) );
                    result = mm * Math.pow ( WW , 2 ) * rr;
                    tampilan1.setText ( "F = m * w^2 * r" );
                    tampilan2.setText ( "F =" + df.format ( result ) + "N" );

                } else if
                    ( !m.getText ( ).toString ( ).equals ( "" )&&
                        !r.getText ( ).toString ( ).equals ( "")&&
                        !f.getText ( ).toString ( ).equals ( "")){
                    ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                    mm = Double.parseDouble (m.getText ( ).toString ( ) );
                    rr = Double.parseDouble (r.getText ( ).toString ( ) );

                    result = mm * 39.4383 * rr * Math.pow ( ff , 2 );
                    tampilan1.setText ( "F =  m * 4 pi^2 * r * f^2" );
                    tampilan2.setText ( "F =" + df.format ( result ) + "N" );
                } else if  ( !m.getText ( ).toString ( ).equals ( "" )&&
                        !T.getText ( ).toString ( ).equals ( "")&&
                        !r.getText ( ).toString ( ).equals ( "")){
                    TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                    mm = Double.parseDouble (m.getText ( ).toString ( ) );
                    rr = Double.parseDouble (r.getText ( ).toString ( ) );

                    tampilan1.setText ( "F =  m * 4 pi^2 * r / T^2" );
                    result = mm * 39.4383 * rr / Math.pow ( TT , 2 );
                    tampilan2.setText ( "F =" + df.format ( result ) + "N" );
                } else if  ( !m.getText ( ).toString ( ).equals ( "" )&&
                        !Ti.getText ( ).toString ( ).equals ( "")&&
                        !r.getText ( ).toString ( ).equals ( "")&&
                        !n.getText ( ).toString ( ).equals ( "")){
                    TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );
                    mm = Double.parseDouble (m.getText ( ).toString ( ) );
                    nn = Double.parseDouble (n.getText ( ).toString ( ) );
                    rr = Double.parseDouble (r.getText ( ).toString ( ) );

                    result = mm * 39.4383 * rr * Math.pow ( (nn / TiTi) , 2 );
                    tampilan1.setText ( "F = m * 4 pi^2 *r * (n/t)^2" );
                    tampilan2.setText ( "F =" + df.format ( result ) + "N" );
                }
            }
        }
        );

        bv.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {


              DecimalFormat df = new DecimalFormat ( "#.###" );

                                        if ( !W.getText ( ).toString ( ).equals ( "" )&&
                                                !r.getText ( ).toString ( ).equals ( "")  ) {
                                            WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                                            result = WW * rr;
                                            tampilan1.setText ( "v = W * r" );
                                            tampilan2.setText ( "v =" + df.format ( result ) + "m/s" );

                                        }else
                                            if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                                !r.getText ( ).toString ( ).equals ( "")  ) {
                                                ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                                rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                                            result = 6.28 * ff * rr;
                                            tampilan1.setText ( "v = 2 pi f r" );
                                            tampilan2.setText ( "v =" + df.format ( result ) + "m/s" );

                                        }else  if ( !n.getText ( ).toString ( ).equals ( "" )&&
                                                !r.getText ( ).toString ( ).equals ( "") &&
                                                !Ti.getText ( ).toString ( ).equals ( "") ) {
                                            nn = Double.parseDouble ( n.getText ( ).toString ( ) );
                                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                            TiTi = Double.parseDouble ( Ti.getText ( ).toString ( ) );

                                            result = 6.28 * rr * nn / TiTi;
                                            tampilan1.setText ( "v = 2 pi f r" );
                                            tampilan2.setText ( "v = 2 pi r n/t" );
                                            tampilan4.setText ( "v =" + df.format ( result ) + "m/s" );

                                        }else
                                            if ( !ar.getText ( ).toString ( ).equals ( "" )&&
                                                  !r.getText ( ).toString ( ).equals ( "")  ) {
                                            arar = Double.parseDouble ( ar.getText ( ).toString ( ) );
                                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                            result = Math.pow ( (rr * arar) , 0.5 );
                                            tampilan1.setText ( "v = (r * ar)^0,5" );
                                            tampilan2.setText ( "v =" + df.format ( result ) + "m/s" );

                                        }else  if ( !m.getText ( ).toString ( ).equals ( "" )&&
                                                !r.getText ( ).toString ( ).equals ( "") &&
                                                !force.getText ( ).toString ( ).equals ( "") ) {
                                            mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                                            forceforce = Double.parseDouble ( force.getText ( ).toString ( ) );

                                            result = Math.pow ( (rr * forceforce / mm) , 0.5 );
                                            tampilan1.setText ( "v = (F r/m)^0.5" );
                                            tampilan2.setText ( "v =" + df.format ( result ) + "m/s" );
                                        }
                                    }
                                }
        );
        bat.setOnClickListener ( new View.OnClickListener ( ) {
                                     @Override
                                     public void onClick ( View view ) {


                                         DecimalFormat df = new DecimalFormat ( "#.###" );

                                         alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                         rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                                         result = alfaalfa * rr;
                                         tampilan1.setText ( "at = alfa * r" );
                                         tampilan2.setText ( "at =" + df.format ( result ) + "m/ss" );

                                     }
                                 }
        );
        balfa.setOnClickListener ( new View.OnClickListener ( ) {
                                       @Override
                                       public void onClick ( View view ) {


                                           DecimalFormat df = new DecimalFormat ( "#.###" );

                                           atat = Double.parseDouble ( at.getText ( ).toString ( ) );
                                           rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                                           result = atat / rr;
                                           tampilan1.setText ( "alfa = at/r" );
                                           tampilan2.setText ( "alfa =" + df.format ( result ) + "m/ss" );

                                       }
                                   }
        );


        bt.setOnClickListener ( new View.OnClickListener ( ) {
                                    @Override
                                    public void onClick ( View view ) {
                                        DecimalFormat df = new DecimalFormat ( "#.###" );
                                        if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                                !n.getText ( ).toString ( ).equals ( "")  ) {
                                            ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                            nn = Double.parseDouble ( n.getText ( ).toString ( ) );


                                            result = nn/ff;
                                            tampilan1.setText ( "f =  n/t" );
                                            tampilan2.setText ( "t =  n/f" );
                                            tampilan4.setText ( " t =" + df.format ( result ) + "s" );

                                        }else
                                        if ( !f.getText ( ).toString ( ).equals ( "" )&&
                                                !s.getText ( ).toString ( ).equals ( "")  ) {
                                            ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                                            ss = Double.parseDouble (s.getText ( ).toString ( ) );

                                            result = ss/(6.28 * 57.96 * ff );
                                            tampilan1.setText ( "s = 2 pi f t" );
                                            tampilan2.setText ( "t = S/(2 pi f )" );
                                            tampilan4.setText ( " t =" + df.format ( result ) + "s" );

                                        }else      if ( !T.getText ( ).toString ( ).equals ( "" )&&
                                                !s.getText ( ).toString ( ).equals ( "")  ) {
                                            TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                                            ss = Double.parseDouble (s.getText ( ).toString ( ) );

                                            result = ss*57.96 * TT/ 6.28;
                                            tampilan1.setText ( "s = 2 pi  t/T" );
                                            tampilan1.setText ( "t = T S/2 pi  " );
                                            tampilan2.setText ( " t =" + df.format ( result ) + "s" );


                                        }
                                    }
                                }
        );


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
                tampilan16.setText ( "" );
                tampilan17.setText ( "" );
                tampilan18.setText ( "" );
                tampilan19.setText ( "" );
                tampilan20.setText ( "" );
                r.setText ( "" );
                T.setText ( "" );
                Ti.setText ( "" );
                W.setText ( "" );
                f.setText ( "" );
                m.setText ( "" );
                s.setText ( "" );
                ar.setText ( "" );
                at.setText ( "" );
                alfa.setText ( "" );
                r.setText ( "" );
                v.setText ( "" );
                n.setText ( "" );
                force.setText ( "" );
            }
        } );
    }
}























