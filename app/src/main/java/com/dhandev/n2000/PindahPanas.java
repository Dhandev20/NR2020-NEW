
package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class PindahPanas extends AppCompatActivity {
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

    private EditText k, A, t, T1, T2, h, e, d, H,dT, Q;
    private Double kk, AA, tt, T1T1, T2T2, hh, dd, ee,HH, dTdT, QQ;

    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_pindah_panas );

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
        k = findViewById ( R.id.in_k );
        A = findViewById ( R.id.in_A);
        t = findViewById ( R.id.in_t );
        T1 = findViewById ( R.id.in_T1 );
        T2 = findViewById ( R.id.in_T2 );
        h = findViewById ( R.id.in_h );
        d = findViewById ( R.id.in_d );
        e = findViewById ( R.id.in_e );
        Q = findViewById ( R.id.in_Q );
        H = findViewById ( R.id.in_H );
        dT = findViewById ( R.id.in_dT );

        Button btnQ = findViewById ( R.id.btn_Q );
        Button btnH = findViewById ( R.id.btn_H );
        Button btnh = findViewById ( R.id.btn_h );
        Button btnd = findViewById ( R.id.btn_d );
        Button btnt = findViewById ( R.id.btn_t );
        Button btnk = findViewById ( R.id.btn_k );
        Button btne = findViewById ( R.id.btn_e );
        Button btnT1 = findViewById ( R.id.btn_T1 );
        Button btnT2 = findViewById ( R.id.btn_T2 );
        Button btndT = findViewById ( R.id.btn_dT );
        Button btnA = findViewById ( R.id.btn_A );
        Button btninfo = findViewById ( R.id.btn_Info );
        Button btnhapus= findViewById ( R.id.btn_Hapus );
        Button btnnol = findViewById ( R.id.btn_Nol);


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Perpindahan panas" );
                tampilan2.setText ( "kalkulator ini digunakan untuk menghitung:" );
                tampilan3.setText ( " 1. konduksi" );
                tampilan4.setText ( " 2. radiasi" );
                tampilan5.setText ( " 3. konveksi " );
                tampilan6.setText ( " Varibel yang digunakan" );
                tampilan7.setText ( " k : konduktivitas termal" );
                tampilan8.setText ( " T1, T2 : temperatur ; t : selang waktu" );
                tampilan9.setText ( " h : koefisien konveksi; H : aliran kalor" );
                tampilan10.setText ( "d : tebal material; A : luas; Q jumlah kalor; e : emisifitas " );
            }});
        btnQ.setOnClickListener ( new View.OnClickListener ( ) {
             @Override
             public void onClick ( View view ) {
          DecimalFormat df = new DecimalFormat ( "#.#####" );

          if

              ( !k.getText ( ).toString ( ).equals ( "" ) &&
                      !t.getText ( ).toString ( ).equals ( "" ) &&
                      !A.getText ( ).toString ( ).equals ( "" ) &&
                      !T1.getText ( ).toString ( ).equals ( "" ) &&
                      !T2.getText ( ).toString ( ).equals ( "" ) &&
                      !d.getText ( ).toString ( ).equals ( "" )) {
                  kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                  tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                  AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                  T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                  T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                  dd= Double.parseDouble ( d.getText ( ).toString ( ) );

              tampilan1.setText ( " Q = (k t A(T2 - T1))/d " );
              QQ = (kk * tt * AA * (T2T2 - T1T1)) / dd;
              tampilan2.setText ( " Q = " + df.format ( QQ ) + "joule" );

          } else if
              ( !e.getText ( ).toString ( ).equals ( "" ) &&
                      !t.getText ( ).toString ( ).equals ( "" ) &&
                      !T1.getText ( ).toString ( ).equals ( "" ) &&
                      !T2.getText ( ).toString ( ).equals ( "" ) &&
                      !A.getText ( ).toString ( ).equals ( "" )) {
                  ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                  tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                  AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                  T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                  T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );


              T1T1 = T1T1+273;
              T2T2 = T2T2+273;
              tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
              tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
              tampilan3.setText ( "Q = A e S t (T2^4 - T1^4)" );
              T1T1 = Math.pow(T1T1,4);
              T2T2 = Math.pow(T2T2,4);
              QQ = AA * ee * 0.0000000567*tt*(T2T2 -T1T1);
              tampilan5.setText ( " Q = " + df.format ( QQ ) + "joule" );
              } }}
        );
        btnH.setOnClickListener ( new View.OnClickListener ( ) {
             @Override
              public void onClick ( View view ) {
            DecimalFormat df = new DecimalFormat ( "#.#####" );

        if
            ( !k.getText ( ).toString ( ).equals ( "" ) &&
                    !A.getText ( ).toString ( ).equals ( "" ) &&
                    !T1.getText ( ).toString ( ).equals ( "" ) &&
                    !T2.getText ( ).toString ( ).equals ( "" ) &&
                    !d.getText ( ).toString ( ).equals ( "" )) {
                kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                dd = Double.parseDouble ( d.getText ( ).toString ( ) );

            tampilan1.setText ( "H = Q/t =(k  A(T2 - T1))/d " );
            HH = (kk * AA * (T2T2 - T1T1)) / dd;
            tampilan2.setText ( " H = " + df.format ( HH ) + "J/s" );
        }else if
            ( !k.getText ( ).toString ( ).equals ( "" ) &&
                    !t.getText ( ).toString ( ).equals ( "" ) &&
                    !A.getText ( ).toString ( ).equals ( "" ) &&
                    !dT.getText ( ).toString ( ).equals ( "" )) {
                kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                dTdT= Double.parseDouble ( d.getText ( ).toString ( ) );

            tampilan1.setText ( "H = Q/t =(k  A(T2 - T1))/d " );
            HH = (kk * AA * dTdT) / dd;
            tampilan2.setText ( " H = " + df.format ( HH ) + "J/s" );
        }else
            if
                ( !h.getText ( ).toString ( ).equals ( "" ) &&
                        !T1.getText ( ).toString ( ).equals ( "" ) &&
                        !T2.getText ( ).toString ( ).equals ( "" ) &&
                        !A.getText ( ).toString ( ).equals ( "" )) {
                    hh = Double.parseDouble ( h.getText ( ).toString ( ) );
                    AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

             tampilan1.setText ( "H = h A (T2 - T1)" );
             HH = hh * AA * (T2T2 - T1T1) ;
             tampilan2.setText ( " H = " + df.format ( HH ) + "J/s" );

        } else if
                ( !h.getText ( ).toString ( ).equals ( "" ) &&
                        !A.getText ( ).toString ( ).equals ( "" ) &&
                        !dT.getText ( ).toString ( ).equals ( "" )) {
                    hh = Double.parseDouble ( h.getText ( ).toString ( ) );
                    AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                    dTdT= Double.parseDouble ( d.getText ( ).toString ( ) );
                tampilan1.setText ( "H = h A dT" );
                HH = hh * AA * dTdT ;
                tampilan2.setText ( " H = " + df.format ( HH ) + "J/s" );

        }else if
                ( !e.getText ( ).toString ( ).equals ( "" ) &&
                        !T1.getText ( ).toString ( ).equals ( "" ) &&
                        !T2.getText ( ).toString ( ).equals ( "" ) &&
                        !A.getText ( ).toString ( ).equals ( "" )) {
                    ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                    AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                T1T1 = T1T1+273;
                T2T2 = T2T2+273;
            tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
            tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
            tampilan3.setText ( "H = A e S  (T2^4 - T1^4)" );
            T1T1 = Math.pow(T1T1,4);
            T2T2 = Math.pow(T2T2,4);
            HH = AA * ee * 0.0000000567 *(T2T2 -T1T1);
            tampilan5.setText ( " H = " + df.format ( HH ) + "joule/s" );
            } }}
        );
        btnA.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );


                    tampilan1.setText ( "A = d*H/(k(T2 - T1) " );
                    AA = dd*HH/(kk*(T2T2 - T1T1));
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                }else
                if
                    ( !e.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );


                    T1T1 = T1T1+273;
                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan3.setText ( "A = H/(signa e (T2^4 - T1^4))" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    AA = HH / (0.0000000567 * ee * (T2T2 - T1T1));
                    tampilan5.setText ( " A = " + df.format ( AA ) + "m2" );

                }else
                if
                    ( !e.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );


                    T1T1 = T1T1+273;
                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan3.setText ( "A = Q/(signa e t (T2^4 - T1^4))" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    AA = QQ / (0.0000000567 * ee * tt * (T2T2 - T1T1));
                    tampilan5.setText ( " A = " + df.format ( AA ) + "m2" );

                }
                else if

                        ( !k.getText ( ).toString ( ).equals ( "" ) &&
                                !H.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" )) {
                            kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                            HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                            dd = Double.parseDouble ( d.getText ( ).toString ( ) );
                            dTdT= Double.parseDouble ( dT.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = d H/(k  AdT) " );
                    AA = (dd * HH )/(kk * dTdT);
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                } else
                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = d*Q/(k t (T2 - T1) " );
                    AA = dd*QQ/(kk*tt*(T2T2 - T1T1));
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );

                }else if
                        ( !k.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !Q.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" )) {
                            kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                            tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            dd = Double.parseDouble ( d.getText ( ).toString ( ) );
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                            dTdT= Double.parseDouble ( dT.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = d H/(k  A dT) " );
                    AA = (dd * QQ )/(kk*tt * dTdT);
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );

            }else if
                            ( !h.getText ( ).toString ( ).equals ( "" ) &&
                                    !t.getText ( ).toString ( ).equals ( "" ) &&
                                    !Q.getText ( ).toString ( ).equals ( "" ) &&
                                    !dT.getText ( ).toString ( ).equals ( "" )) {
                                hh = Double.parseDouble ( h.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                dTdT= Double.parseDouble ( dT.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = Q/(  A t dT) " );
                    AA = QQ/(hh*tt*dTdT);
                    tampilan2.setText ( " A = " + df.format ( AA ) + "m2" );
                } }}
        );
        btnd.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );


                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                    tampilan1.setText ( "d = k A (T2 - T1)/H " );
                    dd = (kk*AA*(T2T2 - T1T1))/HH;
                    tampilan2.setText ( " d = " + df.format ( dd ) + "m" );

                }else if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" ) &&
                            !dT.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        dd = Double.parseDouble ( d.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        dTdT= Double.parseDouble ( dT.getText ( ).toString ( ) );

                    tampilan1.setText ( "d = k A dT/H " );
                    dd = (kk*AA*dTdT)/HH;
                    tampilan2.setText ( " d = " + df.format ( dd ) + "m" );
                } else
                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( "d = k A t(T2 - T1)/Q " );
                    dd = (kk*AA*tt*(T2T2 - T1T1))/QQ;
                    tampilan2.setText ( " d = " + df.format ( dd ) + "m" );

                }else if
                        ( !k.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" ) &&
                                !Q.getText ( ).toString ( ).equals ( "" )) {
                            kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                            tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            dTdT = Double.parseDouble (dT.getText ( ).toString ( ) );
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );

                    tampilan1.setText ( "d = k t A dT/Q " );
                    dd = (kk*AA*tt*dTdT)/QQ;
                    tampilan2.setText ( " d = " + df.format ( dd ) + "m" );

                }}}
        );
        btnk.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !H.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "k = d*H/(A(T2 - T1) " );
                    kk = dd*HH/(AA*(T2T2 - T1T1));
                    tampilan2.setText ( " k = " + df.format ( kk ) + "W/m derC" );

                }else if

                        ( !H.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" )) {
                           HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                           AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                           dTdT = Double.parseDouble ( dT.getText ( ).toString ( ) );
                           dd= Double.parseDouble ( d.getText ( ).toString ( ) );
                    tampilan1.setText ( "k = d H/( AdT) " );
                    kk = (dd * HH )/(AA * dTdT);
                    tampilan2.setText ( " k = " + df.format ( kk ) + "W/m derC" );
                } else
                if
                    ( !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "k = d*Q/(A t (T2 - T1) " );
                    kk = dd*QQ/(AA*tt*(T2T2 - T1T1));
                    tampilan2.setText ( " k = " + df.format ( kk ) + "W/m derC" );

                }else if
                        ( !Q.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" )) {
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                            tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            dTdT = Double.parseDouble ( dT.getText ( ).toString ( ) );
                            dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "A = d H/(k  A dT) " );
                    kk = (dd * QQ )/(AA*tt * dTdT);
                    tampilan2.setText ( " k = " + df.format ( kk ) + "W/m derC" );

                }}}
        );
        btnT1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "T1 = T2 - (d H/kA) " );
                    T1T1 = T2T2 - (dd * HH / (kk * AA));
                    tampilan2.setText ( " T1 = " + df.format ( T1T1 ) + " derC" );

                } else if
                        ( !k.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" ) &&
                                !Q.getText ( ).toString ( ).equals ( "" ) &&
                                !T2.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" )) {
                            kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                            tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                            T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                            dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "T1 = T2 - (d Q/(k A t)" );
                    T1T1 = T2T2 - (dd * QQ / (kk * AA * tt));
                    tampilan2.setText ( " T1 = " + df.format ( T1T1 ) + " derC" );

                } else if
                            ( !e.getText ( ).toString ( ).equals ( "" ) &&
                                    !t.getText ( ).toString ( ).equals ( "" ) &&
                                    !A.getText ( ).toString ( ).equals ( "" ) &&
                                    !Q.getText ( ).toString ( ).equals ( "" ) &&
                                    !T2.getText ( ).toString ( ).equals ( "" ) &&
                                    !d.getText ( ).toString ( ).equals ( "" )) {
                                ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                                QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                                T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                                dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T2 = " + df.format ( T2T2 ) + "K" );
                    tampilan2.setText ( "T1 = ((Sigma*e*A*t*T2^4 -  Q)/(Sigma*t*e*A))^0.25" );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    T1T1 = (0.0000000567 * ee * AA * tt * T2T2 - QQ) / (0.0000000567 * ee * AA * tt);
                    T1T1 = Math.pow ( T1T1 , 0.25 );
                    tampilan4.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    T1T1 = T1T1-273;
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + " der.C" );

                }else if
                                ( !e.getText ( ).toString ( ).equals ( "" ) &&
                                        !H.getText ( ).toString ( ).equals ( "" ) &&
                                        !T2.getText ( ).toString ( ).equals ( "" ) &&
                                        !A.getText ( ).toString ( ).equals ( "" )) {
                                    ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                    AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                                    HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );


                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan2.setText ( "T1 = ((Sigma*e*A*T^4 -  H)/(Sigma*e*A))^0.25" );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    T1T1 = (0.0000000567 * ee * AA * T2T2 - HH) / (0.0000000567 * ee * AA );
                    T1T1 = Math.pow ( T1T1 , 0.25 );
                    tampilan4.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    T1T1 = T1T1-273;
                    tampilan5.setText ( " T1 = " + df.format ( T1T1 ) + " der.C" );

            }}}
        );
        btnT2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "T1 = T2 - (d H/kA) " );
                    T2T2 =T1T1 +(dd*HH/(kk*AA));
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " der.C" );
                } else
                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "T2 = T1 - (d Q/(k A t)" );
                    T2T2 = T1T1 +(dd*QQ/(kk*AA*tt));
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + "derC" );

                }else if
                        ( !e.getText ( ).toString ( ).equals ( "" ) &&
                                !t.getText ( ).toString ( ).equals ( "" ) &&
                                !T1.getText ( ).toString ( ).equals ( "" ) &&
                                !Q.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" )) {
                            ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                            tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );

                    T1T1 = T1T1+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( "T2 = ((Sigma*e*A*t*T1^4 +  Q)/(Sigma*t*e*A))^0.25" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = (0.0000000567 * ee * AA * tt * T1T1 + QQ) / (0.0000000567 * ee * AA * tt);
                    T2T2 = Math.pow ( T2T2 , 0.25 );
                    tampilan3.setText ( " T2 = " + df.format ( T2T2 ) + "K" );
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + " der.C" );

             }else if
                            ( !e.getText ( ).toString ( ).equals ( "" ) &&
                                    !A.getText ( ).toString ( ).equals ( "" ) &&
                                    !T1.getText ( ).toString ( ).equals ( "" ) &&
                                    !H.getText ( ).toString ( ).equals ( "" ) &&
                                    !d.getText ( ).toString ( ).equals ( "" )) {
                                ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                                T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                                HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                                dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    T1T1 = T1T1+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( "T1 = ((Sigma*e*A*T1^4 +  H)/(Sigma*e*A))^0.25" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = (0.0000000567 * ee * AA * T1T1 + HH) / (0.0000000567 * ee * AA );
                    T2T2 = Math.pow ( T2T2 , 0.25 );
                    tampilan4.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    T2T2 = T2T2-273;
                    tampilan5.setText ( " T2 = " + df.format ( T2T2 ) + " der.C" );

            }}}
        );
        btndT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !H.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "dT = d Q/k A  " );
                    dTdT =dd*QQ/(kk*AA);
                    tampilan2.setText ( " dT = " + df.format (dTdT ) + "Cder" );
                } else
                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        dd= Double.parseDouble ( d.getText ( ).toString ( ) );

                    tampilan1.setText ( "dT = d H/k A  " );
                    dTdT =dd*HH/(kk*AA*tt);
                    tampilan2.setText ( " dT = " + df.format (dTdT ) + "Cder" );
                }}}
        );
        btnt.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                    ( !e.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );


                    T1T1 = T1T1+273;
                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan3.setText ( " t = Q/(signa e A (T2^4 - T1^4))" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    tt = QQ / (0.0000000567 * ee * AA * (T2T2 - T1T1));
                    tampilan5.setText ( " t = " + df.format ( tt ) + "s" );
                } else

                if
                    ( !k.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !d.getText ( ).toString ( ).equals ( "" )) {
                        kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                        QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );
                        dd = Double.parseDouble ( d.getText ( ).toString ( ) );


                        tampilan1.setText ( "t = d*Q/(A k (T2 - T1) " );
                    tt = dd*QQ/(AA*kk*(T2T2 - T1T1));
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );

                }else if
                        ( !k.getText ( ).toString ( ).equals ( "" ) &&
                                !Q.getText ( ).toString ( ).equals ( "" ) &&
                                !A.getText ( ).toString ( ).equals ( "" ) &&
                                !dT.getText ( ).toString ( ).equals ( "" ) &&
                                !d.getText ( ).toString ( ).equals ( "" )) {
                            kk = Double.parseDouble ( k.getText ( ).toString ( ) );
                            QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                            AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                            dTdT = Double.parseDouble ( T1.getText ( ).toString ( ) );
                            dd= Double.parseDouble ( d.getText ( ).toString ( ) );


                    tampilan1.setText ( "t = d Q/(k  A dT) " );
                    tt = (dd * QQ )/(AA*kk * dTdT);
                    tampilan2.setText ( " t = " + df.format ( tt ) + "s" );


                }}}
        );
        btne.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );


                if
                    ( !t.getText ( ).toString ( ).equals ( "" ) &&
                            !A.getText ( ).toString ( ).equals ( "" ) &&
                            !T1.getText ( ).toString ( ).equals ( "" ) &&
                            !T2.getText ( ).toString ( ).equals ( "" ) &&
                            !Q.getText ( ).toString ( ).equals ( "" )) {
                       QQ = Double.parseDouble ( Q.getText ( ).toString ( ) );
                        tt = Double.parseDouble ( t.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                        T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                        T1T1 = T1T1+273;
                        T2T2 = T2T2+273;

                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan3.setText ( " e = Q/(sigma t A (T2^4 - T1^4))" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    ee = QQ / (0.0000000567 * tt * AA * (T2T2 - T1T1));
                    tampilan5.setText ( " e = " + df.format ( ee )  );

                } else   if

                        ( !A.getText ( ).toString ( ).equals ( "" ) &&
                                !T1.getText ( ).toString ( ).equals ( "" ) &&
                                !T2.getText ( ).toString ( ).equals ( "" ) &&
                                !H.getText ( ).toString ( ).equals ( "" )) {
                    AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                    HH = Double.parseDouble ( H.getText ( ).toString ( ) );
                    T1T1 = Double.parseDouble ( T1.getText ( ).toString ( ) );
                    T2T2 = Double.parseDouble ( T2.getText ( ).toString ( ) );

                    T1T1 = T1T1+273;
                    T2T2 = T2T2+273;
                    tampilan1.setText ( " T1 = " + df.format ( T1T1 ) + " K" );
                    tampilan2.setText ( " T2 = " + df.format ( T2T2 ) + " K" );
                    tampilan3.setText ( " e = Q/(signa t A (T2^4 - T1^4))" );
                    T1T1 = Math.pow ( T1T1 , 4 );
                    T2T2 = Math.pow ( T2T2 , 4 );
                    ee = HH / (0.0000000567 * AA * (T2T2 - T1T1));
                    tampilan5.setText ( " e = " + df.format ( ee ) );
                } }});


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
        d.setText ( "" );
        k.setText ( "" );
        t.setText ( "" );
        A.setText ( "" );
        T1.setText ( "" );
        T2.setText ( "" );
        h.setText ( "" );
        H.setText ( "" );
        e.setText ( "" );
        A.setText ( "" );
        dT.setText ( "" );
        Q.setText ( "" );
        }}
        );
           
    }
}