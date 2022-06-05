package com.Pertemuan3;
import java.util.Scanner;

public class Jalan {
    public static void main(String[] args) throws Exception{

        Scanner masukan = new Scanner(System.in);
        
        String yn;
        do{
            System.out.println("Program Bangun Ruang");
            System.out.println("1. Tabung");
            System.out.println("2. Kubus");
            System.out.println("3. Keluar");
            System.out.print("Pilihan (1/2/3) : ");
            int pilihan = 0;
            pilihan = masukan.nextInt();

            if(pilihan == 1){
                menuTabung (masukan);
            }

            else if(pilihan == 2){
                menuKubus (masukan);
            }

            else if(pilihan == 3){
               break;
            }

            System.out.print("Apakah Anda ingin kembali ke menu utama? (y/n) : ");
            yn = masukan.next();

            bersihkanLayar();
        }while (yn.equalsIgnoreCase("y"));

        System.out.print("\n================================\n");
        System.out.print("Terima kasih\n\n");
    }

    public static void bersihkanLayar(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void menuTabung(Scanner masukan){
        BangunRuang myBangunRuang = new BangunRuang();
        
        System.out.print("\nMasukkan Tinggi Tabung : ");
        myBangunRuang.tinggi = masukan.nextDouble();
        
        System.out.print("Masukkan Tinggi Radius : ");
        myBangunRuang.radius = masukan.nextDouble();

        myBangunRuang.volumeTabung();
        myBangunRuang.luasTabung();
    }

    public static void menuKubus(Scanner masukan){
        kubus myKubus = new kubus();
        
        System.out.print("\nMasukkan Sisi Kubus : ");
        myKubus.s = masukan.nextInt();

        myKubus.hitungLuas();
        myKubus.hitungVolume();
        myKubus.tampilkanLuas();
        myKubus.tampilkanVolume();
    }

}
