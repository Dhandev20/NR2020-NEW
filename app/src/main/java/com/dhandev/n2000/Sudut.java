
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Sudut extends AppCompatActivity {
    private TextView tampilander;
    private TextView tampilanrad;
    private TextView tampilangr;
    private TextView tampiland;
    private TextView tampilanm;
    private TextView tampilans;


    private EditText der, rad, gr, d,m, s;
    private Double der2, rad2, gr2, d2,m2,m2b,s2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_sudut );


        tampilander = findViewById ( R.id.in_der );
        tampilanrad = findViewById ( R.id.in_rad );
        tampilangr = findViewById ( R.id.in_gr );
        tampiland = findViewById ( R.id.in_d );
        tampilanm = findViewById ( R.id.in_m );
        tampilans = findViewById ( R.id.in_s );

        der = findViewById ( R.id.in_der );
        rad = findViewById ( R.id.in_rad );
         gr = findViewById ( R.id.in_gr );
         d = findViewById ( R.id.in_d );
         m = findViewById ( R.id.in_m );
         s = findViewById ( R.id.in_s );

        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                if
                ( !der.getText ( ).toString ( ).equals ( "" ))
                {der2 = Double.parseDouble(der.getText().toString());

                    rad2 = der2*0.017453;
                    gr2 = der2*1.111111;
                    d2 =  Math.floor(der2);
                    m2 = der2 - d2;
                    m2 = m2*60;
                    m2b = Math.floor(m2);
                    s2 = m2 - m2b;
                    s2 = s2*60;


                    tampilanrad.setText(df.format(rad2) );
                    tampilangr.setText(df.format(gr2) );
                    tampiland.setText(df.format(d2) );
                    tampilanm.setText(df.format(m2b) );
                    tampilans.setText(df.format(s2) );
                }
                else if
                (  !rad.getText ( ).toString ( ).equals ( "" ))

                {rad2 = Double.parseDouble(rad.getText().toString());

                    der2 = rad2/0.017453;
                    gr2 = der2*1.111111;
                    d2 =  Math.floor(der2);
                    m2 = der2 - d2;
                    m2 = m2*60;
                    m2b = Math.floor(m2);
                    s2 = m2 - m2b;
                    s2 = s2*60;


                    tampilander.setText(df.format(der2) );
                    tampilangr.setText(df.format(gr2) );
                    tampiland.setText(df.format(d2) );
                    tampilanm.setText(df.format(m2b) );
                    tampilans.setText(df.format(s2) );

                }
                else if
                (  !gr.getText ( ).toString ( ).equals ( "" ))

                {gr2 = Double.parseDouble(gr.getText().toString());

                    der2 = gr2/1.111111;
                    rad2 = der2*0.017453;
                    d2 =  Math.floor(der2);
                    m2 = der2 - d2;
                    m2 = m2*60;
                    m2b = Math.floor(m2);
                    s2 = m2 - m2b;
                    s2 = s2*60;


                    tampilander.setText(df.format(der2) );
                    tampilanrad.setText(df.format(rad2) );
                    tampiland.setText(df.format(d2) );
                    tampilanm.setText(df.format(m2b) );
                    tampilans.setText(df.format(s2) );


                }
                else if
                (  !d.getText ( ).toString ( ).equals ( "" )&&
                                !m.getText ( ).toString ( ).equals ( "" )&&
                                !s.getText ( ).toString ( ).equals ( "" ))

                {d2 = Double.parseDouble(d.getText().toString());
                m2 = Double.parseDouble(m.getText().toString()) ;
                s2 = Double.parseDouble(s.getText().toString());
                    m2 = m2/60;
                    s2 = s2/60;
                    der2 = d2+m2+s2;
                    rad2 = der2*0.017453;
                    gr2 =  der2*1.111111;



                    tampilander.setText(df.format(der2) );
                    tampilanrad.setText(df.format(rad2) );
                    tampilangr.setText(df.format(gr2) );


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                der.setText ( "" );
                rad.setText ( "" );
                gr.setText ( "" );
                d.setText ( "" );
                m.setText ( "" );
                s.setText ( "" );


            }
        } );
    }
}



