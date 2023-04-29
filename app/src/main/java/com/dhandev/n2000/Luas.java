
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Luas extends AppCompatActivity {
    private TextView tampilanmmp;
    private TextView tampilancmp;
    private TextView tampilandmp;
    private TextView tampilanmp;
    private TextView tampilanare;
    private TextView tampilanha;
    private TextView tampilankmp;
    private TextView tampilanincip;
    private TextView tampilankakip;
    private TextView tampilanyardp;
    private TextView tampilanmilp;
    private TextView tampilanacre;


    private EditText mmp, cmp, dmp, mp, are, ha, kmp, incip,kakip,yardp,acre, milp;
    private Double mmp2, cmp2, dmp2, mp2,are2,ha2,kmp2,incip2,kakip2,acre2,yardp2,milp2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_luas );


        tampilanmmp = findViewById ( R.id.in_mmp );
        tampilancmp = findViewById ( R.id.in_cmp );
        tampilandmp = findViewById ( R.id.in_dmp );
        tampilanmp = findViewById ( R.id.in_mp );
        tampilanare = findViewById ( R.id.in_are );
        tampilanha = findViewById ( R.id.in_ha );
        tampilankmp = findViewById ( R.id.in_kmp );
        tampilanincip = findViewById ( R.id.in_incip );
        tampilankakip= findViewById ( R.id.in_kakip );
        tampilanacre = findViewById ( R.id.in_acre );
        tampilanyardp = findViewById ( R.id.in_yardp );
        tampilanmilp = findViewById ( R.id.in_milp );


        mmp = findViewById ( R.id.in_mmp );
        cmp = findViewById ( R.id.in_cmp );
        dmp = findViewById ( R.id.in_dmp );
        mp = findViewById ( R.id.in_mp );
        are = findViewById ( R.id.in_are );
        ha = findViewById ( R.id.in_ha );
        kmp = findViewById ( R.id.in_kmp );
        incip = findViewById ( R.id.in_incip );
        kakip = findViewById ( R.id.in_kakip );
        yardp = findViewById ( R.id.in_yardp );
        milp = findViewById ( R.id.in_milp );
        acre = findViewById ( R.id.in_acre );




        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );



        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####E0" );
                if
                ( !mmp.getText ( ).toString ( ).equals ( "" ))
                {mmp2 = Double.parseDouble(mmp.getText().toString());

                    cmp2 = mmp2/100;
                    dmp2 = cmp2/100;
                    mp2 = dmp2/100;
                    are2 = mp2/100;
                    ha2  = are2/100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !cmp.getText ( ).toString ( ).equals ( "" ))

                {cmp2 = Double.parseDouble(cmp.getText().toString());

                    mmp2 = cmp2*100;
                    dmp2 = cmp2/100;
                    mp2 = dmp2/100;
                    are2 = mp2/100;
                    ha2  = are2/100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !dmp.getText ( ).toString ( ).equals ( "" ))

                {dmp2 = Double.parseDouble(dmp.getText().toString());

                    mp2 = dmp2/100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    are2 = mp2/100;
                    ha2  = are2/100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !mp.getText ( ).toString ( ).equals ( "" ))

                {mp2 = Double.parseDouble(mp.getText().toString());

                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    are2 = mp2/100;
                    ha2  = are2/100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !are.getText ( ).toString ( ).equals ( "" ))

                {are2 = Double.parseDouble(are.getText().toString());
                    mp2 = are2*100;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    ha2  = are2/100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !ha.getText ( ).toString ( ).equals ( "" ))

                {ha2 = Double.parseDouble(ha.getText().toString());

                    are2 = ha2*100;
                    mp2 = are2*100;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    kmp2 = ha2/100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !kmp.getText ( ).toString ( ).equals ( "" ))

                {kmp2 = Double.parseDouble(kmp.getText().toString());

                    are2 = kmp2*100;
                    mp2 = are2*100;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    incip2 = mp2*1550.003;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !incip.getText ( ).toString ( ).equals ( "" ))

                {incip2 = Double.parseDouble(incip.getText().toString());

                    are2 = incip2/155000.31;
                    mp2 = are2*100;
                    kmp2 = mp2/1000000;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    kakip2 = incip2/ 144;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilankakip.setText(df.format(kakip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );


                }
                else if
                (  !kakip.getText ( ).toString ( ).equals ( "" ))

                {kakip2 = Double.parseDouble(kakip.getText().toString());


                    incip2 = kakip2*144;
                    are2 = incip2/155000.31;
                    mp2 = are2*100;
                    kmp2 = mp2/1000000;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );

                }
                else if
                (  !yardp.getText ( ).toString ( ).equals ( "" ))

                {yardp2 = Double.parseDouble(yardp.getText().toString());

                    kakip2 = yardp2 *9;
                    incip2 = kakip2*144;
                    are2 = incip2/155000.31;
                    mp2 = are2*100;
                    kmp2 = mp2/1000000;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    yardp2 = kakip2/9;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilankakip.setText(df.format(kakip2) );


                }
                else if
                (  !acre.getText ( ).toString ( ).equals ( "" ))

                {acre2 = Double.parseDouble(acre.getText().toString());

                    yardp2 = acre2/4840;
                    kakip2 = yardp2 *9;
                    incip2 = kakip2*144;
                    are2 = incip2/155000.31;
                    mp2 = are2*100;
                    kmp2 = mp2/1000000;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    yardp2 = kakip2/9;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilanmilp.setText(df.format(milp2) );
                    tampilanyardp.setText(df.format(yardp2) );
                    tampilankakip.setText(df.format(kakip2) );

                }
                else if
                (  !milp.getText ( ).toString ( ).equals ( "" ))

                {milp2 = Double.parseDouble(milp.getText().toString());
                    acre2 = milp2*640;
                    yardp2 = acre2/4840;
                    kakip2 = yardp2 *9;
                    incip2 = kakip2*144;
                    are2 = incip2/155000.31;
                    mp2 = are2*100;
                    kmp2 = mp2/1000000;
                    dmp2 = mp2*100;
                    cmp2 = mp2*10000;
                    mmp2 = cmp2*100;
                    acre2 = yardp2/4840;
                    milp2 = acre2/640;


                    tampilanmmp.setText(df.format(mmp2) );
                    tampilancmp.setText(df.format(cmp2) );
                    tampilandmp.setText(df.format(dmp2) );
                    tampilanmp.setText(df.format(mp2) );
                    tampilanare.setText(df.format(are2) );
                    tampilanha.setText(df.format(ha2) );
                    tampilankmp.setText(df.format(kmp2) );
                    tampilanincip.setText(df.format(incip2) );
                    tampilanacre.setText(df.format(acre2) );
                    tampilanyardp.setText(df.format(yardp2) );
                    tampilankakip.setText(df.format(kakip2) );

                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {


                mmp.setText ( "" );
                cmp.setText ( "" );
                dmp.setText ( "" );
                mp.setText ( "" );
                ha.setText ( "" );
                are.setText ( "" );
                kmp.setText ( "" );
                incip.setText ( "" );
                kakip.setText ( "" );
                milp.setText ( "" );
                yardp.setText ( "" );
                acre.setText ( "" );

            }
        } );
    }
}



