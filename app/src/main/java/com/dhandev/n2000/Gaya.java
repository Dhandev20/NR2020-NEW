
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Gaya extends AppCompatActivity {
    private TextView tampilanN;
    private TextView tampilandyne;
    private TextView tampilankgf;
    private TextView tampilanpoundal;
    private TextView tampilanpoundg;
    private TextView tampilanpN;
    private TextView tampilannN;
    private TextView tampilanuN;
    private TextView tampilanmN;
    private TextView tampilankN;
    private TextView tampilanMN;
    private TextView tampilanGN;
    private TextView tampilanozf;
    private TextView tampilangf;



    private EditText N, dyne, kgf,lbf, pdl, ozf, gf, nN, pN, uN, mN, kN, MN, GN;
    private Double N2, dyne2, kgf2, lbf2,pdl2,ozf2, gf2, pN2,nN2, uN2,mN2, kN2,MN2,GN2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_gaya );


        tampilanN = findViewById ( R.id.in_N );
        tampilandyne = findViewById ( R.id.in_dyne );
        tampilankgf = findViewById ( R.id.in_kgf );
        tampilanpoundal = findViewById ( R.id.in_pound );
        tampilanpoundg = findViewById ( R.id.in_poundg );
        tampilangf = findViewById ( R.id.in_gf );
        tampilanozf = findViewById ( R.id.in_onsgaya );
        tampilanpN = findViewById ( R.id.in_pN );
        tampilannN = findViewById ( R.id.in_nN );
        tampilanuN = findViewById ( R.id.in_uN );
        tampilanmN = findViewById ( R.id.in_mN );
        tampilankN = findViewById ( R.id.in_kN );
        tampilanMN = findViewById ( R.id.in_MN );
        tampilanGN = findViewById ( R.id.in_GN );


        N = findViewById ( R.id.in_N );
        gf = findViewById ( R.id.in_gf );
        kgf = findViewById ( R.id.in_kgf );
        ozf = findViewById ( R.id.in_onsgaya );
        pdl = findViewById ( R.id.in_pound );
        lbf = findViewById ( R.id.in_poundg );
        dyne = findViewById ( R.id.in_dyne );
        pN = findViewById ( R.id.in_pN );
        nN = findViewById ( R.id.in_nN );
        uN = findViewById ( R.id.in_uN );
        mN = findViewById ( R.id.in_mN );
        kN = findViewById ( R.id.in_kN );
        MN = findViewById ( R.id.in_MN );
        GN = findViewById ( R.id.in_GN );


        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####E0" );
                if
                ( !N.getText ( ).toString ( ).equals ( "" ))
                {N2 = Double.parseDouble(N.getText().toString());

                 gf2 = N2*101.97162;
                 kgf2 = gf2*0.0010;
                 ozf2 = kgf2 *35.273962;
                 pdl2 = ozf2 *2.010878;
                 lbf2 = pdl2/32.174049;
                dyne2 = N2*Math.pow(10,5);
                   pN2 = N2*Math.pow(10,12);
                   nN2 = pN2/1000;
                   uN2 = nN2/1000;
                   mN2 = uN2/1000;
                   kN2 = mN2/1000000;
                   MN2 = kN2/1000;
                   GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );


                }
                else if
                (  !gf.getText ( ).toString ( ).equals ( "" ))

                {gf2 = Double.parseDouble(gf.getText().toString());

                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );


                }
                else if
                (  !kgf.getText ( ).toString ( ).equals ( "" ))

                {kgf2 = Double.parseDouble(kgf.getText().toString());
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !ozf.getText ( ).toString ( ).equals ( "" ))

                {ozf2 = Double.parseDouble(ozf.getText().toString());
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !pdl.getText ( ).toString ( ).equals ( "" ))

                {pdl2 = Double.parseDouble(pdl.getText().toString());
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !lbf.getText ( ).toString ( ).equals ( "" ))

                {lbf2 = Double.parseDouble(lbf.getText().toString());
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !dyne.getText ( ).toString ( ).equals ( "" ))

                {dyne2 = Double.parseDouble(dyne.getText().toString());
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !pN.getText ( ).toString ( ).equals ( "" ))

                {pN2 = Double.parseDouble(pN.getText().toString());
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !nN.getText ( ).toString ( ).equals ( "" ))

                {nN2 = Double.parseDouble(nN.getText().toString());
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );
                }
                else if
                (  !uN.getText ( ).toString ( ).equals ( "" ))

                {uN2 = Double.parseDouble(uN.getText().toString());
                   nN2 = uN2*1000;
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !mN.getText ( ).toString ( ).equals ( "" ))

                {mN2 = Double.parseDouble(mN.getText().toString());
                    uN2 = mN2*1000;
                    nN2 = uN2*1000;
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );
                }
                else if
                (  !kN.getText ( ).toString ( ).equals ( "" ))

                {kN2 = Double.parseDouble(kN.getText().toString());
                    mN2 = kN2 *1000000;
                    uN2 = mN2*1000;
                    nN2 = uN2*1000;
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );

                }
                else if
                (  !MN.getText ( ).toString ( ).equals ( "" ))

                {MN2 = Double.parseDouble(MN.getText().toString());
                    kN2 = MN2 *1000;
                    mN2 = kN2 *1000000;
                    uN2 = mN2*1000;
                    nN2 = uN2*1000;
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );
                }
                else if
                (  !GN.getText ( ).toString ( ).equals ( "" ))

                {GN2 = Double.parseDouble(GN.getText().toString());
                    MN2 = GN2*1000;
                    kN2 = MN2 *1000;
                    mN2 = kN2 *1000000;
                    uN2 = mN2*1000;
                    nN2 = uN2*1000;
                    pN2 = nN2*1000;
                    dyne2 = pN2/Math.pow(10,7);
                    lbf2 = dyne2/444822.16;
                    pdl2 = lbf2*32.174049;
                    ozf2 = pdl2/2.010878;
                    kgf2 = ozf2/35.273962;
                    gf2 = kgf2*1000;
                    N2 = gf2/101.97162;
                    kgf2 = gf2*0.0010;
                    ozf2 = kgf2 *35.273962;
                    pdl2 = ozf2 *2.010878;
                    lbf2 = pdl2/32.174049;
                    dyne2 = N2*Math.pow(10,5);
                    pN2 = N2*Math.pow(10,12);
                    nN2 = pN2/1000;
                    uN2 = nN2/1000;
                    mN2 = uN2/1000;
                    kN2 = mN2/1000000;
                    MN2 = kN2/1000;
                    GN2 = MN2/1000;



                    tampilanN.setText(df.format(N2) );
                    tampilangf.setText(df.format(gf2) );
                    tampilankgf.setText(df.format(kgf2) );
                    tampilanozf.setText(df.format(ozf2) );
                    tampilanpoundal.setText(df.format(pdl2) );
                    tampilanpoundg.setText(df.format(lbf2) );
                    tampilandyne.setText(df.format(dyne2) );
                    tampilanpN.setText(df.format(pN2) );
                    tampilannN.setText(df.format(nN2) );
                    tampilanuN.setText(df.format(uN2) );
                    tampilanmN.setText(df.format(mN2) );
                    tampilankN.setText(df.format(kN2) );
                    tampilanMN.setText(df.format(MN2) );
                    tampilanGN.setText(df.format(GN2) );


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                N.setText ( "" );
                dyne.setText ( "" );
                lbf.setText ( "" );
                pdl.setText ( "" );
                ozf.setText ( "" );
                gf.setText ( "" );
                kgf.setText ( "" );
                pN.setText ( "" );
                nN.setText ( "" );
                uN.setText ( "" );
                mN.setText ( "" );
                kN.setText ( "" );
                MN.setText ( "" );
                GN.setText ( "" );



            }
        } );
    }
}



