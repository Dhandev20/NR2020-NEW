package com.dhandev.n2000;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        Button Info = findViewById ( R.id.btn_Info );
        Button konversi = findViewById ( R.id.btn_Konversi );
        Button glurus = findViewById ( R.id.btn_G_Lurus );
        Button glinkar = findViewById ( R.id.btn_G_Lingkar );
        Button newton = findViewById ( R.id.btn_H_Newton );
        Button lensa = findViewById ( R.id.btn_CerminLesa );
        Button lup = findViewById ( R.id.btn_Lup );
        Button mikroskop = findViewById ( R.id.btn_Mikroskop );
        Button teropong = findViewById ( R.id.btn_Teropong );
        Button termometer = findViewById ( R.id.btn_Termometer );
        Button pemuaian = findViewById ( R.id.btn_Pemuian );
        Button kalori = findViewById ( R.id.btn_Kalori );
        Button ohm = findViewById ( R.id.btn_H_Ohm );
        Button seripar = findViewById ( R.id.btn_Seriparalel );
        Button deltastar = findViewById ( R.id.btn_Deltastar );
        Button parabola = findViewById ( R.id.btn_G_Parabola );
        Button kepler = findViewById ( R.id.btn_H_Kepler );
        Button gravitasi = findViewById ( R.id.btn_Gravitasi );
        Button elastis = findViewById ( R.id.btn_Elastisitas );
        Button hooke = findViewById ( R.id.btn_H_Hooke );
        Button osilasi = findViewById ( R.id.btn_Osilasi );
        Button energi = findViewById ( R.id.btn_UsahaEnergi );
        Button momentum = findViewById ( R.id.btn_Momentum );
        Button rotasi = findViewById ( R.id.btn_Dinamikarotasi );
        Button hidrostatik = findViewById ( R.id.btn_Hidrostatik );
        Button hidrodinamik = findViewById ( R.id.btn_Hidrodinamik );
        Button gasideal = findViewById ( R.id.btn_Gasideal );
        Button termodinamika = findViewById ( R.id.btn_Termodinamika );
        Button gelombang = findViewById ( R.id.btn_Gelombang );
        Button optik = findViewById ( R.id.btn_Optik );
        Button coulomb = findViewById ( R.id.btn_H_Coulomb );
        Button gauss = findViewById ( R.id.btn_H_Gauss );
        Button medanmagnet = findViewById ( R.id.btn_Medanmagnet );
        Button induksi = findViewById ( R.id.btn_Induksi_EM );
        Button ac = findViewById ( R.id.btn_ac );
        Button kuantum = findViewById ( R.id.btn_Kuantum );
        Button relativitas = findViewById ( R.id.btn_Relativitas );
        Button fisinti = findViewById ( R.id.btn_Fisikainti );


        Info.setOnClickListener ( new View.OnClickListener ( ) {
                                      @Override
                                      public void onClick ( View view ) {
         Intent intent = new Intent ( MainActivity.this , InformasiProduk.class );
           startActivity ( intent );
                                      }
                                  });
        konversi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , MainActivity2.class );
                startActivity ( intent );
            }
        } );

        glurus.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , GerakLurus.class );
                startActivity ( intent );
            }
        } );
        glinkar.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , GerakMelingkar.class );
                startActivity ( intent );
            }
        } );
        newton.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumNewton.class );
                startActivity ( intent );
            }
        } );
        lensa.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , CerminLensa.class );
                startActivity ( intent );
            }
        } );
        lup.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Lup.class );
                startActivity ( intent );
            }
        } );
        mikroskop.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Mikroskop.class );
                startActivity ( intent );
            }
        } );
        teropong.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Teropong.class );
                startActivity ( intent );
            }
        } );
        termometer.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , TermoMeter.class );
                startActivity ( intent );
            }
        } );
        pemuaian.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Pemuaian.class );
                startActivity ( intent );
            }
        } );
        kalori.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Kalori.class );
                startActivity ( intent );
            }
        } );
        ohm.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumOhm.class );
                startActivity ( intent );
            }
        } );
        seripar.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , SeriParalel.class );
                startActivity ( intent );

            }
        } );

        parabola.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , GerakParabola.class );
                startActivity ( intent );
            }
        } );
        kepler.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumKepler.class );
                startActivity ( intent );
            }
        } );
        gravitasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Gravitasi.class );
                startActivity ( intent );
            }
        } );
        elastis.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Elastisitas.class );
                startActivity ( intent );
            }
        } );
        hooke.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumHooke.class );
                startActivity ( intent );
            }
        } );
        osilasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Osilasi.class );
                startActivity ( intent );
            }
        } );
        energi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Usaha.class );
                startActivity ( intent );


            }
        } );
        momentum.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Momentum.class );
                startActivity ( intent );
            }
        } );
        rotasi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , DinamikaRotasi.class );
                startActivity ( intent );
            }
        } );

        hidrostatik.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Hidrostatik.class );
                startActivity ( intent );
            }
        } );
        hidrodinamik.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Hidrodinamik.class );
                startActivity ( intent );
            }
        } );
        gasideal.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , GasIdeal.class );
                startActivity ( intent );
            }
        } );
        termodinamika.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Termodinamika.class );
                startActivity ( intent );
            }
        } );
        gelombang.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Gelombang.class );
                startActivity ( intent );
            }
        } );
        optik.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this ,Optik.class );
                startActivity ( intent );
            }
        } );
        coulomb.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumCoulomb.class );
                startActivity ( intent );
            }
        } );

        gauss.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , HukumGauss.class );
                startActivity ( intent );
            }
        } );

        medanmagnet.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , MedanMagnet.class );
                startActivity ( intent );
            }
        } );
        induksi.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , InduksiElektroMagnet.class );
                startActivity ( intent );
            }
        } );

        ac.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this ,ArusBolakBalik.class );
                startActivity ( intent );
            }
        } );
        kuantum.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Kuantum.class );
                startActivity ( intent );
            }
        } );




        relativitas.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , Relativitas.class );
                startActivity ( intent );
            }
        } );
        fisinti.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , FisikaInti.class );
                startActivity ( intent );
            }
        } );
        deltastar.setOnClickListener ( new View.OnClickListener ( ) {
            @Override

            public void onClick ( View view ) {
                Intent intent = new Intent ( MainActivity.this , DeltaStar.class );
                startActivity ( intent );

            }
        } );
    }}