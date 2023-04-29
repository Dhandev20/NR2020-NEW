
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Panjang extends AppCompatActivity {
    private TextView tampilannm;
    private TextView tampilanum;
    private TextView tampilanmm;
    private TextView tampilancm;
    private TextView tampilandm;
    private TextView tampilanm;
    private TextView tampilankm;
    private TextView tampilaninci;
    private TextView tampilankaki;
    private TextView tampilanyard;
    private TextView tampilanmil;
    private TextView tampilantc;
    private TextView tampilanau;


    private EditText nm, um, mm, cm, dm, m, km, inci,kaki,yard,mil,tc, au;
    private Double nm2, um2, mm2, cm2,dm2,m2,km2,inci2,kaki2,yard2,mil2,tc2,au2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_panjang );


        tampilannm = findViewById ( R.id.in_nm );
        tampilanum = findViewById ( R.id.in_um );
        tampilanmm = findViewById ( R.id.in_mm );
        tampilancm = findViewById ( R.id.in_cm );
        tampilandm = findViewById ( R.id.in_dm );
        tampilanm = findViewById ( R.id.in_m );
        tampilankm = findViewById ( R.id.in_km );
        tampilaninci = findViewById ( R.id.in_inci );
        tampilankaki = findViewById ( R.id.in_kaki );
        tampilanyard= findViewById ( R.id.in_yard );
        tampilanmil= findViewById ( R.id.in_mil );
        tampilantc = findViewById ( R.id.in_tc );
        tampilanau = findViewById ( R.id.in_au );

        nm = findViewById ( R.id.in_nm );
        um = findViewById ( R.id.in_um );
        mm = findViewById ( R.id.in_mm );
        cm = findViewById ( R.id.in_cm );
        dm = findViewById ( R.id.in_dm );
        m = findViewById ( R.id.in_m );
        km = findViewById ( R.id.in_km );
        inci = findViewById ( R.id.in_inci );
        kaki = findViewById ( R.id.in_kaki );
        yard = findViewById ( R.id.in_yard );
        mil = findViewById ( R.id.in_mil );
        tc = findViewById ( R.id.in_tc );
        au = findViewById ( R.id.in_au );


        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );



        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "##0.#####E0" );
                if
                ( !nm.getText ( ).toString ( ).equals ( "" ))
                {
                    nm2 = Double.parseDouble(nm.getText().toString());

                    um2 = nm2/1000;
                    mm2 = um2/1000;
                    cm2 = mm2/10;
                    dm2 = cm2/10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );

                }
            else if
                (  !um.getText ( ).toString ( ).equals ( "" ))

                {um2 = Double.parseDouble(um.getText().toString());
                    nm2 = um2*1000;
                    mm2 = um2/1000;
                    cm2 = mm2/10;
                    dm2 = cm2/10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !mm.getText ( ).toString ( ).equals ( "" ))
                {mm2 = Double.parseDouble(mm.getText().toString());
                    um2 = mm2*1000;
                    nm2 = um2*1000;
                    cm2 = mm2/10;
                    dm2 = cm2/10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !cm.getText ( ).toString ( ).equals ( "" ))
                {cm2 = Double.parseDouble(cm.getText().toString());
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    dm2 = cm2/10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !dm.getText ( ).toString ( ).equals ( "" ))
                {dm2 = Double.parseDouble(dm.getText().toString());
                    cm2 = dm2*10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );

                }
                else if
                (  !m.getText ( ).toString ( ).equals ( "" ))
                { m2 = Double.parseDouble(m.getText().toString());

                    cm2 = m2*100;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    dm2  = cm2/10;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !km.getText ( ).toString ( ).equals ( "" ))
                {km2 = Double.parseDouble(km.getText().toString());
                    cm2 = km2*100000;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    dm2 = m2*10;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !inci.getText ( ).toString ( ).equals ( "" ))
                {inci2 = Double.parseDouble(inci.getText().toString());
                    cm2 = inci2*2.54;
                    dm2 = cm2/10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !kaki.getText ( ).toString ( ).equals ( "" ))
                {kaki2 = Double.parseDouble(kaki.getText().toString());
                    inci2 = 12* kaki2;
                    cm2 = inci2*2.54;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !yard.getText ( ).toString ( ).equals ( "" ))
                {yard2 = Double.parseDouble(yard.getText().toString());
                    dm2 = yard2 * 9.144;
                    cm2 = dm2*10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilandm.setText(df.format(dm2) );
                }
                else if
                (  !mil.getText ( ).toString ( ).equals ( "" ))
                {mil2 = Double.parseDouble(mil.getText().toString());
                    dm2 = mil2*16093.44;
                    cm2 = dm2*10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !tc.getText ( ).toString ( ).equals ( "" ))
                {tc2 = Double.parseDouble(tc.getText().toString());
                    dm2 = tc2 * 9.46*Math.pow(10,16);
                    cm2 = dm2*10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanau.setText(df.format(au2) );
                    tampilanyard.setText(df.format(yard2) );
                }
                else if
                (  !au.getText ( ).toString ( ).equals ( "" ))
                {au2 = Double.parseDouble(au.getText().toString());
                    dm2 = au2*150*Math.pow(10,10);
                    cm2 = dm2*10;
                    um2 = cm2*10000;
                    nm2 = um2*1000;
                    mm2 = cm2*10;
                    m2  = cm2/100;
                    yard2 = m2/0.9144;
                    km2 = m2/1000;
                    inci2 = cm2/ 2.54;
                    kaki2 = inci2/12;
                    mil2 = m2/1609.344;
                    tc2 = km2/(946*Math.pow(10,10));
                    au2 = km2/(150*Math.pow(10,6));

                    tampilannm.setText(df.format(nm2) );
                    tampilanum.setText(df.format(um2) );
                    tampilanmm.setText(df.format(mm2) );
                    tampilancm.setText(df.format(cm2) );
                    tampilanm.setText(df.format(m2) );
                    tampilankm.setText(df.format(km2) );
                    tampilaninci.setText(df.format(inci2) );
                    tampilankaki.setText(df.format(kaki2) );
                    tampilanmil.setText(df.format(mil2) );
                    tampilantc.setText(df.format(tc2) );
                    tampilandm.setText(df.format(dm2) );
                    tampilanyard.setText(df.format(yard2) );

                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                nm.setText ( "" );
                um.setText ( "" );
                mm.setText ( "" );
                cm.setText ( "" );
                dm.setText ( "" );
                m.setText ( "" );
                km.setText ( "" );
                inci.setText ( "" );
                kaki.setText ( "" );
                mil.setText ( "" );
                tc.setText ( "" );
                yard.setText ( "" );
                au.setText ( "" );

            }
        } );
    }
}



