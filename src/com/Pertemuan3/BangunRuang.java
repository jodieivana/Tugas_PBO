package com.Pertemuan3;

public class BangunRuang {
    public double luas, volume, tinggi, radius;
    final double PI = (double) 22/7;

    public BangunRuang(){
    }

    public void volumeTabung(){
        this.volume = PI * Math.pow(radius,2) * tinggi;
        System.out.println("Volume Tabung : " + volume);
    }

    public void luasTabung(){
        this.luas = 2 * PI * radius * (radius + tinggi);
        System.out.println("Luas Tabung : " + luas + '\n');
    }

}
