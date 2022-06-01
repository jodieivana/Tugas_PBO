package com.Pertemuan2.Tabung;

public class BangunRuang {
    public double luas, volume;
    final double PI = (double) 22/7;

    public BangunRuang(){
    }

    public void volumeTabung(double tinggi, double radius){
        this.volume = PI * Math.pow(radius,2) * tinggi;
        System.out.println("Volume Tabung : " + volume);
    }

    public void luasTabung(double tinggi, double radius){
        this.luas = 2 * PI * radius * (radius + tinggi);
        System.out.println("Luas Tabung : " + luas + '\n');
    }

}
