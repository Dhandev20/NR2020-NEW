package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HukumKepplerVar extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;


    private EditText T1, T2, R1, R2;

    private Double R1R1, R2R2, T1T1, T2T2;


    private Double result;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hukum_keppler_var );

        tampilan1 = findViewById ( R.id.tampilan1 );
        tampilan2 = findViewById ( R.id.tampilan2 );
        tampilan3 = findViewById ( R.id.tampilan3 );
        tampilan4 = findViewById ( R.id.tampilan4 );
        tampilan5 = findViewById ( R.id.tampilan5 );


        R1 = findViewById ( R.id.in_R1 );
        R2 = findViewById ( R.id.in_R2 );
        T1 = findViewById ( R.id.in_T1 );
        T2 = findViewById ( R.id.in_T2 );
        Button btnr1 = findViewById ( R.id.btn_R1 );
        Button btnr2 = findViewById ( R.id.btn_R2 );
        Button btnr12 = findViewById ( R.id.btn_R12 );
        Button btnT12 = findViewById ( R.id.btn_T12 );
        Button btnT1 = findViewById ( R.id.btn_T1 );
        Button btnT2 = findViewById ( R.id.btn_T2 );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnKeppler = findViewById ( R.id.btn_Keppler);
        Button btnhapus = findViewById ( R.id.btn_Hapus );



        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {

                tampilan1.setText ( "Hukum Keppler" );
                tampilan2.setText ( "R1 : jari-jari orbit planet 1" );
                tampilan3.setText ( " R2 : jari-jari orbit planet 2" );
                tampilan4.setText ( " T1 : periode revolusi planet 1" );
                tampilan5.setText ( " T2 : periode revolusi planet 2" );


            }});

        btnr1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                tampilan1.setText ( "T^2 = C R^3" );
                tampilan2.setText ( " R1 = (R2 * (T1/T2)^2/3" );
                R1R1 = T1T1 / T2T2;
                R1R1 = Math.pow ( R1R1 , 0.66666 );
                R1R1 = R1R1 * R2R2;
                tampilan3.setText ( " R1 = " + df.format ( R1R1 ) + "R" );

            }
        } );


        btnr2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                tampilan1.setText ( "T^2 = C R^3" );
                tampilan2.setText ( " R2 = (R1 * (T2/T1)^2/3" );
                R2R2 = T2T2 / T1T1;
                R2R2 = Math.pow ( R2R2 , 0.66666 );
                R2R2= R1R1 * R2R2;
                tampilan3.setText ( " R2 = " + df.format ( R2R2 ) + "R" );
            }}  );

        btnr12.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                tampilan1.setText ( "(T1/T2)^2 = (R1/R2)^3" );
                tampilan2.setText ( " R1/R2 = (T1/T2)^2/3" );
                R1R1 = T1T1 / T2T2;
                R1R1 = Math.pow ( R1R1 , 0.66666 );
                tampilan3.setText ( " R1/R2 = " + df.format ( R1R1 ) + "" );

            }
        } );

        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override

            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                R2R2= Double.parseDouble ( R2.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                tampilan1.setText ( "T^2 = C R^3" );
                tampilan2.setText ( " T1 = T2 * (R1/R2)^3/2" );
                T1T1 =R1R1 / R2R2;
                T1T1 = Math.pow ( T1T1 , 1.5 );
                T1T1 = T1T1 * T2T2;
                tampilan3.setText ( " T1 = " + df.format ( T1T1 ) + " Tahun" );
            }
        } );
        btnT2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );

                R2R2 = Double.parseDouble ( R2.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );

                tampilan1.setText ( "T^2 = C R^3" );
                tampilan2.setText ( " T2 = T1 * (R2/R1)^3/2" );
                T2T2 =R2R2 / R1R1;
                T2T2 = Math.pow ( T2T2 , 1.5 );
                T2T2 = T1T1 * T2T2;
                tampilan3.setText ( " T2 = " + df.format ( T2T2 ) + " Tahun" );

            }
        } );

        btnT12.setOnClickListener ( new View.OnClickListener ( ) {
            @Override

            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###" );
                R2R2= Double.parseDouble ( R2.getText ( ).toString ( ) );
                R1R1 = Double.parseDouble ( R1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                tampilan1.setText ( "T^2 = C R^3" );
                tampilan2.setText ( " (T1/T2)^2 = (R1/R2)^3" );
                tampilan3.setText ( " (T1/T2) = (R1/R2)^1.5" );

                T1T1 =R1R1 / R2R2;
                T1T1 = Math.pow ( T1T1 , 1.5 );

                tampilan3.setText ( " T1/T2 = " + df.format ( T1T1 ) + " " );
            }
        } );

        btnKeppler.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( HukumKepplerVar.this , HukumKepler.class );
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

                R1.setText ( "" );
                R2.setText ( "" );
                T1.setText ( "" );
                T2.setText ( "" );


            }
        } );
    }
}
