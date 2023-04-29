
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SeriParalel extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;
    private TextView tampilan9;


    private EditText r1, r2, r3, C1, C2, C3, L1, L2, L3;
    private Double r1r1, r2r2,r3r3,C1C1, C2C2, C3C3, L1L1, L2L2,L3L3, Rs, Rp, Cs, Cp, Ls, Lp;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_seri_paralel );

        tampilan1 = findViewById ( R.id.tvtampilan1 );
        tampilan2 = findViewById ( R.id.tvtampilan2 );
        tampilan3 = findViewById ( R.id.tvtampilan3 );
        tampilan4 = findViewById ( R.id.tvtampilan4 );
        tampilan5 = findViewById ( R.id.tvtampilan5 );
        tampilan6 = findViewById ( R.id.tvtampilan6 );
        tampilan7 = findViewById ( R.id.tvtampilan7 );
        tampilan8 = findViewById ( R.id.tvtampilan8 );
        tampilan9 = findViewById ( R.id.tvtampilan9 );
        r1 = findViewById ( R.id.in_r1 );
        r2 = findViewById ( R.id.in_r2 );
        r3 = findViewById ( R.id.in_r3 );
        C1 = findViewById ( R.id.in_C1 );
        C2 = findViewById ( R.id.in_C2 );
        C3 = findViewById ( R.id.in_C3 );
        L1 = findViewById ( R.id.in_L1 );
        L2 = findViewById ( R.id.in_L2 );
        L3 = findViewById ( R.id.in_L3 );

        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnrs = findViewById ( R.id.btn_Rs );
        Button btnrp = findViewById ( R.id.btn_Rp );
        Button btncs = findViewById ( R.id.btn_Cs );
        Button btncp = findViewById ( R.id.btn_Cp );
        Button btnLs = findViewById ( R.id.btn_Ls );
        Button btnLp = findViewById ( R.id.btn_Lp );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Seri Paralel" );
                tampilan2.setText ( "kalkulator ini digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Nilai hambatan setara untuk rangkaian seri" );
                tampilan4.setText ( " 2. Nilai hambatan setara untuk rangkaian paralel" );
                tampilan5.setText ( " 3. Nilai induktansi setara untuk rangkaian induktor seri " );
                tampilan6.setText ( "4. Nilai induktansi setara untuk rangkaian induktor paralel" );
                tampilan7.setText ( " 5. Nilaia kapasitansi setara untuk rangkaian kapasitor seri" );
                tampilan8.setText ( "6. Nilaian kapasitansi setara untuk rangkaian kapasitor paralel " );
                tampilan9.setText ( " R : resistansi; C : kapasitansi, L : induktansi" );
            }});

        btnrs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !r1.getText ( ).toString ( ).equals ( "" ) &&
                            !r2.getText ( ).toString ( ).equals ( "" ) &&
                            !r3.getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                        r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );
                        r3r3 = Double.parseDouble ( r3.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian hambatan seri" );
                    tampilan2.setText ( " Rs = R1 + R2 +R3" );
                    Rs = r1r1 + r2r2 + r3r3;
                    tampilan3.setText ( " Rs = " + df.format ( Rs ) + " ohm" );
                } else
                if
                    ( !r1.getText ( ).toString ( ).equals ( "" ) &&
                            !r2.getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                        r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian hambatan seri" );
                    tampilan2.setText ( " Rs = R1 + R2 " );
                    Rs = r1r1 + r2r2;
                    tampilan3.setText ( " Rs = " + df.format ( Rs ) + " ohm" );
                }

            }}
        );
        btnrp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !r1.getText ( ).toString ( ).equals ( "" ) &&
                            !r2.getText ( ).toString ( ).equals ( "" ) &&
                            !r3.getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                        r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );
                        r3r3 = Double.parseDouble ( r3.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian hambatan paralel" );
                    tampilan2.setText ( " 1/Rp = 1/R1 + 1/R2 + 1/R3" );
                    Rp = (1/r1r1) + (1/r2r2) + (1/r3r3);

                    tampilan3.setText ( "1/ Rp = " + df.format ( Rp ) + " 1/ohm" );
                    Rp = 1/Rp;
                    tampilan4.setText ( " Rp = " + df.format ( Rp ) + " ohm" );

                } else
                if
                    ( !r1.getText ( ).toString ( ).equals ( "" ) &&
                            !r2.getText ( ).toString ( ).equals ( "" )) {
                        r1r1 = Double.parseDouble ( r1.getText ( ).toString ( ) );
                        r2r2 = Double.parseDouble ( r2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Rangkaian hambatan paralel" );
                    tampilan2.setText ( " 1/Rp = 1/R1 + 1/R2 " );
                    Rp = (1/r1r1) + (1/r2r2) ;
                    tampilan3.setText ( " 1/Rp = " + df.format ( Rp ) + "1/ohm" );
                    Rp = 1/Rp;
                    tampilan4.setText ( " Rp = " + df.format ( Rp ) + " ohm" );
                }

            }}
        );
        btncs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !C1.getText ( ).toString ( ).equals ( "" ) &&
                            !C2.getText ( ).toString ( ).equals ( "" ) &&
                            !C3.getText ( ).toString ( ).equals ( "" )) {
                        C1C1 = Double.parseDouble ( C1.getText ( ).toString ( ) );
                        C2C2 = Double.parseDouble ( C2.getText ( ).toString ( ) );
                        C3C3 = Double.parseDouble ( C3.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian kapasitor seri" );
                    tampilan2.setText ( " 1/Cs = 1/C1 + 1/C2 + 1/C3" );
                    Cs = (1/C1C1) + (1/C2C2) + (1/C3C3);
                    tampilan3.setText ( "1/ Cs = " + df.format ( Cs ) + " 1/F" );
                    Cs = 1/Cs;
                    tampilan4.setText ( " Cs = " + df.format ( Cs ) + " F" );
                } else
                if
                    ( !C1.getText ( ).toString ( ).equals ( "" ) &&
                            !C2.getText ( ).toString ( ).equals ( "" )) {
                        C1C1 = Double.parseDouble ( C1.getText ( ).toString ( ) );
                        C2C2 = Double.parseDouble ( C2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian kapasitor seri" );
                    tampilan2.setText ( " 1/Cs = 1/C1 + 1/C2 " );
                    Cs = (1/C1C1) + (1/C2C2);
                    tampilan3.setText ( " 1/Cs = " + df.format ( Cs ) + " 1/F" );
                    Cs = 1/Cs;
                    tampilan4.setText ( " Cs = " + df.format ( Cs ) + " F" );
                }

            }}
        );
        btncp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !C1.getText ( ).toString ( ).equals ( "" ) &&
                            !C2.getText ( ).toString ( ).equals ( "" ) &&
                            !C3.getText ( ).toString ( ).equals ( "" )) {
                        C1C1 = Double.parseDouble ( C1.getText ( ).toString ( ) );
                        C2C2 = Double.parseDouble ( C2.getText ( ).toString ( ) );
                        C3C3 = Double.parseDouble ( C3.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian kapasitor paralel" );
                    tampilan2.setText ( " Cp = C1 + C2 + C3" );
                    Cp = C1C1 + C2C2 + C3C3;
                    tampilan3.setText ( " Cp = " + df.format ( Cp ) + " F" );
                } else
                if
                    ( !C1.getText ( ).toString ( ).equals ( "" ) &&
                            !C2.getText ( ).toString ( ).equals ( "" )) {
                        C1C1 = Double.parseDouble ( C1.getText ( ).toString ( ) );
                        C2C2 = Double.parseDouble ( C2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Rangkaian kapasitor paralel" );
                        tampilan2.setText ( " Cp = C1 + C2 " );
                    Cp = C1C1 + C2C2;
                    tampilan3.setText ( " Cs = " + df.format ( Cs ) + " F" );
                }

            }}
        );
        btnLs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !L1.getText ( ).toString ( ).equals ( "" ) &&
                            !L2.getText ( ).toString ( ).equals ( "" ) &&
                            !L3.getText ( ).toString ( ).equals ( "" )) {
                       L1L1 = Double.parseDouble ( L1.getText ( ).toString ( ) );
                       L2L2 = Double.parseDouble ( L2.getText ( ).toString ( ) );
                       L3L3 = Double.parseDouble ( L3.getText ( ).toString ( ) );

                      tampilan1.setText ( " Rangkaian induktor seri" );
                       tampilan2.setText ( " Ls = L1 + L2 + L3" );
                    Ls = L1L1 + L2L2 + L3L3;
                    tampilan3.setText ( " Ls = " + df.format ( Ls ) + " henry" );
                } else
                if
                    ( !L1.getText ( ).toString ( ).equals ( "" ) &&
                            !L2.getText ( ).toString ( ).equals ( "" )) {
                        L1L1 = Double.parseDouble ( L1.getText ( ).toString ( ) );
                        L2L2 = Double.parseDouble ( L2.getText ( ).toString ( ) );

                        tampilan1.setText ( " Rangkaian induktor seri" );
                        tampilan2.setText ( " Ls = L1 + L2 " );
                    Ls = L1L1 + L2L2 ;
                    tampilan3.setText ( " Ls = " + df.format ( Ls ) + " henry" );
                }

            }}
        );
        btnLp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
               if
                    ( !L1.getText ( ).toString ( ).equals ( "" ) &&
                            !L2.getText ( ).toString ( ).equals ( "" ) &&
                            !L3.getText ( ).toString ( ).equals ( "" )) {
                        L1L1 = Double.parseDouble ( L1.getText ( ).toString ( ) );
                        L2L2 = Double.parseDouble ( L2.getText ( ).toString ( ) );
                        L3L3 = Double.parseDouble ( L3.getText ( ).toString ( ) );
                    tampilan1.setText ( " Rangkaian induktor paralel" );
                    tampilan2.setText ( " 1/Lp = 1/L1 + 1/L2 + 1/L3" );
                    Lp = (1/L1L1) + (1/L2L2) + (1/L3L3);
                    tampilan3.setText ( " 1/Lp = " + df.format ( Lp ) + " 1/henry" );
                    Lp = 1/Lp;
                    tampilan4.setText ( " Lp = " + df.format ( Lp ) + " henry" );
                } else
                if
                    ( !L1.getText ( ).toString ( ).equals ( "" ) &&
                            !L2.getText ( ).toString ( ).equals ( "" )) {
                        L1L1 = Double.parseDouble ( L1.getText ( ).toString ( ) );
                        L2L2 = Double.parseDouble ( L2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Rangkaian induktor paralel" );
                    tampilan2.setText ( " 1/Lp = 1/L1 + 1/L2 " );
                    Lp = (1/L1L1) + (1/L2L2);
                    tampilan3.setText ( " 1/Lp = " + df.format ( Lp ) + " 1/henry" );
                    Lp = 1/Lp;
                    tampilan4.setText ( " Lp = " + df.format ( Lp ) + " henry" );
                }

            }}
        );


        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                tampilan2.setText ( "" );
                tampilan1.setText ( "" );
                r1.setText ( "" );
                r2.setText ( "" );
                r3.setText ( "" );
                C1.setText ( "" );
                C2.setText ( "" );
                C3.setText ( "" );
                L1.setText ( "" );
                L2.setText ( "" );
                L3.setText ( "" );

            }
        } );

    }
}


