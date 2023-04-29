
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DeltaStar extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;
    private TextView tampilan9;

    private TextView Z1, Z2, Z3, Z12, Z23, Z13;
    private EditText in_Z1, in_Z2, in_Z3, in_Z12, in_Z23, in_Z13;
    private Double Z1Z1, Z2Z2, Z3Z3, Z12Z12, Z13Z13, Z23Z23;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_delta_star );

        tampilan1 = findViewById ( R.id.tvtampilan1 );
        tampilan2 = findViewById ( R.id.tvtampilan2 );
        tampilan3 = findViewById ( R.id.tvtampilan3 );
        tampilan4 = findViewById ( R.id.tvtampilan4 );
        tampilan5 = findViewById ( R.id.tvtampilan5 );
        tampilan6 = findViewById ( R.id.tvtampilan6 );
        tampilan7 = findViewById ( R.id.tvtampilan7 );
        tampilan8 = findViewById ( R.id.tvtampilan8 );
        tampilan9 = findViewById ( R.id.tvtampilan9 );

        in_Z1 = findViewById ( R.id.in_Z1 );
        in_Z2 = findViewById ( R.id.in_Z2 );
        in_Z3 = findViewById ( R.id.in_Z3 );
        in_Z12 = findViewById ( R.id.in_Z12 );
        in_Z13 = findViewById ( R.id.in_Z13 );
        in_Z23 = findViewById ( R.id.in_Z23 );

        Z1 = findViewById ( R.id.Z1 );
        Z2 = findViewById ( R.id.Z2 );
        Z3 = findViewById ( R.id.Z3 );
        Z12 = findViewById ( R.id.Z12 );
        Z13 = findViewById ( R.id.Z13 );
        Z23 = findViewById ( R.id.Z23 );

        Z1.setText ( Html.fromHtml ( "Z<small><sub>1</sub></small>=" ) );
        Z2.setText ( Html.fromHtml ( "Z<small><sub>2</sub></small>=" ) );
        Z3.setText ( Html.fromHtml ( "Z<small><sub>3</sub></small>=" ) );
        Z12.setText ( Html.fromHtml ( "Z<small><sub>12</sub></small>=" ) );
        Z13.setText ( Html.fromHtml ( "Z<small><sub>13</sub></small>=" ) );
        Z23.setText ( Html.fromHtml ( "Z<small><sub>23</sub></small>=" ) );

        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnDS = findViewById ( R.id.btn_DS );
        Button btnSD = findViewById ( R.id.btn_SD );
        Button btnhapus = findViewById ( R.id.btn_Hapus );



        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
            tampilan1.setText ( "Delta-Star" );
            tampilan2.setText ( "kalkulator ini digunakan untuk menghitung:" );
            tampilan3.setText ( " transformasi delta ke Star dan sebaliknya" );
            tampilan4.setText ( " variabel yang digunakan:" );
            tampilan5.setText ( " Star : Z1, Z2, Z3 " );
            tampilan6.setText ( "Delta : Z12  impedansi   Z1 dan Z2" );
            tampilan7.setText ( " Z23 : impedansi Z2 dan Z3" );
            tampilan8.setText ( "Z13 : impedansi Z1 dan Z3 " );
            tampilan9.setText ( " Lebih jelasnya lihat gambar pada kalkulator" );
            }});

        btnSD.setOnClickListener ( new View.OnClickListener ( ) {
             @Override
             public void onClick ( View view ) {
                 DecimalFormat df = new DecimalFormat ( "#.#####" );
                 Z1Z1 = Double.parseDouble ( in_Z1.getText ( ).toString ( ) );
                 Z2Z2 = Double.parseDouble ( in_Z2.getText ( ).toString ( ) );
                 Z3Z3 = Double.parseDouble ( in_Z3.getText ( ).toString ( ) );

                 Z12Z12 = (Z1Z1 * Z2Z2 + Z2Z2 * Z3Z3 + Z1Z1 * Z3Z3) / Z3Z3;
                 tampilan1.setText ( " Z12 = (Z1*Z2 + Z2*Z3 + Z1*Z3)/Z3  " );
                 tampilan2.setText ( " Z12 = " + df.format ( Z12Z12 ) + " ohm" );

                 Z23Z23 = (Z1Z1 * Z2Z2 + Z2Z2 * Z3Z3 + Z1Z1 * Z3Z3) / Z1Z1;
                 tampilan4.setText ( " Z23 = (Z1*Z2 + Z2*Z3 + Z1*Z3)/Z1 ");
                 tampilan5.setText ( " Z23 = " + df.format ( Z23Z23 ) + " ohm" );

                 Z13Z13 = (Z1Z1 * Z2Z2 + Z2Z2 * Z3Z3 + Z1Z1 * Z3Z3) / Z2Z2;
                 tampilan7.setText ( " Z13 = (Z1*Z2 + Z2*Z3 + Z1*Z3)/Z2  " );
                 tampilan8.setText ( " Z13 = " + df.format ( Z13Z13 ) + " ohm" );
             }
        }
        );
        btnDS.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
            DecimalFormat df = new DecimalFormat ( "#.#####" );
            Z12Z12 = Double.parseDouble ( in_Z12.getText ( ).toString ( ) );
            Z23Z23 = Double.parseDouble ( in_Z23.getText ( ).toString ( ) );
            Z13Z13 = Double.parseDouble ( in_Z13.getText ( ).toString ( ) );

            Z1Z1 = (Z12Z12 * Z13Z13)/(Z12Z12 + Z13Z13 + Z23Z23);
            tampilan1.setText ( " Z1 = (Z12*Z13)/(Z12 + Z13 + Z23)  " );
            tampilan2.setText ( " Z1 = " +  df.format ( Z1Z1 ) + " ohm" );

            Z2Z2 = (Z12Z12 * Z23Z23)/(Z12Z12 + Z13Z13 + Z23Z23);
            tampilan4.setText ( " Z2 = (Z1*Z2 + Z2*Z3 + Z1*Z3)/Z1  " );
            tampilan5.setText ( " Z2 = " + df.format ( Z2Z2 ) + " ohm" );

            Z3Z3 = (Z13Z13 * Z23Z23)/(Z12Z12 + Z13Z13 + Z23Z23);
            tampilan7.setText ( " Z3 = (Z1*Z2 + Z2*Z3 + Z1*Z3)/Z2  " );
            tampilan8.setText ( " Z3 = " + df.format ( Z3Z3 ) + " ohm" );
            }
                                   }
        );


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

                in_Z1.setText ( "" );
                in_Z2.setText ( "" );
                in_Z3.setText ( "" );
                in_Z12.setText ( "" );
                in_Z23.setText ( "" );
                in_Z13.setText ( "" );
            }
        } );
    }
}
