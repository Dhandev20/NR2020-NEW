package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Hidrostatik extends AppCompatActivity {
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
    private TextView tampilan21;
    private TextView tampilan22;
    private TextView tampilan23;
    private TextView tampilan24;
    private TextView tampilan25;
    private TextView tampilan26;

    private EditText rob, rof, Vb,  hu, hc, F1, F2, Wu, Wc, g, A1, A2, mb, r1,r2,po,ro1,ro2,hc1,hc2;
    private Double robrob, rofrof, VbVb, huhu,hchc, F1F1, F2F2, A1A1, A2A2, mbmb, gg, r1r1, r2r2, WuWu, WcWc,popo, p,ro11,ro22,hc11,hc22;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hidrostatik );

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
        tampilan21 = findViewById ( R.id.tampilan21 );
        tampilan22 = findViewById ( R.id.tampilan22 );
        tampilan23 = findViewById ( R.id.tampilan23 );
        tampilan24 = findViewById ( R.id.tampilan24 );
        tampilan25 = findViewById ( R.id.tampilan25 );
        tampilan26 = findViewById ( R.id.tampilan26 );
        rob = findViewById ( R.id.in_rob );
        rof = findViewById ( R.id.in_rof );
        Vb = findViewById ( R.id.in_Vb );
        Wu = findViewById ( R.id.in_Wu );
        Wc = findViewById ( R.id.in_Wc );
        F1 = findViewById ( R.id.in_F1 );
        F2 = findViewById ( R.id.in_F2 );
        g = findViewById ( R.id.in_g );
        hu = findViewById ( R.id.in_hu );
        hc = findViewById ( R.id.in_hc );
        mb = findViewById ( R.id.in_mb );
        r1 = findViewById ( R.id.in_r1 );
        r2 = findViewById ( R.id.in_r2 );
        A1 = findViewById ( R.id.in_A1 );
        A2 = findViewById ( R.id.in_A2 );
        po = findViewById ( R.id.in_po );
        ro1 = findViewById ( R.id.in_ro1 );
        ro2 = findViewById ( R.id.in_ro2 );
        hc1 = findViewById ( R.id.in_hc1 );
        hc2 = findViewById ( R.id.in_hc2 );


        Button btnp = findViewById ( R.id.btn_P );
        Button btnWc = findViewById ( R.id.btn_Wc );
        Button btnWu = findViewById ( R.id.btn_Wu );
        Button btnrob = findViewById ( R.id.btn_rob );
        Button btnrof = findViewById ( R.id.btn_rof );
        Button btnvb = findViewById ( R.id.btn_Vb );
        Button btnF1 = findViewById ( R.id.btn_F1 );
        Button btnF2 = findViewById ( R.id.btn_F2 );
        Button btnhc = findViewById ( R.id.btn_hc );
        Button btnhu = findViewById ( R.id.btn_hu );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnA1 = findViewById ( R.id.btn_A1 );
        Button btnA2 = findViewById ( R.id.btn_A2 );
        Button btnr1 = findViewById ( R.id.btn_r1 );
        Button btnr2 = findViewById ( R.id.btn_r2 );
        Button btnmb = findViewById ( R.id.btn_mb );
        Button btnro1 = findViewById ( R.id.btn_ro1 );
        Button btnro2 = findViewById ( R.id.btn_ro2 );
        Button btnhc1 = findViewById ( R.id.btn_hc1 );
        Button btnhc2 = findViewById ( R.id.btn_hc2 );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hidrostatik" );
                tampilan2.setText ( "kalkulator hidrostatik digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Hukum Archemedes [menghitung massa jenis fluida dengan pipa U, massa jenis benda terapung," +
                        " berat benda di udara dan dalam fluida, perhitungan gaya angkat balon udara]" );
                tampilan4.setText ( " 2. Hukum Pascal [dongkak hidrolik" );
                tampilan5.setText ( "  " );
                tampilan6.setText ( " Varibel yang digunakan" );
                tampilan7.setText ( " rob : massa jenis benda  atau massa jenis gas dalam balon" );
                tampilan8.setText ( " rof : massa fluida" );
                tampilan9.setText ( " Vb : volume benda atau volume balon" );
                tampilan10.setText ( "mb : massa benda   atau massa balon " );
                tampilan11.setText ( " r1 : jari-jari silinder 1   atau jari-jari balon udara" );
                tampilan12.setText ( " r2 : jari-jari silinder 2" );
                tampilan13.setText ( " A1 : luas penampang silinder 1 " );
                tampilan14.setText ( " A2 : luas penampang silinder 2 " );
                tampilan15.setText ( " F1 : gaya tekan pada silinder 1    atau gaya angkat balon" );
                tampilan16.setText ( " F2 : gaya tekan pada silinder 2 " );
                tampilan17.setText ( " Wu : berat benda di udara  " );
                tampilan18.setText ( " Wc : berat benda saat dalam cairan " );
                tampilan19.setText ( " hu : tinggi benda di atas permukaan cairan " );
                tampilan20.setText ( " ro1 : massa jenis cairan 1 " );
                tampilan21.setText ( " ro2 : ,assa jenis cairan 2 " );
                tampilan22.setText ( " hc1 : tinggi cairan 1  " );
                tampilan23.setText ( " hc2 : tinggi cairan 2 " );
                tampilan24.setText ( " hc : tinggi tercelup cairan, dan g: percepatan gravitasi bumi;" +
                        " dalam kasus pipa U, hu : tinngi zat cair 1, " +
                        "dengan massa jenis rob dan hc : tinggi zat cair 2 dengan massa jenis rof " );


            }});

        btnrob.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                  if
                    (!Wu.getText ( ).toString ( ).equals ( "" )   &&
                            !Wc.getText ( ).toString ( ).equals ( "" )   &&
                            !rof. getText ( ).toString ( ).equals ( "" )) {
                        WuWu = Double.parseDouble(Wu.getText().toString());
                        WcWc = Double.parseDouble(Wc.getText().toString());
                       rofrof= Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " kasus menimbang di udara, berat Wu, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wu = rob* Vb*g ;  Wc = rof * Vb *g (dengan asumsi benda tenggelam)" );
                    tampilan4.setText ( " (Wu-Wc)/Wu = (rof*Vb*g)/(rob*Vb*g)" );
                    tampilan6.setText ( " rob = Wu*rof/(Wu-Wc)" );
                    robrob = WuWu * rofrof / (WuWu - WcWc);
                    tampilan8.setText ( " rob = " + df.format ( robrob ) + "kg/m3" );
                }else
                if

                    (!mb.getText ( ).toString ( ).equals ( "" )   &&
                            !Wc.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !rof. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        WcWc = Double.parseDouble(Wc.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        rofrof= Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " kasus menimbang di udara, massa mb, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wu = mb*g ;  Wc = rof * Vb *g (dengan asumsi benda tenggelam)" );
                    tampilan4.setText ( " (Wu-Wc)/Wu = (rof*Vb*g)/(rob*Vb*g)" );
                    tampilan6.setText ( " rob = mb*g*rof/(mb*g-Wc)" );
                    robrob= mbmb*gg*rofrof/((mbmb*gg)-WcWc);
                    tampilan8.setText ( " rob = " + df.format ( robrob ) + "kg/m3" );
                } else
                    if
                    (!Vb.getText ( ).toString ( ).equals ( "" )   &&
                                !mb. getText ( ).toString ( ).equals ( "" )) {
                           VbVb = Double.parseDouble(Vb.getText().toString());
                           mbmb = Double.parseDouble(Wc.getText().toString());

                        tampilan1.setText ( " massa jenis benda rob = mb/Vb" );
                    robrob = mbmb/VbVb ;
                    tampilan2.setText ( " rob = " + df.format (robrob ) + "kg/m3" );

                } else
                    if
                    ( !hc.getText ( ).toString ( ).equals ( "" )   &&
                                !hu.getText ( ).toString ( ).equals ( "" )   &&
                                !rof. getText ( ).toString ( ).equals ( "" )) {
                            hchc = Double.parseDouble(hc.getText().toString());
                           huhu = Double.parseDouble(hu.getText().toString());
                            rofrof= Double.parseDouble(rof.getText().toString());

                        tampilan1.setText ( "dua zat cair dalam pipa U, berlaku ro1 g h1 = ro2 g h2" );
                    tampilan2.setText ( "dalam variabel kalkulator ini ro1 = rob; ro2 = rof; h1 = hu; h2 = hc; berlaku rob g hu = rof g hc" );
                    tampilan4.setText ( " rob = rof hc/hu" );
                    robrob = rofrof*hchc/huhu ;
                    tampilan6.setText ( " ro1 = rob = " + df.format (robrob ) + "kg/m3" );
                    tampilan8.setText ( "Dalam kasus benda terapung: berat benda = gaya apung" );
                    tampilan9.setText ( " Wb = rob*A*(hu+hc)*g = gaya apung = rof*A*hc*g" );
                    tampilan11.setText ( " rob = rof hc/(hu+hc)" );
                    robrob = rofrof*hchc/(huhu+hchc) ;
                    tampilan13.setText ( " massa jenis benda terapung rob = " + df.format (robrob ) + "kg/m3" );

                    }}});
        btnrof.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


                if
                (!Wu.getText ( ).toString ( ).equals ( "" )   &&
                            !Wc.getText ( ).toString ( ).equals ( "" )   &&
                            !rob. getText ( ).toString ( ).equals ( "" )) {
                        WuWu = Double.parseDouble(Wu.getText().toString());
                        WcWc = Double.parseDouble(Wc.getText().toString());
                        robrob = Double.parseDouble(rof.getText().toString());
                    tampilan1.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan2.setText ( "  Wu = rob* Vb*g ;  Wc = rof * Vb *g (dengan asumsi benda tenggelam)" );
                    tampilan3.setText ( " (Wu-Wc)/Wu = (rof*Vb*g)/(rob*Vb*g)" );
                    tampilan5.setText ( " rof = (Wu-Wc)*rob/Wu" );
                    rofrof= (WuWu-WcWc)*robrob/WuWu;
                    tampilan7.setText ( " rof = " + df.format ( rofrof ) + "kg/m3" );

                } else
                if
                ( !hc.getText ( ).toString ( ).equals ( "" )   &&
                            !hu.getText ( ).toString ( ).equals ( "" )   &&
                            !rob. getText ( ).toString ( ).equals ( "" )) {
                        hchc = Double.parseDouble(hc.getText().toString());
                        huhu = Double.parseDouble(hu.getText().toString());
                        robrob = Double.parseDouble(rob.getText().toString());
                    tampilan1.setText ( "Dalam kasus benda terapung: berat benda = gaya apung" );
                    tampilan2.setText ( " Wb = rob*A*(hu+hc)*g = gaya apung = rof*A*hc*g" );
                    tampilan4.setText ( " rof = rob(hu+ hc)/hc" );
                    rofrof = robrob*(hchc+huhu)/hchc ;
                    tampilan6.setText ( " massa jenis fluida rob = " + df.format (rofrof ) + "kg/m3" );
                }}});
        btnWu.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !Wc.getText ( ).toString ( ).equals ( "" )   &&
                            !rof.getText ( ).toString ( ).equals ( "" )   &&
                            !rob. getText ( ).toString ( ).equals ( "" )) {
                        WcWc = Double.parseDouble(Wc.getText().toString());
                        robrob= Double.parseDouble(rob.getText().toString());
                        rofrof= Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " kasus menimbang di udara, berat Wu, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wu = Wc + FA" );
                    tampilan4.setText ( " besar FA dicari dari Wc/FA = Vb(rob -rof)/(Vb*rof)" );
                    tampilan5.setText ( " FA = Wc*rof/(rob-rof)" );
                    tampilan7.setText ( " Wu = Wc + Wc*rof/(rob-rof)" );
                    WuWu= WcWc + WcWc*rofrof/(robrob-rofrof);
                    tampilan9.setText ( " Wu = " + df.format ( WuWu ) + "N" );

                }}});
        btnWc.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !Wu.getText ( ).toString ( ).equals ( "" )   &&
                            !rof.getText ( ).toString ( ).equals ( "" )   &&
                            !rob. getText ( ).toString ( ).equals ( "" )) {
                        WuWu = Double.parseDouble(Wu.getText().toString());
                        robrob= Double.parseDouble(rob.getText().toString());
                        rofrof= Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " kasus menimbang di udara, berat Wu, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wc = Vb(rob -rof)g  " );
                    tampilan4.setText ( "  Wc/Wu = Vb*(rob-rof)*g/(Vb*rob*g)" );
                    tampilan6.setText ( " Wc = (rob-rof)*Wu/rob" );
                    WcWc= (robrob-rofrof)*WuWu/robrob;
                    tampilan8.setText ( " Wc = " + df.format (WcWc ) + "N" );
                } else
                if
                    ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !rof.getText ( ).toString ( ).equals ( "" )   &&
                            !rob. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        robrob= Double.parseDouble(rob.getText().toString());
                        rofrof= Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " kasus menimbang di udara, massa mb, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wc = Vb(rob -rof)g  " );
                    tampilan4.setText ( "  Wc/Wu = Vb*(rob-rof)*g/(Vb*rob*g)" );
                    tampilan6.setText ( " Wc = (rob-rof)*mb*g/rob" );
                    WcWc = (robrob - rofrof) * mbmb * gg / robrob;
                    tampilan8.setText ( " Wc = " + df.format ( WcWc ) + "N" );
                }}});
        btnF1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !F2.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !A1. getText ( ).toString ( ).equals ( "" )) {
                        F2F2 = Double.parseDouble(Wu.getText().toString());
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        A2A2 = Double.parseDouble(A2.getText().toString());

                        tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2" );
                    tampilan4.setText ( " F1 = A1 * F2/ A2 " );
                    F1F1= A1A1*F2F2/A2A2;
                    tampilan6.setText ( " F1 = " + df.format ( F1F1) + "N" );
                }else
                if
                    ( !F2.getText ( ).toString ( ).equals ( "" )   &&
                            !r2.getText ( ).toString ( ).equals ( "" )   &&
                            !r1. getText ( ).toString ( ).equals ( "" )) {
                        F2F2 = Double.parseDouble(F2.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        r2r2 = Double.parseDouble(r2.getText().toString());

                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2" );
                    tampilan4.setText ( " F1 =r1^2 * F2/ r2^2 " );
                    r1r1 = Math.pow ( r1r1 , 2 );
                    r2r2 = Math.pow ( r2r2 , 2 );
                    F1F1 = r1r1 * F2F2 / r2r2;
                    tampilan6.setText ( " F1 = " + df.format ( F1F1 ) + "N" );
                } else
                if
                    ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !A1. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        A2A2 = Double.parseDouble(A2.getText().toString());


                        tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;    F2 = mb*g" );
                    tampilan4.setText ( " F1 = A1 * mb * g/ A2 " );
                    F1F1= A1A1*mbmb*gg/A2A2;
                    tampilan6.setText ( " F1 = " + df.format ( F1F1) + "N" );
                }else
                if
                    ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                            !r2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r1. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        r2r2 = Double.parseDouble(r2.getText().toString());

                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2;  F2 = mb*g" );
                    tampilan4.setText ( " F1 =r1^2 *mb*g/ r2^2 " );
                    r1r1 = Math.pow ( r1r1 , 2 );
                    r2r2 = Math.pow ( r2r2 , 2 );
                    F1F1 = r1r1 * mbmb*gg / r2r2;
                    tampilan6.setText ( " F1 = " + df.format ( F1F1 ) + "N" );
                }else
                if
                  ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                   !rob.getText ( ).toString ( ).equals ( "" )   &&
                        !rof.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )   &&
                        !r1. getText ( ).toString ( ).equals ( "" )) {
                    mbmb = Double.parseDouble(mb.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    r1r1 = Double.parseDouble(r1.getText().toString());
                    robrob = Double.parseDouble(rob.getText().toString());
                    rofrof = Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " Kasus balon udara" );
                    tampilan2.setText ( "  berlaku hukum Archimedes" );
                    tampilan4.setText ( " gaya angkat sama dengan berat fluida yang dipindahkan " );
                    tampilan5.setText ( " berat fluida = berat udara yang volumenya = volume balon " );
                    tampilan6.setText ( " beratnya = massa jenis udara x volume balon x percepatan gravitasi " );
                    tampilan7.setText ( " gaya angkat balon = berat udara yang dipindahkan balon - berat balon " );
                    tampilan8.setText ( " gaya angkat balon = massa jenis gas balon x volume balon x percepatan gravitasi - berat bahan balon dan asesorinya" );
                    tampilan9.setText ( " gaya angkat balon   =  {volume balon (rof - rob)-mb}  x g " );
                    tampilan10.setText ( " gaya angkat balon= {4/3 pi r^3 (rof - rob) - mb } x g " );
                    r1r1 = Math.pow ( r1r1 , 3 );

                    F1F1 = (4*3.14159* r1r1 * (rofrof-robrob)-mbmb)*gg /3;
                    tampilan12.setText ( " Gaya angkat balon: F1 = " + df.format ( F1F1 ) + "N" );
                }else
                if
                        (!rob.getText ( ).toString ( ).equals ( "" )   &&
                        !rof.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )   &&
                        !r1. getText ( ).toString ( ).equals ( "" )) {

                    gg = Double.parseDouble(g.getText().toString());
                    r1r1 = Double.parseDouble(r1.getText().toString());
                    robrob = Double.parseDouble(rob.getText().toString());
                    rofrof = Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " Kasus balon udara" );
                    tampilan2.setText ( "  berlaku hukum Archimedes" );
                    tampilan4.setText ( " gaya angkat sama dengan berat fluida yang dipindahkan " );
                    tampilan5.setText ( " berat fluida = berat udara yang volumenya = volume balon " );
                    tampilan6.setText ( " beratnya = massa jenis udara x volume balon x percepatan gravitasi " );
                    tampilan7.setText ( " gaya angkat balon = berat udara yang dipindahkan balon - berat balon " );
                    tampilan8.setText ( " berat balon bersih = massa jenis gas balon x volume balon x percepatan gravitasi - berat bahan balon dan asesorinya" );
                    tampilan9.setText ( " berat balon total total = massa jenis gas balon x volume balon x percepatan gravitasi " );
                    tampilan10.setText ( " gaya angkat balon total = {4/3 pi r^3 (rof - rob) } x g " );
                    r1r1 = Math.pow ( r1r1 , 3 );

                    F1F1 = 4*3.14159* r1r1 * (rofrof-robrob)*gg /3;
                    tampilan12.setText ( " Gaya angkat balon: F1 = " + df.format ( F1F1 ) + "N" );



                }else
                if
                ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                        !rob.getText ( ).toString ( ).equals ( "" )   &&
                        !rof.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )   &&
                        !Vb. getText ( ).toString ( ).equals ( "" )) {
                    mbmb = Double.parseDouble(mb.getText().toString());
                    gg = Double.parseDouble(g.getText().toString());
                    VbVb = Double.parseDouble(Vb.getText().toString());
                    robrob = Double.parseDouble(rob.getText().toString());
                    rofrof = Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " Kasus balon udara" );
                    tampilan2.setText ( "  berlaku hukum Archimedes" );
                    tampilan4.setText ( " gaya angkat sama dengan berat fluida yang dipindahkan " );
                    tampilan5.setText ( " berat fluida = berat udara yang volumenya = volume balon " );
                    tampilan6.setText ( " beratnya = massa jenis udara x volume balon x percepatan gravitasi " );
                    tampilan7.setText ( " gaya angkat balon = berat udara yang dipindahkan balon - berat balon " );
                    tampilan8.setText ( " gaya angkat balon = massa jenis gas balon x volume balon x percepatan gravitasi - berat bahan balon dan asesorinya" );
                    tampilan9.setText ( " gaya angkat balon   =  {volume balon (rof - rob)-mb}  x g " );
                    tampilan10.setText ( " gaya angkat balon= {Vb x (rof - rob) - mb } x g " );

                    F1F1 = (VbVb * (rofrof-robrob)-mbmb)*gg ;
                    tampilan12.setText ( " Gaya angkat balon: F1 = " + df.format ( F1F1 ) + "N" );
                }else
                if
                (!rob.getText ( ).toString ( ).equals ( "" )   &&
                        !rof.getText ( ).toString ( ).equals ( "" )   &&
                        !g.getText ( ).toString ( ).equals ( "" )   &&
                        !Vb. getText ( ).toString ( ).equals ( "" )) {

                    gg = Double.parseDouble(g.getText().toString());
                    VbVb = Double.parseDouble(Vb.getText().toString());
                    robrob = Double.parseDouble(rob.getText().toString());
                    rofrof = Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " Kasus balon udara" );
                    tampilan2.setText ( "  berlaku hukum Archimedes" );
                    tampilan4.setText ( " gaya angkat sama dengan berat fluida yang dipindahkan " );
                    tampilan5.setText ( " berat fluida = berat udara yang volumenya = volume balon " );
                    tampilan6.setText ( " beratnya = massa jenis udara x volume balon x percepatan gravitasi " );
                    tampilan7.setText ( " gaya angkat balon = berat udara yang dipindahkan balon - berat balon " );
                    tampilan8.setText ( " berat balon bersih = massa jenis gas balon x volume balon x percepatan gravitasi - berat bahan balon dan asesorinya" );
                    tampilan9.setText ( " berat balon total total = massa jenis gas balon x volume balon x percepatan gravitasi " );
                    tampilan10.setText ( " gaya angkat balon total = {Vb(rof - rob) } x g " );

                    F1F1 = VbVb* (rofrof-robrob)*gg ;
                    tampilan12.setText ( " Gaya angkat balon: F1 = " + df.format ( F1F1 ) + "N" );




                }}});
        btnF2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                    ( !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !A1. getText ( ).toString ( ).equals ( "" )) {
                        F1F1 = Double.parseDouble(Wu.getText().toString());
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        A2A2 = Double.parseDouble(A2.getText().toString());

                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2" );
                    tampilan4.setText ( " F2 = A2 * F1/ A1 " );
                    F2F2= A2A2*F1F1/A1A1;
                    tampilan6.setText ( " F2 = " + df.format ( F2F2) + "N" );
                }else
                if
                    ( !F1.getText ( ).toString ( ).equals ( "" )   &&
                            !r2.getText ( ).toString ( ).equals ( "" )   &&
                            !r1. getText ( ).toString ( ).equals ( "" )) {
                        F1F1 = Double.parseDouble(F1.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        r2r2 = Double.parseDouble(r2.getText().toString());

                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2" );
                    tampilan4.setText ( " F2 =r2^2 * F1/ r1^2 " );
                    r1r1 = Math.pow ( r1r1 , 2 );
                    r2r2 = Math.pow ( r2r2 , 2 );
                    F2F2 = r2r2 * F1F1 / r1r1;
                    tampilan6.setText ( " F2 = " + df.format ( F2F2 ) + "N" );
                } else
                if
                    ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                            !A2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !A1. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        A1A1 = Double.parseDouble(A1.getText().toString());
                        A2A2 = Double.parseDouble(A2.getText().toString());
                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;    F1 = mb*g" );
                    tampilan4.setText ( " F2 = A2 * mb * g/ A1 " );
                    F2F2= A2A2*mbmb*gg/A1A1;
                    tampilan6.setText ( " F2 = " + df.format ( F2F2) + "N" );
                }else
                if
                    ( !mb.getText ( ).toString ( ).equals ( "" )   &&
                            !r2.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !r1. getText ( ).toString ( ).equals ( "" )) {
                        mbmb = Double.parseDouble(mb.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        r1r1 = Double.parseDouble(r1.getText().toString());
                        r2r2 = Double.parseDouble(r2.getText().toString());

                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2;  F1 = mb*g" );

                    tampilan4.setText ( " F2 =r2^2 *mb*g/ r1^2 " );
                    r1r1 = Math.pow ( r1r1 , 2 );
                    r2r2 = Math.pow ( r2r2 , 2 );
                    F2F2 = r2r2 * mbmb*gg / r1r1;
                    tampilan6.setText ( " F2 = " + df.format ( F2F2 ) + "N" );

                }}});
        btnA1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                A2A2 = Double.parseDouble ( A2.getText ( ).toString ( ) );
                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );

                if (F2F2 !=0 && A2A2 !=0 && F1F1 !=0  ) {
                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2" );
                    tampilan4.setText ( " A1 = A2 * F1/ F2 " );
                    A1A1=A2A2*F1F1/F2F2;
                    tampilan6.setText ( " A1 = " + df.format ( A1A1) + "m2" );

                }}});
        btnA2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                A1A1 = Double.parseDouble ( A1.getText ( ).toString ( ) );
                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );

                if (F2F2 !=0 && A1A1 !=0 && F1F1 !=0  ) {
                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2" );
                    tampilan4.setText ( " A2 = A1 * F2/ F1 " );
                    A2A2=A1A1*F2F2/F1F1;
                    tampilan6.setText ( " A2 = " + df.format ( A2A2) + "m2" );
                }}});

        btnr1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );
                r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );

                if (F2F2 !=0 && F1F1 !=0 && r2r2 !=0  ) {
                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2" );
                    tampilan4.setText ( " r1 = [r2^2 * F1/F2]^0,5 " );
                    r2r2 = Math.pow ( r2r2 , 2 );
                    r1r1 = r2r2 * F1F1/ F2F2;
                    r1r1 = Math.pow(r1r1,0.5);
                    tampilan6.setText ( " r1 = " + df.format ( r1r1 ) + "m" );
                }}});


        btnr2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                F1F1 = Double.parseDouble ( F1.getText ( ).toString ( ) );
                F2F2 = Double.parseDouble ( F2.getText ( ).toString ( ) );
                r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );

                if (F2F2 !=0 && F1F1 !=0 && r1r1 !=0  ) {
                    tampilan1.setText ( " kasus pompa hidrolik merupakan penerapan hukum Pascal" );
                    tampilan2.setText ( "  F1/A1 = F2/A2;   A = pi * r^2" );
                    tampilan4.setText ( " r2 = [r1^2 * F2/F1]^0,5 " );
                    r1r1 = Math.pow ( r2r2 , 2 );
                    r2r2 = r1r1 * F2F2/ F1F1;
                    r2r2 = Math.pow(r2r2,0.5);
                    tampilan6.setText ( " r2 = " + df.format ( r2r2 ) + "m" );
                }}});

        btnhu.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                robrob = Double.parseDouble ( rob.getText ( ).toString ( ) );
                rofrof = Double.parseDouble ( rof.getText ( ).toString ( ) );
                hchc = Double.parseDouble ( hc.getText ( ).toString ( ) );

                if (hchc !=0 && robrob !=0 && rofrof !=0  ){
                    tampilan1.setText ( "Dalam kasus benda terapung: berat benda = gaya apung" );
                    tampilan2.setText ( " Wb = rob*A*(hu+hc)*g = gaya apung = rof*A*hc*g" );
                    tampilan3.setText ( " rob(hu+hc) = rof hc" );
                    tampilan4.setText ( " rob*hu = rof*hc- hc*rob" );
                    tampilan6.setText ( " hu = hc*( rof- rob)/rob" );
                    huhu= hchc*(rofrof - robrob)/robrob;
                    tampilan8.setText ( " tinggi benda di atas permukaan hu = " + df.format (huhu) + "m" );
                }}});

        btnhc.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                robrob = Double.parseDouble ( rob.getText ( ).toString ( ) );
                rofrof = Double.parseDouble ( rof.getText ( ).toString ( ) );
                huhu = Double.parseDouble ( hu.getText ( ).toString ( ) );


                    tampilan1.setText ( "Dalam kasus benda terapung: berat benda = gaya apung" );
                    tampilan2.setText ( " Wb = rob*A*(hu+hc)*g = gaya apung = rof*A*hc*g" );
                    tampilan3.setText ( " rob(hu+hc) = rof hc" );
                    tampilan4.setText ( " -rob*hc+rof hc = rob*hu" );
                    tampilan6.setText ( " hc*( rof- rob)= rob hu" );
                    hchc= robrob*huhu/(rofrof - robrob);
                    tampilan8.setText ( " tinggi benda dibawah permukaan hc = " + df.format (hchc) + "m" );
                }});

        btnmb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                rofrof = Double.parseDouble ( rof.getText ( ).toString ( ) );
                WcWc = Double.parseDouble ( Wc.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                VbVb = Double.parseDouble ( Vb.getText ( ).toString ( ) );

                if (gg !=0 && WcWc !=0 && rofrof !=0 && VbVb !=0  ) {
                    tampilan1.setText ( " kasus menimbang di udara, berat Wu, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "  Wc = Wu - gaya Archimedes" );
                    tampilan3.setText ( "  Wu = mb*g ; FA = rof * Vb *g (dengan asumsi benda tenggelam)" );
                    tampilan4.setText ( " Wc = mb g - (vb rof g)" );
                    tampilan6.setText ( " mb = (Wc + Vb rof g)/g" );
                    mbmb = (WcWc + (VbVb*rofrof*gg))/gg;
                    tampilan8.setText ( " mb = " + df.format ( mbmb ) + "kg" );

                }}});
        btnvb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );
                rofrof = Double.parseDouble ( rof.getText ( ).toString ( ) );
                WuWu = Double.parseDouble ( Wu.getText ( ).toString ( ) );
                WcWc = Double.parseDouble ( Wc.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                if (WuWu !=0 && WcWc !=0 && rofrof !=0 && gg !=0 ) {
                    tampilan1.setText ( " kasus menimbang di udara, berat Wu, menimbang benda tercelup zat cair, berat benda menjadi Wc" );
                    tampilan2.setText ( "   gaya Archimedes = Wu - Wc" );
                    tampilan3.setText ( "   Vb rof g = Wu - Wc      (dengan asumsi benda tenggelam)" );;
                    tampilan5.setText ( " Vb = (Wu-Wc)/(rof g" );
                    VbVb = (WuWu - WcWc)/(rofrof*gg);
                    tampilan7.setText ( " Vb = " + df.format (VbVb) + "m3" );
                }}});

        btnp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                rofrof = Double.parseDouble ( rof.getText ( ).toString ( ) );
                hchc = Double.parseDouble ( hc.getText ( ).toString ( ) );
                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                popo = Double.parseDouble ( po.getText ( ).toString ( ) );

                if
                    ( !hc.getText ( ).toString ( ).equals ( "" )   &&
                            !rof.getText ( ).toString ( ).equals ( "" )   &&
                            !g.getText ( ).toString ( ).equals ( "" )   &&
                            !po. getText ( ).toString ( ).equals ( "" )) {
                        hchc = Double.parseDouble(hc.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        rofrof = Double.parseDouble(rof.getText().toString());
                        popo = Double.parseDouble(po.getText().toString());
                    tampilan1.setText ( " Tekanan hidrostatik" );
                    tampilan3.setText ( " p =  ro*g*h + po" );
                    p = rofrof * gg * hchc;
                    p = p + popo;
                    tampilan5.setText ( " p = " + df.format ( p ) + "N/m2" );
                }
               else
                if
                    ( !hc.getText ( ).toString ( ).equals ( "" )   &&
                            !rof.getText ( ).toString ( ).equals ( "" )   &&
                            !g. getText ( ).toString ( ).equals ( "" )) {
                        hchc = Double.parseDouble(hc.getText().toString());
                        gg = Double.parseDouble(g.getText().toString());
                        rofrof = Double.parseDouble(rof.getText().toString());

                    tampilan1.setText ( " Tekanan hidrostatik" );
                    tampilan3.setText ( " p =  ro*g*h " );
                    p = rofrof * gg * hchc;

                    tampilan5.setText ( " p = " + df.format ( p ) + "N/m2" );

                }}});

        btnro1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );


                ro22 = Double.parseDouble ( ro2.getText ( ).toString ( ) );
                hc11 = Double.parseDouble ( hc1.getText ( ).toString ( ) );
                hc22 = Double.parseDouble ( hc2.getText ( ).toString ( ) );

                if (hc11 !=0 && hc22 !=0  && ro22 !=0 ) {
                    tampilan1.setText ( " Tekanan hidrostatik kasus pipa U" );
                    tampilan3.setText ( " ro1*g * h1 = ro2 *g *h2" );
                    tampilan4.setText ( " ro1 = ro2 * h2/h1" );
                    ro11 = ro22*hc22/hc11;

                    tampilan6.setText ( " massa jenis cairan 1  = " + df.format ( ro11 ) + "kg/m3" );


                }}});
        btnro2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                ro11 = Double.parseDouble ( ro1.getText ( ).toString ( ) );
                hc11 = Double.parseDouble ( hc1.getText ( ).toString ( ) );
                hc22 = Double.parseDouble ( hc2.getText ( ).toString ( ) );

                if (hc11 !=0 && hc22 !=0  && ro11 !=0 ) {
                    tampilan1.setText ( " Tekanan hidrostatik kasus pipa U" );
                    tampilan3.setText ( " ro1*g * h1 = ro2 *g *h2" );
                    tampilan4.setText ( " ro2 = ro1 * h1/h2" );
                    ro11 = ro22*hc22/hc11;
                    tampilan6.setText ( " massa jenis cairan 2  = " + df.format ( ro22 ) + "kg/m3" );

                }}});
        btnhc1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                ro11 = Double.parseDouble ( ro1.getText ( ).toString ( ) );
                ro22 = Double.parseDouble ( ro2.getText ( ).toString ( ) );
                hc22 = Double.parseDouble ( hc2.getText ( ).toString ( ) );

                if (ro22 !=0 && hc22 !=0  && ro11 !=0 ) {
                    tampilan1.setText ( " Tekanan hidrostatik kasus pipa U" );
                    tampilan3.setText ( " ro1*g * h1 = ro2 *g *h2" );
                    tampilan4.setText ( " h1 = ro2 * h2/h1" );
                    hc11 = ro22*hc22/ro11;
                    tampilan6.setText ( " Tinggi cairan 1  = " + df.format ( hc11 ) + "cm" );

                }}});
        btnhc2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                ro11 = Double.parseDouble ( ro1.getText ( ).toString ( ) );
                ro22 = Double.parseDouble ( ro2.getText ( ).toString ( ) );
                hc11 = Double.parseDouble ( hc1.getText ( ).toString ( ) );

                if (ro22 !=0 && hc11 !=0  && ro11 !=0 ) {
                    tampilan1.setText ( " Tekanan hidrostatik kasus pipa U" );
                    tampilan3.setText ( " ro1*g * h1 = ro2 *g *h2" );
                    tampilan4.setText ( " h2 = ro1 * h1/ro2" );
                    hc22 = ro11*hc11/ro22;
                    tampilan6.setText ( " Tinggi cairan 2  = " + df.format ( hc22 ) + "cm" );

                }}});


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
                tampilan21.setText ( "" );
                tampilan22.setText ( "" );
                tampilan23.setText ( "" );
                tampilan24.setText ( "" );
                tampilan25.setText ( "" );
                tampilan26.setText ( "" );
                mb.setText ( "" );
                Vb.setText ( "" );
                r1.setText ( "" );
                r2.setText ( "" );
                A1.setText ( "" );
                A2.setText ( "" );
                F1.setText ( "" );
                F2.setText ( "" );
                g.setText ( "" );
                hc.setText ( "" );
                hu.setText ( "" );
                Wu.setText ( "" );
                Wc.setText ( "" );
                rob.setText ( "" );
                rof.setText ( "" );
                po.setText ( "" );
                ro1.setText ( "" );
                ro2.setText ( "" );
                hc1.setText ( "" );
                hc2.setText ( "" );
            }
        } );
    }
}
