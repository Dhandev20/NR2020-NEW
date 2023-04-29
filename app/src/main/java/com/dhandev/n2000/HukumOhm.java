
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class HukumOhm extends AppCompatActivity {
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

    private EditText v, A, t, r, I,ro, L, P, W, Q;
    private Double vv, AA, tt, rr, II, roro, LL, PP, WW, QQ;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_hukum_ohm );

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
        v = findViewById ( R.id.in_v );
        A = findViewById ( R.id.in_A);
        t = findViewById ( R.id.in_t );
        I = findViewById ( R.id.in_I );
        ro = findViewById ( R.id.in_ro );
        L = findViewById ( R.id.in_L );
        P = findViewById ( R.id.in_P );
        W = findViewById ( R.id.in_W );
        r = findViewById ( R.id.in_r );
        Q = findViewById ( R.id.in_Q );

        Button btnv = findViewById ( R.id.btn_v );
        Button btnA = findViewById ( R.id.btn_A );
        Button btnr = findViewById ( R.id.btn_r );
        Button btnro = findViewById ( R.id.btn_ro );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnL = findViewById ( R.id.btn_L );
        Button btnP = findViewById ( R.id.btn_P );
        Button btnW = findViewById ( R.id.btn_W );
        Button btnI = findViewById ( R.id.btn_I );
        Button btnq = findViewById ( R.id.btn_Q );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Hukum Ohm" );
                tampilan2.setText ( "kalkulator inidigunakan untuk menghitung:" );
                tampilan3.setText ( " 1. V  = beda potensial" );
                tampilan4.setText ( " 2. I  = kuat arus " );
                tampilan5.setText ( " 3. R  = hambatan" );
                tampilan6.setText ( " 4. P  = daya" );
                tampilan7.setText ( " 5. W  = usaha" );
                tampilan8.setText ( " 6. rho= hambatan jenis" );
                tampilan9.setText ( " 7. L  = panjang kawat " );
                tampilan10.setText ( "8. A  = luas penampang" );
                tampilan11.setText ( "9. Q  = muatan" );
                tampilan12.setText ( "10.t  = waktu" );
            }});
        btnv.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                        tampilan1.setText ( "v = I * R" );
                   vv = II * rr;
                    tampilan2.setText ( " v = " + df.format ( vv ) + "volt" );
                } else
                if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                        tampilan1.setText ( " v = I * ro L/A" );
                   vv = II * roro * LL /AA;
                    tampilan2.setText ( " v = " + df.format ( vv ) + "volt" );

                } else if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                    tampilan1.setText ( "v = P/I" );
                    vv = PP/II;
                    tampilan2.setText ( " v = " + df.format ( vv ) + "volt" );

                }else if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                    tampilan1.setText ( "v = (PR)^0,5" );
                    vv = PP * rr;
                    vv = Math.pow(vv,0.5);
                    tampilan2.setText ( " v = " + df.format ( vv ) + "volt" );
                }

        }}
        );
        btnI.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                    tampilan1.setText ( "I = v / R" );
                    II = vv/rr;
                    tampilan2.setText ( " I = " + df.format ( II ) + "ampere" );
                } else
                if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( " I = v A/  ro L" );
                    II = vv*AA/(roro*LL);
                    tampilan2.setText ( " I = " + df.format ( II ) + "ampere" );
                } else if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                    tampilan1.setText ( "I = P/v" );
                    II = PP/vv;
                    tampilan2.setText ( " I = " + df.format ( II ) + "ampere" );
                }else if
                        ( !P.getText ( ).toString ( ).equals ( "" ) &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                            PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                    tampilan1.setText ( "I = (P/R)^0,5" );
                    II = PP / rr;
                   II= Math.pow(II,0.5);
                    tampilan2.setText ( " I = " + df.format ( II ) + "ampere" );
                }else if
                    ( !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" )) {
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "I = Q/t" );
                    II = QQ / tt;
                    tampilan2.setText ( " I = " + df.format ( II ) + "ampere" );
                }
            }}
        );

        btnr.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );

                    tampilan1.setText ( "R = v / I" );
                    rr = vv/II;
                    tampilan2.setText ( " R = " + df.format ( rr ) + "ohm" );
                } else
                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( " R = ro L/A" );
                    rr = roro * LL/AA;
                    tampilan2.setText ( " R = " + df.format ( rr ) + "ohm" );
                } else if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );

                    tampilan1.setText ( "R = v^2/P" );
                    rr = vv * vv/PP;
                    tampilan2.setText ( " R = " + df.format ( rr ) + "ohm" );
                }else if
                    ( !P.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );

                    tampilan1.setText ( "R = P /I^2" );
                    rr = PP / (II *II);
                    tampilan2.setText ( " R = " + df.format ( rr ) + "ohm" );
                }else if
                    ( !W.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "R = W / t * I^2" );
                    rr = WW/ ( tt*II*II);
                    tampilan2.setText ( " R = " + df.format ( rr ) + "ohm" );
                }

            }}
        );
        btnP.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );


                        tampilan1.setText ( "P = v I" );
                    PP = vv *II;
                    tampilan2.setText ( " P = " + df.format ( PP ) + " watt" );
                } else
                    if
                        ( !r.getText ( ).toString ( ).equals ( "" ) &&
                                !I.getText ( ).toString ( ).equals ( "" )) {
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            II = Double.parseDouble ( I.getText ( ).toString ( ) );


                        tampilan1.setText ( "P =  I^2 R" );
                        PP = rr * II * II;
                        tampilan2.setText ( " P = " + df.format ( PP ) + " watt" );
                    } else
                    if
                        ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                !L.getText ( ).toString ( ).equals ( "" ) &&
                                !I.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                            roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            II = Double.parseDouble ( I.getText ( ).toString ( ) );
                            LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                        tampilan1.setText ( "P =  I^2 ro L/A" );
                        PP = II*II*roro * LL/AA;
                        tampilan2.setText ( " P = " + df.format ( PP ) + " watt" );
                }else
                    if
                        ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                !L.getText ( ).toString ( ).equals ( "" ) &&
                                !v.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                            roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                        tampilan1.setText ( "P = A * v^2/ ( ro L)" );
                        PP = AA * vv * vv / (roro * LL);
                        tampilan2.setText ( " P = " + df.format ( PP ) + " watt" );
                    }
            }}
        );
        btnW.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "P = v I t" );
                    WW = vv *II * tt;
                    tampilan2.setText ( " W = " + df.format ( WW ) + " joule" );
                } else
                if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "W =  I^2 R t" );
                    WW = rr * II * II * tt;
                    tampilan2.setText ( " W = " + df.format ( WW ) + " joule" );
                } else
                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "P =  I^2 ro L t/A" );
                    WW = II*II*roro * LL * tt/AA;
                    tampilan2.setText ( " W = " + df.format ( WW ) + " joule" );
                }else
                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( "P = A * v^2/ ( ro L)" );
                    WW = AA * vv * vv / (roro * LL);
                    tampilan2.setText ( " W = " + df.format ( WW ) + " joule" );
                }
            }}
        );
        btnro.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( "ro = A R /L" );
                    roro = AA * rr /LL;
                    tampilan2.setText ( " ro = " + df.format ( roro ) + "ohmmeter" );
                } else
                if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( "ro = A v / I L" );
                    roro = AA * vv /(II * LL);
                    tampilan2.setText ( " ro = " + df.format ( roro ) + "ohmmeter" );

                }else
                if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( "ro = A P / I^2 L" );
                    roro = AA * PP / (II * II * LL);
                    tampilan2.setText ( " ro = " + df.format ( roro ) + "ohmmeter" );
                }
                }}
        );
        btnL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !r.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = A R /ro" );
                    LL = AA * rr /roro;
                    tampilan2.setText ( " L = " + df.format ( LL ) + "meter" );
                } else
                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );

                    tampilan1.setText ( " L = A v / I ro" );
                    LL = AA * vv /(II * roro);
                    tampilan2.setText ( " L = " + df.format ( LL ) + "ohmmeter" );

                }else
                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );


                    tampilan1.setText ( "L = A P / I^2 ro" );
                    LL = AA * PP / (II * II * roro);
                    tampilan2.setText ( " ro = " + df.format ( roro ) + "ohmmeter" );
                }
            }}
        );
        btnA.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                            !L.getText ( ).toString ( ).equals ( "" ) &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( " A = ro L/R" );
                    AA = roro *LL/rr;
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );

                } else if
                        ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                !L.getText ( ).toString ( ).equals ( "" ) &&
                                !I.getText ( ).toString ( ).equals ( "" ) &&
                                !v.getText ( ).toString ( ).equals ( "" )) {
                            roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                            II= Double.parseDouble ( I.getText ( ).toString ( ) );
                            vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                            LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                     tampilan1.setText ( "A = I ro L/v" );
                    AA = II * roro * LL/vv;
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                }else if
                            ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                    !L.getText ( ).toString ( ).equals ( "" ) &&
                                    !I.getText ( ).toString ( ).equals ( "" ) &&
                                    !P.getText ( ).toString ( ).equals ( "" )) {
                                roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                II = Double.parseDouble ( I.getText ( ).toString ( ) );
                                PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                                LL = Double.parseDouble ( L.getText ( ).toString ( ) );


                    tampilan1.setText ( "A = I^2 ro L /P" );
                    II = Math.pow (II,2);
                    AA = II * roro * LL/PP;
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                }else if
                                ( !ro.getText ( ).toString ( ).equals ( "" ) &&
                                        !L.getText ( ).toString ( ).equals ( "" ) &&
                                        !v.getText ( ).toString ( ).equals ( "" ) &&
                                        !P.getText ( ).toString ( ).equals ( "" )) {
                                    roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                                    PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                                    vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                                    LL = Double.parseDouble ( L.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = P ro L/v^2" );
                    vv = Math.pow ( vv , 2 );
                    AA = PP * roro * LL / vv;
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                }
            }}
        );
        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );
                  if
                    ( !P.getText ( ).toString ( ).equals ( "" ) &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );

                    tampilan1.setText ( " t = W/P" );
                    tt = WW /PP;
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );
                } else if
                    ( !v.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" ) &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );


                    tampilan1.setText ( " t = W / v I" );
                   tt = WW/(vv * II);
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );

                }else if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !I.getText ( ).toString ( ).equals ( "" ) &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( " t = W /(I^2 R)" );
                     tt = WW/(II * II * rr);
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );
                }
                else if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" ) &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( " t = W R/(v^2 )" );
                    tt = WW * rr/(vv * vv );
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );
            }}}
        );
        btnq.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !I.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" )) {
                        II = Double.parseDouble ( I.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );

                    tampilan1.setText ( " Q = I * t" );
                    QQ = II * tt;
                    tampilan2.setText ( " Q = " + df.format ( QQ ) + "C" );

                } else if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );


                    tampilan1.setText ( " Q = v * t / R" );
                    QQ = vv * tt/rr;
                    tampilan2.setText ( " Q = " + df.format ( QQ ) + "C" );
                }else if
                    ( !P.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );


                    tampilan1.setText ( " Q = P * t /v" );
                    QQ = PP * tt/vv;
                    tampilan2.setText ( " Q = " + df.format ( QQ ) + "C" );
                }
                else if
                    ( !r.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !P.getText ( ).toString ( ).equals ( "" )) {
                        PP = Double.parseDouble ( P.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );

                    tampilan1.setText ( " Q = t * (P/R)^0,5  " );
                    QQ = PP/rr;
                    QQ = Math.pow(QQ,0.5);
                    QQ = QQ * tt;
                    tampilan2.setText ( " Q = " + df.format ( QQ ) + "C" );
                }}}
        );

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
                v.setText ( "" );
                A.setText ( "" );
                t.setText ( "" );
                r.setText ( "" );
                I.setText ( "" );
                ro.setText ( "" );
                L.setText ( "" );
                P.setText ( "" );
                W.setText ( "" );
                Q.setText ( "" );
            }
        } );
}}
