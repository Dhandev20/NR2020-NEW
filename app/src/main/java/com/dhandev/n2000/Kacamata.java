package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Kacamata extends AppCompatActivity {
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

    private EditText Td, Tj, f, P;

    private Double TdTd, TjTj, ff,  PP;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kacamata );

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
        Td = findViewById ( R.id.in_Td );
        Tj = findViewById ( R.id.in_Tj );
        f = findViewById ( R.id.in_f );
        P = findViewById ( R.id.in_P );

         Button btnTd = findViewById ( R.id.btn_Td );
         Button btnTj = findViewById ( R.id.btn_Tj );
         Button btnf = findViewById ( R.id.btn_f );
         Button btnP = findViewById ( R.id.btn_P );
         Button btnlup = findViewById ( R.id.btn_Lup );
         Button hapus = findViewById ( R.id.btn_Hapus );
         Button info = findViewById ( R.id.btn_Info );

        info.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Kaca mata ada dua jenis:" );
                tampilan2.setText ( " 1. Plus untuk mengatasi rabun dekat" );
                tampilan3.setText ( " 2. Minus untuk mengatasi rabunjauh" );
                tampilan4.setText ( " Variabel yang digunakan:" );
                tampilan5.setText ( "" );
                tampilan6.setText ( " Td : titik dekat" );
                tampilan7.setText ( " Tj : titik jauha" );
                tampilan8.setText ( " f : jarak fokus " );
                tampilan9.setText ( " P : kekuatan lensa = 1/f" );
                tampilan10.setText ( "  " );
                tampilan11.setText ( " " );
                tampilan12.setText ( " " );
                tampilan13.setText ( " " );
                tampilan14.setText ( " " );
                tampilan15.setText ( " " );
            }});

        btnTd.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
               public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );
              if  (!P.getText ( ).toString ( ).equals ( "" ) ) {
                    PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                    tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm). " +
                            " Orang yang rabun dekat (pada umumnya orang tua) membutuhkan kaca mata positif untuk memperbaiki penglihatannya:" +
                            " P = 4 - 100/Td,   P: kekutan lensa (dioptri), Td : titik dekat (cm) mata rabun" );
                    tampilan2.setText ( " P Td = 4 Td - 100" );
                    tampilan3.setText ( " 4Td - P Td =  100" );
                    tampilan4.setText ( " Td =  100/(4-P)" );

                    TdTd = 100 / (4 - PP);

                    tampilan6.setText ( " Titik dekat = " + df.format ( TdTd ) + " cm" );
                }
            }});

       btnTj.setOnClickListener ( new View.OnClickListener ( ) {
              @Override
                 public void onClick ( View view ) {
                   DecimalFormat df = new DecimalFormat ( "#.##" );

                  if  (!P.getText ( ).toString ( ).equals ( "" ) ) {
                      PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                      tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm)." +
                              " Orang yang rabun jauh membutuhkan kaca mata minus untuk memperperbaiki penglihatannya:" +
                              "adalah P =  - 100/Tj,   P: kekutan lensa (dioptri), Tj : titik jauh (cm) mata rabun" );
                      tampilan2.setText ( " Tj = - 100/P" );
                      tampilan3.setText ( " Perhatikan di sini lensa negatif, maka P bernilai negatif" );

                      TjTj = - 100 / PP;

                      tampilan6.setText ( " Titik jauh = " + df.format ( TjTj ) + " cm" );

                  }  }
                      }
                );

      btnf.setOnClickListener ( new View.OnClickListener ( ) {
                 @Override
              public void onClick ( View view ) {
               DecimalFormat df = new DecimalFormat ( "#.##" );
               if  (!Td.getText ( ).toString ( ).equals ( "" ) ) {
                   TdTd = Double.parseDouble ( Td.getText ( ).toString ( ) );

                       tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm). " +
                         " Orang yang rabun dekat (pada umumnya orang tua) membutuhkan kaca mata positif untuk memperbaiki penglihatannya:" +
                         " P = 4 - 100/Td,   P: kekutan lensa (dioptri), Td : titik dekat (cm) mata rabun" );
                        tampilan2.setText ( " f = 100/P" );

                           PP = 4 - (100 / TdTd);
                            ff = 1 / PP;

                        tampilan4.setText ( " Panjang fokus f = " + df.format ( ff ) + " cm" );

                } else
                     if  (!P.getText ( ).toString ( ).equals ( "" ) ) {
                      TjTj = Double.parseDouble ( Tj.getText ( ).toString ( ) );

                         tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm)." +
                         " Orang yang rabun jauh membutuhkan kaca mata minus untuk memperperbaiki penglihatannya:" +
                           "adalah P =  - 100/Tj,   P: kekutan lensa (dioptri), Tj : titik jauh (cm) mata rabun" );
                         tampilan2.setText ( " f = - 100/P" );
                         tampilan3.setText ( " Perhatikan di sini lensa negatif, maka P bernilai negatif" );

                            PP = -100 / TjTj;
                            ff = 1 / PP;

                        tampilan4.setText ( " Panjang fokus f = " + df.format ( ff ) + " cm" );

                           }
                        }
                    }
                );

    btnP.setOnClickListener ( new View.OnClickListener ( ) {
                   @Override
               public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##" );

              if  (!Td.getText ( ).toString ( ).equals ( "" ) ) {
                  TdTd = Double.parseDouble ( Td.getText ( ).toString ( ) );

                  tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm). " +
                  " Orang yang rabun dekat (pada umumnya orang tua) membutuhkan kaca mata positif untuk memperbaiki penglihatannya:" +
                     " P = 4 - 100/Td,   P: kekutan lensa (dioptri), Td : titik dekat (cm) mata rabun" );
                    tampilan2.setText ( " f = 100/P" );

                   PP = 4 - (100 / TdTd);

                  tampilan4.setText ( " Kekuatan lensa P = " + df.format ( PP ) + " dioptri" );

            } else if (!Tj.getText ( ).toString ( ).equals ( "" ) ) {
                   TjTj = Double.parseDouble ( Tj.getText ( ).toString ( ) );
                    tampilan1.setText ( " Kacamata yang dibutuhkan untuk mengembalikan jarak baca normal (25cm)." +
                    " Orang yang rabun jauh membutuhkan kaca mata minus untuk memperperbaiki penglihatannya:" +
                      "adalah P =  - 100/Tj,   P: kekutan lensa (dioptri), Tj : titik jauh (cm) mata rabun" );
                     tampilan2.setText ( " f = - 100/P" );
                     tampilan3.setText ( " Perhatikan di sini lensa negatif, maka P bernilai negatif" );

                   PP = -100 / TjTj;

                     tampilan4.setText ( " Kekuatan lensa P = " + df.format ( PP ) + " dioptri" );

              } }
            }
                );
        btnlup.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                finish (); }
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
                        f.setText ( "" );
                        Td.setText ( "" );
                        Tj.setText ( "" );
                        P.setText ( "" );

                    }
                } );

            }};

