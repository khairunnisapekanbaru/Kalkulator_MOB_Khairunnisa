package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView layar;
    Button tujuh;
    Button delapan;
    Button sembilan;
    Button empat;
    Button lima;
    Button enam;
    Button satu;
    Button dua;
    Button tiga;
    Button bagi;
    Button nol;
    Button koma;
    Button kali;
    Button kurang;
    Button tambah;
    Button hasil;
    Button hapus;

    String angka;
    int pilih;
    double angka1, angka2, jumlah ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layar=findViewById(R.id.layar);

        satu=findViewById(R.id.satu);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "1";
                layar.setText(angka);
            }
        });

        dua=findViewById(R.id.dua);
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "2";
                layar.setText(angka);
            }
        });

        tiga=findViewById(R.id.tiga);
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "3";
                layar.setText(angka);
            }
        });

        empat=findViewById(R.id.empat);
        empat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "4";
                layar.setText(angka);
            }
        });

        lima=findViewById(R.id.lima);
        lima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "5";
                layar.setText(angka);
            }
        });

        enam=findViewById(R.id.enam);
        enam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "6";
                layar.setText(angka);
            }
        });

        tujuh=findViewById(R.id.tujuh);
        tujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "7";
                layar.setText(angka);
            }
        });

        delapan=findViewById(R.id.delapan);
        delapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "8";
                layar.setText(angka);
            }
        });

        sembilan=findViewById(R.id.sembilan);
        sembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "9";
                layar.setText(angka);
            }
        });

        nol=findViewById(R.id.nol);
        nol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += "0";
                layar.setText(angka);
            }
        });

        koma=findViewById(R.id.koma);
        koma.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka += ".";
                layar.setText(angka);
            }
        });

        hasil=findViewById(R.id.hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("=");
                    switch (pilih) {
                        case 1:
                            angka2 = Double.parseDouble(angka);
                            jumlah = angka1 + angka2;
                            angka = Double.toString(jumlah);
                            layar.setText(angka);
                            break;

                        case 2:
                            angka2 = Double.parseDouble(angka);
                            jumlah = angka1 - angka2;
                            angka = Double.toString(jumlah);
                            layar.setText(angka);
                            break;

                        case 3:
                            angka2 = Double.parseDouble(angka);
                            jumlah = angka1 * angka2;
                            angka = Double.toString(jumlah);
                            layar.setText(angka);
                            break;

                        case 4:
                            angka2 = Double.parseDouble(angka);
                            jumlah = angka1 / angka2;
                            angka = Double.toString(jumlah);
                            layar.setText(angka);
                            break;
                    }
                }
        });

        tambah=findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka1 = Double.parseDouble(angka);
                layar.setText("+");
                angka = "";
                pilih = 1;
            }
        });

        kurang=findViewById(R.id.kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka1 = Double.parseDouble(angka);
                layar.setText("-");
                angka = "";
                pilih = 2;
            }
        });

        kali=findViewById(R.id.kali);
        kali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka1 = Double.parseDouble(angka);
                layar.setText("x");
                angka = "";
                pilih = 3;
            }
        });

        bagi=findViewById(R.id.bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                angka1 = Double.parseDouble(angka);
                layar.setText(":");
                angka = "";
                pilih = 4;
            }
        });

        hapus=findViewById(R.id.hapus);
        hapus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("");
                angka1 = (int) 0.0;
                angka2 = (int) 0.0;
                jumlah = (int) 0.0;
                angka = "";
        }
    });

        }
        }


