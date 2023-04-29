package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class GeraklurusBeraturan extends AppCompatActivity {
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

    private EditText sao, sat, sbo, sbt, va, vb, t, L;
    private double saosao, satsat, sbosbo, sbtsbt,vava, vbvb, tt, sab,LL,ta,tb,dab;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geraklurus_beraturan);
        tampilan1 = findViewById(R.id.tvtampilan1);
        tampilan2 = findViewById(R.id.tvtampilan2);
        tampilan3 = findViewById(R.id.tvtampilan3);
        tampilan4 = findViewById(R.id.tvtampilan4);
        tampilan5 = findViewById(R.id.tvtampilan5);
        tampilan6 = findViewById(R.id.tvtampilan6);
        tampilan7 = findViewById(R.id.tvtampilan7);
        tampilan8 = findViewById(R.id.tvtampilan8);
        tampilan9 = findViewById(R.id.tvtampilan9);
        tampilan10 = findViewById(R.id.tvtampilan10);
        tampilan11 = findViewById(R.id.tvtampilan11);
        tampilan12 = findViewById(R.id.tvtampilan12);
        tampilan13 = findViewById(R.id.tvtampilan13);
        tampilan14 = findViewById(R.id.tvtampilan14);
        tampilan15 = findViewById(R.id.tvtampilan15);
        tampilan16 = findViewById(R.id.tvtampilan16);
        tampilan17 = findViewById(R.id.tvtampilan17);
        tampilan18 = findViewById(R.id.tvtampilan18);
        tampilan19 = findViewById(R.id.tvtampilan19);
        tampilan20 = findViewById(R.id.tvtampilan20);





        sao = findViewById(R.id.in_Sao);
        sat = findViewById(R.id.in_Sat);
        sbo = findViewById(R.id.in_Sbo);
        sbt = findViewById(R.id.in_Sbt);
        va = findViewById(R.id.in_Va);
        vb = findViewById(R.id.in_Vb);
        t = findViewById(R.id.in_t );
        L = findViewById(R.id.in_L );

        Button btnsat = findViewById ( R.id.btn_St );
        Button btnsbt = findViewById ( R.id.btn_sbt );
        Button btndab = findViewById ( R.id.btn_dab );
        Button btnvb = findViewById ( R.id.btn_Vt );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnsab = findViewById ( R.id.btn_Sab );
        Button btnglb = findViewById ( R.id.btn_glb );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnhapus = findViewById ( R.id.btn_Hapus );


        btninfo.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           tampilan1.setText(" Kalkulator ini digunakan untuk menghitung kasus: benda A dengan posisi awal Sao, posisi akhir Sat, kecepatan Va");
           tampilan2.setText("Benda B dengan posisi awal Sbo, posisi akhir Sbt, kecepatan vb");
           tampilan3.setText("Kasus 1:  benda A dan B dengan posisi awal berbeda, bergerak dengan arah sama tetapi besar kecepatan berbeda; suatu saat dua benda berimpit :sab");
           tampilan4.setText("Kasus 2:  benda A dan B dengan posisi awal berbeda, bergerak dengan arah berlawanan dengan besar kecepatan berbeda;suatu saat dua benda berimpit :sab");
           tampilan5.setText("Kasus 3:  hubungan perpindahan A dengan va, atau hubungan perpindahan B dengan vb");
           tampilan6.setText("Sat: jarak tempuh a setelah selang waktu t");
           tampilan7.setText("Sbt: jarak tempuh b setelah selang waktu t");
           tampilan8.setText("Sab: mengetahui posisi saat A dan B berpapasan/berimpit");
           tampilan9.setText("dab : jarak antara A dan B, setelah A atau B menemph jarak L");
           tampilan10.setText("L : jarak tempuh A atau B");
                }
        });
        btnsab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           DecimalFormat df = new DecimalFormat("#.#####");
             if
              (!sbo.getText ( ).toString ( ).equals ( "" )   &&
               !sao.getText ( ).toString ( ).equals ( "" )   &&
               !va.getText ( ).toString ( ).equals ( "" )  &&
               !vb. getText ( ).toString ( ).equals ( "" )) {
                   sbosbo = Double.parseDouble(sbo.getText().toString());
                   saosao = Double.parseDouble(sao.getText().toString());
                   vava   = Double.parseDouble(va.getText().toString());
                   vbvb   = Double.parseDouble(vb.getText().toString());

               tampilan1.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A)" +
                " bergerak kekiri dengan kecepatan Vb , setelah selang waktu t, A berpapasan dengan B");
               tampilan2.setText(" Sab = Va *  tab; tab = (sbo - sao)/(va + vb)");
                   tt =(sbosbo-saosao)/(vava+vbvb);
                  sab = vava*tt;
               sbtsbt = vbvb*tt;
               tampilan3.setText("waktu untuk berpapasan = tab = " + df.format(tt) + "s");
               tampilan4.setText("Jarak tempuh benda A = Sat = " + df.format(sab) + "m");
               tampilan5.setText("Jarak tempuh benda B = Sbt = " + df.format(sbtsbt) + "m");
                   if(vava>vbvb) {
                       tampilan7.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A)" +
                       " bergerak kekanan dengan kecepatan Vb , setelah selang waktu t, A berpapasan dengan B");
                       tampilan8.setText ( " Sab = Va *  tab; tab = (sbo - sao)/(va - vb)" );
                       tt = (sbosbo - saosao) / (vava - vbvb);
                       sab = vava * tt;
                       sbtsbt = vbvb * tt;
                       tampilan9.setText ( "waktu untuk berpapasan = tab = " + df.format ( tt ) + "s" );
                       tampilan10.setText ( "Jarak tempuh benda A = Sat = " + df.format ( sab ) + "m" );
                       tampilan11.setText ( "Jarak tempuh benda B = Sbt = " + df.format ( sbtsbt ) + "m" );
                   } else
                   if(vava<vbvb) {
                       tampilan7.setText ( "Benda A di 0, bergerak kekiri dengan kecepatan Va, benda B ada di sao (sebelah kanan A)" +
                               " bergerak kekiri dengan kecepatan Vb  dengan Vb > Va, setelah selang waktu t, B menhampiri A" );
                       tampilan8.setText ( " Sab = Va *  tab; tab = (sbo - sao)/(vb - va)" );
                       tt = (sbosbo-saosao ) / (vbvb - vava);
                       sab = vava * tt;
                       sbtsbt = vbvb * tt;
                       tampilan9.setText ( "waktu untuk berpapasan = tab = " + df.format ( tt ) + "s" );
                       tampilan10.setText ( "Jarak tempuh benda A = Sat = " + df.format ( sab ) + "m" );
                       tampilan11.setText ( "Jarak tempuh benda B = Sbt = " + df.format ( sbtsbt ) + "m" );
                   }
           }
           else if
               (!sbo.getText ( ).toString ( ).equals ( "" )   &&
                !va.getText ( ).toString ( ).equals ( "" )  &&
                !sao.getText ( ).toString ( ).equals ( "" )  &&
                !t. getText ( ).toString ( ).equals ( "" )) {

                   sbosbo = Double.parseDouble(sbo.getText().toString());
                   saosao = Double.parseDouble(sao.getText().toString());
                   vava   = Double.parseDouble(va.getText().toString());
                   tt     = Double.parseDouble(t.getText().toString());

               tampilan1.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A) bergerak kekanan Vb (tidak tahu), setelah selang waktu t, A berpapasan dengan B");
               tampilan2.setText(" Va - Vb = (Sbo - sao)/t ; Vb = Va - (sbo - sao)/t; sbt = vb * t");
               vbvb = vava - (sbosbo - saosao)/tt;
               sbtsbt = sbosbo + vbvb*tt;
               tampilan3.setText ( "kecepatan benda B, Vb = " + df.format ( vbvb ) + "m/s" );
               tampilan4.setText ( "Posisi benda B saat t (diukur dari O), Sbt =" + df.format ( sbtsbt ) + "m" );
                }}
        });
        btnsat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");

                if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                    !sao.getText ( ).toString ( ).equals ( "" )  &&
                    !t. getText ( ).toString ( ).equals ( "" )) {

                        saosao = Double.parseDouble(sao.getText().toString());
                        vava   = Double.parseDouble(va.getText().toString());
                        tt     = Double.parseDouble(t.getText().toString());

                    tampilan1.setText(" Sat = Sao + va t");
                    satsat =saosao + (vava*tt);
                    tampilan2.setText("Posisi benda A saat t, Sat =" + df.format(satsat) + "m");
                }
                else if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                     !t. getText ( ).toString ( ).equals ( "" )) {

                        vava   = Double.parseDouble(va.getText().toString());
                        tt     = Double.parseDouble(t.getText().toString());

                        tampilan1.setText ( " Sat = Sao + va t; Sao = 0; Sat = va t" );
                    satsat = vava * tt;
                    tampilan2.setText ( "Posisi benda A saat t, Sat =" + df.format ( satsat ) + "m" );
                }}
        });
        btnsbt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");

                if
                    (!vb.getText ( ).toString ( ).equals ( "" )   &&
                     !sbo.getText ( ).toString ( ).equals ( "" )  &&
                     !t. getText ( ).toString ( ).equals ( "" )) {

                        sbosbo = Double.parseDouble(sbo.getText().toString());
                        vbvb   = Double.parseDouble(vb.getText().toString());
                        tt     = Double.parseDouble(t.getText().toString());

                        tampilan1.setText(" Sbt = Sbo + vb t");
                    sbtsbt =sbosbo + (vbvb*tt);
                    tampilan2.setText("Posisi benda B saat t, Sbt =" + df.format(sbtsbt) + "m");
                }
                else if
                        (!vb.getText ( ).toString ( ).equals ( "" )   &&
                                !t. getText ( ).toString ( ).equals ( "" )) {

                            vbvb   = Double.parseDouble(vb.getText().toString());
                            tt     = Double.parseDouble(t.getText().toString());

                    tampilan1.setText ( " Sbt = Sbo + vb t; Sbo = 0; Sbt = vb t" );
                    sbtsbt = vbvb * tt;
                    tampilan2.setText ( "Posisi benda B saat t, Sbt =" + df.format ( sbtsbt ) + "m" );
                }
                else if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                     !sbo.getText ( ).toString ( ).equals ( "" )  &&
                     !t. getText ( ).toString ( ).equals ( "" )) {

                                sbosbo = Double.parseDouble(sbo.getText().toString());
                                vava   = Double.parseDouble(va.getText().toString());
                                tt     = Double.parseDouble(t.getText().toString());

                    tampilan1.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A) bergerak kekanan Vb, setelah selang waktu t, A berpapasan dengan B");
                    tampilan2.setText(" Va - Vb = (Sbo - sao)/t ; Vb = Va - (sbo - sao)/t; sbt = vb * t");
                    vbvb = vava - (sbosbo - saosao)/tt;

                    sbtsbt = sbosbo + vbvb*tt;
                    tampilan2.setText ( "Posisi benda B saat t (diukur dari O), Sbt =" + df.format ( sbtsbt ) + "m" );
                }
            }
        });
        btnvb.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");

                if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                     !sbo.getText ( ).toString ( ).equals ( "" )  &&
                     !t. getText ( ).toString ( ).equals ( "" )) {

                        sbosbo = Double.parseDouble(sbo.getText().toString());
                        vava   = Double.parseDouble(va.getText().toString());
                        tt     = Double.parseDouble(t.getText().toString());

                    tampilan1.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A) bergerak kekanan Vb, setelah selang waktu t, A berpapasan dengan B");
                    tampilan2.setText(" Va - Vb = (Sbo - sao)/t ; Vb = Va - (sbo - sao)/t");
                    vbvb = vava - (sbosbo/tt);
                    tampilan3.setText("Kecepatan benda B , Vb = " + df.format(vbvb) + "m/s");
                }}
        });
        btndab.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");

                if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                     !vb.getText ( ).toString ( ).equals ( "" )  &&
                     !L. getText ( ).toString ( ).equals ( "" )) {

                        vava = Double.parseDouble(va.getText().toString());
                        vbvb  = Double.parseDouble(vb.getText().toString());
                        LL     = Double.parseDouble(L.getText().toString());

                    tampilan1.setText("Benda A dan B di 0, bergerak kekanan dengan kecepatan va dan vb," +
                      " setelah salah satu sampai menempuh L; berapa jarak A dan B?");
                    tampilan2.setText(" ta = L/va; tb = L/vb;  ");
                    tampilan3.setText(" jika vb > va; tb = L/vb, Sat = va tb;  dab = L - Sat ");
                    tampilan4.setText(" jika va > vb; ta = L/va; Sbt = vb ta;  dab = L - Sbt  ");
                    if(vbvb > vava) {
                        tb = LL / vbvb;
                        satsat = vava * tb;
                        dab = LL - satsat;
                        tampilan6.setText ( "waktu B sampai finish, tb = " + df.format ( tb ) + "s" );
                        tampilan7.setText ( "jarak tempuh A , Sat = " + df.format ( satsat ) + "m" );
                        tampilan8.setText ( "jarak antara A dan B , dab = " + df.format ( dab ) + "m" );
                    } else
                    if(vbvb < vava) {
                        ta = LL / vava;
                        sbtsbt = vbvb * ta;
                        dab = LL - sbtsbt;
                        tampilan6.setText ( "waktu A sampai finish, ta = " + df.format ( ta ) + "s" );
                        tampilan7.setText ( "jarak tempuh B , Sbt = " + df.format ( sbtsbt ) + "m" );
                        tampilan8.setText ( "jarak antara A dan B , dab = " + df.format ( dab ) + "m" );
                }}}
        });
        btnt.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");

                if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                            !sao.getText ( ).toString ( ).equals ( "" )  &&
                            !sat. getText ( ).toString ( ).equals ( "" )) {

                        vava = Double.parseDouble(va.getText().toString());
                        saosao  = Double.parseDouble(sao.getText().toString());
                        satsat     = Double.parseDouble(sat.getText().toString());
                    tampilan1.setText ( "Benda A semula di sao, melaju dengan kecepatan va setelah selang waktu t berpindah di sat," );
                    tampilan2.setText ( " s = v t  " );
                    tampilan3.setText ( " sat - sao = va t " );
                    tampilan4.setText ( " t = (sat - sao)/va  " );
                    tt = (satsat - saosao) / vava;
                    tampilan6.setText ( "waktu tempuh, t = " + df.format ( tt ) + "s" );
                } else
                if
                    (!va.getText ( ).toString ( ).equals ( "" )   &&
                     !sat. getText ( ).toString ( ).equals ( "" )) {

                        vava = Double.parseDouble(va.getText().toString());
                        satsat     = Double.parseDouble(sat.getText().toString());
                    tampilan1.setText ( "Benda A semula di sao, melaju dengan kecepatan va setelah selang waktu t berpindah di sat," );
                    tampilan2.setText ( " s = v t  " );
                    tampilan3.setText ( " sat - sao = va t;   sao = 0 " );
                    tampilan4.setText ( " t = sat/va  " );
                    tt = satsat  / vava;
                    tampilan6.setText ( "waktu tempuh, t = " + df.format ( tt ) + "s" );
                }
                else
                 if
                     (!vb.getText ( ).toString ( ).equals ( "" )   &&
                      !sbo.getText ( ).toString ( ).equals ( "" )  &&
                      !sbt. getText ( ).toString ( ).equals ( "" )) {

                         vbvb = Double.parseDouble(vb.getText().toString());
                         sbosbo  = Double.parseDouble(sbo.getText().toString());
                         satsat     = Double.parseDouble(sat.getText().toString());
                      tampilan1.setText("Benda B semula di sbo, melaju dengan kecepatan vb setelah selang waktu t berpindah di sbt,");
                      tampilan2.setText(" s = v t  ");
                      tampilan3.setText(" sbt - sbo = vb t ");
                      tampilan4.setText(" t = (sbt - sbo)/vb  ");
                      tt = (sbtsbt-sbosbo)/vbvb;
                      tampilan6.setText ( "waktu tempuh, t = " + df.format ( tt ) + "s" );
                       }
                 else
                     if
                         (!vb.getText ( ).toString ( ).equals ( "" )   &&
                          !sbt. getText ( ).toString ( ).equals ( "" )) {

                             vbvb = Double.parseDouble(vb.getText().toString());
                             sbosbo  = Double.parseDouble(sbo.getText().toString());
                             satsat     = Double.parseDouble(sat.getText().toString());
                         tampilan1.setText ( "Benda B semula di sbo, melaju dengan kecepatan vb setelah selang waktu t berpindah di sbt," );
                         tampilan2.setText ( " s = v t  " );
                         tampilan3.setText ( " sbt - sbo = vb t ;  sbo = 0" );
                         tampilan4.setText ( " sbt = vb t " );
                         tampilan5.setText ( " t = sbt/vb " );
                         tt = sbtsbt / vbvb;
                         tampilan6.setText ( "waktu tempuh, t = " + df.format ( tt ) + "s" );
                     }
else

                         if
                             (!vb.getText ( ).toString ( ).equals ( "" )   &&
                             !sbo.getText ( ).toString ( ).equals ( "" )  &&
                             !va. getText ( ).toString ( ).equals ( "" )) {

                                 vbvb = Double.parseDouble(vb.getText().toString());
                                 sbosbo  = Double.parseDouble(sbo.getText().toString());
                                 vava     = Double.parseDouble(va.getText().toString());
                             tampilan1.setText("Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A)" +
                                     " bergerak kekiri dengan kecepatan Vb , setelah selang waktu t, A berpapasan dengan B");
                             tampilan2.setText(" Sab = Va *  tab; tab = (sbo - sao)/(va + vb)");
                             tt =(sbosbo-saosao)/(vava+vbvb);
                             sab = vava*tt;
                             sbtsbt = vbvb*tt;
                             tampilan3.setText("waktu untuk berpapasan = tab = " + df.format(tt) + "s");
                             tampilan4.setText("Jarak tempuh benda A = Sat = " + df.format(sab) + "m");
                             tampilan5.setText("Jarak tempuh benda B = Sbt = " + df.format(sbtsbt) + "m");
                             if(vava>vbvb) {
                                 tampilan7.setText ( "Benda A di 0, bergerak kekanan dengan kecepatan Va, benda B ada di sbo (sebelah kanan A)" +
                                         " bergerak kekanan dengan kecepatan Vb  dengan Va > Vb, setelah selang waktu t, A berpapasan dengan B" );
                                 tampilan8.setText ( " Sab = Va *  tab; tab = (sbo - sao)/(va - vb)" );
                                 tt = (sbosbo - saosao) / (vava - vbvb);
                                 sab = vava * tt;
                                 sbtsbt = vbvb * tt;
                                 tampilan9.setText ( "waktu untuk berpapasan = tab = " + df.format ( tt ) + "s" );
                                 tampilan10.setText ( "Jarak tempuh benda A = Sat = " + df.format ( sab ) + "m" );
                                 tampilan11.setText ( "Jarak tempuh benda B = Sbt = " + df.format ( sbtsbt ) + "m" );
                                } else
                             if(vava<vbvb) {
                                 tampilan7.setText ( "Benda A di 0, bergerak kekiri dengan kecepatan Va, benda B ada di sao (sebelah kanan A)" +
                                         " bergerak kekiri dengan kecepatan Vb  dengan Vb > Va, setelah selang waktu t, B menhampiri A" );
                                 tampilan8.setText ( " Sab = Va *  tab; tab = (sbo - sao)/(vb - va)" );
                                 tt = (sbosbo-saosao ) / (vbvb - vava);
                                 sab = vava * tt;
                                 sbtsbt = vbvb * tt;
                                 tampilan9.setText ( "waktu untuk berpapasan = tab = " + df.format ( tt ) + "s" );
                                 tampilan10.setText ( "Jarak tempuh benda A = Sat = " + df.format ( sab ) + "m" );
                                 tampilan11.setText ( "Jarak tempuh benda B = Sbt = " + df.format ( sbtsbt ) + "m" );
                             }
                       }
            }
        });


        btnglb.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( GeraklurusBeraturan.this , GerakLurus.class );
                startActivity ( intent ); }
        } );
        btnhapus.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tampilan1.setText("");
                tampilan2.setText("");
                tampilan3.setText("");
                tampilan4.setText("");
                tampilan5.setText("");
                tampilan6.setText("");
                tampilan7.setText("");
                tampilan8.setText("");
                tampilan9.setText("");
                tampilan10.setText("");
                tampilan11.setText("");
                tampilan12.setText("");
                tampilan13.setText("");
                tampilan14.setText("");
                tampilan15.setText("");
                tampilan16.setText("");
                tampilan17.setText("");
                tampilan18.setText("");
                tampilan19.setText("");
                tampilan20.setText("");

                sao.setText("");
                sat.setText("");
                sbo.setText("");
                sbt.setText("");
                va.setText("");
                vb.setText("");
                t.setText("");
                L.setText("");

            }
        });
    }
}


