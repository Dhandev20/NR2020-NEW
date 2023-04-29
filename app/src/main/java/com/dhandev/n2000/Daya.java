
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Daya extends AppCompatActivity {
    private TextView tampilanMW;
    private TextView tampilankW;
    private TextView tampilanW;
    private TextView tampilanmW;
    private TextView tampilanhp;
    private TextView tampilanftlbpm;
    private TextView tampilanftlbps;
    private TextView tampilandBm;
    private TextView tampilankcalpj;
    private TextView tampilancalpj;
    private TextView tampilanBTUps;





    private EditText MW,kW,W,mW,hp,ftlbpm,ftlbps,dBm,calpj,kcalpj,BTUps;
    private Double MW2,kW2,W2,mW2,hp2,ftlbpm2,ftlbps2,dBm2,calpj2,kcalpj2,BTUps2;



    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_daya );


        tampilanMW = findViewById ( R.id.in_MW);
        tampilankW = findViewById ( R.id.in_kW);
        tampilanW = findViewById ( R.id.in_W );
        tampilanmW = findViewById ( R.id.in_mW );
        tampilanhp = findViewById ( R.id.in_hp );
        tampilancalpj = findViewById ( R.id.in_calpj );
        tampilankcalpj = findViewById ( R.id.in_kcalpj );
        tampilandBm = findViewById ( R.id.in_dBm );
        tampilanftlbpm = findViewById ( R.id.in_ftlbpm );
        tampilanftlbps = findViewById ( R.id.in_ftlbps );
        tampilanBTUps = findViewById ( R.id.in_BTUps );



        MW = findViewById ( R.id.in_MW );
        kW = findViewById ( R.id.in_kW );
        W = findViewById ( R.id.in_W );
        mW = findViewById ( R.id.in_mW);
        hp = findViewById ( R.id.in_hp );
        kcalpj = findViewById ( R.id.in_kcalpj );
        calpj = findViewById ( R.id.in_calpj );
        ftlbpm = findViewById ( R.id.in_ftlbpm );
        ftlbps = findViewById ( R.id.in_ftlbps );
        dBm = findViewById ( R.id.in_dBm );
        BTUps = findViewById ( R.id.in_BTUps );





        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#######E0" );
                if
                ( !MW.getText ( ).toString ( ).equals ( "" )) {
                    MW2 = Double.parseDouble(MW.getText().toString());


                    kW2 = MW2*1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;




                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));




                } else if (!kW.getText ( ).toString ( ).equals ( "" )) {
                    kW2 = Double.parseDouble(kW.getText().toString());

                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;




                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!W.getText ( ).toString ( ).equals ( "" )) {
                    W2 = Double.parseDouble(W.getText().toString());
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!mW.getText ( ).toString ( ).equals ( "" )) {
                    mW2 = Double.parseDouble(mW.getText().toString());
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!hp.getText ( ).toString ( ).equals ( "" )) {
                    hp2 = Double.parseDouble(hp.getText().toString());
                    mW2 = hp2*7.4569987158*Math.pow(10,5);
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!kcalpj.getText ( ).toString ( ).equals ( "" )) {
                    kcalpj2 = Double.parseDouble(kcalpj.getText().toString());

                    mW2 = kcalpj2*1.1629999836*Math.pow(10,3);
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!calpj.getText ( ).toString ( ).equals ( "" )) {
                    calpj2 = Double.parseDouble(calpj.getText().toString());

                    mW2 = calpj2*1.1629999836;
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!ftlbpm.getText ( ).toString ( ).equals ( "" )) {
                    ftlbpm2 = Double.parseDouble(ftlbpm.getText().toString());

                    mW2 = ftlbpm2*2.2596965806*Math.pow(10,1);
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!ftlbps.getText ( ).toString ( ).equals ( "" )) {
                    ftlbps2 = Double.parseDouble(ftlbps.getText().toString());

                    mW2 = ftlbps2*1.3558179483*Math.pow(10,3);
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!dBm.getText ( ).toString ( ).equals ( "" )) {
                    dBm2 = Double.parseDouble(dBm.getText().toString());

                    mW2 = dBm2*1.2589254118;
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));

                } else if (!BTUps.getText ( ).toString ( ).equals ( "" )) {
                    BTUps2 = Double.parseDouble(BTUps.getText().toString());

                    mW2 = BTUps2*1.0550558536*Math.pow(10,6);
                    W2 = mW2/1000;
                    kW2 = W2/1000;
                    MW2 = kW2/1000;
                    W2 = kW2*1000;
                    mW2 = W2*1000;
                    hp2 = W2/745.69987158;
                    kcalpj2 = W2*0.85984524;
                    calpj2 = W2*859.84524;
                    ftlbpm2 = W2*44.253728957;
                    ftlbps2 = W2*0.7375621493;
                    dBm2 = W2*30;
                    BTUps2 = W2*0.0009478171;

                    tampilanMW.setText(df.format(MW2));
                    tampilankW.setText(df.format(kW2));
                    tampilanW.setText(df.format(W2));
                    tampilanmW.setText(df.format(mW2));
                    tampilanhp.setText(df.format(hp2));
                    tampilankcalpj.setText(df.format(kcalpj2));
                    tampilancalpj.setText(df.format(calpj2));
                    tampilanftlbpm.setText(df.format(ftlbpm2));
                    tampilanftlbps.setText(df.format(ftlbps2));
                    tampilandBm.setText(df.format(dBm2));
                    tampilanBTUps.setText(df.format(BTUps2));


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                MW.setText ( "" );
                kW.setText ( "" );
                W.setText ( "" );
                mW.setText ( "" );
                hp.setText ( "" );
                kcalpj.setText ( "" );
                ftlbpm.setText ( "" );
                ftlbps.setText ( "" );
                dBm.setText ( "" );
                BTUps.setText ( "" );




            }
        } );
    }


}



