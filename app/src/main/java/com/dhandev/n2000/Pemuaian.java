
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Pemuaian extends AppCompatActivity {
    private TextView tampilan1;
    private TextView tampilan2;
    private TextView tampilan3;
    private TextView tampilan4;
    private TextView tampilan5;
    private TextView tampilan6;
    private TextView tampilan7;
    private TextView tampilan8;
    private TextView tampilan9;
    private TextView tampilan10;
    private TextView tampilan11;
    private TextView tampilan12;
    private TextView tampilan13;
    private TextView tampilan14;
    private TextView tampilan15;

    private EditText alfa, beta, gama, Lo, Lt, Ao, At, Vo, Vt,To,Tt, dt,dL,dA,dV,m;
    private Double alfa2, beta2, gama2, lo2, lt2, ao2, at2, vo2, vt2, to2,tt2, dtdt, dl, da, dv,mm,ro, rot;
    private Double suhu1, suhu2, suhu3, suhu4;

    //variabel hasil hitung dimualai huruf besar mis Siob, Sok
    //variabel input dimulai huruf kecil mis mok, kecuali satu huruf mis L
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_pemuaian );


        tampilan1 = findViewById ( R.id.tampilan1 );
        tampilan2 = findViewById ( R.id.tampilan2 );
        tampilan3 = findViewById ( R.id.tampilan3 );
        tampilan4 = findViewById ( R.id.tampilan4 );
        tampilan5 = findViewById ( R.id.tampilan5 );
        tampilan6 = findViewById ( R.id.tampilan6 );
        tampilan7 = findViewById ( R.id.tampilan7 );
        tampilan8 = findViewById ( R.id.tampilan8 );
        tampilan9 = findViewById ( R.id.tampilan9 );
        tampilan10= findViewById ( R.id.tampilan10 );
        tampilan11 = findViewById ( R.id.tampilan11 );
        tampilan12 = findViewById ( R.id.tampilan12 );
        tampilan13 = findViewById ( R.id.tampilan13 );
        tampilan14 = findViewById ( R.id.tampilan14 );
        tampilan15 = findViewById ( R.id.tampilan15 );
        alfa = findViewById ( R.id.in_alfa );
        beta = findViewById ( R.id.in_beta );
        gama = findViewById ( R.id.in_gama );
        Lo = findViewById ( R.id.in_Lo );
        Lt = findViewById ( R.id.in_Lt );
        Ao = findViewById ( R.id.in_Ao );
        At = findViewById ( R.id.in_At );
        Vo = findViewById ( R.id.in_Vo );
        Vt = findViewById ( R.id.in_Vt );
        To = findViewById ( R.id.in_To );
        Tt = findViewById ( R.id.in_Tt );
        dt = findViewById ( R.id.in_dt );
        dL = findViewById ( R.id.in_dL );
        dA = findViewById ( R.id.in_dA );
        dV = findViewById ( R.id.in_dV );
        m = findViewById ( R.id.in_m );


        Button btnalfa = findViewById ( R.id.btn_Alfa );
        Button btnbeta = findViewById ( R.id.btn_Beta );
        Button btngama = findViewById ( R.id.btn_Gama );
        Button btnlo = findViewById ( R.id.btn_Lo );
        Button btnlt = findViewById ( R.id.btn_Lt );
        Button btnao = findViewById ( R.id.btn_Ao );
        Button btnat = findViewById ( R.id.btn_At);
        Button btnvo = findViewById ( R.id.btn_Vo );
        Button btnvt = findViewById ( R.id.btn_Vt );
        Button btnto = findViewById ( R.id.btn_To );
        Button btntt = findViewById ( R.id.btn_Tt );
        Button btndT = findViewById ( R.id.btn_dT);
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btndl = findViewById ( R.id.btn_dL );
        Button btnda = findViewById ( R.id.btn_dA );
        Button btndv = findViewById ( R.id.btn_dV);
        Button btnro = findViewById ( R.id.btn_ro);
        Button info = findViewById ( R.id.btn_Info);

        info.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator Pemuaian:" );
                tampilan2.setText ( "alfa : koefisien muai panjang" );
                tampilan3.setText ( " beta : koefisien muai luas" );
                tampilan4.setText ( " gamma: koefisien muai volume" );
                tampilan5.setText ( " Lo : panjang mula-mula atau saat temperatur To" );
                tampilan6.setText ( " Lt : panjang pada sat temperatur Tt" );
                tampilan7.setText ( " Ao : Luas saat temperatur To " );
                tampilan8.setText ( " At : luas saat temperatur Tt" );
                tampilan9.setText ( " Vo : volume saat temperatur To" );
                tampilan10.setText ( " Vt: volume saat temperatur Tt " );
                tampilan11.setText ( " dL : perubahan panjang = Lt - Lo" );
                tampilan12.setText ( " dA : perubahan luas = At - Ao" );
                tampilan13.setText ( " dV : perubahan volume = Vt - Vo" );
                tampilan14.setText ( " dT : perubahan temperature " );
                tampilan15.setText ( " m   : massa benda,   ro : massa jenis " );
            }});


  btndT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );
                if
                ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                  !Lt.getText ( ).toString ( ).equals ( ""  ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" )) {

                    lo2 = Double.parseDouble(Lo.getText().toString());
                    lt2 = Double.parseDouble(Lt.getText().toString());
                    alfa2 = Double.parseDouble(alfa.getText().toString());
                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText(" dL =  Lo * alfa * dT)");
                    tampilan2.setText(" dT =  (Lt - Lo)/(Lo * alfa)");

                         dtdt = (lt2 - lo2) / (lo2 * alfa2);

                    tampilan3.setText(" dT = " + df.format(dtdt) + "  C");
                    tampilan4.setText(" dT = " + dtdt.doubleValue() + " C");

         } else  if
                ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                  !dL.getText ( ).toString ( ).equals ( ""  ) &&
                  !alfa.getText ( ).toString ( ).equals ( "" )){

                    lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                    dl = Double.parseDouble ( dL.getText ( ).toString ( ) );
                    alfa2 = Double.parseDouble (alfa.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;

                         dl=dl/1000;
                    tampilan1.setText ( " dT =  dL/(alfa*Lo)");

                        dtdt = dl/(lo2*alfa2);

                    tampilan2.setText ( " dT = " + df.format ( dtdt ) + " oC"  );
                    tampilan3.setText ( " dT = " + dtdt.doubleValue () + " o C"  );
                } else  if

                ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                                !dA.getText ( ).toString ( ).equals ( ""  ) &&
                                !beta.getText ( ).toString ( ).equals ( "" )){

                          ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                          da = Double.parseDouble ( dA.getText ( ).toString ( ) );
                          beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                    beta2 = Math.pow(10,-6)*beta2;
                          da = da/10000;
                    tampilan1.setText ( " dT =  dA/(beta*Ao)" );

                         dtdt = da / (beta2 * ao2);

                    tampilan2.setText ( " dT = " + df.format ( dtdt )+"oC" );
                    tampilan3.setText ( " dT = " + dtdt.doubleValue () + " o C"  );
                } else  if

                ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                  !At.getText ( ).toString ( ).equals ( ""  ) &&
                  !beta.getText ( ).toString ( ).equals ( "" )) {
                    ao2 = Double.parseDouble(Ao.getText().toString());
                    at2 = Double.parseDouble(At.getText().toString());
                    beta2 = Double.parseDouble(beta.getText().toString());
                    beta2 = Math.pow(10,-6)*beta2;

                    tampilan1.setText(" dT= (At - Ao)/(beta*Ao)");
                    dtdt = (at2 - ao2) / (beta2 * ao2);
                    tampilan2.setText(" dT = " + df.format(dtdt) + "oC");
                    tampilan3.setText(" dT = " + dtdt.doubleValue() + " o C");
                }else if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                            !dA.getText ( ).toString ( ).equals ( ""  ) &&
                            !alfa.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        da = Double.parseDouble ( dA.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                        da = da/10000;
                        tampilan1.setText ( " dT =  dA/(beta * Ao)" );
                        tampilan2.setText ( " dT =  dA/(2*alfa*Ao)" );

                        dtdt = da / (2*alfa2 * ao2);

                        tampilan3.setText ( " dT = " + df.format ( dtdt )+"oC" );
                        tampilan4.setText ( " dT = " + dtdt.doubleValue () + " o C"  );

                    } else  if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                                    !At.getText ( ).toString ( ).equals ( ""  ) &&
                                    !alfa.getText ( ).toString ( ).equals ( "" )){
                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                        tampilan1.setText ( " dT= (At - Ao)/(beta*Ao)" );
                        tampilan2.setText ( " dT= (At - Ao)/(2*alfa*Ao)" );
                        dtdt = (at2 -ao2) / (beta2 * ao2);
                        tampilan3.setText ( " dT = " + df.format ( dtdt )+"oC" );
                        tampilan4.setText ( " dT = " + dtdt.doubleValue () + " o C"  );



                } else  if

                 ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                   !dV.getText ( ).toString ( ).equals ( ""  ) &&
                   !gama.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                        gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                    gama2 = Math.pow(10,-6)*gama2;
                        dv = dv/1000;
                    tampilan1.setText ( " dT =  dV/(gama*Vo)" );

                         dtdt = dv / (gama2 * vo2);

                    tampilan2.setText ( " dT = " + df.format ( dtdt )+"oC" );
                    tampilan3.setText ( " dT = " + dtdt.doubleValue () + " o C"  );

                } else  if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                  !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                  !gama.getText ( ).toString ( ).equals ( "" )) {
                        vo2 = Double.parseDouble(Vo.getText().toString());
                        vt2 = Double.parseDouble(Vt.getText().toString());
                    gama2 = Double.parseDouble(gama.getText().toString());
                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText(" dT= (Vt - Vo)/(gama*Vo)");

                          dtdt = (vt2 - vo2) / (gama2 * vo2);

                    tampilan2.setText(" dT = " + df.format(dtdt) + "oC");
                    tampilan3.setText(" dT = " + dtdt.doubleValue() + " oC");


                } else  if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                !dV.getText ( ).toString ( ).equals ( ""  ) &&
                                !alfa.getText ( ).toString ( ).equals ( "" )){

                    vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                    dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                    alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                    dv = dv/1000;
                    tampilan1.setText ( " dT =  dV/(gama*Vo)" );
                    tampilan2.setText ( " dT =  dV/(3*alfa*Vo)" );

                    dtdt = dv / (3*alfa2 * vo2);

                    tampilan3.setText ( " dT = " + df.format ( dtdt )+"oC" );
                    tampilan4.setText ( " dT = " + dtdt.doubleValue () + " o C"  );

                } else  if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                                !alfa.getText ( ).toString ( ).equals ( "" )) {
                    vo2 = Double.parseDouble(Vo.getText().toString());
                    vt2 = Double.parseDouble(Vt.getText().toString());
                    alfa2 = Double.parseDouble(alfa.getText().toString());
                    alfa2 = Math.pow(10,-6)*alfa2;

                    tampilan1.setText(" dT= (Vt - Vo)/(gama*Vo)");
                    tampilan2.setText(" dT= (Vt - Vo)/(3*alfa*Vo)");

                    dtdt = (vt2 - vo2) / (3*alfa2 * vo2);

                    tampilan3.setText(" dT = " + df.format(dtdt) + "oC");
                    tampilan4.setText(" dT = " + dtdt.doubleValue() + " oC");


                }}});


 btnalfa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.############" );
                if
                ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                      !Lt.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )) {

                    lo2 = Double.parseDouble(Lo.getText().toString());
                    lt2 = Double.parseDouble(Lt.getText().toString());
                    to2 = Double.parseDouble(To.getText().toString());
                    tt2 = Double.parseDouble(Tt.getText().toString());

                    tampilan1.setText(" alfa =  (Lt - Lo)/Lo(Tt - To)");
                    alfa2 = (lt2 - lo2) / (lo2 * (tt2 - to2));
                    tampilan2.setText(" alfa = " + df.format(alfa2) + " per C");
                    tampilan3.setText(" alfa = " + alfa2.doubleValue() + " per C");
                } else  if
                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                            !dL.getText ( ).toString ( ).equals ( ""  ) &&
                            !To.getText ( ).toString ( ).equals ( ""  ) &&
                            !Tt.getText ( ).toString ( ).equals ( "" )){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        dl = Double.parseDouble ( dL.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                        dl=dl/1000;
                        tampilan1.setText ( " alfa =  dL/Lo(Tt - To)");
                        alfa2 = dl/(lo2*(tt2-to2));
                        tampilan2.setText ( " alfa = " + df.format ( alfa2 ) + " per C"  );
                        tampilan3.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );
                } else  if

                        ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                          !Lt.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                            lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                            lt2 = Double.parseDouble ( Lt.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                     tampilan1.setText ( " alfa =  (Lt - Lo)/Lo dT" );

                         alfa2 = (lt2 - lo2) / (lo2 * dtdt);

                     tampilan2.setText ( " alfa = " + df.format ( alfa2 )+"per C" );
                     tampilan3.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );
                } else  if

                ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                  !dL.getText ( ).toString ( ).equals ( ""  ) &&
                  !dt.getText ( ).toString ( ).equals ( "" )){
                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        dl = Double.parseDouble ( dL.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                            dl=dl/1000;
                    tampilan1.setText ( " alfa =  dL/Lo dT" );

                          alfa2 = dl / (lo2 * dtdt);

                    tampilan2.setText ( " alfa = " + df.format ( alfa2 )+"per C" );
                    tampilan3.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );



                } else  if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                            !At.getText ( ).toString ( ).equals ( ""  ) &&
                            !To.getText ( ).toString ( ).equals ( ""  ) &&
                            !Tt.getText ( ).toString ( ).equals ( "" )) {

                        ao2 = Double.parseDouble(Ao.getText().toString());
                        at2 = Double.parseDouble(At.getText().toString());
                        to2 = Double.parseDouble(To.getText().toString());
                        tt2 = Double.parseDouble(Tt.getText().toString());

                        tampilan1.setText(" beta =  (At - Ao)/Ao(Tt - To)");

                        beta2 = (at2 - ao2) / (ao2 * (tt2 - to2));

                        tampilan2.setText(" beta = " + df.format(beta2) + "per C");
                        tampilan3.setText(" beta = " + beta2.doubleValue() + " per C");
                              alfa2=beta2/2;
                        tampilan4.setText(" alfa =  beta/2");
                        tampilan5.setText ( " alfa = " + df.format ( alfa2 )+"per C" );
                        tampilan6.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );

                    } else     if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                                    !dA.getText ( ).toString ( ).equals ( ""  ) &&
                                    !To.getText ( ).toString ( ).equals ( ""  ) &&
                                    !Tt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        da = Double.parseDouble ( dA.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                        da = da/10000;
                        tampilan1.setText ( " beta =  dA/Ao(Tt - To)");

                        beta2 = da/(ao2*(tt2-to2));

                        tampilan2.setText ( " beta = " + df.format ( beta2 ) +"per C" );
                        tampilan3.setText ( " beta = " + beta2.doubleValue () + " per C"  );
                             alfa2=beta2/2;
                        tampilan4.setText(" alfa =  beta/2");
                        tampilan5.setText ( " alfa = " + df.format ( alfa2 )+"per C" );
                        tampilan6.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );

            } else if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !At.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );


                        tampilan1.setText ( " beta =  (At - Ao)/Ao dT");

                            beta2 = (at2 - ao2)/(ao2* dtdt);

                        tampilan2.setText ( " beta = " + df.format ( beta2 ) + "per C" );
                        tampilan3.setText ( " beta = " + beta2.doubleValue () + " per C"  );
                              alfa2=beta2/2;
                        tampilan4.setText(" alfa =  beta/2");
                        tampilan5.setText ( " alfa = " + df.format ( alfa2 )+"per C" );
                        tampilan6.setText ( " alfa = " + alfa2.doubleValue () + " per C"  );

               } else if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !dA.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )) {

                    ao2 = Double.parseDouble(Ao.getText().toString());
                    da = Double.parseDouble(dA.getText().toString());
                    dtdt = Double.parseDouble(dt.getText().toString());
                    da = da / 10000;

                    tampilan1.setText(" beta =  dA/Ao dT");

                           beta2 = da / (ao2 * dtdt);

                    tampilan2.setText(" beta = " + df.format(beta2) + "per C");
                    tampilan3.setText(" beta = " + beta2.doubleValue() + " per C");
                          alfa2 = beta2 / 2;
                    tampilan4.setText(" alfa =  beta/2");
                    tampilan5.setText(" alfa = " + df.format(alfa2) + "per C");
                    tampilan6.setText(" alfa = " + alfa2.doubleValue() + " per C");

                } else
                    if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                            !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                            !To.getText ( ).toString ( ).equals ( ""  ) &&
                            !Tt.getText ( ).toString ( ).equals ( "" )) {

                        vo2 = Double.parseDouble(Vo.getText().toString());
                        vt2 = Double.parseDouble(Vt.getText().toString());
                        to2 = Double.parseDouble(To.getText().toString());
                        tt2 = Double.parseDouble(Tt.getText().toString());

                        tampilan1.setText(" gama =  (Vt - Vo)/Vo(Tt - To)");
                        gama2 = (vt2 - vo2) / (vo2 * (tt2 - to2));
                        tampilan2.setText(" gama = " + df.format(gama2) + "per C");
                        tampilan3.setText(" gama = " + gama2.doubleValue() + " per C");
                        alfa2 = gama2 / 3;
                        tampilan4.setText(" alfa =  gama/3");
                        tampilan5.setText(" alfa = " + df.format(alfa2) + "per C");
                        tampilan6.setText(" alfa = " + alfa2.doubleValue() + " per C");


                    } else if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                    !dV.getText ( ).toString ( ).equals ( ""  ) &&
                                    !To.getText ( ).toString ( ).equals ( ""  ) &&
                                    !Tt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                        tampilan1.setText ( " gama =  dV/Vo(Tt - To)");
                        gama2 = dv/(vo2*(tt2-to2));
                        tampilan2.setText ( " gama = " + df.format ( gama2 ) + "per C" );
                        tampilan3.setText ( " gama = " + gama2.doubleValue () + " per C"  );
                        alfa2 = gama2 / 3;
                        tampilan4.setText(" alfa =  gama/3");
                        tampilan5.setText(" alfa = " + df.format(alfa2) + "per C");
                        tampilan6.setText(" alfa = " + alfa2.doubleValue() + " per C");


                    } else if

                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                    !dV.getText ( ).toString ( ).equals ( ""  ) &&
                                    !dt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                        tampilan1.setText ( " gama =  dV/Vo dT");
                        gama2 = dv/(vo2*dtdt);
                        tampilan2.setText ( " gama = " + df.format ( gama2 )  + "per C");
                        tampilan3.setText ( " gama = " + gama2.doubleValue () + " per C"  );
                        alfa2 = gama2 / 3;
                        tampilan4.setText(" alfa =  gama/3");
                        tampilan5.setText(" alfa = " + df.format(alfa2) + "per C");
                        tampilan6.setText(" alfa = " + alfa2.doubleValue() + " per C");

                    }else if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                    !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                                    !dt.getText ( ).toString ( ).equals ( "" )) {

                        vo2 = Double.parseDouble(Vo.getText().toString());
                        vt2 = Double.parseDouble(Vt.getText().toString());
                        dtdt = Double.parseDouble(dt.getText().toString());


                        tampilan1.setText(" gama =  (Vt - Vo)/Vo*dT");
                        gama2 = (vt2 - vo2) / (vo2*dtdt);
                        tampilan2.setText(" gama = " + df.format(gama2) + "per C");
                        tampilan3.setText(" gama = " + gama2.doubleValue() + " per C");
                        alfa2 = gama2 / 3;
                        tampilan4.setText(" alfa =  gama/3");
                        tampilan5.setText(" alfa = " + df.format(alfa2) + "per C");
                        tampilan6.setText(" alfa = " + alfa2.doubleValue() + " per C");


                    }
            }}
        );








   btnbeta.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !At.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )) {

                    ao2 = Double.parseDouble(Ao.getText().toString());
                    at2 = Double.parseDouble(At.getText().toString());
                    to2 = Double.parseDouble(To.getText().toString());
                    tt2 = Double.parseDouble(Tt.getText().toString());

                    tampilan1.setText(" beta =  (At - Ao)/Ao(Tt - To)");
                    beta2 = (at2 - ao2) / (ao2 * (tt2 - to2));
                    tampilan2.setText(" beta = " + df.format(beta2) + "per C");
                    tampilan3.setText(" beta = " + beta2.doubleValue() + " per C");
                } else     if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                            !dA.getText ( ).toString ( ).equals ( ""  ) &&
                            !To.getText ( ).toString ( ).equals ( ""  ) &&
                            !Tt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        da = Double.parseDouble ( dA.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                     da = da/10000;
                        tampilan1.setText ( " beta =  dA/Ao(Tt - To)");
                        beta2 = da/(ao2*(tt2-to2));
                        tampilan2.setText ( " beta = " + df.format ( beta2 ) +"per C" );
                        tampilan3.setText ( " beta = " + beta2.doubleValue () + " per C"  );

                } else if
                        ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                          !At.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                            ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                            at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );


                    tampilan1.setText ( " beta =  (At - Ao)/Ao dT");
                    beta2 = (at2 - ao2)/(ao2* dtdt);
                    tampilan2.setText ( " beta = " + df.format ( beta2 ) + "per C" );
                    tampilan3.setText ( " beta = " + beta2.doubleValue () + " per C"  );
                } else if
                ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                                !dA.getText ( ).toString ( ).equals ( ""  ) &&
                                !dt.getText ( ).toString ( ).equals ( "" )){

                    ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                    da = Double.parseDouble ( dA.getText ( ).toString ( ) );
                    dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                     da = da/10000;

                    tampilan1.setText ( " beta =  dA/Ao dT");
                    beta2 = da/(ao2* dtdt);
                    tampilan2.setText ( " beta = " + df.format ( beta2 ) + "per C" );
                    tampilan3.setText ( " beta = " + beta2.doubleValue () + " per C"  );

        }}}
        );
  btngama.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                      !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )) {

                    vo2 = Double.parseDouble(Vo.getText().toString());
                    vt2 = Double.parseDouble(Vt.getText().toString());
                    to2 = Double.parseDouble(To.getText().toString());
                    tt2 = Double.parseDouble(Tt.getText().toString());

                    tampilan1.setText(" gama =  (Vt - Vo)/Vo(Tt - To)");
                    gama2 = (vt2 - vo2) / (vo2 * (tt2 - to2));
                    tampilan2.setText(" gama = " + df.format(gama2) + "per C");
                    tampilan3.setText(" gama = " + gama2.doubleValue() + " per C");

                }else if
                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                                !dt.getText ( ).toString ( ).equals ( "" )) {

                    vo2 = Double.parseDouble(Vo.getText().toString());
                    vt2 = Double.parseDouble(Vt.getText().toString());
                   dtdt = Double.parseDouble(dt.getText().toString());


                    tampilan1.setText(" gama =  (Vt - Vo)/Vo*dT");
                    gama2 = (vt2 - vo2) / (vo2*dtdt);
                    tampilan2.setText(" gama = " + df.format(gama2) + "per C");
                    tampilan3.setText(" gama = " + gama2.doubleValue() + " per C");

                } else if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                            !dV.getText ( ).toString ( ).equals ( ""  ) &&
                            !To.getText ( ).toString ( ).equals ( ""  ) &&
                            !Tt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                        tampilan1.setText ( " gama =  dV/Vo(Tt - To)");
                        gama2 = dv/(vo2*(tt2-to2));
                        tampilan2.setText ( " gama = " + df.format ( gama2 ) + "per C" );
                        tampilan3.setText ( " gama = " + gama2.doubleValue () + " per C"  );

            } else if

                        ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                          !dV.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                            vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                            dv = Double.parseDouble ( dV.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                    tampilan1.setText ( " gama =  dV/Vo dT");
                            gama2 = dv/(vo2*dtdt);
                    tampilan2.setText ( " gama = " + df.format ( gama2 )  + "per C");
                    tampilan3.setText ( " gama = " + gama2.doubleValue () + " per C"  );
                }}}

        );


  btnlt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                if
                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                    !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( ""  ) ){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                          alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Lt =  Lo(1 + alfa*(Tt - To))");
                         lt2 = alfa2*(tt2-to2);
                         lt2 = lo2*(1 + lt2);
                    tampilan2.setText ( " Lt = " + df.format ( lt2 )+"m"  );
                         lt2=100*lt2;
                    tampilan3.setText ( " Lt = " + df.format ( lt2 )+"cm"  );
                          lt2=10*lt2;
                    tampilan4.setText ( " Lt = " + df.format ( lt2 )+"mm"  );


                } else if

                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                    !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                         alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Lt =  Lo(1 + alfa* dT)");

                          lt2 = lo2*(1 + alfa2*dtdt);

                    tampilan2.setText ( " Lt = " + df.format ( lt2 )+"m"  );
                           lt2=100*lt2;
                    tampilan3.setText ( " Lt = " + df.format ( lt2 )+"cm"  );
                            lt2=10*lt2;
                    tampilan4.setText ( " Lt = " + df.format ( lt2 )+"mm"  );
            }}}
        );
        btnlo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                if
                    ( !Lt.getText ( ).toString ( ).equals ( "" ) &&
                     !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                     !To.getText ( ).toString ( ).equals ( ""  ) &&
                     !Tt.getText ( ).toString ( ).equals ( ""  ) ){

                        lt2 = Double.parseDouble ( Lt.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Lo =  Lt/(1+ alfa(Tt - To)");

                          lo2 = lt2/(1 + alfa2*(tt2 - to2));

                    tampilan2.setText ( " Lo = " + df.format ( lo2 )+"m"  );
                         lo2=100*lo2;
                    tampilan3.setText ( " Lo = " + df.format ( lo2 )+"cm"  );
                         lo2=10*lo2;
                    tampilan4.setText ( " Lo = " + df.format ( lo2 )+"mm"  );
          } else if

                    ( !Lt.getText ( ).toString ( ).equals ( "" ) &&
                     !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                     !dt.getText ( ).toString ( ).equals ( "" )){

                        lt2 = Double.parseDouble ( Lt.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Lo =  Lt/(1+ alfa dT");

                          lo2 = lt2/(1 + alfa2*dtdt);

                    tampilan2.setText ( " Lo = " + df.format ( lo2 )+"m"  );
                          lo2=100*lo2;
                    tampilan3.setText ( " Lo = " + df.format ( lo2 )+"cm"  );
                          lo2=10*lo2;
                    tampilan4.setText ( " Lo = " + df.format ( lo2 )+"mm"  );
            }}}
        );
        btndl.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if
                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                     !alfa.getText ( ).toString ( ).equals ( "" ) &&
                      !To.getText ( ).toString ( ).equals ( "" ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" ) ){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                        alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " dL = Lo * alfa(Tt - To)");

                         dl = lo2* alfa2*(tt2 - to2);

                    tampilan2.setText ( " dL = " + df.format ( dl )+"m"  );
                         dl=100*dl;
                    tampilan3.setText ( " dL = " + df.format ( dl )+"cm"  );
                         dl=10*dl;
                    tampilan4.setText ( " dL = " + df.format ( dl )+"mm"  );

                } else if
                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ("") &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        alfa2 = Math.pow(10,-6)*alfa2;

                    tampilan1.setText ( " dl =  lo*alfa*dt");

                          dl = lo2*alfa2*dtdt;

                    tampilan2.setText ( " dL = " + df.format ( dl )+"m"  );
                           dl=100*dl;
                    tampilan3.setText ( " dL = " + df.format ( dl )+"cm"  );
                           dl=10*dl;
                    tampilan4.setText ( " dL = " + df.format ( dl )+"mm"  );
                }}}
        );
        btnat.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                         alfa2 = Math.pow(10,-6)*alfa2;

                    tampilan1.setText ( " At =  Ao ( 1 + 2 alfa(Tt - To)" );

                          at2 = ao2 * (1 + 2 * alfa2 * (tt2 - to2));

                    tampilan2.setText ( " At = " + df.format ( at2 ) + "m2" );
                         at2 = 10000*at2;
                    tampilan3.setText ( " At = " + df.format ( at2 ) + "cm2" );
                         at2 = 100*at2;
                    tampilan4.setText ( " At = " + df.format ( at2 ) + "mm2" );


                } else   if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        alfa2 = Math.pow(10,-6)*alfa2;

                    tampilan1.setText ( " At =  Ao ( 1 + 2 alfa dT" );

                        at2 = ao2 * (1 + 2 * alfa2 * dtdt);

                    tampilan2.setText ( " At = " + df.format ( at2 ) + "m2" );
                         at2 = 10000*at2;
                    tampilan3.setText ( " At = " + df.format ( at2 ) + "cm2" );
                         at2 = 100*at2;
                    tampilan4.setText ( " At = " + df.format ( at2 ) + "mm2" );


                } else   if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !beta.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                       !Tt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                    beta2 = Math.pow(10,-6)*beta2;
                    tampilan1.setText ( " At =  Ao ( 1 + beta (Tt - To)" );
                    at2 = ao2 * (1 + beta2 * (tt2 - to2));
                    tampilan2.setText ( " At = " + df.format ( at2 ) + "m2" );
                    at2 = 10000*at2;
                    tampilan3.setText ( " At = " + df.format ( at2 ) + "cm2" );
                    at2 = 100*at2;
                    tampilan4.setText ( " At = " + df.format ( at2 ) + "mm2" );

                } else if

                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                    !beta.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        beta2 = Math.pow(10,-6)*beta2;

                    tampilan1.setText ( " At =  Ao ( 1 + beta dT" );
                    at2 = ao2 * (1 + beta2 * dtdt);
                    tampilan2.setText ( " At = " + df.format ( at2 ) + "m2" );
                    at2 = 10000*at2;
                    tampilan3.setText ( " At = " + df.format ( at2 ) + "cm2" );
                    at2 = 100*at2;
                    tampilan4.setText ( " At = " + df.format ( at2 ) + "mm2" );
                } }}
        );
        btnda.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if
                    ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                    ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                    alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                    tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                       alfa2 = Math.pow(10,-6)*alfa2;
                   tampilan1.setText ( " dA =  Ao* 2 alfa(Tt - To)" );

                          da = 2 * alfa2 * (tt2 - to2);

                   tampilan2.setText ( " dA = " + df.format ( da ) + "m2" );
                         da = 10000*da;
                   tampilan3.setText ( " dA = " + df.format ( da ) + "cm2" );
                         da = 100*da;
                   tampilan4.setText ( " dA = " + df.format ( da ) + "mm2" );

                } else  if

                        ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                          !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                            ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                            alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                        alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " At =  Ao ( 1 + 2 alfa dT" );

                         da = ao2 * 2 * alfa2 * dtdt;

                    tampilan2.setText ( " dA = " + df.format ( da ) + "m2" );
                         da = 10000*da;
                    tampilan3.setText ( " dA = " + df.format ( da ) + "cm2" );
                         da = 100*da;
                    tampilan4.setText ( " dA = " + df.format ( da ) + "mm2" );

                } else   if

                        ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                          !beta.getText ( ).toString ( ).equals ( ""  ) &&
                          !To.getText ( ).toString ( ).equals ( ""  ) &&
                          !Tt.getText ( ).toString ( ).equals ( "" )){

                            ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                           beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                            to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                            tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                          beta2 = Math.pow(10,-6)*beta2;
                    tampilan1.setText ( " dA =  Ao beta (Tt - To)" );

                          da = ao2 * beta2 * (tt2 - to2);

                    tampilan2.setText ( " dA = " + df.format ( da ) + "m2" );
                          da = 10000*da;
                    tampilan3.setText ( " dA = " + df.format ( da ) + "cm2" );
                          da = 100*da;
                    tampilan4.setText ( " dA = " + df.format ( da ) + "mm2" );
                }
         else if

                  ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                    !beta.getText ( ).toString ( ).equals ( ""  ) &&
                    !dt.getText ( ).toString ( ).equals ( "" )){

                                ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                                beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                                dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                     beta2 = Math.pow(10,-6)*beta2;

                    tampilan1.setText ( " dA =  Ao  beta dT" );

                          da = ao2 * beta2 * dtdt;

                    tampilan2.setText ( " dA = " + df.format ( da ) + "m2" );
                         da = 10000*da;
                    tampilan3.setText ( " dA = " + df.format ( da ) + "cm2" );
                         da = 100*da;
                    tampilan4.setText ( " dA = " + df.format ( da ) + "mm2" );
                 }}} );

        btnao.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );
                if

                    ( !At.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                        ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                        at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Ao =  At/ ( 1 + 2*alfa (Tt - To)");
                    ao2 = at2/(1 + beta2*(tt2 -to2));
                    tampilan2.setText ( " Ao = " + df.format (ao2 ) + "m2" );
                    ao2 = 10000*ao2;
                    tampilan3.setText ( " Ao = " + df.format ( ao2 ) + "cm2" );
                    ao2 = 100*ao2;
                    tampilan4.setText ( " Ao = " + df.format ( ao2 ) + "mm2" );

                } else if
                    ( !At.getText ( ).toString ( ).equals ( "" ) &&
                      !beta.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                        at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                        beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                    beta2 = Math.pow(10,-6)*beta2;
                    tampilan1.setText ( " Ao =  At/ ( 1 + beta(Tt - To)" );

                          ao2 = at2 / (1 + 2 * alfa2 * (tt2 - to2));

                    tampilan2.setText ( " Ao = " + df.format ( ao2 ) + "m2" );
                         ao2 = 10000*ao2;
                    tampilan3.setText ( " Ao = " + df.format ( ao2 ) + "cm2" );
                         ao2 = 100*ao2;
                    tampilan4.setText ( " Ao = " + df.format ( ao2 ) + "mm2" );


                } else  if

                  ( !At.getText ( ).toString ( ).equals ( "" ) &&
                    !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                    !dt.getText ( ).toString ( ).equals ( "" )){

                            at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                            alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Ao =  At/ ( 1 + 2*alfa dT ");

                         ao2 = at2/(1 + alfa2*dtdt);

                    tampilan2.setText ( " Ao = " + df.format (ao2 ) + "m2" );
                        ao2 = 10000*ao2;
                    tampilan3.setText ( " Ao = " + df.format ( ao2 ) + "cm2" );
                        ao2 = 100*ao2;
                    tampilan4.setText ( " Ao = " + df.format ( ao2 ) + "mm2" );


                } else if

               ( !At.getText ( ).toString ( ).equals ( "" ) &&
                 !beta.getText ( ).toString ( ).equals ( ""  ) &&
                 !dt.getText ( ).toString ( ).equals ( "" )){

                                at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                                beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                                dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                                beta2 = Math.pow(10,-6)*beta2;
                    tampilan1.setText ( " Ao =  At/ ( 1 + beta dT" );

                          ao2 = at2 / (1 + beta2 * dtdt);

                    tampilan2.setText ( " Ao = " + df.format ( ao2 ) + "m2" );
                          ao2 = 10000*ao2;
                    tampilan3.setText ( " Ao = " + df.format ( ao2 ) + "cm2" );
                          ao2 = 100*ao2;
                    tampilan4.setText ( " Ao = " + df.format ( ao2 ) + "mm2" );

                }}} );

        btnvt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );

                if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                  !To.getText ( ).toString ( ).equals ( ""  ) &&
                  !Tt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                      alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Vt =  Vo ( 1 + 3 alfa(Tt - To)");

                         vt2 = vo2*(1 + 3*alfa2*(tt2 -to2));

                    tampilan2.setText ( " Vt = " + df.format (vt2 ) + "m3" );
                         vt2 = 1000*vt2;
                    tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                         vt2 = 1000*vt2;
                    tampilan4.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );


                } else if
                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                      !gama.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText ( " Vt =  Vo ( 1 + gama(Tt - To))" );

                         vt2 = vo2 * (1 + gama2 * (tt2 - to2));

                    tampilan2.setText ( " Vt = " + df.format ( vt2 ) + "m3" );
                         vt2 = 1000*vt2;
                    tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                         vt2 = 1000*vt2;
                    tampilan4.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );


          } else  if

                    ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                       alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Vt =  Vo ( 1 + 3 alfa dT)");

                          vt2 = vo2*(1 + 3*alfa2*dtdt);

                    tampilan2.setText ( " Vt = " + df.format (vt2 ) + "m3" );
                          vt2 = 1000*vt2;
                    tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                          vt2 = 1000*vt2;
                    tampilan4.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );


                } else if

                        ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                          !gama.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                            vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                            gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText ( " Vt =  Vo ( 1 + gama dT)" );

                          vt2 = vo2 * (1 + gama2 * dtdt);

                    tampilan2.setText ( " Vt = " + df.format ( vt2 ) + "m3" );
                          vt2 = 1000*vt2;
                    tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                          vt2 = 1000*vt2;
                    tampilan4.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );

                }}
        }
        );


        btnro.setOnClickListener ( new View.OnClickListener ( ) {
                   @Override
                   public void onClick ( View view ) {
                    DecimalFormat df = new DecimalFormat ( "#.##########" );

                     if

                   ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                     !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                     !To.getText ( ).toString ( ).equals ( ""  ) &&
                     !m.getText ( ).toString ( ).equals ( ""  ) &&
                     !Tt.getText ( ).toString ( ).equals ( "" )){

                      vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                      mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                      alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                      to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                      tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                     alfa2 = Math.pow(10,-6)*alfa2;
                     tampilan1.setText ( " Vt =  Vo ( 1 + 3 alfa(Tt - To)");
                     tampilan2.setText ( " ro = m/V");
                        vt2 = vo2*(1 + 3*alfa2*(tt2 -to2));
                        rot = mm/vt2;
                        ro = mm/vo2;
                     tampilan3.setText ( " Vt = " + df.format (vt2 ) + "m3" );
                     tampilan4.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/m3" );
                     tampilan5.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/m3" );
                        vt2 = 1000*vt2;
                        vo2 = 1000*vo2;
                        rot = mm/vt2;
                         ro = mm/vo2;
                     tampilan6.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                     tampilan7.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/liter" );
                     tampilan8.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/liter" );
                          vt2 = 1000*vt2;
                     tampilan9.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );
                     tampilan10.setText ( " massa jenis awal ro = " + df.format (ro ) + "g/cm3" );
                     tampilan11.setText ( " massa jenis akhir rot = " + df.format (rot ) + "g/cm3" );

                } else if
                      ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                      !gama.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !m.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                       vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                       gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                       to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                       mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                       tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                       gama2 = Math.pow(10,-6)*gama2;

                   tampilan1.setText ( " Vt =  Vo ( 1 + gama(Tt - To))" );
                   tampilan2.setText ( " ro = m/V");
                         vt2 = vo2 * (1 + gama2 * (tt2 - to2));
                         rot = mm/vt2;
                         ro = mm/vo2;
                         tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "m3" );
                         tampilan4.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/m3" );
                         tampilan5.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/m3" );
                              vt2 = 1000*vt2;
                              vo2 = 1000*vo2;
                              rot = mm/vt2;
                              ro = mm/vo2;
                         tampilan6.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                         tampilan7.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/liter" );
                         tampilan8.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/liter" );
                             vt2 = 1000*vt2;
                         tampilan9.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );
                         tampilan10.setText ( " massa jenis awal ro = " + df.format (ro ) + "g/cm3" );
                         tampilan11.setText ( " massa jenis akhir rot = " + df.format (rot ) + "g/cm3" );


          } else  if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                !m.getText ( ).toString ( ).equals ( ""  ) &&
                !dt.getText ( ).toString ( ).equals ( "" )){

                   vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                   mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                   alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                   dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                   alfa2 = Math.pow(10,-6)*alfa2;

               tampilan1.setText ( " Vt =  Vo ( 1 + 3 alfa dT)");
               tampilan2.setText ( " ro = m/V");
                   vt2 = vo2*(1 + 3*alfa2*dtdt);
                   rot = mm/vt2;

                         ro = mm/vo2;
                 tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "m3" );
                 tampilan4.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/m3" );
                 tampilan5.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/m3" );
                         vt2 = 1000*vt2;
                         vo2 = 1000*vo2;
                         rot = mm/vt2;
                         ro = mm/vo2;
                 tampilan6.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                 tampilan7.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/liter" );
                 tampilan8.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/liter" );
                         vt2 = 1000*vt2;
                 tampilan9.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );
                 tampilan10.setText ( " massa jenis awal ro = " + df.format (ro ) + "g/cm3" );
                 tampilan11.setText ( " massa jenis akhir rot = " + df.format (rot ) + "g/cm3" );


          } else if

                 ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                 !gama.getText ( ).toString ( ).equals ( ""  ) &&
                 !m.getText ( ).toString ( ).equals ( ""  ) &&
                 !dt.getText ( ).toString ( ).equals ( "" )){

                  vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                  gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                  mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                  dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                  gama2 = Math.pow(10,-6)*gama2;

                 tampilan1.setText ( " Vt =  Vo ( 1 + gama dT)" );
                 tampilan2.setText ( " ro = m/V");
                       vt2 = vo2 * (1 + gama2 * dtdt);
                       rot = mm/vt2;
                         ro = mm/vo2;
                 tampilan3.setText ( " Vt = " + df.format ( vt2 ) + "m3" );
                 tampilan4.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/m3" );
                 tampilan5.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/m3" );
                         vt2 = 1000*vt2;
                         vo2 = 1000*vo2;
                         rot = mm/vt2;
                         ro = mm/vo2;
                tampilan6.setText ( " Vt = " + df.format ( vt2 ) + "liter" );
                tampilan7.setText ( " massa jenis awal ro = " + df.format (ro ) + "kg/liter" );
                tampilan8.setText ( " massa jenis akhir rot = " + df.format (rot ) + "kg/liter" );
                         vt2 = 1000*vt2;
                tampilan9.setText ( " Vt = " + df.format ( vt2 ) + "cm3" );
                tampilan10.setText ( " massa jenis awal ro = " + df.format (ro ) + "g/cm3" );
                tampilan11.setText ( " massa jenis akhir rot = " + df.format (rot ) + "g/cm3" );

                }}
             }
        );


        btndv.setOnClickListener ( new View.OnClickListener ( ) {
                @Override
              public void onClick ( View view ) {
            DecimalFormat df = new DecimalFormat ( "#.################" );
            if
                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                  !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                  !To.getText ( ).toString ( ).equals ( ""  ) &&
                  !Tt.getText ( ).toString ( ).equals ( "" )){

                    vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                    alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                    to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                    tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                alfa2 = Math.pow(10,-6)*alfa2;
                tampilan1.setText ( " dv =  Vo  3 alfa(Tt - To)");

                      dv = vo2* 3*alfa2*(tt2 -to2);

                tampilan2.setText ( " dV = " + df.format (dv ) + "m3" );
                      dv = 1000*dv;
                tampilan3.setText ( " dV = " + df.format (dv ) + "liter" );
                      dv = 1000*dv;
                tampilan4.setText ( " dV = " + df.format (dv ) + "cm3" );

            } else if
                    ( !Vo.getText ( ).toString ( ).equals ("") &&
                      !gama.getText ( ).toString ( ).equals ("") &&
                      !To.getText ( ).toString ( ).equals ("") &&
                      !Tt.getText ( ).toString ( ).equals ("")){

                        vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                gama2 = Math.pow(10,-6)*gama2;
                tampilan1.setText ( " Vt =  Vo ( 1 + gama(Tt - To))" );

                      dv = vo2 *  gama2 * (tt2 - to2);

                tampilan2.setText ( " dV = " + df.format (dv ) + "m3" );
                      dv = 1000*dv;
                tampilan3.setText ( " dV = " + df.format (dv ) + "liter" );
                      dv = 1000*dv;
                tampilan4.setText ( " dV = " + df.format (dv ) + "cm3" );

            } else  if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                !dt.getText ( ).toString ( ).equals ( "" )){

                            vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                            alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                alfa2 = Math.pow(10,-6)*alfa2;
                tampilan1.setText ( " Vt =  Vo ( 1 + 3 alfa dT)");

                      dv = vo2* 3*alfa2*dtdt;

                tampilan2.setText ( " dV = " + df.format (dv ) + "m3" );
                      dv = 1000*dv;
                tampilan3.setText ( " dV = " + df.format (dv ) + "liter" );
                      dv = 1000*dv;
                tampilan4.setText ( " dV = " + df.format (dv ) + "cm3" );

            } else if

                ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                !gama.getText ( ).toString ( ).equals ( ""  ) &&
                !dt.getText ( ).toString ( ).equals ( "" )){

                                vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                                gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                                dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                    gama2 = Math.pow(10,-6)*gama2;
                tampilan1.setText ( " Vt =  Vo ( gama dT)" );

                        dv = vo2 * gama2 * dtdt;

                tampilan2.setText ( " dV = " + df.format (dv ) + "m3" );
                       dv = 1000*dv;
                tampilan3.setText ( " dV = " + df.format (dv ) + "liter" );
                       dv = 1000*dv;
                tampilan4.setText ( " dV = " + df.format (dv ) + "cm3" );
                }}
            } );

        btnvo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#########" );
                if
                    ( !Vt.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !To.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( "" )){

                        vt2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                        to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Vo =  Vt/ ( 1 + 3*alfa2(Tt - To)" );

                         vo2 = vt2 / (1 + 3 * alfa2 * (tt2 - to2));

                    tampilan2.setText ( " Vo = " + df.format ( vo2 ) + "m3" );
                         vo2 = 1000*vo2;
                    tampilan3.setText ( " Vo = " + df.format ( vo2 ) + "liter" );
                         vo2 = 1000*vo2;
                    tampilan4.setText ( " Vo = " + df.format ( vo2 ) + "cm3" );

                    } else if
                        ( !Vt.getText ( ).toString ( ).equals ( "" ) &&
                          !gama.getText ( ).toString ( ).equals ( ""  ) &&
                          !To.getText ( ).toString ( ).equals ( ""  ) &&
                          !Tt.getText ( ).toString ( ).equals ( "" )){

                            vt2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                            gama2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                            to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                            tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );

                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText ( " Vo =  Vt/ ( 1 + gama(Tt - To)" );

                         vo2 = at2 / (1 + gama2 * (tt2 - to2));

                    tampilan2.setText ( " Vo = " + df.format ( vo2 ) + "m3" );
                         vo2 = 1000*vo2;
                    tampilan3.setText ( " Vo = " + df.format ( vo2 ) + "liter" );
                         vo2 = 1000*vo2;
                    tampilan4.setText ( " Vo = " + df.format ( vo2 ) + "cm3" );

                } else   if

                    ( !Vt.getText ( ).toString ( ).equals ( "" ) &&
                      !alfa.getText ( ).toString ( ).equals ( ""  ) &&
                      !dt.getText ( ).toString ( ).equals ( "" )){

                                alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                                vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                                dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " Vo =  Vt/ ( 1 + 3*alfa dT)" );

                         vo2 = vt2 / (1 + 3 * alfa2 * dtdt);

                    tampilan2.setText ( " Vo = " + df.format ( vo2 ) + "m3" );
                         vo2 = 1000*vo2;
                    tampilan3.setText ( " Vo = " + df.format ( vo2 ) + "liter" );
                         vo2 = 1000*vo2;
                    tampilan4.setText ( " Vo = " + df.format ( vo2 ) + "cm3" );

                } else if
                        ( !Vt.getText ( ).toString ( ).equals ( "" ) &&
                          !gama.getText ( ).toString ( ).equals ( ""  ) &&
                          !dt.getText ( ).toString ( ).equals ( "" )){

                                    gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                                    vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                                    dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );

                                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText ( " Vo =  Vt/ ( 1 + gama dT)" );

                          vo2 = at2 / (1 + gama2 * dtdt);

                    tampilan2.setText ( " Vo = " + df.format ( vo2 ) + "m3" );
                         vo2 = 1000*vo2;
                    tampilan3.setText ( " Vo = " + df.format ( vo2 ) + "liter" );
                        vo2 = 1000*vo2;
                    tampilan4.setText ( " Vo = " + df.format ( vo2 ) + "cm3" );
            }}
        } );

btntt.setOnClickListener ( new View.OnClickListener ( ) {
             @Override
            public void onClick ( View view ) {
           DecimalFormat df = new DecimalFormat ( "#.##########" );
           if
                  ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                          !Lt.getText ( ).toString ( ).equals ( ""  ) &&
                          !To.getText ( ).toString ( ).equals ( ""  ) &&
                          !alfa.getText ( ).toString ( ).equals ( "" )){

                      lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                      lt2 = Double.parseDouble ( Lt.getText ( ).toString ( ) );
                      to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                      alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                  alfa2 = Math.pow(10,-6)*alfa2;
                  tampilan1.setText ( " Tt =  To + (Lt - Lo)/alfa *Lo");

                        tt2 = to2 + (lt2 -lo2)/alfa2*lo2;

                  tampilan2.setText ( " Tt = " + df.format ( tt2 ) + "derC" );

              } else if
                  ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                          !At.getText ( ).toString ( ).equals ( ""  ) &&
                          !To.getText ( ).toString ( ).equals ( ""  ) &&
                          !beta.getText ( ).toString ( ).equals ( "" )){

                      ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                      at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                      to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                      beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                  beta2 = Math.pow(10,-6)*beta2;
                  tampilan1.setText ( " Tt =  To + (At - Ao)/beta *Ao");

                       tt2 = to2 + (at2 -ao2)/beta2*ao2;

                  tampilan2.setText ( " Tt = " + df.format ( tt2 ) + "derC" );

              }  else if
                  ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                    !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                    !To.getText ( ).toString ( ).equals ( ""  ) &&
                    !gama.getText ( ).toString ( ).equals ( "" )){

                      vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                      vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                      to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                      gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );
                  gama2 = Math.pow(10,-6)*gama2;

                  tampilan1.setText ( " Tt =  To + (Vt - Vo)/gama*Vo" );

                        tt2 = to2 + (vt2 - vo2) / (gama2 * vo2);

                  tampilan2.setText ( " Tt = " + df.format ( tt2 ) + "derC" );

              }else if

                      ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                        !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                        !To.getText ( ).toString ( ).equals ( ""  ) &&
                        !alfa.getText ( ).toString ( ).equals ( "" )){

                          vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                          vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                          to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                          alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );
                  alfa2 = Math.pow(10,-6)*alfa2;
                  tampilan1.setText ( " Tt =  To + (Vt - Vo)/3 alfa*Vo" );

                       tt2 = to2 + (vt2 - vo2) / (3 * alfa2 * vo2);

                  tampilan2.setText ( " Tt = " + df.format ( tt2 ) + "derC" );
              }}} );

 btnto.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.##########" );
                if

                    ( !Lo.getText ( ).toString ( ).equals ( "" ) &&
                      !Lt.getText ( ).toString ( ).equals ( ""  ) &&
                      !Tt.getText ( ).toString ( ).equals ( ""  ) &&
                      !alfa.getText ( ).toString ( ).equals ( "" )){

                        lo2 = Double.parseDouble ( Lo.getText ( ).toString ( ) );
                        lt2 = Double.parseDouble ( Lt.getText ( ).toString ( ) );
                        tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                        alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " To =  Tt - (Lt - Lo)/alfa *Lo");

                         to2 = tt2 - (lt2 -lo2)/alfa2*lo2;

                    tampilan2.setText ( " To = " + df.format ( to2 ) + "derC" );

                    } else if
                        ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                          !At.getText ( ).toString ( ).equals ( ""  ) &&
                          !To.getText ( ).toString ( ).equals ( ""  ) &&
                          !beta.getText ( ).toString ( ).equals ( "" )){

                            ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                            at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                            to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                            beta2 = Double.parseDouble ( beta.getText ( ).toString ( ) );
                    beta2 = Math.pow(10,-6)*beta2;
                    tampilan1.setText ( " To =  Tt - (At - Ao)/beta *Ao");

                          to2 = tt2 - (at2 -ao2)/alfa2*ao2;

                    tampilan2.setText ( " to2 = " + df.format ( to2 ) + "derC" );

                }  else if

                            ( !Ao.getText ( ).toString ( ).equals ( "" ) &&
                              !At.getText ( ).toString ( ).equals ( ""  ) &&
                              !To.getText ( ).toString ( ).equals ( ""  ) &&
                              !alfa.getText ( ).toString ( ).equals ( "" )){

                                ao2 = Double.parseDouble ( Ao.getText ( ).toString ( ) );
                                at2 = Double.parseDouble ( At.getText ( ).toString ( ) );
                                to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                                alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                    alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " To =  Tt - (At - Ao)/ 2* alfa2 *Ao" );

                          to2 = tt2 - (at2 - ao2) / 2 * alfa2 * ao2;

                    tampilan2.setText ( " to2 = " + df.format ( to2 ) + "derC" );
                }
                else if

                        ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                                !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                                !To.getText ( ).toString ( ).equals ( ""  ) &&
                                !gama.getText ( ).toString ( ).equals ( "" )){

                            vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                            vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                            to2 = Double.parseDouble ( To.getText ( ).toString ( ) );
                            gama2 = Double.parseDouble ( gama.getText ( ).toString ( ) );

                    gama2 = Math.pow(10,-6)*gama2;
                    tampilan1.setText ( " To =  Tt - (Vt - Vo)/gama*Vo" );

                          tt2 = to2 + (vt2 - vo2) / (gama2 * vo2);

                    tampilan2.setText ( " To = " + df.format ( to2 ) + "derC" );

                }else if
                            ( !Vo.getText ( ).toString ( ).equals ( "" ) &&
                              !Vt.getText ( ).toString ( ).equals ( ""  ) &&
                              !Tt.getText ( ).toString ( ).equals ( ""  ) &&
                              !alfa.getText ( ).toString ( ).equals ( "" )){

                                vo2 = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                                vt2 = Double.parseDouble ( Vt.getText ( ).toString ( ) );
                                tt2 = Double.parseDouble ( Tt.getText ( ).toString ( ) );
                                alfa2 = Double.parseDouble ( alfa.getText ( ).toString ( ) );

                         alfa2 = Math.pow(10,-6)*alfa2;
                    tampilan1.setText ( " To =  Tt - (Vt - Vo)/3*alfa*Vo" );

                         to2 = tt2 - (vt2 - vo2) / (3 * alfa2 * vo2);

                    tampilan2.setText ( " To = " + df.format ( to2 ) + "derC" );

                } }} );

btnhapus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {

                tampilan1.setText ( "" );
                tampilan2.setText ( "" );
                tampilan3.setText ( "" );
                tampilan4.setText ( "" );
                tampilan5.setText ( "" );
                tampilan6.setText ( "" );
                tampilan7.setText ( "" );
                tampilan8.setText ( "" );
                tampilan9.setText ( "" );
                tampilan10.setText ( "" );
                tampilan11.setText ( "" );
                tampilan12.setText ( "" );
                tampilan13.setText ( "" );
                tampilan14.setText ( "" );
                tampilan15.setText ( "" );
                alfa.setText ( "" );
                beta.setText ( "" );
                gama.setText ( "" );
                Lo.setText ( "" );
                Lt.setText ( "" );
                Ao.setText ( "" );
                At.setText ( "" );
                Vo.setText ( "" );
                Vt.setText ( "" );
                To.setText ( "" );
                Tt.setText ( "" );
                dt.setText ( "" );
                dL.setText ( "" );
                dA.setText ( "" );
                dV.setText ( "" );
                m.setText ( "" );

            }
        } );
        }
    }




