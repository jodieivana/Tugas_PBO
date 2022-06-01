package com.Pertemuan2.Tabung;
import java.util.Scanner;

public class BangunRuangTabung {
    public static void main(String[] args) {
        double tinggi, radius;
        BangunRuang myBangunRuang = new BangunRuang();

        Scanner masukan = new Scanner(System.in);

        System.out.print("\nMasukkan Tinggi Tabung : ");
        tinggi = masukan.nextDouble();
        
        System.out.print("Masukkan Tinggi Radius : ");
        radius = masukan.nextDouble();

        System.out.print("\n================================\n\n");

        myBangunRuang.volumeTabung(tinggi, radius);
        myBangunRuang.luasTabung(tinggi, radius);
    }
}
