package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CerminLensa extends AppCompatActivity {
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
    private TextView m;
    private EditText so;
    private EditText si;
    private EditText f;
    private EditText r;
    private EditText h;
    private EditText p;
    private Double soso, sisi, ff, mm, rr, xx, yy, hh, hihi, pp;


    private Double result;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_cermin_lensa );

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


        so = findViewById ( R.id.in_so );
        si = findViewById ( R.id.in_si );
         r = findViewById ( R.id.in_r );
        f = findViewById ( R.id.in_f );
        h = findViewById ( R.id.in_I3 );
        p = findViewById ( R.id.in_P );

        Button bso = findViewById ( R.id.bso );
        Button bsi = findViewById ( R.id.bsi );
        Button bf = findViewById ( R.id.bfokus );
        Button P = findViewById ( R.id.btn_P );
        Button M = findViewById ( R.id.btn_M );
        Button hi = findViewById ( R.id.btn_hi );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Cermin dan lensa" );
                tampilan2.setText ( " Variabel yang digunakan" );
                tampilan3.setText ( " So : jarak benda" );
                tampilan4.setText ( " Si : jarak bayangan" );
                tampilan5.setText ( " f : jarak fokus" );
                tampilan6.setText ( " P : kekuatan lensa" );
                tampilan7.setText ( " M : perbesaran " );
                tampilan8.setText ( " h : tinggi benda" );
                tampilan9.setText ( " hi : tinggi bayangan" );
                tampilan10.setText ( " r : jari-jari kelengkungan cermin " );
                tampilan11.setText ( " " );
                tampilan12.setText ( " " );
                tampilan13.setText ( " " );
                tampilan14.setText ( " " );
                tampilan15.setText ( " " );
                tampilan16.setText ( " " );
                tampilan17.setText ( "  " );
                tampilan18.setText ( " " );
                tampilan19.setText ( " " );
                tampilan20.setText ( " " );


            }});
                bso.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if ( !si.getText ( ).toString ( ).equals ( "" ) &&
                      !f.getText ( ).toString ( ).equals ( "" )) {
                        sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );


                    tampilan1.setText ( "So = Si*f/(si - f)" );
                         soso = sisi * ff / (sisi - ff);
                    tampilan2.setText ( "M = Si/So" );
                           mm = sisi / soso;
                    tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                     if ( mm > 1 ) {
                        tampilan5.setText ( "Maya, tegak  diperbesar" );
                     } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                     } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Nyata, terbalik diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );


         } } else if
                ( !si.getText ( ).toString ( ).equals ( "" ) &&
                   !p.getText ( ).toString ( ).equals ( "" )) {
                        sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                        pp = Double.parseDouble ( p.getText ( ).toString ( ) );


                    tampilan1.setText ( "f (m) = 1/p, f (cm) = 100/p" );
                    tampilan2.setText ( "So = Si*f/(si - f)" );
                         ff = 100/pp;
                       soso = sisi * ff / (sisi - ff);
                    tampilan2.setText ( "M = Si/So" );
                         mm = sisi / soso;
                    tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Maya, tegak  diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Nyata, terbalik diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );


        } } else if
                ( !si.getText ( ).toString ( ).equals ( "" ) &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
                        sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( "f = r/2" );
                    tampilan2.setText ( "So = Si*f/(si - f)" );
                          ff = rr/2;
                    soso = sisi * ff / (sisi - ff);
                    tampilan2.setText ( "M = Si/So" );
                           mm = sisi / soso;
                    tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Maya, tegak  diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Nyata, terbalik diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                }}
            }
            });

       M.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if ( !so.getText ( ).toString ( ).equals ( "" ) &&
                        !f.getText ( ).toString ( ).equals ( "" )) {
                    soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                    ff = Double.parseDouble ( f.getText ( ).toString ( ) );


                    tampilan1.setText ( "Si = So*f/(so - f)" );
                    sisi = soso * ff / (soso - ff);
                    tampilan2.setText ( "M = Si/So" );
                    mm = sisi / soso;
                    tampilan3.setText ( "Si = " + df.format ( sisi )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );


                    } } else  if ( !si.getText ( ).toString ( ).equals ( "" ) &&
                                !f.getText ( ).toString ( ).equals ( "" )) {
                            sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                            ff = Double.parseDouble ( f.getText ( ).toString ( ) );


                            tampilan1.setText ( "So = Si*f/(si - f)" );
                            soso = sisi * ff / (sisi - ff);
                            tampilan2.setText ( "M = Si/So" );
                            mm = sisi / soso;
                            tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                            tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                            if ( mm > 1 ) {
                                tampilan5.setText ( "Nyata, terbalik diperbesar" );
                            } else if ( 1 > mm && mm > 0 ) {
                                tampilan5.setText ( "Nyata, terbalik dipekecil" );
                            } else if ( mm > -1 && mm < 0 ) {
                                tampilan5.setText ( "Maya, tegak diperkecil" );
                            } else if ( mm < -1 ) {
                                tampilan5.setText ( "Maya, tegak diperbesar" );


                            } } else if
                ( !so.getText ( ).toString ( ).equals ( "" ) &&
                                !p.getText ( ).toString ( ).equals ( "" )) {
                    soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                    pp = Double.parseDouble ( p.getText ( ).toString ( ) );


                    tampilan1.setText ( "f (m) = 1/p, f (cm) = 100/p" );
                    tampilan2.setText ( "So = Si*f/(si - f)" );
                    ff = 100/pp;
                    sisi = soso * ff / (soso - ff);
                    tampilan2.setText ( "M = Si/So" );
                    mm = sisi / soso;
                    tampilan3.setText ( "Si = " + df.format ( sisi )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );

              } } else if
                ( !si.getText ( ).toString ( ).equals ( "" ) &&
                                !p.getText ( ).toString ( ).equals ( "" )) {
                    sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                    pp = Double.parseDouble ( p.getText ( ).toString ( ) );


                    tampilan1.setText ( "f (m) = 1/p, f (cm) = 100/p" );
                    tampilan2.setText ( "So = Si*f/(si - f)" );
                    ff = 100/pp;
                    soso = sisi * ff / (sisi - ff);
                    tampilan2.setText ( "M = Si/So" );
                    mm = sisi / soso;
                    tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );


                    } } else if
                ( !si.getText ( ).toString ( ).equals ( "" ) &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                    sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                    rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( "f = r/2" );
                    tampilan2.setText ( "So = Si*f/(si - f)" );
                    ff = rr/2;
                    soso = sisi * ff / (sisi - ff);
                    tampilan2.setText ( "M = Si/So" );
                    mm = sisi / soso;
                    tampilan3.setText ( "So = " + df.format ( soso )+ "cm" );
                    tampilan4.setText ( "M = " + df.format ( mm )+ "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );

                    }}
            }
        });






        bsi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
          DecimalFormat df = new DecimalFormat ( "#.###" );


            if( !so.getText ( ).toString ( ).equals ( "" ) &&
                 !f.getText ( ).toString ( ).equals ( "" )) {
                       soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                         ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                tampilan1.setText ( "Si = f * So /(So - f)" );
                sisi = soso * ff / (soso - ff);
                tampilan2.setText ( "M = Si /So" );
                mm = sisi/soso;
                tampilan3.setText ( "Si = " + df.format ( sisi ) + "cm"  );
                tampilan4.setText ( "m = " + df.format ( mm ) +"kali" );

                if ( mm > 1 ) {
                    tampilan5.setText ( "Nyata, terbalik diperbesar" );
                } else if ( 1 > mm && mm > 0 ) {
                    tampilan5.setText ( "Nyata, terbalik dipekecil" );
                } else if ( mm > -1 && mm < 0 ) {
                    tampilan5.setText ( "Maya, tegak diperkecil" );
                } else if ( mm < -1 ) {
                    tampilan5.setText ( "Maya, tegak diperbesar" );

                }}


              if
                  ( !so.getText ( ).toString ( ).equals ( "" ) &&
                     !p.getText ( ).toString ( ).equals ( "" )) {
                         soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                           pp = Double.parseDouble ( p.getText ( ).toString ( ) );

                tampilan1.setText ( "Si = f * So /(So - f); f = 1/P" );
                       ff = 100/pp;
                     sisi = soso * ff / (soso - ff);
                tampilan2.setText ( "M = Si /So" );
                       mm = sisi / soso;
                tampilan3.setText ( " f = " + df.format ( ff ) + "cm" );
                  tampilan4.setText ( "Si = " + df.format ( sisi ) + "cm" );
                tampilan5.setText ( "m = " + df.format ( mm ) + "kali" );

                  if ( mm > 1 ) {
                      tampilan6.setText ( "Nyata, terbalik diperbesar" );
                  } else if ( 1 > mm && mm > 0 ) {
                      tampilan6.setText ( "Nyata, terbalik dipekecil" );
                  } else if ( mm > -1 && mm < 0 ) {
                      tampilan6.setText ( "Maya, tegak diperkecil" );
                  } else if ( mm < -1 ) {
                      tampilan6.setText ( "Maya, tegak diperbesar" );



                  }} if
                ( !so.getText ( ).toString ( ).equals ( "" ) &&
                   !r.getText ( ).toString ( ).equals ( "" )) {
                        soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                          rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                  tampilan1.setText ( "Si = f * So /(So - f); f = 1/P" );
                        ff = rr/2;
                      sisi = soso * ff / (soso - ff);
                  tampilan2.setText ( "M = Si /So" );
                        mm = sisi / soso;
                  tampilan3.setText ( "Si = " + df.format ( sisi ) + "cm" );
                  tampilan4.setText ( "m = " + df.format ( mm ) + "kali" );

                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );

                    } }}});

        bf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                sisi = Double.parseDouble ( si.getText ( ).toString ( ) );
                ff = soso * sisi / (soso + sisi);

                tampilan1.setText ( "f = Si * So /(So + Si)" );
                tampilan2.setText ( "f = " + df.format ( ff ) + "cm" );
            }
        } );
        P.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

            if
                ( !so.getText ( ).toString ( ).equals ( "" ) &&
                  !si.getText ( ).toString ( ).equals ( "" )) {
                    soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                    sisi = Double.parseDouble ( si.getText ( ).toString ( ) );

                    ff =  soso * sisi / (soso + sisi);
                    pp = 100/ff;
                tampilan1.setText ( "P = 1/f = (Si + So) /(So * Si)" );
                tampilan2.setText ( "f =" + df.format ( ff ) + "cm" );
                tampilan3.setText ( "P =" + df.format ( pp ) + "dioptri" );

            } else if
                    (!f.getText ( ).toString ( ).equals ( "" )) {
                    ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                pp = 100/ff;
                tampilan1.setText ( "P = 1/f " );
                tampilan2.setText ( "P =" + df.format (pp ) + "dioptri" );
        }}} );

       hi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !h.getText ( ).toString ( ).equals ( "" ) &&
                     !so.getText ( ).toString ( ).equals ( "" ) &&
                      !f.getText ( ).toString ( ).equals ( "" )) {
                        soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                        hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                    tampilan1.setText ( "Si = f * So /(So - f);  M = Si/So;  hi = M h" );
                          sisi = soso * ff / (soso - ff);
                            mm = sisi / soso;
                          hihi = mm * hh;
                    tampilan2.setText ( "Si = " + df.format ( sisi) + " cm" );
                    tampilan4.setText ( "m = " + df.format ( mm ) + "kali" );

                    tampilan3.setText ( "tinggi bayangan, hi = " + df.format ( hihi ) + "cm" );
                    if ( mm > 1 ) {
                        tampilan5.setText ( "Nyata, terbalik diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan5.setText ( "Nyata, terbalik dipekecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan5.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan5.setText ( "Maya, tegak diperbesar" );



                    } else if

                    ( !h.getText ( ).toString ( ).equals ( "" ) &&
                     !so.getText ( ).toString ( ).equals ( "" ) &&
                      !p.getText ( ).toString ( ).equals ( "" )) {
                        soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                        hh = Double.parseDouble ( h.getText ( ).toString ( ) );
                        pp = Double.parseDouble ( p.getText ( ).toString ( ) );

                        ff = 100/pp;
                     sisi = soso * ff / (soso - ff);
                       mm = sisi / soso;
                     hihi = mm * hh;
                 tampilan2.setText ( "m = " + df.format ( mm )+ "kali" );
                 tampilan1.setText ( "Si = f * So /(So - f);  M = Si/So;  hi = M h"  );
                 tampilan3.setText ( "Si = " + df.format ( sisi ) + "cm" );
                 tampilan4.setText ( "tinggi bayangan, hi = "+ df.format ( hihi )+"cm");
                     if ( mm > 1 ) {
                        tampilan5.setText ( "Maya, tegak  diperbesar" );
                        } else if ( 1 > mm && mm > 0 ) {
                         tampilan5.setText ( "Maya, tegak diperkecil" );
                     } else if ( mm > -1 && mm < 0 ) {
                         tampilan5.setText ( "Nyata, terbalik diperkecil" );
                     } else if ( mm < -1 ) {
                         tampilan5.setText ( "Nyata, terbalik diperbesar" );
                     }

         } else if

                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                     !so.getText ( ).toString ( ).equals ( "" ) &&
                      !h.getText ( ).toString ( ).equals ( "" )) {
                        soso = Double.parseDouble ( so.getText ( ).toString ( ) );
                          rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                          hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                         ff = rr/2;
                       sisi = soso * ff / (soso - ff);
                         mm = sisi / soso;
                       hihi = mm * hh;
                    tampilan3.setText ( "m = " + df.format ( mm )+ "kali" );
                    tampilan1.setText ( "Si = f * So /(So - f);  M = Si/So"  );
                    tampilan2.setText ( "f = r/2 ;  hi = M h "  );
                    tampilan4.setText ( "Si = " + df.format ( sisi ) + "cm" );
                    tampilan5.setText ( "tinggi bayangan, hi = "+ df.format ( hihi )+"cm");
                    if ( mm > 1 ) {
                        tampilan6.setText ( "Maya, tegak  diperbesar" );
                    } else if ( 1 > mm && mm > 0 ) {
                        tampilan6.setText ( "Maya, tegak diperkecil" );
                    } else if ( mm > -1 && mm < 0 ) {
                        tampilan6.setText ( "Nyata, terbalik diperkecil" );
                    } else if ( mm < -1 ) {
                        tampilan6.setText ( "Nyata, terbalik diperbesar" );
            }}}}
        });

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



                so.setText ( "" );
                si.setText ( "" );
                h.setText ( "" );
                r.setText ( "" );
                p.setText ( "" );
                f.setText ( "" );
            }
        });

    }}