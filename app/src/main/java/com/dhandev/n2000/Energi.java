
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Energi extends AppCompatActivity {
    private TextView tampilankWh;
    private TextView tampilanWh;
    private TextView tampilanMj;
    private TextView tampilankj;
    private TextView tampilanj;
    private TextView tampilanWs;
    private TextView tampilanev;
    private TextView tampilanKuad;
    private TextView tampilanTerm;
    private TextView tampilanBTU;
    private TextView tampilanftlb;
    private TextView tampilankcal;
    private TextView tampilancal;
    private TextView tampilanth;
    private TextView tampilanerg;
    private TextView tampilanhph;
    private TextView tampilanlatm;
    private TextView tampilanMev;
    private TextView tampilankev;





    private EditText kWh, Wh, Mj, kj, j, Ws,Mev,kev, ev, Kuad, Term,BTU, kcal,cal, th, erg, ftlb,hph, latm;
    private Double kWh2, Wh2, Mj2, kj2,j2, Ws2,Mev2, kev2, ev2, Kuad2, Term2,BTU2, kcal2,cal2, th2,erg2, ftlb2,hph2, latm2;

    public Energi() {
    }


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_energi );


        tampilankWh = findViewById ( R.id.in_kWh);
        tampilanWh = findViewById ( R.id.in_Wh);
        tampilanMj = findViewById ( R.id.in_Mj );
        tampilankj = findViewById ( R.id.in_kj );
        tampilanj = findViewById ( R.id.in_j );
        tampilanWs = findViewById ( R.id.in_Ws );
        tampilanMev = findViewById ( R.id.in_Mev );
        tampilankev = findViewById ( R.id.in_kev );
        tampilanev = findViewById ( R.id.in_ev );
        tampilanKuad = findViewById ( R.id.in_Kuad );
        tampilanTerm = findViewById ( R.id.in_Term );
        tampilanBTU = findViewById ( R.id.in_BTU );
        tampilankcal = findViewById ( R.id.in_kcal );
        tampilancal = findViewById ( R.id.in_cal );
        tampilanth = findViewById ( R.id.in_th );
        tampilanerg = findViewById ( R.id.in_erg );
        tampilanftlb = findViewById ( R.id.in_ftlb );
        tampilanhph = findViewById ( R.id.in_hph );
        tampilanlatm = findViewById ( R.id.in_latm );



        kWh = findViewById ( R.id.in_kWh );
        Wh = findViewById ( R.id.in_Wh );
        Mj = findViewById ( R.id.in_Mj );
        kj = findViewById ( R.id.in_kj );
        j = findViewById ( R.id.in_j );
        Ws = findViewById ( R.id.in_Ws );
        Mev = findViewById ( R.id.in_Mev );
        kev = findViewById ( R.id.in_kev );
        ev = findViewById ( R.id.in_ev );
        Kuad = findViewById ( R.id.in_Kuad );
        Term = findViewById ( R.id.in_Term );
        BTU = findViewById ( R.id.in_BTU );
        ftlb = findViewById ( R.id.in_ftlb );
        kcal = findViewById ( R.id.in_kcal );
        cal = findViewById ( R.id.in_cal );
        th = findViewById ( R.id.in_th );
        erg = findViewById ( R.id.in_erg);
        hph = findViewById ( R.id.in_hph);
        latm = findViewById ( R.id.in_latm);




        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnhitung = findViewById ( R.id.btn_Hitung );

        btnhitung.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#######E0" );
                if
                ( !kWh.getText ( ).toString ( ).equals ( "" )) {
                    kWh2 = Double.parseDouble(kWh.getText().toString());


                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;




                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));



                } else if (!Wh.getText ( ).toString ( ).equals ( "" )) {
                    Wh2 = Double.parseDouble(Wh.getText().toString());

                    kWh2 = Wh2/1000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;




                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));



                } else if (!Mj.getText ( ).toString ( ).equals ( "" )) {
                    Mj2 = Double.parseDouble(Mj.getText().toString());


                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;




                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));


                } else if (!kj.getText ( ).toString ( ).equals ( "" )) {
                    kj2 = Double.parseDouble(kj.getText().toString());

                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;




                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));



                } else if (!j.getText ( ).toString ( ).equals ( "" )) {
                    j2 = Double.parseDouble(j.getText().toString());

                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!Ws.getText ( ).toString ( ).equals ( "" )) {
                    Ws2 = Double.parseDouble(Ws.getText().toString());

                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = kWh2*2.2469423327868*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = kWh2*2655223.7373982;
                    kcal2 = kWh2*860.05064742702;
                    cal2 = kWh2*860050.64742702;
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!ev.getText ( ).toString ( ).equals ( "" )) {
                    ev2 = Double.parseDouble(ev.getText().toString());

                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Ws2 = ev2*1.6021774232*Math.pow(10,-19);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = ev2*1.1817375486*Math.pow(10,-19);
                    th2 = ev2*3.8267350861*Math.pow(10,-26);
                    kcal2 = ev2*3.8267350861*Math.pow(10,-23);
                    cal2 = kcal2*1000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanev.setText(df.format(ev2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!kev.getText ( ).toString ( ).equals ( "" )) {
                    kev2 = Double.parseDouble(kev.getText().toString());

                    ev2 = kev2*1000;
                    Mev2 = kev2/1000;
                    Ws2 = ev2*1.6021774232*Math.pow(10,-19);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = ev2*1.1817375486*Math.pow(10,-19);
                    th2 = ev2*3.8267350861*Math.pow(10,-26);
                    kcal2 = ev2*3.8267350861*Math.pow(10,-23);
                    cal2 = kcal2*1000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanev.setText(df.format(ev2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!Mev.getText ( ).toString ( ).equals ( "" )) {
                    Mev2 = Double.parseDouble(Mev.getText().toString());
                    kev2 = Mev2*1000;
                    ev2 = kev2*1000;
                    Mev2 = kev2/1000;
                    Ws2 = ev2*1.6021774232*Math.pow(10,-19);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    Kuad2 = ev2/(6.5851632821*Math.pow(10,36));
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = ev2*1.1817375486*Math.pow(10,-19);
                    th2 = ev2*3.8267350861*Math.pow(10,-26);
                    kcal2 = ev2*3.8267350861*Math.pow(10,-23);
                    cal2 = kcal2*1000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanev.setText(df.format(ev2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));





                } else if (!Kuad.getText ( ).toString ( ).equals ( "" )) {
                    Kuad2 = Double.parseDouble(Kuad.getText().toString());

                    ev2 = Kuad2*6.5851632821*Math.pow(10,36);
                    Ws2 = Kuad2*1.0550599939*Math.pow(10,18);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = Kuad2*6.5851632821*Math.pow(10,36);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Term2 = Kuad2*Math.pow(10,10);
                    BTU2 = Term2*100000;
                    ftlb2 = Kuad2*7.7819347142*Math.pow(10,17);
                    kcal2 = Kuad2*2.5199675379*Math.pow(10,14);
                    cal2 = Kuad2*2.5199675379*Math.pow(10,17);
                    th2 = cal2/1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));

                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));



                } else if (!Term.getText ( ).toString ( ).equals ( "" )) {
                    Term2 = Double.parseDouble(Term.getText().toString());

                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = Kuad2*1.0550599939*Math.pow(10,18);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 =  Term2*6.5851632821*Math.pow(10,36);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    BTU2 = Term2*100000;
                    ftlb2 = Term2*7.7819347142*Math.pow(10,17);
                    th2 =  Term2*2.5199675379*Math.pow(10,4);
                    kcal2 = Term2*2.5199675379*Math.pow(10,4);
                    cal2 = Term2*2.5199675379*Math.pow(10,11);
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));

                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!BTU.getText ( ).toString ( ).equals ( "" )) {
                    BTU2 = Double.parseDouble(BTU.getText().toString());

                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = BTU2*1.0550558752*Math.pow(10,3);
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = BTU2*6.5851375756*Math.pow(10,21);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    ftlb2 = BTU2*7.7819043358*Math.pow(10,2);
                    th2 =   BTU2*2.5199577007*Math.pow(10,-4);
                    kcal2 =  BTU2*2.5199577007*Math.pow(10,-1);
                    cal2 =  BTU2*2.5199577007*Math.pow(10,2);
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));

                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!ftlb.getText ( ).toString ( ).equals ( "" )) {
                    ftlb2 = Double.parseDouble(ftlb.getText().toString());

                    BTU2 = ftlb2*0.0012850274858;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = ftlb2*1.3557810912;
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = ftlb2*8.46211581578*Math.pow(10,18);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    Kuad2 = ftlb2*1.2850274858*Math.pow(10,-18);
                    th2 = ftlb2*3.2382275494*Math.pow(10,-7);
                    kcal2 = ftlb2*3.2382275494*Math.pow(10,-4);
                    cal2 = ftlb2*0.32382275494;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!th.getText ( ).toString ( ).equals ( "" )) {
                    th2 = Double.parseDouble(th.getText().toString());

                    ftlb2 = th2*3.0881091114*Math.pow(10,6);
                    BTU2 = th2*3968.3205782;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = th2*4186799.9409;
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = th2*2.6131936952*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    kcal2 = th2*1000;
                    cal2 = th2*1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!kcal.getText ( ).toString ( ).equals ( "" )) {
                    kcal2 = Double.parseDouble(kcal.getText().toString());

                    th2 = kcal2/1000;
                    ftlb2 = th2*3.0881091114*Math.pow(10,6);
                    BTU2 = th2*3968.3205782;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = th2*4186799.9409;
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = th2*2.6131936952*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    kcal2 = th2*1000;
                    cal2 = th2*1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!cal.getText ( ).toString ( ).equals ( "" )) {
                    cal2 = Double.parseDouble(cal.getText().toString());

                    kcal2 = cal2/1000;
                    th2 = kcal2/1000;
                    ftlb2 = th2*3.0881091114*Math.pow(10,6);
                    BTU2 = th2*3968.3205782;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = th2*4186799.9409;
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = th2*2.6131936952*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    kcal2 = th2*1000;
                    cal2 = th2*1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!latm.getText ( ).toString ( ).equals ( "" )) {
                    latm2 = Double.parseDouble(latm.getText().toString());

                    j2 = latm2/0.0098692367;
                    cal2 = j2*0.2388459;
                    kcal2 = cal2/1000;
                    th2 = kcal2/1000;
                    ftlb2 = th2*3.0881091114*Math.pow(10,6);
                    BTU2 = th2*3968.3205782;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    Ws2 = th2*4186799.9409;
                    j2 = Ws2;
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    Ws2 = j2;
                    ev2 = th2*2.6131936952*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    kcal2 = th2*1000;
                    cal2 = th2*1000000;
                    erg2 = kWh2*36*Math.pow(10,12);
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));

                } else if (!erg.getText ( ).toString ( ).equals ( "" )) {
                    erg2 = Double.parseDouble(erg.getText().toString());

                    j2 = erg2*Math.pow(10,-7);
                    Ws2 = j2;
                    cal2 = j2*0.2388459;
                    kcal2 = cal2/1000;
                    th2 = kcal2/1000;
                    ftlb2 = th2*3.0881091114*Math.pow(10,6);
                    BTU2 = th2*3968.3205782;
                    Term2 = BTU2/100000;
                    Kuad2 = Term2/Math.pow(10,10);
                    kj2 = j2/1000;
                    Mj2 = kj2/1000;
                    kWh2 = Mj2/3.6000;
                    Wh2 = kWh2*1000;
                    Mj2 = kWh2*3.6;
                    kj2 = Mj2*1000;
                    j2 = kj2*1000;
                    ev2 = th2*2.6131936952*Math.pow(10,25);
                    kev2 = ev2/1000;
                    Mev2 = kev2/1000;
                    kcal2 = th2*1000;
                    cal2 = th2*1000000;
                    hph2 = erg2*2.685*Math.pow(10,-13);
                    latm2 = j2*0.0098692367;


                    tampilankWh.setText(df.format(kWh2));
                    tampilanWh.setText(df.format(Wh2));
                    tampilanMj.setText(df.format(Mj2));
                    tampilankj.setText(df.format(kj2));
                    tampilanj.setText(df.format(j2));
                    tampilanWs.setText(df.format(Ws2));
                    tampilanMev.setText(df.format(Mev2));
                    tampilankev.setText(df.format(kev2));
                    tampilanev.setText(df.format(ev2));
                    tampilanKuad.setText(df.format(Kuad2));
                    tampilanTerm.setText(df.format(Term2));
                    tampilanBTU.setText(df.format(BTU2));
                    tampilankcal.setText(df.format(kcal2));
                    tampilancal.setText(df.format(cal2));
                    tampilanth.setText(df.format(th2));
                    tampilanerg.setText(df.format(erg2));
                    tampilanftlb.setText(df.format(ftlb2));
                    tampilanlatm.setText(df.format(latm2));
                    tampilanhph.setText(df.format(hph2));


                }}} );

        btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                kWh.setText ( "" );
                Mj.setText ( "" );
                kj.setText ( "" );
                j.setText ( "" );
                Ws.setText ( "" );
                Mev.setText ( "" );
                kev.setText ( "" );
                ev.setText ( "" );
                Kuad.setText ( "" );
                Term.setText ( "" );
                BTU.setText ( "" );
                kcal.setText ( "" );
                cal.setText ( "" );
                th.setText ( "" );
                erg.setText ( "" );
                ftlb.setText ( "" );
                latm.setText ( "" );
                Wh.setText ( "" );
                hph.setText ( "" );




            }
        } );
    }

    public TextView getTampilanlatm() {
        return tampilanlatm;
    }

    public void setTampilanlatm(TextView tampilanlatm) {
        this.tampilanlatm = tampilanlatm;
    }
}



