
package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class FisikaInti extends AppCompatActivity {
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

    private EditText n1,n2,n3,n4;

    private Double n1n1,n2n2,n3n3,n4n4,E,p,dp,Et,pg,f,E1,E2,E3,E4,dEa,dEb,RE,rr,Rr,v,Rv;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_fisika_inti );

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



        n1= findViewById ( R.id.in_n1 );
        n2 = findViewById ( R.id.in_n2 );
        n3 = findViewById ( R.id.in_n3 );
        n4 = findViewById ( R.id.in_n4 );




        Button btnE = findViewById ( R.id.btn_E );
        Button btnEt = findViewById ( R.id.btn_Et );
        Button btnRE = findViewById ( R.id.btn_RE );
        Button btnr = findViewById ( R.id.btn_r );
        Button btnRr = findViewById ( R.id.btn_Rr );
        Button btnPG = findViewById ( R.id.btn_PG );
        Button btnf = findViewById ( R.id.btn_f );
        Button btnp = findViewById ( R.id.btn_p );
        Button btndp = findViewById ( R.id.btn_dp );
        Button btnv = findViewById ( R.id.btn_v );
        Button btnRv = findViewById ( R.id.btn_Rv );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnEi = findViewById ( R.id.btn_Ei );
        Button btnRa = findViewById ( R.id.btn_Ra );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator ini digunakan untuk menghitung: :" );
                tampilan2.setText ( "1. Energi elektron pada kulit tertentu n, dalam hal ini gunakan n1; contoh n1 = 3 artinya n = 3" );
                tampilan3.setText ( "2. Energi foton terpancar " );
                tampilan4.setText ( "3. Perbandingan energi trasisi n4 ke n3 dengan n2 ke n1; contoh n4 = 5, n3 = 2, n2 = 4, n1 = 3" );
                tampilan5.setText ( "artinya perbandingan energi yang dilepas elektron yang pindah kulit n = 5 ke n = 3, dibanding elektron yang pindah dari kulit n = 4 ke n =3" );
                tampilan6.setText ( "4. Panjang gelombang foton terpancar dari transisi n2 ke n1; n2 adalah posisi kulit mula-mula nilainya lebih tinggi daripada n1" );
                tampilan7.setText ( "5. Frekuensi foton jelmaan transisi n2 ke n1" );
                tampilan8.setText ( "6. Momentum elektron dalam kulit n" );
                tampilan9.setText ( "7. Perubahan momentum saat elektron pindah kulit " );
                tampilan10.setText ( "8. Jari-jari lintasan elektron" );
                tampilan11.setText ( "9. Rasio lintasan antara n1 dan n2" );
                tampilan12.setText ( "10. Laju elektron di kulit n; gunakan n1" );
                tampilan13.setText ( "11. Perbandingan laju elektron di n1 dan n2" );
                tampilan14.setText ( "");
                tampilan15.setText ( "13.SELAMAT BELAJAR" );

            }} );

        btnE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );

                if
                ( n1n1!=0  ) {
                    tampilan1.setText ( " energi elektron di kulit n" );
                    tampilan2.setText ( " En = -13,6/n^2    ev" );

                    E =-13.67/Math.pow(n1n1,2);
                    tampilan3.setText ( "E = " + E.doubleValue () + " ev" );
                    E = E*1.6*Math.pow(10,-19);
                    tampilan5.setText ( "E = " + E.doubleValue () + " joule" );
                }}});
        btnEt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0  ) {
                    tampilan1.setText ( " energi foton terpancar akibat elektron melompat dari n2 ke n1" );
                    tampilan2.setText ( " dE =E2 -E1 = -13,6(1/n2^2 -1/n1^2)   ev" );

                    E1 =-13.67/Math.pow(n1n1,2);
                    E2 =-13.67/Math.pow(n2n2,2);
                    Et = E2 - E1;

                    tampilan3.setText ( "Et = " + Et.doubleValue () + " ev" );
                    Et = Et*1.6*Math.pow(10,-19);
                    tampilan5.setText ( "Et = " + Et.doubleValue () + " joule" );
                }}});
        btnRE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );
                n3n3 = Double.parseDouble (n3.getText ( ).toString ( ) );
                n4n4 = Double.parseDouble ( n4.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0&&n3n3!=0&&n4n4!=0  ) {
                    tampilan1.setText ( " Perbandingan energi foton terpancar akibat elektron melompat dari n4 ke n3 dan n2 ke n1" );
                    tampilan2.setText ( " dEa =E2 -E1 = -13,6(1/n2^2 -1/n1^2)   ev" );
                    tampilan3.setText ( " dEb =E4 -E3 = -13,6(1/n4^2 -1/n3^2)   ev,  walaupun dalam hal ini bisa jadi n3 = n2 atau n3 = n1" );
                    tampilan4.setText ( " RE = dEb/dEa" );

                    E1 =-13.67/Math.pow(n1n1,2);
                    E2 =-13.67/Math.pow(n2n2,2);

                    E3 =-13.67/Math.pow(n3n3,2);
                    E4 =-13.67/Math.pow(n4n4,2);

                    dEa = E2 - E1;
                    dEb = E4 - E3;
                RE = dEb/dEa;
                    tampilan5.setText ( "RE = " + RE.doubleValue () + "" );

                }}});
        btnr.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );

                if
                ( n1n1!=0 ) {
                    tampilan1.setText ( " Jari-jari orbit elektron pada kulit ke n;dinyatkan n1 = n" );
                    tampilan2.setText ( " r = 0,529 10^-10 x n^2" );

                    n1n1 = n1n1*n1n1;
                    rr = n1n1*5.29*Math.pow(10,-11);
                    tampilan4.setText ( "r = " + rr.doubleValue () + "m" );
                    rr = rr*Math.pow(10,10);
                    tampilan5.setText ( "r = " + df.format ( rr ) +"  Angstrum" );
                }}});
        btnRr.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0 ) {
                    tampilan1.setText ( " perbandingan Jari-jari orbit elektron pada kulit ke n2 dan n1" );
                    tampilan2.setText ( " r = 0,529 10^-10 x n^2" );

                    n1n1 = n1n1*n1n1;
                    n2n2 = n2n2*n2n2;
                    Rr = n2n2/n1n1;

                    tampilan4.setText ( "rn2/rn1 = " + df.format ( Rr ) +"  " );
                }}});
        btnPG.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0 ) {
                    tampilan1.setText ( " Panjang gelombang foton yang muncul apabila  elektron pindah kulit n2 ke n1" );
                    tampilan2.setText ( " 1/lamda = R (1/n1 -1/n2" );

                    n1n1 = 1/n1n1;
                    n2n2 = 1/n2n2;
                    pg = 1.097*Math.pow(10,7)*(n1n1-n2n2);
                    pg = 1/pg;

                    tampilan4.setText ( "panjang gelombang = " + pg.doubleValue () + "m" );
                }}});
        btnf.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0 ) {
                    tampilan1.setText ( " Frekuensi foton yang muncul apabila  elektron pindah kulit n2 ke n1" );
                    tampilan2.setText ( " 1/lamda = R (1/n1 -1/n2" );
                    tampilan3.setText ( " f = c/lamda" );

                    n1n1 = 1/n1n1;
                    n2n2 = 1/n2n2;
                    pg = 1.097*Math.pow(10,7)*(n1n1-n2n2);
                    pg = 1/pg;
                    f = 3*Math.pow(10,8)/pg;

                    tampilan4.setText ( "frekuensi = " + f.doubleValue () + "  Hz" );
                }}});
        btnp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );

                if
                ( n1n1!=0) {
                    tampilan1.setText ( " Momentum elektron dalam kulit n" );
                    tampilan2.setText ( " p = mvr = n h/2pi" );

                    p = n1n1*1.055732*Math.pow(10,-34);

                    tampilan4.setText ( "L = " + p.doubleValue () + "  Ns" );
                }}});
        btndp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0) {
                    tampilan1.setText ( " perubahan Momentum elektron bila pindah kulit n2 ke n1" );
                    tampilan2.setText ( " dp = (n2 - n1) h/2pi" );

                    dp =(n2n2 - n1n1)*1.055732*Math.pow(10,-34);

                    tampilan4.setText ( "dL = " + dp.doubleValue () + "  Ns" );
                }}});
        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );

                if
                ( n1n1!=0) {
                    tampilan1.setText ( " laju elektron pada kulit ke n; dinyatakan n1 = n" );
                    tampilan2.setText ( " v = nh/(2pi mr)" );
                    tampilan3.setText ( " r = 0,529 10^-10 x n^2" );

                    rr = Math.pow(n1n1,2)*5.29*Math.pow(10,-11);
                    v = n1n1*6.63*Math.pow(10,-34)/(6.28*9.1*Math.pow(10,-31)*rr);

                    tampilan4.setText ( "v = " + v.doubleValue () + "  m/s" );
                }}});
        btnRv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                n1n1 = Double.parseDouble ( n1.getText ( ).toString ( ) );
                n2n2 = Double.parseDouble ( n2.getText ( ).toString ( ) );

                if
                ( n1n1!=0&&n2n2!=0) {
                    tampilan1.setText ( " laju elektron pada kulit ke n" );
                    tampilan2.setText ( " v = nh/(2pi mr)" );
                    tampilan3.setText ( " r = 0,529 10^-10 x n^2" );
                    tampilan4.setText ( " tampak bahwa v berbading terbalik dengan n; sehingga v2/v1 = n1/n2" );
                    tampilan5.setText ( " berarti n makin besar laju makin kecil" );
                    Rv = n1n1/n2n2;
                    tampilan7.setText ( "v2/v1 = " + Rv.doubleValue () + " " );
                }}});
        btnEi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( FisikaInti.this , EnergiIkat.class );
                startActivity ( intent ); }
        } );
        btnRa.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
               Intent intent = new Intent ( FisikaInti.this , RadioAktif.class );
               startActivity ( intent ); }
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


                n1.setText ( "" );
                n2.setText ( "" );
                n3.setText ( "" );
                n4.setText ( "" );


            }
        } );
    }
}

