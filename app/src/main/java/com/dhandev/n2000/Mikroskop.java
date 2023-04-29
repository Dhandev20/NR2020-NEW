package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Mikroskop extends AppCompatActivity {
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
    private TextView m1;
    private TextView m2;
    private TextView fob, fok, sob, Mob, Mok, L;
    private EditText in_fob, in_fok, in_sob, in_mob, in_mok, in_L;
    private Double fobfob, fokfok, sobsob,soksok, LL;
    private Double mobmob,  mokmok, Siob, Siok, result;
//variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_mikroskop );

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
        m1 = findViewById ( R.id.tvtampilan3 );
        m2 = findViewById ( R.id.tvtampilan4 );
        fob = findViewById ( R.id.fob );
        fok = findViewById ( R.id.fok );
        sob = findViewById ( R.id.sob );
        L = findViewById ( R.id.R2 );
        Mok = findViewById ( R.id.Mok );
        Mob = findViewById ( R.id.Mob );


        in_fob = findViewById ( R.id.in_fob );
        in_fok = findViewById ( R.id.in_fok );
        in_sob = findViewById ( R.id.in_sob );
        in_L = findViewById ( R.id.in_R2 );
        in_mok = findViewById ( R.id.in_mok );
        in_mob = findViewById ( R.id.in_mob );

        fob.setText ( Html.fromHtml ( "f<small><sub>ob</sub></small>=" ) );
        fok.setText ( Html.fromHtml ( "f<small><sub>ok</sub></small>=" ) );
        sob.setText ( Html.fromHtml ( "S<small><sub>ob</sub></small>=" ) );
        Mok.setText ( Html.fromHtml ( "M<small><sub>ok</sub></small>=" ) );
        Mob.setText ( Html.fromHtml ( "M<small><sub>ob</sub></small>=" ) );



        Button rileks = findViewById ( R.id.bbesar );
        Button akomodasi = findViewById ( R.id.akomodasi_maks );
        Button bfob = findViewById ( R.id.bfob );
        Button bfok = findViewById ( R.id.bfok );
        Button bsob = findViewById ( R.id.bsob );
        Button bsok = findViewById ( R.id.bsok );
        Button bL = findViewById ( R.id.btn_L );
        Button Hapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Mikroskop" );
                tampilan2.setText ( " Penggunaan mikroskop : mata rilek dan mata berakomodasi maksimum" );
                tampilan3.setText ( " Mata berakomodasi maksimum : bayangan yang dibentuk oleh lensa objektif harus terletak di ruang I lensa okuler (di antara Ook dan fok ). Hal ini bertujuan agar bayangan akhir yang dibentuk lensa okuler tepat pada titik dekat mata pengamat. " );
                tampilan4.setText ( " Mata rileks :Agar mata pengamat dalam menggunakan mikroskop tidak berakomodasi, maka lensa okuler harus diatur/digeser supaya bayangan yang diambil oleh lensa objektif tepat jatuh pada fokus lensa okuler" );
                tampilan5.setText ( " Variabel yang digunakan:" );
                tampilan6.setText ( " fob : jarak fokus lensa obyektif" );
                tampilan7.setText ( " fok : jarak fokus lensa okuler" );
                tampilan8.setText ( " Sob : jarak benda terhadap lensa obyektif" );
                tampilan9.setText ( " Sok : jarak benda (bayangan dari lensa obyektif) terhadap lensa okuler" );
                tampilan10.setText ( " L  : panjang tubulus atau panjang mikroskop " );
                tampilan11.setText ( " M.rileks : perbesaran total atau perbesaran mikroskop dengan mata rileks" );
                tampilan12.setText ( " M. akom : perbesaran total atau perbesaran mikroskop dengan mata berakomodasi maksimum" );
                tampilan13.setText ( " Mob : perbesaran lensa obyektif\"" );
                tampilan14.setText ( " Mok : perbesaran lensa okuler\"" );
                tampilan15.setText ( " " );

            }});


        rileks.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                if
                    ( !in_sob.getText ( ).toString ( ).equals ( "" ) &&
                      !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                        !in_fok.getText ( ).toString ( ).equals ( "" ) &&
                        !in_L.getText ( ).toString ( ).equals ( "" )) {
                    sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );
                    fobfob = Double.parseDouble (in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                    LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );
                    tampilan1.setText ( "  Lensa obyektif" );
                    tampilan2.setText ( "  1/fob = 1/soob +1/siob" );
                    tampilan3.setText ( "  Siob = Soob*fob/(Soob - fob)" );
                    tampilan4.setText ( "  Perbesaran lensa obyektif" );
                    tampilan5.setText ( "  Mob = siob/soob" );
                    tampilan6.setText ( "  Lensa okuler:" );
                    tampilan7.setText ( "  jarak obyek okuler = panjang tubulus - jarak bayangan obyektif" );
                    tampilan8.setText ( "  Sook = L - Siob" );
                    tampilan9.setText ( "  Jarak bayangan okuler" );
                    tampilan10.setText ( "  Siok = Sook*fok/(Sook - fok)" );
                    tampilan11.setText ( "  Perbesaran okuler Mok = Siok/Sook" );
                    tampilan12.setText ( "  M = |Mok * Mob|" );

                    Siob = sobsob * fobfob / (sobsob - fobfob);
                    mobmob= Siob / sobsob;
                    soksok = LL - Siob;
                    Siok = soksok* fokfok / (soksok - fokfok);
                    mokmok = Siok / soksok;
                    result = mobmob * mokmok;
                    if ( result < 0 ) {
                        result = -result;

                        tampilan13.setText ( "Siob = " + df.format ( Siob ) + "cm" + "; Mob = " + df.format ( mobmob ) + "kali" );
                        tampilan14.setText ( "Sook = " + df.format ( soksok ) + "cm" + "; Mok = " + df.format ( mokmok ) + "kali" );
                        tampilan15.setText ( "M = " + df.format ( result ) + "kali" );
                    } else
                        tampilan13.setText ( "Siob = " + df.format ( Siob ) + "cm" + "; Mob = " + df.format ( mobmob ) + "kali" );
                    tampilan14.setText ( "Sook = " + df.format ( soksok ) + "cm" + "; Mok = " + df.format ( mokmok ) + "kali" );
                    tampilan15.setText ( "M = " + df.format ( result ) + "kali" );
                }
        else if
                ( !in_sob.getText ( ).toString ( ).equals ( "" ) &&
                  !in_fok.getText ( ).toString ( ).equals ( "" )&&
                  !in_fob.getText ( ).toString ( ).equals ( "" )) {
                    sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );
                    fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                    fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );

                    Siob = sobsob * fobfob / (sobsob - fobfob);
                    mobmob = Siob / sobsob;
                    mokmok = 25 / fokfok;
                    result = mobmob * mokmok;
                    tampilan1.setText ( "  Lensa obyektif" );
                    tampilan2.setText ( "  1/fob = 1/soob +1/siob" );
                    tampilan3.setText ( "  siob = Soob *fob/(sob - fob)" );
                    tampilan4.setText ( "  Perbesaran lensa obyektif" );
                    tampilan5.setText ( "  Mob = siob/soob" );
                    tampilan6.setText ( "  Perbesaran lensa okuler" );
                    tampilan7.setText ( "  Mok = 25/fok" );
                    tampilan8.setText ( "  Perbesaran total" );
                    tampilan9.setText ( "  M = |Mok * Mob|" );
                    if ( result < 0 ) {
                        result = -result;
                        tampilan11.setText ( "Mob = Siob/Soob =" + df.format ( mobmob ) + "kali" );
                        tampilan12.setText ( "Mok = 25/fok = " + df.format ( mokmok ) + " kali" );
                        tampilan13.setText ( "M = Mob*Mok = " + df.format ( result ) + " kali" );
                    } else
                        tampilan11.setText ( "Mob = Siob/Soob =" + df.format ( mobmob ) + "kali" );
                        tampilan12.setText ( "Mok = 25/fok = " + df.format ( mokmok ) + " kali" );
                        tampilan13.setText ( "M = Mob*Mok = " + df.format ( result ) + " kali" );
                }
    }})
        ;

        akomodasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );

                tampilan1.setText ( "  Lensa obyektif" );
                tampilan2.setText ( "  1/fob = 1/soob +1/siob" );
                tampilan3.setText ( "  siob = Soob *fob/(soob - fob)" );
                tampilan4.setText ( "  Perbesaran lensa obyektif" );
                tampilan5.setText ( "  Mob = siob/soob" );
                tampilan6.setText ( "  Lensa okuler" );
                tampilan7.setText ( "  Mata berakomodasi maksimum, perbesarn oleh lensa okuler" +
                        " Mok = (25/fok) + 1" );
                tampilan8.setText ( "  Perbesaran total" );
                tampilan9.setText ( "  M = |Mok * Mob|" );


                Siob = sobsob * fobfob / (sobsob - fobfob);
                mobmob = Siob / sobsob;

                mokmok = (25 / fokfok) + 1;
                result = mobmob * mokmok;
                if ( result < 0 ) {
                    result = -result;

                    tampilan11.setText ( "Mob = Siob/Soob =" + df.format ( mobmob ) + "kali" );
                    tampilan12.setText ( "Mok = " + df.format ( mokmok ) + " kali" );
                    tampilan13.setText ( "M = Mob*Mok = " + df.format ( result ) + " kali" );
                } else
                    tampilan11.setText ( "Mob = Siob/Soob =" + df.format ( mobmob ) + "kali" );
                tampilan12.setText ( "Mok = " + df.format ( mokmok ) + " kali" );
                tampilan13.setText ( "M = Mob*Mok = " + df.format ( result ) + " kali" );
            }
        });
        bfob.setOnClickListener ( new View.OnClickListener ( ) {
                                     @Override
                                     public void onClick ( View view ) {
                                         DecimalFormat df = new DecimalFormat ( "#.##" );

                                         sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );
                                         mobmob = Double.parseDouble ( in_mob.getText ( ).toString ( ) );

                                             tampilan1.setText ( " fob = Siob * Soob/(Siob + Soob)" );
                                             tampilan2.setText ( "Siob = Mob * Soob" );
                                             tampilan3.setText ( "fob = Mob * Soob/(Mob + 1)" );
                                             result = mobmob * sobsob / (mobmob + 1);
                                             tampilan4.setText ( " fob=" + df.format ( result ) + "kali" );

                                     }
                                 }
               );
        bfok.setOnClickListener ( new View.OnClickListener ( ) {
                                     @Override
                                     public void onClick ( View view ) {
                                         DecimalFormat df = new DecimalFormat ( "#.##" );

                                         fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                                         sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );
                                         LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );


                                             Siob = sobsob * fobfob / (sobsob - fobfob);
                                             result = LL - Siob;

                                             tampilan1.setText ( " fok = L - Siob" );

                                             tampilan2.setText ( "Siob = Sob * fob/(Soob - fob)" );

                                             tampilan3.setText ( "fok =" + df.format ( result ) + "cm" );
                                     }
                                 }
        );

        bsob.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
                                          DecimalFormat df = new DecimalFormat ( "#.##" );

                                          if

                                              ( !in_fok.getText ( ).toString ( ).equals ( "" ) &&
                                                !in_fob.getText ( ).toString ( ).equals ( "" ) &&
                                                  !in_L.getText ( ).toString ( ).equals ( "" )) {
                                                  fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                                                  fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                                                  LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );



                                              tampilan1.setText ( " Soob = fob * Siob/(Siob -fob) " );
                                              tampilan2.setText ( "Siob = L - Sok = L - fok" );
                                              Siob = LL - fokfok;
                                              sobsob = fobfob * Siob / (Siob - fokfok);
                                              tampilan3.setText ( "Siob =" + df.format ( Siob ) + "cm" );
                                              tampilan1.setText ( "Sob =" + df.format ( sobsob ) + "cm" );

                                          } else if
                                              ( !in_fok.getText ( ).toString ( ).equals ( "" ) &&
                                                      !in_mob.getText ( ).toString ( ).equals ( "" ) &&
                                                      !in_L.getText ( ).toString ( ).equals ( "" )) {
                                                  fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                                                  mobmob = Double.parseDouble ( in_mob.getText ( ).toString ( ) );
                                                  LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );



                                                  tampilan1.setText ( " Soob = Mob/Siob " );

                                              tampilan2.setText ( "Siob = L -Sook = L - fok" );
                                              Siob = LL - fokfok;
                                              sobsob = mobmob / Siob;
                                              tampilan3.setText ( "Siob =" + df.format ( Siob ) + "cm" );
                                              tampilan4.setText ( "Soob =" + df.format ( sobsob ) + "cm" );

                                          } else if
                                              ( !in_mok.getText ( ).toString ( ).equals ( "" ) &&
                                                      !in_mob.getText ( ).toString ( ).equals ( "" ) &&
                                                      !in_L.getText ( ).toString ( ).equals ( "" )) {
                                                  mokmok = Double.parseDouble ( in_mok.getText ( ).toString ( ) );
                                                  mobmob = Double.parseDouble ( in_mob.getText ( ).toString ( ) );
                                                  LL = Double.parseDouble ( in_L.getText ( ).toString ( ) );

                                              tampilan1.setText ( " Soob = Mob/Siob " );
                                              tampilan2.setText ( "Siob = L - Sok = L - (25/Mok)" );
                                              Siob = LL - (25 / mokmok);
                                              sobsob = mobmob / Siob;
                                              tampilan3.setText ( "Siob =" + df.format ( Siob ) + "cm" );
                                              tampilan4.setText ( "Sob =" + df.format ( sobsob ) + "cm" );
                                          }

                                      }
                                  }
        );
        bL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

                fobfob = Double.parseDouble ( in_fob.getText ( ).toString ( ) );
                fokfok = Double.parseDouble ( in_fok.getText ( ).toString ( ) );
                sobsob = Double.parseDouble ( in_sob.getText ( ).toString ( ) );

                    Siob = sobsob * fobfob / (sobsob - fobfob);

                    result = Siob + fokfok ;
                    tampilan1.setText ( " L = Siob + fok" );

                    tampilan2.setText ( "Siob = Sob*fob/(Sob-fob) = " + df.format ( Siob ) + "cm" );
                    tampilan3.setText ( "L = Siob + fok = (Siob) + " + df.format ( result ) + "cm" );

            }});

        Hapus.setOnClickListener ( new View.OnClickListener ( ) {
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
                in_sob.setText ( "" );
                in_L.setText ( "" );
                in_mob.setText ( "" );
                in_mok.setText ( "" );

            }});

}

}
