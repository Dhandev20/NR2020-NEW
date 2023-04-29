
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class GerakParabola extends AppCompatActivity {
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

    private EditText yo, vo, alfa, g, h, hmax, s, t, x, tmax;
    private Double yoyo, vovo,vox, voy, vxvx, vyvy, alfaalfa, gg, hh, hmaxhmax, ss, tt, tmaxtmax, laju, xx, yy;
    private Double K, L, M, N,P, a, b, c, sin,cos, tan;
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gerak_parabola );

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
        tampilan20 = findViewById ( R.id.tampilan20 );


        yo = findViewById ( R.id.in_yo );
        vo = findViewById ( R.id.in_vo );
        alfa = findViewById ( R.id.in_alfa );
        g = findViewById ( R.id.in_g );
        t = findViewById ( R.id.in_t );
        tmax = findViewById ( R.id.in_tmax );
        h = findViewById ( R.id.in_h );
        hmax = findViewById ( R.id.in_hmax );
        s = findViewById ( R.id.in_s );
        x = findViewById ( R.id.in_x );

        Button btnVo = findViewById ( R.id.btn_Vo );
        Button btnVox = findViewById ( R.id.btn_Vox );
        Button btnVoy = findViewById ( R.id.btn_Voy );
        Button btnVy = findViewById ( R.id.btn_Vy );
        Button btnV = findViewById ( R.id.btn_V );
        Button btnxy = findViewById ( R.id.btn_xy );
        Button btnHmax = findViewById ( R.id.btn_Hmax );
        Button btnS = findViewById ( R.id.btn_S );
        Button btnt = findViewById ( R.id.btn_t );
        Button btntmax = findViewById ( R.id.btn_tmax );
        Button btnlaju = findViewById ( R.id.btn_Laju );
        Button btnalfa = findViewById ( R.id.btn_alfa );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Gerak Parabola :" );
                tampilan2.setText ( "Soal yang dapat diselesaikan dengan kalkulator ini adalah berbagai bentuk soal gerak parabol. Mulai dari soal yang paling sering" +
                        "dijumpai, yaitu posisi dan kecepatan saat t, ketinggian maksismum, waktu untuk mencapai titik maksimum, dan jangkauan. Selain itu juga soal modifikasi " +
                        "peluru ditembakkan dari ketinggian yo, pesawat pembom, menentukan kecepatan awal untuk menembak sasaran sekauh x dengan tinggi h" );
                tampilan3.setText ( " Variabel yang digunakan" );
                tampilan4.setText ( " alfa : sudut elevasi" );
                tampilan5.setText ( " g : percepatan gravitasi bumi" );
                tampilan6.setText ( " hmax : ketinggian maksimum" );
                tampilan7.setText ( " t : selang waktu " );
                tampilan8.setText ( " tmax : selang waktu benda mencapai tinggi maksimum" );
                tampilan9.setText ( " Vy : kecepatan dalam arah y atau vertikal, pada saat t atau pada ketinggian h" );
                tampilan10.setText ( " S : jangkauan " );
                tampilan11.setText ( " yo : ketingian awal" );
                tampilan12.setText ( " Vox : kecepatan dalam arah X atau mendatar" );
                tampilan13.setText ( "Voy : kecepatan dalam arah Y atau vertikal " );
                tampilan14.setText ( " Vt : kecepatan (vektor) saat t" );
                tampilan15.setText ( " x,y : posisi benda saat t, atau pada jarak x" );
                tampilan16.setText ( " Laju : laju benda saat t" );
                tampilan17.setText ( " h : ketingian  benda saat t" );
                tampilan18.setText ( " x : jarak sasaran dari titik asal ke sumbu x" );
                tampilan19.setText ( " " );
                tampilan20.setText ( " " );

            }});

  btnVo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !x.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !h.   getText ( ).toString ( ).equals ( "" )) {

                      gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                      xx       = Double.parseDouble ( x.getText ( ).toString ( ) );
                      alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                      hh       = Double.parseDouble ( h.getText ( ).toString ( ) );

                    tampilan1.setText ( "Menghitung  kecepatan awal (dengan elevasi alfa) peluru untuk mencapai sasaran sejauh x dengan tinggi h" );
                    tampilan2.setText ( " perhitungan adalah waktu mencapai ketinggiah h sebelum mencapai hmax, berdasarkan waktu yang dibutuhkan mencapai jarak x " );
                    tampilan3.setText ( " t = x/Vo cos alfa" );
                    tampilan4.setText ( " h = Vo t sin alfa - 0,5 g t^2" );
                    tampilan5.setText ( " substitusikan " );
                    tampilan6.setText ( " Vo = {gx^2 /(2cos^2alfa *(x tan alfa-h)}^0,5" );

                    alfaalfa = alfaalfa / 57.32;
                    tan = Math.tan ( alfaalfa );
                    cos = Math.cos ( alfaalfa );
                    a = gg*Math.pow(xx,2);
                    b = 2*Math.pow(cos,2);
                    c = xx*tan-hh;
                    vovo = a/(b*c);
                    vovo = Math.pow(vovo,0.5);
                    tampilan8.setText ( " Vo = " + df.format ( vovo ) + " m/s" );

                    tampilan10.setText ( "Menghitung  kecepatan awal (dengan elevasi alfa) peluru untuk mencapai sasaran sejauh x dengan tinggi h setelah tercapai hmax" );
                    tampilan11.setText ( " dasar perhitungan adalah waktu mencapai jangkauan x + waktu jatuh dari ketinggian h = 2 kali tmax + t jatuh bebas dari ketinggian h" );
                    tampilan12.setText ( " 0 = (2 Vo^2 sin alfa cos alfa)/g - Vo cos alfa (2 h/g)^0,5 - x " );
                    tampilan13.setText ( " gunakan rumus ABC " );

                    sin = Math.sin ( alfaalfa );

                    a = 2*sin*cos / gg;
                    K = 2 * hh / gg;
                    L = Math.pow ( K , 0.5 );
                    b = -cos * L;
                    c = -xx;
                    M = Math.pow ( b , 2 );
                    N = M - (4 * a * c);
                    P = Math.pow ( N , 0.5 );
                    vovo = (-b + P) / (2 * a);
                    tampilan15.setText ( " Vo = " + df.format ( vovo ) + " m/s" );

                }else


                if
                    ( !g.getText ( ).toString ( ).equals ( "" ) &&
                            !alfa.getText ( ).toString ( ).equals ( "" ) &&
                            !hmax.getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        hmaxhmax = Double.parseDouble ( hmax.getText ( ).toString ( ) );
                    tampilan1.setText ( " menghitung  kecepatan awal berdasar tinggi maksimum" );
                    tampilan2.setText ( " hmax = (Vo sin alfa)^2/2g;  Vo = (2*g*hmax)^0,5 /sin alfa" );
                    alfaalfa = alfaalfa / 57.32;
                    vovo = (2 * gg * hmaxhmax);
                    vovo = Math.pow ( vovo , 0.5 );
                    vovo = vovo / Math.sin ( alfaalfa );
                    tampilan3.setText ( " vo = " + df.format ( vovo ) + " m/s" );

                } else if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !s.   getText ( ).toString ( ).equals ( "" )) {

                      gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                      alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                      ss       = Double.parseDouble ( s.getText ( ).toString ( ) );

                      tampilan1.setText ( " menghitung  kecepatan awal berdasarkan jangkauan maksimum" );
                      tampilan2.setText ( " Vo = (g * S /sin 2 alfa)^0,5" );
                            alfaalfa = alfaalfa / 57.32;
                                vovo = (gg * ss) / Math.sin ( 2 * alfaalfa );
                                vovo = Math.pow ( vovo , 0.5 );
                    tampilan3.setText ( " vo = " + df.format ( vovo ) + " m/s" );

                } else if
                    ( !g.getText ( ).toString ( ).equals ( "" ) &&
                      !s.getText ( ).toString ( ).equals ( "" )) {

                      gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                      ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                      tampilan1.setText ( " menghitung  kecepatan awal berdasarkan jangkauan maksimum dengan alfa 45 derajat" );
                      tampilan2.setText ( " Vo = (g * S /sin 2 alfa)^0,5  ; alfa = 45; Vo = (g * s)^0,5" );
                              alfaalfa = alfaalfa / 57.32;
                                  vovo = (gg * ss) ;
                                  vovo = Math.pow ( vovo , 0.5 );
                      tampilan3.setText ( " vo = " + df.format ( vovo ) + " m/s" );
                }
            }
        } );

        btnVox.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                tampilan1.setText ( " Vox = i vo cos alfa" );
                alfaalfa = alfaalfa / 57.32;
                vox = vovo * Math.cos ( alfaalfa );
                tampilan2.setText ( " vox = " + df.format ( vox ) + " i m/s" );

            }
        } );

        btnVoy.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                tampilan1.setText ( " Voy = j  vo sin alfa" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                tampilan2.setText ( " voy = " + df.format ( voy ) + " j m/s" );
            }
        }
        );
        btnVy.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !t.   getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        tt       = Double.parseDouble ( t.getText ( ).toString ( ) );


                        tampilan1.setText ( " Vy adalah kecepatan arah vertikal setelah selang waktu t" );
                        tampilan2.setText ( " Vy = j ( vo sin alfa) - g t" );
                                      alfaalfa = alfaalfa / 57.32;
                                           voy = vovo * Math.sin ( alfaalfa );
                                          vyvy = voy - (gg * tt);
                        tampilan2.setText ( " vy = " + df.format ( vyvy ) + " j m/s" );

            } else
                if
                    ( !g.getText    ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !h.getText    ( ).toString ( ).equals ( "" ) &&
                      !vo.getText   ( ).toString ( ).equals ( "" )) {

                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                    hh       = Double.parseDouble ( h.getText ( ).toString ( ) );

                    tampilan1.setText ( " Vy adalah kecepatan arah vertikal pada saat ketinggian h" );
                    tampilan2.setText ( " Vy = j ( vo sin alfa) - g t" );
                    tampilan3.setText ( " h = y = Voy*t - 0,5 g t^2;    0 = 0,5 g t^2 - Voy t + h" );
                    tampilan4.setText ( " gunakan rumus abc, t = (Voy +-(Voy^2  - 2 g h)^0,5)/g" );
                          alfaalfa = alfaalfa / 57.32;
                               voy = vovo * Math.sin ( alfaalfa );
                                 K = Math.pow ( voy , 2 ) - (2 * gg * hh);
                                 L = Math.pow ( K , 0.5 );
                                tt = (voy - L) / gg;
                              vyvy = voy - (gg * tt);
                    tampilan5.setText ( " t = " + df.format ( tt ) + " s" );
                    tampilan6.setText ( " kecepatan vertikal pada ketinggian h; Vy = " + df.format ( vyvy ) + " j m/s" );

                }}
                }
        );
        btnV.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !t.   getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        tt       = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " V = vx + vy" );
                            alfaalfa = alfaalfa / 57.32;
                                 voy = vovo * Math.sin ( alfaalfa );
                                 vox = vovo * Math.cos ( alfaalfa );
                                vyvy = voy - (gg * tt);
                    tampilan2.setText ( " v = " + df.format ( vox ) + " i m/s   +  " + df.format ( vyvy ) + " j m/s" );
                }else
                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !h.   getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {

                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                    hh       = Double.parseDouble ( h.getText ( ).toString ( ) );

                    tampilan1.setText ( " kecepatan  pada saat ketinggian h" );
                    tampilan2.setText ( " Vy = j ( vo sin alfa) - g t" );
                    tampilan3.setText ( " h = y = Voy*t - 0,5 g t^2;    0 = 0,5 g t^2 - Voy t + h" );
                    tampilan4.setText ( " gunakan rumus abc, t = (Voy +-(Voy^2  - 2 g h)^0,5)/g" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    vox = vovo * Math.cos ( alfaalfa );
                    K = Math.pow ( voy , 2 ) - (2 * gg * hh);
                    L = Math.pow ( K , 0.5 );
                    tt = (voy - L) / gg;
                    vyvy = voy - (gg * tt);

                    tampilan5.setText ( " t = " + df.format ( tt ) + " s" );
                    tampilan6.setText ( " Vx = " + df.format ( vox ) + " i m/s" );
                    tampilan7.setText ( " Vy = " + df.format ( vyvy ) + " j m/s" );

            }}
        }
        );
        btnlaju.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" ) &&
                      !yo.  getText ( ).toString ( ).equals ( "" )) {

                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                    yoyo     = Double.parseDouble ( yo.getText ( ).toString ( ) );

                    tampilan1.setText ( " Menentukan laju benda tiba di tanah" );
                    tampilan2.setText ( "dihitung berdasarkan jatuh bebas dari hmax" );
                    tampilan3.setText ( " hmax = yo+ Voy*tmax - 0,5 g tmax^2" );
                    tampilan4.setText ( " laju = (2ghmx)^0,5" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    tmaxtmax = voy / gg;
                    hh = yoyo + (voy * tmaxtmax) - (0.5 * gg * Math.pow ( tmaxtmax , 2 ));
                    laju = 2 * gg * hh;
                    laju = Math.pow ( laju , 0.5 );
                    tampilan5.setText ( " laju = " + df.format ( laju ) + " m/s" );
                } else
                    if
                        ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                          !alfa.getText ( ).toString ( ).equals ( "" ) &&
                          !t.   getText ( ).toString ( ).equals ( "" ) &&
                          !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        tt       = Double.parseDouble ( t.getText ( ).toString ( ) );

                        tampilan1.setText ( " Laju = ((vx)^2 + (vy)^2)^0,5" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                vox = vovo * Math.cos ( alfaalfa );
                vyvy = voy - (gg * tt);
                laju = Math.pow ( vox , 2 ) + Math.pow ( vyvy , 2 );
                laju = Math.pow ( laju , 0.5 );
                tampilan2.setText ( " Vx = Vox = " + df.format ( vox ) + "  m/s" );
                tampilan3.setText ( " Vy = " + df.format ( vyvy ) + "  m/s" );
                tampilan4.setText ( " Laju saat t = " + df.format ( laju ) + "  m/s" );

            } else
                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !h.   getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        hh = Double.parseDouble ( h.getText ( ).toString ( ) );

                    tampilan1.setText ( " Vy adalah kecepatan arah vertikal pada saat ketinggian h" );
                tampilan2.setText ( " Vy = j ( vo sin alfa) - g t" );
                tampilan3.setText ( " h = y = Voy*t - 0,5 g t^2;    0 = 0,5 g t^2 - Voy t + h" );
                tampilan4.setText ( " gunakan rumus abc, t = (Voy +-(Voy^2  - 2 g h)^0,5)/g" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                    vox = vovo * Math.cos ( alfaalfa );
                K = Math.pow ( voy , 2 ) - (2 * gg * hh);
                L = Math.pow ( K , 0.5 );
                tt = (voy - L) / gg;
                vyvy = voy - (gg * tt);
                    laju = Math.pow ( vox , 2 ) + Math.pow ( vyvy , 2 );
                    laju = Math.pow ( laju , 0.5 );
                tampilan5.setText ( " t = " + df.format ( tt ) + " s" );
                tampilan6.setText ( " Vx = " + df.format ( vox ) + " j m/s" );
                    tampilan7.setText ( " Vy = " + df.format ( vyvy ) + " j m/s" );
                    tampilan8.setText ( " Laju saat pada ketinggian h = " + df.format ( laju ) + "  m/s" );

            }}}
        );
        btnxy.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) { DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !x.   getText ( ).toString ( ).equals ( "" ) &&
                      !yo.  getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );

                        tampilan1.setText ( " menentukan posisi pada jarak x;  benda diluncurkan dari ketinggian yo " );
                        tampilan2.setText ( " y = yo + voy * t - 0,5 g t^2" );
                    tampilan3.setText ( " y = yo + vo sin (alfa) * t - 0,5 g t^2" );
                    tampilan4.setText ( "darimana nilai t diperoleh?" );
                    tampilan5.setText ( " dari x = vox*t" );
                    tampilan6.setText ( " t = x/vox" );
                             alfaalfa = alfaalfa / 57.32;
                                  voy = vovo * Math.sin ( alfaalfa );
                                   tt = xx/( vovo * Math.cos ( alfaalfa ));
                                   yy = yoyo + (voy * tt) - (0.5 * gg * Math.pow ( tt , 2 ));
                        tampilan7.setText ( " x = " + df.format ( xx ) + " m" + "   y = " + df.format ( yy ) + " m" );

                } else

                    if
                        ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                          !alfa.getText ( ).toString ( ).equals ( "" ) &&
                          !yo.  getText ( ).toString ( ).equals ( "" ) &&
                          !t.   getText ( ).toString ( ).equals ( "" ) &&
                          !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        yoyo     = Double.parseDouble ( yo.getText ( ).toString ( ) );
                        tt       = Double.parseDouble ( t.getText ( ).toString ( ) );

                        tampilan1.setText ( " menentukan posisi setelah t benda diluncurkan dari ketinggian yo " );
                        tampilan2.setText ( " x = vox*t;  y = yo + voy * t - 0,5 g t^2" );
                        alfaalfa = alfaalfa / 57.32;
                        voy = vovo * Math.sin ( alfaalfa );
                        xx = vovo * Math.cos ( alfaalfa );
                        yy = yoyo + (voy * tt) - (0.5 * gg * Math.pow ( tt , 2 ));
                        tampilan3.setText ( " x = " + df.format ( xx ) + " m" + "   y = " + df.format ( yy ) + " m" );


                    } else
                    if
                        ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                          !alfa.getText ( ).toString ( ).equals ( "" ) &&
                          !x.   getText ( ).toString ( ).equals ( "" ) &&
                          !vo.  getText ( ).toString ( ).equals ( "" )) {

                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        xx       = Double.parseDouble ( x.getText ( ).toString ( ) );

                        tampilan1.setText ( " menentukan posisi pada jarak x;  benda diluncurkan dari ketinggian yo = 0 " );
                        tampilan2.setText ( " x = vox*t;  y =  voy * t - 0,5 g t^2" );
                        alfaalfa = alfaalfa / 57.32;
                        voy = vovo * Math.sin ( alfaalfa );
                        tt = xx/( vovo * Math.cos ( alfaalfa ));
                        yy = (voy * tt) - (0.5 * gg * Math.pow ( tt , 2 ));
                        tampilan3.setText ( " selang waktu untuk mencapai posisi (x,y) = " + df.format (tt) + " s"   );
                        tampilan4.setText ( " x = " + df.format ( xx ) + " m" + "   y = " + df.format ( yy ) + " m" );

            } else
            if
                ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !t.   getText ( ).toString ( ).equals ( "" ) &&
                  !vo.  getText ( ).toString ( ).equals ( "" )) {
                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                    tt       = Double.parseDouble ( t.getText ( ).toString ( ) );
                tampilan1.setText ( " menentukan posisi setelah t benda diluncurkan dari ketinggian yo = 0 " );
                tampilan2.setText ( " x = vox*t;  y = yo + voy * t - 0,5 g t^2;  yo = 0" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                xx = vovo * Math.cos ( alfaalfa );
                yy = (voy * tt) - (0.5 * gg * Math.pow ( tt , 2 ));
                tampilan3.setText ( " x = " + df.format ( xx ) + " m" + "   y = " + df.format ( yy ) + " m" );
        }


            }}
        );
        btntmax.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );
                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                tt = Double.parseDouble ( t.getText ( ).toString ( ) );


                tampilan1.setText ( " tmax = vo sin alfa/g" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                tmaxtmax = voy / gg;
                tampilan2.setText ( " tmax = " + df.format ( tmaxtmax ) + " s" );
            }
        }
        );
        btnHmax.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !tmax.getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {
                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        tmaxtmax = Double.parseDouble ( tmax.getText ( ).toString ( ) );
                    tampilan1.setText ( " hmax = yo + voy * tmx - 0,5 g tmax^2" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    hh = yoyo + (voy * tt) - (0.5 * gg * Math.pow ( tt , 2 ));
                    tampilan2.setText ( " h = " + df.format ( hh ) + " m" );

                } else if
                        ( !g.getText ( ).toString ( ).equals ( "" ) &&
                       !alfa.getText ( ).toString ( ).equals ( "" ) &&
                         !yo.getText ( ).toString ( ).equals ( "" ) &&
                         !vo.getText ( ).toString ( ).equals ( "" )) {
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                            alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                            yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );

                    tampilan1.setText ( " hmax = yo + voy * tmax - 0,5 g tmax^2" );
                    tampilan2.setText ( " atau  hmax = 0,5 * Vo^2 * (sin alfa)^2 /g" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    tmaxtmax = voy / gg;
                    hh = yoyo + (voy * tmaxtmax) - (0.5 * gg * Math.pow ( tmaxtmax , 2 ));
                    tampilan3.setText ( " hmax = " + df.format ( hh ) + " m" );


                } else if
                ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !vo.  getText ( ).toString ( ).equals ( "" )) {
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );

                    tampilan1.setText ( " hmax = yo + voy * tmax - 0,5 g tmax^2;    yo = 0" );
                    tampilan2.setText ( " atau  hmax = 0,5 * Vo^2 * (sin alfa)^2 /g" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    tmaxtmax = voy / gg;
                    hh = (voy * tmaxtmax) - (0.5 * gg * Math.pow ( tmaxtmax , 2 ));
                    tampilan3.setText ( " hmax = " + df.format ( hh ) + " m" );


                } else if
                   ( !g. getText ( ).toString ( ).equals ( "" ) &&
                     !s. getText ( ).toString ( ).equals ( "" ) &&
                     !vo.getText ( ).toString ( ).equals ( "" )) {
                                gg   = Double.parseDouble ( g.getText ( ).toString ( ) );
                                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                                ss   = Double.parseDouble ( s.getText ( ).toString ( ) );
                    tampilan1.setText ( "  hmax = 0,5 * Vo^2 * (sin alfa)^2 /g" );
                    tampilan2.setText ( " S =  Vo^2 * (sin 2 alfa) /g" );
                    tampilan3.setText ( "sin 2 alfa)= g S/Vo^2" );
                    tampilan4.setText ( "hitung  alfa, selanjutnya tentukan hmax" );
                    a = Math.pow(vovo,2);
                    b = gg*ss/a;
                    b = b - 0.00000000000001;
                    alfaalfa = Math.asin(b);
                    alfaalfa=alfaalfa/2;
                    c = Math.sin(alfaalfa);
                    hh = a * Math.pow(c,2)/(2*gg);
                    tampilan5.setText ( " alfa = " + df.format ( alfaalfa ) + " rad" );
                    tampilan6.setText ( " hmax = " + df.format ( hh ) + " m" );
                }}}
        );
 btnS.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !g.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !yo.getText ( ).toString ( ).equals ( "" ) &&
                      !vo.getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );
                    tampilan1.setText ( " S = Vx * t;  t = 2 tmx + t jatuh setinggi yo" );
                    tampilan2.setText ( " tmax = (Vo sin alfa)/g" );
                    tampilan3.setText ( "  t jatuh = (2 yo/g)^0,5" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    vox = vovo * Math.cos ( alfaalfa );
                    tt = (2*yoyo)/gg;
                    tt = Math.pow(tt,0.5);
                    tmaxtmax = voy / gg;
                    ss = vox * ((2 * tmaxtmax) + tt);
                    tampilan4.setText ( " tmax = " + df.format ( tmaxtmax ) + "s" );
                    tampilan5.setText ( " tjatuh = " + df.format ( tt ) + "s" );
                    tampilan6.setText ( " S = " + df.format ( ss ) + " m" );
                } else
            if
                ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !vo.  getText ( ).toString ( ).equals ( "" )) {
                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );

                tampilan1.setText ( " S = Vx * t = Vox * t = Vox * 2 tmax" );
                tampilan2.setText ( " atau S = (Vo sin 2 alfa)/g " );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                vox = vovo * Math.cos ( alfaalfa );

                tmaxtmax = voy / gg;
                ss = vox * 2 * tmaxtmax;
                tampilan3.setText ( " tmax = " + df.format ( tmaxtmax ) + " m" );
                tampilan4.setText ( " S = " + df.format ( ss ) + " m" );
            } else  if
                    ( !g. getText ( ).toString ( ).equals ( "" ) &&
                      !yo.getText ( ).toString ( ).equals ( "" ) &&
                      !vo.getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );

                tampilan1.setText ( " S = Vo * t;  t dari jatuh bebas t = ( 2 yo/g)^0,5" );
                tt = 2 * yoyo / gg;
                tt = Math.pow ( tt , 0.5 );
                ss = vovo * tt;
                tampilan2.setText ( " t = " + df.format ( tt ) + " s" );
                tampilan3.setText ( " S = " + df.format ( ss ) + " m" );
            }}
        }
        );
        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
              if
                ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !yo.  getText ( ).toString ( ).equals ( "" ) &&
                  !vo.  getText ( ).toString ( ).equals ( "" )) {
                    gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                    alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                    yoyo     = Double.parseDouble ( yo.getText ( ).toString ( ) );

                tampilan1.setText ( " menentukan selang waktu benda tiba di tanah" );
                tampilan2.setText ( "dihitung berdasarkan jatuh bebas dari hmax" );
                tampilan3.setText ( " hmax = yo+ Voy*tmax - 0,5 g tmax^2" );
                tampilan4.setText ( " t = (2hmx/g)^0,5" );
                alfaalfa = alfaalfa / 57.32;
                voy = vovo * Math.sin ( alfaalfa );
                tmaxtmax = voy / gg;
                hh = yoyo + (voy * tmaxtmax) - (0.5 * gg * Math.pow ( tmaxtmax , 2 ));
                tt = 2*hh/gg;
                tt = Math.pow(tt,0.5);
                tampilan5.setText ( " t = " + df.format ( tt ) + " s" );


            } else
                if
                    ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !h.   getText ( ).toString ( ).equals ( "" ) &&
                      !vo.  getText ( ).toString ( ).equals ( "" )) {
                        gg       = Double.parseDouble ( g.getText ( ).toString ( ) );
                        alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        vovo     = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        hh       = Double.parseDouble ( h.getText ( ).toString ( ) );
                    tampilan1.setText ( " menentukan selang waktu benda mencapai ketinggian h" );
                    tampilan2.setText ( " h = y = Voy*t - 0,5 g t^2;    0 = 0,5 g t^2 - Voy t + h" );
                    tampilan3.setText ( " gunakan rumus abc, t = (Voy +-(Voy^2  - 2 g h)^0,5)/g" );
                    alfaalfa = alfaalfa / 57.32;
                    voy = vovo * Math.sin ( alfaalfa );
                    K = Math.pow ( voy , 2 ) - (2 * gg * hh);
                    L = Math.pow ( K , 0.5 );
                    tt = (voy - L) / gg;
                    tampilan4.setText ( " t = " + df.format ( tt ) + " s" );
                }
            else
            if
                ( !g. getText ( ).toString ( ).equals ( "" ) &&
                  !yo.getText ( ).toString ( ).equals ( "" )) {
                    gg   = Double.parseDouble ( g.getText ( ).toString ( ) );
                    yoyo = Double.parseDouble ( yo.getText ( ).toString ( ) );
                tampilan1.setText ( " waktu jatuh bebas, t = (2 h/g)^0,5  dalam hal ini h = yo" );
                tt = 2*yoyo/gg;
                tt = Math.pow(tt,0.5);
                tampilan2.setText ( " t = " + df.format ( tt ) + " m" );
        }}}
        );
        btnalfa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                alfaalfa = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                hmaxhmax = Double.parseDouble ( hmax.getText ( ).toString ( ) );
                ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                if
                    ( !g. getText ( ).toString ( ).equals ( "" ) &&
                      !s. getText ( ).toString ( ).equals ( "" ) &&
                      !vo.getText ( ).toString ( ).equals ( "" )) {
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        ss = Double.parseDouble ( s.getText ( ).toString ( ) ); tampilan1.setText ( " S = (vo^2  * sin 2alfa)/g" );
                    tampilan2.setText ( " alfa = 0,5 * asin(g*S/vo^2)" );
                    alfaalfa = 0.5 * Math.asin ( gg * ss / (vovo * vovo) );
                    alfaalfa = alfaalfa * 57.32;
                    tampilan3.setText ( " alfa  = " + df.format ( alfaalfa ) + " derajat" );

                } else if

                        ( !g.   getText ( ).toString ( ).equals ( "" ) &&
                          !hmax.getText ( ).toString ( ).equals ( "" ) &&
                          !vo.  getText ( ).toString ( ).equals ( "" )) {
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                            hmaxhmax= Double.parseDouble ( hmax.getText ( ).toString ( ) );
                            vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );

                     tampilan1.setText ( " alfa =  asin((2gh)^0,5/vo)" );
                    K = 2 * gg * hmaxhmax;
                    L = Math.pow ( K , 0.5 );
                    alfaalfa = Math.asin ( L / vovo );
                    alfaalfa = alfaalfa * 57.32;
                    tampilan2.setText ( " alfa  = " + df.format ( alfaalfa ) + " derajat" );
                }
            }
        } );


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
                yo.setText ( "" );
                x.setText ( "" );
                vo.setText ( "" );
                alfa.setText ( "" );
                g.setText ( "" );
                h.setText ( "" );
                s.setText ( "" );
                hmax.setText ( "" );
                t.setText ( "" );
                tmax.setText ( "" );
            }
        } );
    }
}