
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Kecepatan extends AppCompatActivity {
    private TextView tampilanmps;
    private TextView tampilankmpj;
    private TextView tampilanmph;
    private TextView tampilanfps;
    private TextView tampilanknot;
    private TextView tampilanc;


    private EditText mps, kmpj, mph, fps,knot, c;
    private Double mps2, kmpj2, mph2, fps2,c2,knot2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kecepatan );


        tampilanmps = findViewById ( R.id.in_mps );
        tampilankmpj = findViewById ( R.id.in_kmpj );
        tampilanmph = findViewById ( R.id.in_mph );
        tampilanfps = findViewById ( R.id.in_fps );
        tampilanc = findViewById ( R.id.in_c );
        tampilanknot = findViewById ( R.id.in_knot );

        mps = findViewById ( R.id.in_mps );
        kmpj = findViewById ( R.id.in_kmpj );
        mph = findViewById ( R.id.in_mph );
        fps = findViewById ( R.id.in_fps );
        knot = findViewById ( R.id.in_knot );
        c = findViewById ( R.id.in_c );

        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####E0" );
                if
                ( !mps.getText ( ).toString ( ).equals ( "" ))
                {mps2 = Double.parseDouble(mps.getText().toString());

                    kmpj2 = mps2*3.6;
                    mph2 = kmpj2*0.621371;
                    fps2 = mph2*1.466667;
                    knot2 = mps2*1.943844;
                    c2  = mps2/(3*Math.pow(10,8));

                    tampilankmpj.setText(df.format(kmpj2) );
                    tampilanmph.setText(df.format(mph2) );
                    tampilanfps.setText(df.format(fps2) );
                    tampilanknot.setText(df.format(knot2) );
                    tampilanc.setText(df.format(c2) );

                }
                else if
                (  !kmpj.getText ( ).toString ( ).equals ( "" ))

                {kmpj2 = Double.parseDouble(kmpj.getText().toString());

                    mps2 = kmpj2/3.6;
                    mph2 = kmpj2*0.621371;
                    fps2 = mph2*1.466667;
                    knot2 = mps2*1.943844;
                    c2  = mps2/(3*Math.pow(10,8));

                    tampilanmps.setText(df.format(mps2) );
                    tampilanmph.setText(df.format(mph2) );
                    tampilanfps.setText(df.format(fps2) );
                    tampilanknot.setText(df.format(knot2) );
                    tampilanc.setText(df.format(c2) );

                }
                else if
                (  !mph.getText ( ).toString ( ).equals ( "" ))

                {mph2 = Double.parseDouble(mph.getText().toString());

                    kmpj2 = mph2/0.621371;
                    mps2 = kmpj2/3.6;
                    fps2 = mph2*1.466667;
                    knot2 = mps2*1.943844;
                    c2  = mps2/(3*Math.pow(10,8));

                    tampilanmps.setText(df.format(mps2) );
                    tampilankmpj.setText(df.format(kmpj2) );
                    tampilanfps.setText(df.format(fps2) );
                    tampilanknot.setText(df.format(knot2) );
                    tampilanc.setText(df.format(c2) );

                }
                else if
                (  !fps.getText ( ).toString ( ).equals ( "" ))

                {fps2 = Double.parseDouble(fps.getText().toString());

                    mph2 = fps2*0.681818;
                    kmpj2 = mph2*1.609344;
                    mps2 = kmpj2/3.6;
                    knot2 = mps2*1.943844;
                    c2  = mps2/(3*Math.pow(10,8));


                    tampilanmps.setText(df.format(mps2) );
                    tampilankmpj.setText(df.format(kmpj2) );
                    tampilanmph.setText(df.format(mph2) );
                    tampilanknot.setText(df.format(knot2) );
                    tampilanc.setText(df.format(c2) );

                }
                else if
                (  !knot.getText ( ).toString ( ).equals ( "" ))

                {knot2 = Double.parseDouble(knot.getText().toString());

                    fps2 = knot2*1.68781;
                    mph2 = fps2*0.681818;
                    kmpj2 = mph2*1.609344;
                    mps2 = kmpj2/3.6;
                    mph2 = kmpj2*0.621371;
                    fps2 = mph2*1.4666667;
                    knot2 = mps2*1.943844;
                    c2  = mps2/(3*Math.pow(10,8));

                    tampilanmps.setText(df.format(mps2) );
                    tampilankmpj.setText(df.format(kmpj2) );
                    tampilanmph.setText(df.format(mph2) );
                    tampilanfps.setText(df.format(fps2) );
                    tampilanc.setText(df.format(c2) );

                }
                else if
                (  !c.getText ( ).toString ( ).equals ( "" ))

                {c2 = Double.parseDouble(c.getText().toString());

                    mps2 = c2*(3*Math.pow(10,8));
                    fps2 = mps2*3.280840;
                    mph2 = fps2*0.681818;
                    kmpj2 = mph2*1.609344;
                    knot2 = mps2*1.943844;

                    tampilanmps.setText(df.format(mps2) );
                    tampilankmpj.setText(df.format(kmpj2) );
                    tampilanmph.setText(df.format(mph2) );
                    tampilanfps.setText(df.format(fps2) );
                    tampilanknot.setText(df.format(knot2) );
                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                mps.setText ( "" );
                kmpj.setText ( "" );
                mph.setText ( "" );
                fps.setText ( "" );
                knot.setText ( "" );
                c.setText ( "" );


            }
        } );
    }
}



