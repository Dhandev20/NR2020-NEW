package com.dhandev.n2000;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
public class MedanMagnet extends AppCompatActivity {
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
    private TextView tampilan21;
    private TextView tampilan22;
    private TextView tampilan23;
    private TextView tampilan24;
    private TextView tampilan25;
    private TextView tampilan26;
    private TextView tampilan27;
    private TextView tampilan28;
    private TextView tampilan29;
    private TextView tampilan30;
    private EditText I1,I2,Ra,r,I3,vx,vy,vz,Bx,By,Bz,N,n,L,A,tet,x,x1,x2,x3,y,y1,y2,y3,q,z,z1,h ;


    private Double I1I1,I2I2,RR,rr,I3I3,vxvx,vyvy,vzvz,BxBx,ByBy,BzBz,NN,nn,LL,BB,FF,II,To,teta,xx,x1x1,x2x2,x3x3,yy,y1y1,y2y2,y3y3,qq,AA,zz,z1z1,hh;
    private Double ri,rj,rk, K, M, O,P, Bi,Bj,Bk,B1i,B1j, Bik,B2i,B2j,B2k,r1i,r1j,r1k,r2i,r2j,r2k,B1,B2,Fx,Fy,Fz,F;
    private Double r12i,r12j,r13i,r13j,r21i,r21j,r23i,r23j,r31i,r31j,r32i,r32j,r12,r13,r21,r23,r31,r32;
    private Double F12,F13,F21,F23,F31,F32,F1,F2,F3,F1i,F1j,F2i,F2j,F3i,F3j, uo;

    @Override


    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_medan_magnet );
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
        tampilan21 = findViewById ( R.id.tampilan21 );
        tampilan22 = findViewById ( R.id.tampilan22 );
        tampilan23 = findViewById ( R.id.tampilan23 );
        tampilan24 = findViewById ( R.id.tampilan24 );
        tampilan25 = findViewById ( R.id.tampilan25 );
        tampilan26 = findViewById ( R.id.tampilan26 );
        tampilan27 = findViewById ( R.id.tampilan27 );
        tampilan28 = findViewById ( R.id.tampilan28 );
        tampilan29 = findViewById ( R.id.tampilan29 );
        tampilan30= findViewById ( R.id.tampilan30 );
        I1 = findViewById ( R.id.in_I1 );
        I2 = findViewById ( R.id.in_I2 );
        Ra = findViewById ( R.id.in_R );
        r = findViewById ( R.id.in_r );
        vx = findViewById ( R.id.in_vx );
        vy = findViewById ( R.id.in_vy );
        vz = findViewById ( R.id.in_vz );
        Bx = findViewById ( R.id.in_Bx );
        By = findViewById ( R.id.in_By );
        Bz = findViewById ( R.id.in_Bz );
        N = findViewById ( R.id.in_N );
        n = findViewById ( R.id.in_n );
        L = findViewById ( R.id.in_L );
        A = findViewById ( R.id.in_A );
        tet = findViewById ( R.id.in_teta );
        x = findViewById ( R.id.in_x );
        x1 = findViewById ( R.id.in_x1 );
        x2 = findViewById ( R.id.in_x2 );
        x3 = findViewById ( R.id.in_x3 );
        y = findViewById ( R.id.in_y );
        y1 = findViewById ( R.id.in_y1 );
        y2 = findViewById ( R.id.in_y2 );
        y3 = findViewById ( R.id.in_y3 );
        q = findViewById ( R.id.in_q );
        I3 = findViewById ( R.id.in_I3 );
        z = findViewById ( R.id.in_z );
        z1 = findViewById ( R.id.in_z1 );
        h = findViewById ( R.id.in_h );


        Button btnF1 = findViewById ( R.id.btn_F1 );
        Button btnF2 = findViewById ( R.id.btn_F2 );
        Button btnF3 = findViewById ( R.id.btn_F3 );


        Button btnB = findViewById ( R.id.btn_B );
        Button btnF = findViewById ( R.id.btn_F );
        Button btnI = findViewById ( R.id.btn_alfa );
        Button btnTor = findViewById ( R.id.btn_Torsi );
        Button btnB0 = findViewById ( R.id.btn_B0 );

        Button nol = findViewById ( R.id.btn_Nol );
        Button hapus = findViewById ( R.id.btn_Hapus );
        Button btninfo = findViewById ( R.id.btn_Info );


        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( "Medan Magnet" );
                tampilan2.setText ( "kalkulator inidigunakan untuk menghitung:" );
                tampilan3.setText ( " 1. Medan magnet P(x,y,z) oleh muatan q bergerak dengan kecepatan (vx,vy,vz)" );
                tampilan4.setText ( " 2. Medan magnet kawat lurus dan melingkar berarus" );
                tampilan5.setText ( " 3. Medan magnet oleh solenoida " );
                tampilan6.setText ( " 4. Medan magnet dalam toroida" );
                tampilan7.setText ( " 5. Medan magnet oleh dua arus I1(x1,y1) dan I2(x2,y2) di P (x,y)" );
                tampilan8.setText ( " 6. Torsi loop arus dalam medan magnet" );
                tampilan9.setText ( "7. Gaya Lorentz oleh muatan bergerak (vx,vy,vz) dalam medan magnet (Bx,By,Bz)" +
                        "8. Gaya Lorentz yang dialami kawat berarus dalam medan listrik: arus listrik dinyatakan I1, dengan arah arus mengkikuti" +
                        "ketentuan sebagai berikut:bila arus sejajar sumbu x1, ditulis x1 = 1, bila ke arah x negatif maka x1 = -1;" +
                        "bila arus sejajar sumbu y1, ditulis y1 = 1, bila ke arah y negatif maka y1 = -1;" +
                        "  bila arus sejajar sumbu z1, ditulis z1 = 1, bila ke arah z negatif maka z1 = -1;" +
                        "medan magnet B = Bxi + Byj + Bzk " );
                tampilan10.setText ( " 9. Gaya antara tiga kawat berarus I1(x1,y1), I2(x2,y2) dan I3(x3,y3), " +
                        "10. Gaya antara dua kawat berarus I1(x1,y1) dan I2(x2,y2)" +
                        "11. gaya yang dialami muatan q bergerak dengan kecepatan vx sejajar arus I1 dan terpisah sejah r " );
                tampilan11.setText ( " I1,I2,I3: arus listrik" );
                tampilan12.setText ( "q : muatan yang bergerak (vx,vy,vz)" );
                tampilan13.setText ( " h : jarak dari pusat loop titik pengamatan p" );
                tampilan14.setText ( " x1, y1 : posisi I1 " );
                tampilan15.setText ( " x2, y2 : posisi I2" );
                tampilan16.setText ( " x, y  : posisi P titik pengamatan medan magnet " );
                tampilan17.setText ( " F : gaya Lorentz muatan bergerak(vx,vy,vz) dalam medan (Bx,By,Bz) atau gaya antara muatan q bergerak sejajr I1 " );
                tampilan18.setText ( " Bx,By,Bz : Medan [vektor] magnet; " );
                tampilan19.setText ( " To : torsi " );
                tampilan20.setText ( " A : luas loop" );
                tampilan21.setText ( " N : jumlah lilitan" );
                tampilan22.setText ( " L : panjang lilitan" );
                tampilan23.setText ( " V potensial listrik oleh q1 dan q2" );
                tampilan24.setText ( " n : jumlah lilitan persatuan panjang" );
                tampilan25.setText ( " teta : sudut antara normal loop dengan B " );
                tampilan26.setText ( " d : jarak antara I1 dan I2" );
                tampilan27.setText ( "Ra : jari-jari loop" );
                tampilan28.setText ( "r : jarak titik pengamatan ke kawat berarus" );
                tampilan30.setText ( "SELAMAT BELAJAR" );
            }});
        btnB.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );


                if
                            (!q.getText ( ).toString ( ).equals ( "" )   &&
                             !x.getText ( ).toString ( ).equals ( "" )   &&
                             !y.getText ( ).toString ( ).equals ( "" )   &&
                             !z.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !z1.getText ( ).toString ( ).equals ( "" )   &&
                            !vx.getText ( ).toString ( ).equals ( "" )   &&
                            !vy.getText ( ).toString ( ).equals ( "" )   &&
                            !vz.getText ( ).toString ( ).equals ( "" )) {
                          qq = Double.parseDouble ( q.getText ( ).toString ( ) );
                          xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                          yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                          zz = Double.parseDouble ( z.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        z1z1 = Double.parseDouble ( z1.getText ( ).toString ( ) );
                        vxvx = Double.parseDouble ( vx.getText ( ).toString ( ) );
                        vyvy = Double.parseDouble ( vy.getText ( ).toString ( ) );
                        vzvz = Double.parseDouble ( vz.getText ( ).toString ( ) );

                    tampilan1.setText ( " Medan magnet di P(x,y,z) oleh muatan q di (x1,y1,z1) bergerak dengan kecepatan V = vxi + vyj + vzk" );
                    qq = qq * Math.pow ( 10 , -6 );
                    tampilan2.setText ( " B = (uo/4pi)q v x (r - r')/(r - r')^3" );
                    ri = xx - x1x1;
                    rj = yy - y1y1;
                    rk = zz - z1z1;
                    K = Math.pow ( ri , 2 ) + Math.pow ( rj , 2 ) + Math.pow ( rk , 2 );
                    M = Math.pow ( K , 1.5 );
                    Bi = (vyvy * rk) - (vzvz * rj);
                    Bj = (vzvz * ri) - (vxvx * rk);
                    Bk = (vxvx * rj) - (vyvy * ri);

                    tampilan3.setText ( " uo/4pi =10* E-7" );
                    BB = Math.pow ( 10 , -7 ) * qq / M;
                    tampilan4.setText ( "|r-r'|^3 = " + df.format ( M ) + " m3" );
                    tampilan6.setText ( "B = " + BB.doubleValue ( ) + " (" + df.format ( Bi ) + "i + " + df.format ( Bj ) + "j + " + df.format ( Bk ) + "k ) T" );
                    O = Math.pow ( Bi , 2 ) + Math.pow ( Bj , 2 ) + Math.pow ( Bk , 2 );
                    O = Math.pow ( O , 0.5 );
                    BB = O * BB;
                    tampilan7.setText ( " besar medan magnet B = " + BB.doubleValue ( ) + "T" );
                } else

                    if
                            (!x.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                             !y.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )   &&
                            !I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )) {
                        xx = Double.parseDouble ( x.getText ( ).toString ( ) );
                        yy = Double.parseDouble ( y.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Medan magnet di P(x,y) oleh arus I1(x1,y1) dan arus I2(x2,y2) berarti arus // sumbu Z" );
                    tampilan2.setText ( " B = uo I /2pi r;  dengan arah B ditentukan   dl x (r -r')" );
                    tampilan3.setText ( " arus searah sumbu Z positif B positif, dan sebaliknya" );
                    tampilan4.setText ( " " );
                   r1i = xx - x1x1;
                   r1j = yy - y1y1;
                   r2i = xx - x2x2;
                   r2j = yy - y2y2;
                   K = Math.pow(r1i,2)+Math.pow(r1j,2);
                   M = Math.pow(K,0.5);
                   B1 = 2* Math.pow(10,-7)*I1I1;
                   B1 = B1/M;
                   B1i =-r1j;
                   B1j = r1i;

                    tampilan5.setText ( "vektor perpindahan I1 : (r - r') = " + df.format ( r1i )+ "i + " +df.format (r1j )+ " j ");
                    tampilan6.setText ( "vektor perpindahan I2 : (r - r') = " + df.format ( r2i )+ "i + " +df.format (r2j )+ " j ");
                    tampilan7.setText ( "B1 = " +  B1.doubleValue () + " (" +df.format ( B1i )+ "i + " +df.format ( B1j )+ " j T");

                    P = Math.pow(r2i,2)+Math.pow(r2j,2);
                    P = Math.pow(P,0.5);
                    B2 = 2* Math.pow(10,-7)*I2I2;
                    B2 = B2/P;
                    B2i =-r2j;
                    B2j = r2i;
                    tampilan8.setText ( "B2 = " +  B2.doubleValue () + " (" +df.format ( B2i )+ "i + " +df.format ( B2j )+ " j T");

                    Bi = (B1*B1i) + (B2*B2i);

                    Bj = (B1*B1j) + (B2*B2j);
                    tampilan9.setText ( "B = " +  Bi.doubleValue () + " i   + "+ Bj.doubleValue () + " j T");

                    BB = Math.pow(Bi,2)+Math.pow(Bj,2);
                    BB = Math.pow(BB,0.5);

                    tampilan10.setText ( "Besar medan magnet B = " +  BB.doubleValue ()  + "  T");

                } else
                if
                           (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !Ra.getText ( ).toString ( ).equals ( "" )   &&
                           //  !z.getText ( ).toString ( ).equals ( "" )   &&
                             !h.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        RR = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                        hh = Double.parseDouble ( h.getText ( ).toString ( ) );
                        //zz = Double.parseDouble ( z.getText ( ).toString ( ) );

                    tampilan1.setText ( " Medan magnet di P(x,y) berjarak h dari pusat cincin berarus berjari-jari R" );
                    tampilan2.setText ( " B = uo I R^2/2{R^2 + h^2}^3/2 ;  dengan arah B sumbu z positif" );
                    tampilan3.setText ( "  uo = 4 pi * 10^ -7 weber per ampere per meter" );

                    K = Math.pow(RR,2);
                    M = Math.pow(hh,2);
                    O = K + M;
                    O = Math.pow(O,1.5);
                    B1 = 12.56*Math.pow(10,-7)*I1I1*K/O;

                    tampilan5.setText ( "B1 = " +  B1.doubleValue ()  +"  T");
                } else
                if
                          (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );

                    tampilan1.setText ( " Medan magnet di dalam toroida jari-jari  r, N lilitan berarus i " );
                    tampilan2.setText ( " B = uo I N /2pi r" );

                    B1 = 2* Math.pow(10,-7)*NN*I1I1;
                    B1 = B1/rr;

                    tampilan4.setText ( "B1 = " +  B1.doubleValue ()  +"  T");
                               } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        LL = Double.parseDouble ( L.getText ( ).toString ( ) );
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                    tampilan1.setText ( " Medan magnet di dalam solenoida panjang L, N lilitan berarus i " );
                    tampilan2.setText ( " B = uo I N /L" );

                    B1 = 12.56* Math.pow(10,-7)*NN*I1I1/LL;
                    tampilan4.setText ( "B1 = " +  B1.doubleValue ()  +"  T");
                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !n.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        nn = Double.parseDouble ( n.getText ( ).toString ( ) );
                    tampilan1.setText ( " Medan magnet di dalam solenoida dengan lilitan persatuan panjan n, berarus i " );
                    tampilan2.setText ( " B = uo I n" );

                    B1 = 12.56* Math.pow(10,-7)*nn*I1I1;
                    tampilan4.setText ( "B1 = " +  B1.doubleValue ()  +"  T");

                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                    tampilan1.setText ( " Medan magnet di P(x,y) berjarak r dari kawat berarus" );
                    tampilan2.setText ( " B = uo I /2pi r;  dengan arah B ditentukan   dl x (r -r')" );

                    B1 = 2* Math.pow(10,-7)*I1I1;
                    B1 = B1/rr;

                    tampilan4.setText ( "B1 = " +  B1.doubleValue ()  +"  T");

                }

            }

        });
        btnB0.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.#####" );

                if
                           (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Medan magnet di P(x,y) oleh arus I1(x1,y1) dan arus I2(x2,y2) bernilai nol" );
                    tampilan2.setText ( " B = uo I /2pi r;  dengan arah B ditentukan   dl x (r -r')" );
                    tampilan3.setText ( " arus searah sumbu Z positif B positif, dan sebaliknya" );
                    tampilan4.setText ( " I1 dan I2 positif" );
                    xx = (I1I1*x2x2 + I2I2*x1x1)/(I1I1 + I2I2);
                    yy = (I1I1*y2y2 + I2I2*y1y1)/(I1I1 + I2I2);
                    tampilan5.setText ( "  P(x,y) dengan x = (I1 x2 + I2 x1)/(I1 + I2) dan y = (I1 y2 + I2y1)/(I1 + I2)" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( "Titik  dengan medan listrik nol  P( "  +df.format (xx)+ ", " +df.format (yy)+ ")");
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );

            }}

        });

        btnF.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                if
                    (!q.getText ( ).toString ( ).equals ( "" )   &&
                            !Bx.getText ( ).toString ( ).equals ( "" )   &&
                            !By.getText ( ).toString ( ).equals ( "" )   &&
                            !Bz.getText ( ).toString ( ).equals ( "" )   &&
                            !vx.getText ( ).toString ( ).equals ( "" )   &&
                            !vy.getText ( ).toString ( ).equals ( "" )   &&
                            !vz.getText ( ).toString ( ).equals ( "" )) {
                        qq = Double.parseDouble ( q.getText ( ).toString ( ) );
                        BxBx = Double.parseDouble (Bx.getText ( ).toString ( ) );
                        ByBy = Double.parseDouble ( By.getText ( ).toString ( ) );
                        BzBz = Double.parseDouble ( Bz.getText ( ).toString ( ) );
                        vxvx = Double.parseDouble ( vx.getText ( ).toString ( ) );
                        vyvy = Double.parseDouble ( vy.getText ( ).toString ( ) );
                        vzvz = Double.parseDouble ( vz.getText ( ).toString ( ) );
                    tampilan1.setText ( " Gaya Lorentz yang dialami muatan bergerak v = vxi + vyj + vzk dalam medan listrik B = Bxi + Byj + Bzk" );
                    qq = qq * Math.pow ( 10 , -6 );
                    tampilan2.setText ( " F = q v x B" );
                    Fx = (vyvy * BzBz) - (vzvz * ByBy);
                    Fy = (vzvz * BxBx) - (vxvx * BzBz);
                    Fz = (vxvx * ByBy) - (vyvy * BxBx);
                    tampilan2.setText ( " " );
                    tampilan3.setText ( "F = " + qq.doubleValue ( ) + " (" + df.format ( Fx ) + "i + " + df.format ( Fy ) + "j + " + df.format ( Fz ) + "k ) N" );
                    tampilan4.setText ( " " );
                    tampilan5.setText ( " " );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );
                } else
                    if
                                 (!q.getText ( ).toString ( ).equals ( "" )   &&
                                 !vx.getText ( ).toString ( ).equals ( "" )   &&
                                  Bx.getText ( ).toString ( ).equals ( "" )   &&
                                !tet.getText ( ).toString ( ).equals ( "" )) {
                              qq = Double.parseDouble ( q.getText ( ).toString ( ) );
                            BxBx = Double.parseDouble (Bx.getText ( ).toString ( ) );
                            teta = Double.parseDouble ( tet.getText ( ).toString ( ) );
                            vxvx = Double.parseDouble ( vx.getText ( ).toString ( ) );

                        tampilan1.setText ( " Gaya Lorentz yang dialami muatan bergerak v membentuk sudut teta terhadap medan magnet B" );
                        tampilan2.setText ( " besar gaya F = q v B sin teta" );
                        teta = teta * 3.14 / 180;
                        F = qq * vxvx * BxBx * Math.sin ( teta );
                        tampilan3.setText ( "F = " + qq.doubleValue ( ) + " N" );
                    } else
                    if
                        (!q.getText ( ).toString ( ).equals ( "" )   &&
                                !vx.getText ( ).toString ( ).equals ( "" )   &&
                                !I1.getText ( ).toString ( ).equals ( "" )   &&
                                !vx.getText ( ).toString ( ).equals ( "" )   &&
                                Bx.getText ( ).toString ( ).equals ( "" )   &&
                                !r.getText ( ).toString ( ).equals ( "" )) {
                            qq = Double.parseDouble ( q.getText ( ).toString ( ) );
                            rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            BxBx = Double.parseDouble (Bx.getText ( ).toString ( ) );
                            I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                            vxvx = Double.parseDouble ( vx.getText ( ).toString ( ) );
                        tampilan1.setText ( " Gaya antara muatan bergerak dengan kecepatan v sejajar berarus I1  terpisah sejauh r" );
                        tampilan2.setText ( " B = (uo/2pi) I1 /r" );
                        tampilan3.setText ( " besar F = q v B" );
                        tampilan4.setText ( " " );
                        BxBx = 2* Math.pow(10,-7)*I1I1/rr;
                        F = qq*vxvx*BxBx;
                        tampilan5.setText ( "B = " +  BxBx.doubleValue () + "T" );
                        tampilan6.setText ( "F = " +  F.doubleValue () + "N" );
                        tampilan7.setText ( "bila muatan positif bergerak searah i maka terjadi gaya tarik menarik dan sebaliknya" );
                        tampilan8.setText ( " " );
                        tampilan9.setText ( " " );
                        tampilan10.setText ( " " );


                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )) {
                       I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        LL = Double.parseDouble (L.getText ( ).toString ( ) );
                       I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );

                    tampilan1.setText ( " Gaya antara dua kawat sejajar berarus I1 dan I2 terpisah sejauh r" );
                    tampilan2.setText ( " " );
                    tampilan3.setText ( " F = (uo/2pi) I1 I2 L /r" );

                    F = 2* Math.pow(10,-7)*I1I1*I2I2*LL/rr;
                    tampilan4.setText ( " " );
                    tampilan5.setText ( "F = " +  F.doubleValue () + "N" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );

                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !r.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                    tampilan1.setText ( " Gaya persatuan panjang antara dua kawat sejajar berarus I1 dan I2 terpisah sejauh r" );

                    tampilan2.setText ( " F/L = (uo/2pi) I1 I2  /r" );

                    F = 2* Math.pow(10,-7)*I1I1*I2I2/rr;
                    tampilan3.setText ( " " );
                    tampilan4.setText ( "F/L = " +  F.doubleValue () + "N" );
                    tampilan5.setText ( " " );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                    tampilan11.setText ( " " );
                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !L.getText ( ).toString ( ).equals ( "" )   &&
                        !x1.getText ( ).toString ( ).equals ( "" )   &&
                        !y1.getText ( ).toString ( ).equals ( "" )   &&
                        !z1.getText ( ).toString ( ).equals ( "" )   &&
                            !Bx.getText ( ).toString ( ).equals ( "" )   &&
                            !By.getText ( ).toString ( ).equals ( "" )   &&
                            !Bz.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        BxBx = Double.parseDouble ( Bx.getText ( ).toString ( ) );
                        LL = Double.parseDouble (L.getText ( ).toString ( ) );
                        ByBy = Double.parseDouble ( By.getText ( ).toString ( ) );
                        BzBz = Double.parseDouble ( Bz.getText ( ).toString ( ) );
                    BzBz = Double.parseDouble ( Bz.getText ( ).toString ( ) );


                    if (x1x1!=0 && x1x1>0) {
                        tampilan1.setText ( " Gaya pada kawat berarus I = "+(I1I1) +"A searah searah sumbu x positif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                        +(BzBz) + "k T" );
                        tampilan2.setText ( " F = (uo/2pi) I L x B" );
                        Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                        Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                        Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                        tampilan3.setText ( " " );
                        tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i +" + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                        K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                        M = Math.pow ( K , 0.5 );
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                        tampilan5.setText ( " " );
                        tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                        tampilan7.setText ( " " );
                        tampilan8.setText ( " " );
                        tampilan9.setText ( " " );
                        tampilan10.setText ( " " );
                    } else
                    if (x1x1!=0 && x1x1<0) {
                        tampilan1.setText ( " Gaya pada kawat berarus I = "+(I1I1) +"A searah sumbu x negatif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                                +(BzBz) + "k T" );
                        tampilan2.setText ( " F = (uo/2pi) I L x B" );
                        Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                        Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                        Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                        tampilan3.setText ( " " );
                        tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i + " + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                        K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                        M = Math.pow ( K , 0.5 );
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                        tampilan5.setText ( " " );
                        tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                        tampilan7.setText ( " " );
                        tampilan8.setText ( " " );
                        tampilan9.setText ( " " );
                        tampilan10.setText ( " " );
                    } else
                    if (y1y1!=0 && y1y1>0) {
                        tampilan1.setText ( " Gaya pada kawat berarus I = "+(I1I1) +"A searah sumbu y positif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                                +(BzBz) + "k T" );
                        tampilan2.setText ( " F = (uo/2pi) I L x B" );
                        Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                        Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                        Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                        tampilan3.setText ( " " );
                        tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i + " + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                        K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                        M = Math.pow ( K , 0.5 );
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                        tampilan5.setText ( " " );
                        tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                        tampilan7.setText ( " " );
                        tampilan8.setText ( " " );
                        tampilan9.setText ( " " );
                        tampilan10.setText ( " " );
                    } else
                    if (y1y1!=0 && y1y1<0) {
                        tampilan1.setText ( "Gaya pada kawat berarus I = "+(I1I1) +"A searah sumbu y negatif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                                +(BzBz) + "k" );
                        tampilan2.setText ( " F = (uo/2pi) I L x B" );
                        Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                        Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                        Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                        tampilan3.setText ( " " );
                        tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i + " + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                        K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                        M = Math.pow ( K , 0.5 );
                        F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                        tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                        tampilan7.setText ( " " );
                        tampilan8.setText ( " " );
                        tampilan9.setText ( " " );
                        tampilan10.setText ( " " );
                    } else
                        if (z1z1!=0 && z1z1>0) {
                            tampilan1.setText ( " Gaya pada kawat berarus I = "+(I1I1) +"A searah sumbu z positif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                                    +(BzBz) + "k T" );
                            tampilan2.setText ( " F = (uo/2pi) I L x B" );
                            Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                            Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                            Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                            F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                            tampilan3.setText ( " " );
                            tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i + " + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                            K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                            M = Math.pow ( K , 0.5 );
                            F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                            tampilan5.setText ( " " );
                            tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                            tampilan7.setText ( " " );
                            tampilan8.setText ( " " );
                            tampilan9.setText ( " " );
                            tampilan10.setText ( " " );
                        } else
                            if (z1z1!=0 && z1z1<0) {
                                tampilan1.setText ( " Gaya pada kawat berarus I = "+(I1I1) +"A searah sumbu z negatif dalam medan magnet B = " +  (BxBx) + "i + " + (ByBy) + "j + "
                                        +(BzBz) + "k T" );

                                tampilan2.setText ( " F = (uo/2pi) I L x B" );
                                Fx = (y1y1 * BzBz) - (z1z1 * ByBy);
                                Fy = (z1z1 * BxBx) - (x1x1 * BzBz);
                                Fz = (x1x1 * ByBy) - (y1y1 * BxBx);
                                F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL;
                                tampilan3.setText ( " " );
                                tampilan4.setText ( "F = " + F.doubleValue ( ) + "(" + df.format ( Fx ) + "i + " + df.format ( Fy ) + " j + " + df.format ( Fz ) + " k ) N" );
                                K = Math.pow ( Fx , 2 ) + Math.pow ( Fy , 2 ) + Math.pow ( Fz , 2 );
                                M = Math.pow ( K , 0.5 );
                                F = 6.26 * Math.pow ( 10 , -7 ) * I1I1 * LL * M;
                                tampilan5.setText ( " " );
                                tampilan6.setText ( " besar gaya F = " + F.doubleValue ( ) + "N" );
                                tampilan7.setText ( " " );
                                tampilan8.setText ( " " );
                                tampilan9.setText ( " " );
                                tampilan10.setText ( " " );
                            }
                    }

            }

        });
        btnTor.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );
                I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                BxBx = Double.parseDouble ( Bx.getText ( ).toString ( ) );
                AA= Double.parseDouble ( A.getText ( ).toString ( ) );
                teta = Double.parseDouble ( tet.getText ( ).toString ( ) );
                NN = Double.parseDouble ( N.getText ( ).toString ( ) );

                    if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !Bx.getText ( ).toString ( ).equals ( "" )   &&
                            !tet.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        BxBx = Double.parseDouble ( Bx.getText ( ).toString ( ) );
                        AA = Double.parseDouble (A.getText ( ).toString ( ) );
                        teta = Double.parseDouble ( tet.getText ( ).toString ( ) );
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );

                    tampilan1.setText ( " Torsi loop arus dalam medan magnet " );
                    tampilan2.setText ( " Torsi = NABI sin teta" );
                    teta = teta*3.14/180;

                    To = NN*BxBx*I1I1*Math.sin(teta) ;
                    tampilan3.setText ( " " );
                    tampilan4.setText ( "Torsi = " + To.doubleValue ( ) + "Nm"  );
                    tampilan5.setText ( " " );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );
                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !A.getText ( ).toString ( ).equals ( "" )   &&
                            !N.getText ( ).toString ( ).equals ( "" )   &&
                            !Bx.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        BxBx = Double.parseDouble ( Bx.getText ( ).toString ( ) );
                        AA = Double.parseDouble (A.getText ( ).toString ( ) );
                        NN = Double.parseDouble ( N.getText ( ).toString ( ) );
                    tampilan1.setText ( " Torsi loop arus dalam medan magnet " );
                    tampilan2.setText ( " Torsi = NABI sin teta; teta = 90 derajat" );
                    tampilan3.setText ( " Torsi = NABI " );
                    tampilan4.setText ( " " );


                    To = NN * BxBx * I1I1;

                    tampilan5.setText ( "Torsi = " + To.doubleValue ( ) + "Nm" );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );

                }   }

        });


        btnF1.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                    if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !I3.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !x3.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )   &&
                            !y3.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        I3I3 = Double.parseDouble ( I3.getText ( ).toString ( ) );
                        x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                        y3y3 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );


                    tampilan1.setText ( "gaya pada tiga kawat  sejajr arah sumbu z, yaitu  arus I1(x1,y1), arus I2(x2,y2) dan I3(x3,y3)" );
                    tampilan2.setText ( " F1/L =  F12/L + F13/L " );
                    tampilan3.setText ( " F12/L = (uo/2pi) I1 I2;  F13/L = (uo/2pi) I1 I3 " );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;
                    r13i = x1x1 - x3x3;
                    r13j = y1y1 - y3y3;
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;
                    r23i = x2x2 - x3x3;
                    r23j = y2y2 - y3y3;
                    r31i = x3x3 - x1x1;
                    r31j = y3y3 - y1y1;
                    r32i = x3x3 - x2x2;
                    r32j = y3y3 - y2y2;

                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                    r13 = Math.pow ( r13i , 2 ) + Math.pow ( r13j , 2 );
                    F12 = 2 * Math.pow ( 10 , -7 ) * I2I2 * I1I1 / r12;
                    F13 = 2 * Math.pow ( 10 , -7 ) * I3I3 * I1I1 / r13;
                    F1i = -((F12 * r12i) + (F13 * r13i));
                    F1j = -((F12 * r12j) + (F13 * r13j));

                    tampilan4.setText ( "F1/L = " + F1i.doubleValue ( ) + " i  + " + F1j.doubleValue ( ) + " j  N/m " );
                    F1 = Math.pow ( F1i , 2 ) + Math.pow ( F1j , 2 );
                    F1 = Math.pow ( F1 , 0.5 );
                    tampilan5.setText ( " besar F1/L = " + F1.doubleValue ( ) + "  N/m " );
                    tampilan6.setText ( " " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );

                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    tampilan1.setText ( "gaya pada dua kawat  sejajr arah sumbu z, yaitu  arus I1(x1,y1)dan arus I2(x2,y2)" );

                    tampilan3.setText ( " F12/L = (uo/2pi) I1 I2" );
                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;

                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                    F12 = 2 * Math.pow ( 10 , -7 ) * I2I2 * I1I1 / r12;

                    F1i = -(F12 * r12i) ;
                    F1j = -(F12 * r12j) ;
                    tampilan4.setText ( " " );
                    tampilan5.setText ( "F1/L = " + F1i.doubleValue ( ) + " i  + " + F1j.doubleValue ( ) + " j  N/m " );
                    F1 = Math.pow ( F1i , 2 ) + Math.pow ( F1j , 2 );
                    F1 = Math.pow ( F1 , 0.5 );
                    tampilan6.setText ( " besar F1/L = " + F1.doubleValue ( ) + "  N/m " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );

                }}});


        btnF2.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !I3.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !x3.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )   &&
                            !y3.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        I3I3 = Double.parseDouble ( I3.getText ( ).toString ( ) );
                        x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                        y3y3 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    tampilan1.setText ( "gaya pada tiga kawat  sejajr arah sumbu z, yaitu  arus I1(x1,y1), arus I2(x2,y2) dan I3(x3,y3)" );
                    tampilan2.setText ( " F2/L =  F21/L + F23/L " );
                    tampilan3.setText( " F21/L = (uo/2pi) I1 I2;  F23/L = (uo/2pi) I2 I3 " );

                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;
                    r13i = x1x1 - x3x3;
                    r13j = y1y1 - y3y3;
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;
                    r23i = x2x2 - x3x3;
                    r23j = y2y2 - y3y3;
                    r31i = x3x3 - x1x1;
                    r31j = y3y3 - y1y1;
                    r32i = x3x3 - x2x2;
                    r32j = y3y3 - y2y2;


                    r12 = Math.pow ( r12i , 2 ) + Math.pow ( r12j , 2 );
                    r21 = r12;
                    r13 = Math.pow ( r13i , 2 ) + Math.pow ( r13j , 2 );
                    r23 = Math.pow ( r23i , 2 ) + Math.pow ( r23j , 2 );

                    F21 = 2 * Math.pow ( 10 , -7 ) * I2I2 * I1I1 / r21;
                    F23 = 2 * Math.pow ( 10 , -7 ) * I2I2 * I3I3 / r23;

                    F2i = -((F21 * r21i) + (F23 * r23i));
                    F2j = -((F21 * r21j) + (F23 * r23j));

                    tampilan4.setText ( "F2/L = " + F2i.doubleValue ( ) + " i  + " + F2j.doubleValue ( ) + " j  N/m " );
                    F2 = Math.pow(F2i,2)+Math.pow(F2j,2);
                    F2 = Math.pow(F2,0.5);
                    tampilan5.setText ( " besar F2/L = " + F2.doubleValue ( ) + "  N/m " );
                } else
                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                    tampilan1.setText ( "gaya pada dua kawat  sejajr arah sumbu z, yaitu  arus I1(x1,y1)dan arus I2(x2,y2)" );

                    tampilan3.setText ( " F21/L = (uo/2pi) I1 I2" );
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;

                    r21 = Math.pow ( r21i , 2 ) + Math.pow ( r21j , 2 );
                    F12 = 2 * Math.pow ( 10 , -7 ) * I2I2 * I1I1 / r21;

                    F2i = -(F21 * r21i) ;
                    F2j = -(F21 * r21j) ;
                    tampilan4.setText ( " " );
                    tampilan5.setText ( "F1/L = " + F1i.doubleValue ( ) + " i  + " + F1j.doubleValue ( ) + " j  N/m " );
                    F2 = Math.pow ( F2i , 2 ) + Math.pow ( F2j , 2 );
                    F2 = Math.pow ( F2 , 0.5 );
                    tampilan6.setText ( " besar F2/L = " + F2.doubleValue ( ) + "  N/m " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );
                    tampilan10.setText ( " " );

                }}});

        btnF3.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                DecimalFormat df = new DecimalFormat ( "#.###########" );

                if
                    (!I1.getText ( ).toString ( ).equals ( "" )   &&
                            !I2.getText ( ).toString ( ).equals ( "" )   &&
                            !I3.getText ( ).toString ( ).equals ( "" )   &&
                            !x1.getText ( ).toString ( ).equals ( "" )   &&
                            !x2.getText ( ).toString ( ).equals ( "" )   &&
                            !x3.getText ( ).toString ( ).equals ( "" )   &&
                            !y1.getText ( ).toString ( ).equals ( "" )   &&
                            !y2.getText ( ).toString ( ).equals ( "" )   &&
                            !y3.getText ( ).toString ( ).equals ( "" )) {
                        I1I1 = Double.parseDouble ( I1.getText ( ).toString ( ) );
                        I2I2 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        I3I3 = Double.parseDouble ( I3.getText ( ).toString ( ) );
                        x3x3 = Double.parseDouble ( x3.getText ( ).toString ( ) );
                        y3y3 = Double.parseDouble ( I2.getText ( ).toString ( ) );
                        x1x1 = Double.parseDouble ( x1.getText ( ).toString ( ) );
                        x2x2 = Double.parseDouble ( x2.getText ( ).toString ( ) );
                        y1y1 = Double.parseDouble ( y1.getText ( ).toString ( ) );
                        y2y2 = Double.parseDouble ( y2.getText ( ).toString ( ) );
                        tampilan1.setText ( "gaya pada tiga kawat  sejajar arah sumbu z, yaitu  arus I1(x1,y1), arus I2(x2,y2) dan I3(x3,y3)" );
                    tampilan2.setText ( " F3/L =  F31/L + F32/L " );
                    tampilan3.setText ( " F31/L = (uo/2pi) I1 I3;  F32/L = (uo/2pi) I2 I3 " );

                    r12i = x1x1 - x2x2;
                    r12j = y1y1 - y2y2;
                    r13i = x1x1 - x3x3;
                    r13j = y1y1 - y3y3;
                    r21i = x2x2 - x1x1;
                    r21j = y2y2 - y1y1;
                    r23i = x2x2 - x3x3;
                    r23j = y2y2 - y3y3;
                    r31i = x3x3 - x1x1;
                    r31j = y3y3 - y1y1;
                    r32i = x3x3 - x2x2;
                    r32j = y3y3 - y2y2;

                    r31 = Math.pow ( r31i , 2 ) + Math.pow ( r31j , 2 );
                    r32 = Math.pow ( r32i , 2 ) + Math.pow ( r32j , 2 );

                    F31 = 2 * Math.pow ( 10 , -7 ) * I3I3 * I1I1 / r31;
                    F32 = 2 * Math.pow ( 10 , -7 ) * I3I3 * I2I2 / r32;

                    F3i = -((F31 * r31i) + (F32 * r32i));
                    F3j = -((F31 * r31j) + (F32 * r32j));
                    tampilan4.setText ( " " );
                    tampilan5.setText ( "F3/L = " + F3i.doubleValue ( ) + " i  + " + F3j.doubleValue ( ) + " j  N/m " );
                    F3 = Math.pow(F3i,2)+Math.pow(F3j,2);
                    F3 = Math.pow(F3,0.5);
                    tampilan6.setText ( " besar F3/L = " + F3.doubleValue ( ) + "  N/m " );
                    tampilan7.setText ( " " );
                    tampilan8.setText ( " " );
                    tampilan9.setText ( " " );

                }}});



        hapus.setOnClickListener ( new View.OnClickListener ( ) {
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
                tampilan21.setText ( "" );
                tampilan22.setText ( "" );
                tampilan23.setText ( "" );
                tampilan24.setText ( "" );
                tampilan25.setText ( "" );
                tampilan26.setText ( "" );
                tampilan27.setText ( "" );
                tampilan28.setText ( "" );
                tampilan29.setText ( "" );
                tampilan30.setText ( "" );
                I1.setText ( "" );
                I2.setText ( "" );
                q.setText ( "" );
                x.setText ( "" );
                x1.setText ( "" );
                x2.setText ( "" );
                x3.setText ( "" );
                vx.setText ( "" );
                vy.setText ( "" );
                vz.setText ( "" );
                y.setText ( "" );
                y1.setText ( "" );
                y2.setText ( "" );
                y3.setText ( "" );
                Bx.setText ( "" );
                By.setText ( "" );
                Bz.setText ( "" );
                tet.setText ( "" );
                N.setText ( "" );
                L.setText ( "" );
                n.setText ( "" );
                I3.setText ( "" );
                Ra.setText ( "" );
                A.setText ( "" );
                tet.setText ( "" );
                r.setText ( "" );
                z.setText ( "" );
                h.setText ( "" );
                z1.setText ( "" );



            }
        } );
    }
}

