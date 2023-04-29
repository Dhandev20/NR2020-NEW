
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Massa extends AppCompatActivity {
    private TextView tampilanug;
    private TextView tampilanmg;
    private TextView tampilang;
    private TextView tampilankg;
    private TextView tampilankwt;
    private TextView tampilanton;
    private TextView tampilankt;
    private TextView tampilanMt;
    private TextView tampilangr;
    private TextView tampilandr;
    private TextView tampilanoz;
    private TextView tampilanpon;
    private TextView tampilancwt;


    private EditText ug, mg, g, kg, kwt, ton, kt, Mt,gr,dr,oz,pon, cwt;
    private Double ug2, mg2, g2, kg2,kwt2,ton2,kt2,Mt2,gr2,dr2,oz2,pon2,cwt2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_massa );


        tampilanug = findViewById ( R.id.in_ug );
        tampilanmg = findViewById ( R.id.in_mg );
        tampilang = findViewById ( R.id.in_g);
        tampilankg = findViewById ( R.id.in_kg );
        tampilankwt = findViewById ( R.id.in_kwt );
        tampilanton = findViewById ( R.id.in_ton );
        tampilankt = findViewById ( R.id.in_kt );
        tampilanMt = findViewById ( R.id.in_Mt );
        tampilangr = findViewById ( R.id.in_grain );
        tampilandr = findViewById ( R.id.in_dram );
        tampilanoz= findViewById ( R.id.in_ons );
        tampilanpon = findViewById ( R.id.in_pon );
        tampilancwt = findViewById ( R.id.in_cwt );

        ug = findViewById ( R.id.in_ug );
        mg = findViewById ( R.id.in_mg );
        g = findViewById ( R.id.in_g );
        kg = findViewById ( R.id.in_kg );
        kwt = findViewById ( R.id.in_kwt );
        ton = findViewById ( R.id.in_ton );
        kt = findViewById ( R.id.in_kt );
        Mt = findViewById ( R.id.in_Mt );
        gr = findViewById ( R.id.in_grain );
        dr = findViewById ( R.id.in_dram );
        oz = findViewById ( R.id.in_ons );
        pon = findViewById ( R.id.in_pon );
        cwt = findViewById ( R.id.in_cwt );


        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );



        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "##0.#####E0" );
                if
                ( !ug.getText ( ).toString ( ).equals ( "" )) {
                    ug2 = Double.parseDouble(ug.getText().toString());

                    mg2 = ug2 / 1000;
                    g2 = mg2 / 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!mg.getText ( ).toString ( ).equals ( "" ))
                {mg2 = Double.parseDouble(mg.getText().toString());

                    ug2 = mg2 * 1000;
                    g2 = mg2 / 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanug.setText(df.format(ug2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));
                }
                else if (!g.getText ( ).toString ( ).equals ( "" ))
                {g2 = Double.parseDouble(g.getText().toString());
                    ug2 = g2*1000000;
                    mg2 = g2 * 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilanug.setText(df.format(ug2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!kg.getText ( ).toString ( ).equals ( "" ))
                {kg2 = Double.parseDouble(kg.getText().toString());
                    mg2 = kg2*1000000;
                    ug2 = mg2 * 1000;
                    g2 = mg2 / 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilanug.setText(df.format(ug2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!kwt.getText ( ).toString ( ).equals ( "" ))
                {kwt2 = Double.parseDouble(kwt.getText().toString());

                    kg2 = kwt2 * 100;
                    mg2 = kg2 * 1000000;
                    g2 = mg2 / 1000;
                    ug2 = g2 *1000000;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilanug.setText(df.format(ug2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!ton.getText ( ).toString ( ).equals ( "" ))
                {ton2 = Double.parseDouble(ton.getText().toString());
                     g2 = ton2 * 1000000;
                    mg2 = g2 * 1000;
                    ug2 = mg2*1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanug.setText(df.format(ug2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!kt.getText ( ).toString ( ).equals ( "" ))
                {kt2 = Double.parseDouble(kt.getText().toString());
                    ton2 = kt2 * 1000;
                    kg2 = ton2*1000;
                    g2 = kg2 * 1000;
                    mg2 = g2 * 1000;
                    ug2 = mg2 * 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilanug.setText(df.format(ug2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!Mt.getText ( ).toString ( ).equals ( "" ))
                {Mt2 = Double.parseDouble(Mt.getText().toString());

                    ton2 = Mt2* 1000000;
                    kg2 = ton2*1000;
                    g2 = kg2 * 1000;
                    g2 = kg2 * 1000;
                    mg2 = g2*1000;
                    ug2 = mg2*1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanug.setText(df.format(ug2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!gr.getText ( ).toString ( ).equals ( "" ))
                {gr2 = Double.parseDouble(gr.getText().toString());

                    ug2 = gr2 *64798.81;
                    mg2 = ug2 / 1000;
                    g2 = mg2/1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilanug.setText(df.format(ug2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!dr.getText ( ).toString ( ).equals ( "" ))
                {dr2 = Double.parseDouble(dr.getText().toString());

                    ug2 = dr2*1771845.1953;
                    mg2 = ug2 / 1000;
                    g2 = mg2 / 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilanug.setText(df.format(ug2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!oz.getText ( ).toString ( ).equals ( "" ))
                {oz2 = Double.parseDouble(oz.getText().toString());

                    mg2 = oz2*28349.52313;
                    ug2 = mg2 * 1000;
                    g2 = mg2 / 1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanug.setText(df.format(ug2));
                    tampilanpon.setText(df.format(pon2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!pon.getText ( ).toString ( ).equals ( "" ))
                {pon2 = Double.parseDouble(pon.getText().toString());

                    mg2 = pon2*453592.37;
                    g2 = mg2 / 1000;
                    ug2 = mg2*1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;
                    cwt2 = kg2 * 0.02205;


                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanug.setText(df.format(ug2));
                    tampilancwt.setText(df.format(cwt2));

                }
                else if (!cwt.getText ( ).toString ( ).equals ( "" ))
                {cwt2 = Double.parseDouble(cwt.getText().toString());

                    mg2 = cwt2 *45359237;
                    g2 = mg2 / 1000;
                    ug2 = mg2*1000;
                    kg2 = g2 / 1000;
                    kwt2 = kg2 / 100;
                    ton2 = kg2 / 1000;
                    kt2 = ton2 / 1000;
                    Mt2 = kt2 / 1000;

                    gr2 = kg2 * 15432.358;
                    dr2 = kg2 * 563.383;
                    oz2 = kg2 * 35.274;
                    pon2 = kg2 * 2.205;



                    tampilanmg.setText(df.format(mg2));
                    tampilang.setText(df.format(g2));
                    tampilankg.setText(df.format(kg2));
                    tampilankwt.setText(df.format(kwt2));
                    tampilanton.setText(df.format(ton2));
                    tampilankt.setText(df.format(kt2));
                    tampilanMt.setText(df.format(Mt2));
                    tampilangr.setText(df.format(gr2));
                    tampilandr.setText(df.format(dr2));
                    tampilanoz.setText(df.format(oz2));
                    tampilanpon.setText(df.format(pon2));
                    tampilanug.setText(df.format(ug2));




                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                ug.setText ( "" );
                mg.setText ( "" );
                 g.setText ( "" );
                kg.setText ( "" );
                kwt.setText ( "" );
                ton.setText ( "" );
                kt.setText ( "" );
                Mt.setText ( "" );
                gr.setText ( "" );
                dr.setText ( "" );
                oz.setText ( "" );
                pon.setText ( "" );
                cwt.setText ( "" );

            }
        } );
    }
}



