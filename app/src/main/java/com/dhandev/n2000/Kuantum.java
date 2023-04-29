package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class Kuantum extends AppCompatActivity {
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
    private TextView tampilan16;
    private TextView tampilan17;
    private TextView tampilan18;
    private TextView tampilan19;
    private TextView tampilan20;

    private EditText T,e,A,l,lm,W,lo,f,fo,teta,m,v,p,Vo;

    private Double TT,AA,ee,ll, lmlm,WW,lolo,ff,fofo,teeta,mm,vv,pp,P,E,VoVo,Ekm,dl, lh, lB;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_kuantum );

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
        tampilan16 = findViewById ( R.id.tampilan16 );
        tampilan17 = findViewById ( R.id.tampilan17 );
        tampilan18 = findViewById ( R.id.tampilan18 );
        tampilan19 = findViewById ( R.id.tampilan19 );
        tampilan20= findViewById ( R.id.tampilan20 );



        T = findViewById ( R.id.in_T );
        e = findViewById ( R.id.in_e );
        A = findViewById ( R.id.in_A );
        l = findViewById ( R.id.in_lamda );
        lm = findViewById ( R.id.in_lm );
        W = findViewById ( R.id.in_W );
        lo = findViewById ( R.id.in_lo );
        fo = findViewById ( R.id.in_fo );
        teta = findViewById ( R.id.in_teta );
        m = findViewById ( R.id.in_m );
        v = findViewById ( R.id.in_v );
        p = findViewById ( R.id.in_p );
        f = findViewById ( R.id.in_w );
        Vo = findViewById ( R.id.in_Vo );


        Button btnP = findViewById ( R.id.btn_P );
        Button btnT = findViewById ( R.id.btn_T );
        Button btnlm = findViewById ( R.id.btn_Lm );
        Button btnE = findViewById ( R.id.btn_E );
        Button btnlb = findViewById ( R.id.btn_LB );
        Button btnEkm = findViewById ( R.id.btn_Ekm );
        Button btnVo = findViewById ( R.id.btn_Vo );
        Button btnlo = findViewById ( R.id.btn_Lo );
        Button btnfo = findViewById ( R.id.btn_f );
        Button btnW = findViewById ( R.id.btn_W );
        Button btndl = findViewById ( R.id.btn_dL );
        Button btnl2 = findViewById ( R.id.btn_L2 );
        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator ini digunakan untuk menghitung: :" );
                tampilan2.setText ( "1. daya radiasi" );
                tampilan3.setText ( "2. lamda max (Lm) pergeseran Wien" );
                tampilan4.setText ( "3. fungsi kerja (W) pada efek fotolistrik" );
                tampilan5.setText ( "4. lamda ambang (Lo) pada efek fotolistrik" );
                tampilan6.setText ( "5. potensial stop (Vo) pada efek fotolistrik" );
                tampilan7.setText ( "6. energi kinetik maksimum (Ekmax) pada efek fotolistrik" );
                tampilan8.setText ( "7. frekuensi ambang fo pada efek fotolistrik" );
                tampilan9.setText ( "8. momentum foton (p)" );
                tampilan10.setText ( "9. pergeseran panjang gelombang foton (dL) pada efek Compton" );
                tampilan11.setText ( "10. panjang gelombang  (L) de Broglie" );
                tampilan12.setText ( "11. lamda setelah terhambur (L2) pada efek Compton " );
                tampilan13.setText ( "");
                tampilan14.setText ( "13.SELAMAT BELAJAR" );

            }} );

        btnP.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                ee = Double.parseDouble ( e.getText ( ).toString ( ) );
                AA = Double.parseDouble (A.getText ( ).toString ( ) );

                if
                ( TT != 0 && AA != 0 && ee != 0  ) {

                    tampilan1.setText ( " radiasi benda hitam P = A e S T^4" );
                    P = AA*ee*5.67*Math.pow(10,-8)*Math.pow(TT,4);
                    tampilan3.setText ( "P =" + P.doubleValue () + "watt" );

                }}});
        btnlm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                TT = Double.parseDouble ( T.getText ( ).toString ( ) );
                if
                ( TT != 0  ) {

                    tampilan1.setText ( " panjang gelombang dominan radiasi benda hitam " );
                    tampilan2.setText ( " lamdamax T = 2,9 10^-3" );
                    lmlm = 2.9*Math.pow(10,-3)/TT;
                    tampilan3.setText ( "lm =" + lmlm.doubleValue () + "m" );
                }}});
        btnT.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                lmlm = Double.parseDouble ( lm.getText ( ).toString ( ) );
                if
                ( lmlm != 0  ) {
                    lmlm = lmlm*Math.pow(10,-9);
                    tampilan1.setText ( " panjang gelombang dominan radiasi benda hitam " );
                    tampilan2.setText ( " lamdamax T = 2,9 10^-3" );
                    TT = 2.9*Math.pow(10,-3)/lmlm;
                    tampilan3.setText ( "T =" + df.format ( TT ) + "m" );
                }}});
        btnE.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                            (!f.getText ( ).toString ( ).equals ( "" )) {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );

                    ff = ff * Math.pow(10,9);
                    tampilan1.setText ( " energi foton radiasi benda hitam " );
                    tampilan2.setText ( " E = h f" );
                    E = 6.63 * Math.pow ( 10 , -34 ) * ff;
                    tampilan3.setText ( "E =" + E.doubleValue ( ) + "joule" );
                }else
                if

                    (!l.getText ( ).toString ( ).equals ( "" )) {
                        ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                    ll = ll* Math.pow(10,-9);
                    tampilan1.setText ( " energi foton radiasi benda hitam " );
                    tampilan2.setText ( " E = hc/lamda" );
                    E = 19.89 * Math.pow ( 10 , -26 )/ll;
                    tampilan3.setText ( "E =" + E.doubleValue ( ) + "joule" );
                }}});
        btnEkm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                 if

                    (!Vo.getText ( ).toString ( ).equals ( "" )) {
                        VoVo = Double.parseDouble ( Vo.getText ( ).toString ( ) );
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " Ekm = e Vo" );
                    Ekm = 1.6 * Math.pow ( 10 , -19 ) * VoVo;
                    tampilan3.setText ( "Ekm =" + Ekm.doubleValue ( ) + "joule" );
                } else
                if

                    (!f.getText ( ).toString ( ).equals ( "" )   &&
                            !fo.getText ( ).toString ( ).equals ( "" )) {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                        fofo = Double.parseDouble (fo.getText ( ).toString ( ) );

                    ff = ff * Math.pow(10,9);
                    fofo = fofo * Math.pow(10,9);
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " Ekm = hf - hfo" );
                    Ekm = 6.63 * Math.pow ( 10 , -34 ) *(ff-fofo) ;
                    tampilan3.setText ( "Ekm =" + Ekm.doubleValue ( ) + "joule" );
                } else
                if

                    (!f.getText ( ).toString ( ).equals ( "" )   &&
                            !lo.getText ( ).toString ( ).equals ( "" )) {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                        lolo = Double.parseDouble (lo.getText ( ).toString ( ) );
                    ff = ff * Math.pow(10,9);
                    lolo = lolo * Math.pow(10,-9);
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " Ekm = hf - hc/lamda nol" );
                    Ekm = (6.63 * Math.pow ( 10 , -34 ) * ff)-(19.89 * Math.pow ( 10 , -26 )/lolo) ;
                    tampilan3.setText ( "Ekm =" + Ekm.doubleValue ( ) + "joule" );
                } else
                if

                    (!f.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        ff = Double.parseDouble ( f.getText ( ).toString ( ) );
                        WW = Double.parseDouble (W.getText ( ).toString ( ) );
                    ff = ff * Math.pow(10,9);
                    WW = WW * Math.pow(10,-19);
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " Ekm = hf -W" );
                    Ekm = (6.63 * Math.pow ( 10 , -34 ) * ff)-(WW) ;
                    tampilan3.setText ( "Ekm =" + Ekm.doubleValue ( ) + "joule" );
                } else
                if

                (!l.getText ( ).toString ( ).equals ( "" )   &&
                        !W.getText ( ).toString ( ).equals ( "" )) {
                    ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                    WW = Double.parseDouble (W.getText ( ).toString ( ) );
                    ll = ll * Math.pow(10,-9);
                    WW = WW * Math.pow(10,-19);
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " Ekm = hc/lamda - W" );
                    Ekm = 19.89 * Math.pow ( 10 , -26 )/ll - WW ;
                    tampilan3.setText ( "Ekm =" + Ekm.doubleValue ( ) + "joule" );
                    Ekm = Ekm*Math.pow(10,19)/1.6;
                    tampilan4.setText ( "Ekm =" + Ekm.doubleValue ( ) + "eV" );
                }}});

        btnW.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!fo.getText ( ).toString ( ).equals ( "" )) {
                        fofo = Double.parseDouble ( fo.getText ( ).toString ( ) );
                    fofo = fofo * Math.pow(10,9);
                    tampilan1.setText ( " fungsi kerja bahan " );
                    tampilan2.setText ( "W = h fo = hc/lamda nol" );
                    WW = 6.63 * Math.pow ( 10 , -34 ) * fofo;
                    tampilan3.setText ( "W =" + WW.doubleValue ( ) + "joule" );
                } else
                if

                    (!lo.getText ( ).toString ( ).equals ( "" )) {
                        lolo = Double.parseDouble ( lo.getText ( ).toString ( ) );
                    lolo = lolo * Math.pow(10,-9);
                    tampilan1.setText ( " energi kinetik ninimum elektron " );
                    tampilan2.setText ( " W = hc /lamdanol" );
                    Ekm = 19.89 * Math.pow ( 10 , -26 )/lolo ;
                    tampilan3.setText ( "W =" + Ekm.doubleValue ( ) + "joule" );

                }}});

        btndl.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );

                if
                (teeta != 0  ) {

                    tampilan1.setText ( " efek Compton: foton menumbuk elektron menyebabkan energi foton terserap sehingga " +
                            "lamda makin besar " );
                    tampilan2.setText ( "dlamda =  (h/(mo c)(1- cos teta)" );
                    teeta = teeta*3.14/180;
                    dl = 0.242857*Math.pow(10,-11)*(1 - Math.cos(teeta));
                    tampilan3.setText ( "dl =" + dl.doubleValue ( ) + "m" );

                }}});

        btnl2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                teeta = Double.parseDouble ( teta.getText ( ).toString ( ) );
                ll = Double.parseDouble ( l.getText ( ).toString ( ) );

                if
                (teeta != 0&&ll!=0  ) {

                    ll = ll * Math.pow(10,-9);
                    tampilan1.setText ( " efek Compton: foton menumbuk elektron menyebabkan energi foton terserap sehingga " +
                            "lamda makin besar " );
                    tampilan2.setText ( "dlamda = (lamda hambur - lamda datang) = (h/(mo c)(1- cos teta)" );
                    tampilan3.setText ( "lamda hambur = lamda datang)+ (h/(mo c)(1- cos teta)" );

                    teeta = teeta*3.14/180;
                    dl = 0.242857*Math.pow(10,-11)*(1 - Math.cos(teeta));
                    lh = dl+ll;
                    tampilan4.setText ( "lamda hambur =" + lh.doubleValue ( ) + "m" );
                }}});
        btnlb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                pp = Double.parseDouble ( p.getText ( ).toString ( ) );

                if

                    (!m.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                        vv = Double.parseDouble (v.getText ( ).toString ( ) );
                        mm = mm * Math.pow ( 10 , -31 );
                    vv = vv * Math.pow ( 10 , 6 );
                    tampilan1.setText ( " gelombang de Broglie " );
                    tampilan2.setText ( " lamda = h/p = h/mv" );
                    lB = 6.63 * Math.pow ( 10 , -34 ) / (mm * vv);
                    tampilan4.setText ( "lamda Broglie = " + lB.doubleValue ( ) + "m" );
                } else
                if

                    (!p.getText ( ).toString ( ).equals ( "" )) {
                       pp = Double.parseDouble ( p.getText ( ).toString ( ) );
                        pp = pp * Math.pow ( 10 , -27 );
                    tampilan1.setText ( " gelombang de Broglie " );
                    tampilan2.setText ( " lamda = h/p = h/mv" );
                    lB = 6.63 * Math.pow ( 10 , -34 ) / pp;
                    tampilan4.setText ( "lamda Broglie = " + lB.doubleValue ( ) + "m" );
                } else
                if

                (!m.getText ( ).toString ( ).equals ( "" )   &&
                        !v.getText ( ).toString ( ).equals ( "" )) {
                    mm = Double.parseDouble ( m.getText ( ).toString ( ) );
                    vv = Double.parseDouble (v.getText ( ).toString ( ) );
                   pp = mm*vv;
                    tampilan1.setText ( " gelombang de Broglie " );
                    tampilan2.setText ( " lamda = h/p = h/mv" );
                    lB = 6.63 * Math.pow ( 10 , -34 ) / pp;
                    tampilan4.setText ( "lamda Broglie = " + lB.doubleValue ( ) + "m" );
                }}});


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
                tampilan16.setText ( "" );
                tampilan17.setText ( "" );
                tampilan18.setText ( "" );
                tampilan19.setText ( "" );
                tampilan20.setText ( "" );


                T.setText ( "" );
                e.setText ( "" );
                A.setText ( "" );
                l.setText ( "" );
                W.setText ( "" );
                l.setText ( "" );
                lm.setText ( "" );
                v.setText ( "" );
                W.setText ( "" );
                lo.setText ( "" );
                A.setText ( "" );
                fo.setText ( "" );
                teta.setText ( "" );
                m.setText ( "" );
                v.setText ( "" );
                p.setText ( "" );
                f.setText ( "" );
                Vo.setText ( "" );
            }
        } );
    }
}

