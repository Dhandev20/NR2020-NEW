package com.dhandev.n2000;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class HukumNewton extends AppCompatActivity {
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
    private TextView tampilan27;
    private TextView tampilan28;
    private TextView tampilan29;
    private TextView tampilan30;
    private TextView tampilan31;
    private TextView tampilan32;
    private TextView tampilan33;
    private TextView tampilan34;
    private TextView tampilan35;
    private TextView tampilan36;
    private TextView tampilan37;
    private TextView tampilan38;
    private TextView tampilan39;
    private TextView tampilan40;


    private EditText ma;
    private EditText mb;
    private EditText g;
    private EditText vo, vt;
    private EditText F;
    private EditText s;
    private EditText t;
    private EditText uk;
    private EditText us;
    private EditText alfa;
    private EditText W;
    private EditText T;
    private EditText N;
    private EditText r;
    private EditText ac;
    private EditText teta;
    private Double mama;
    private Double mbmb;
    private Double tt, t2;
    private Double aa, acc, stop, stop1;
    private Double gg;
    private Double vovo, vtvt, v12, v22, v05;
    private Double ss, rr;
    private Double usus;
    private Double ukuk;
    private Double aalf;
    private Double teeta;
    private Double ww;
    private Double TT;
    private Double FF, NN;
    private Double result, result1, p, q;
    private Double reset;
    private Double cos, sin, tan, deg;
    private Double Usaha,Wgesek, Ek, Ep, Fg, A,A1, A2, B, B1,B2 , C, C1,C2, D, D1,D2, P, Q, Z;
    private Double   P1, P2,Q1, Q2, Z1,Z2, dF, F11, F12, F21, F22, Fgs11,Fgs12,Fgs21,Fgs22,Fgk11,Fgk12,Fgk21,Fgk22;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hukum_newton );

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
        tampilan21 = findViewById ( R.id.tampilan21 );
        tampilan22 = findViewById ( R.id.tampilan22 );
        tampilan23 = findViewById ( R.id.tampilan23 );
        tampilan24 = findViewById ( R.id.tampilan24 );
        tampilan25 = findViewById ( R.id.tampilan25 );
        tampilan26 = findViewById ( R.id.tampilan26 );
        tampilan27 = findViewById ( R.id.tampilan27 );
        tampilan28 = findViewById ( R.id.tampilan28 );
        tampilan29 = findViewById ( R.id.tampilan29 );
        tampilan30 = findViewById ( R.id.tampilan30 );
        tampilan31 = findViewById ( R.id.tampilan31 );
        tampilan32 = findViewById ( R.id.tampilan32 );
        tampilan33 = findViewById ( R.id.tampilan33 );
        tampilan34 = findViewById ( R.id.tampilan34 );
        tampilan35 = findViewById ( R.id.tampilan35 );
        tampilan36 = findViewById ( R.id.tampilan36 );
        tampilan37 = findViewById ( R.id.tampilan37 );
        tampilan38 = findViewById ( R.id.tampilan38 );
        tampilan39 = findViewById ( R.id.tampilan39 );
        tampilan40 = findViewById ( R.id.tampilan40 );



        ma = findViewById ( R.id.in_ma );
        mb = findViewById ( R.id.in_mb );
        t = findViewById ( R.id.in_t );
        g = findViewById ( R.id.in_g );
        s = findViewById ( R.id.in_s );
        ac = findViewById ( R.id.in_a );
        uk = findViewById ( R.id.in_uk );
        us = findViewById ( R.id.in_us );
        T = findViewById ( R.id.in_T );
        alfa = findViewById ( R.id.in_alfa );
        vo = findViewById ( R.id.in_vo );
        vt = findViewById ( R.id.in_vt );
        F = findViewById ( R.id.in_F );
        N = findViewById ( R.id.in_N );
        teta = findViewById ( R.id.in_teta );
        r = findViewById ( R.id.in_r );

        Button btnacc = findViewById ( R.id.btnacc );
        Button btnv = findViewById ( R.id.btnv );
        Button btnvo = findViewById ( R.id.btn_vo );
        Button btns = findViewById ( R.id.btns );
        Button btnt = findViewById ( R.id.btnt );
        Button btnF = findViewById ( R.id.btnF );
        Button btnFg = findViewById ( R.id.btnFg );
        Button btnT = findViewById ( R.id.btnT );
        Button btnuk = findViewById ( R.id.btnuk );
        Button btnR = findViewById ( R.id.btnR );
        Button btnN = findViewById ( R.id.btnN );
        Button btnwork = findViewById ( R.id.btnwork );
        Button btnclear = findViewById ( R.id.btnhapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator ini digunakan untuk menghitung: massa (ma) atau (mb), percepatan (a), kecepatan (vt), perpindahan (s), gaya (F), koefisien gesek (uk), usaha (W), sudut (alfa, teta) dari kasus:" );
                tampilan2.setText ( "1. Massa(ma) diatas lantai licin ditarik gaya (F) sejajar lantai" );
                tampilan3.setText ( "2. Massa (ma)diatas lantai licin ditarik gaya (F) membentuk sudut (teta) terhadap lantai" );
                tampilan4.setText ( "3. Massa (ma)diatas lantai kasar (uk) ditarik gaya (F)sejajar lantai" );
                tampilan5.setText ( "4. Massa (ma)diatas lantai kasar ditarik gaya (F) membentuk sudut (teta) terhadap lantai" );
                tampilan6.setText ( "5. Massa (ma)diatas bidang miring licin dengan sudut (alfa)  ditarik gaya (F) sejajar bidang miring" );
                tampilan7.setText ( "6. Massa (ma)diatas bidang miring licin dengan sudut (alfa)  ditarik gaya (F) membentuk sudut (teta) terhadap bidang miring" );
                tampilan8.setText ( "7. Massa (ma)diatas lantai miring kasar (uk) dengan sudut (alfa)  ditarik gaya (F) sejajar bidang miring" );
                tampilan9.setText ( "8. Massa (ma) diatas lantai miring kasar (uk) dengan sudut alfa  ditarik gaya (F) membentuk sudut (teta)  terhadap bidang miring" );
                tampilan10.setText ( "9. Massa (ma)diatas meja licin ditarik gaya berat benda (mb) melalui katrol ringan licin" );
                tampilan11.setText ( "10. Massa (ma) diatas meja kasar ditarik gaya berat benda (mb) melalui katrol ringan licin" );
                tampilan12.setText ( "11. Massa (ma) diatas bidang miring licin dengan sudut (alfa)  ditarik gaya berat benda (mb) melalui katrol ringan licin" );
                tampilan13.setText ( "12. Massa (ma) diatas bidang miring kasar (uk) dengan sudut (alfa)  ditarik gaya berat benda (mb) melalui katrol ringan licin" );
                tampilan14.setText ( "13. Massa (ma)ditarik dengan berat benda (mb) dengan katrol ringan licin dengan posisi ma dan mb menggantung,  GUNAKAN uk = 10" );
                tampilan15.setText ( "14. Massa(ma) ditarik vertikal ke atas seperti lif; dalam hal ini menentukan hubungan gaya normal dan percepatan " );
                tampilan16.setText ( "15. Massa(ma) ditarik vertikal ke bawah seperti lif; dalam hal ini menentukan hubungan gaya normal dan percepatan" );
                tampilan17.setText ( "16. balok ma dan mb bedampingan dilantai licin; salah satu didorong gaya F, tentukan gaya F reaksi balok mb" );
                tampilan18.setText ( "17 Kendaraan melaju direm hingga berhenti ");
                tampilan19.setText ( "18 Benda meluncur di lantai kasar hingga berhenti ");
                tampilan21.setText ( "Variabel:  ");
                tampilan22.setText ( " ma = massa A ;  " );
                tampilan23.setText ( " mb = massa B " );
                tampilan24.setText ( " vo = kecepatan awal benda A " );
                tampilan25.setText ( " vt = kecepatan saat t benda A" );
                tampilan26.setText ( " uk = koefiesien gesek kinetik anatar benda dan bidang;" );
                tampilan27.setText ( " us = koefisien gesek statis" );
                tampilan28.setText ( " T = tegangan tali" );
                tampilan29.setText ( " N = gaya normal" );
                tampilan30.setText ( " s = perpindahan" );
                tampilan31.setText ( " alfa = sudut bidang miring dengan lantai" );
                tampilan32.setText ( " teta = sudut antara gaya dan bidang" );
                tampilan33.setText ( " t = selang waktu " );
                tampilan34.setText ( " R = jari-jari kelengkungan" );
                tampilan35.setText ( " t = selang waktu " );
                tampilan36.setText ( " F = gaya tarik/dorong" );
                tampilan37.setText ( " Fg = gaya gesek " );
                tampilan38.setText ( " Tegangan = tegangan tali " );
                tampilan39.setText ( " Usaha = usaha yang dilakukan gaya " );
                tampilan40.setText ( " SELAMAT BELAJAR " );

            }}
        );

  btnacc.setOnClickListener ( new View.OnClickListener ( ) {
         @Override
         public void onClick ( final View view ) {
             DecimalFormat df = new DecimalFormat ( "#.##########" );

             //acc 1 A

     if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
          !mb.getText ( ).toString ( ).equals ( "" ) &&
           !g.getText ( ).toString ( ).equals ( "" ) &&
        !alfa.getText ( ).toString ( ).equals ( "" ) &&
         !uk.getText ( ).toString ( ).equals ( "" ) &&
          !us.getText ( ).toString ( ).equals ( "" )) {
                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                  gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                usus = Double.parseDouble ( us.getText ( ).toString ( ) );

           tampilan1.setText ( "Kemungkinan pertama, sistem dua benda dihubungkan melalui tali dan katrol");
           tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring dan terjadi gaya gesek");
           tampilan3.setText ( "");
           deg = 0.01745329251994329576923690768489 * aalf;
           sin = Math.sin ( deg );
           cos = Math.cos ( deg );
           // Fgs 12 berarti : Gaya + gaya gesek statik, 1 : arah gerak ke kanan, 2: asumsi  b...a
           // Fgs 21 berarti : Gaya + gaya gesek statik, 2 : arah gerak ke kiri, 2: asumsi  a...b
           A1 = gg*mama*(sin+usus*cos);//Fgs11   [gaya+gaya gesek statik melawan gerak ke kanan]
           A2 = mbmb*gg;//F11
           A = gg*mama*(sin+ukuk*cos);//Fgk11
           B1 = gg*mama; //F12
           B = gg*mama*sin; //F21
           C = gg*(mbmb +(ukuk*mama*cos));// Fgk21
           C1 = gg*(mbmb +(usus*mama*cos));//Fgs21
           D = mama + mbmb;
           P = mbmb*gg*(sin + ukuk*cos);// Fgk12
           P1 = mbmb*gg*(sin + usus*cos);// Fgs12

           Q = mbmb*gg*sin;//F12
           Z = gg*( mama + (ukuk*mbmb*cos));// Fgk22
           Z1 = gg*( mama + (usus*mbmb*cos));// Fgs22
           dF = A2-A1;

           if (A2 > A1) {//Penggerak > penahan.....mb turun
               aa =(A2-A )/D;

               tampilan4.setText ( "gaya penggerak naik bidang miring  adalah mb*g  =  "+ df.format ( A2 ) + "N "  );
               tampilan5.setText ( "gaya penahan gerak ke atas bidang miring ma g (sin(alfa)+ us ma*g cos (alfa)=  "+ df.format ( A1 ) + "N " );
               tampilan6.setText ( "karena gaya penggerak > gaya penahan, mb BERGERAK TURUN,  maka us diganti uk" );
               tampilan7.setText ( " a = jumlah gaya/jumlah massa;  " );
               tampilan8.setText ( " karena bergerak, gaya penahan gerak ke atas bidang miring ma g (sin(alfa)+ uk ma*g cos (alfa)=  "+ df.format ( A ) + "N ");
               tampilan9.setText ( "" );
               tampilan10.setText ( "a = "+"(" + df.format(A2)+" - "+ df.format(A)+")/"+ df.format(D)+" = "+ df.format ( aa ) + "m/ss" );
               tampilan11.setText ( "" );
               tampilan12.setText ( "" );
               tampilan13.setText ( "" );

           }else
               if (A2 < A1){ //mau gerak ke kiri

                   if (B > C1){
                       aa= (B-C)/D;

                  tampilan4.setText ( "gaya penggerak ke kiri  adalah  ma*gsin(alfa) =  "+ df.format ( B ) + "N "  );
                  tampilan5.setText ( "gaya penahan penggerak ke kiri  adalah gg*(mbmb +(usus*mama*cos)) =  "+ df.format ( C1 ) + "N "  );
                  tampilan6.setText ( "karena ma*gsin(alfa) > ma * g(us cos (alfa)) + mb*g,  maka geral ke kiri, mb BERGERAK NAIK, selanjutnya us diganti uk " );
                  tampilan7.setText ( "a = jumlah F / jumlah m   " );
                  tampilan8.setText ( "a = (ma sin(alfa)- uk*ma*cos alfa - mb)*g / (ma + mb)" );
                  tampilan9.setText ( "" );
                  tampilan10.setText ( "a = " + df.format ( aa ) + "m/ss" );
                  tampilan11.setText ( "" );
                  tampilan12.setText ( "" );
                   tampilan13.setText ( "" );
                   }
               else if(B < C1) {

                   tampilan4.setText ( "" );
                       tampilan5.setText ( "Misal akan gerak ke kanan: " );
                       tampilan6.setText ( "gaya penggerak ke kanan  mb*g= " + df.format ( A2 ) + "N" );
                       tampilan7.setText ( "gaya + gesek statis maksimum  melawan gerak ke kanan ma g (sin(alfa)+ us ma*g cos (alfa)=  "+ df.format ( A1 )  );
                       tampilan8.setText ( "gaya penggerak tidak lebih dari gaya sesek statik, BENDA TIDAK BERGERAK" );
                       tampilan9.setText ( "" );
                   tampilan10.setText ( "Misal akan gerak ke kiri: " );
                   tampilan11.setText ( "gaya penggerak ke kiri  ma*gsinalfa = " + df.format ( B ) + "N" );
                   tampilan12.setText ( "gaya + gesek statis maksimum  melawan gerak ke kiri = " + df.format ( C1 ) + "N" );
                   tampilan13.setText ( "gaya penggerak tidak lebih dari gaya sesek statik, BENDA TIDAK BERGERAK" );
               }}
//ASUMSI PERTAMA TELAH OK
// ASUMSI KE DUA**********************************************************************************************************
                 tampilan14.setText ( "");
                 tampilan15.setText ( "");
                 tampilan16.setText ( "KEMUNGKINAN KEDUA");
                  tampilan17.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                  tampilan18.setText ( "benda ma tergantung dan benda mb pada bidang miring dan terjadi gaya gesek");
                 tampilan19.setText ( "");
                  deg = 0.017444 * aalf;
                  sin = Math.sin ( deg );
                  cos = Math.cos ( deg );

                  if (B1 > P1) {
                      tampilan20.setText ( "gaya penggerak ke kanan benda menggantung ma*g = "+df.format ( B1 ) + "N" );
                      tampilan21.setText (  "gaya penahan = mb*g(sin(alfa)+ us cos(alfa))= "+df.format ( P1 ) + "N" );
                      tampilan22.setText ( "karena ma > mb (sin(alfa)+ us cos (alfa)) maka ma BERGERAK TURUN " );
                      tampilan23.setText (  "gaya penahan saat bergerak = mb*g(sin(alfa)+ uk cos(alfa))= "+df.format ( P ) + "N" );
                      tampilan24.setText ( "a = jumlah F / jumlah m   " );
                      tampilan25.setText ( "a = Wa - (Wb sin(alfa)-Fg)/(ma + mb)" );
                      tampilan26.setText ( "a = (ma - mb*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );
                      tampilan27.setText ( "" );
                      aa = (B1 -  P )  / D;

                      tampilan28.setText ( "a = " + df.format ( aa ) + "m/ss" );
                      tampilan29.setText ( "" );
                      tampilan30.setText ( "" );

                  } else


                  if (Q > Z1) {
                      tampilan20.setText ( "gaya penggerak benda ke kiri  mb g sin(alfa)  "+df.format ( Q ) + "N" );
                      tampilan21.setText (  "gaya penahan = mb*g + ma g us cos(alfa))= "+df.format ( Z1 ) + "N" );
                      tampilan22.setText ( "karena  mb g sin(alfa) >  g (ma + us mb cos (alfa)) maka ma BERGERAK NAIK " );
                      tampilan23.setText ( "a = jumlah F / jumlah m " );
                      tampilan24.setText ( "a = (Wb sin (alfa) - Fg - Wa)/(ma + mb)" );
                      tampilan25.setText ( "a = (mb*(sin(alfa) - uk mb cos(alfa) - ma)*g/(ma + mb)" );
                      tampilan26.setText ( "" );
                      aa = (Q - Z)  / D;

                      tampilan27.setText ( "a = " + df.format ( aa ) + "m/ss" );
                      tampilan28.setText ( "" );
                      tampilan30.setText ( "" );
                      tampilan29.setText ( "" );

                  } else

                  if (B1 < P1){
                      tampilan20.setText ( "Seandainya akan bergerak ke kanan (naik bidang miring)" );
                      tampilan21.setText ( "gaya penggerak  ke kanan benda menggantung ma*g = "+df.format ( B1 ) + "N" );
                      tampilan22.setText (  "gaya penahan = mb*g(sin(alfa)+ us cos(alfa))= "+df.format ( P1 ) + "N" );
                      tampilan23.setText  ( "karena gaya penggerak ke kanan tidak lebih dari gaya sesek statik maksimum, BENDA TIDAK BERGERAK" );
                      tampilan24.setText ( "" );
                      tampilan25.setText ( "Seandainya akan bergerak ke kiri (turun bidang miring)" );
                      tampilan26.setText ( "gaya penggerak benda ke kiri  mb g sin(alfa)  "+df.format ( Q ) + "N" );
                      tampilan27.setText (  "gaya penahan = ma*g + mb g us cos(alfa))= "+df.format ( Z1 ) + "N" );
                      tampilan28.setText ( "karena  mb g sin(alfa) <  g (ma + us mb cos (alfa))  " );
                      tampilan29.setText ( ") maka BENDA TIDAK BERGERAK " );
                      tampilan30.setText ( "" );
                      tampilan31.setText ( "" );
                      tampilan32.setText ( "" );
                      tampilan33.setText ( "" );


                  }} else

// Asumsi ke dua OK

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA

       if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
            !mb.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )&&
          !alfa.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                         mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                         tampilan1.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol" );
                         tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring LICIN" );
                         tampilan3.setText ( "" );
                         deg = 0.01745329251994329576923690768489 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                         A = mama * sin;
                         B = mbmb * sin;
                         D = mama + mbmb;

                         if ( mbmb > A ) {

                             tampilan4.setText ( "karena mb*g > ma*g sin(alfa) maka mb BERGERAK TURUN " );
                             tampilan5.setText ( "a = jumlah F / jumlah m   " );
                             tampilan6.setText ( "a = Wb - (Wa sin(alfa)/(ma + mb)" );
                             tampilan7.setText ( "a = (mb - ma*(sin(alfa) )*g/(ma + mb)" );
                             tampilan8.setText ( "" );
                             aa = (mbmb - A) * gg / D;

                             tampilan9.setText ( "a = " + df.format ( aa ) + "m/ss" );
                         }

                         if ( A > mbmb ) {
                             tampilan4.setText ( "karena ma sin(alfa) >  mb  maka mb BERGERAK NAIK " );
                             tampilan5.setText ( "a = jumlah F / jumlah m " );
                             tampilan6.setText ( "a = (Wa -  Wb)/(ma + mb)" );
                             tampilan7.setText ( "a = (ma*(sin(alfa) -  - mb)*g/(ma + mb)" );
                             tampilan8.setText ( "" );
                             aa = (A - mbmb) * gg / D;

                             tampilan9.setText ( "a = " + df.format ( aa ) + "m/ss" );
                         }

                         // atas dan bawah ini masih satu input dengan pengandaian berbeda
                         tampilan10.setText ( "" );
                         tampilan11.setText ( "" );
                         tampilan12.setText ( "sistem dua benda dihubungkan melalui tali dan katrol" );
                         tampilan13.setText ( "benda ma tergantung dan benda mb pada bidang miring LICIN" );
                         tampilan14.setText ( "" );
                         deg = 0.017444 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );


                         if ( mama > B ) {

                             tampilan15.setText ( "karena ma*g > mb*g (sin(alfa) maka ma BERGERAK TURUN " );
                             tampilan16.setText ( "a = jumlah F / jumlah m   " );
                             tampilan17.setText ( "a = Wa - (Wb sin(alfa)/(ma + mb)" );
                             tampilan18.setText ( "a = (ma - mb*(sin(alfa))*g/(ma + mb)" );
                             tampilan19.setText ( "" );
                             aa = (mama - B) * gg / D;

                             tampilan20.setText ( "a = " + df.format ( aa ) + "m/ss" );
                         } else if ( B > mama ) {
                             tampilan15.setText ( "karena  mb*g sin(alfa) >  ma*g;   maka ma BERGERAK NAIK " );
                             tampilan16.setText ( "a = jumlah F / jumlah m " );
                             tampilan17.setText ( "a = (Wb sin (alfa)  - Wa)/(ma + mb)" );
                             tampilan18.setText ( "a = (mb*(sin(alfa)  - ma)*g/(ma + mb)" );
                             tampilan19.setText ( "" );
                             aa = (B - mama) * gg / D;

                             tampilan20.setText ( "a = " + df.format ( aa ) + "m/ss" );
                         }

//ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ

    }  else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !uk.getText ( ).toString ( ).equals ( "" ) &&
                 !us.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
               !alfa.getText ( ).toString ( ).equals ( "" )&&
                  !F.getText ( ).toString ( ).equals ( "" )) {

                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                         usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                           FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );

             tampilan1.setText ( " Benda berada pada bidang miring membentuk sudut alfa ditarik gaya " +
                     " F sejajar bidang keatas dan ada gaya gesek" );
             deg = 0.01745329251994329576923690768489 * aalf;
             sin = Math.sin ( deg );
             cos = Math.cos ( deg );
             Fg = mama * gg * (sin + ukuk * cos);

             stop1 = mama * gg * (sin + usus * cos) ;
             stop = FF - stop1 ;
           F21 = mama * gg * sin ;
           F12 = usus*mama*gg*cos + FF;
             A = mama * gg * (sin - ukuk * cos) - FF;
             A1 = mama * gg * (sin - usus * cos) - FF;

             tampilan3.setText ( " Andaikan akan bergerak searah gaya tarik F:" );
             tampilan4.setText ( " Gaya penahan gerak ke atas maks = mg(sin(alfa) + us*cos(alfa))" );
             tampilan5.setText ( " Jika gaya tarik > gaya penahan, benda bergerak searah gaya tarik" );
             tampilan6.setText ( " bila bergerak us diganti uk" );
             tampilan7.setText ( " a = (F - mg(sin(alfa) + uk*cos(alfa)))/m" );
             tampilan8.setText ( " Bila gaya tarik < gaya maksimum penahan gerak, maka benda berhenti" );
             tampilan10.setText ( " Andaikan benda akan meluncur turun:" );
             tampilan11.setText ( " gaya luncur = mgsin(alfa):" );
           tampilan12.setText ( " gaya lawan yaitu gaya tarik dan gaya gesek statik = F + us*m*g cos(alfa)" );
           tampilan13.setText ( " Bila gaya luncur > F tarik dan gaya gesek statik, maka benda meluncur" );
           tampilan14.setText ( " benda meluncur, maka us diganti uk" );
           tampilan15.setText ( " a = (mgsin(alfa) - ( F + uk*m*g cos(alfa))/m" );
             tampilan17.setText ( " gaya tarik =  " + df.format(FF)+ "N");
             tampilan18.setText ( " gaya penahan gerak ke atas maksimum =  " + df.format(stop1) + "N");
             tampilan19.setText ( " gaya peluncur =  " + df.format(F21) + "N");
           tampilan20.setText ( " pelawan gaya luncur =  " + df.format(F12) + "N");

             if ( stop > 0 ) {
                 aa = (FF - mama * gg * (sin + ukuk * cos)) / mama;
                 tampilan21.setText ( " " );
                 tampilan22.setText ( " Gaya penggerak lebih besar dari gaya yang melawan, maka benda bergerak" );
                 tampilan23.setText ( "a =" + df.format ( aa ) + "m/ss" );



             } else if ( stop < 0 ) {
                 if ( A1 > 0 ) {
                     tampilan21.setText ( "  " );
                     tampilan22.setText ( " gaya luncur lebih besar dari gaya ke atas, " );
                     aa = (mama * gg * (sin - ukuk * cos) - FF) / mama;
                     tampilan23.setText ( " percepatan meluncur a = (ma*g*(sin alfa - uk*cos alfa)- F)/ma " );
                     tampilan24.setText ( " percepatan meluncur =" + df.format ( aa ) + "m/ss" );


                 } else if ( A1 < 0 ) {
                     tampilan21.setText ( "  " );
                     tampilan22.setText ( " Gaya tarik tidak cukup mengatasi gaya gesek dan juga gaya luncur ke bawah " +
                             "tidak lebih besar dari gaya ke atas + gaya gesek, " );

                     tampilan23.setText ( " BENDA BERHENTI " );

                 }
             }

    } else  if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                  !F.getText ( ).toString ( ).equals ( "" )) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                               FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                             aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

            tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarik gaya" +
                    " F dan tanpa gaya gesek" );
                 deg = 0.017444 * aalf;
                 sin = Math.sin ( deg );
                 cos = Math.cos ( deg );
              result = (FF - mama*gg*sin)/mama;
            tampilan2.setText ( "a = ((F- mgsin(alfa)/m" );
            tampilan3.setText ( "" );
            tampilan4.setText ( "a =" + df.format ( result ) + "m/ss" );
if (result < 0) {
    tampilan5.setText("percepatan negatif berarti benda bergerak ke bawah sejajar bidang miring");
}
else if (result > 0) {
        tampilan5.setText(" percepatan positif berarti benda bergerak ke atas sejajar bidang miring");

}} else    if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !mb.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" ) &&
                !us.getText ( ).toString ( ).equals ( "" ) &&
                !uk.getText ( ).toString ( ).equals ( "" )) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                             usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                             mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "KASUS PERTAMA" );
                    tampilan2.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                            " benda ma dimeja kasar dan mb tergantung," );
                             aa = (mbmb-(mama * ukuk) )* gg / (mama + mbmb);
                             stop = (mbmb-(mama * usus) )* gg / (mama + mbmb);
                    tampilan3.setText ( "" );
                    tampilan4.setText ( "benda bergerak jika 0 < (mb - us*ma)*g/(ma + mb)" );
                    tampilan5.setText ( " Jika gaya penggerak melebihi gaya gesek statik, " +
                            "maka percepatan diperoleh dari : a = (mb - uk*ma)*g/(ma + mb)" );

                    if (stop > 0){
                        tampilan6.setText ( "" );
                        tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
                    } else if (stop < 0) {
                        tampilan8.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
                    }
                     tampilan9.setText ( "" );
                     tampilan10.setText ( "KASUS KEDUA" );
                     tampilan11.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                            " benda mb dimeja kasar dan ma tergantung," );
                              aa = (mama-(mbmb * ukuk) )* gg / (mama + mbmb);
                            stop = (mama-(mbmb * usus) )* gg / (mama + mbmb);
                     tampilan12.setText ( "" );
                     tampilan13.setText ( "benda bergerak jika 0 <  (ma - us*mb)*g/(ma + mb)" );
                     tampilan14.setText ( " Jika gaya penggerak lebih besar dari gaya gesek statik," +
                             " maka percepatan diperoleh dari: a = (ma - uk*mb)*g/(ma + mb)" );
                     tampilan15.setText ( "" );

                     if (stop > 0){
                         tampilan16.setText ( "a = " + df.format ( aa ) + "m/ss" );
                     } else if (stop < 0) {
                         tampilan17.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
                     }





}else  if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
            !mb.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "KASUS  PERTAMA  " );
                   tampilan2.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                   "benda ma di meja licin dan mb tergantung" );
           tampilan3.setText ( " Belaku hukum 2 Newton, F = ma, F gaya penggerak = m*g*mb,  m adalah jumlah massa ma +mb, jadi:" );
                              aa= mbmb * gg / (mama + mbmb);
                   tampilan4.setText ( "" );
                   tampilan5.setText ( "a = mb*g/(ma + mb)" );
                   tampilan6.setText ( "" );
                   tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
                   tampilan8.setText ( "" );
                   tampilan9.setText ( " KASUS KEDUA" );
                   tampilan10.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                           "benda mb di meja licin dan ma tergantung" );
           tampilan11.setText ( " Belaku hukum 2 Newton, F = m * a, F gaya penggerak = m*g*ma,  m adalah jumlah massa ma + mb, jadi:" );
                           aa= mama * gg / (mama + mbmb);
                   tampilan12.setText ( "" );
                   tampilan13.setText ( "a = ma*g/(ma + mb)" );
                   tampilan14.setText ( "" );
                   tampilan15.setText ( "a = " + df.format ( aa ) + "m/ss" );

            if(mbmb > mama) {
                tampilan17.setText ( " KASUS KETIGA" );

                tampilan18.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                        " benda ma dan mb tergantung, ma < mb" );
                tampilan19.setText ( " Berlaku huku 2 Neton, F = m*a; F adalah selisih berat benda = mb*g -ma*g " );
                result = (mbmb - mama) * gg / (mama + mbmb);
                tampilan20.setText ( "a = (mb-ma)*g/(ma + mb)" );
                tampilan21.setText ( "" );
                tampilan22.setText ( "a =" + df.format ( result ) + "m/ss" );
            } else if(mama > mbmb){
                    tampilan17.setText ( " KASUS KETIGA" );
                    tampilan18.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                    "benda ma dan mb tergantung, ma > mb" );
                tampilan19.setText ( " Berlaku huku 2 Neton, F = m*a; F adalah selisih berat benda = mb*g -ma*g, m = jumlah massa = ma + mb " );
                         result = (mama-mbmb) * gg / (mama + mbmb);
                    tampilan20.setText ( "a = (ma-mb)*g/(ma + mb)" );
                    tampilan21.setText ( "" );
                    tampilan22.setText ( "a =" + df.format ( result ) + "m/ss" );


       }} else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )&&
          !teta.getText ( ).toString ( ).equals ( "" )&&
            !uk.getText ( ).toString ( ).equals ( "" )&&
             !F.getText ( ).toString ( ).equals ( "" )) {

                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                  teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "benda berada pada bidang datar ditarik gaya membentuk sudut teta, " +
                                     "dan terdapat gaya gesek" );
                           deg = 0.017444 * teeta;
                           sin = Math.sin ( deg );
                           cos = Math.cos ( deg );
                           aa = (FF * cos - ukuk * (gg * mama - FF * sin)) / mama;
                           stop = (FF * cos - usus * (gg * mama - FF * sin)) / mama;
                    tampilan2.setText ( "" );
                    tampilan3.setText ( " benda bergerak jika 0 < ((F cos(teta) -  us(m g - Fsin(teta))/m" );
                    tampilan4.setText ( " a = ((F cos(teta) -  uk(m g - Fsin(teta))/m" );
                    tampilan5.setText ( "" );
                           if ( stop > 0 ) {
                    tampilan6.setText ( " a = " + df.format ( aa ) + "m/ss" );
          } else if ( stop < 0 ) {
                     tampilan6.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
            }

} else  if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !N.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

             if ( NN > (mama * gg) ) {

                       tampilan1.setText ( " benda atau orang di lift yang bergerak dipercepat ke atas" );
                       tampilan2.setText ( "" );
                            aa = (NN - mama * gg) / mama;
                       tampilan3.setText ( "a = (N - mg)/m" );
                       tampilan4.setText ( "" );
                       tampilan5.setText ( "a =" + df.format ( aa ) + "m/ss" );


             } else if ( NN < (mama * gg) ) {

                        tampilan1.setText ( " benda atau orang di lift yang bergerak dipercepat ke bawah" );
                                 result = (mama * gg - NN) / mama;
                        tampilan2.setText ( "" );
                        tampilan3.setText ( "a = (mg - N)/m" );
                        tampilan4.setText ( "" );
                        tampilan5.setText ( "a =" + df.format ( result ) + "m/ss" );


    } } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                   !F.getText ( ).toString ( ).equals ( "" ) &&
                   !g.getText ( ).toString ( ).equals ( "" ) &&
                   !us.getText ( ).toString ( ).equals ( "" ) &&
                  !uk.getText ( ).toString ( ).equals ( "" ) ) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                             usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                               FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                      tampilan1.setText ( "benda ditempat datar ditarik dengan gaya horisontal dan terjadi gaya gesek" );
                              aa = (FF - ukuk * mama * gg) / mama;
                            stop = (FF - usus * mama * gg) / mama;
                      tampilan2.setText ( "" );
                      tampilan3.setText ( " benda bergerak jika 0 <(F- us*m*g)/m" );
                      tampilan4.setText ( "a = (F- uk*m*g)/m" );
                      tampilan5.setText ( "" );

        if ( stop > 0 ) {
                      tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
        } else if ( stop < 0 ) {
                      tampilan6.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
        }

    } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !teta.getText ( ).toString ( ).equals ( "" ) &&
                 !F.getText ( ).toString ( ).equals ( "" ) ) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                       tampilan1.setText ( "benda ditempat datar LICIN ditarik gaya membentuk sudut teta" );
                                 deg = 0.017444 * teeta;
                                 cos = Math.cos ( deg );
                              result = FF * cos / mama;
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "a = F cos (teta)/m" );
                       tampilan4.setText ( "" );
                       tampilan5.setText ( "a =" + df.format ( result ) + "m/ss" );

    } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !F.getText ( ).toString ( ).equals ( "" ) ) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                      tampilan1.setText ( "benda ditempat datar LICIN  ditarik gaya sejajar lantai" );
                      tampilan2.setText ( "" );
                               result = FF / mama;
                      tampilan3.setText ( "a = F/m" );
                      tampilan4.setText ( "" );
                      tampilan5.setText ( "a =" + df.format ( result ) + "m/ss" );


    } else if ( !g.getText ( ).toString ( ).equals ( "" ) &&
             !alfa.getText ( ).toString ( ).equals ( "" ) &&
               !uk.getText ( ).toString ( ).equals ( "" ) ) {
                         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "   benda di bidang miring dengan sudut alfa  meluncur dengan gesekan" );
                   tampilan2.setText ( "" );
                   tampilan3.setText ( "   a = jumlah gaya/ jumlah massa" );
                       deg = 0.017444 * aalf;
                       sin = Math.sin ( deg );
                       cos = Math.cos ( deg );
                        aa = gg * (sin - (ukuk * cos));
                   tampilan4.setText ( "a = g * (sin (alfa)- uk cos (alfa)) " );
                   tampilan5.setText ( "" );
                   tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );


    } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" ) &&
                !uk.getText ( ).toString ( ).equals ( "" ) ) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                      tampilan1.setText ( "   benda di lantai kasar meluncur" );
                      tampilan2.setText ( "" );
                      tampilan3.setText ( "   a = jumlah gaya/ jumlah massa" );
                      tampilan4.setText ( "a = - uk m g/m = - uk g " );
                           aa = -ukuk * gg;
                      tampilan5.setText ( "" );
                      tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );

    } else if ( !g.getText ( ).toString ( ).equals ( "" ) &&
             !alfa.getText ( ).toString ( ).equals ( "" ) ) {
                      aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                     tampilan1.setText ( "   benda di bidang miring dengan sudut alfa meluncur tanpa gesekan" );
                               deg = 0.017444 * aalf;
                               sin = Math.sin ( deg );
                            result = gg * sin;
                     tampilan2.setText ( "" );
                     tampilan3.setText ( "a = g * sin (alfa)" );
                     tampilan4.setText ( "" );
                     tampilan5.setText ( "a = " + df.format ( result ) + "m/ss" );

        //POLA YANG SAMA JUGA BERLAKU PADA KECEPATAN DAN JARAK TEMPUH
       }}} );

    btnv.setOnClickListener ( new View.OnClickListener ( ) {
       @Override public void onClick ( View view ) {
        DecimalFormat df = new DecimalFormat ( "#.###" );

     if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
          !mb.getText ( ).toString ( ).equals ( "" ) &&
           !g.getText ( ).toString ( ).equals ( "" )&&
          !uk.getText ( ).toString ( ).equals ( "" )&&
          !us.getText ( ).toString ( ).equals ( "" )&&
        !alfa.getText ( ).toString ( ).equals ( "" )&&
           !t.getText ( ).toString ( ).equals ( "" )) {
                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                   usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                   tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                   mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );

               tampilan1.setText ( " KEMUNGKINAN PERTAMA, sistem dua benda dihubungkan melalui tali dan katrol" );
               tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring dan terjadi gaya gesek" );
                         deg = 0.017444 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                           A = mama * gg*(sin + ukuk * cos);//gaya pelawan gerak bila bergerak
                          A1 = mama * gg*(sin + usus * cos);//gaya pelawan gerak bila berhenti
                           B = mama *gg* sin; //penggerak turun miring
                           C = mbmb *gg + gg*(ukuk * mama * cos);//yang melawan gerak turun bidang miring bila gerak
                          C1 = mbmb *gg + gg*(usus * mama * cos);//yang melawan gerak turun bidang miring bila diam
                           D = mama + mbmb;
                           P = mbmb * gg*(sin + ukuk * cos);// gaya kekiri  namun gerak kekanan
                          P1 = mbmb *gg* (sin + usus * cos);// gaya kekiri pada bidang miring (diam)
                           Q = mbmb *gg* sin;// gaya penggerak ke kiri
                           Z = mama*gg + gg*(ukuk * mbmb * cos); //gaya ke kanan  namun gerak kiri
                          Z1 = mama*gg + gg*(usus * mbmb * cos); //gaya ke kanan  akan gerak kiri (diam)
                         F11 = mbmb*gg;
                         F12 = mama*gg;
          if ( F11 > A1 ) {
                   tampilan3.setText ( "" );
                   tampilan4.setText ( "Gaya penggerak ke atas mb * g  = " + df.format ( F11 ) + "N" );
                   tampilan5.setText ( "Gaya penahan gerak ke atas ma g(sin(alfa)+ us cos (alfa))  = " + df.format ( A1 ) + "N" );
                   tampilan6.setText ( "karena mb g > ma g(sin(alfa)+ us cos (alfa)) maka mb BERGERAK TURUN " );
                   tampilan7.setText ( "a = jumlah F / jumlah m   " );
                   tampilan8.setText ( "a = Wb - (Wa sin(alfa)-Fg)/(ma + mb)" );
                   tampilan9.setText ( "a = (mb - ma*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );
                          aa = (F11 - A)/ D;
                        vtvt = aa * tt;
                   tampilan10.setText ( "" );
                   tampilan11.setText ( "vt = a t" );
                   tampilan12.setText ( "a = " + df.format ( aa ) + "m/ss" );
                   tampilan13.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

               } else
               if ( B > C1 ) {
                   tampilan3.setText ( "" );
                   tampilan4.setText ( "Gaya penggerak ke bawah bidang miring  ma * g * sin alfa = " + df.format ( B ) + "N" );
                   tampilan5.setText ( "Gaya penahan gerak ke bawah mb g(sin(alfa)+ us cos (alfa))  = " + df.format ( C1 ) + "N" );
                   tampilan6.setText ( "karena gaya penggerak meluncur bidang miring > gaya penahan, mb BERGERAK NAIK " );
                   tampilan7.setText ( "a = jumlah F / jumlah m " );
                   tampilan8.setText ( "a = (Wa - Fg - Wb)/(ma + mb)" );
                   tampilan9.setText ( "a = (ma*(sin(alfa) - uk ma cos(alfa) - mb)*g/(ma + mb)" );
                         aa = (B - C) / D;
                       vtvt = aa * tt;
                   tampilan10.setText ( "" );
                   tampilan11.setText ( "vt = a t" );
                   tampilan12.setText ( "" );
                   tampilan13.setText ( "a = " + df.format ( aa ) + "m/ss" );
                   tampilan14.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
               }
            else if ( B < C1) {
               tampilan3.setText ( "" );
               tampilan4.setText ( "bila akan meluncur NAIK bidang miring:" );
               tampilan5.setText ( "Gaya penggerak ke atas mb * g  = " + df.format ( F11 ) + "N" );
               tampilan6.setText ( "Gaya penahan gerak ke atas ma g(sin(alfa)+ us cos (alfa))  = " + df.format ( A1 ) + "N" );
               tampilan7.setText ( "karena mb g < ma g(sin(alfa)+ us cos (alfa)) maka BENDA BERHENTI " );
               tampilan8.setText ( "" );
               tampilan9.setText ( "bila akan meluncur turun bidang miring:" );
               tampilan10.setText ( "Gaya penggerak ke bawah bidang miring  ma * g * sin alfa = " + df.format ( B ) + "N" );
               tampilan11.setText ( "Gaya penahan gerak ke bawah mb g + us ma g cos (alfa))  = " + df.format ( C1 ) + "N" );
               tampilan12.setText ( "karena gaya penggerak meluncur bidang miring < gaya penahan, BENDA BERHENTI" );

            }
// ASUMSI KE DUA

               tampilan16.setText ( "KEMUNGKINAN KEDUA" );
               tampilan17.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol" );
               tampilan18.setText ( "benda ma tergantung dan benda mb pada bidang miring dan terjadi gaya gesek" );
               tampilan19.setText ( "" );
                         deg = 0.017444 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );

               // atas dan bawah ini masih satu input dengan pengandaian berbeda


               if ( F12 > P1 ) {

                   tampilan20.setText ( "karena ma > mb (sin(alfa)+ us cos (alfa)) maka ma BERGERAK TURUN " );
                   tampilan21.setText ( "a = jumlah F / jumlah m   " );
                   tampilan22.setText ( "a = Wa - (Wb sin(alfa)-Fg)/(ma + mb)" );
                   tampilan23.setText ( "a = (ma - mb*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );
                   tampilan24.setText ( "" );
                   aa = (F12 - P)  / D;

                   vtvt = aa * tt;
                   tampilan25.setText ( "vt = a t" );
                   tampilan26.setText ( "" );
                   tampilan27.setText ( "a = " + df.format ( aa ) + "m/ss" );
                   tampilan28.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

               } else

               if ( Q > Z1 ) {
                   tampilan18.setText ( "gaya penggerak turun bidang miring  = mb sin(alfa)" + df.format ( Q ) + "N" );
                   tampilan19.setText ( "gaya penahan gerak turun bidang miring  = g(ma + us mb cos (alfa)" + df.format ( Q ) + "Z1" );
                   tampilan20.setText ( "karena  mb g sin(alfa) >  g(ma + us mb cos (alfa)) maka ma BERGERAK NAIK " );
                   tampilan21.setText ( "a = jumlah F / jumlah m " );
                   tampilan22.setText ( "a = (Wb sin (alfa) - Fg - Wa)/(ma + mb)" );
                   tampilan23.setText ( "a = (mb*(sin(alfa) - uk mb cos(alfa) - ma)*g/(ma + mb)" );

                   aa = (Q - Z)  / D;
                   vtvt = aa * tt;
                   tampilan24.setText ( "vt = a t" );
                   tampilan25.setText ( "" );
                   tampilan26.setText ( "a = " + df.format ( aa ) + "m/ss" );
                   tampilan27.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
               } else if (  Q < Z1 ) {
                   tampilan18.setText ( "" );
                   tampilan19.setText ( "Bila akan bergerak NAIK bidang miring" );
                   tampilan20.setText ( "gaya penggerak naik bidang miring  = ma*g = " + df.format (F12) + "N" );
                   tampilan21.setText ( "gaya penahan gerak naik bidang miring  = mb g (sin alfa+ us cos (alfa)) = " + df.format (P1) + "N" );
                   tampilan22.setText ( "Gaya penggerak tidak bisa mengatasi gaya penahan, maka BENDA BERHENTI" );
                   tampilan23.setText ( "" );
                   tampilan24.setText ( "Bila akan bergerak TURUN bidang miring" );
                   tampilan25.setText ( "gaya penggerak turun bidang miring  = m*g*sin alfa = " + df.format (Q) + "N" );
                   tampilan26.setText ( "gaya penahan gerak turun bidang miring  = ma g + us mb cos (alfa)= " + df.format (Z1) + "N" );
                   tampilan27.setText ( "Gaya penggerak tidak bisa mengatasi gaya penahan, maka BENDA BERHENTI" );
                   tampilan28.setText ( "" );
                   tampilan29.setText ( "" );
                   tampilan30.setText ( "" );
                   tampilan31.setText ( "" );
                   tampilan32.setText ( "" );

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
 }} else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !mb.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
            !alfa.getText ( ).toString ( ).equals ( "" )&&
               !t.getText ( ).toString ( ).equals ( "" )) {
         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
         tt = Double.parseDouble ( t.getText ( ).toString ( ) );
         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
         mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

         tampilan1.setText ( "sistem dua benda dihubungkan melalui tali dan katrol" );
         tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring LICIN" );
         tampilan3.setText ( "" );
         deg = 0.017444 * aalf;
         sin = Math.sin ( deg );
         cos = Math.cos ( deg );
         A = mama * sin;
         B = mbmb * sin;
         D = mama + mbmb;

         if ( mbmb > A ) {

             tampilan4.setText ( "karena mb > ma sin(alfa) maka mb BERGERAK TURUN " );
             tampilan5.setText ( "a = jumlah F / jumlah m   " );
             tampilan6.setText ( "a = Wb - (Wa sin(alfa)/(ma + mb)" );
             tampilan7.setText ( "a = (mb - ma*(sin(alfa) )*g/(ma + mb)" );
             aa = (mbmb - A) * gg / D;
             vtvt = aa * tt;
             tampilan8.setText ( "vt = a t" );
             tampilan9.setText ( "" );
             tampilan10.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan11.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
         } else if ( A > mbmb ) {
             tampilan4.setText ( "karena ma sin(alfa) >  mb  maka mb BERGERAK NAIK " );
             tampilan5.setText ( "a = jumlah F / jumlah m " );
             tampilan6.setText ( "a = (Wa -  Wb)/(ma + mb)" );
             tampilan7.setText ( "a = (ma*(sin(alfa) -  - mb)*g/(ma + mb)" );

             aa = (A - mbmb) * gg / D;
             vtvt = aa * tt;
             tampilan8.setText ( "vt = a t" );
             tampilan9.setText ( "" );
             tampilan10.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan11.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
         }

         tampilan12.setText ( "" );
         tampilan13.setText ( "" );
         tampilan14.setText ( "sistem dua benda dihubungkan melalui tali dan katrol" );
         tampilan15.setText ( "benda ma tergantung dan benda mb pada bidang miring LICIN" );
         tampilan16.setText ( "" );
         deg = 0.017444 * aalf;
         sin = Math.sin ( deg );
         cos = Math.cos ( deg );

         // atas dan bawah ini masih satu input dengan pengandaian berbeda

         if ( mama > B ) {

             tampilan17.setText ( "karena ma > mb (sin(alfa) maka ma BERGERAK TURUN " );
             tampilan18.setText ( "a = jumlah F / jumlah m   " );
             tampilan19.setText ( "a = Wa - (Wb sin(alfa)/(ma + mb)" );
             tampilan20.setText ( "a = (ma - mb*(sin(alfa))*g/(ma + mb)" );

             aa = (mama - B) * gg / D;

             vtvt = aa * tt;
             tampilan21.setText ( "vt = a t" );
             tampilan22.setText ( "" );
             tampilan23.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan24.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
         }

         if ( B > mama ) {
             tampilan17.setText ( "karena  mb sin(alfa) >  ma;   maka ma BERGERAK NAIK " );
             tampilan18.setText ( "a = jumlah F / jumlah m " );
             tampilan19.setText ( "a = (Wb sin (alfa)  - Wa)/(ma + mb)" );
             tampilan20.setText ( "a = (mb*(sin(alfa)  - ma)*g/(ma + mb)" );

             aa = (B - mama) * gg / D;
             vtvt = aa * tt;
             tampilan21.setText ( "vt = a t" );
             tampilan22.setText ( "" );
             tampilan23.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan24.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
         }

//ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ
     } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !F.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" ) &&
               !alfa.getText ( ).toString ( ).equals ( "" ) &&
                 !uk.getText ( ).toString ( ).equals ( "" ) &&
                  !t.getText ( ).toString ( ).equals ( "" )) {
                               mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                               ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                               FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                               aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                               tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarika gaya " +
                               "F sejarar bidang keatas dan terdadap gaya gesek" );
                       tampilan2.setText ( "" );
                             deg = 0.017444 * aalf;
                             sin = Math.sin ( deg );
                             cos = Math.cos ( deg );
                            Fgs11= mama*gg*(sin+usus*cos);
                            Fgs21= (mama*gg*usus*cos)+FF;
                             F21 = mama*gg*sin;

                   if (FF > Fgs11) {
                       tampilan4.setText ( " Gaya penahan gerak = ma*g*(sin alfa us cos alfa)=  " + df.format ( aa ) + "m/ss" );
                       tampilan5.setText ( " Gaya penggerak > gaya penahan, makan benda bergerak searah gaya" );
                           aa = (FF - mama * gg * (sin + ukuk* cos)) / mama;
                           vtvt = aa * tt;
                       tampilan6.setText ( "a = (F - mg(sin(alfa) + ukcos(alfa))/m;    vt = a t" );
                       tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan8.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                   } else if(F21 > Fgs21 ){
                       tampilan4.setText ( "Gaya penggerak turun  F21 = ma* sin alfa= " + df.format ( F21 ) + "N" );
                       tampilan5.setText ( "Gaya penahan ggerak turun max   = F + ma*us cos alfa = " + df.format ( Fgs21 ) + "N" );
                       tampilan6.setText ( "gaya penggerak > gaya penahan, Benda turun bidang miring" );
                               aa = (F21 - Fgs21)/mama;
                               vtvt = aa * tt;
                       tampilan7.setText ( "a = ( mg(sin(alfa)- ( F + ukcos(alfa))/m;    vt = a t" );
                       tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan9.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

                  } else if(F21 < Fgs21 ) {
                               tampilan4.setText ( "Gaya penggerak turun  F21 = ma* sin alfa= " + df.format ( F21 ) + "N" );
                               tampilan5.setText ( "Gaya penahan ggerak turun max   = F + ma*us cos alfa = " + df.format ( Fgs21 ) + "N" );
                               tampilan6.setText ( "gaya penggerak < gaya penahan, Benda BERHENTI" );
                           }

  } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !t.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" ) &&
            !alfa.getText ( ).toString ( ).equals ( "" ) &&
                F.getText ( ).toString ( ).equals ( "" )) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                      aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarik gaya" +
                               " F dan tanpa gaya gesek" );
                              deg = 0.017444 * aalf;
                              sin = Math.sin ( deg );
                              cos = Math.cos ( deg );
                               aa = (FF - mama * gg * sin) / mama;
                             vtvt = aa * tt;
                       tampilan2.setText ( "a = ((F- mgsin(alfa)/m" );
                       tampilan3.setText ( "a = ((F- mgsin(alfa)/m" );
                       tampilan4.setText ( "vt = a t" );
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !mb.getText ( ).toString ( ).equals ( "" ) &&
              !t.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )) {
                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                       tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                     mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );


         tampilan1.setText ( "KASUS PERTAMA" );
         tampilan2.setText ( " Benda A diatas MEJA LICIN ditarik tali melalui katrol," +
                 " dihubungkan benda B yang tegantung" );
         aa = mbmb  * gg / (mama + mbmb);
         tampilan3.setText ( " Gaya pemercepat adalah benda yang menggantung F = mb g" +
                 "massa yang dipecepat ma dan mb, maka percepatannya" );
         tampilan4.setText ( "a = mb*g/(ma + mb)" );
         vtvt = aa * tt;
         tampilan5.setText ( "vt = a t" );
         tampilan6.setText ( "" );
         tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
         tampilan8.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

         tampilan10.setText ( "KASUS KEDUA" );
         tampilan11.setText ( " Benda B diatas MEJA LICIN ditarik tali melalui katrol," +
                 " dihubungkan benda A yang tegantung" );
         aa =  mama * gg / (mama + mbmb);
         tampilan12.setText ( " Gaya pemercepat adalah benda yang menggantung F = ma g" +
                 "massa yang dipecepat ma dan mb, maka percepatannya" );
         tampilan13.setText ( "a = ma*g/(ma + mb)" );
         vtvt = aa * tt;
         tampilan14.setText ( "vt = a t" );
         tampilan15.setText ( "" );
         tampilan16.setText ( "a = " + df.format ( aa ) + "m/ss" );
         tampilan17.setText ( "vt = " + df.format ( vtvt ) + "m/s" );


         if ( mbmb < mama) {
             tampilan19.setText ( "KASUS KETIGA" );
             tampilan20.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                     " benda ma dan mb tergantung, ma > mb" );
             aa = (mama - mbmb) * gg / (mama + mbmb);
             tampilan21.setText ( "" );
             tampilan22.setText ( "a = (mb-ma)*g/(ma + mb)" );
             vtvt = aa * tt;
             tampilan23.setText ( "vt = a t" );
             tampilan24.setText ( "" );
             tampilan25.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan26.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

         } else if ( mbmb > mama) {
                             tampilan19.setText ( "KASUS KETIGA" );
                             tampilan20.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                                     " benda ma dan mb tergantung, ma < mb" );
                             aa = (mbmb - mama) * gg / (mama + mbmb);
                             tampilan21.setText ( "" );
                             tampilan22.setText ( "a = (mb - ma)*g/(ma + mb)" );
                             vtvt = aa * tt;
                             tampilan23.setText ( "vt = a t" );
                             tampilan24.setText ( "" );
                             tampilan25.setText ( "a = " + df.format ( aa ) + "m/ss" );
                             tampilan26.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

                         }


      } else    if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !mb.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" ) &&
                  !t.getText ( ).toString ( ).equals ( "" )&&
                 !us.getText ( ).toString ( ).equals ( "" )&&
                 !uk.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                            ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                            usus = Double.parseDouble ( uk.getText ( ).toString ( ) );
                              tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                           tampilan1.setText ( "KASUS PERTMA" );
                           tampilan2.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                               " benda ma dimeja kasar dan mb tergantung," );
                           tampilan3.setText ( "" );

                               aa = (mbmb - (mama * usus)) * gg / (mama + mbmb);
                           if (aa > 0) {

                               tampilan4.setText ( " (mb > uS*ma)*g,   berarti gaya penggerak " +
                                       "lebih besar dari pada gaya gesek ststik)" );
                               tampilan5.setText ( "  setelah bergerak terjadi gaya gesek kinetik, maka percepatan dihitung dengan " );
                               tampilan6.setText ( "a = (mb - (ma * uk)) * g / (ma + mb" );
                               aa = (mbmb - (mama * ukuk)) * gg / (mama + mbmb);
                               vtvt = aa * tt;
                           tampilan7.setText ( "vt = a t" );
                           tampilan8.setText ( "" );
                           tampilan9.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan10.setText ( "vt = " + df.format ( vtvt ) + "m/s" );

                   } else
                           if (aa < 0) {
                               tampilan4.setText ( " KARENA (mb < uS*ma)*g, gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );

                           }
                               tampilan12.setText ( "KASUS KEDUA" );
                               tampilan13.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                                       " benda mb dimeja kasar dan ma tergantung," );
                               aa = (mama - (mbmb * ukuk)) * gg / (mama + mbmb);
                               tampilan14.setText ( "" );

                   if (aa > 0){
                       aa = (mama - (mbmb * ukuk)) * gg / (mama + mbmb);
                       vtvt = aa * tt;

                       tampilan15.setText ( " (mb > uS*ma)*g,   berarti gaya penggerak " +
                               "lebih besar dari pada gaya gesek ststik)" );
                       tampilan16.setText ( "  setelah bergerak terjadi gaya gesek kinetik, maka percepatan dihitung dengan " );
                       tampilan17.setText ( "a = (ma - uk*mb)*g/(ma + mb)" );
                       tampilan18.setText ( "vt = a t" );
                       tampilan19.setText ( "" );
                       tampilan20.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan21.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                 } else
                   if (aa < 0) {
                       tampilan15.setText ( "KARENA (ma < uS*mb)*g  ;  gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
                   }
  } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !mb.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" ) &&
               !t.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                    mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                      gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                               "benda ma di meja licin dan mb tergantung" );
                             aa = mbmb * gg / (mama + mbmb);
                           vtvt = aa * tt;
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "a = mb*g/(ma + mb)" );
                       tampilan4.setText ( "" );
                       tampilan5.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan6.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                       tampilan7.setText ( "" );
                       tampilan8.setText ( "" );
                       tampilan9.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                               "benda mb di meja licin dan ma tergantung" );
                             aa = mama * gg / (mama + mbmb);
                           vtvt = aa * tt;
                       tampilan10.setText ( "" );
                       tampilan11.setText ( "a = ma*g/(ma + mb)" );
                       tampilan12.setText ( "vt = a t" );
                       tampilan13.setText ( "" );
                       tampilan14.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan15.setText ( "vt = " + df.format ( vtvt ) + "m/s" );


  } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
            !teta.getText ( ).toString ( ).equals ( "" )&&
               !F.getText ( ).toString ( ).equals ( "" ) &&
             !t.getText ( ).toString ( ).equals ( "" ) &&
              !us.getText ( ).toString ( ).equals ( "" ) &&
              !uk.getText ( ).toString ( ).equals ( "" )) {
                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                     ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                    teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                       tt = Double.parseDouble ( t.getText ( ).toString ( ) );


         tampilan1.setText ( "benda diam berada pada bidang datar ditarik gaya membentuk sudut teta, " +
                               "dan terdapat gaya gesek" );
                       tampilan2.setText ( "" );
                             deg = 0.017444 * teeta;
                             sin = Math.sin ( deg );
                             cos = Math.cos ( deg );
                              aa = (FF * cos - usus * (gg * mama - FF * sin)) / mama;
                   if (aa > 0){
                       aa = (FF * cos - ukuk * (gg * mama - FF * sin)) / mama;
                        vtvt = aa*tt;
                       tampilan3.setText ( "a = ((F cos(teta) -  uk(m g - Fsin(teta))/m" );

                       tampilan4.setText ( "vt = a t" );
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                    } else
                   if (aa < 0) {
                       tampilan4.setText ( "0 >  (FF * cos - usus * (gg * mama - FF * sin)) / mama" );
                       tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
                   }

     } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )&&
             !F.getText ( ).toString ( ).equals ( "" ) &&
             !us.getText ( ).toString ( ).equals ( "" ) &&
             !t.getText ( ).toString ( ).equals ( "" ) &&
             !uk.getText ( ).toString ( ).equals ( "" )) {
         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
         usus = Double.parseDouble ( us.getText ( ).toString ( ) );
         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
         FF = Double.parseDouble ( F.getText ( ).toString ( ) );
         gg = Double.parseDouble ( g.getText ( ).toString ( ) );
         tt = Double.parseDouble ( t.getText ( ).toString ( ) );

         tampilan1.setText ( "benda diam berada pada bidang datar ditarik gaya mendatar, " +
                 "dan terdapat gaya gesek" );
         tampilan2.setText ( "benda bergerak jika (F - gaya gesek statis) > 0" );

         aa = (FF - usus*mama*gg) / mama;
         if (aa > 0){
             aa = (FF - ukuk*mama*gg) / mama;
             vtvt = aa*tt;

             tampilan3.setText ( "a =  ( F - uk.m.g)/m" );

             tampilan4.setText ( "vt = a t" );
             tampilan5.setText ( "" );
             tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
         } else if (aa < 0){

         tampilan4.setText ( "0 >  (F - uk.m.g)" );
         tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga TIDAK BERGERAK" );

  }
     }else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !t.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" ) &&
                !N.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                      tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                      gg = Double.parseDouble ( g.getText ( ).toString ( ) );

    if ( NN > (mama*gg)) {
        tampilan1.setText ( " benda atau orang di lift yang bergerak dipercepat ke atas" );
        tampilan2.setText ( "" );
        aa = (NN - mama * gg) / mama;

        tampilan3.setText ( "a = (N - mg)/m" );
        vtvt = aa * tt;
        tampilan4.setText ( "vt = a t" );
        tampilan5.setText ( "" );
        tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
        tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
        // } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) && !t.getText ( ).toString ( ).equals ( "" ) &&
        //              !g.getText ( ).toString ( ).equals ( "" )&& !N.getText ( ).toString ( ).equals ( "" )) {

        //mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
        //  NN = Double.parseDouble ( N.getText ( ).toString ( ) );
        // tt = Double.parseDouble ( t.getText ( ).toString ( ) );
        // gg = Double.parseDouble ( g.getText ( ).toString ( ) );

    } else  if ( NN < (mama*gg)) {

        tampilan1.setText ( " benda atau orang di lift yang bergerak dipercepat ke bawah" );
        result = (mama * gg - NN) / mama;
        vtvt = aa * tt;
        tampilan2.setText ( "" );
        tampilan3.setText ( "a = (mg - N)/m" );
        tampilan4.setText ( "vt = a t" );
        tampilan5.setText ( "" );
        tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
        tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );


  }} else if
        ( !ma.getText ( ).toString ( ).equals ( "" ) &&
           !F.getText ( ).toString ( ).equals ( "" ) &&
           !g.getText ( ).toString ( ).equals ( "" ) &&
           !t.getText ( ).toString ( ).equals ( "" ) &&
          !uk.getText ( ).toString ( ).equals ( "" ) &&
        !teta.getText ( ).toString ( ).equals ( "" )) {
                  mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                  ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                 teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                    FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( "   benda di lantai kasar ditarik gaya membentuk sudut teta" );
                       tampilan2.setText ( "" );
                          deg = 0.017444 * teeta;
                          cos = Math.cos ( deg );
                           aa = (FF * cos - usus * (gg * mama - FF * sin)) / mama;
                       if (aa > 0){
                            aa = (FF * cos - ukuk * (gg * mama - FF * sin)) / mama;
                          vtvt = tt * (FF * cos - ukuk * (gg * mama - FF * sin)) / mama;

                       tampilan3.setText ( "a = ((F cos(teta) -  uk(m g - Fsin(teta))/m" );
                       tampilan4.setText ( "vt = a t" );
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan7.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                       } else
                           tampilan3.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );


 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
           !teta.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
              !F.getText ( ).toString ( ).equals ( "" )&&
              !t.getText ( ).toString ( ).equals ( "" )) {

                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                       FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                       tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( "    benda di lantai LICIN ditarik gaya membentuk sudut teta" );
                       tampilan2.setText ( "" );
                                 deg = 0.017444 * teeta;
                                 cos = Math.cos ( deg );
                                  aa = (FF * cos) / mama;
                                vtvt = aa*tt;
                       tampilan3.setText ( "a =  F cos(teta) /m" );
                       tampilan4.setText ( "vt =  a t" );
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "a =" + df.format (aa ) + "m/ss" );
                       tampilan7.setText ( "vt =" + df.format ( vtvt ) + "m/s" );


 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !t.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" ) &&
              !F.getText ( ).toString ( ).equals ( "" ) &&
             !us.getText ( ).toString ( ).equals ( "" ) &&
             !uk.getText ( ).toString ( ).equals ( "" )) {
                  mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                  ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                    FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda dilantai KASAR ditarik gaya mendatar" );
                       tampilan2.setText ( "" );
                            aa = (FF - usus * mama * gg) / mama;
                  if (aa > 0){
                            aa = (FF - ukuk * mama * gg) / mama;
                          vtvt = aa*tt;
                       tampilan3.setText ( "Apakah gaya bisa mengatasi gaya gesek statis?" +
                               "Gaya bisa mengatasi gaya gesek statis bila (F - us*m*g > 0" );
                       tampilan4.setText ( " Bila gaya berhasil mengtasi gaya gesek statis maka benda bergerak" +
                               " dan mengalami gaya gesek kinetik dengan percepatan a = (F - uk*m*g)/m" );
                       tampilan5.setText ( "vt = a t" );
                       tampilan6.setText ( "" );
                       tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan8.setText ( "vt = " + df.format ( vtvt ) + "m/s" );
                  } else
                       tampilan3.setText ( " karena 0 > (FF - usus * mama * gg) / mama" );
                       tampilan4.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );

 } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !s.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" ) &&
               !F.getText ( ).toString ( ).equals ( "" ) &&
              !uk.getText ( ).toString ( ).equals ( "" ) &&
              !vo.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                      ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                      FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                    vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                      gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda bergerak di lantai kasar dengan kecepatan vo " +
                               "ditarik gaya F mendatar" );
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "v = {vo^2 + 2 a S}^0,5; " );
                       tampilan4.setText ( "a = (F - uk m g)/m " );
                                aa = (FF - (ukuk * mama * gg)) / mama;
                              vtvt = (Math.pow ( vovo , 2 ) + (2 * aa * ss));
                              vtvt = Math.pow ( vtvt , 0.5 );

                       tampilan5.setText ( "" );
                       tampilan6.setText ( "a =" + df.format ( aa ) + "m/ss" );
                       tampilan7.setText ( "vt =" + df.format ( vtvt ) + "m/s" );



 } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !s.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
               !F.getText ( ).toString ( ).equals ( "" )&&
              !us.getText ( ).toString ( ).equals ( "" )&&
              !uk.getText ( ).toString ( ).equals ( "" )) {

                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                      usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                        ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                        FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( "  Benda mula-mula DIAM dilantai KASAR ditarik gaya mendatar" );
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "v = {vo^2 + 2 a S}^0,5; vo = 0;   v = {2 a S}^0,5  " );
                       tampilan4.setText ( "a = (F - uk m g)/m " );
                                  aa = (FF - (usus * mama * gg)) / mama;
                  if (aa > 0){
                             aa = (FF - (ukuk * mama * gg)) / mama;
                             vtvt = 2 * aa * ss;
                             vtvt = Math.pow ( vtvt , 0.5 );
                       tampilan5.setText ( "a =" + df.format ( aa ) + "m/ss" );
                       tampilan6.setText ( "v =" + df.format ( vtvt ) + "m/s" );
                   } else if (aa < 0) {
                       tampilan5.setText ( "karena (FF - (usus * mama * gg)) < 0, maka " );
                       tampilan6.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
            }

 } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !t.getText ( ).toString ( ).equals ( "" ) &&
               !F.getText ( ).toString ( ).equals ( "" ) &&
            !teta.getText ( ).toString ( ).equals ( "" )) {

                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      tt = Double.parseDouble (t.getText ( ).toString ( ) );
                      FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                   teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda dilantai LICIN ditarik gaya membentuk sudut teta" );
                       tampilan2.setText ( "" );
                             deg = 0.017444 * teeta;
                             sin = Math.sin ( deg );
                             cos = Math.cos ( deg );
                              aa = FF *  cos / mama;
                            vtvt = aa*tt;
                       tampilan3.setText ( "a = F cos (teta)/m" );
                       tampilan4.setText ( "vt = a t" );
                       tampilan5.setText ( "a =" + df.format ( aa ) + "m/ss" );
                       tampilan6.setText ( "v =" + df.format ( vtvt ) + "m/s" );

 } else  if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !F.getText ( ).toString ( ).equals ( "" ) &&
              !vo.getText ( ).toString ( ).equals ( "" )&&
               !t.getText ( ).toString ( ).equals ( "" )) {

                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                   vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                     tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                       tampilan1.setText ( "benda dilantai licin ditarik mendatar" );
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "vt = vo + a t " );
                       tampilan4.setText ( "a = F/m ;   vt = vo + F t/m" );
                            result = vovo + (FF * tt / mama);
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "v =" + df.format ( result ) + "m/s" );

 } else if ( !t.getText ( ).toString ( ).equals ( "" ) &&
             !F.getText ( ).toString ( ).equals ( "" ) &&
            !ma.getText ( ).toString ( ).equals ( "" ) ) {

                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
              mama = Double.parseDouble ( ma.getText ( ).toString ( ) );

                       tampilan1.setText ( "benda dilantai licin ditarik mendatar" );
                       tampilan2.setText ( "" );
                       result = FF * tt / mama;
                       tampilan3.setText ( "v = F * t/m" );
                       tampilan4.setText ( "v =" + df.format ( result ) + "m/s" );

  } else if ( !s.getText ( ).toString ( ).equals ( "" ) &&
              !F.getText ( ).toString ( ).equals ( "" ) &&
             !ma.getText ( ).toString ( ).equals ( "" )&&
             !vo.getText ( ).toString ( ).equals ( "" )) {

                     ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );

                       tampilan1.setText ( "benda dilantai licin ditarik mendatar" );
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "vt^2 = vo^2 + 2 a St " );
                       tampilan4.setText ( "a = F/m ;   vt = (vo^2 + 2 St F /m)^0,5" );
                       result = Math.pow ( vovo , 2 ) + (2 * ss * FF / mama);
                       result = Math.pow ( result , 0.5 );
                       tampilan5.setText ( "" );
                       tampilan6.setText ( "v =" + df.format ( result ) + "m/s" );

  } else  if (!ma.getText ( ).toString ( ).equals ( "" ) &&
               !F.getText ( ).toString ( ).equals ( "" ) &&
               !s.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                         ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                       tampilan1.setText ( "   benda dilantai licin ditarik mendatar" );
                       tampilan2.setText ( "" );
                       tampilan3.setText ( "vt^2 = vo^2 + 2 a St " );
                       tampilan4.setText ( "a = F/m ; vo = 0;  vt = (2 St F /m)^0,5" );
                           result = (2 * ss * FF / mama);
                           result = Math.pow ( result , 0.5 );
                       tampilan5.setText ( "v =" + df.format ( result ) + "m/s" );

   } else if  ( !t.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" ) &&
             !alfa.getText ( ).toString ( ).equals ( "" )  ) {

                  tt = Double.parseDouble (t.getText ( ).toString ( ) );
                  gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                          tampilan1.setText ( "  benda meluncur dibidang miring dengan sudut alfa" );
                          tampilan2.setText ( "" );
                                  deg = 0.017444 * aalf;
                                  sin = Math.sin ( deg );
                               result = gg * tt * sin;
                          tampilan3.setText ( "v = g * t * sin (alfa)" );
                          tampilan4.setText ( "v =" + df.format ( result ) + "m/s" );

    } else if( !t.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" ) &&
              !ma.getText ( ).toString ( ).equals ( "" ) &&
              !uk.getText ( ).toString ( ).equals ( "" ) &&
              !vo.getText ( ).toString ( ).equals ( "" ) ) {

                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                              mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                              ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                              vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );

                              tampilan1.setText ( " Benda meluncur dilantai kasar karena memiliki momentum " +
                                      "dan kecepatan akan berkurang" );
                              tampilan2.setText ( "Fg = m * g * uk" );
                              tampilan3.setText ( "a =Fg/m = - g uk,    merupakan perlambatan" );
                              tampilan4.setText ( "Vt = Vo - at   " );

                              Fg = mama * gg * ukuk;
                              aa = gg * ukuk;
                              result = vovo - (aa * tt);
                              tampilan6.setText ( "v =" + df.format ( result ) + "m/s" );


  } else if ( !g.getText ( ).toString ( ).equals ( "" ) &&
              !r.getText ( ).toString ( ).equals ( "" ) &&
           !alfa.getText ( ).toString ( ).equals ( "" )) {

                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                     rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                           tampilan1.setText ( " Kecepatan mobil ditikungan miring membentuk sudut " +
                                          "alfa membentuk lingkaran berjari jari r" );
                                       deg = 0.017444 * aalf;
                                       tan = Math.tan ( deg );
                                    result = gg * rr * tan;
                                   result1 = Math.pow ( result , 0.5 );
                           tampilan2.setText ( "" );
                           tampilan3.setText ( "v = (g * r * tan (alfa))^0,5" );
                           tampilan4.setText ( "v =" + df.format ( result1 ) + "m/s" );
                              }

}}   );


btns.setOnClickListener ( new View.OnClickListener ( ) {
           @Override public void onClick ( View view ) {

               DecimalFormat df = new DecimalFormat ( "#.###" );
               if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                    !mb.getText ( ).toString ( ).equals ( "" ) &&
                     !g.getText ( ).toString ( ).equals ( "" )&&
                       !uk.getText ( ).toString ( ).equals ( "" )&&
                       !us.getText ( ).toString ( ).equals ( "" )&&
                  !alfa.getText ( ).toString ( ).equals ( "" )&&
                     !t.getText ( ).toString ( ).equals ( "" )) {

                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                       ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                       aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                       mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                         tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                   tampilan1.setText ( "KEMUNGKINAN PERTAMA, sistem dua benda dihubungkan melalui tali dan katrol");
                   tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring dan terjadi gaya gesek");
                            deg = 0.017444 * aalf;
                            sin = Math.sin ( deg );
                            cos = Math.cos ( deg );
                              A = mama*gg*(sin+ukuk*cos);//gaya penghambat gerak ke kanan
                             A1 = mama*gg*(sin+usus*cos);//gaya penghambat gerak ke kanan (diam)
                              B = mama*gg*sin; //penggerak turun miring
                             C1 = mbmb*gg + gg*(usus*mama*cos);//gaya penghambat gerak ke kiri (diam)
                              C = gg*(mbmb +(ukuk*mama*cos));//gaya penghambat gerak ke kiri
                              D = mama + mbmb;
                              P = mbmb*gg*(sin + ukuk*cos);//gaya penghambat gerak ke kanan
                             P1 = mbmb*gg*(sin + usus*cos);//gaya penghambat gerak ke kanan (diam)
                              Q = gg*mbmb*sin;
                              Z = gg*( mama + (ukuk*mbmb*cos));//gaya penghambat gerak ke kiri
                             Z1 = gg*(mama + (usus*mbmb*cos));//gaya penghambat gerak ke kiri (diam)
                            F11 = gg*mbmb;
                            F12 = mama*gg;
                   if (F11 > A1) {
                       tampilan3.setText ( " " );
                       tampilan4.setText ( " Gaya penggerak naik bidang miring F11 = mb*g =  " + df.format ( F11 ) + "N" );
                       tampilan5.setText ( " Gaya penahan gerak naik bidang miring = ma *g(sin(alfa)+ us cos (alfa)) =  " + df.format ( A1 ) + "N" );

                       tampilan6.setText ( "karena mb*g  > ma *g(sin(alfa)+ us cos (alfa)) maka mb BERGERAK TURUN " );
                       tampilan7.setText ( "a = jumlah F / jumlah m   " );
                       tampilan8.setText ( "a = Wb - (Wa sin(alfa)- Fg)/(ma + mb)" );
                       tampilan9.setText ( "a = (mb - ma*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );

                       aa = (F11 - A)  / D;
                       ss = 0.5*tt*tt*aa;
                       tampilan10.setText ( " St = 0,5 a t^2" );
                       tampilan11.setText ( "" );
                       tampilan12.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan13.setText ( "St = " + df.format ( ss ) + "m" );
                   } else

                       if (B > C1) {
                           tampilan3.setText ( " " );
                           tampilan4.setText ( " Gaya penggerak turun bidang miring F21 = ma*g*sin alfa =  " + df.format ( B ) + "N" );
                           tampilan5.setText ( " Gaya penahan gerak turun bidang miring = mb*g + us*ma*g* cos (alfa)) =  " + df.format ( C1 ) + "N" );

                       tampilan6.setText ( "karena ma*g sin(alfa) >  g (mb + us ma cos(alfa))  maka mb BERGERAK NAIK " );
                       tampilan7.setText ( "a = jumlah F / jumlah m " );
                       tampilan8.setText ( "a = (Wa - Fg - Wb)/(ma + mb)" );
                       tampilan9.setText ( "a = (ma*(sin(alfa) - uk ma cos(alfa) - mb)*g/(ma + mb)" );

                       aa = (B - C)  / D;
                       ss = 0.5*tt*tt*aa;
                       tampilan10.setText ( " St = 0,5 a t^2" );
                       tampilan11.setText ( " " );
                       tampilan12.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan13.setText ( "St = " + df.format ( ss ) + "m" );
                   } else
                    if ( B < C1) {
                        tampilan3.setText ( "" );
                        tampilan4.setText ( "bila akan meluncur NAIK bidang miring:" );
                        tampilan5.setText ( "Gaya penggerak ke atas mb * g  = " + df.format ( F11 ) + "N" );
                        tampilan6.setText ( "Gaya penahan gerak ke atas ma g(sin(alfa)+ us cos (alfa))  = " + df.format ( A1 ) + "N" );
                        tampilan7.setText ( "karena mb g < ma g(sin(alfa)+ us cos (alfa)) maka BENDA BERHENTI " );
                        tampilan8.setText ( "" );
                        tampilan9.setText ( "bila akan meluncur turun bidang miring:" );
                        tampilan10.setText ( "Gaya penggerak ke bawah bidang miring  ma * g * sin alfa = " + df.format ( B ) + "N" );
                        tampilan11.setText ( "Gaya penahan gerak ke bawah mb g + us ma g cos (alfa))  = " + df.format ( C1 ) + "N" );
                        tampilan12.setText ( "karena gaya penggerak meluncur bidang miring < gaya penahan, BENDA BERHENTI" );

                    }
                   tampilan14.setText ( "");
                   tampilan15.setText ( "KEMUNGKINAN KEDUA");

                       // ASUMSI KEDUA
                   tampilan16.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                   tampilan17.setText ( "benda ma tergantung dan benda mb pada bidang miring dan terjadi gaya gesek");
                   tampilan18.setText ( "");
                   deg = 0.017444 * aalf;
                   sin = Math.sin ( deg );
                   cos = Math.cos ( deg );

                   if (F12 > P1) {
                       tampilan19.setText ( "Gaya penggerak naik bidang miring = ma *g  = " + df.format ( F12 ) + "N" );
                       tampilan20.setText ( "Gaya penahan gerak naik bidang miring = mb*g (sin(alfa)+ us cos (alfa) = " + df.format ( P1 ) + "N" );
                       tampilan21.setText ( "karena ma*g > mb*g (sin(alfa)+ us cos (alfa)) maka ma BERGERAK TURUN " );
                       tampilan22.setText ( "a = jumlah F / jumlah m   " );
                       tampilan23.setText ( "a = Wa - (Wb sin(alfa)-Fg)/(ma + mb)" );
                       tampilan24.setText ( "a = (ma - mb*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );

                       aa = (F12 -  P )  / D;

                       ss = 0.5*tt*tt*aa;
                       tampilan25.setText ( " St = 0,5 a t^2" );
                       tampilan26.setText ( " " );
                       tampilan27.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan28.setText ( "St = " + df.format ( ss ) + "m" );
                   } else

                   if (Q > Z1) {
                       tampilan19.setText ( "Gaya penggerak turun bidang miring = mb *g sin alfa = " + df.format ( Q ) + "N" );
                       tampilan20.setText ( "Gaya penahan gerak turun bidang miring = mb*g + ma*g(sin(alfa)+ us cos (alfa) = " + df.format ( Z1 ) + "N" );
                       tampilan21.setText ( "karena  mb sin(alfa) >  (ma + us mb cos (alfa)) maka ma BERGERAK NAIK " );
                       tampilan22.setText ( "a = jumlah F / jumlah m " );
                       tampilan23.setText ( "a = (Wb sin (alfa) - Fg - Wa)/(ma + mb)" );
                       tampilan24.setText ( "a = (mb*(sin(alfa) - uk mb cos(alfa) - ma)*g/(ma + mb)" );

                       aa = (Q - Z)  / D;

                       ss = 0.5*tt*tt*aa;
                       tampilan25.setText ( " St = 0,5 a t^2" );
                       tampilan26.setText ( " " );
                       tampilan27.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan28.setText ( "St = " + df.format ( ss ) + "m" );
                   } else
                   if (Q < Z1){
                       tampilan19.setText ( "Seandainya akan bergerak NAIK BIDANG MIRING" );
                       tampilan20.setText ( "gaya penggerak  ke kanan benda menggantung ma*g = "+df.format ( F12 ) + "N" );
                       tampilan21.setText (  "gaya penahan = mb*g(sin(alfa)+ us cos(alfa))= "+df.format ( P1 ) + "N" );
                       tampilan22.setText  ( "karena gaya penggerak ke kanan tidak lebih dari gaya sesek statik maksimum, BENDA TIDAK BERGERAK" );
                       tampilan23.setText ( "" );
                       tampilan24.setText ( "Seandainya akan bergerak TURUN BIDANG MIRING" );
                       tampilan25.setText ( "gaya penggerak benda ke kiri  mb g sin(alfa)  "+df.format ( Q ) + "N" );
                       tampilan26.setText (  "gaya penahan = ma*g + mb g us cos(alfa))= "+df.format ( Z1 ) + "N" );
                       tampilan27.setText ( "karena  mb g sin(alfa) <  g (ma + us mb cos (alfa))  " );
                       tampilan28.setText ( " maka BENDA TIDAK BERGERAK " );

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
  }} else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !mb.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
             !alfa.getText ( ).toString ( ).equals ( "" )&&
                !t.getText ( ).toString ( ).equals ( "" )) {

                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                   mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "sistem dua benda dihubungkan melalui tali dan katrol" );
                   tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring LICIN" );
                   deg = 0.017444 * aalf;
                   sin = Math.sin ( deg );
                   cos = Math.cos ( deg );
                   A = mama * sin;
                   B = mbmb * sin;
                   D = mama + mbmb;

                   if ( mbmb > A ) {

                       tampilan3.setText ( "karena mb > ma sin(alfa) maka mb BERGERAK TURUN " );
                       tampilan4.setText ( "a = jumlah F / jumlah m   " );
                       tampilan5.setText ( "a = Wb - (Wa sin(alfa)/(ma + mb)" );
                       tampilan6.setText ( "a = (mb - ma*(sin(alfa) )*g/(ma + mb)" );

                       aa = (mbmb - A) * gg / D;

                       ss = 0.5 * tt * tt*aa;
                       tampilan7.setText ( " St = 0,5 a t^2" );
                       tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan10.setText ( "St = " + df.format ( ss ) + "m" );
                   }

                   if ( A > mbmb ) {
                       tampilan3.setText ( "karena ma sin(alfa) >  mb  maka mb BERGERAK NAIK " );
                       tampilan4.setText ( "a = jumlah F / jumlah m " );
                       tampilan5.setText ( "a = (Wa -  Wb)/(ma + mb)" );
                       tampilan6.setText ( "a = (ma*(sin(alfa) -  - mb)*g/(ma + mb)" );

                       aa = (A - mbmb) * gg / D;

                       ss = 0.5 * aa* tt * tt;
                       tampilan7.setText ( " St = 0,5 a t^2" );
                       tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan10.setText ( "St = " + df.format ( ss ) + "m" );
                   }


                   // atas dan bawah ini masih satu input dengan pengandaian berbeda

                   tampilan12.setText ( "sistem dua benda dihubungkan melalui tali dan katrol" );
                   tampilan13.setText ( "benda ma tergantung dan benda mb pada bidang miring LICIN" );
                   deg = 0.017444 * aalf;
                   sin = Math.sin ( deg );
                   cos = Math.cos ( deg );


                   if ( mama > B ) {

                       tampilan14.setText ( "karena ma > mb (sin(alfa) maka ma BERGERAK TURUN " );
                       tampilan15.setText ( "a = jumlah F / jumlah m   " );
                       tampilan16.setText ( "a = Wa - (Wb sin(alfa)/(ma + mb)" );
                       tampilan17.setText ( "a = (ma - mb*(sin(alfa))*g/(ma + mb)" );

                       aa = (mama - B) * gg / D;

                       ss = 0.5 * tt * tt*aa;
                       tampilan18.setText ( " St = 0,5 a t^2" );
                       tampilan19.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan20.setText ( "St = " + df.format ( ss ) + "m" );
                   }

                   if ( B > mama ) {
                       tampilan14.setText ( "karena  mb sin(alfa) >  ma;   maka ma BERGERAK NAIK " );
                       tampilan15.setText ( "a = jumlah F / jumlah m " );
                       tampilan16.setText ( "a = (Wb sin (alfa)  - Wa)/(ma + mb)" );
                       tampilan17.setText ( "a = (mb*(sin(alfa)  - ma)*g/(ma + mb)" );

                       aa = (B - mama) * gg / D;

                       ss = 0.5 * tt * tt*aa;
                       tampilan18.setText ( " St = 0,5 a t^2" );
                       tampilan19.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan20.setText ( "St = " + df.format ( ss ) + "m" );
                   }

//ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ
   } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !t.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
             !alfa.getText ( ).toString ( ).equals ( "" )&&
               !uk.getText ( ).toString ( ).equals ( "" )&&
               !us.getText ( ).toString ( ).equals ( "" )&&
                !F.getText ( ).toString ( ).equals ( "" )) {

                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                       ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                         tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                       aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                         FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarika gaya " +
                           "F sejarar bidang keatas dan terdadap gaya gesek" );
                       deg = 0.017444 * aalf;
                       sin = Math.sin ( deg );
                       cos = Math.cos ( deg );
                        aa = (FF -mama*gg*(sin + usus*cos))/mama;

              if (aa > 0){
                  tampilan2.setText ( "Karena F > mg(sin(alfa) + uscos(alfa))  gaya tarik melebifi " +
                          "gaya gesek maksimum, sehingga benda bergerak dan muncul " +
                          "gaya gesek kinetik sehingga percepatannya dihitung dengan:" );
                  tampilan3.setText ( "a = (F - mg(sin(alfa) + ukcos(alfa))/m;    St = 0,5 at^2" );
                  acc = (FF -mama*gg*(sin + ukuk*cos))/mama;
                  ss = 0.5*acc*tt*tt;
                  tampilan4.setText ( "a = " + df.format (acc) + "m/ss" );
                  tampilan5.setText ( "St = " + df.format (ss) + "m" );
              } else if (aa < 0) {

                       tampilan5.setText ( "karena FF  < mama*gg*(sin + usus*cos)" );
                       tampilan7.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga tidak bergerak" );
                   }

  } else if
                     ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                        !t.getText ( ).toString ( ).equals ( "" ) &&
                        !g.getText ( ).toString ( ).equals ( "" ) &&
                     !alfa.getText ( ).toString ( ).equals ( "" ) &&
                        !F.getText ( ).toString ( ).equals ( "" )) {

                                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                   tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                   FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarika gaya" +
                           " F dan tanpa gaya gesek" );
                           deg = 0.017444 * aalf;
                           sin = Math.sin ( deg );
                           cos = Math.cos ( deg );
                            aa = (FF - mama*gg*sin)/mama;
                            ss = 0.5*aa*tt*tt;
                   tampilan2.setText ( "a = ((F - mgsin(alfa)/m;   St = 0,5 at^2" );
                   tampilan3.setText ( "St = " + df.format (ss) + "m" );



   } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !mb.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
               !us.getText ( ).toString ( ).equals ( "" )&&
                !t.getText ( ).toString ( ).equals ( "" )&&
               !uk.getText ( ).toString ( ).equals ( "" )) {
                                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                       ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                                       usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                                       mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                       tt = Double.parseDouble ( t.getText ( ).toString ( ) );


                   tampilan1.setText ( "KASUS PERTAMA" );
                   tampilan2.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                           " benda ma DI MEJA KASAR dan mb tergantung," );
                   aa = (mbmb -(mama * usus) )* gg / (mama + mbmb);
                   if (aa > 0) {
                       tampilan3.setText ( "karena (mbmb > (mama * usus) )* gg  " );
                       tampilan4.setText ( "berarti gaya penggerak lebih besar daripada gaya gesek statik  " );
                       tampilan5.setText ( "setelah bergerak terjadi gaya gesek kinetis, percepatannya:  " );
                       aa = (mbmb -(mama * ukuk) )* gg / (mama + mbmb);

                       ss = 0.5 * aa * tt * tt;
                       tampilan6.setText ( "a = (mb - uk*ma)*g/(ma + mb);    St = 0,5 at^2" );
                       tampilan7.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan8.setText ( "St = " + df.format ( ss ) + "m" );

                   } else if (aa < 0) {
                       tampilan3.setText ( "karena (mb < (ma * us) )* g  " );
                       tampilan4.setText ( " Benda BERHENTI, sebab gaya tidak cukup mengatasi gaya gesek" );
                   }

                   tampilan11.setText ( "KASUS PKEDUA" );
                   tampilan12.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                           " benda mb dimeja kasar dan ma tergantung," );
                   aa = (mama-(mbmb * usus) )* gg / (mama + mbmb);
                if (aa > 0){
                    tampilan13.setText ( "karena (ma > (mb * us) )* g  " );
                    tampilan14.setText ( "berarti gaya penggerak lebih besar daripada gaya gesek statik  " );
                    tampilan15.setText ( "setelah bergerak terjadi gaya gesek kinetis, percepatannya:  " );

                    acc = (mama-(mbmb * ukuk) )* gg / (mama + mbmb);

                           ss = 0.5 * acc * tt * tt;
                           tampilan16.setText ( "a = (ma - uk*mb)*g/(ma + mb);   St = 0,5 at^2" );
                           tampilan17.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan18.setText ( "St = " + df.format ( ss ) + "m" );
                       } else if (aa < 0) {
                           tampilan13.setText ( " karena  (mama < (mbmb * usus) )* gg" );
                           tampilan14.setText ( " Benda BERHENTI, sebab gaya berat tidak cukup mengatasi gaya gesek" );

                       }

   } else if
              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !mb.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" )&&
                 !t.getText ( ).toString ( ).equals ( "" )) {
                                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                   tt = Double.parseDouble (t .getText ( ).toString ( ) );
                                 mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );



                   tampilan1.setText ( "KASUS PERTAMA" );
                   tampilan2.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol, " +
                           "benda ma di meja LICIN dan mb tergantung" );
                   tampilan3.setText ( " Gaya penggerak adalah berat benda yang tergantung" );
                        aa = mbmb * gg / (mama + mbmb);
                        ss = 0.5*aa*tt*tt;
                   tampilan4.setText ( "a = mb*g/(ma + mb);   St = 0,5 at^2" );
                   tampilan6.setText ( "a = " + df.format (aa) + "m/ss" );
                   tampilan7.setText ( "St = " + df.format (ss) + "m" );



                   tampilan9.setText ( "KASUS KEDUA" );
                   tampilan10.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                           "benda mb di meja LICIN dan ma tergantung" );
                         aa= mama * gg / (mama + mbmb);
                        ss = 0.5*aa*tt*tt;
                   tampilan11.setText ( "a = ma*g/(ma + mb);   St = 0,5 at^2" );
                   tampilan13.setText ( "a = " + df.format (aa) + "m/ss" );
                   tampilan14.setText ( "St = " + df.format (ss) + "m" );


                   if (mbmb < mama) {
                       tampilan15.setText ( "KASUS KETIGA" );

                       tampilan16.setText ( "  Benda benda A dan benda B tergantung melalui katrol" );
                       tampilan17.setText ( "(mbmb < mama)" );
                       tampilan18.setText ( "Gaya penggerak adalah selisih berat dua benda" );
                       aa = (mama-mbmb) * gg / (mama + mbmb);
                       ss = 0.5 * aa * tt * tt;
                       tampilan19.setText ( "   a = (ma - mb) * g / (ma + mb)" );
                       tampilan20.setText ( "s =  0,5 a * t^2 = 0,5 *ma*g*t^2/(ma + mb)" );

                       tampilan22.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan23.setText ( "St = " + df.format ( ss ) + "m" );
                   }
                       if (mbmb > mama) {
                           tampilan15.setText ( "KASUS KETIGA" );
                           tampilan16.setText ( " dua benda tergantung melalui katrol" );
                           tampilan17.setText ( "(mbmb > mama)" );
                           tampilan18.setText ( "Gaya penggerak adalah selisih berat dua benda" );
                           aa = (mbmb-mama) * gg / (mama + mbmb);
                           ss = 0.5 * aa * tt * tt;
                           tampilan19.setText ( "   a = (mb - ma) * g / (ma + mb)" );

                           tampilan20.setText ( "s = 0,5 * a * t^2 = 0,5 *mb*g*t^2/(ma + mb)" );
                           tampilan22.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan23.setText ( "St = " + df.format ( ss ) + "m" );

                       }




     } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                  !t.getText ( ).toString ( ).equals ( "" )&&
                  !F.getText ( ).toString ( ).equals ( "" )&&
                 !us.getText ( ).toString ( ).equals ( "" )&&
               !alfa.getText ( ).toString ( ).equals ( "" )&&
                 !uk.getText ( ).toString ( ).equals ( "" )) {
                                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                     ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                                     usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                     tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                     aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "  Benda berada pada bidang miring membentuk sudut alfa ditarik " +
                           "gaya F sejajar bidang keatas dan tergadap gaya gesek" );
                   tampilan2.setText ( "  Gaya mendapat perlawanan dari gaya gesek dan gaya luncur akibat berat" );
                   tampilan3.setText ( " Cek dulu apakah gaya tarik lebih besar dari gaya gesek statik maksimun ditamabha gaya luncur?" );
                   tampilan4.setText ( " Jika ya maka benda bergerak dan gaya akan dilawan gaya gesek kinetik dan gaya luncur " );
                   tampilan5.setText ( " a = (F - mg(sin(alfa) + uk*cos(alfa))/m" );
                          deg = 0.017444 * aalf;
                          sin = Math.sin ( deg );
                          cos = Math.cos ( deg );
                           aa = (FF - mama*gg*(sin + usus*cos))/mama;
             if (aa > 0) {
                           acc = (FF - mama*gg*(sin + ukuk*cos))/mama;
                           ss = 0.5 * acc * tt * tt;
                    tampilan6.setText ( "s = 0,5 * t^2 * (F - mg(sin(alfa) + ukcos(alfa))/m" );
                    tampilan8.setText ( "a = " + df.format ( acc ) + "m/ss" );
                    tampilan9.setText ( "St = " + df.format ( ss ) + "m" );
           } else if (aa < 0){
                    tampilan6.setText ( " karena FF <  mama*gg*(sin + usus*cos)" );
                    tampilan7.setText ( " Benda BERHENTI, sebab gaya  tidak cukup mengatasi gaya gesek" );
                   }


  } else if
           ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !F.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
             !t.getText ( ).toString ( ).equals ( "" )&&
           !alfa.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                           tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( " Benda berada pada bidang miring membentuk sudut alfa ditarika gaya F ke atas dan tanpa gaya gesek" );
                   tampilan2.setText ( " Gaya akan dilawan gaya luncur mgsin(alfa)" );
                   tampilan3.setText ( " a = (F - mgsin(alfa))/m" );
                          deg = 0.017444 * aalf;
                          sin = Math.sin ( deg );
                          cos = Math.cos ( deg );
                           aa = (FF - mama*gg*sin)/mama;
                           ss = 0.5*aa*tt*tt;
                   tampilan4.setText ( "s = 0,5 * t^2 * ((F- mgsin(alfa)/m" );
                   tampilan6.setText ( "a = " + df.format (aa) + "m/ss" );
                   tampilan7.setText ( "St = " + df.format (ss) + "m" );


 } else if
         ( !ma.getText ( ).toString ( ).equals ( "" ) &&
            !t.getText ( ).toString ( ).equals ( "" ) &&
            !g.getText ( ).toString ( ).equals ( "" )&&
            !F.getText ( ).toString ( ).equals ( "" )&&
            !us.getText ( ).toString ( ).equals ( "" )&&
         !teta.getText ( ).toString ( ).equals ( "" )&&
           !uk.getText ( ).toString ( ).equals ( "" )) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                          FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                           tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( " benda di lantai KASAR ditarik gaya membentuk sudut teta" );
                        deg = 0.017444 * teeta;
                        cos = Math.cos ( deg );
                        sin = Math.sin(deg);
                         aa = (FF * cos - usus * (gg * mama - FF * sin)) / mama;
              if (aa > 0) {

                  tampilan2.setText ( " karena FF * cos > usus * (gg * mama - FF * sin)" );
                  tampilan3.setText ( " benda bergerak dan muncul gaya gesek kinetik, percepatannya:" );
                  tampilan4.setText ( " a = (F * cos - uk * (g * ma - F * sin)) / ma" );
                  acc = (FF * cos - ukuk * (gg * mama - FF * sin)) / mama;
                  ss = 0.5 * acc * tt * tt;
                   tampilan5.setText ( "s = 0,5 * t^2 * (F cos(teta) -  uk(m g - Fsin(teta))/m" );
                   tampilan6.setText ( "a = " + df.format ( acc ) + "m/ss" );
                   tampilan7.setText ( "St = " + df.format ( ss ) + "m" );
               } else if (aa < 0){
                   tampilan3.setText ( " karena  FF * cos < usus * (gg * mama - FF * sin)" );
                   tampilan5.setText ( " Benda BERHENTI, sebab gaya  tidak cukup mengatasi gaya gesek statik" );

                   }
  } else if
       ( !ma.getText ( ).toString ( ).equals ( "" ) &&
         !vo.getText ( ).toString ( ).equals ( "" ) &&
          !F.getText ( ).toString ( ).equals ( "" )) {
                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                   FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                       tampilan1.setText ( " kendaraan dengan kecepatan vo, direm dengan gaya F  hingga berhenti" );
                       tampilan2.setText ( " a = F/m;   vt^2 = vo^2 + 2 a St" );
                       tampilan3.setText ( " vt = 0;    St = vo^2/2a" );
                              aa = FF/mama;
                              ss = vovo*vovo/(2*aa);

                       tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                       tampilan5.setText ( "St = " + df.format (ss) + "m" );

 } else if
             ( !vo.getText ( ).toString ( ).equals ( "" ) &&
               !vt.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
               !uk.getText ( ).toString ( ).equals ( "" )) {
                                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                                vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda meluncur di lantai kasar  mula-mula kecepatan Vo setelah menenmpuh jarak St kecepatan menjadi Vt" );
                       tampilan2.setText ( " a = Fgesek/m;  a = uk mg/m = uk g;    vt^2 = vo^2 + 2 a St" );
                       tampilan3.setText ( " St = (vt^2 - vo^2)/2a" );
                              aa =-ukuk*gg;
                              ss =(vtvt*vtvt - vovo*vovo)/(2*aa);
                       tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                       tampilan5.setText ( "St = " + df.format (ss) + "m" );
                       tampilan7.setText ( " cara kedua dengan Usaha-Energi" );
                       tampilan8.setText ( " W = F St = perubahan Ek  " );
                       tampilan9.setText ( " (0,5 m vo^2 - 0,5 m Vt^2) = uk m g St;   St = 0,5 v^2/ (uk g)" );
                       tampilan10.setText ( " St = 0,5 ( vo^2 - vt^2)/ (uk g)" );
                             ss = (vovo*vovo - vtvt*vtvt)/(2*ukuk*gg);
                       tampilan11.setText ( "St = " + df.format (ss) + "m" );

   } else if
               ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                 !uk.getText ( ).toString ( ).equals ( "" )) {
                          vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                          ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda meluncur di lantai kasar  hingga berhenti" );
                       tampilan2.setText ( " a = Fgesek/m;  a = uk mg/m = uk g;    vt^2 = vo^2 + 2 a St" );
                       tampilan3.setText ( " vt = 0;    St = vo^2/2a" );
                            aa =-ukuk*gg;
                            ss =-vovo*vovo/(2*aa);
                       tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                       tampilan5.setText ( "St = " + df.format (ss) + "m" );
                       tampilan7.setText ( " cara kedua dengan Usaha-Enegi" );
                       tampilan8.setText ( " W = F St = Ek  " );
                       tampilan9.setText ( " 0,5 m v^2 = uk m g St;   St = 0,5 v^2/ (uk g)" );
                       ss = vovo*vovo/(2*ukuk*gg);
                       tampilan11.setText ( "St = " + df.format (ss) + "m" );


} else if ( !ma.getText ( ).toString ( ).equals ( "" )&&
             !t.getText ( ).toString ( ).equals ( "" )&&
             !g.getText ( ).toString ( ).equals ( "" )&&
          !teta.getText ( ).toString ( ).equals ( "" )&&
             !F.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                              tt = Double.parseDouble (t.getText ( ).toString ( ) );
                              FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                           teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "  benda di lantai LICIN ditarik gaya membentuk sudut teta" );
                        deg = 0.017444 * teeta;
                        cos = Math.cos ( deg );
                         aa = FF * cos  / mama;
                         ss = 0.5*aa*tt*tt;
                   tampilan2.setText ( "s = 0,5 * t^2 * ((F cos(teta) -  uk(m g - Fsin(teta))/m" );
                   tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                   tampilan5.setText ( "St = " + df.format (ss) + "m" );



        } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !t.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
                !N.getText ( ).toString ( ).equals ( "" )) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

     if(  NN > (mama * gg)) {

         tampilan1.setText ( " benda di lift dipercepat ke atas" );
         aa = (NN - mama * gg) / mama;
         ss = 0.5 * aa * tt * tt;
         tampilan2.setText ( "s = 0,5* t^2 *(N - mg)/m" );
         tampilan4.setText ( "a = " + df.format ( aa ) + "m/ss" );
         tampilan5.setText ( "St = " + df.format ( ss ) + "m" );

     }  if(  NN < (mama * gg)){

                       tampilan1.setText ( "benda di lift dipercepat ke bawah" );
                              aa = (mama * gg - NN) / mama;
                              ss = 0.5*aa*tt*tt;
                       tampilan2.setText ( "s = 0,5 * t^2 * (mg - N)/m" );
                       tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                       tampilan5.setText ( "St = " + df.format (ss) + "m" );

  }} else
         if ( !ma.getText ( ).toString ( ).equals ( "" )&&
               !F.getText ( ).toString ( ).equals ( "" )&&
               !g.getText ( ).toString ( ).equals ( "" )&&
                 !t.getText ( ).toString ( ).equals ( "" )&&
              !us.getText ( ).toString ( ).equals ( "" )&&
              !uk.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                           tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                         usus = Double.parseDouble ( us.getText ( ).toString ( ) );

                       tampilan1.setText ( "benda dilatai Kasar ditarik gaya mendatar" );
                           aa = (FF - usus * mama * gg) / mama;
                         if (aa > 0) {
                             acc = (FF - ukuk * mama * gg) / mama;
                             ss = 0.5 * acc * tt * tt;
                             tampilan2.setText ( "a = ( F - uk*m*g)/m" );
                             tampilan3.setText ( "s =  0,5 a* t^2 = 0,5 * t^2 * (F - uk*m*g)/m" );
                             tampilan4.setText ( "a = " + df.format ( aa ) + "m/ss" );
                             tampilan5.setText ( "St = " + df.format ( ss ) + "m" );
                         } else if (aa < 0) {
                             tampilan2.setText ( " karena F <  us * mama * gg" );
                             tampilan3.setText ( "gaya tidak bisa mengatasi gaya gesek statik sehingga tetap diam" );


                         }
  } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !t.getText ( ).toString ( ).equals ( "" ) &&
               !F.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                           FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                       tampilan1.setText ( " benda dilatai LICIN ditarik gaya mendatar" );
                                aa = FF / mama;
                                ss = 0.5*aa*tt*tt;
                       tampilan2.setText ( "s = 0,5 * t^2 *F /m" );
                       tampilan4.setText ( "a = " + df.format (aa) + "m/ss" );
                       tampilan5.setText ( "St = " + df.format (ss) + "m" );

 } else if  ( !t.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
           !alfa.getText ( ).toString ( ).equals ( "" )) {
                     tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );

             tampilan1.setText ( "  benda meluncur dibidang miring" );
                     deg = 0.017444 * aalf;
                     sin = Math.sin ( deg );
                      aa = gg * sin;
                      ss = 0.5 * aa * tt * tt;
             tampilan2.setText ( "s =0,5 t^2 * g * sin (alfa)" );
             tampilan4.setText ( "a = " + df.format ( aa ) + "m/ss" );
             tampilan5.setText ( "St = " + df.format ( ss ) + "m" );
         }}   }
        );

btnt.setOnClickListener ( new View.OnClickListener ( ) {
           @Override
           public void onClick ( final View view ) {
           DecimalFormat df = new DecimalFormat ( "#.###" );
           if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !mb.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" )&&
                 !s.getText ( ).toString ( ).equals ( "" )&&
              !alfa.getText ( ).toString ( ).equals ( "" )&&
                !uk.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                       ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                       mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                         ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                   tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring dan terjadi gaya gesek");
                        deg = 0.017444 * aalf;
                        sin = Math.sin ( deg );
                        cos = Math.cos ( deg );
                          A = mama*(sin+ukuk*cos);//
                          B = mama*sin; //penggerak turun miring
                          C = mbmb +(ukuk*mama*cos);
                          D = mama + mbmb;
                          P = mbmb*(sin + ukuk*cos);
                          Q = mbmb*sin;
                   Z = mama + (ukuk*mbmb*cos);

                   if (mbmb > A) {

                       tampilan3.setText ( "karena mb > ma (sin(alfa)+ uk cos (alfa)) maka mb BERGERAK TURUN " );
                       tampilan4.setText ( "a = jumlah F / jumlah m   " );
                       tampilan5.setText ( "a = Wb - (Wa sin(alfa)-Fg)/(ma + mb)" );
                       tampilan6.setText ( "a = (mb - ma*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );

                       aa = (mbmb - A) * gg / D;
                       tt = 2*ss/aa;
                       tt = Math.pow(tt,0.5);
                       tampilan7.setText ( " t = (2 St/a)^0,5" );
                       tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan9.setText ( "t = " + df.format ( tt ) + "s" );

                   } else

                   if (mbmb > B)    {
                       tampilan4.setText ( "gaya penggerak tidak lebih dari gaya sesek, benda tidak bergerak" );
                   }

                   if (B > C) {
                       tampilan3.setText ( "karena ma sin(alfa) >  (mb + uk ma cos(alfa))  maka mb BERGERAK NAIK " );
                       tampilan4.setText ( "a = jumlah F / jumlah m " );
                       tampilan5.setText ( "a = (Wa - Fg - Wb)/(ma + mb)" );
                       tampilan6.setText ( "a = (ma*(sin(alfa) - uk ma cos(alfa) - mb)*g/(ma + mb)" );

                       aa = (B - C) * gg / D;
                       tt = 2*ss/aa;
                       tt = Math.pow(tt,0.5);
                       tampilan7.setText ( " t = (2 St/a)^0,5" );
                       tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan10.setText ( "t = " + df.format ( tt ) + "s" );
                   } else
                   if (B > mbmb) {
                       tampilan4.setText  ( "gaya penggerak tidak lebih dari gaya sesek , benda tidak bergerak" );
                   }

// ASUMSI KE DUA**********************************************************************************************************
                   tampilan10.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                   tampilan11.setText ( "benda ma tergantung dan benda mb pada bidang miring dan terjadi gaya gesek");
                   deg = 0.017444 * aalf;
                   sin = Math.sin ( deg );
                   cos = Math.cos ( deg );

                   if (mama > P) {

                       tampilan12.setText ( "karena ma > mb (sin(alfa)+ uk cos (alfa)) maka ma BERGERAK TURUN " );
                       tampilan13.setText ( "a = jumlah F / jumlah m   " );
                       tampilan14.setText ( "a = Wa - (Wb sin(alfa)-Fg)/(ma + mb)" );
                       tampilan15.setText ( "a = (ma - mb*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );

                       aa = (mama -  P ) * gg / D;

                       tt = 2*ss/aa;
                       tt = Math.pow(tt,0.5);
                       tampilan16.setText ( " t = (2 St/a)^0,5" );
                       tampilan17.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan19.setText ( "t = " + df.format ( tt ) + "s" );
                   } else
                   if (mama > Q){

                       tampilan13.setText  ( "gaya penggerak tidak lebih dari gaya sesek , benda tidak bergerak" );
                   }

                   if (Q > Z) {
                       tampilan12.setText ( "karena  mb sin(alfa) >  (ma + uk mb cos (alfa)) maka ma BERGERAK NAIK " );
                       tampilan13.setText ( "a = jumlah F / jumlah m " );
                       tampilan14.setText ( "a = (Wb sin (alfa) - Fg - Wa)/(ma + mb)" );
                       tampilan15.setText ( "a = (mb*(sin(alfa) - uk mb cos(alfa) - ma)*g/(ma + mb)" );

                       aa = (Q - Z) * gg / D;

                       tt = 2*ss/aa;
                       tt = Math.pow(tt,0.5);
                       tampilan16.setText ( " t = (2 St/a)^0,5" );
                       tampilan17.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan19.setText ( "t = " + df.format ( tt ) + "s" );
                   } else
                   if (Q > mama){
                       tampilan17.setText  ( "gaya penggerak tidak lebih dari gaya sesek, benda tidak bergerak" );

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
   }} else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !mb.getText ( ).toString ( ).equals ( "" ) &&
               !s.getText ( ).toString ( ).equals ( "" ) &&
              !alfa.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" )) {
                           mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                           mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                             gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                             ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                       tampilan1.setText ( " Sistem dua benda dihubungkan melalui tali dan katrol");
                       tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring LICIN");
                            deg = 0.017444 * aalf;
                            sin = Math.sin ( deg );
                            cos = Math.cos ( deg );
                              A = mama*sin;
                              B = mbmb*sin;
                              D = mama + mbmb;

                       if (mbmb > A) {

                           tampilan3.setText ( "karena mb > ma sin(alfa) maka mb BERGERAK TURUN " );
                           tampilan4.setText ( "a = jumlah F / jumlah m   " );
                           tampilan5.setText ( "a = Wb - (Wa sin(alfa)/(ma + mb)" );
                           tampilan6.setText ( "a = (mb - ma*(sin(alfa) )*g/(ma + mb)" );

                                aa = (mbmb - A) * gg / D;
                                tt = 2*ss/aa;
                                tt = Math.pow(tt,0.5);
                           tampilan7.setText ( " t = (2 St/a)^0,5" );
                           tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan9.setText ( "t = " + df.format ( tt ) + "s" );
                       }

                       if (A > mbmb) {
                           tampilan3.setText ( "karena ma sin(alfa) >  mb  maka mb BERGERAK NAIK " );
                           tampilan4.setText ( "a = jumlah F / jumlah m " );
                           tampilan5.setText ( "a = (Wa -  Wb)/(ma + mb)" );
                           tampilan6.setText ( "a = (ma*(sin(alfa) -  - mb)*g/(ma + mb)" );

                                aa = (A - mbmb) * gg / D;
                                tt = 2*ss/aa;
                                tt = Math.pow(tt,0.5);
                           tampilan7.setText ( " t = (2 St/a)^0,5" );
                           tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan10.setText ( "t = " + df.format ( tt ) + "s" );
                       }

                       // atas dan bawah ini masih satu input dengan pengandaian berbeda
                       tampilan12.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                       tampilan13.setText ( "benda ma tergantung dan benda mb pada bidang miring LICIN");
                             deg = 0.017444 * aalf;
                             sin = Math.sin ( deg );
                             cos = Math.cos ( deg );

                       if (mama > B) {

                           tampilan14.setText ( "karena ma > mb (sin(alfa) maka ma BERGERAK TURUN " );
                           tampilan15.setText ( "a = jumlah F / jumlah m   " );
                           tampilan16.setText ( "a = Wa - (Wb sin(alfa)/(ma + mb)" );
                           tampilan17.setText ( "a = (ma - mb*(sin(alfa))*g/(ma + mb)" );

                                aa = (mama -  B ) * gg / D;
                                tt = 2*ss/aa;
                                tt = Math.pow(tt,0.5);
                           tampilan18.setText ( " t = (2 St/a)^0,5" );
                           tampilan19.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan20.setText ( "t = " + df.format ( tt ) + "s" );
                       }

                       if (B > mama) {
                           tampilan14.setText ( "karena  mb sin(alfa) >  ma;   maka ma BERGERAK NAIK " );
                           tampilan15.setText ( "a = jumlah F / jumlah m " );
                           tampilan16.setText ( "a = (Wb sin (alfa)  - Wa)/(ma + mb)" );
                           tampilan17.setText ( "a = (mb*(sin(alfa)  - ma)*g/(ma + mb)" );

                              aa = (B - mama) * gg / D;
                              tt = 2*ss/aa;
                              tt = Math.pow(tt,0.5);
                           tampilan18.setText ( " t = (2 St/a)^0,5" );
                           tampilan19.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan20.setText ( "t = " + df.format ( tt ) + "s" );
                       }

//ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ

   } else if ( !ma.getText ( ).toString ( ).equals ( "" )&&
                !F.getText ( ).toString ( ).equals ( "" )&&
                !g.getText ( ).toString ( ).equals ( "" )&&
             !alfa.getText ( ).toString ( ).equals ( "" )&&
               !uk.getText ( ).toString ( ).equals ( "" )&&
                !s.getText ( ).toString ( ).equals ( "" )) {
                               mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                               ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                                 ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                               aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                 FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                 gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                       tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarika gaya " +
                               "F sejarar bidang keatas dan terdadap gaya gesek" );
                              deg = 0.017444 * aalf;
                              sin = Math.sin ( deg );
                              cos = Math.cos ( deg );
                               aa = (FF - mama * gg * (sin + ukuk * cos)) / mama;
                               tt = 2 * ss / aa;
                               tt = Math.pow ( tt , 0.5 );
                       tampilan2.setText ( "a = (F - mg(sin(alfa) + ukcos(alfa))/m; " );
                       tampilan3.setText ( " t = (2 St/a)^0,5" );
                 if ( aa > 0 ) {
                       tampilan5.setText ( "a = " + df.format ( aa ) + "m/ss" );
                       tampilan6.setText ( "t = " + df.format ( tt ) + "s" );
                  } else if (aa < 0){
                           tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga benda tidak bergerak" );
                       }

 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !s.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
           !alfa.getText ( ).toString ( ).equals ( "" )&&
              !F.getText ( ).toString ( ).equals ( "" )) {
                  mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                  aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                           tampilan1.setText ( " benda berada pada bidang miring membentuk sudut alfa ditarika gaya" +
                                   " F dan tanpa gaya gesek" );
                               deg = 0.017444 * aalf;
                               sin = Math.sin ( deg );
                               cos = Math.cos ( deg );
                                aa = (FF - mama * gg * sin) / mama;
                                tt = 2 * ss / aa;
                                tt = Math.pow ( tt , 0.5 );
                           tampilan2.setText ( "a = ((F- mgsin(alfa)/m; t = (2 S/a)^0,5" );
                           tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );


  } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !mb.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
              !uk.getText ( ).toString ( ).equals ( "" )&&
               !s.getText ( ).toString ( ).equals ( "" )) {
                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                     mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );

        if ( mbmb < mama) {

            tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                    "benda ma dan mb tergantung, ma > mb" );
            aa = (mama - mbmb) * gg / (mama + mbmb);
            tt = 2 * ss / aa;
            tt = Math.pow ( tt , 0.5 );
            tampilan2.setText ( "a = (ma-mb)*g/(ma + mb); t = (2 S/a)^0,5" );
            tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
            tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
        } else if ( mbmb > mama) {

            tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                    " benda ma dan mb tergantung, ma < mb" );
            aa = (mbmb - mama) * gg / (mama + mbmb);
            tt = 2 * ss / aa;
            tt = Math.pow ( tt , 0.5 );
            tampilan2.setText ( "a = (mb-ma)*g/(ma + mb); t = (2 S/a)^0,5" );
            tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
            tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
        }

 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !mb.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
             !us.getText ( ).toString ( ).equals ( "" )&&
             !uk.getText ( ).toString ( ).equals ( "" )&&
              !s.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                         usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                         mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                           ss = Double.parseDouble ( s.getText ( ).toString ( ) );


                           tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                                   " benda ma dimeja kasar dan mb tergantung," );
                               aa = (mbmb - (mama * usus)) * gg / (mama + mbmb);
                           if ( aa > 0 ) {
                               aa = (mbmb - (mama * ukuk)) * gg / (mama + mbmb);
                               tt = 2 * ss / aa;
                               tt = Math.pow ( tt , 0.5 );
                           tampilan2.setText ( "a = (mb - uk*ma)*g/(ma + mb); t = (2 S/a)^0,5" );
                           tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
                           } else if ( aa < 0 ) {
                               tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga benda tidak bergerak" );
                           }
                           tampilan6.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                                   " benda mb dimeja kasar dan ma tergantung," );
                               aa = (mama - (mbmb * usus)) * gg / (mama + mbmb);
                            if ( aa > 0 ) {
                               aa = (mama - (mbmb * ukuk)) * gg / (mama + mbmb);
                               tt = 2 * ss / aa;
                               tt = Math.pow ( tt , 0.5 );
                           tampilan7.setText ( "a = (mb - uk*ma)*g/(ma + mb); t = (2 S/a)^0,5" );
                           tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan10.setText ( "t = " + df.format ( tt ) + "s" );
                           } else if ( aa < 0 ) {
                               tampilan9.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga benda tidak bergerak" );
                           }

     } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !mb.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                  !s.getText ( ).toString ( ).equals ( "" )) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                           tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                                   "benda ma di meja licin dan mb tergantung" );
                           aa = mbmb * gg / (mama + mbmb);
                           tt = 2 * ss / aa;
                           tt = Math.pow ( tt , 0.5 );
                           tampilan2.setText ( "a = mb*g/(ma + mb) ; t = (2 S/a)^0,5" );
                           tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );

                           tampilan6.setText ( " sistem dua benda dihubungkan melalui tali dan katrol, " +
                                   "benda mb di meja licin dan ma tergantung" );
                           aa = mama * gg / (mama + mbmb);
                           tt = 2 * ss / aa;
                           tt = Math.pow ( tt , 0.5 );
                           tampilan7.setText ( "a = ma*g/(ma + mb);   t = (2 S/a)^0,5" );
                           tampilan9.setText ( "t = " + df.format ( tt ) + "s" );


  } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )&&
                !N.getText ( ).toString ( ).equals ( "" )&&
                !s.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                         ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

             if (NN > (mama * gg)){
                           tampilan1.setText ( " benda atau orang di lift yang bergerak dipercepat ke atas" );
                                acc = (NN - mama * gg) / mama;
                                  p = 2 * ss / acc;
                                 tt = Math.pow ( p , 0.5 );
                           tampilan2.setText ( "t = (2s/a); a = (N - mg)/m" );
                           tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );

             if (NN < (mama * gg)) {

                 tampilan1.setText ( "  benda atau orang di lift yang bergerak dipercepat ke bawah" );
                 acc = (mama * gg - NN) / mama;
                 p = 2 * ss / acc;
                 tt = Math.pow ( p , 0.5 );
                 tampilan2.setText ( "t = (2s/a)^0,5; a = (mg - N)/m" );
                 tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                 tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
             }}

     } else if  ( !ma.getText ( ).toString ( ).equals ( "" )&&
                   !s.getText ( ).toString ( ).equals ( "" )&&
                   !g.getText ( ).toString ( ).equals ( "" )&&
                   !F.getText ( ).toString ( ).equals ( "" )&&
                  !us.getText ( ).toString ( ).equals ( "" )&&
                  !uk.getText ( ).toString ( ).equals ( "" )) {
                           mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                           usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                             ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                             FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                             gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                           tampilan1.setText ( " benda ditempat datar ditarik dengan gaya dan terjadi gaya gesek" );
                                acc = (FF - usus * mama * gg) / mama;
            if( acc > 0){
                                acc = (FF - ukuk * mama * gg) / mama;

                                  p = 2 * ss / acc;
                                 tt = Math.pow ( p , 0.5 );
                           tampilan2.setText ( "t = (2s/a)^0,5; a = (F- uk*m*g)/m" );
                           tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
              } else if ( acc < 0 ) {
                               tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga benda tidak bergerak" );
                           }

 } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !vo.getText ( ).toString ( ).equals ( "" ) &&
              !F.getText ( ).toString ( ).equals ( "" )) {
                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                           tampilan1.setText ( " kendaraan dengan kecepatan vo, direm dengan gaya F  hingga berhenti" );
                           tampilan2.setText ( " a = F/m;   vt^2 = vo^2 + 2 a St" );
                           tampilan3.setText ( " vt = 0;    St = vo^2/2a" );
                                aa = FF / mama;
                                ss = vovo * vovo / (2 * aa);
                                tt = 2 * ss / aa;
                                tt = Math.pow ( tt , 0.5 );
                           tampilan4.setText ( "  t = (2 S/a)^0,5" );
                           tampilan6.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan7.setText ( "St = " + df.format ( ss ) + "m" );
                           tampilan8.setText ( "t = " + df.format ( tt ) + "s" );

     } else if ( !vo.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                 !uk.getText ( ).toString ( ).equals ( "" )) {
                         vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                         ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                           tampilan1.setText ( " benda meluncur di lantai kasar  hingga berhenti" );
                           tampilan2.setText ( " a = Fgesek/m;  a = uk mg/m = uk g; " );
                           tampilan3.setText ( " vt = a t;    t = v/a" );
                                aa = -ukuk * gg;
                                tt = -vovo / aa;
                           tampilan4.setText ( "a = " + df.format ( aa ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );


     } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !g.getText ( ).toString ( ).equals ( "" )&&
                 !us.getText ( ).toString ( ).equals ( "" )&&
                 !uk.getText ( ).toString ( ).equals ( "" )&&
               !teta.getText ( ).toString ( ).equals ( "" )&&
                  !F.getText ( ).toString ( ).equals ( "" )&&
                  !s.getText ( ).toString ( ).equals ( "" )) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                        teeta = Double.parseDouble (teta.getText ( ).toString ( ));
                          gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                          FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                   tampilan1.setText ( " benda ditempat datar kasar ditarik gaya membentuk sudut teta" );
                                 deg = 0.017444 * teeta;
                                 cos = Math.cos ( deg );
                                 sin = Math.sin (deg);
                                 acc = FF*cos - usus*(mama*gg - FF*sin);
                     if (acc > 0){
                                acc = (FF*cos - ukuk*(mama*gg - FF*sin))/mama ;
                                  p = 2 * ss / acc;
                                 tt = Math.pow ( p , 0.5 );
                           tampilan2.setText ( "t = (2s/a)^0,5; a = F cos (teta)/m" );
                           tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
                           } else if ( acc < 0 ) {
                               tampilan5.setText ( "gaya tidak cukup mengatasi gaya gesek sehingga benda tidak bergerak" );
                           }

    } else if  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !F.getText ( ).toString ( ).equals ( "" ) &&
                  !s.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                         ss = Double.parseDouble (s.getText ( ).toString ( ) );

                           tampilan1.setText ( "   benda ditempat datar ditarik gaya tanpa gesekan" );
                                acc = FF / mama;
                                  p = 2 * ss / acc;
                                 tt = Math.pow ( p , 0.5 );
                           tampilan2.setText ( "t = (2s/a)^0,5; a = F/m" );
                           tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );

             } else if ( !s.getText ( ).toString ( ).equals ( "" ) &&
                   !alfa.getText ( ).toString ( ).equals ( "" )&&
                      !g.getText ( ).toString ( ).equals ( "" )) {
                                         ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                         aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                         gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                           tampilan1.setText ( "  benda di bidang miring meluncur tanpa gesekan" );
                                deg = 0.017444 * aalf;
                                sin = Math.sin ( deg );
                                acc = gg * sin;
                                  p = 2 * ss / acc;
                                 tt = Math.pow ( p , 0.5 );
                           tampilan2.setText ( "t = (2s/a)^0,5; a = g * sin (alfa)" );
                           tampilan3.setText ( "a = " + df.format ( acc ) + "m/ss" );
                           tampilan5.setText ( "t = " + df.format ( tt ) + "s" );
                           //POLA YANG SAMA JUGA BERLAKU PADA KECEPATAN DAN JARAK TEMPUH

                   }}
        }
        );


        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

             if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !ac.getText ( ).toString ( ).equals ( "" ) &&
                   !g.getText ( ).toString ( ).equals ( "" ) &&
                !alfa.getText ( ).toString ( ).equals ( "" ) &&
                  !uk.getText ( ).toString ( ).equals ( "" )) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );



                    tampilan1.setText ( "    gaya untuk mempercepat (ke atas) benda yang berada di bidang miring membentuk sudut alfa dan terjadi gaya gesek" );
                            deg = 0.017444 * aalf;
                            sin = Math.sin ( deg );
                            cos = Math.cos ( deg );
                         result = mama*(gg*sin + gg*ukuk*cos + acc);
                    tampilan2.setText ( "F = m(gsin(alfa) + uk g cos(alfa) + a)" );
                    tampilan3.setText ( "F =" + df.format ( result ) + "N" );

             } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                         !ac.getText ( ).toString ( ).equals ( "" ) &&
                          !g.getText ( ).toString ( ).equals ( "" )&&
                       !alfa.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                            aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "  gaya untuk mempercepat (ke atas) benda yang berada di bidang miring " +
                            "membentuk sudut alfa dan tanpa gaya gesek" );
                              deg = 0.017444 * aalf;
                              sin = Math.sin ( deg );
                              cos = Math.cos ( deg );
                           result = mama*(gg*sin +  acc);
                    tampilan2.setText ( "F = m(gsin(alfa) + a)" );
                    tampilan3.setText ( "F =" + df.format ( result ) + "N" );

  } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !ac.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" ) &&
             !teta.getText ( ).toString ( ).equals ( "" ) &&
               !uk.getText ( ).toString ( ).equals ( "" )) {
                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                     ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                       aa = Double.parseDouble ( ac.getText ( ).toString ( ) );
                    teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( " benda dilantai  KASAR datar ditarik gaya membentuk sudut teta" );
                           deg = 0.017444 * teeta;
                           sin = Math.sin ( deg );
                           cos = Math.cos ( deg );
                        result = mama*(ukuk*gg + aa)/(cos+ukuk*sin);
                    tampilan2.setText ( "gaya gesek kinetik jika benda ditarik datar Fg = uk m g " );
                    tampilan3.setText ( "komponen gaya kearah vertikal mengurangi gaya normal " );
                    tampilan4.setText ( "gaya gesek kinetik enjadi uk(mg - Fsin(teta))" );
                    tampilan5.setText ( "Hk 2 Newton menjadi: F cos(teta) - uk(mg - Fsin(teta) = m a " );
                    tampilan6.setText ( "F = m(uk * g + a)/(cos (teta) + uk sin(teta))" );
                    tampilan8.setText ( "F =" + df.format ( result ) + "N" );

  } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !uk.getText ( ).toString ( ).equals ( "" )&&
                !g.getText ( ).toString ( ).equals ( "" )) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    tampilan1.setText ( " benda dilantai  KASAR datar ditarik searah gerak tanpa percepatan" );
                          result = mama*ukuk*gg ;
                    tampilan2.setText ( "F =  uk * m* g " );
                    tampilan3.setText ( "F =" + df.format ( result ) + "N" );

    } else if
            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !mb.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" ) &&
               !us.getText ( ).toString ( ).equals ( "" )) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                      usus = Double.parseDouble ( us.getText ( ).toString ( ) );

                    tampilan1.setText ( " Benda A diatas B yang ditarik kenanan, benda A diikat dengan tambok" +
                            "  antara A dan B ada gaya gesek. Gaya minimal muntuk menari benda B : " );
                 tampilan2.setText ( "Gaya gesek benda B dengan lantai us (ma + mb)g)" );
                 tampilan3.setText ( "Gaya gesek benda B dengan A = us.ma.g)" );
                        Fg = usus*gg*(2*mama+mbmb);


                    tampilan4.setText ( "gaya tari = gaya gesek" );

                    tampilan5.setText ( "F = " + df.format ( Fg ) + "N" );
                 tampilan6.setText ( "" );
                 tampilan7.setText ( "Kemungkinan kedua" );
                 tampilan8.setText ( " Benda B diatas A yang ditarik kenanan, benda B diikat dengan tambok" +
                         "  antara A dan B ada gaya gesek. Gaya minimal muntuk menari benda A : " );
                 tampilan9.setText ( "Gaya gesek benda A dengan lantai us (ma + mb)g)" );
                 tampilan10.setText ( "Gaya gesek benda B dengan A = us.mb.g)" );

                 Fg = usus*gg*(mama+ 2*mbmb);
                 tampilan11.setText ( "gaya tari = gaya gesek" );

                 tampilan12.setText ( "F = " + df.format ( Fg ) + "N" );


             } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                             !mb.getText ( ).toString ( ).equals ( "" ) &&
                             !F.getText ( ).toString ( ).equals ( "" )) {
                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                 mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                 FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                 tampilan1.setText ( " Benda A dan B berdampingan di lantai LICIN," +
                         " A didorong gaya F, berapa gaya dialami B?" );
                 aa = FF/(mama+mbmb);
                 A = mbmb*aa;
                 tampilan2.setText ( "F = (ma + mb) a;  a = F/(ma+mb)" );
                 tampilan3.setText ( "gaya yang dirasakan mb : F = mb a" );
                 tampilan4.setText ( "a =" + df.format ( aa ) + "m/ss" );
                 tampilan5.setText ( "F = " + df.format ( A ) + "N" );
                 tampilan6.setText ( "" );
                 tampilan7.setText ( "Kemungkinan kedua" );
                 tampilan9.setText ( " Benda A dan B berdampingan di lantai LICIN," +
                         " B didorong gaya F, berapa gaya dialami A?" );
                 aa = FF/(mama+mbmb);
                 B = mama*aa;
                 tampilan10.setText ( "F = (ma + mb) a;  a = F/(ma+mb)" );
                 tampilan11.setText ( "gaya yang dirasakan mb : F = ma a" );
                 tampilan13.setText ( "a =" + df.format ( aa ) + "m/ss" );
                 tampilan14.setText ( "F = " + df.format ( B ) + "N" );



             } else if
            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !ac.getText ( ).toString ( ).equals ( "" ) &&
            !teta.getText ( ).toString ( ).equals ( "" ) ){

                  mama = Double.parseDouble  (ma.getText ( ).toString ( ) );
                   acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                 teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                    tampilan1.setText ( " Benda dilantai  LICIN datar ditarik gaya membentuk sudut teta " +
                            "hingga percepatannya a" );
                         deg = 0.017444 * teeta;

                         cos = Math.cos ( deg );
                      result = mama*acc/cos;
                    tampilan2.setText ( "F = ma/cos(teta)" );
                    tampilan3.setText ( "F =" + df.format ( result ) + "N" );
   } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !vo.getText ( ).toString ( ).equals ( "" ) &&
               !vt.getText ( ).toString ( ).equals ( "" )&&
                !s.getText ( ).toString ( ).equals ( "" )) {
                         mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                         vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                         vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                           ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  LICIN datar ditarik gaya sejajar lantai" );
                          v12 = Math.pow(vovo,2);
                          v22 = Math.pow(vtvt,2);

                          FF = mama*(v22 - v12)/(2*ss);
                    tampilan2.setText ( " Gunakan usaha = perubahan energi kenitik, F.s = perubahan energi kinetik" );
                    tampilan3.setText ( "F = m*(vb^2-va^2)/ 2*ss" );
                    tampilan4.setText ( "F =" + df.format ( FF ) + "N" );

   } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !vo.getText ( ).toString ( ).equals ( "" ) &&
               !vt.getText ( ).toString ( ).equals ( "" )&&
                !t.getText ( ).toString ( ).equals ( "" )) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                             vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                               tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " Benda berkecepatan Vo dilantai  LICIN datar ditarik gaya F " +
                            "sejajar lantai selama t hingga kecepatan menjadi Vt" );
                        FF = mama*(vtvt - vovo)/tt;
                    tampilan2.setText ( "F = ma*(v2 - v1)/ t" );
                    tampilan3.setText ( "F =" + df.format ( FF ) + "N" );

    } else if
              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !s.getText ( ).toString ( ).equals ( "" ) &&
                 !t.getText ( ).toString ( ).equals ( "" )) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  LICIN datar ditarik gaya F sejajar lantai" +
                            " setelah t berbindah sejau s" );
                    tampilan2.setText ( "  F = ma;   a = 2 s/ t^2" );
                           t2 = Math.pow(tt,2);
                           FF = 2 * mama* ss/t2;
                    tampilan3.setText ( "F = 2 m  s/ t^2" );
                    tampilan5.setText ( "F =" + df.format ( FF ) + "N" );

   } else if

              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                 !s.getText ( ).toString ( ).equals ( "" )&&
                !vo.getText ( ).toString ( ).equals ( "" )) {
                                     mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                     vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                                     ss = Double.parseDouble ( s.getText ( ).toString ( ) );


                    tampilan1.setText ( "   benda meluncur dengan kecepatan Vo tertahan gaya hingga berhenti" +
                            "setelah menempuh jarak s)" );
                    tampilan2.setText ( "   gunakan prinsip usaha energi)" );
                    tampilan3.setText ( "F = 0,5 m v^2/s" );
                         vovo = Math.pow(vovo,2);
                           FF = 0.5 * mama*vovo/ss;
                    tampilan4.setText ( "F =" + df.format ( FF ) + "N" );

 } else if
      ( !ma.getText ( ).toString ( ).equals ( "" ) &&
         !g.getText ( ).toString ( ).equals ( "" )&&
        !ac.getText ( ).toString ( ).equals ( "" )) {
                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                  acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( " Gaya yang dibutuhkan untuk menarik benda ditarik vertikal ke atas  " +
                            "dengan percepatan a" );
                        FF = mama *(gg + acc);
                    tampilan2.setText ( "F = m ( g + a)" );
                    tampilan3.setText ( "F =" + df.format ( FF ) + "N" );

 } else if
           ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !vo.getText ( ).toString ( ).equals ( "" ) &&
              !r.getText ( ).toString ( ).equals ( "" )) {
                      mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                              tampilan1.setText ( "    Benda gerak melingkar horisontal" );
                                     v12 = Math.pow ( vovo , 2 );
                                     FF = mama * v12 / rr;
                              tampilan2.setText ( "F = m v^2 /r)" );
                              tampilan3.setText ( "F =" + df.format ( FF ) + "N" );

                    } }  }
        );

        btnwork.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                if
                ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                  !ac.getText ( ).toString ( ).equals ( "" ) &&
                   !g.getText ( ).toString ( ).equals ( "" )&&
                !alfa.getText ( ).toString ( ).equals ( "" )&&
                  !uk.getText ( ).toString ( ).equals ( "" )&&
                   !s.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                    ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                    ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );

                    tampilan1.setText ( " Usaha gaya untuk mempercepat  (ke atas) benda yang berada di bidang miring" +
                            " membentuk sudut alfa dan terjadi gaya gesek hingga berpindah s" );
                           deg = 0.017444 * aalf;
                           sin = Math.sin ( deg );
                           cos = Math.cos ( deg );
                        result = ss * mama * (gg * sin + gg * ukuk * cos + acc);
                    tampilan1.setText ( " W = F. S, W = m(gsin(alfa) + ukgcos(alfa) + a) S" );
                    tampilan2.setText ( "Usaha =" + df.format ( result ) + "joule" );
                }

  else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                !F.getText ( ).toString ( ).equals ( "" ) &&
                                !g.getText ( ).toString ( ).equals ( "" )&&
                                !alfa.getText ( ).toString ( ).equals ( "" )&&
                                !uk.getText ( ).toString ( ).equals ( "" )&&
                                !s.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                            FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                            ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                            aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    // gaya untuk mempercepat (ke atas) benda yang berada di bidang miring membentuk sudut alfa dan terjadi gaya gesek
                    tampilan1.setText ( "v = t * (mb- uk*ma*sin(alfa)*cos(alfa))*g/(ma + mb)" );
                    tampilan1.setText ( "Benda ditarik gaya F ke atas sejajar bidang miring(alfa), bidang kasar, berpindah sejaus s" );
                    tampilan2.setText ( " Usaha gaya meliputi:mengatasi gaya gesek dan perubahan energi potensial dan energi kinetik" );
                    tampilan3.setText ( " Cara menghitung: F - Fg - mgsin(alfa) = m a;  vt^2 = 2 a s; Ek = 0,5 m vt^2 ; Ep = mgh = mgs sin alfa" );
                    tampilan4.setText ( " Usaha = usaha gesek + Ep + Ek" );
                           deg = 0.017444 * aalf;
                           sin = Math.sin ( deg );
                           cos = Math.cos ( deg );
                            Fg = ukuk*mama*gg*cos;
                        Wgesek = Fg*ss;
                            aa = (FF-Fg-mama*gg*sin)/mama;
                          vovo = 2*aa*ss;
                            Ek = 0.5*mama*vovo;
                            Ep = mama*gg*ss*sin;
                         Usaha = Wgesek+Ek+Ep;
                    tampilan5.setText ( " Fg = " + df.format ( Fg ) + "N" );
                    tampilan6.setText ( "Wgesek = " + df.format ( Wgesek ) + "joule" );
                    tampilan7.setText ( " a = " + df.format ( aa ) + "m/s2" );
                    tampilan8.setText ( " Ek = " + df.format ( Ek ) + "joule" );
                    tampilan9.setText ( " Ep = " + df.format ( Ep ) + "joule" );
                    tampilan10.setText ( " Usaha = " + df.format (Usaha ) + "joule" );
                }
   else   if
          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !F.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )&&
          !alfa.getText ( ).toString ( ).equals ( "" )&&
             !s.getText ( ).toString ( ).equals ( "" )) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    // gaya untuk mempercepat (ke atas) benda yang berada di bidang miring membentuk sudut alfa dan terjadi gaya gesek

                    tampilan1.setText ( "Benda ditarik gaya F ke atas sejajar bidang miring(alfa), bidang licin, berpindah sejaus s" );
                    tampilan2.setText ( " Usaha gaya meliputi:mengatasi gaya gesek dan perubahan energi potensial dan energi kinetik" );
                    tampilan3.setText ( " Cara menghitung: F - mgsin(alfa) = m a;  vt^2 = 2 a s; Ek = 0,5 m vt^2 ; Ep = mgh = mgs sin alfa" );
                    tampilan4.setText ( " Usaha = usaha gesek + Ep + Ek" );
                          deg = 0.017444 * aalf;
                          sin = Math.sin ( deg );
                          cos = Math.cos ( deg );

                           aa = (FF-Fg-mama*gg*sin)/mama;
                         vtvt = 2*aa*ss;
                           Ek = 0.5*mama*vtvt;
                           Ep = mama*gg*ss*sin;
                        Usaha = Wgesek+Ek+Ep;
                    tampilan5.setText ( " a = " + df.format ( aa ) + "m/s2" );
                    tampilan6.setText ( " Ek = " + df.format ( Ek ) + "joule" );
                    tampilan7.setText ( " Ep = " + df.format ( Ep ) + "joule" );
                    tampilan8.setText ( " Usaha = " + df.format (Usaha ) + "joule" );


    } else if
           ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
           !alfa.getText ( ).toString ( ).equals ( "" )&&
             !ac.getText ( ).toString ( ).equals ( "" )&&
              !s.getText ( ).toString ( ).equals ( "" )) {
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                    acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                                    ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );



                    tampilan1.setText ( "gaya untuk mempercepat (ke atas) benda yang berada di bidang miring  yang licin membentuk sudut alfa " );
                         deg = 0.017444 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                      result = mama*(gg*sin +  acc)*ss;
                    tampilan2.setText ( "Usaha =  F. S = m(gsin(alfa) + a) S" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

   } else if
         ( !ma.getText ( ).toString ( ).equals ( "" ) &&
            !g.getText ( ).toString ( ).equals ( "" )&&
         !alfa.getText ( ).toString ( ).equals ( "" )&&
            !s.getText ( ).toString ( ).equals ( "" )) {
                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                 aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                   gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "  gaya untuk mempercepat (ke atas) benda yang berada di bidang miring membentuk sudut alfa dan tanpa gaya gesek" );
                         deg = 0.017444 * aalf;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                      result = mama*gg*sin *ss;
                    tampilan2.setText ( "Usaha =  F. S = m g S sin(alfa)" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

  } else if
            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
              !ac.getText ( ).toString ( ).equals ( "" )&&
            !teta.getText ( ).toString ( ).equals ( "" )&&
              !uk.getText ( ).toString ( ).equals ( "" )&&
               !s.getText ( ).toString ( ).equals ( "" )) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                          ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                       teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                         acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                          gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    tampilan1.setText ( "  benda dilantai  KASAR datar ditarik gaya membentuk sudut teta" );
                         deg = 0.017444 * teeta;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                      result = ss*mama*(ukuk*gg + acc)/(cos+ukuk*sin);
                    tampilan2.setText ( "  W = F . S = m(uk * g + a)/(cos (teta) + uk sin(teta)) S" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

} else if
       ( !ma.getText ( ).toString ( ).equals ( "" ) &&
          !ac.getText ( ).toString ( ).equals ( "" ) &&
         !uk.getText ( ).toString ( ).equals ( "" ) &&
          !g.getText ( ).toString ( ).equals ( "" ) &&
          !s.getText ( ).toString ( ).equals ( "" )) {
                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                   ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                     ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                    acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  KASAR datar ditarik gaya searah gerak dengan percepatan" );
                    result = ss*mama*(ukuk*gg + acc);
                    tampilan2.setText ( "  W = F . S = m(uk * g + a) S" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

  } else if
      ( !ma.getText ( ).toString ( ).equals ( "" ) &&
         !g.getText ( ).toString ( ).equals ( "" )&&
        !uk.getText ( ).toString ( ).equals ( "" )&&
         !s.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                      ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                     gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  KASAR datar ditarik gaya searah gerak dengan percepatan = 0" );
                    tampilan2.setText ( "  W = F . S = m * uk * g * S" );
                         result = ss*mama*ukuk*gg ;
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

  } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !teta.getText ( ).toString ( ).equals ( "" )&&
               !ac.getText ( ).toString ( ).equals ( "" )&&
                !s.getText ( ).toString ( ).equals ( "" )) {
                               mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                 ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                              teeta = Double.parseDouble (teta.getText ( ).toString ( ) );
                                acc = Double.parseDouble ( ac.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  LICIN datar ditarik gaya membentuk sudut teta" );
                         deg = 0.017444 * teeta;
                         sin = Math.sin ( deg );
                         cos = Math.cos ( deg );
                      result = ss*mama*acc/cos;
                    tampilan2.setText ( " W = F.S = s m a/cos(teta)" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

 } else if
       ( !ma.getText ( ).toString ( ).equals ( "" ) &&
          !F.getText ( ).toString ( ).equals ( "" ) &&
       !teta.getText ( ).toString ( ).equals ( "" )&&
          !t.getText ( ).toString ( ).equals ( "" )) {
                                   mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                     FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                     tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                  teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  LICIN datar ditarik gaya membentuk sudut teta" );
                          deg = 0.017444 * teeta;
                          sin = Math.sin ( deg );
                          cos = Math.cos ( deg );
                           aa = FF/mama;
                           ss = 0.5*aa*tt*tt;
                       result = ss*FF/cos;
                    tampilan2.setText ( " W = F.S = s m a/cos(teta)" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

      } else if
            ( !F.getText ( ).toString ( ).equals ( "" ) &&
           !teta.getText ( ).toString ( ).equals ( "" )&&
              !s.getText ( ).toString ( ).equals ( "" )) {
                         FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                         ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                      teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                    tampilan1.setText ( "    benda dilantai  LICIN datar ditarik gaya membentuk sudut teta" );
                          deg = 0.017444 * teeta;
                          sin = Math.sin ( deg );
                          cos = Math.cos ( deg );
                       result = FF * ss * cos;
                    tampilan2.setText ( " W = F.S = F S cos(teta)" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );
                }
    else if
        ( !ma.getText ( ).toString ( ).equals ( "" ) &&
          !vo.getText ( ).toString ( ).equals ( "" ) &&
          !vt.getText ( ).toString ( ).equals ( "" )) {
                              mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                              vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                              vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );

                    tampilan1.setText ( "  benda dilantai  LICIN datar ditarik gaya sejajar lantai" );
                         v12 = Math.pow(vovo,2);
                         v22 = Math.pow(vtvt,2);
                      result = 0.5*mama*(v22 - v12);
                    tampilan2.setText ( " W = perubahan energi kinetik =  0,5 m*(vt^2-vo^2)" );
                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

 } else if
          ( !F.getText ( ).toString ( ).equals ( "" ) &&
            !s.getText ( ).toString ( ).equals ( "" )) {
                                  FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                  ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                    tampilan1.setText ( " benda dilantai  LICIN datar ditarik gaya sejajar lantai" );
                    tampilan2.setText ( "Usaha = F.S " );
                        result = FF * ss;

                    tampilan3.setText ( "Usaha =" + df.format ( result ) + "joule" );

                }
            }}
        );
 btnN.setOnClickListener ( new View.OnClickListener ( ) {
           @Override public void onClick ( View view ) {

               DecimalFormat df = new DecimalFormat ( "#.###" );

         if
              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !vt.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" )&&
              !alfa.getText ( ).toString ( ).equals ( "" )&&
                 !r.getText ( ).toString ( ).equals ( "" )) {
                       mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                      vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                       aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                       rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                       gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                   tampilan1.setText ( "  Gaya normal jalan miring dengan sudut alfa yang dilewati mobil memutar dengan jari-jari r" );
                   deg = 0.017444 * aalf;
                   sin = Math.sin ( deg );
                   result = mama * Math.pow ( vtvt, 2 ) / (rr * sin);
                   tampilan2.setText ( "N = m * vt^2 /r sin (alfa)" );
                   tampilan3.setText ( "N =" + df.format ( result ) + " N" );

}  else if
          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !g.getText ( ).toString ( ).equals ( "" )&&
            !ac.getText ( ).toString ( ).equals ( "" )) {
                           mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                           gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                   tampilan1.setText ( "     Gaya normal  lantai lif bergerak ke atas" );
                          result = mama *( gg + acc);
                   tampilan2.setText ( "N = m *( g + a)" );
                   tampilan3.setText ( "N =" + df.format ( result ) + " N" );
                   tampilan5.setText ( "     Gaya normal  lantai lif bergerak ke bawah" );
                          result = mama *( gg - acc);
                   tampilan6.setText ( "N = m *( g - a)" );
                   tampilan7.setText ( "N =" + df.format ( result ) + " N" );

 }  else if
         ( !ma.getText ( ).toString ( ).equals ( "" ) &&
         !alfa.getText ( ).toString ( ).equals ( "" )&&
            !g.getText ( ).toString ( ).equals ( "" )) {
                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                      gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                   tampilan1.setText ( " Gaya normal  benda di bidang miring" );
                          deg = 0.017444 * aalf;
                          cos = Math.cos ( deg );
                       result = mama * gg * cos;
                   tampilan2.setText ( "N = m * g * cos (alfa))" );
                   tampilan3.setText ( "N =" + df.format ( result ) + " N" );

               }
           }
        }
        );

  btnuk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                            !g.getText ( ).toString ( ).equals ( "" ) &&
                           !ac.getText ( ).toString ( ).equals ( "" ) &&
                            !alfa.getText ( ).toString ( ).equals ( "" ) &&
                            !F.getText ( ).toString ( ).equals ( "" ) ) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        aa = Double.parseDouble ( ac.getText ( ).toString ( ) );
                        FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                        aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                        tampilan1.setText ( "  Benda ditarik ke atas  sejajar di bidang miring dengan gesekan" );
                        deg = 0.017444 * aalf;
                        sin = Math.sin ( deg );
                        cos = Math.cos ( deg );
                        result = (FF - mama * (aa + gg * sin)) / mama * gg * cos;
                        tampilan2.setText ( "uk =(F - m*(a +gsin(alfa))/mgcos(alfa)" );
                        tampilan3.setText ( "uk =" + df.format ( result ) );
                } else if
                ( !s.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !alfa.getText ( ).toString ( ).equals ( "" ) &&
                                !g.getText ( ).toString ( ).equals ( "" ) ) {

                    ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    tampilan1.setText ( "  Benda meluncur dibidang miring yang kasar" );

                    tampilan2.setText ( " gaya luncur - gaya gesek = ma" );
                    tampilan3.setText ( " m g sin(alfa) - uk m g cos(alfa) = ma" );
                    tampilan4.setText ( " uk = ( g sin(alfa) - a)/ g cos(alfa)" );
                    tampilan5.setText ( " S = 0,5 a  t^2,   a = 2 S/t^2" );
                    deg = 0.017444 * aalf;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    acc = 2*ss/(tt*tt);
                    result = (gg * sin - acc) / (gg*cos);

                    tampilan7.setText ( "a =" + df.format (acc ) +"m/ss");
                    tampilan8.setText ( "uk =" + df.format ( result ) );

                    } else if
                                   ( !ac.getText ( ).toString ( ).equals ( "" ) &&
                                    !alfa.getText ( ).toString ( ).equals ( "" ) &&
                                    !g.getText ( ).toString ( ).equals ( "" ) ) {

                        aa = Double.parseDouble ( ac.getText ( ).toString ( ) );
                        aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                        tampilan1.setText ( "  Benda meluncur dibidang miring yang kasar" );

                    tampilan2.setText ( " F = mg sin(alfa) - uk m g cos(alfa)" );
                    tampilan3.setText ( " a = m g sin(alfa) - uk m g cos(alfa)" );
                    tampilan4.setText ( " uk = ( g sin(alfa) - a)/ g cos(alfa)" );
                        deg = 0.017444 * aalf;
                        sin = Math.sin ( deg );
                        cos = Math.cos ( deg );
                        result = (gg * sin - aa) / (gg*cos);

                        tampilan6.setText ( "uk =" + df.format ( result ) );

                    } else if
                                  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                    !vo.getText ( ).toString ( ).equals ( "" ) &&
                                    !g.getText ( ).toString ( ).equals ( "" ) &&
                                    !s.getText ( ).toString ( ).equals ( "" ) ) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                        tampilan1.setText ( "  Benda meluncur di lantai yang kasar, berhenti setelah menempuh jarak S " );
                        tampilan2.setText ( "  vt^2 = vo^2 + 2 a St; vt = 0" );
                        tampilan3.setText ( "  a = - vo^2/2 St " );
                        tampilan4.setText ( "  gaya gesek: uk m g = m a  " );
                        tampilan5.setText ( "  uk = -a/g " );
                        aa = -vovo * vovo / (2 * ss);
                        ukuk = -aa / gg;
                        tampilan6.setText ( "a =" + df.format ( aa ) + " m/ss" );
                        tampilan8.setText ( "uk =" + df.format ( ukuk ) );

                    } else if
                                  ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                    !vo.getText ( ).toString ( ).equals ( "" ) &&
                                    !g.getText ( ).toString ( ).equals ( "" ) &&
                                    !t.getText ( ).toString ( ).equals ( "" ) ) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                        tampilan1.setText ( "  Benda meluncur di lantai yang kasar, berhenti setelah t sekon " );
                        tampilan2.setText ( "  vt = vo + at;  vt = 0" );
                        tampilan3.setText ( "  a = - vo/t" );
                        tampilan4.setText ( "  gaya gesek: uk m g = m a  " );
                        tampilan5.setText ( "  uk = -a/g " );
                        aa = -vovo / (tt);
                        ukuk = -aa / gg;
                        tampilan6.setText ( "a =" + df.format ( aa ) + " m/ss" );
                        tampilan8.setText ( "uk =" + df.format ( ukuk ) );

                }
            }}
        );

 btnvo.setOnClickListener ( new View.OnClickListener ( ) {
                @Override public void onClick ( View view ) {
                 DecimalFormat df = new DecimalFormat ( "#.###" );

     if
        ( !ma.getText ( ).toString ( ).equals ( "" ) &&
           !g.getText ( ).toString ( ).equals ( "" )&&
          !uk.getText ( ).toString ( ).equals ( "" )&&
           !s.getText ( ).toString ( ).equals ( "" )) {
                          mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                          ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                          ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                          gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                      tampilan1.setText ( "  Benda meluncur di lantai yang kasar, berhenti setelah menempuh jarak S " );
                      tampilan2.setText ( "  vt^2 = vo^2 + 2 a St; vt = 0" );
                      tampilan3.setText ( "  vo = (- 2a.*st)^0,5 " );
                      tampilan4.setText ( "  gaya gesek: uk m g = m a  " );
                      tampilan5.setText ( "  a = uk*g;   vo = (2*uk*g*st)^0,5 " );
                      vovo = 2*ukuk*gg*ss;
                      vovo = Math.pow(vovo,0.5);
                      tampilan7.setText ( "vo =" + df.format ( vovo ) + " m/s");

  } else  if
          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
            !F. getText ( ).toString ( ).equals ( "" )&&
             !t.getText ( ).toString ( ).equals ( "" )) {
                              mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                              FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                              tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                      tampilan1.setText ( " Mobil bermassa ma meluncur dijalan, direm dengan gaya F berhenti setelah t sekon " );
                      tampilan2.setText ( "  vt = vo + at;  vt = 0" );
                      tampilan3.setText ( "  a = - F/m" );
                      tampilan4.setText ( "  vo = -at " );
                      tampilan5.setText ( "  vo = F*t/m " );
                      vovo = FF*tt/mama;

                      tampilan7.setText ( "vo =" + df.format ( vovo ) + " m/s");

  } else  if
           ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !F.getText ( ).toString ( ).equals ( "" ) &&
              !s.getText ( ).toString ( ).equals ( "" )) {
                                  mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                  FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                  ss = Double.parseDouble ( s.getText ( ).toString ( ) );

                      tampilan1.setText ( " Mobil bermassa ma meluncur dijalan, direm dengan gaya F berhenti setelah s meter  " );
                      tampilan2.setText ( "  vt^2 = vo^2 + 2as;  vt = 0" );
                      tampilan3.setText ( "  a = - F/m" );
                      tampilan4.setText ( "  vo = (2a*s)^0,5) " );
                      tampilan5.setText ( "  vo = (2F*s/m)^0,5 " );
                      vovo = 2*FF*ss/mama;
                      vovo = Math.pow(vovo,0.5);

                      tampilan7.setText ( "vo =" + df.format ( vovo ) + " m/s");
                  } }
        }
        );


 btnT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
       public void onClick ( final View view ) {
       DecimalFormat df = new DecimalFormat ( "#.####" );

    if
         (!ma.getText ( ).toString ( ).equals ( "" ) &&
          !mb.getText ( ).toString ( ).equals ( "" ) &&
           !g.getText ( ).toString ( ).equals ( "" )&&
        !alfa.getText ( ).toString ( ).equals ( "" )&&
          !uk.getText ( ).toString ( ).equals ( "" )&&
          !us.getText ( ).toString ( ).equals ( "" )) {
                        mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                        ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                        usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                        aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );



                    tampilan1.setText ( "KEMUNGKINAN PERTAMA, sistem dua benda dihubungkan melalui tali dan katrol");
                    tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring dan terjadi gaya gesek");
                    tampilan3.setText ( "");
                    deg = 0.017444 * aalf;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    // Fgs 12 berarti : Gaya + gaya gesek statik, 1 : arah gerak ke kanan, 2: asumsi  b...a
                    // Fgs 21 berarti : Gaya + gaya gesek statik, 2 : arah gerak ke kiri, 2: asumsi  a...b
                    A1 = gg*mama*(sin+usus*cos);//Fgs11   [gaya+gaya gesek statik melawan gerak ke kanan]
                    A2 = mbmb*gg;//F11
                    A = gg*mama*(sin+ukuk*cos);//Fgk11
                    B1 = gg*mama; //F12
                    B = gg*mama*sin; //F21
                    C = gg*(mbmb +(ukuk*mama*cos));// Fgk21
                    C1 = gg*(mbmb +(usus*mama*cos));//Fgs21
                    D = mama + mbmb;
                    P = mbmb*gg*(sin + ukuk*cos);// Fgk12
                    P1 = mbmb*gg*(sin + usus*cos);// Fgs12

                    Q = mbmb*gg*sin;//F12
                    Z = gg*( mama + (ukuk*mbmb*cos));// Fgk22
                    Z1 = gg*( mama + (usus*mbmb*cos));// Fgs22
                    dF = A2-A1;


                    if (A2 > A1) {//Penggerak > penahan.....mb turun
                        aa =(A2-A )/D;
                        TT = mbmb*(gg-aa);

                        tampilan4.setText ( "gaya penggerak naik bidang miring  adalah mb*g  =  "+ df.format ( A2 ) + "N (mb TURUN)"  );
                        tampilan5.setText ( "gaya penahan gerak ke atas bidang miring ma g (sin(alfa)+ us ma*g cos (alfa)=  "+ df.format ( A1 ) + "N " );
                        tampilan6.setText ( "karena gaya penggerak > gaya penahan, terjadi gerak maka us diganti uk" );
                        tampilan7.setText ( " a = jumlah gaya/jumlah massa;  " );
                        tampilan8.setText ( "  gaya pennerak : mb*g = "+ df.format ( A2 ) + "N " +"gaya penahan gerak ke atas bidang miring ma g (sin(alfa)+ uk ma*g cos (alfa)=  "+ df.format ( A ) + "N "  );
                        tampilan9.setText ( "" );
                        tampilan10.setText ( "a = "+"(" + df.format(A2)+" - "+ df.format(A)+")/"+ df.format(D)+" = "+ df.format ( aa ) + "m/ss" );
                        tampilan11.setText ( "Tegangan tali T = mb (g-a)" );
                        tampilan12.setText ( "Tegangan tali T = " + df.format ( TT ) + " N" );
                        tampilan13.setText ( "" );

                    }else
                    if (A2 < A1){ //mau gerak ke kiri

                        if (B > C1){
                            aa= (B-C)/D;

                            tampilan4.setText ( "gaya penggerak ke kiri  adalah  ma*gsin(alfa) =  "+ df.format ( B ) + "N "  );
                            tampilan5.setText ( "gaya penahan penggerak ke kiri  adalah gg*(mbmb +(usus*mama*cos)) =  "+ df.format ( C1 ) + "N "  );
                            tampilan6.setText ( "karena ma*gsin(alfa) > ma * g(us cos (alfa)) + mb*g,  maka geral ke kiri, mb BERGERAK NAIK, selanjutnya us diganti uk " );
                            tampilan7.setText ( "a = jumlah F / jumlah m   " );
                            tampilan8.setText ( "a = (ma sin(alfa)- uk*ma*cos alfa - mb)*g / (ma + mb)" );
                            tampilan9.setText ( "Tegangan tali T = mb (g +a)" );
                            tampilan10.setText ( "a = " + df.format ( aa ) + "m/ss" );
                            tampilan11.setText ( "" );
                            tampilan10.setText ( "T = " + df.format ( TT ) + " N" );
                            tampilan13.setText ( "" );
                        }
                        else if(B < C1) {
                            TT = mbmb*gg;
                            tampilan4.setText ( "" );
                            tampilan5.setText ( "Misal akan gerak ke kanan: " );
                            tampilan6.setText ( "gaya penggerak ke kanan  mb*g= " + df.format ( A2 ) + "N" );
                            tampilan7.setText ( "gaya + gesek statis maksimum  melawan gerak ke kanan ma g (sin(alfa)+ us ma*g cos (alfa)=  "+ df.format ( A1 )  );
                            tampilan8.setText ( "gaya penggerak tidak lebih dari gaya sesek statik, BENDA TIDAK BERGERAK" );
                            tampilan9.setText ( "" );
                            tampilan10.setText ( "Misal akan gerak ke kiri: " );
                            tampilan11.setText ( "gaya penggerak ke kiri  ma*gsinalfa = " + df.format ( B ) + "N" );
                            tampilan12.setText ( "gaya + gesek statis maksimum  melawan gerak ke kiri = " + df.format ( C1 ) + "N" );
                            tampilan13.setText ( "gaya penggerak tidak lebih dari gaya sesek statik, BENDA TIDAK BERGERAK, tegangan tali T = mb g" );
                            tampilan14.setText ( "" );
                            tampilan15.setText ( "T = " + df.format ( TT ) + " N" );

                        }}
//ASUMSI PERTAMA TELAH OK
// ASUMSI KE DUA**********************************************************************************************************
                    tampilan16.setText ( "");
                    tampilan17.setText ( "");
                    tampilan18.setText ( "KEMUNGKINAN KEDUA");
                    tampilan19.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                    tampilan20.setText ( "benda ma tergantung dan benda mb pada bidang miring dan terjadi gaya gesek");
                    tampilan21.setText ( "");
                    deg = 0.017444 * aalf;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );

                    if (B1 > P1) {
                        tampilan22.setText ( "gaya penggerak ke kanan benda menggantung ma*g = "+df.format ( B1 ) + "N" );
                        tampilan23.setText (  "gaya penahan = mb*g(sin(alfa)+ us cos(alfa))= "+df.format ( P1 ) + "N" );
                        tampilan24.setText ( "karena ma > mb (sin(alfa)+ us cos (alfa)) maka ma BERGERAK TURUN " );
                        tampilan25.setText (  "gaya penahan saat bergerak = mb*g(sin(alfa)+ uk cos(alfa))= "+df.format ( P ) + "N" );
                        tampilan26.setText ( "a = jumlah F / jumlah m   " );
                        tampilan27.setText ( "a = Wa - (Wb sin(alfa)-Fg)/(ma + mb)" );
                        tampilan28.setText ( "a = (ma - mb*(sin(alfa) + uk cos(alfa))*g/(ma + mb)" );
                        tampilan29.setText ( "Tegangan tali T = ma (g-a)" );
                        tampilan30.setText ( "" );
                        aa = (B1 -  P )  / D;
                        TT = mama*(gg-aa);
                        tampilan31.setText ( "a = " + df.format ( aa ) + "m/ss" );
                        tampilan32.setText ( "" );
                        tampilan33.setText ( "T = " + df.format ( TT ) + " N" );

                    } else


                    if (Q > Z1) {
                        tampilan22.setText ( "gaya penggerak benda ke kiri  mb g sin(alfa)  "+df.format ( Q ) + "N" );
                        tampilan23.setText (  "gaya penahan = mb*g + ma g us cos(alfa))= "+df.format ( Z1 ) + "N" );
                        tampilan24.setText ( "karena  mb g sin(alfa) >  g (ma + us mb cos (alfa)) maka ma BERGERAK NAIK " );
                        tampilan25.setText ( "a = jumlah F / jumlah m " );
                        tampilan26.setText ( "a = (Wb sin (alfa) - Fg - Wa)/(ma + mb)" );
                        tampilan27.setText ( "a = (mb*(sin(alfa) - uk mb cos(alfa) - ma)*g/(ma + mb)" );
                        tampilan28.setText ( "Tegangan tali T = ma (g+a)" );
                        tampilan29.setText ( "" );
                        aa = (Q - Z)  / D;
                        TT = mama*(gg+aa);
                        tampilan30.setText ( "a = " + df.format ( aa ) + "m/ss" );
                        tampilan31.setText ( "" );
                        tampilan32.setText ( "T = " + df.format ( TT ) + " N" );
                        tampilan33.setText ( "" );

                    } else

                    if (B1 < P1){
                        tampilan22.setText ( "Seandainya akan bergerak ki kanan" );
                        tampilan23.setText ( "gaya penggerak  ke kanan benda menggantung ma*g = "+df.format ( B1 ) + "N" );
                        tampilan24.setText (  "gaya penahan = mb*g(sin(alfa)+ us cos(alfa))= "+df.format ( P1 ) + "N" );
                        tampilan25.setText  ( "karena gaya penggerak ke kanan tidak lebih dari gaya sesek statik maksimum, BENDA TIDAK BERGERAK" );
                        tampilan26.setText ( "" );
                        TT = mama*gg;
                        tampilan27.setText ( "Seandainya akan bergerak ki kiri" );
                        tampilan28.setText ( "gaya penggerak benda ke kiri  mb g sin(alfa)  "+df.format ( Q ) + "N" );
                        tampilan29.setText (  "gaya penahan = mb*g + ma g us cos(alfa))= "+df.format ( Z1 ) + "N" );
                        tampilan30.setText ( "karena  mb g sin(alfa) <  g (ma + us mb cos (alfa))  " );
                        tampilan31.setText ( ") maka BENDA TIDAK BERGERAK " );
                        tampilan32.setText ( "Tegangan tali T = ma*g" );
                        tampilan33.setText ( "T = " + df.format ( TT ) + " N" );

   }} else
// Asumsi ke dua OK

//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
           if
            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
              !mb.getText ( ).toString ( ).equals ( "" ) &&
               !g.getText ( ).toString ( ).equals ( "" )&&
            !alfa.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                            aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                              gg = Double.parseDouble ( g.getText ( ).toString ( ) );



                        tampilan1.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                        tampilan2.setText ( "benda mb tergantung dan benda ma pada bidang miring LICIN");
                        deg = 0.017444 * aalf;
                        sin = Math.sin ( deg );
                        cos = Math.cos ( deg );
                        A = mama*sin;
                        B = mbmb*sin;
                        D = mama + mbmb;

                        if (mbmb > A) {

                            tampilan3.setText ( "karena mb > ma sin(alfa) maka mb BERGERAK TURUN " );
                            tampilan4.setText ( "a = jumlah F / jumlah m   " );
                            tampilan5.setText ( "a = Wb - (Wa sin(alfa)/(ma + mb)" );
                            tampilan6.setText ( "a = (mb - ma*(sin(alfa) )*g/(ma + mb)" );

                            aa = (mbmb - A) * gg / D;

                            TT = mbmb*(gg-aa);
                            tampilan7.setText ( "T = mb (g - a)" );
                            tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                            tampilan10.setText ( "T = " + df.format ( TT ) + "N" );
                        }


                        if (A > mbmb) {
                            tampilan3.setText ( "karena ma sin(alfa) >  mb  maka mb BERGERAK NAIK " );
                            tampilan4.setText ( "a = jumlah F / jumlah m " );
                            tampilan5.setText ( "a = (Wa -  Wb)/(ma + mb)" );
                            tampilan6.setText ( "a = (ma*(sin(alfa) -  - mb)*g/(ma + mb)" );

                            aa = (A - mbmb) * gg / D;
                            TT = mbmb*(gg+aa);
                            tampilan7.setText ( "T = mb (g + a)" );
                            tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                            tampilan10.setText ( "T = " + df.format ( TT ) + "N" );
                        }

                        // atas dan bawah ini masih satu input dengan pengandaian berbeda
                        tampilan10.setText ( "sistem dua benda dihubungkan melalui tali dan katrol");
                        tampilan11.setText ( "benda ma tergantung dan benda mb pada bidang miring LICIN");
                        deg = 0.017444 * aalf;
                        sin = Math.sin ( deg );
                        cos = Math.cos ( deg );

                        if (mama > B) {

                            tampilan12.setText ( "karena ma > mb (sin(alfa) maka ma BERGERAK TURUN " );
                            tampilan13.setText ( "a = jumlah F / jumlah m   " );
                            tampilan14.setText ( "a = Wa - (Wb sin(alfa)/(ma + mb)" );
                            tampilan15.setText ( "a = (ma - mb*(sin(alfa))*g/(ma + mb)" );

                            aa = (mama -  B ) * gg / D;
                            TT = mama*(gg-aa);
                            tampilan16.setText ( "T = ma (g - a)" );
                            tampilan17.setText ( "a = " + df.format ( aa ) + "m/ss" );
                            tampilan19.setText ( "T = " + df.format ( TT ) + "N" );
                        }

                        if (B > mama) {
                            tampilan12.setText ( "karena  mb sin(alfa) >  ma;   maka ma BERGERAK NAIK " );
                            tampilan13.setText ( "a = jumlah F / jumlah m " );
                            tampilan14.setText ( "a = (Wb sin (alfa)  - Wa)/(ma + mb)" );
                            tampilan15.setText ( "a = (mb*(sin(alfa)  - ma)*g/(ma + mb)" );

                            aa = (B - mama) * gg / D;

                            TT = mama*(gg+aa);
                            tampilan16.setText ( "T = ma (g + a)" );
                            tampilan17.setText ( "a = " + df.format ( aa ) + "m/ss" );
                            tampilan19.setText ( "T = " + df.format ( TT ) + "N" );
                        }

//ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ


 } else

                            if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                    !mb.getText ( ).toString ( ).equals ( "" ) &&
                                    !g.getText ( ).toString ( ).equals ( "" )) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                      if (  mbmb < mama) {
                    tampilan1.setText ( " KEMUNGKINAN PERTAMA " );
                    tampilan2.setText ( " Sistem dua benda dihubungkan melalui tali dan katrol, " +
                            "benda ma dan mb tergantung, ma > mb" );
                    tampilan3.setText ( " F = ma " );
                    tampilan4.setText ( " Gaya penggerak adalah selisih berat dua benda, sedangkan massa adalah jumlah massa dua benda " );
                    tampilan5.setText ( " Sehingga a = (ma - mb) * g/(ma + mb) " );
                          aa = (mama-mbmb) * gg / (mama + mbmb);
                          TT = mama*(gg - aa);
                    tampilan6.setText ( " T = ma (g - a))" );
                    tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                    tampilan9.setText ( "T = " + df.format ( TT ) + "N" );


                } else if
                (mbmb > mama ) {

                          tampilan1.setText ( " KEMUNGKINAN PERTAMA " );
                          tampilan2.setText ( " Sistem dua benda dihubungkan melalui tali dan katrol, " +
                                  "benda ma dan mb tergantung, ma < mb" );
                          tampilan3.setText ( " F = ma " );
                          tampilan4.setText ( " Gaya penggerak adalah selisih berat dua benda, sedangkan massa adalah jumlah massa dua benda " );
                          tampilan5.setText ( " Sehingga a = (mb - ma) * g/(ma + mb) " );
                          aa = (mbmb - mama) * gg / (mama + mbmb);
                          TT = mbmb * (gg - aa);
                          tampilan6.setText ( " T = mb (g - a))" );
                          tampilan8.setText ( "a = " + df.format ( aa ) + "m/ss" );
                          tampilan9.setText ( "T = " + df.format ( TT ) + "N" );


                          tampilan12.setText ( " KEMUNGKINAN KEDUAA " );
                          tampilan13.setText ( " Sistem dua benda dihubungkan melalui tali dan katrol, " +
                                  "benda ma di atas meja licin dan mb tergantung " );
                          tampilan14.setText ( " F = m a " );
                          tampilan15.setText ( " Gaya penggerak adalah, berah benda yang tergantung, sedangkan massa adalah jumlah massa dua benda " );
                          tampilan16.setText ( " Sehingga a =  mb * g/(ma + mb) " );
                          aa = mbmb * gg / (mama + mbmb);
                          TT = mbmb * (gg - aa);
                          tampilan17.setText ( " T = mb (g - a))" );
                          tampilan19.setText ( "a = " + df.format ( aa ) + "m/ss" );
                          tampilan20.setText ( "T = " + df.format ( TT ) + "N" );

                          tampilan22.setText ( " KEMUNGKINAN KETIGA " );
                          tampilan23.setText ( " Sistem dua benda dihubungkan melalui tali dan katrol, " +
                                  "benda mb di atas meja licin dan ma tergantung " );
                          tampilan24.setText ( " F = m a " );
                          tampilan25.setText ( " Gaya penggerak adalah, berah benda yang tergantung, sedangkan massa adalah jumlah massa dua benda " );
                          tampilan26.setText ( " Sehingga a =  ma * g/(ma + mb) " );
                          aa = mama * gg / (mama + mbmb);
                          TT = mama * (gg - aa);
                          tampilan27.setText ( " T = ma (g - a))" );
                          tampilan29.setText ( "a = " + df.format ( aa ) + "m/ss" );
                          tampilan30.setText ( "T = " + df.format ( TT ) + "N" );





       } else if
              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !mb.getText ( ).toString ( ).equals ( "" ) &&
                 !g.getText ( ).toString ( ).equals ( "" )&&
                !us.getText ( ).toString ( ).equals ( "" )&&
                !uk.getText ( ).toString ( ).equals ( "" )) {
                          mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                          ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                          usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                          mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                            gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                            " benda ma dimeja kasar dan mb tergantung," );
                    aa = (mbmb-(mama * usus) )* gg / (mama + mbmb);
if ( aa > 0 ) {
           aa = (mbmb - (mama * ukuk)) * gg / (mama + mbmb);
           TT = mbmb * (gg - aa);
    tampilan2.setText ( " T = mb(g - a);  a = (mb - uk*ma)*g/(ma + mb)" );
    tampilan3.setText ( "a = " + df.format ( aa ) + "m/ss" );
    tampilan5.setText ( "T = " + df.format ( TT ) + "N" );
} else
    tampilan6.setText ( " 0 > (mbmb-(mama * usus) )* gg / (mama + mbmb) benda tidak bergerak" );

      tampilan8.setText ( " sistem dua benda dihubungkan melalui tali dan katrol," +
                            " benda mb dimeja kasar dan ma tergantung," );
                          aa = (mama-(mbmb * usus) )* gg / (mama + mbmb);
    if ( aa > 0) {

        aa = (mama - (mbmb * ukuk)) * gg / (mama + mbmb);
        TT = mama * (gg - aa);
        tampilan9.setText ( "T = ma(g - a);  a = (mb - uk*ma)*g/(ma + mb)" );
        tampilan10.setText ( "a = " + df.format ( aa ) + "m/ss" );
        tampilan11.setText ( "T = " + df.format ( TT ) + "N" );
    } else
        tampilan13.setText ( " 0 > (mama-(mbmb * usus) )* gg / (mama + mbmb) benda tidak bergerak" );


    } else if
           ( !ma.getText ( ).toString ( ).equals ( "" ) &&
             !vo.getText ( ).toString ( ).equals ( "" ) &&
              !g.getText ( ).toString ( ).equals ( "" )&&
           !alfa.getText ( ).toString ( ).equals ( "" )&&
              !r.getText ( ).toString ( ).equals ( "" )) {
                             mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                             vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                             aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                               rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    tampilan1.setText ( "  Tegangan tali dari benda yang diputar vertikal" );
                    deg = 0.017444 * aalf;
                    cos = Math.cos ( deg );
                    v12 = Math.pow(vovo,2);
                    result = mama*gg*(v12/(rr*gg) + cos);
                    tampilan2.setText ( "T = m g (v^2 /rg + cos(alfa))" );
                    tampilan3.setText ( " T =" + df.format ( result ) + "N" );

    } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !vo.getText ( ).toString ( ).equals ( "" ) &&
                !r.getText ( ).toString ( ).equals ( "" )) {
                           mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                           vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                             rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( "   Tegangan tali dari benda yang diputar horisontal" );
                         v12 = Math.pow(vovo,2);
                      result = mama*v12/rr;
                    tampilan2.setText ( "T = m v^2 /r" );
                    tampilan3.setText ( " T =" + df.format ( result ) + "N" );

     } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
               !ac.getText ( ).toString ( ).equals ( "" ) &&
                !g.getText ( ).toString ( ).equals ( "" )) {
                               mama = Double.parseDouble ( ma.getText ( ).toString  ( ) );
                               acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                               gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                    tampilan1.setText ( "  Tegangan tali lift ke atas" );
                    result = mama* (gg + acc);
                    tampilan2.setText ( "T = m ( g + a)" );
                    tampilan3.setText ( " T =" + df.format ( result ) + "N" );
                    tampilan5.setText ( "  Tegangan tali lift ke bawah" );
                    result = mama* (gg - acc);
                    tampilan6.setText ( "T = m ( g - a)" );
                    tampilan7.setText ( " T =" + df.format ( result ) + "N");
           }}} }
        );

  btnFg.setOnClickListener ( new View.OnClickListener ( ) {
                        @Override
            public void onClick ( final View view ) {
                            DecimalFormat df = new DecimalFormat ( "#.###" );

                            if
                            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                    !mb.getText ( ).toString ( ).equals ( "" ) &&
                                    !g.getText ( ).toString ( ).equals ( "" ) &&
                                    !ac.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                                tampilan1.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda ma dimeja kasar dan mb tergantung," );
                                Fg = mbmb * gg - acc * (mama + mbmb);

                                tampilan2.setText ( " F - Fg = m*a,   F = mb*g " );
                                tampilan3.setText ( "Fg = mb*g - (ma + mb)*a" );
                                tampilan5.setText ( "Fg = " + df.format ( Fg ) + " N" );


                                tampilan7.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda mb dimeja kasar dan ma tergantung," );
                                Fg = mama * gg - acc * (mama + mbmb);
                                tampilan8.setText ( " F - Fg = m*a,   F = ma*g " );
                                tampilan9.setText ( "Fg = ma*g - (ma + mb)*a" );
                                tampilan11.setText ( "Fg = " + df.format ( Fg ) + " N" );


                            } else if
                            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                            !mb.getText ( ).toString ( ).equals ( "" ) &&
                                            !g.getText ( ).toString ( ).equals ( "" ) &&
                                            !vt.getText ( ).toString ( ).equals ( "" ) &&
                                            !t.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                                tampilan1.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda ma dimeja kasar dan mb tergantung," );
                                aa = vtvt / tt;
                                Fg = mbmb * gg - aa * (mama + mbmb);

                                tampilan2.setText ( " F - Fg = m*a,   F = mb*g " );
                                tampilan3.setText ( "Fg = mb*g - (ma + mb)*a" );
                                tampilan4.setText ( "  a = Vt/t " );
                                tampilan6.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan7.setText ( "Fg = " + df.format ( Fg ) + " N" );


                                tampilan10.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda mb dimeja kasar dan ma tergantung," );
                                Fg = mama * gg - aa * (mama + mbmb);
                                tampilan12.setText ( " F - Fg = m*a,   F = ma*g " );
                                tampilan13.setText ( "Fg = ma*g - (ma + mb)*a" );
                                tampilan14.setText ( "  a = Vt/t " );
                                tampilan16.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan17.setText ( "Fg = " + df.format ( Fg ) + " N" );

                            } else if
                            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                            !mb.getText ( ).toString ( ).equals ( "" ) &&
                                            !g.getText ( ).toString ( ).equals ( "" ) &&
                                            !t.getText ( ).toString ( ).equals ( "" ) &&
                                            !s.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                                tampilan1.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda ma dimeja kasar dan mb tergantung," );
                                aa = 2 * ss / (tt * tt);
                                Fg = mbmb * gg - aa * (mama + mbmb);

                                tampilan2.setText ( " F - Fg = m*a,   F = mb*g " );
                                tampilan3.setText ( "Fg = mb*g - (ma + mb)*a" );
                                tampilan4.setText ( " s = 0,5 a * t^2;   a = 2*s/t^2 " );
                                tampilan6.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan7.setText ( "Fg = " + df.format ( Fg ) + " N" );


                                tampilan10.setText ( "Sistem dua benda dihubungkan melalui tali dan katrol," +
                                        " benda mb dimeja kasar dan ma tergantung," );

                                Fg = mama * gg - aa * (mama + mbmb);
                                tampilan12.setText ( " F - Fg = m*a,   F = ma*g " );
                                tampilan13.setText ( "Fg = ma*g - (ma + mb)*a" );
                                tampilan14.setText ( " s = 0,5 a * t^2;   a = 2*s/t^2  " );
                                tampilan16.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan17.setText ( "Fg = " + df.format ( Fg ) + " N" );

                            } else if
                            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                            !ac.getText ( ).toString ( ).equals ( "" ) &&
                                            !g.getText ( ).toString ( ).equals ( "" ) &&
                                            !teta.getText ( ).toString ( ).equals ( "" ) &&
                                            !F.getText ( ).toString ( ).equals ( "" ) ) {
                                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                  acc = Double.parseDouble ( ac.getText ( ).toString ( ) );
                                teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                                   FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya membentuk sudut teta, " +
                                        "dan terdapat gaya gesek" );
                                deg = 0.017444 * teeta;
                                sin = Math.sin ( deg );
                                cos = Math.cos ( deg );
                                tampilan3.setText ( "F cos (teta)- Fg = m*a" );
                                tampilan4.setText ( "Fg = F cos (teta)- m*a" );
                                Fg = FF * cos - mama * acc;
                                tampilan6.setText ( "Fg = " + df.format ( Fg ) + " N" );
           } else if
                    ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                      !vt.getText ( ).toString ( ).equals ( "" ) &&
                    !teta.getText ( ).toString ( ).equals ( "" ) &&
                       !F.getText ( ).toString ( ).equals ( "" ) &&
                       !t.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya membentuk sudut teta, " + "dan terdapat gaya gesek" );
                                deg = 0.017444 * teeta;
                                sin = Math.sin ( deg );
                                cos = Math.cos ( deg );
                                tampilan3.setText ( "F cos (teta)- Fg = m*a" );
                                tampilan4.setText ( "Fg = F cos (teta)- m*a" );
                                tampilan5.setText ( "a = Vt/t" );
                                aa = vtvt / tt;
                                Fg = FF * cos - mama * aa;
                                tampilan7.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan8.setText ( "Fg = " + df.format ( Fg ) + " N" );
           } else if
             ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !s.getText ( ).toString ( ).equals ( "" ) &&
             !teta.getText ( ).toString ( ).equals ( "" ) &&
                !F.getText ( ).toString ( ).equals ( "" ) &&
                !t.getText ( ).toString ( ).equals ( "" ) ) {
                                 mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                   ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                                   FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                   tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                                tampilan1.setText ( " Benda berada pada bidang datar ditarik gaya membentuk " +
                                        "sudut teta, dan terdapat gaya gesek" );
                                deg = 0.017444 * teeta;
                                sin = Math.sin ( deg );
                                cos = Math.cos ( deg );
                                tampilan3.setText ( "F cos (teta)- Fg = m*a" );
                                tampilan4.setText ( "Fg = F cos (teta)- m*a" );
                                tampilan5.setText ( "a = 2 * s/t^2" );
                                aa = 2 * ss / (tt * tt);
                                Fg = FF * cos - mama * aa;
                                tampilan7.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan8.setText ( "Fg = " + df.format ( Fg ) + " N" );
         } else if
                ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                   !F.getText ( ).toString ( ).equals ( "" ) &&
                  !ac.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                acc = Double.parseDouble ( ac.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya sejajar bidang datar, " +
                                        "dan terdapat gaya gesek" );
                                deg = 0.017444 * teeta;
                                sin = Math.sin ( deg );
                                cos = Math.cos ( deg );
                                tampilan3.setText ( "F- Fg = m*a" );
                                tampilan4.setText ( "Fg = F- m*a" );
                                Fg = FF * cos - mama * acc;
                                tampilan6.setText ( "Fg = " + df.format ( Fg ) + " N" );

         } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                      !F.getText ( ).toString ( ).equals ( "" ) &&
                      !g.getText ( ).toString ( ).equals ( "" ) &&
                     !uk.getText ( ).toString ( ).equals ( "" ) &&
                     !us.getText ( ).toString ( ).equals ( "" ) ) {
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                    ukuk = Double.parseDouble ( uk.getText ( ).toString ( ) );
                                    usus = Double.parseDouble ( us.getText ( ).toString ( ) );
                                    FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya sejajar bidang datar, dan terdapat gaya gesek" );
                                Fg = usus * mama * gg;
                                if ( Fg > FF ) {
                                    Fg = FF;
                                    tampilan2.setText ( "gaya gesek statik maksimum lebih besar dari pada gaya tarik atau dorong, sehingga benda diam dan gaya gesek statik = gaya tarik atau dorong " );
                                    tampilan3.setText ( "Fg = " + df.format ( Fg ) + " N" );
                                } else if ( Fg < FF ) {

                                    Fg = ukuk * mama * gg;
                                    tampilan2.setText ( "gaya sesek statik lebih kecil dari pada gaya tarik atau dorong, sehingga benda bergerak; jadi yang ada gaya gesek kinetik" );
                                    tampilan3.setText ( "gaya sesek kinetik Fg = uk*m*g" );
                                    tampilan4.setText ( "Fg = " + df.format ( Fg ) + " N" );
                                }
                   } else if ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                               !mb.getText ( ).toString ( ).equals ( "" ) &&
                                !F.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda B berada pada bidang datar LICIN  ditarik gaya ke kanan sejajar bidang datar, benda A di atas benda B tetap diam" );
                                aa = FF / (mama + mbmb);
                                Fg = mama * aa;
                                tampilan2.setText ( "gaya sesek statik benda A searah gaya yaitu ke kanan, besarnya: " );
                                tampilan3.setText ( "Hitung percepatan sistem: a = F /(ma +mb)" );
                                tampilan4.setText ( "gaya gesek = gaya untuk mempercepat A, yaitu  Fg = ma * a" );

                                tampilan5.setText ( "Fg = " + df.format ( Fg ) + " N" );

                                tampilan6.setText ( "" );
                                tampilan7.setText ( "Atau Kasus" );
                                Fg = mbmb * aa;
                                tampilan8.setText ( "benda A berada pada bidang datar LICIN ditarik gaya ke kanan sejajar bidang datar, benda B di atas benda A tetap diam " );
                                tampilan9.setText ( "gaya sesek statik benda B searah gaya yaitu ke kanan, besarnya: " );
                                tampilan10.setText ( "Hitung percepatan sistem: a = F /(ma +mb)" );
                                tampilan11.setText ( "gaya gesek = gaya untuk mempercepat B, yaitu  Fg = mb * a" );
                                tampilan12.setText ( "Fg = " + df.format ( Fg ) + " N" );


           } else if
                            ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                               !F.getText ( ).toString ( ).equals ( "" ) &&
                              !vt.getText ( ).toString ( ).equals ( "" ) &&
                               !t.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya " +
                                        "sejajar bidang datar, dan terdapat gaya gesek" );
                                deg = 0.017444 * teeta;
                                sin = Math.sin ( deg );
                                cos = Math.cos ( deg );
                                tampilan3.setText ( "F- Fg = m*a" );
                                tampilan4.setText ( "Fg = F- m*a" );
                                tampilan5.setText ( "a =vt/t" );
                                aa = vtvt / tt;
                                Fg = FF * cos - mama * aa;
                                tampilan7.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan8.setText ( "Fg = " + df.format ( Fg ) + " N" );
            } else if
                                          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                            !vo.getText ( ).toString ( ).equals ( "" ) &&
                                             !t.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                                tampilan1.setText ( " Benda benda meluncur di lantai kasar dengan " +
                                        "kecepatan awal vo setelah waktu  t benda berhenti ");


                                tampilan2.setText ( " vt = vo + at" );
                                tampilan3.setText ( " a = (vt - vo)/t, vt = 0" );
                                tampilan4.setText ( " a = -vo/t" );
                                tampilan5.setText ( " Fg = m a " );

                                aa = - vovo / tt;
                                Fg = mama * aa;
                                tampilan7.setText ( " a = " + df.format ( aa ) + " m/ss" );
                                tampilan8.setText ( " Fg = " + df.format ( Fg ) + " N" );

                            } else if
                                          ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                             !F.getText ( ).toString ( ).equals ( "" ) &&
                                             !s.getText ( ).toString ( ).equals ( "" ) &&
                                             !t.getText ( ).toString ( ).equals ( "" ) ) {
                                mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );


                                tampilan1.setText ( "benda berada pada bidang datar ditarik gaya sejajar bidang datar, " + "dan terdapat gaya gesek" );

                                tampilan3.setText ( "F - Fg = m*a" );
                                tampilan4.setText ( "Fg = F - m*a" );
                                tampilan5.setText ( "a =2*s/t^2" );
                                aa = 2 * ss / (tt * tt);
                                Fg = FF - (mama * aa);
                                tampilan7.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                tampilan8.setText ( "Fg = " + df.format ( Fg ) + " N" );

                            } else if

                                      ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                        !ac.getText ( ).toString ( ).equals ( "" ) &&
                                        !alfa.getText ( ).toString ( ).equals ( "" ) &&
                                        !g.getText ( ).toString ( ).equals ( "" ) ) {
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                    aa = Double.parseDouble ( ac.getText ( ).toString ( ) );
                                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );

                                    tampilan1.setText ( "   benda di bidang miring dengan sudut alfa  meluncur dengan gesekan" );
                                    tampilan2.setText ( "  Fg =  m*g*sin(alfa)- m*a" );

                                    deg = 0.017444 * aalf;
                                    sin = Math.sin ( deg );
                                    cos = Math.cos ( deg );
                                    Fg = mama * gg * sin - mama * aa;
                                    tampilan4.setText ( "Fg = " + df.format ( Fg ) + " N" );

                                } else if
                                ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                                !vt.getText ( ).toString ( ).equals ( "" ) &&
                                                !g.getText ( ).toString ( ).equals ( "" ) &&
                                                !alfa.getText ( ).toString ( ).equals ( "" ) &&
                                                !t.getText ( ).toString ( ).equals ( "" ) ) {
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                    vtvt = Double.parseDouble ( vt.getText ( ).toString ( ) );
                                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                   aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );


                                    tampilan1.setText ( "   benda di bidang miring dengan sudut alfa  meluncur dengan gesekan" );
                                    tampilan2.setText ( "  Fg =  m*g*sin(alfa)- m*a" );
                                    tampilan3.setText ( "   a = vt/t" );
                                    deg = 0.017444 * aalf;
                                    sin = Math.sin ( deg );
                                    cos = Math.cos ( deg );
                                    aa = vtvt / tt;
                                    Fg = mama * gg * sin - mama * aa;
                                    tampilan5.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                    tampilan6.setText ( "Fg = " + df.format ( Fg ) + " N" );

                     } else if
                                               ( !t.getText ( ).toString ( ).equals ( "" ) &&
                                                !g.getText ( ).toString ( ).equals ( "" ) &&
                                                !ma.getText ( ).toString ( ).equals ( "" ) &&
                                                !alfa.getText ( ).toString ( ).equals ( "" ) &&
                                                !s.getText ( ).toString ( ).equals ( "" ) ) {
                                    tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                    ss = Double.parseDouble ( s.getText ( ).toString ( ) );
                                    aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                    gg = Double.parseDouble ( g.getText ( ).toString ( ) );
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );


                                    tampilan1.setText ( "   benda di bidang miring dengan sudut alfa  meluncur dengan gesekan" );
                                    tampilan2.setText ( "  Fg =  m*g*sin(alfa)- m*a" );
                                    tampilan3.setText ( "   a = 2*s/t^2" );
                                    deg = 0.017444 * aalf;
                                    sin = Math.sin ( deg );
                                    cos = Math.cos ( deg );
                                    aa = 2 * ss / (tt * tt);
                                    Fg = mama * gg * sin - mama * aa;
                                    tampilan5.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                    tampilan6.setText ( "Fg = " + df.format ( Fg ) + " N" );

                                } else if
                                ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                                                !mb.getText ( ).toString ( ).equals ( "" ) &&
                                                !F.getText ( ).toString ( ).equals ( "" ) ) {
                                    mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                                    mbmb = Double.parseDouble ( mb.getText ( ).toString ( ) );
                                    FF = Double.parseDouble ( F.getText ( ).toString ( ) );


                                    tampilan1.setText ( "   benda A diatas benda B, B ditarik gaya F sehingga A tidak jatuh" );
                                    tampilan2.setText ( " a = F/(ma +mb); gaya gesek A dan B = ma * a" );

                                    aa = FF / (mama + mbmb);

                                    Fg = mama * aa;
                                    tampilan3.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                    tampilan4.setText ( "Fg = " + df.format ( Fg ) + " N" );

                                    tampilan6.setText ( "   benda B diatas benda A, A ditarik gaya F sehingga B tidak jatuh" );
                                    tampilan7.setText ( " a = F/(ma +mb); gaya gesek A dan B = mb * a" );

                                    aa = FF / (mama + mbmb);

                                    Fg = mbmb * aa;
                                    tampilan8.setText ( "a  = " + df.format ( aa ) + " m/ss" );
                                    tampilan9.setText ( "Fg = " + df.format ( Fg ) + " N" );



                            }
                        }}
        );

  btnR.setOnClickListener ( new View.OnClickListener ( ) {
     @Override
   public void onClick ( final View view ) {

     DecimalFormat df = new DecimalFormat ( "#.###" );

     if
       ( !vo.getText ( ).toString ( ).equals ( "" ) &&
       !alfa.getText ( ).toString ( ).equals ( "" )&&
          !g.getText ( ).toString ( ).equals ( "" )) {
                        vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                        aalf = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        gg = Double.parseDouble ( g.getText ( ).toString ( ) );


                    tampilan1.setText ( " Jari-jari  kelengkungan diizinkan agar mobil tidak terperosok)" );
                    deg = 0.017444 * aalf;
                    sin = Math.sin ( deg );
                    cos = Math.cos ( deg );
                    v12 = Math.pow ( vovo, 2 );
                    result = v12 * cos / gg * sin;
                    tampilan2.setText ( "R = v^2 cos(alfa)/g sin(alfa)" );
                    tampilan3.setText ( "R =" + df.format ( result ) + "m" );

   }else if
              ( !ma.getText ( ).toString ( ).equals ( "" ) &&
                !vo.getText ( ).toString ( ).equals ( "" ) &&
                 !F.getText ( ).toString ( ).equals ( "" )) {
                            mama = Double.parseDouble ( ma.getText ( ).toString ( ) );
                            vovo = Double.parseDouble ( vo.getText ( ).toString ( ) );
                              FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                         v12 = Math.pow ( vovo, 2 );
                      result = mama * v12 /FF;
                    tampilan2.setText ( "R = m v^ 2 /F" );
                    tampilan3.setText ( "R =" + df.format ( result ) + "m" );
                }
            }
        }
        );



        btnclear.setOnClickListener ( new View.OnClickListener ( ) {
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
                tampilan27.setText ( "" );
                tampilan28.setText ( "" );
                tampilan29.setText ( "" );
                tampilan30.setText ( "" );
                tampilan31.setText ( "" );
                tampilan32.setText ( "" );
                tampilan33.setText ( "" );
                tampilan34.setText ( "" );
                tampilan35.setText ( "" );
                tampilan36.setText ( "" );
                tampilan37.setText ( "" );
                tampilan38.setText ( "" );
                tampilan39.setText ( "" );
                tampilan40.setText ( "" );

                r.setText ( "" );
                s.setText ( "" );
                vo.setText ( "" );
                vt.setText ( "" );
                g.setText ( "" );
                ac.setText ( "" );
                ma.setText ( "" );
                mb.setText ( "" );
                T.setText ( "" );
                t.setText ( "" );
                F.setText ( "" );
                alfa.setText ( "" );
                teta.setText ( "" );
                N.setText ( "" );
                uk.setText ( "" );
                us.setText ( "" );


            }
        } );
    }
}






