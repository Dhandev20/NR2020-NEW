package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class HukumGauss extends AppCompatActivity {
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
    private EditText Ra,r,q,ro, sigma,lamda;
    private double RaRa,rr,qq,roro,siigma,laamda,E,V,k,eo;


    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_gauss);
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


        Ra = findViewById(R.id.in_Ra);
        r = findViewById(R.id.in_r);
        q = findViewById(R.id.in_q);
        ro = findViewById(R.id.in_ro);
        sigma = findViewById(R.id.in_sigma);
        lamda = findViewById(R.id.in_lamda);

        Button btnE = findViewById ( R.id.btn_E );
        Button btnV = findViewById ( R.id.btn_V );
        Button btnclear = findViewById ( R.id.btnclear );
        Button btninfo = findViewById ( R.id.btn_Info );

        btninfo.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( final View view ) {
                tampilan1.setText ( " Hukum Gauss" );
                tampilan2.setText ( "Kalkulator ini digunakan untuk menghitung:" );
                tampilan3.setText ( "1.medan listrik oleh muatan titik q" );
                tampilan4.setText ( "2.medan listrik diluar bola pejal berjarak  r dari pusat bola berjari-jari R" );
                tampilan5.setText ( "3.medan listrik didalam bola pejal berjarak  r dari pusat bola berjari-jari R" );
                tampilan6.setText ( "4.potensial listrik diluar bola pejal berjarak  r dari pusat bola berjari-jari R" );
                tampilan7.setText ( "5.potensial listrik didalam bola pejal berjarak  r dari pusat bola berjari-jari R" );
                tampilan8.setText ( "6.medan listrik diluar bola kulit berjarak  r dari pusat bola berjari-jari R" );
                tampilan9.setText ( "7.medan listrik didalam bola kulit berjarak  r dari pusat bola berjari-jari R" );
                tampilan10.setText ( "8.potensial listrik diluar bola kulit berjarak  r dari pusat bola berjari-jari R" );
                tampilan11.setText ( "9.potensial listrik didalam bola kulit berjarak  r dari pusat bola berjari-jari R" );
                tampilan12.setText ( "10.medan listrik berjarak r dari muatan garis dengan rapat muatan persatuan panjang lamda" );
                tampilan13.setText ( "11.potensial listrik berjarak r dari muatan garis dengan rapat muatan persatuan panjang lamda" );
                tampilan15.setText ( "12.medan listrik berjarak r dari plat bermuatan dengan rapat muatan persatuan luas sigma" );
                tampilan16.setText ( "13.potensial listrik berjarak r dari plat bermuatan dengan rapat muatan persatuan luas sigma" );
            }}
        );



        btnE.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");
                    if
                           (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !q.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        qq = Double.parseDouble ( q.getText ( ).toString ( ) );

                        k = 9*Math.pow(10,9);
                        qq = qq*Math.pow(10,-6);
                    tampilan1.setText(" medan listrik oleh  muatan titik");
                    tampilan2.setText(" E = kq/r^2");
                    E = k*qq/(rr*rr);
                    tampilan4.setText("E =" + df.format(E) + "N/C");
                } else if

                        (!r.getText ( ).toString ( ).equals ( "" )   &&
                                !Ra.getText ( ).toString ( ).equals ( "" )   &&
                                !ro.getText ( ).toString ( ).equals ( "" )) {
                              rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                            RaRa = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                            roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                              eo = 8.85*Math.pow(10,-12);
                        roro = roro*Math.pow(10,-6);
                               k = 9*Math.pow(10,9);
                   if ( rr<RaRa){

                    tampilan1.setText ( " medan listrik di dalam bola pejal bermuatan seragam dengan rapat muatan ro" );
                    tampilan2.setText ( " int(E.dA)= q/eo;  " );
                    tampilan3.setText ( " q = ro v = ro * 4/3 pi r^3  " );
                    tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = (ro*4/3 pi r^3)/eo  " );
                    tampilan5.setText ( " E = ro r/(3eo);    eo = 8,85*10E-12 " );

                    E = roro * rr / (3 * eo);
                    tampilan6.setText ( " E =" + df.format ( E ) + "N/C" );

                } else if(rr>RaRa ) {
                       tampilan1.setText ( " medan listrik di luar bola pejal bermuatan seragam dengan rapat muatan ro" );
                       tampilan2.setText ( " int(E.dA)= q/eo;  " );
                       tampilan3.setText ( " q = ro v = ro * 4/3 pi R^3  " );
                       tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = (ro*4/3 pi R^3)/eo  " );
                       tampilan5.setText ( " E = (ro*4/3 pi R^3)/(4 pi eo r^2) " );
                       tampilan6.setText ( " E = ro*R^3)/(3eo*r^2) " );
                       tampilan7.setText ( " atau E = k(ro*4/3 pi R^3)/r^2  " );
                       RaRa = Math.pow ( RaRa , 3 );

                       E = k * 4.18666666666 * roro * RaRa / (rr * rr);
                       tampilan8.setText ( " E =" + df.format ( E ) + "N/C" );


                   } } else
                if

                            (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !Ra.getText ( ).toString ( ).equals ( "" )   &&
                             !q.getText ( ).toString ( ).equals ( "" )) {
                          rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        RaRa = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                          qq = Double.parseDouble ( q.getText ( ).toString ( ) );

                          qq = qq*Math.pow(10,-6);
                          eo = 8.85*Math.pow(10,-12);
                           k = 9*Math.pow(10,9);

                     if(  rr < RaRa) {
                    tampilan1.setText ( " medan listrik di dalam bola pejal bermuatan seragam dengan  muatan q" );
                    tampilan2.setText ( " int(E.dA)= qin/eo;  " );
                    tampilan3.setText ( " qin = (Vin/Vbola)*q = q * (r/R)^3  " );
                    tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = q * (r/R)^3  /eo  " );
                    tampilan5.setText ( " E = q r/(4pi eo R^3);    eo = 8,85*10E-12 " );

                    E = k * qq * rr / (RaRa * RaRa*RaRa);
                    tampilan6.setText ( " E =" + df.format ( E ) + "N/C" );
                }
                    else if(  rr>RaRa) {

                    tampilan1.setText ( " medan listrik di luar bola pejal bermuatan seragam dengan  muatan q" );
                    tampilan2.setText ( " int(E.dA)= q/eo;  " );

                    tampilan3.setText ( " int(E.dA)= 4 pi r^2 E = q/eo  " );
                    tampilan4.setText ( " E = q/(4 pi eo r^2) " );
                    tampilan5.setText ( " E = kq /r^2  " );

                    E = k * qq / (rr * rr);
                    tampilan6.setText ( " E =" + df.format ( E ) + "N/C" );
                } } else
                if

                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        laamda = Double.parseDouble ( lamda.getText ( ).toString ( ) );
                        laamda = laamda*Math.pow(10,-6);
                    k = 9*Math.pow(10,9);
                    tampilan1.setText ( " medan listrik di sekitar muatan garis dengan rapat muatan lamda" );
                    tampilan2.setText ( " int(E.dA)= qin/eo;  " );
                    tampilan3.setText ( " qin = lamda L " );
                    tampilan4.setText ( " int(E.dA)= 2 pi r L E = lamda L  /eo  " );
                    tampilan5.setText ( " E = lamda/(2pi eo r) = 2 k lamda/r;    eo = 8,85*10E-12 " );

                    E = 2*k* laamda / rr;
                    tampilan6.setText ( " E =" + df.format ( E ) + "N/C" );

                }}});

        btnV.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DecimalFormat df = new DecimalFormat("#.#####");
                if
                           (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !q.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        qq = Double.parseDouble ( q.getText ( ).toString ( ) );

                        k = 9*Math.pow(10,9);
                        qq = qq*Math.pow(10,-6);
                    tampilan1.setText(" potensial listrik oleh  muatan titik");
                    tampilan2.setText(" V = kq/r");
                    V =9*Math.pow(10,9)*qq/(rr);
                    tampilan3.setText("V =" + df.format(V) + "volt");
                } else if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !Ra.getText ( ).toString ( ).equals ( "" )   &&
                            !ro.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        RaRa = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                        roro = Double.parseDouble ( ro.getText ( ).toString ( ) );
                        eo = 8.85*Math.pow(10,-12);
                      roro = roro*Math.pow(10,-6);
                         k = 9*Math.pow(10,9);
                    if( rr<RaRa)   {
                    tampilan1.setText ( " potensial listrik di dalam bola pejal bermuatan seragam dengan rapat muatan ro" );
                    tampilan2.setText ( " int(E.dA)= q/eo;  " );
                    tampilan3.setText ( " q = ro v = ro * 4/3 pi r^3  " );
                    tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = (ro*4/3 pi r^3)/eo  " );
                    tampilan5.setText ( " E = ro r/(3eo);    eo = 8,85*10E-12 " );
                    tampilan6.setText(" V = - int(E.dr)= - int[inv - R](ro r dr/(3eo)- int[R - r](ro r dr/(3eo)= (ro R^2/3eo) - (ro r^2/(6 eo))");

                    V = (roro*RaRa*RaRa/(3*eo))- (roro * rr*rr / (6 * eo));
                    tampilan7.setText ( " V =" + df.format ( V ) + "volt" );

                } else if ( rr>RaRa) {
                        tampilan1.setText ( " potensial listrik di luar bola pejal bermuatan seragam dengan rapat muatan ro" );
                        tampilan2.setText ( " int(E.dA)= q/eo;  " );
                        tampilan3.setText ( " q = ro v = ro * 4/3 pi R^3  " );
                        tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = (ro*4/3 pi R^3)/eo  " );
                        tampilan5.setText ( " E = (ro*4/3 pi R^3)/(4 pi eo r^2) " );
                        tampilan6.setText ( " E = k(ro*4/3 pi R^3)/r^2  " );
                        tampilan7.setText ( " V = - int[inv - r](E,dl)=  k(ro*4/3 pi R^3)/r " );
                        RaRa = Math.pow ( RaRa , 3 );

                        V = k * 4.18666666666 * roro * RaRa / (rr);
                        tampilan7.setText ( " V =" + df.format ( V ) + "volt" );
                    }

                } else
                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !Ra.getText ( ).toString ( ).equals ( "" )   &&
                            !q.getText ( ).toString ( ).equals ( "" )) {
                          rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        RaRa = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                          qq = Double.parseDouble ( q.getText ( ).toString ( ) );
                          qq = qq*Math.pow(10,-6);
                          eo = 8.85*Math.pow(10,-12);
                           k = 9*Math.pow(10,9);
                    if (rr<RaRa) {
                    tampilan1.setText ( " potensial listrik di dalam bola pejal bermuatan seragam dengan  muatan q" );
                    tampilan2.setText ( " int(E.dA)= qin/eo;  " );
                    tampilan3.setText ( " qin = (Vin/Vbola)*q = q * (r/R)^3  " );
                    tampilan4.setText ( " int(E.dA)= 4 pi r^2 E = q * (r/R)^3  /eo  " );
                    tampilan5.setText ( " E = q r/(4pi eo R^2);    eo = 8,85*10E-12 " );
                    tampilan6.setText ( " V = - int(E.dl) = -q r^2/(8pi eo R^2) " );
                    V = k * qq * rr * rr / (2 * RaRa * RaRa);
                    tampilan7.setText ( " V =" + df.format ( V ) + "volt" );
                }else
                if ( rr>RaRa) {
                    tampilan1.setText ( " potensial listrik di luar bola pejal/kulit bermuatan seragam dengan  muatan q" );
                    tampilan2.setText ( " int(E.dA)= q/eo;  " );

                    tampilan3.setText ( " int(E.dA)= 4 pi r^2 E = q/eo  " );
                    tampilan4.setText ( " E = q/(4 pi eo r^2) " );
                    tampilan5.setText ( " E = kq /r  " );

                    V = k * qq / (rr);
                    tampilan6.setText ( " V =" + df.format ( V ) + "volt" );
                } } else
                if
                    (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !Ra.getText ( ).toString ( ).equals ( "" )   &&
                            !sigma.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        RaRa = Double.parseDouble ( Ra.getText ( ).toString ( ) );
                        siigma = Double.parseDouble (sigma.getText ( ).toString ( ) );
                        siigma = siigma*Math.pow(10,-6);
                        eo = 8.85*Math.pow(10,-12);
                        k = 9*Math.pow(10,9);
                     if (  rr<RaRa) {
                    tampilan1.setText ( " potensial listrik di dalam bola kulit bermuatan seragam dengan rapat muatan sigma" );
                    tampilan2.setText ( " V = R sigma/eo;  " );

                    V = RaRa * siigma / eo;
                    tampilan4.setText ( " V =" + df.format ( V ) + "volt" );
                } else
                if (  rr>RaRa) {

                    tampilan1.setText ( " potensial listrik di luar bola pejal/kulit bermuatan seragam dengan  muatan q" );

                    tampilan2.setText ( " V = sigma R^2 / eo r  " );

                    V = RaRa * RaRa * siigma / (eo * rr);
                    tampilan3.setText ( " V =" + df.format ( V ) + "volt" );
                } } else
                if
                               (!r.getText ( ).toString ( ).equals ( "" )   &&
                            !lamda.getText ( ).toString ( ).equals ( "" )) {
                        rr = Double.parseDouble ( r.getText ( ).toString ( ) );
                        laamda = Double.parseDouble ( lamda.getText ( ).toString ( ) );

                        eo = 8.85*Math.pow(10,-12);
                    laamda = laamda*Math.pow(10,-6);

                    k = 9 * Math.pow ( 10 , 9 );
                    laamda = laamda*Math.pow(10,-6);
                    tampilan1.setText ( " potensial listrik di sekitar muatan garis dengan rapat muatan lamda" );
                    tampilan2.setText ( " int(E.dA)= qin/eo;  " );
                    tampilan3.setText ( " qin = lamda L " );
                    tampilan4.setText ( " int(E.dA)= 2 pi r L E = lamda L  /eo  " );
                    tampilan5.setText ( " E = lamda/(2pi eo r) = 2 k lamda/r;    eo = 8,85*10E-12 " );
                    tampilan7.setText ( " V = - int(E.dl) = V = 2 k lamda ln r" );
                    V = 2 * k * laamda * Math.log ( rr );
                    tampilan9.setText ( " V =" + df.format ( V ) + "volt" );


                 }}});



        btnclear.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {

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

                q.setText("");
                Ra.setText("");
                r.setText("");
                ro.setText("");
                sigma.setText("");
                lamda.setText("");

            }
        });
    }
}
