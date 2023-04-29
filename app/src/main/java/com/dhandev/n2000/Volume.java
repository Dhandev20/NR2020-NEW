
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Volume extends AppCompatActivity {
    private TextView tampilanmmk;
    private TextView tampilancmk;
    private TextView tampilandmk;
    private TextView tampilanmk;
    private TextView tampilanml;
    private TextView tampilancl;
    private TextView tampilandl;
    private TextView tampilanl;
    private TextView tampilankl;
    private TextView tampilangal;
    private TextView tampilanbl;



    private EditText mmk, cmk, dmk, mk, ml, cl, dl, l, kl, gal,bl;
    private Double mmk2, cmk2, dmk2, mk2,ml2,cl2,dl2,l2,kl2,gal2,bl2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_volume );


        tampilanmmk = findViewById ( R.id.in_mmk );
        tampilancmk = findViewById ( R.id.in_cmk );
        tampilandmk = findViewById ( R.id.in_dmk );
        tampilanmk = findViewById ( R.id.in_mk );
        tampilanml = findViewById ( R.id.in_ml );
        tampilancl = findViewById ( R.id.in_cl );
        tampilandl = findViewById ( R.id.in_dl );
        tampilanl = findViewById ( R.id.in_l );
        tampilankl = findViewById ( R.id.in_kl );
        tampilangal = findViewById ( R.id.in_gal );
        tampilanbl = findViewById ( R.id.in_bl );



        mmk = findViewById ( R.id.in_mmk );
        cmk = findViewById ( R.id.in_cmk );
        dmk = findViewById ( R.id.in_dmk );
        mk = findViewById ( R.id.in_mk );
        ml = findViewById ( R.id.in_ml );
        cl = findViewById ( R.id.in_cl );
        dl = findViewById ( R.id.in_dl);
        l = findViewById ( R.id.in_l );
        kl = findViewById ( R.id.in_kl );
        gal = findViewById ( R.id.in_gal );
        bl = findViewById ( R.id.in_bl );




        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );



        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####E0" );
                if
                ( !mmk.getText ( ).toString ( ).equals ( "" ))
                {mmk2 = Double.parseDouble(mmk.getText().toString());

                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    mk2 = dmk2/1000;
                    ml2 = cmk2;
                    cl2  = ml2/10;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilancmk.setText(df.format(cmk2) );
                     tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );


                }
                else if
                (  !cmk.getText ( ).toString ( ).equals ( "" ))

                {cmk2 = Double.parseDouble(cmk.getText().toString());
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    mk2 = dmk2/1000;
                    ml2 = cmk2;
                    cl2  = ml2/10;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !dmk.getText ( ).toString ( ).equals ( "" ))

                {dmk2 = Double.parseDouble(dmk.getText().toString());
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    dmk2 = cmk2/1000;
                    mk2 = dmk2/1000;
                    ml2 = cmk2;
                    cl2  = ml2/10;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );
                }
                else if
                (  !mk.getText ( ).toString ( ).equals ( "" ))

                {mk2 = Double.parseDouble(mk.getText().toString());

                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    ml2 = cmk2;
                    cl2  = ml2/10;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !ml.getText ( ).toString ( ).equals ( "" ))

                {ml2 = Double.parseDouble(ml.getText().toString());

                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    cl2  = ml2/10;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !cl.getText ( ).toString ( ).equals ( "" ))

                {cl2 = Double.parseDouble(cl.getText().toString());
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    dl2 = cl2/10;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );


                }
                else if
                (  !dl.getText ( ).toString ( ).equals ( "" ))

                {dl2 = Double.parseDouble(dl.getText().toString());
                    cl2 = dl2*10;
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    l2 = dl2/10;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !l.getText ( ).toString ( ).equals ( "" ))

                {l2 = Double.parseDouble(l.getText().toString());
                    dl2 = l2*10;
                    cl2 = dl2*10;
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    kl2 = l2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !kl.getText ( ).toString ( ).equals ( "" ))

                {kl2 = Double.parseDouble(kl.getText().toString());
                    l2 = kl2*1000;
                    dl2 = l2*10;
                    cl2 = dl2*10;
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilangal.setText(df.format(gal2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !gal.getText ( ).toString ( ).equals ( "" ))

                {gal2 = Double.parseDouble(gal.getText().toString());
                    kl2 = gal2*0.0045461;
                    l2 = kl2*1000;
                    dl2 = l2*10;
                    cl2 = dl2*10;
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    gal2 = l2/ 4.5461;
                    bl2 = gal2/35;



                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilanbl.setText(df.format(bl2) );

                }
                else if
                (  !bl.getText ( ).toString ( ).equals ( "" ))

                {bl2 = Double.parseDouble(bl.getText().toString());
                    gal2 = bl2*35;
                    kl2 = gal2*0.0045461;
                    l2 = kl2*1000;
                    dl2 = l2*10;
                    cl2 = dl2*10;
                    ml2 = cl2*10;
                    mk2 = ml2/1000000;
                    dmk2 = mk2*1000;
                    cmk2 = dmk2*1000;
                    mmk2 = cmk2*1000;
                    cmk2 = mmk2/1000;
                    dmk2 = cmk2/1000;
                    gal2 = l2/ 4.5461;




                    tampilanmmk.setText(df.format(mmk2) );
                    tampilancmk.setText(df.format(cmk2) );
                    tampilandmk.setText(df.format(dmk2) );
                    tampilanmk.setText(df.format(mk2) );
                    tampilanml.setText(df.format(ml2) );
                    tampilancl.setText(df.format(cl2) );
                    tampilandl.setText(df.format(dl2) );
                    tampilanl.setText(df.format(l2) );
                    tampilankl.setText(df.format(kl2) );
                    tampilangal.setText(df.format(gal2) );


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                mmk.setText ( "" );
                cmk.setText ( "" );
                dmk.setText ( "" );
                mk.setText ( "" );
                ml.setText ( "" );
                cl.setText ( "" );
                dl.setText ( "" );
                l.setText ( "" );
                kl.setText ( "" );
                gal.setText ( "" );
                bl.setText ( "" );


            }
        } );
    }
}



