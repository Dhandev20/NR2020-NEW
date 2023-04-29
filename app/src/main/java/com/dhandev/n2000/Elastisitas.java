package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Elastisitas extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;


    private EditText F, Fs, A, L, dL, Y, dx;

    private Double reg, teg, FF, FsFs, YY, LL, dLdL, AA, dxdx, Ms, P;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_elastisitas );

        tampilan1 = findViewById ( R.id.tvtampilan1 );
        tampilan2 = findViewById ( R.id.tvtampilan2 );
        tampilan3 = findViewById ( R.id.tvtampilan3 );
        tampilan4 = findViewById ( R.id.tvtampilan4 );
        tampilan5 = findViewById ( R.id.tvtampilan5 );
        tampilan6 = findViewById ( R.id.tvtampilan6 );
        tampilan7 = findViewById ( R.id.tvtampilan7 );
        tampilan8 = findViewById ( R.id.tvtampilan8 );

        F = findViewById ( R.id.in_F );
        A = findViewById ( R.id.in_A);
        L = findViewById ( R.id.in_L );
        dL = findViewById ( R.id.in_dL );
        Fs = findViewById ( R.id.in_Fs );
        Y = findViewById ( R.id.in_Y );
        dx = findViewById ( R.id.in_dX );

        Button btnTeg = findViewById ( R.id.btn_Teg );
        Button btnReg = findViewById ( R.id.btn_Reg );
        Button btnF = findViewById ( R.id.btn_F );
        Button btnY = findViewById ( R.id.btn_Y );
        Button btnL = findViewById ( R.id.btn_L );
        Button btndL = findViewById ( R.id.btn_dL );
        Button btnA = findViewById ( R.id.btn_A );
        Button btnMs = findViewById ( R.id.btn_Ms );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );

        btnTeg.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );

                AA = AA/1000000;
                tampilan1.setText ( "Tegangan = (F/A)" );
                teg = FF / AA;
                tampilan2.setText ( " Tegangan = " + df.format ( teg ) + "N/m2" );
            }
        } );
        btnReg.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                dLdL = Double.parseDouble ( dL.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                dLdL = dLdL/1000;
                tampilan1.setText ( "Regangan = (dL/L)" );
                reg = dLdL / LL;
                tampilan2.setText ( " Regangan = " + df.format ( reg ) );
            }
        } );
        btnY.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                dLdL = Double.parseDouble ( dL.getText ( ).toString ( ) );

                if ( FF != 0 && AA != 0 && LL != 0 && dLdL != 0 ) {
                    dLdL = dLdL/1000;
                    AA = AA/1000000;
                    tampilan1.setText ( "Y = (F/A)/(dL/L)" );
                    YY = (FF * LL) / (AA * dLdL);
                    tampilan2.setText ( " Y = " + df.format ( YY ) + "N/m2" );
                    tampilan3.setText ( " Y = " + YY.doubleValue ( ) + "N/m2");

                }
            }
        } );
        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                dLdL = Double.parseDouble ( dL.getText ( ).toString ( ) );

                if ( YY != 0 && AA != 0 && LL != 0 && dLdL != 0 ) {
                    tampilan1.setText ( " Y = (F/A)/(dL/L)" );
                    tampilan2.setText ( " F = Y * A dL/L" );
                    dLdL = dLdL/1000;
                    AA = AA/1000000;
                    YY = YY*Math.pow(10,9);
                    FF = YY * AA * dLdL / LL;
                    tampilan4.setText ( " F = " + df.format ( FF ) + "N" );
                }
            }
        } );
        btnL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );
                dLdL = Double.parseDouble ( dL.getText ( ).toString ( ) );

                if ( YY != 0 && AA != 0 && FF != 0 && dLdL != 0 ) {
                    dLdL = dLdL/1000;
                    AA = AA/1000000;
                    YY = YY*Math.pow(10,9);
                    tampilan1.setText ( "  Y = (F/A)/(dL/L)" );
                    tampilan2.setText ( "  L = Y * A dL/F" );
                    LL = YY * AA * dLdL / FF;
                    tampilan4.setText ( " L = " + df.format ( LL ) + "m" );
                }
            }
        } );
        btndL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );


                if ( YY != 0 && AA != 0 && FF != 0 && LL != 0 ) {

                    AA = AA/1000000;
                    YY = YY*Math.pow(10,9);
                    tampilan1.setText ( " Y = (F/A)/(dL/L)" );
                    tampilan2.setText ( " dL = F * L/(Y * A)" );
                    dLdL = FF * LL / (YY * AA);
                    tampilan4.setText ( " dL = " + df.format ( dLdL ) + "m" );
                    dLdL = dLdL * 1000;
                    tampilan5.setText ( " dL = " + df.format ( dLdL ) + "mm" );
                }
            }
        } );
        btnA.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                YY = Double.parseDouble ( Y.getText ( ).toString ( ) );
                dLdL = Double.parseDouble ( dL.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                FF = Double.parseDouble ( F.getText ( ).toString ( ) );

                if ( YY != 0  && FF != 0 && dLdL != 0 ) {
                    dLdL = dLdL/1000;
                    YY = YY*Math.pow(10,9);
                    tampilan1.setText ( "  Y = (F/A)/(dL/L)" );
                    tampilan2.setText ( "  A = F * L/(Y * dL)" );
                    P= Math.pow(10,9);
                    YY = YY*P;
                    AA = FF * LL / (YY * dLdL);
                    tampilan4.setText ( " A = " + df.format ( AA ) + "m2" );
                    AA = AA*1000000;
                    tampilan5.setText ( " A = " + df.format ( AA ) + "mm2" );
                }
            }
        } );
        btnMs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                FsFs = Double.parseDouble ( Fs.getText ( ).toString ( ) );
                dxdx = Double.parseDouble ( dx.getText ( ).toString ( ) );

                if ( FsFs != 0 && AA != 0 && LL != 0 && dxdx != 0 ) {
                    dxdx = dxdx/1000;
                    AA = AA/1000000;
                    YY = YY*Math.pow(10,9);
                    tampilan1.setText ( "Ms = (Fs/A)/(dx/L) " );
                    tampilan2.setText ( "Ms = Fs*L/(A*dx)" );
                    Ms = (FsFs * LL) / (AA * dxdx);
                    tampilan4.setText ( " Ms = " + df.format ( Ms ) + "N/m2" );
                }
            }
        } );
        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {



                tampilan1.setText ( "Varibel yang digunakan :" );
                tampilan2.setText ( " F = gaya " );
                tampilan3.setText ( " Fs = gaya geser" );
                tampilan4.setText ( " A = luas permukaan" );
                tampilan5.setText ( "Ms = modulus geser" );
                tampilan6.setText ( " L = panjang, dL = perubahan panjang " );
                tampilan7.setText ( "Y = modulus Young" );
                tampilan8.setText ( " dx = pergeseran " );


        }} );

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
                F.setText ( "" );
                Fs.setText ( "" );
                A.setText ( "" );
                L.setText ( "" );
                dL.setText ( "" );
                Y.setText ( "" );
                dx.setText ( "" );
            }
        }
        );
    }}