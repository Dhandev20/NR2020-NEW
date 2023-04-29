package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class EnergiIkat extends AppCompatActivity {
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
    private EditText A, Z, dm, mi, E;
    private double AA, ZZ, dmdm, mimi,EE;
    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energi_ikat);
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

        A = findViewById(R.id.in_A);
        Z = findViewById(R.id.in_Z);
        mi = findViewById(R.id.in_mi);
        dm = findViewById(R.id.in_dm);
        E = findViewById(R.id.in_E);


        Button btnA = findViewById ( R.id.btn_A );
        Button btnZ = findViewById ( R.id.btn_Z );
        Button btnmi = findViewById ( R.id.btn_mi );
        Button btndm = findViewById ( R.id.btn_dm );
        Button btnE = findViewById ( R.id.btn_E );
        Button btnRa = findViewById ( R.id.btn_Radioaktif );
        Button btnInti = findViewById ( R.id.btn_Inti );
        Button btnclear = findViewById ( R.id.btnclear );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Energi ikat inti atom:" );
                tampilan2.setText ( " Variabel yang digunakan:" );
                tampilan3.setText ( " A : nomor massa = massa proton + massa netron" );
                tampilan4.setText ( " Z : nomor atom = nomor proton = jumlah proton = jumlah elektron" );
                tampilan5.setText ( " mi : massa inti  " );
                tampilan6.setText ( " dm : defek massa = selisih massa penyusun inti (proton dan proton) - massa inti" );
                tampilan7.setText ( " E  : energi ikat inti = defek massa x 931,5MeV/sma" );
                tampilan8.setText ( " mp : massa proton = 1.007276466879sma" );
                tampilan9.setText ( " mn : massa netron = 1.00866491588sma" );
                tampilan10.setText ( "Sebelum menggunakan kalkulator silakan tekan Nol " );
                tampilan11.setText ( "Anda bisa lanjutkan ke perhitungan radioaktif " );
            }} );
        btnA.setOnClickListener( new View.OnClickListener() {
          @Override
             public void onClick ( View view ) {
              DecimalFormat df = new DecimalFormat ( "#.#############" );

              ZZ = Double.parseDouble ( Z.getText ( ).toString ( ) );
              dmdm = Double.parseDouble ( dm.getText ( ).toString ( ) );
              mimi = Double.parseDouble ( mi.getText ( ).toString ( ) );

              tampilan1.setText ( " dm =  Z mp + (A-Z)mn - mi " );
              tampilan2.setText ( "  A = Z + (dm + mi +  - Z. mp)/mn" );
              tampilan3.setText ( "  mp = 1.007276466879" );
              tampilan4.setText ( "  mn = 1.00866491588" );
                 AA = ZZ + (dmdm + mimi - (ZZ * 1.007276466879)) / 1.00866491588;

                 tampilan6.setText ( " A = " + df.format ( AA ) + "" );
              tampilan8.setText ( " Hitungan kasar di SMA)" );
              tampilan9.setText ( "  mp = 1.0073" );
              tampilan10.setText ( "  mn = 1.0087" );
              AA = ZZ + (dmdm + mimi - (ZZ * 1.0073)) / 1.0087;

              tampilan11.setText ( " A = " + df.format ( AA ) + "" );

                }
              });
        btnZ.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#############" );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                dmdm = Double.parseDouble ( dm.getText ( ).toString ( ) );
                mimi = Double.parseDouble ( mi.getText ( ).toString ( ) );

                    tampilan1.setText ( " dm =  Z mp + (A-Z)mn - mi " );
                    tampilan2.setText ( " dm = Z( mp - mn) + A mn - mi" );
                    tampilan3.setText ( "  Z = (mi + dm - A mn)/(mp - mn)" );
                tampilan4.setText ( "  mp = 1.007276466879" );
                tampilan5.setText ( "  mn = 1.00866491588" );
                    ZZ = (mimi + dmdm - (AA*1.00866491588)) /(1.007276466879 - 1.00866491588);

                    tampilan6.setText ( " nomor atom Z  = " + df.format ( ZZ ) + "" );
                tampilan8.setText ( " Hitungan kasar di SMA)" );
                tampilan9.setText ( "  mp = 1.0073" );
                tampilan10.setText ( "  mn = 1.0087" );
                ZZ = (mimi + dmdm - (AA*1.0087)) /(1.0073 - 1.0087);

                tampilan11.setText ( " nomor atom Z  = " + df.format ( ZZ ) + "" );
            }
        });

        btnmi.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#############" );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                ZZ = Double.parseDouble ( Z.getText ( ).toString ( ) );
                dmdm = Double.parseDouble ( dm.getText ( ).toString ( ) );

                    tampilan1.setText ( " dm =  Z mp + (A-Z)mn - mi " );
                    tampilan2.setText ( " mi = Z mp + (A - Z)mn - dm" );
                tampilan3.setText ( "  mp = 1.007276466879" );
                tampilan4.setText ( "  mn = 1.00866491588" );
                    mimi = ZZ*1.0072825 + 1.00866491588*(AA - ZZ)- dmdm;

                    tampilan5.setText ( " massa inti  = " + df.format ( mimi ) + "sma" );
                tampilan6.setText ( " Hitungan kasar di SMA)" );
                tampilan7.setText ( "  mp = 1.0073" );
                tampilan8.setText ( "  mn = 1.0087" );
                mimi = ZZ*1.0073 + 1.0087*(AA - ZZ)- dmdm;

                tampilan9.setText ( " nomor atom Z  = " + df.format ( ZZ ) + "" );

            }
        });
        btndm.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#############" );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                ZZ = Double.parseDouble ( Z.getText ( ).toString ( ) );
                mimi = Double.parseDouble ( mi.getText ( ).toString ( ) );

                 tampilan1.setText ( " dm =  Z mp + (A-Z)mn - mi " );
                    dmdm = 1.007276466879*ZZ + (AA-ZZ)*1.00866491588 - mimi;
                tampilan2.setText ( "  mp = 1.007276466879" );
                tampilan3.setText ( "  mn = 1.00866491588" );
                tampilan4.setText ( " defek massa  dm = " + df.format ( dmdm ) + "  sma" );
                tampilan6.setText ( " Hitungan kasar di SMA)" );
                tampilan7.setText ( "  mp = 1.0073" );
                tampilan8.setText ( "  mn = 1.0087" );
                dmdm = 1.0073*ZZ + (AA-ZZ)*1.0087 - mimi;
                tampilan9.setText ( " defek massa  dm = " + df.format ( dmdm ) + "  sma" );


            }
        });
        btnE.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#############" );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                ZZ = Double.parseDouble ( Z.getText ( ).toString ( ) );
                mimi = Double.parseDouble ( mi.getText ( ).toString ( ) );


                    tampilan1.setText ( " dm =  Z mp + (A-Z)mn - mi " );
                    tampilan2.setText ( " Energi ikat inti =  dm * 931,5 MeV/sma " );
                    tampilan3.setText ( "  mp = 1.007276466879" );
                    tampilan4.setText ( "  mn = 1.00866491588" );
                    dmdm = 1.007276466879*ZZ + (AA-ZZ)*1.00866491588 - mimi;
                    EE = dmdm*931.5;
                    tampilan5.setText ( " massa defek = " + df.format ( dmdm ) + "  sma" );
                    tampilan6.setText ( " Energi Ikat Inti E = " + df.format ( EE ) + "  MeV" );
                tampilan8.setText ( " Hitungan kasar di SMA)" );
                tampilan9.setText ( "  mp = 1.0073" );
                tampilan10.setText ( "  mn = 1.0087" );
                dmdm = 1.0073*ZZ + (AA-ZZ)*1.0087 - mimi;
                EE = dmdm*931.5;

                tampilan11.setText ( " massa defek = " + df.format ( dmdm ) + "  sma" );
                tampilan12.setText ( " Energi Ikat Inti E = " + df.format ( EE ) + "  MeV" );
            }
        });
        btnRa.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( EnergiIkat.this , RadioAktif.class );
                startActivity ( intent ); }
        } );

        btnInti.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( EnergiIkat.this , FisikaInti.class );
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

                A.setText("");
                Z.setText("");
               dm.setText("");
                mi.setText("");
              E.setText("");

            }
        });
    }}
