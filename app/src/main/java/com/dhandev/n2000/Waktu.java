
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Waktu extends AppCompatActivity {
    private TextView tampilanjam;
    private TextView tampilanmen;
    private TextView tampilandet;
    private TextView tampilanjb;
    private TextView tampilanmb;
    private TextView tampilansb;
    private TextView tampilanhari;
    private TextView tampilanbu;
    private TextView tampilanta;
    private TextView tampilantab;
    private TextView tampilanhab;
    private TextView tampilanpkb;
    private TextView tampilanpk;
    private TextView tampilanbub;



    private EditText jam, men, det, jb, tab, bub, pk, pkb, hab, mb, sb, hari, bu, ta;
    private Double jam2, men2, det2, jb2,jb22, mb2, mb22, sb2,sb22, hari2,hab2, pk2,bu2,ta2, tab2, tab22, bub2, bub22, pkb2,pkb22,hab22;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_waktu );


        tampilanjam = findViewById ( R.id.in_jam );
        tampilanmen = findViewById ( R.id.in_men );
        tampilandet = findViewById ( R.id.in_det );
        tampilanjb = findViewById ( R.id.in_jb );
        tampilanmb = findViewById ( R.id.in_mb );
        tampilansb = findViewById ( R.id.in_sb );
        tampilanhari = findViewById ( R.id.in_hari );
        tampilanpk = findViewById ( R.id.in_pk );
        tampilanhab = findViewById ( R.id.in_hab );
        tampilanbu = findViewById ( R.id.in_bu );
        tampilanta = findViewById ( R.id.in_ta );
        tampilanbub = findViewById ( R.id.in_bub );
        tampilantab = findViewById ( R.id.in_tab );
        tampilanpkb = findViewById ( R.id.in_pkb );


        jam = findViewById ( R.id.in_jam );
        men = findViewById ( R.id.in_men );
        det = findViewById ( R.id.in_det );
        jb = findViewById ( R.id.in_jb );
        mb = findViewById ( R.id.in_mb );
        sb = findViewById ( R.id.in_sb );
        hari = findViewById ( R.id.in_hari );
        bu = findViewById ( R.id.in_bu );
        ta = findViewById ( R.id.in_ta );
        tab = findViewById ( R.id.in_tab );
        bub = findViewById ( R.id.in_bub );
        pk = findViewById ( R.id.in_pk );
        pkb = findViewById ( R.id.in_pkb );
        hab = findViewById ( R.id.in_hab );


        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                if
                ( !det.getText ( ).toString ( ).equals ( "" ))
                {det2 = Double.parseDouble(det.getText().toString());

                    men2 = det2/60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = det2/31557600;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.348214;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );

                }
                else if
                (  !men.getText ( ).toString ( ).equals ( "" ))

                {men2 = Double.parseDouble(men.getText().toString());

                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = men2/525960;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.348214;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );



                }
                else if
                (  !jam.getText ( ).toString ( ).equals ( "" ))

                {jam2 = Double.parseDouble(jam.getText().toString());
                    men2 = jam2*60;
                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = men2/525960;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.3482142857;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );



                }
                else if
                (  !hari.getText ( ).toString ( ).equals ( "" ))

                {hari2 = Double.parseDouble(hari.getText().toString());
                    jam2 = hari2*24;
                    men2 = jam2*60;
                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = hari2/365.25;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.3482142857;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );

                }
                else if
                (  !pk.getText ( ).toString ( ).equals ( "" ))

                {pk2 = Double.parseDouble(pk.getText().toString());
                    hari2 = pk2*7;
                    jam2 = hari2*24;
                    men2 = jam2*60;
                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = hari2/365.25;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.3482142857;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );

                }
                else if
                (  !bu.getText ( ).toString ( ).equals ( "" ))

                {bu2 = Double.parseDouble(bu.getText().toString());
                    pk2 = bu2*4.3482142857;
                    hari2 = pk2*7;
                    jam2 = hari2*24;
                    men2 = jam2*60;
                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = hari2/365.25;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.3482142857;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(tab22) );
                    tampilanbub.setText(df.format(bub22) );
                    tampilanpkb.setText(df.format(pkb22) );
                    tampilanhab.setText(df.format(hab22) );
                    tampilanjb.setText(df.format(jb22) );
                    tampilanmb.setText(df.format(mb22) );
                    tampilansb.setText(df.format(sb2) );

                }
                else if
                (  !ta.getText ( ).toString ( ).equals ( "" ))

                {ta2 = Double.parseDouble(ta.getText().toString());
                    bu2 = ta2*12;
                    pk2 = bu2*4.3482142857;
                    hari2 = pk2*7;
                    jam2 = hari2*24;
                    men2 = jam2*60;
                    det2 = men2*60;
                    jam2 = men2/60;
                    hari2 =  jam2/24;
                    pk2 =  hari2/7;
                    bu2 = det2/2629800;
                    ta2 = bu2/12;

                    tab2 = hari2/365.25;
                    tab22 = Math.floor(tab2);
                    bub2 = (tab2-tab22)*12;
                    bub22 = Math.floor(bub2);
                    pkb2 = (bub2-bub22)*4.3482142857;
                    pkb22 = Math.floor(pkb2);
                    hab2 = (pkb2-pkb22) *7;
                    hab22 = Math.floor(hab2);
                    jb2 = (hab2-hab22)*24;
                    jb22 = Math.floor(jb2);
                    mb2 = (jb2 -jb22)*60;
                    mb22 = Math.floor(mb2);
                    sb2 = (mb2-mb22)*60;

                    tampilandet.setText(df.format(det2) );
                    tampilanmen.setText(df.format(men2) );
                    tampilanjam.setText(df.format(jam2) );
                    tampilanhari.setText(df.format(hari2) );
                    tampilanpk.setText(df.format(pk2) );
                    tampilanbu.setText(df.format(bu2) );
                    tampilanta.setText(df.format(ta2) );
                    tampilantab.setText(df.format(ta2) );

                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                det.setText ( "" );
                men.setText ( "" );
                jam.setText ( "" );
                sb.setText ( "" );
                mb.setText ( "" );
                jb.setText ( "" );
                hari.setText ( "" );
                bu.setText ( "" );
                ta.setText ( "" );
                tab.setText ( "" );
                pk.setText ( "" );
                hab.setText ( "" );
                bub.setText ( "" );
                tab.setText ( "" );



            }
        } );
    }
}



