package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class InduksiElektroMagnet extends AppCompatActivity {
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

    private EditText I1,I2,B,l,W,L,M,v,dt,N,A,Ns,Np,Vp,Vs,eta,Ip,Is,f,Re,fi;

    private Double I1I1,I2I2,BB,ll,WW,LL,MM,vv,dtdt,NN,AA,NsNs,NpNp,VpVp,VsVs,rr,etae,IpIp,IsIs,ff,ggl,ReRe,fifi,U, Pp, Ps;


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_induksi_elektro_magnet );

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



        I1 = findViewById ( R.id.in_I1 );
        I2 = findViewById ( R.id.in_I2 );
        B = findViewById ( R.id.in_B );
        l = findViewById ( R.id.in_l );
        W = findViewById ( R.id.in_W );
        L = findViewById ( R.id.in_L );
        fi = findViewById ( R.id.in_fi );
        v = findViewById ( R.id.in_v );
        dt = findViewById ( R.id.in_dt );
        N = findViewById ( R.id.in_N );
        A = findViewById ( R.id.in_A );
        Ns = findViewById ( R.id.in_Ns );
        Np = findViewById ( R.id.in_Np );
        Vp = findViewById ( R.id.in_Vp );
        Vs = findViewById ( R.id.in_Vs );
        eta = findViewById ( R.id.in_eta );
        Ip = findViewById ( R.id.in_Ip );
        Is = findViewById ( R.id.in_Is );
        f = findViewById ( R.id.in_w );
        Re = findViewById ( R.id.in_Re );

        Button btnggl = findViewById ( R.id.btn_ggl );
        Button btnL = findViewById ( R.id.btn_L );
        Button btnM = findViewById ( R.id.btn_M );
        Button btnVp = findViewById ( R.id.btn_Vp );
        Button btnVs = findViewById ( R.id.btn_Vs );
        Button btnIp = findViewById ( R.id.btn_Ip );
        Button btnIs = findViewById ( R.id.btn_Is );
        Button btnPp = findViewById ( R.id.btn_Pp );
        Button btnPs = findViewById ( R.id.btn_Ps );
        Button btnU = findViewById ( R.id.btn_U );
        Button btneta = findViewById ( R.id.btn_eta );

        Button btnhapus = findViewById ( R.id.btn_Hapus );
        Button btnnol = findViewById ( R.id.btn_Nol );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Kalkulator ini digunakan untuk menghitung: :" );
                tampilan2.setText ( "1. ggl induktor" );
                tampilan3.setText ( "2.ggl konduktor bergerak dalam medan magnet" );
                tampilan4.setText ( "3. ggl generator" );
                tampilan5.setText ( "4. induktansi induktor L dan M" );
                tampilan6.setText ( "5. transformator : Vp,Vs,Ip,Is,Np,Ns,Pp,Ps, efisiensi" );
                tampilan7.setText ( "6.Variabel yang digunakan:" );
                tampilan8.setText ( "7. L : induktansi diri; Re : resistor" );
                tampilan9.setText ( "8. M : induktansi bersama, dengan lilitan Np dan Ns" );
                tampilan10.setText ( "9. v : kecepatan gerak konduktor" );
                tampilan11.setText ( "10.W : omega : kecepatan sudut generator" );
                tampilan12.setText ( "11. N : jumlah lilitan" );
                tampilan13.setText ( "12. L : panjang lilitan");
                tampilan14.setText ( "13.A : luas loop konduktor" );
                tampilan15.setText ( "14.Np : jumlah lilitan primer, Ns : jumlah lilitan sekunder" );
                tampilan16.setText ( "15.Vp : tegangan primer, Vs tegangan sekunder" );
                tampilan17.setText ( "16  saat benda A " );
                tampilan18.setText ( "17. Ip arus primer, Is arus sekunder " );
                tampilan19.setText ( "18.Pp daya primer, Ps daya sekunder " );
                tampilan20.setText ( "19.Efi : efisiensi transformator " );
            }} );

          btnggl.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.##############" );
                if
                            (!L.getText ( ).toString ( ).equals ( "" )   &&
                            !dt.getText ( ).toString ( ).equals ( "" )   &&
                            !I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )) {
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );

                    tampilan1.setText ( "  ggl induktor = - L dI/dt" );
                    tampilan2.setText ( "  ggl induktor = - L (I2 - I1)/dt" );
                    ggl = -LL * (I2I2 - I1I1) / dtdt;
                    tampilan3.setText ( "ggl =" + df.format ( ggl ) + "volt" );

                } else
                if

                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !B.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                        BB = Double.parseDouble ( B.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                    tampilan1.setText ( "  ggl generator Vmax = NBAW" );
                    ggl =NN*BB*AA*WW;
                    tampilan3.setText ( "ggl =" + df.format ( ggl ) + "volt" );
                } else
                if

                    (!l.getText ( ).toString ( ).equals ( "" )   &&
                            !B.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )) {
                        ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                        BB = Double.parseDouble ( B.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                    tampilan1.setText ( "  ggl konduktor bergerak tegaklurus medan magnet" );
                    tampilan2.setText ( "  ggl = B l v" );
                    ggl =ll*BB*vv;
                    tampilan3.setText ( "ggl =" + df.format ( ggl ) + "volt" );
                } else
                if

                    (!l.getText ( ).toString ( ).equals ( "" )   &&
                            !B.getText ( ).toString ( ).equals ( "" )   &&
                            !W.getText ( ).toString ( ).equals ( "" )) {
                        ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                        BB = Double.parseDouble ( B.getText ( ).toString ( ) );
                        WW = Double.parseDouble ( W.getText ( ).toString ( ) );
                    tampilan1.setText ( "  ggl konduktor bergerak melingkar tegaklurus medan magnet" );
                    tampilan2.setText ( "  ggl = 0,5 B W l^2" );
                    ggl =0.5*BB*WW*Math.pow(ll,2);
                    tampilan3.setText ( "ggl =" + df.format ( ggl ) + "volt" );
                } else
                if
                    (!N.getText ( ).toString ( ).equals ( "" )   &&
                            !fi.getText ( ).toString ( ).equals ( "" )   &&
                            !dt.getText ( ).toString ( ).equals ( "" )) {
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                        fifi = Double.parseDouble ( fi.getText ( ).toString ( ) );
                        dtdt = Double.parseDouble ( dt.getText ( ).toString ( ) );
                    tampilan1.setText ( "  ggl loop konduktor ditembus perubahan fluks" );
                    tampilan2.setText ( "  ggl = - N dfluks/dt" );
                    ggl =- NN*fifi/dtdt;
                    tampilan3.setText ( "ggl =" + df.format ( ggl ) + "volt" );
                }}});


        btnL.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if

                    (!l.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )) {
                        ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                        AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                    tampilan1.setText ( "  induktansi solenoida L = uoA N^2/l" );
                    LL= 12.56*Math.pow(10,-7) * AA*Math.pow(NN,2) / ll;
                    tampilan3.setText ( "L =" + df.format ( LL ) + "H" );


                }}});
        btnM.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                AA = Double.parseDouble ( A.getText ( ).toString ( ) );
                NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );

                if
                ( ll != 0 && NpNp != 0 && AA != 0&&NsNs!=0  ) {

                    tampilan1.setText ( "  induktansi bersama M = uoA N1 N2/l" );
                    MM = 12.56*Math.pow(10,-7) * AA*NpNp*NsNs / ll;
                    tampilan3.setText ( "M =" + df.format ( MM ) + "H" );
                }}});
        btnU.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                LL = Double.parseDouble ( L.getText ( ).toString ( ) );


                if
                ( LL != 0 && I1I1 != 0 ) {

                    tampilan1.setText ( "  energi induktor berarus" );
                    tampilan2.setText ( "  U = 0,5 L I^2" );
                   U = 0.5*LL*Math.pow(I1I1,2);
                    tampilan3.setText ( "U =" + df.format (U ) + "joule" );
                }}});
        btnVs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                if
                ( NpNp!= 0 && NsNs != 0 &&VpVp!=0) {

                    tampilan1.setText ( "  tegangan output transformator ideal" );
                    tampilan2.setText ( "  Vs = Vp Ns/Np" );
                    VsVs = VpVp*NsNs/NpNp;
                    tampilan3.setText ( "Vs =" + df.format (VsVs ) + "volt" );
                }}});
        btnVp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );
                NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );
                if
                ( NpNp!= 0 && NsNs != 0 &&VsVs!=0) {

                    tampilan1.setText ( "  tegangan input transformator ideal" );
                    tampilan2.setText ( "  Vp = Vs Np/Ns" );
                    VpVp = VsVs*NpNp/NsNs;
                    tampilan3.setText ( "Vp =" + df.format (VpVp ) + "volt" );

                }}});
        btnIp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                if
                           (!Is.getText ( ).toString ( ).equals ( "" )   &&
                            !Vp.getText ( ).toString ( ).equals ( "" )   &&
                            !Vs.getText ( ).toString ( ).equals ( "" )   &&
                            !eta.getText ( ).toString ( ).equals ( "" )) {
                        IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                        VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                        VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );
                        etae = Double.parseDouble ( eta.getText ( ).toString ( ) );

                        tampilan1.setText ( "  transformator tidak ideal daya input = daya output" );
                        tampilan2.setText ( "  Ip =  Is Vs/(efisiensi*Vp)" );
                        IpIp = IsIs * VsVs /(etae* VpVp);
                        tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );
                } else
                if
                           (!Is.getText ( ).toString ( ).equals ( "" )   &&
                            !Np.getText ( ).toString ( ).equals ( "" )   &&
                            !Ns.getText ( ).toString ( ).equals ( "" )   &&
                           !eta.getText ( ).toString ( ).equals ( "" )) {
                        IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                        NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                        NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                        etae = Double.parseDouble ( eta.getText ( ).toString ( ) );

                        tampilan1.setText ( "  transformator tidak ideal daya input = daya output" );
                    tampilan2.setText ( "  Ip =  Is Ns/(efisiensi*Vp)" );
                    IpIp = IsIs * NsNs / (etae * NpNp);
                    tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );
                } else
                if
                           (!Is.getText ( ).toString ( ).equals ( "" )   &&
                            !Vp.getText ( ).toString ( ).equals ( "" )   &&
                            !Vs.getText ( ).toString ( ).equals ( "" )) {
                        IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                        VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                        VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator ideal daya input = daya output" );
                    tampilan2.setText ( "  Ip = Is Vs/Vp" );
                    IpIp = IsIs * VsVs / VpVp;
                    tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );
                } else
                if
                           (!Is.getText ( ).toString ( ).equals ( "" )   &&
                            !Np.getText ( ).toString ( ).equals ( "" )   &&
                            !Ns.getText ( ).toString ( ).equals ( "" )) {
                        IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                        NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                        NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator ideal daya input = daya output" );
                    tampilan2.setText ( "  Ip = Is Ns/Np" );
                    IpIp = IsIs * NsNs / NpNp;
                    tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );
                } else
                if
                           (!B.getText ( ).toString ( ).equals ( "" )   &&
                            !l.getText ( ).toString ( ).equals ( "" )   &&
                            !v.getText ( ).toString ( ).equals ( "" )   &&
                            !Re.getText ( ).toString ( ).equals ( "" )) {
                        BB = Double.parseDouble ( B.getText ( ).toString ( ) );
                        ll = Double.parseDouble ( l.getText ( ).toString ( ) );
                        vv = Double.parseDouble ( v.getText ( ).toString ( ) );
                        ReRe = Double.parseDouble ( Re.getText ( ).toString ( ) );
                    tampilan1.setText ( "  arus loop konduktor bergerak dalam medan magnet");
                    IpIp = BB * ll*vv /ReRe;
                    tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );

            }}});
        btnIs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                etae = Double.parseDouble ( eta.getText ( ).toString ( ) );
                VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );

                if
                    (!Ip.getText ( ).toString ( ).equals ( "" )   &&
                            !Vp.getText ( ).toString ( ).equals ( "" )   &&
                            !Vs.getText ( ).toString ( ).equals ( "" )   &&
                            !eta.getText ( ).toString ( ).equals ( "" )) {
                        IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                        VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                        VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );
                        etae = Double.parseDouble ( eta.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator tidak ideal daya input = daya output" );
                    tampilan2.setText ( "  Is =  Ip Vp/(efisiensi*Vs)" );
                    IsIs = IpIp * VpVp /(etae* VsVs);
                    tampilan3.setText ( "Ip =" + df.format ( IpIp ) + "A" );
                } else
                if
                    (!Ip.getText ( ).toString ( ).equals ( "" )   &&
                            !Np.getText ( ).toString ( ).equals ( "" )   &&
                            !Ns.getText ( ).toString ( ).equals ( "" )   &&
                            !eta.getText ( ).toString ( ).equals ( "" )) {
                        IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                        NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                        NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                        etae = Double.parseDouble ( eta.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator tidak ideal daya input = daya output" );
                    tampilan2.setText ( "  Is =  Ip Np/(efisiensi*Vs)" );
                    IsIs = IpIp * NpNp / (etae * NsNs);
                    tampilan3.setText ( "Is =" + df.format ( IsIs ) + "A" );
                } else
                if
                    (!Ip.getText ( ).toString ( ).equals ( "" )   &&
                            !Vp.getText ( ).toString ( ).equals ( "" )   &&
                            !Vs.getText ( ).toString ( ).equals ( "" )) {
                        IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                        VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                        VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator ideal daya input = daya output" );
                    tampilan2.setText ( "  Is = Ip Vp/Vs" );
                    IsIs = IpIp * VpVp / VsVs;
                    tampilan3.setText ( "Is =" + df.format ( IsIs ) + "A" );
                } else
                if
                    (!Ip.getText ( ).toString ( ).equals ( "" )   &&
                            !Np.getText ( ).toString ( ).equals ( "" )   &&
                            !Ns.getText ( ).toString ( ).equals ( "" )) {
                        IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                        NpNp = Double.parseDouble ( Np.getText ( ).toString ( ) );
                        NsNs = Double.parseDouble ( Ns.getText ( ).toString ( ) );
                    tampilan1.setText ( "  transformator ideal daya input = daya output" );
                    tampilan2.setText ( "  Is = Ip Np/Ns" );
                    IsIs = IpIp * NpNp / NsNs;
                    tampilan3.setText ( "Is =" + df.format ( IsIs ) + "A" );

                }}});
        btnPp.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                  if
                ( IpIp!= 0 && VpVp != 0 ) {

                    tampilan1.setText ( " daya  transformator " );
                    tampilan2.setText ( " Pp =  Ip Vp" );
                    Pp = IpIp * VpVp;
                    tampilan3.setText ( "Pp =" + df.format (Pp ) + "watt" );

                }}});
        btnPs.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );

                if
                ( IsIs!= 0 && VsVs != 0 ) {

                    tampilan1.setText ( " daya  transformator " );
                    tampilan2.setText ( " Ps =  Is Vs" );
                    Ps = IsIs * VsVs;
                    tampilan3.setText ( "Ps =" + df.format ( Ps ) + "A" );

                }}});

        btneta.setOnClickListener ( new View.OnClickListener ( ) {
            @Override public void onClick ( View view ) {

                DecimalFormat df = new DecimalFormat ( "#.###" );

                IpIp = Double.parseDouble ( Ip.getText ( ).toString ( ) );
                IsIs = Double.parseDouble ( Is.getText ( ).toString ( ) );
                VpVp = Double.parseDouble ( Vp.getText ( ).toString ( ) );
                VsVs = Double.parseDouble ( Vs.getText ( ).toString ( ) );

                if
                ( IsIs!= 0 && VsVs != 0&&IpIp!=0&&VpVp!=0 ) {

                    tampilan1.setText ( " efisiensi transformator " );
                    tampilan2.setText ( " eta =  Is Vs/Ip Vp" );
                    etae = 100*IsIs * VsVs/(IpIp*VpVp);
                    tampilan3.setText ( "Efisiensi =" + df.format ( etae ) + "%" );

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


                I1.setText ( "" );
                I2.setText ( "" );
                B.setText ( "" );
                l.setText ( "" );
                W.setText ( "" );
                L.setText ( "" );
                fi.setText ( "" );
                v.setText ( "" );
                dt.setText ( "" );
                N.setText ( "" );
                A.setText ( "" );
                N.setText ( "" );
                Np.setText ( "" );
                Ns.setText ( "" );
                Ip.setText ( "" );
                Is.setText ( "" );
                eta.setText ( "" );
                f.setText ( "" );
                Vp.setText ( "" );
                Vs.setText ( "" );
                Re.setText ( "" );
            }
        } );
    }
}

