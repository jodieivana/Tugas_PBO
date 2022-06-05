package com.Pertemuan3;
import java.util.Scanner;

public class inputUlang {
    public static void main(String[] args) {
        BangunRuang myBangunRuang = new BangunRuang();

        Scanner masukan = new Scanner(System.in);
        
        String yn;
        do{
            System.out.print("\nMasukkan Tinggi Tabung : ");
            myBangunRuang.tinggi = masukan.nextDouble();
        
            System.out.print("Masukkan Tinggi Radius : ");
            myBangunRuang.radius = masukan.nextDouble();

            myBangunRuang.volumeTabung();
            myBangunRuang.luasTabung();

            System.out.print("Apakah Anda ingin menghitung luas lingkaran lagi? (y/n) : ");
            yn = masukan.next();

        }while (yn.equalsIgnoreCase("y"));

        System.out.print("\n================================\n");
        System.out.print("Terima kasih\n\n");

    }
}
