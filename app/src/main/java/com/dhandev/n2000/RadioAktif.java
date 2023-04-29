package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class RadioAktif extends AppCompatActivity {
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

    private EditText No, N, Po,P,  A,lm, t, T, mmo, mo, m, e1,e2,e3,e4,e5,e6;

    private Double NoNo, NN,AA, PoPo, PP, mmo2, lmlm,tt,TT , X, Y, Z, momo, mm, NA,e12,e22,e32,e42;
    private Double e52,e62;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_aktif);
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

        No = findViewById(R.id.in_No);
        N = findViewById(R.id.in_N);
        mmo = findViewById(R.id.in_mmo);
        A = findViewById(R.id.in_A);
        lm = findViewById(R.id.in_lamda);
        t = findViewById(R.id.in_t );
        T = findViewById(R.id.in_T );
        Po = findViewById(R.id.in_Po );
        P = findViewById(R.id.in_P );
        m = findViewById(R.id.in_m );
        mo = findViewById(R.id.in_mo );
        e1 = findViewById(R.id.in_e1 );
        e2 = findViewById(R.id.in_e2 );
        e3 = findViewById(R.id.in_e3 );
        e4 = findViewById(R.id.in_e4 );
        e5 = findViewById(R.id.in_e5 );
        e6 = findViewById(R.id.in_e6 );

        Button btnNo = findViewById ( R.id.btn_No );
        Button btnN = findViewById ( R.id.btn_N );
        Button btnmo = findViewById ( R.id.btn_mo );
        Button btnm = findViewById ( R.id.btn_m );
        Button btnP = findViewById ( R.id.btn_P );
        Button btnPo = findViewById ( R.id.btn_Po );
        Button btnlm = findViewById ( R.id.btn_lamda );
        Button btnt = findViewById ( R.id.btn_t );
        Button btninti = findViewById ( R.id.btninti );
        Button btnIkat = findViewById ( R.id.btnIkat );
        Button btnT = findViewById ( R.id.btn_T );
        Button btnclear = findViewById ( R.id.btnclear );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Radioaktivitas:" );
                tampilan2.setText ( " Variabel yang digunakan:" );
                tampilan3.setText ( " No : Jumlah inti awal, 10 pangkat ditulis kanan x 10P....." );
                tampilan4.setText ( " N : jumlah inti saat t, , 10 pangkat ditulis kanan x 10P...." );
                tampilan5.setText ( " t : selang waktu satuan adaptif terkait T, 10 pangkat ditulis kanan x 10P.... " );
                tampilan6.setText ( " T : waktu paruh satuan adaptif (sesuai soal), terkait t; 10 pangkat ditulis kanan x 10P...." );
                tampilan7.setText ( " lamda  : konstanta peluruhan" );
                tampilan8.setText ( " Po : aktivitas radioaktif awal, peluruhan persatuan waktu, satuan adaptif; 10 pangkat ditulis kanan x 10P...." );
                tampilan9.setText ( " P : aktivitas radioaktif saat t, peluruhan persatuan waktu, satuan adaptif; 10 pangkat ditulis kanan x 10P...."  );
                tampilan10.setText ( "A : nomor massa atom "  );
                tampilan11.setText ( " m : massa inti radioaktif saat t"  );
                tampilan12.setText ( " mo :masssa inti radioaktif saat awal"  );
                tampilan13.setText ( "mo/m = N/No = P/Po : perbandingan massa akhir terhadap massa awal atau perbandingan jumlah inti akhir terhadap jumlah inti awal atau perbandingan aktivitas akhir terhadap aktivitas awal"  );
                tampilan14.setText ( "Sebelum menggunakan kalkulator silakan tekan Nol " );
                tampilan15.setText ( "selanjutnya isikan variabel sesuai yang diketahui " );
            }} );

        btnNo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {


                DecimalFormat df = new DecimalFormat("#.###");

                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                        !e2.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble(N.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                   e22 = Double.parseDouble(e2.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No * 0,5^(t/T)" );
                    tampilan2.setText ( " No = N/0,5^(t/T)" );
                    tampilan3.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    NN = NN*Math.pow(10,e22);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    NoNo = NN/Y;
                    tampilan4.setText ( " Jumlah inti mula-mula, No = " + df.format ( NoNo ) + "" );
                    tampilan6.setText ( " Jumlah inti mula-mula, No = " + NoNo.doubleValue() + "" );
                }else
                if
                          (!lm.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                            !P.getText ( ).toString ( ).equals ( "" )   &&
                        !e3.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        lmlm = Double.parseDouble(lm.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                    e32 = Double.parseDouble(e3.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No * 0,5^(t/T)" );
                    tampilan2.setText ( " No = N/0,5^(t/T)" );
                    tampilan3.setText ( " N = P/lamda " );
                    tampilan4.setText ( " No = P/( lamda*0,5^(t/T))" );
                    tampilan5.setText ( " " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    PP = PP * Math.pow(10,e32);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    NoNo = PP/(lmlm*Y);
                    tampilan6.setText ( " Jumlah inti mula-mula, No = " + df.format ( NoNo ) + "" );
                    tampilan8.setText ( " Jumlah inti mula-mula, No = " + NoNo.doubleValue() + "" );

                }else
                if
                    (!lm.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                        !e2.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        lmlm = Double.parseDouble(lm.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        NN = Double.parseDouble(N.getText().toString());
                    e22 = Double.parseDouble(e2.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No exp(- lamda*t)" );
                    tampilan2.setText ( " No = N /exp(-lamda*t)" );
                    tampilan3.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    NN = NN*Math.pow(10,e22);
                    X = lmlm*tt;
                    Y = Math.exp(-X);
                    NoNo = NN/Y;
                    tampilan4.setText ( " exp(-lamda*t) = " + Y.doubleValue() + "" );
                    tampilan5.setText ( " Jumlah inti mula-mula = " + df.format ( NoNo ) + "" );
                    tampilan7.setText ( " Jumlah inti mula-mula = " + NoNo.doubleValue() + "" );

                }else
                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !A. getText ( ).toString ( ).equals ( "" )) {
                       momo = Double.parseDouble(mo.getText().toString());
                        AA = Double.parseDouble(A.getText().toString());
                    tampilan1.setText ( " No = mol * NA (bilangan Avogadro)" );
                    tampilan2.setText ( " No = (mo/A) * NA" );
                    tampilan3.setText ( "  " );
                    NA = 6.02*Math.pow(10,23);
                    X = momo/AA;
                    NoNo = X * NA;
                    tampilan4.setText ( " Bilangan Avogadro NA = 6,02 x 10 pangkat 23" );
                    tampilan5.setText ( " Jumlah inti mula-mula = " + df.format ( NoNo ) + "" );
                    tampilan6.setText ( " Jumlah inti mula-mula = " + NoNo.doubleValue() + "" );

                }}
        });
        btnN.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {


                DecimalFormat df = new DecimalFormat("#.###");

                if
                    (!No.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        NoNo = Double.parseDouble(No.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No * 0,5^(t/T)" );
                    tampilan2.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    NoNo = NoNo*Math.pow(10,e12);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    NN = NoNo*Y;
                    tampilan4.setText ( " Jumlah inti, No = " + df.format ( NN ) + "" );
                    tampilan6.setText ( " Jumlah inti, No = " + NN.doubleValue() + "" );
                }else
                if
                    (!lm.getText ( ).toString ( ).equals ( "" )   &&
                        !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !P. getText ( ).toString ( ).equals ( "" )) {
                        lmlm = Double.parseDouble(lm.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                    e32 = Double.parseDouble(e3.getText().toString());


                    PP = PP * Math.pow(10,e32);
                    tampilan1.setText ( " N = P/lamda " );
                    tampilan2.setText ( " " );
                    PP = PP * Math.pow(10,e32);
                   NN = PP/lmlm;
                    tampilan4.setText ( " Jumlah inti, No = " + df.format ( NN ) + "" );
                    tampilan6.setText ( " Jumlah inti, No = " + NN.doubleValue() + "" );

                }else
                if
                    (!No.getText ( ).toString ( ).equals ( "" )   &&
                            !lm.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                        !e1.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        NoNo = Double.parseDouble(No.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                    e12 = Double.parseDouble(e1.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No exp(- lamda*t)" );
                    tampilan2.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    NoNo = NoNo*Math.pow(10,e12);
                    X = lmlm*tt;
                    Y = Math.exp(-X);
                    NN = NoNo*Y;
                    tampilan4.setText ( " exp(-lamda*t) = " + Y.doubleValue() + "" );
                    tampilan5.setText ( " Jumlah inti, No = " + df.format ( NN ) + "" );
                    tampilan7.setText ( " Jumlah inti, No = " + NN.doubleValue() + "" );

                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !A. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        AA = Double.parseDouble(A.getText().toString());

                    tampilan1.setText ( " N = mol * NA (bilangan Avogadro)" );
                    tampilan2.setText ( " N = (m/A) * NA" );
                    tampilan3.setText ( "  " );
                    NA = 6.02*Math.pow(10,23);
                    X = mm/AA;
                    NN = X * NA;
                    tampilan4.setText ( " Bilangan Avogadro NA = 6,02 x 10 pangkat 23" );
                    tampilan5.setText ( " Jumlah inti, N = " + df.format ( NN ) + "" );
                    tampilan7.setText ( " Jumlah inti, N = " + NN.doubleValue() + "" );
                }else
                if
                    (!T.getText ( ).toString ( ).equals ( "" )   &&
                        !e3.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !P. getText ( ).toString ( ).equals ( "" )) {
                        TT = Double.parseDouble(T.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                    e32 = Double.parseDouble(e3.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " P = lamda* N" );
                    tampilan2.setText ( " N= P/lamda" );
                    tampilan3.setText ( " lamda = ln 2/T,  T = waktu paruh " );
                    tampilan4.setText ( " N = P * T /ln2 " );
                    PP = PP * Math.pow(10,e32);
                    TT = tt*Math.pow(10,e52);
                    NN = (PP * TT)/Math.log(2);
                    tampilan5.setText ( " Jumlah inti, N = " + df.format ( NN ) + "" );
                    tampilan7.setText ( " Jumlah inti, N = " + NN.doubleValue() + "" );


                }}
        });
        btnPo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat("#.###");

                if
                    (!P.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                        !e3.getText ( ).toString ( ).equals ( "" )   &&
                        !e1.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble(P.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                    e32 = Double.parseDouble(e3.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());

                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( " Po = P/0,5^(t/T)" );
                    tampilan3.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    PP = PP * Math.pow(10,e32);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PoPo = PP/Y;
                    tampilan4.setText ( " Aktivitas inti mula-mula, Po = " + df.format ( PoPo ) + " Bq" );
                    tampilan6.setText ( " Aktivitas inti mula-mula, Po = " + PoPo.doubleValue() + " Bq" );
                }else
                if
                    (!P.getText ( ).toString ( ).equals ( "" )   &&
                           !lm.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                        !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble(P.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                    e32 = Double.parseDouble(e3.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                   tampilan2.setText ( " Po = P/0,5^(t/T)" );
                   tampilan3.setText ( " T = ln2/lamda)" );
                   tampilan4.setText ( "  " );
                    TT = Math.log(2)/lmlm;
                    tt = tt*Math.pow(10,e62);
                   PP = PP * Math.pow(10,e32);
                   X = tt/TT;
                   Y = Math.pow(0.5,X);
                   PoPo = PP/Y;
                   tampilan5.setText ( " Aktivitas inti mula-mula, Po = " + df.format ( PoPo ) + " Bq" );
                   tampilan6.setText ( " Aktivitas inti mula-mula, Po = " + PoPo.doubleValue() + " Bq" );




           }else if
                    (!A.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        AA = Double.parseDouble(A.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                        tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( " Po = P/0,5^(t/T)" );
                    tampilan3.setText ( " P = N*lamda " );
                    tampilan4.setText ( " N = (m/A)*NA;    NA = bilangan avogadro" );
                    tampilan5.setText ( " lamda = ln2/T" );
                    tampilan6.setText ( " Po = m*NA*ln2/(T*A* 0,5^(t/T))" );
                    tampilan7.setText ( " " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    NA = 6.02*Math.pow(10,23);
                    lmlm = Math.log(2)/TT;
                    NN = (mm/AA)*NA;
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PoPo = NN*lmlm/Y;
                    tampilan8.setText ( " Jumlah inti , N = " + df.format ( NN ) + " " );
                    tampilan9.setText ( " Aktivitas inti mula-mula, Po = " + df.format ( PoPo ) + " Bq" );
                    tampilan10.setText ( " Aktivitas inti mula-mula, Po = " + PoPo.doubleValue() + " Bq" );

                }else
                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                        !e2.getText ( ).toString ( ).equals ( "" )   &&
                        !e5.getText ( ).toString ( ).equals ( "" )   &&
                        !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble(N.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                    e22 = Double.parseDouble(e2.getText().toString());
                    e52 = Double.parseDouble(e5.getText().toString());
                    e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( " Po = P/0,5^(t/T)" );
                    tampilan3.setText ( " P = N*lamda " );
                    tampilan4.setText ( " Po = N*lamda/( 0,5^(t/T))" );
                    tampilan4.setText ( " lamda = ln2/T" );
                    tampilan5.setText ( " " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    NN = NN*Math.pow(10,e22);
                    lmlm = Math.log(2)/TT;
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PoPo = NN*lmlm/Y;
                    tampilan6.setText ( " Aktivitas inti mula-mula, Po = " + df.format ( PoPo ) + " Bq" );
                    tampilan8.setText ( " Aktivitas inti mula-mula, Po = " + PoPo.doubleValue() + " Bq" );
               // }else
               // if ( PP !=0  && lmlm !=0  && tt !=0) {
               //     (!P.getText ( ).toString ( ).equals ( "" )   &&
                  //          !lm.getText ( ).toString ( ).equals ( "" )   &&
                   //         !t. getText ( ).toString ( ).equals ( "" )) {
                   //     PP = Double.parseDouble(P.getText().toString());
                   //     tt = Double.parseDouble(t.getText().toString());
                   //     lmlm = Double.parseDouble(lm.getText().toString());
                  //  tampilan1.setText ( " P = Po exp(- lamda*t)" );
                 //   tampilan2.setText ( " Po = P /exp(-lamda*t)" );
                 //   tampilan3.setText ( "  " );
                 //   tt = tt*Math.pow(10,e62);
                 //   PP = PP * Math.pow(10,e32);
                 //   X = lmlm*tt;
                 //   Y = Math.exp(-X);
                 //   PoPo = PP/Y;
                //    tampilan4.setText ( " exp(-lamda*t) = " + Y.doubleValue() + "" );
                //    tampilan6.setText ( " Aktivitas inti mula-mula, Po = " + df.format ( PoPo ) + " Bq" );
                 //   tampilan8.setText ( " Aktivitas inti mula-mula, Po = " + PoPo.doubleValue() + " Bq" );

                }}
        });
        btnP.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat("#.###");

                if
                    (!Po.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        PoPo = Double.parseDouble(N.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e42 = Double.parseDouble(e4.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    PoPo = PoPo * Math.pow(10,e42);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PP = PoPo*Y;
                    tampilan4.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan6.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );
                }else
                if
                    (!Po.getText ( ).toString ( ).equals ( "" )   &&
                            !lm.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        PoPo = Double.parseDouble(Po.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e42 = Double.parseDouble(e4.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( " T = ln2/lamda)" );
                    tampilan3.setText ( "  " );
                    TT = Math.log(2)/lmlm;
                    tt = tt*Math.pow(10,e62);
                    PoPo = PoPo* Math.pow(10,e42);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PP = PoPo*Y;
                    tampilan4.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan6.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );
                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !T.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !A. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        AA = Double.parseDouble(A.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());

                    tampilan1.setText ( " P = N*lamda " );
                    tampilan2.setText ( " N = (m/A)*NA;    NA = bilangan avogadro" );
                    tampilan3.setText ( " lamda = ln2/T" );
                    TT = TT*Math.pow(10,e52);
                    NA = 6.02*Math.pow(10,23);
                    lmlm = Math.log(2)/TT;
                    NN = (mm/AA)*NA;
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    PP = NN*lmlm;
                    tampilan4.setText ( " Jumlah inti , N = " + df.format ( NN ) + " " );
                    tampilan5.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan6.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );
                }else
                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !e2.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble(N.getText().toString());
                        e22 = Double.parseDouble(A.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " P = N*lamda " );
                    tampilan2.setText ( " lamda = ln2/T" );
                    NN = NN*Math.pow(10,e22);
                    TT = TT*Math.pow(10,e52);
                    lmlm = Math.log(2)/TT;
                    PP = NN*lmlm;

                    tampilan3.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan4.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );
                }else
                if
                    (!lm.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !A. getText ( ).toString ( ).equals ( "" )) {
                        lmlm = Double.parseDouble(lm.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        AA = Double.parseDouble(A.getText().toString());

                    tampilan1.setText ( " P = N*lamda " );
                    tampilan2.setText ( " N = (m/A)*NA;    NA = bilangan avogadro" );
                    NA = 6.02*Math.pow(10,23);
                    NN = (mm/AA)*NA;
                    PP = NN*lmlm;
                    tampilan3.setText ( " Jumlah inti , N = " + df.format ( NN ) + " " );
                    tampilan4.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan5.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );
                }else
                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !e2.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble(N.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        e22 = Double.parseDouble(e2.getText().toString());

                    tampilan1.setText ( " P = N*lamda " );
                    NN = NN*Math.pow(10,e22);
                    PP = NN*lmlm;
                    tampilan3.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan4.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );

                }else
                if
                    (!Po.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble(N.getText().toString());
                        e22 = Double.parseDouble(A.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " P = Po exp(- lamda*t)" );
                    tt = tt*Math.pow(10,e62);
                    PoPo = PoPo * Math.pow(10,e42);
                    X = lmlm*tt;
                    Y = Math.exp(-X);
                    PoPo = PP/Y;
                    tampilan3.setText ( " exp(-lamda*t) = " + Y.doubleValue() + "" );
                    tampilan4.setText ( " Aktivitas inti saa t, P = " + df.format ( PP ) + " Bq" );
                    tampilan5.setText ( " Aktivitas inti saat t, P = " + PP.doubleValue() + " Bq" );

                }}
        });
        btnmo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {


                DecimalFormat df = new DecimalFormat("#.#############");

                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                    tampilan2.setText ( " mo = m/0,5^(t/T)" );
                    tampilan3.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    momo = mm/Y;
                    tampilan4.setText ( " massa inti mula-mula, mo = " + df.format ( momo ) + " g" );
                    tampilan6.setText ( " massa inti mula-mula, mo = " + momo.doubleValue() + " g" );

                }else
                if
                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble(m.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());


                    tampilan1.setText ( " m = mo exp(- lamda*t)" );
                    tampilan2.setText ( " mo = m /exp(-lamda*t)" );
                    tampilan3.setText ( "  " );
                    tt = tt * Math.pow ( 10 , e62 );
                    X = lmlm * tt;
                    Y = Math.exp ( -X );
                    momo = mm / Y;
                    tampilan4.setText ( " exp(-lamda*t) = " + Y.doubleValue ( ) + "" );
                    tampilan5.setText ( " massa inti mula-mula = " + df.format ( momo ) + " g" );
                    tampilan7.setText ( " massa inti mula-mula = " + momo.doubleValue ( ) + " g" );

                } else
                    if

                        (!P.getText ( ).toString ( ).equals ( "" )   &&
                                !A.getText ( ).toString ( ).equals ( "" )   &&
                                !t.getText ( ).toString ( ).equals ( "" )   &&
                                !e3.getText ( ).toString ( ).equals ( "" )   &&
                                !e5.getText ( ).toString ( ).equals ( "" )   &&
                                !e6.getText ( ).toString ( ).equals ( "" )   &&
                                !T. getText ( ).toString ( ).equals ( "" )) {
                           PP = Double.parseDouble(P.getText().toString());
                            AA = Double.parseDouble(A.getText().toString());
                            tt = Double.parseDouble(t.getText().toString());
                            e32 = Double.parseDouble(e3.getText().toString());
                            e62 = Double.parseDouble(e6.getText().toString());
                            TT = Double.parseDouble(T.getText().toString());
                            e52 = Double.parseDouble(e5.getText().toString());
                        tampilan1.setText ( "P = lamda* N;   N = (m/A)*NA " );
                        tampilan2.setText ( "  lamda = ln2/T " );
                        tampilan3.setText ( " m = P*A*T/(NA*ln2)" );
                        tampilan4.setText ( " mo = m/(0,5^(t/T)) " );
                        tt = tt*Math.pow(10,e62);
                        TT = TT*Math.pow(10,e52);
                        PP = PP * Math.pow(10,e32);
                        NA = 6.02*Math.pow(10,23);
                       lmlm = Math.log(2)/TT;
                        X = tt/TT;
                        Y = Math.pow(0.5,X);
                        mm = PP*AA*TT/(NA*Math.log(2));
                        momo = mm/Y;
                        tampilan5.setText ( " lamda = " + df.format ( lmlm ) + "" );
                        tampilan6.setText ( " massa inti saat t, m = " + df.format ( mm ) + " g" );
                        tampilan7.setText ( " massa inti mula-mula, mo = " + df.format ( momo ) + " g" );


                }}
        });
        btnm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat("#.########");

                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                    tampilan2.setText ( "  " );
                    tt = tt*Math.pow(10,e62);
                    TT = TT*Math.pow(10,e52);
                    X = tt/TT;
                    Y = Math.pow(0.5,X);
                    mm = momo*Y;
                    tampilan3.setText ( " massa inti , m = " + df.format ( mm ) + " g" );
                    tampilan4.setText ( " massa inti , m = " + mm.doubleValue() + " g" );

                }else
                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !t.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());

                    tampilan1.setText ( " m = mo exp(- lamda*t)" );
                    tt = tt * Math.pow ( 10 , e62 );
                    X = lmlm * tt;
                    Y = Math.exp ( -X );
                    mm = momo*Y;
                    tampilan2.setText ( " exp(-lamda*t) = " + Y.doubleValue ( ) + "" );
                    tampilan3.setText ( " massa inti , m = " + df.format ( mm ) + " g" );
                    tampilan4.setText ( " massa inti , m = " + mm.doubleValue() + " g" );

                } else
                if
                    (!P.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble(P.getText().toString());
                        AA = Double.parseDouble(A.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e32 = Double.parseDouble(e3.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( "P = lamda* N;   N = (m/A)*NA " );
                    tampilan2.setText ( "  lamda = ln2/T " );
                    tampilan3.setText ( " m = P*A*T/(NA*ln2)" );
                    TT = TT*Math.pow(10,e52);
                    PP = PP * Math.pow(10,e32);
                    NA = 6.02*Math.pow(10,23);
                    lmlm = Math.log(2)/TT;
                    mm = PP*AA*TT/(NA*Math.log(2));
                    tampilan4.setText ( " lamda = " + df.format ( lmlm ) + "" );
                    tampilan5.setText ( " massa inti saat t, m = " + df.format ( mm ) + " g" );
                }}
        });
        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat("#.########");
                  if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                    tampilan2.setText ( " m/mo = 0,5^(t/T) " );
                    tampilan3.setText ( " log(m/mo) = (t/T) log(0,5) " );
                    tampilan4.setText ( " t = T*log(m/mo)/ log(0,5) " );
                    TT = TT * Math.pow ( 10 , e52 );
                    X = mm / momo;
                    Y = Math.log10 ( X );
                    Z = Math.log10 ( 0.5 );
                    tt = TT * Y / Z;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " m = mo exp(- lamda t)" );
                    tampilan2.setText ( " m/mo = exp(-t lamda) " );
                    tampilan3.setText ( " (-t lamda) = ln(m/mo) " );
                    tampilan4.setText ( " t =  ln(mo/m)/lamda " );
                    X = momo / mm;
                    Y = Math.log ( X );
                    tt =  Y / lmlm;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                    (!No.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !e1.getText ( ).toString ( ).equals ( "" )   &&
                            !e2.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        NoNo = Double.parseDouble(No.getText().toString());
                        NN = Double.parseDouble(N.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        e12 = Double.parseDouble(e1.getText().toString());
                        e22 = Double.parseDouble(e2.getText().toString());
                    tampilan1.setText ( " m = mo exp(- lamda t)" );
                    tampilan2.setText ( " m/mo = exp(-t lamda) " );
                    tampilan3.setText ( " (-t lamda) = ln(m/mo) " );
                    tampilan4.setText ( " t =  ln(mo/m)/lamda " );
                    NN = NN*Math.pow(10,e22);
                    NoNo = NoNo*Math.pow(10,e12);
                    X = NoNo / NN;
                    Y = Math.log ( X );
                    tt =  Y / lmlm;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                    (!Po.getText ( ).toString ( ).equals ( "" )   &&
                            !P.getText ( ).toString ( ).equals ( "" )   &&
                            !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        PoPo = Double.parseDouble(Po.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        e32 = Double.parseDouble(e3.getText().toString());
                        e42 = Double.parseDouble(e4.getText().toString());
                    tampilan1.setText ( " m = mo exp(- lamda t)" );
                    tampilan2.setText ( " m/mo = exp(-t lamda) " );
                    tampilan3.setText ( " (-t lamda) = ln(m/mo) " );
                    tampilan4.setText ( " t =  ln(mo/m)/lamda " );
                    PP = PP * Math.pow(10,e32);
                    PoPo = PoPo * Math.pow(10,e42);
                    X = PoPo / PP;
                    Y = Math.log ( X );
                    tt =  Y / lmlm;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                            (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !lm. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());

                    tampilan1.setText ( " m = mo exp(- lamda t)" );
                    tampilan2.setText ( " N = No exp(- lamda t)" );
                    tampilan3.setText ( " P = Po exp(- lamda t)" );
                    tampilan4.setText ( " m/mo = N/No = P/Po = exp(-t lamda) " );
                    tampilan5.setText ( " (-t lamda) = ln(m/mo) = ln(N/No) = ln(P/Po) " );
                    tampilan6.setText ( " t =  ln(mo/m)/lamda = ln(No/N)/lamda = ln(Po/P)/lamda " );
                    X = Math.log ( mmo2 );
                    tt =  -X/ lmlm;
                    tampilan8.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan10.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );

                } else
                if
                    (!No.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !e1.getText ( ).toString ( ).equals ( "" )   &&
                            !e2.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        NoNo = Double.parseDouble(No.getText().toString());
                        NN = Double.parseDouble(N.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e12 = Double.parseDouble(e1.getText().toString());
                        e22 = Double.parseDouble(e2.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());

                    tampilan1.setText ( " N = No * 0,5^(t/T)" );
                    tampilan2.setText ( " N/No = 0,5^(t/T) " );
                    tampilan3.setText ( " log(N/No) = (t/T) log(0,5) " );
                    tampilan4.setText ( " t = T*log(N/No)/ log(0,5) " );
                    TT = TT * Math.pow ( 10 , e52 );
                    NN = NN*Math.pow(10,e22);
                    NoNo = NoNo*Math.pow(10,e12);
                    X = NN / NoNo;
                    Y = Math.log10 ( X );
                    Z = Math.log10 ( 0.5 );
                    tt = TT * Y / Z;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                    (!Po.getText ( ).toString ( ).equals ( "" )   &&
                            !P.getText ( ).toString ( ).equals ( "" )   &&
                            !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        PoPo = Double.parseDouble(Po.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        e32 = Double.parseDouble(e3.getText().toString());
                        e42 = Double.parseDouble(e4.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());

                    tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan2.setText ( " P/Po = 0,5^(t/T) " );
                    tampilan3.setText ( " log(P/Po) = (t/T) log(0,5) " );
                    tampilan4.setText ( " t = T*log(P/Po)/ log(0,5) " );
                    TT = TT * Math.pow ( 10 , e52 );
                    PP = PP * Math.pow(10,e32);
                    PoPo = PoPo * Math.pow(10,e42);
                    X = PP / PoPo;
                    Y = Math.log10 ( X );
                    Z = Math.log10 ( 0.5 );
                    tt = TT * Y / Z;
                    tampilan6.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan8.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );
                } else
                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !e5.getText ( ).toString ( ).equals ( "" )   &&
                            !T. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        TT = Double.parseDouble(T.getText().toString());
                        lmlm = Double.parseDouble(lm.getText().toString());
                        e52 = Double.parseDouble(e5.getText().toString());

                    tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                    tampilan2.setText ( " N = No * 0,5^(t/T)" );
                    tampilan3.setText ( " P = Po * 0,5^(t/T)" );
                    tampilan4.setText ( " m/mo = N/No P/Po = 0,5^(t/T) " );
                    tampilan5.setText ( " log(m/mo) = log(N/No) = log(P/Po) = (t/T) log(0,5) " );
                    tampilan6.setText ( " t = T*log(m/mo)/ log(0,5) " );
                    tampilan7.setText ( " t = T*log(N/No)/ log(0,5) " );
                    tampilan8.setText ( " t = T*log(P/Po)/ log(0,5) " );
                    TT = TT * Math.pow ( 10 , e52 );
                    X = Math.log10 ( mmo2 );
                    Y = Math.log10 ( 0.5 );
                    tt = TT * X/Y;
                    tampilan10.setText ( " umur benda , t = " + df.format ( tt ) + " (sama satuan dengan waktu paruh)" );
                    tampilan12.setText ( " umur benda , t = " + tt.doubleValue ( ) + "(sama satuan dengan waktu paruh)" );


                } }
        });
        btnT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat("#.########");

                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());

                    tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                    tampilan2.setText ( " m/mo = 0,5^(t/T) " );
                    tampilan3.setText ( " log(m/mo) = (t/T) log(0,5) " );
                    tampilan4.setText ( " T = t*log(0,5)/ log(m/mo) " );
                    tt = tt * Math.pow ( 10 , e62 );
                    X = mm / momo;
                    Y = Math.log10 ( X );
                    Z = Math.log10 ( 0.5 );
                    TT = tt * Z / Y;
                    tampilan6.setText ( " Waktu paruh , T = " + df.format ( TT ) + " (sama satuan dengan waktu )" );
                    tampilan8.setText ( " Waktu paruh , T = " + TT.doubleValue ( ) + "(sama satuan dengan waktu )" );
                } else
                 if
                     (!No.getText ( ).toString ( ).equals ( "" )   &&
                             !N.getText ( ).toString ( ).equals ( "" )   &&
                             !e1.getText ( ).toString ( ).equals ( "" )   &&
                             !e2.getText ( ).toString ( ).equals ( "" )   &&
                             !e6.getText ( ).toString ( ).equals ( "" )   &&
                             !t. getText ( ).toString ( ).equals ( "" )) {
                         NoNo = Double.parseDouble(No.getText().toString());
                         NN = Double.parseDouble(N.getText().toString());
                         tt = Double.parseDouble(t.getText().toString());
                         e12 = Double.parseDouble(e1.getText().toString());
                         e22 = Double.parseDouble(e2.getText().toString());
                         e62 = Double.parseDouble(e6.getText().toString());
                     tampilan1.setText ( " N = No * 0,5^(t/T)" );
                     tampilan2.setText ( " N/No = 0,5^(t/T) " );
                     tampilan3.setText ( " log(N/No) = (t/T) log(0,5) " );
                     tampilan4.setText ( " T = t*log(0,5)/ log(N/No) " );
                     tt = tt * Math.pow ( 10 , e62 );
                     NN = NN*Math.pow(10,e22);
                     NoNo = NoNo*Math.pow(10,e12);
                     X = NN / NoNo;
                     Y = Math.log10 ( X );
                     Z = Math.log10 ( 0.5 );
                     TT = tt * Z / Y;
                     tampilan6.setText ( " Waktu paruh , T = " + df.format ( TT ) + " (sama satuan dengan waktu )" );
                     tampilan8.setText ( " Waktu paruh , T = " + TT.doubleValue ( ) + "(sama satuan dengan waktu )" );
                 } else
                 if
                     (!Po.getText ( ).toString ( ).equals ( "" )   &&
                             !P.getText ( ).toString ( ).equals ( "" )   &&
                             !e3.getText ( ).toString ( ).equals ( "" )   &&
                             !e4.getText ( ).toString ( ).equals ( "" )   &&
                             !e6.getText ( ).toString ( ).equals ( "" )   &&
                             !t. getText ( ).toString ( ).equals ( "" )) {
                         PoPo = Double.parseDouble(Po.getText().toString());
                         PP = Double.parseDouble(P.getText().toString());
                         tt = Double.parseDouble(t.getText().toString());
                         e32 = Double.parseDouble(e3.getText().toString());
                         e42 = Double.parseDouble(e4.getText().toString());
                         e62 = Double.parseDouble(e6.getText().toString());
                     tampilan1.setText ( " P = Po * 0,5^(t/T)" );
                     tampilan2.setText ( " P/Po = 0,5^(t/T) " );
                     tampilan3.setText ( " log(P/Po) = (t/T) log(0,5) " );
                     tampilan4.setText ( " T = t*log(0,5)/ log(P/Po) " );
                     tt = tt * Math.pow ( 10 , e62 );
                     PP = PP * Math.pow(10,e32);
                     PoPo = PoPo * Math.pow(10,e42);
                     NN = NN*Math.pow(10,e22);
                     X = PP / PoPo;
                     Y = Math.log10 ( X );
                     Z = Math.log10 ( 0.5 );
                     TT = tt * Z / Y;
                     tampilan6.setText ( " Waktu paruh , T = " + df.format ( TT ) + " (sama satuan dengan waktu )" );
                     tampilan8.setText ( " Waktu paruh , T = " + TT.doubleValue ( ) + "(sama satuan dengan waktu )" );
                 } else
                 if
                     (!mo.getText ( ).toString ( ).equals ( "" )   &&
                             !e6.getText ( ).toString ( ).equals ( "" )   &&
                             !t. getText ( ).toString ( ).equals ( "" )) {
                         mmo2 = Double.parseDouble(mo.getText().toString());
                         tt = Double.parseDouble(t.getText().toString());
                         e62 = Double.parseDouble(e3.getText().toString());

                     tampilan1.setText ( " m = mo * 0,5^(t/T)" );
                     tampilan2.setText ( " N = No * 0,5^(t/T)" );
                     tampilan3.setText ( " P = Po * 0,5^(t/T)" );
                     tampilan4.setText ( " m/mo = N/No = P/Po = 0,5^(t/T) " );
                     tampilan5.setText ( " log(m/mo) = (t/T) log(0,5) " );
                     tampilan6.setText ( " log(P/Po) = (t/T) log(0,5) " );
                     tampilan7.setText ( " log(N/No) = (t/T) log(0,5) " );
                     tampilan8.setText ( " T = t*log(0,5)/ log(m/mo) dan seterusnya " );
                     tt = tt * Math.pow ( 10 , e62 );
                     X = Math.log10 ( mmo2 );
                     Y = Math.log10 ( 0.5 );
                     TT = tt * Y / X;
                     tampilan10.setText ( " Waktu paruh , T = " + df.format ( TT ) + " (sama satuan dengan waktu )" );
                     tampilan12.setText ( " Waktu paruh , T = " + TT.doubleValue ( ) + "(sama satuan dengan waktu )" );
                } }
        });
        btnlm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat("#.########");

                if
                    (!mo.getText ( ).toString ( ).equals ( "" )   &&
                            !m.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        momo = Double.parseDouble(mo.getText().toString());
                        mm = Double.parseDouble(m.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());

                    tampilan1.setText ( " m = mo * exp(- lamda*t)" );
                    tampilan2.setText ( " m/mo = exp(-lamda*t) " );
                    tampilan3.setText ( " ln(m/mo) = - lamda*t " );
                    tampilan4.setText ( " lamda = - ln(m/mo)/t " );
                    tt = tt * Math.pow ( 10 , e62 );
                    X = mm / momo;
                    Y = Math.log ( X );
                    lmlm = -Y / tt;
                    tampilan6.setText ( " konstanta peluruhan , lamda = " + df.format ( lmlm ) + " 1/satuan waktu" );
                    tampilan8.setText ( " konstanta peluruhan , lamda = " + lmlm.doubleValue ( ) + "1/satuan waktu" );
                } else
                if
                    (!No.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !e1.getText ( ).toString ( ).equals ( "" )   &&
                            !e2.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        NoNo = Double.parseDouble(No.getText().toString());
                        NN = Double.parseDouble(N.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e12 = Double.parseDouble(e1.getText().toString());
                        e22 = Double.parseDouble(e2.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());
                    tampilan1.setText ( " N = No * exp(- lamda*t)" );
                    tampilan2.setText ( " N/No = exp(-lamda*t) " );
                    tampilan3.setText ( " ln(N/No) = - lamda*t " );
                    tampilan4.setText ( " lamda = - ln(N/No)/t " );
                    tt = tt * Math.pow ( 10 , e62 );
                    NoNo = NoNo*Math.pow(10,e12);
                    NN = NN*Math.pow(10,e22);
                    X = mm / momo;
                    Y = Math.log( X );
                    lmlm = - Y/tt;
                    tampilan6.setText ( " konstanta peluruhan , lamda = " + df.format (lmlm) + " 1/satuan waktu" );
                    tampilan8.setText ( " konstanta peluruhan , lamda = " + lmlm.doubleValue ( ) + "1/satuan waktu" );
                } else
                if
                           (!Po.getText ( ).toString ( ).equals ( "" )   &&
                             !P.getText ( ).toString ( ).equals ( "" )   &&
                            !e3.getText ( ).toString ( ).equals ( "" )   &&
                            !e4.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        PoPo = Double.parseDouble(Po.getText().toString());
                        PP = Double.parseDouble(P.getText().toString());
                        tt = Double.parseDouble(t.getText().toString());
                        e32 = Double.parseDouble(e3.getText().toString());
                        e42 = Double.parseDouble(e4.getText().toString());
                        e62 = Double.parseDouble(e5.getText().toString());
                    tampilan1.setText ( " P = Po * exp(- lamda*t)" );
                    tampilan2.setText ( " P/Po = exp(-lamda*t) " );
                    tampilan3.setText ( " ln(P/Po) = - lamda*t " );
                    tampilan4.setText ( " lamda = - ln(P/Po)/t " );
                    tt = tt * Math.pow ( 10 , e62 );
                    PP = PP * Math.pow(10,e32);
                    PoPo = PoPo * Math.pow(10,e42);
                    X = PP / PoPo;
                    Y = Math.log( X );
                    lmlm = - Y/tt;
                    tampilan6.setText ( " konstanta peluruhan , lamda = " + df.format (lmlm) + " 1/satuan waktu" );
                    tampilan8.setText ( " konstanta peluruhan , lamda = " + lmlm.doubleValue ( ) + "1/satuan waktu" );
                } else
                if
                          (!mmo.getText ( ).toString ( ).equals ( "" )   &&
                            !e6.getText ( ).toString ( ).equals ( "" )   &&
                            !t. getText ( ).toString ( ).equals ( "" )) {
                        mmo2 = Double.parseDouble(mmo.getText().toString());
                       tt = Double.parseDouble(t.getText().toString());
                        e62 = Double.parseDouble(e6.getText().toString());

                    tampilan1.setText ( " P = Po * exp(- lamda*t)" );
                    tampilan2.setText ( " m = mo * exp(- lamda*t)" );
                    tampilan3.setText ( " N = No * exp(- lamda*t)" );
                    tampilan4.setText ( " P/Po = m/mo = N/No = exp(-lamda*t) " );
                    tampilan3.setText ( " ln(P/Po) = ln(m/mo) = ln(N/No) = - lamda*t " );
                    tampilan4.setText ( " lamda = - ln(P/Po)/t = -ln(m/mo)/t = - ln(N/No)/t" );
                    tt = tt * Math.pow ( 10 , e62 );
                    lmlm = - Math.log(mmo2)/tt;
                    tampilan6.setText ( " konstanta peluruhan , lamda = " + df.format (lmlm) + " 1/satuan waktu" );
                    tampilan8.setText ( " konstanta peluruhan , lamda = " + lmlm.doubleValue ( ) + "1/satuan waktu" );

                } }
        });

        btninti.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( RadioAktif.this , FisikaInti.class );
                startActivity ( intent ); }
        } );
        btnIkat.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( RadioAktif.this , EnergiIkat.class );
                startActivity ( intent ); }
        } );

        btnclear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                No.setText("");
                N.setText("");
                Po.setText("");
                P.setText("");
                mo.setText("");
                m.setText("");
                A.setText("");
                lm.setText("");
                t.setText("");
                T.setText("");
                mmo.setText("");
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
            }
        });
    }}

