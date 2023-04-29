package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Momentum extends AppCompatActivity {
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

    private EditText ma, mb, va1, va2, vb1, vb2, F, dt, g, h, h1,h2;
    private Double mama, mbmb, va1va1, va2va2, vb1vb1, vb2vb2, FF, dtdt, gg, hh,h1h1,h2h2, I;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_momentum );

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
        va1 = findViewById ( R.id.in_va1 );
        va2 = findViewById ( R.id.in_va2 );
        vb1 = findViewById ( R.id.in_vb1 );
        vb2 = findViewById ( R.id.in_vb2 );
        F = findViewById ( R.id.in_F );
        dt = findViewById ( R.id.in_dt );
        g = findViewById ( R.id.in_g );
        h = findViewById ( R.id.in_h );
        h1 = findViewById ( R.id.in_h1 );
        h2 = findViewById ( R.id.in_h2 );

        Button btnkekal = findViewById ( R.id.btn_Kekal );
        Button Lenting = findViewById ( R.id.btn_Lenting );
        Button Lentingsebagian = findViewById ( R.id.btn_Lentingsebagian );
        Button Taklenting = findViewById ( R.id.btn_Taklenting );
        Button btnF = findViewById ( R.id.btn_F );
        Button btndt = findViewById ( R.id.btn_dt );
        Button btnvp = findViewById ( R.id.btn_v );

        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnimpuls = findViewById ( R.id.btn_alfa );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Momentum" );
                tampilan2.setText ( "kalkulator momentum digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Kecepatan sebelum/setelah tumbukan" );
                tampilan4.setText ( " 2. uji peluru untuk menentukan kecepatan peluru" );
                tampilan5.setText ( " 3. Impuls" );
                tampilan6.setText ( " 4. gaya impulsif dan selang waktu" );
                tampilan7.setText ( " variabel yang digunakan" );
                tampilan8.setText ( " ma : massa benda A" );
                tampilan9.setText ( " mb : massa benda B" );
                tampilan10.setText ( " Va1 : kecepatan benda A sebelum tumbukan " );
                tampilan11.setText ( " Va2 : kecepatan benda A setelah tumbukan" );
                tampilan12.setText ( " Vb1 : kecepatan benda B sebelum tumbukan" );
                tampilan13.setText ( " Vb2 : kecepatan benda B setelah tumbukan " );
                tampilan14.setText ( " t : selang waktu " );
                tampilan15.setText ( " F : gaya impulsif rata-rata" );
                tampilan16.setText ( " h : tinggi ayunan balistik uji peluru" );
                tampilan16.setText ( " h1 : tinggi jatuh bebas" );
                tampilan16.setText ( " h2 : tinggi pantulan" );


            }});

        btnkekal.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


                 if

                      (!ma.getText ( ).toString ( ).equals ( "" )   &&
                      !va1.getText ( ).toString ( ).equals ( "" )  &&
                      !va2.getText ( ).toString ( ).equals ( "" )  &&
                       !mb.getText ( ).toString ( ).equals ( "" )) {

                         mama = Double.parseDouble(ma.getText().toString());
                         mbmb = Double.parseDouble(mb.getText().toString());
                         va1va1 = Double.parseDouble(va1.getText().toString());
                         va2va2 = Double.parseDouble(va2.getText().toString());

                     tampilan1.setText ( "  Momentum total sebelum tumbukan = momentum total setelah tumbukan" );
                     tampilan2.setText ( " ma va1 + mb vb1 = ma va2 + mb vb2" );
                     tampilan3.setText ( "  vb1 = 0, maka vb2 = ma va1- ma va2/mb" );
                     tampilan4.setText ( "  vb2 =  (va1 - va2)* ma /mb" );
                     vb2vb2 = (va1va1 - va2va2) * mama/mbmb ;

                    tampilan5.setText ( "vb2 = " + df.format ( vb2vb2 ) + "m/s" );


                } else if

                     (!ma.getText ( ).toString ( ).equals ( "" )   &&
                             !vb1.getText ( ).toString ( ).equals ( "" )  &&
                             !vb2.getText ( ).toString ( ).equals ( "" )  &&
                             !mb.getText ( ).toString ( ).equals ( "" )) {

                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                     vb1vb1 = Double.parseDouble ( vb1.getText ( ).toString ( ) );
                     vb2vb2 = Double.parseDouble ( vb2.getText ( ).toString ( ) );

                     tampilan1.setText ( "  Momentum total sebelum tumbukan = momentum total setelah tumbukan" );
                     tampilan2.setText ( " ma va1 + mb vb1 = ma va2 + mb vb2" );
                     tampilan3.setText ( "  va1 = 0, maka va2 = mb vb1- mb vb2/ma" );
                     tampilan4.setText ( "  va2 =  (vb1 - vb2)* mb /ma" );
                     va2va2 = (vb1vb1 - vb2vb2) * mbmb / mama;

                     tampilan5.setText ( "va2 = " + df.format ( va2va2 ) + "m/s" );

                 }   }}
        );

        Lenting.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                vb1vb1 = Double.parseDouble ( vb1.getText ( ).toString ( ) );

                tampilan1.setText ( "  Pada peristiwa tumbukan lenting sempurna berlaku kekelan momentum dan kekekalan energi " );
                tampilan2.setText ( " va2 = (ma - mb) va1/(ma + mb) + 2 mb vb1/(ma + mb) " );
                tampilan3.setText ( " vb2 = 2 ma va1/(ma + mb) + (mb - ma) vb1/(ma + mb) " );

                va2va2 = (mama - mbmb) * va1va1 / (mama + mbmb) + 2 * mbmb * vb1vb1 / (mama + mbmb);
                vb2vb2 = 2 * mama * va1va1 / (mama + mbmb) + (mbmb - mama) * vb1vb1 / (mama + mbmb);
                tampilan4.setText ( " va2 = " + df.format ( va2va2 ) + "m/s" );
                tampilan5.setText ( "vb2 = " + df.format ( vb2vb2 ) + "m/s" );
            }}
            );


        Lentingsebagian.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                vb1vb1 = Double.parseDouble ( vb1.getText ( ).toString ( ) );

                tampilan1.setText ( " Pada peristiwa tumbulan lenting sebagian berlaku hukum kekekalan momentum tetapi tidak berlaku kekekalan energi   b2 = (mava1 + mbvb1 -mava2)/mb" );
                tampilan2.setText ( " ma va1 + mb vb1 = mava2 + mbvb2" );
                tampilan3.setText ( " va2 = (mava1 + mbvb1 - mbvb2)/ma" );
                tampilan4.setText ( " vb2 = (mava1 + mbvb1 -mava2)/mb" );
                va2va2 = (mama * va1va1 + mbmb * vb1vb1 - mbmb * vb2vb2) / mama;
                vb2vb2 = (mama * va1va1 + mbmb * vb1vb1 - mama * va2va2) / mbmb;
                tampilan5.setText ( " va2 = " + df.format ( va2va2 ) + "m/s" );
                tampilan6.setText ( "vb2 = " + df.format ( vb2vb2 ) + "m/s" );
            }
        }
        );
        Taklenting.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                vb1vb1 = Double.parseDouble ( vb1.getText ( ).toString ( ) );

                tampilan1.setText ( " Hukum kekekalan momentum" );
                tampilan2.setText ( " momentum total sebelum tumbukan = momentum total setelah tumbukan" );
                tampilan3.setText ( " ma va1 + mb vb1 = ma va2 + mb vb2;" );
                tampilan4.setText ( " va1 = vb1 = 0, maka vb2 = - ma va2/mb" );
                tampilan5.setText ( " maka vb2 = - ma va2/mb" );

                va2va2 = (mama * va1va1 + mbmb * vb1vb1) / (mama+mbmb);
                vb2vb2 = va2va2;
                tampilan6.setText ( " va2 = " + df.format ( va2va2 ) + "m/s" );
                tampilan7.setText ( "vb2 = " + df.format ( vb2vb2 ) + "m/s" );
            }
        }
        );
        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                va2va2 = Double.parseDouble ( va2.getText ( ).toString ( ) );
                dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                tampilan1.setText ( "impuls = perubahan momentum; F dt = m(va2 -va1), F =m(va2 -va1)/dt " );
                tampilan2.setText ( "gaya impulsif rata-rata: " );
                FF = mama*(va2va2-va1va1)/dtdt;
                tampilan3.setText ( " F = " + df.format ( FF ) + "N" );

            }
        }
        );
        btndt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                va2va2 = Double.parseDouble ( va2.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                tampilan1.setText ( "impuls = perubahan momentum; F dt = m(va2 -va1), dt =m(va2 -va1)/F " );
                tampilan2.setText ( "selang waktu berlangsungnya gaya impulsif:" );
                dtdt = mama*(va2va2-va1va1)/FF;
                tampilan3.setText ( " dt = " + df.format ( dtdt ) + "s" );
            }
        }
        );
        btnvp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
               if
                (!ma.getText ( ).toString ( ).equals ( "" )   &&
                 !mb.getText ( ).toString ( ).equals ( "" )  &&
                  !g.getText ( ).toString ( ).equals ( "" )  &&
                  !h.getText ( ).toString ( ).equals ( "" )) {

                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                tampilan1.setText ( "Mengukur kecepatan peluru dengan bandul balistik" );
                tampilan2.setText ( " Peluru yang ditembakkan bersarang dalam bandul kayu " );
                tampilan3.setText ( "0,5 ma va^2  = (ma + mb)gh" );
                tampilan4.setText ( " va2 = {2(ma + mb)gh/ma)}^0,5" );
                va2va2 = 2*gg*hh*(mama+mbmb)/mama;
                va2va2 = Math.pow(va2va2,0.5);
                tampilan5.setText ( " va2 = vp = " + df.format (va2va2 ) + "m/s" );

            } else if
                    (!ma.getText ( ).toString ( ).equals ( "" )   &&
                     !mb.getText ( ).toString ( ).equals ( "" )  &&
                    !vb2.getText ( ).toString ( ).equals ( "" )) {

                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        vb2vb2 = Double.parseDouble ( vb2.getText ( ).toString ( ) );

             tampilan1.setText ( " ma va1 + mb vb1 = (ma + mb) vb2" );
             tampilan1.setText ( " vb1 = 0" );
             tampilan1.setText ( " va1 = (ma + mb) vb2/ma" );
             va1va1 = (mama + mbmb)*vb2vb2/mama;

             tampilan2.setText ( " va1 = vp = " + df.format (va1va1 ) + "m/s" );
        }}} );
        btnimpuls.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    (!F.getText ( ).toString ( ).equals ( "" )   &&
                    !dt.getText ( ).toString ( ).equals ( "" )) {

                        FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                    tampilan1.setText ( "impuls = F dt  " );
                    I = FF * dtdt;
                    tampilan2.setText ( " I = " + df.format ( dtdt ) + "s" );

                } else if
                    (!ma.getText ( ).toString ( ).equals ( "" )   &&
                    !va1.getText ( ).toString ( ).equals ( "" )  &&
                    !va2.getText ( ).toString ( ).equals ( "" )) {

                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        va1va1 = Double.parseDouble ( va1.getText ( ).toString ( ) );
                        va2va2 = Double.parseDouble ( va2.getText ( ).toString ( ) );

                    tampilan1.setText ( "impuls = perubahan momentum; I = F dt = m(va2 -va1) " );
                    I = mama * (va2va2 - va1va1);
                    tampilan2.setText ( " I = " + df.format ( I ) + "Ns" );
                } else if
                    (!mb.getText ( ).toString ( ).equals ( "" )   &&
                            !vb1.getText ( ).toString ( ).equals ( "" )  &&
                            !vb2.getText ( ).toString ( ).equals ( "" )) {

                        mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        vb1vb1 = Double.parseDouble ( vb1.getText ( ).toString ( ) );
                        vb2vb2 = Double.parseDouble ( vb2.getText ( ).toString ( ) );

                    tampilan1.setText ( "impuls = perubahan momentum; I = F dt = m(vb2 -vb1) " );
                    I = mbmb * (vb2vb2 - vb1vb1);
                    tampilan2.setText ( " I = " + df.format ( I ) + "Ns" );

                } else if
                (!ma.getText ( ).toString ( ).equals ( "" )   &&
                                !h1.getText ( ).toString ( ).equals ( "" )  &&
                                !g.getText ( ).toString ( ).equals ( "" )  &&
                                !h2.getText ( ).toString ( ).equals ( "" )) {

                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    h1h1 = Double.parseDouble ( h1.getText ( ).toString ( ) );
                    h2h2 = Double.parseDouble ( h2.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "impuls = perubahan momentum " );
                    tampilan2.setText ( " laju benda jatuh dari ketinggian: " );
                    tampilan3.setText ( " V1 = (2gh1)^0,5,  V2 =(2gh2)^0,5 " );
                    va1va1 =2*gg*h1h1;
                    va1va1 = Math.pow(va1va1,0.5);
                    tampilan4.setText ( " v1 = " + df.format ( va1va1 ) + "m/s" );
                    va2va2 =2*gg*h2h2;
                    va2va2 = Math.pow(va2va2,0.5);
                    tampilan5.setText ( " v2 = " + df.format ( va2va2 ) + "m/s" );
                    tampilan6.setText ( "I = F dt = m(v2 - v1) " );
                    tampilan7.setText ( "ingat, v1 berlawanan arah dengan v2 " );
                    I = mama * (va2va2+ va1va1);
                    tampilan8.setText ( " I = " + df.format ( I ) + "Ns" );
                }
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
                va1.setText ( "" );
                va2.setText ( "" );
                vb1.setText ( "" );
                vb2.setText ( "" );
                F.setText ( "" );
                dt.setText ( "" );
                g.setText ( "" );
                h.setText ( "" );
            }
        } );
    }
}
