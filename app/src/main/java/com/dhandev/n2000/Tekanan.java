
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Tekanan extends AppCompatActivity {
    private TextView tampilanMPa;
    private TextView tampilanBar;
    private TextView tampilankgfpcm;
    private TextView tampilankPa;
    private TextView tampilanhPa;
    private TextView tampilanmiliBar;
    private TextView tampilankgfpm;
    private TextView tampilanPa;
    private TextView tampilanksi;
    private TextView tampilanpsi;
    private TextView tampilanpsf;
    private TextView tampilanmH2O;
    private TextView tampilancmH2O;
    private TextView tampilanftH2O;
    private TextView tampilaninH2O;
    private TextView tampilanatm;
    private TextView tampilaninHg;
    private TextView tampilanmmHg;
    private TextView tampilancmHg;
    private TextView tampilantorr;



    private EditText MPa, Bar, kgfpcm, kPa, hPa, inH2O, miliBar, kgfpm, Pa, ksi, psi, psf, mH2O, cmH2O, ftH2O,atm, inHg, cmHg, mmHg,torr;
    private Double MPa2, Bar2, kgfpcm2, kPa2, hPa2, inH2O2, miliBar2, kgfpm2, Pa2, ksi2, psi2, psf2, mH2O2, cmH2O2, ftH2O2,atm2, inHg2, cmHg2, mmHg2,torr2;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_tekanan );


        tampilanMPa = findViewById ( R.id.in_MPa );
        tampilanBar = findViewById ( R.id.in_Bar );
        tampilankgfpcm = findViewById ( R.id.in_kgfpcm );
        tampilankPa = findViewById ( R.id.in_kPa );
        tampilanhPa = findViewById ( R.id.in_hPa );
        tampilaninH2O = findViewById ( R.id.in_inH2O );
        tampilanftH2O = findViewById ( R.id.in_ftH2O );
        tampilanmiliBar = findViewById ( R.id.in_miliBar );
        tampilankgfpm = findViewById ( R.id.in_kgfpm );
        tampilanPa = findViewById ( R.id.in_Pa );
        tampilanksi = findViewById ( R.id.in_ksi );
        tampilanpsi = findViewById ( R.id.in_psi );
        tampilanpsf = findViewById ( R.id.in_psf );
        tampilanmH2O = findViewById ( R.id.in_mH2O );
        tampilancmH2O = findViewById ( R.id.in_cmH2O );
        tampilanatm = findViewById ( R.id.in_atm );
        tampilaninHg = findViewById ( R.id.in_inHg );
        tampilancmHg = findViewById ( R.id.in_cmHg );
        tampilanmmHg = findViewById ( R.id.in_mmHg );
        tampilantorr = findViewById ( R.id.in_torr );

        MPa = findViewById ( R.id.in_MPa );
        Bar = findViewById ( R.id.in_Bar );
        kgfpcm = findViewById ( R.id.in_kgfpcm );
        kPa = findViewById ( R.id.in_kPa );
        hPa = findViewById ( R.id.in_hPa );
        inH2O = findViewById ( R.id.in_inH2O );
        ftH2O = findViewById ( R.id.in_ftH2O );
        miliBar = findViewById ( R.id.in_miliBar );
        kgfpm = findViewById ( R.id.in_kgfpm );
        Pa = findViewById ( R.id.in_Pa );
        ksi = findViewById ( R.id.in_ksi );
        psi = findViewById ( R.id.in_psi );
        psf = findViewById ( R.id.in_psf );
        mH2O = findViewById ( R.id.in_mH2O );
        cmH2O = findViewById ( R.id.in_cmH2O );
        atm = findViewById ( R.id.in_atm );
        inHg = findViewById ( R.id.in_inHg );
        cmHg = findViewById ( R.id.in_cmHg );
        mmHg = findViewById ( R.id.in_mmHg );
        torr = findViewById ( R.id.in_torr );



        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####E0" );
                if
                ( !MPa.getText ( ).toString ( ).equals ( "" )) {
                    MPa2 = Double.parseDouble(MPa.getText().toString());

                    Bar2 = MPa2 * 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = MPa2 * 9.869233;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = MPa2 * 750.0638;
                    mmHg2 = MPa2 * 7500.638;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!Bar.getText ( ).toString ( ).equals ( "" )) {
                    Bar2 = Double.parseDouble(Bar.getText().toString());


                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = Bar2*0.9869233;
                    inHg2 = Bar2 * 29.53007;
                    cmHg2 = Bar2 * 75.00638;
                    mmHg2 = Bar2 * 750.0638;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!kgfpcm.getText ( ).toString ( ).equals ( "" )) {
                    kgfpcm2 = Double.parseDouble(kgfpcm.getText().toString());

                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808399;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 /406.79364799;
                    inHg2 = atm2 * 29.921342418;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!kPa.getText ( ).toString ( ).equals ( "" )) {
                    kPa2 = Double.parseDouble(kPa.getText().toString());

                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!hPa.getText ( ).toString ( ).equals ( "" )) {
                    hPa2 = Double.parseDouble(hPa.getText().toString());
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!miliBar.getText ( ).toString ( ).equals ( "" )) {
                    miliBar2 = Double.parseDouble(miliBar.getText().toString());

                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!kgfpm.getText ( ).toString ( ).equals ( "" )) {
                    kgfpm2 = Double.parseDouble(kgfpm.getText().toString());
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));


                } else if (!Pa.getText ( ).toString ( ).equals ( "" )) {
                    Pa2 = Double.parseDouble(Pa.getText().toString());
                   kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!ksi.getText ( ).toString ( ).equals ( "" )) {
                    ksi2 = Double.parseDouble(ksi.getText().toString());

                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!psi.getText ( ).toString ( ).equals ( "" )) {
                    psi2 = Double.parseDouble(psi.getText().toString());

                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!psf.getText ( ).toString ( ).equals ( "" )) {
                    psf2 = Double.parseDouble(psf.getText().toString());

                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));


                } else if (!mH2O.getText ( ).toString ( ).equals ( "" )) {
                    mH2O2 = Double.parseDouble(mH2O.getText().toString());

                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!cmH2O.getText ( ).toString ( ).equals ( "" )) {
                    cmH2O2 = Double.parseDouble(cmH2O.getText().toString());

                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!ftH2O.getText ( ).toString ( ).equals ( "" )) {
                    ftH2O2 = Double.parseDouble(ftH2O.getText().toString());

                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));


                } else if (!inH2O.getText ( ).toString ( ).equals ( "" )) {
                    inH2O2 = Double.parseDouble(inH2O.getText().toString());

                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!atm.getText ( ).toString ( ).equals ( "" )) {
                    atm2 = Double.parseDouble(atm.getText().toString());

                    inH2O2 = atm2*406.793648;
                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;


                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!inHg.getText ( ).toString ( ).equals ( "" )) {
                    inHg2 = Double.parseDouble(inHg.getText().toString());

                    atm2 = inHg2*0.03342096;
                    inH2O2 = atm2*406.793648;
                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;
                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));

                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));


                } else if (!cmHg.getText ( ).toString ( ).equals ( "" )) {
                    cmHg2 = Double.parseDouble(cmHg.getText().toString());
                    inHg2 = cmHg2*0.393700776;
                    atm2 = inHg2*0.03342096;
                    inH2O2 = atm2*406.793648;
                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;
                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));
                    tampilantorr.setText(df.format(torr2));

                } else if (!mmHg.getText ( ).toString ( ).equals ( "" )) {
                    mmHg2 = Double.parseDouble(mmHg.getText().toString());

                    cmHg2 = mmHg2/10;
                    inHg2 = cmHg2*0.393700776;
                    atm2 = inHg2*0.03342096;
                    inH2O2 = atm2*406.793648;
                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;
                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilantorr.setText(df.format(torr2));



                } else if (!torr.getText ( ).toString ( ).equals ( "" )) {
                    torr2 = Double.parseDouble(torr.getText().toString());
                    mmHg2 = torr2;
                    cmHg2 = mmHg2/10;
                    inHg2 = cmHg2*0.393700776;
                    atm2 = inHg2*0.03342096;
                    inH2O2 = atm2*406.793648;
                    ftH2O2 = inH2O2/12;
                    cmH2O2 = ftH2O2*30.48;
                    mH2O2 = cmH2O2/100;
                    psf2 = mH2O2*204.810463;
                    psi2 = psf2/144;
                    ksi2 = psi2/1000;
                    Pa2 = ksi2*6894759;
                    kgfpm2 = Pa2/9.806652;
                    miliBar2 = kgfpm2/10.19716;
                    hPa2 = miliBar2;
                    kPa2 = hPa2/10;
                    kgfpcm2 = kPa2/98.06652;
                    Bar2 = kgfpcm2/1.019716;
                    MPa2 = Bar2/ 10;
                    kgfpcm2 = Bar2 * 1.019716;
                    kPa2 = kgfpcm2 * 98.06652;
                    hPa2 = kPa2 * 10;
                    miliBar2 = hPa2;
                    kgfpm2 = miliBar2 * 10.19716;
                    Pa2 = kgfpm2 * 9.806652;
                    ksi2 = Pa2 * 1.450377 * Math.pow(10, -7);
                    psi2 = ksi2 * 1000;
                    psf2 = psi2 * 144;
                    mH2O2 = psf2 * 0.004883;
                    cmH2O2 = mH2O2 * 100;
                    ftH2O2 = cmH2O2 * 0.032808;
                    inH2O2 = ftH2O2 * 12;
                    atm2 = inH2O2 * 0.002456;
                    inHg2 = atm2 * 29.921342;
                    cmHg2 = inHg2 * 2.54;
                    mmHg2 = cmHg2 * 10;
                    torr2 = mmHg2;
                    tampilanMPa.setText(df.format(MPa2));
                    tampilanBar.setText(df.format(Bar2));
                    tampilankgfpcm.setText(df.format(kgfpcm2));
                    tampilankPa.setText(df.format(kPa2));
                    tampilanhPa.setText(df.format(hPa2));
                    tampilanmiliBar.setText(df.format(miliBar2));
                    tampilankgfpm.setText(df.format(kgfpm2));
                    tampilanPa.setText(df.format(Pa2));
                    tampilanksi.setText(df.format(ksi2));
                    tampilanpsi.setText(df.format(psi2));
                    tampilanpsf.setText(df.format(psf2));
                    tampilanmH2O.setText(df.format(mH2O2));
                    tampilancmH2O.setText(df.format(cmH2O2));
                    tampilanftH2O.setText(df.format(ftH2O2));
                    tampilaninH2O.setText(df.format(inH2O2));
                    tampilanatm.setText(df.format(atm2));
                    tampilaninHg.setText(df.format(inHg2));
                    tampilancmHg.setText(df.format(cmHg2));
                    tampilanmmHg.setText(df.format(mmHg2));


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                MPa.setText ( "" );
                Bar.setText ( "" );
                kgfpcm.setText ( "" );
                kgfpm.setText ( "" );
                kPa.setText ( "" );
                hPa.setText ( "" );
                inH2O.setText ( "" );
                miliBar.setText ( "" );
                Pa.setText ( "" );
                ksi.setText ( "" );
                psi.setText ( "" );
                psf.setText ( "" );
                mH2O.setText ( "" );
                cmH2O.setText ( "" );
                ftH2O.setText ( "" );
                atm.setText ( "" );
                inHg.setText ( "" );
                cmHg.setText ( "" );
                mmHg.setText ( "" );
                torr.setText ( "" );



            }
        } );
    }
}



