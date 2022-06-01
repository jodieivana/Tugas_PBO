package com.Pertemuan2;
import java.util.Scanner;

public class BankBeraksi {
    public static void main(String[] args) {
        float ratebunga = (float) 2/100;
        int bungatabungan; //ratebunga * saldo akhir
        Bank myBank = new Bank(1000000);
        int uangSimpan, uangAmbil;

        Scanner masukan = new Scanner(System.in);
        

        System.out.println ("Saldo awal: " + myBank.tampilSaldoIDR() + '\n');

        System.out.print("Masukkan Jumlah uang yang akan disimpan : ");
        uangSimpan = masukan.nextInt();
        myBank.simpanUang (uangSimpan);
        System.out.println("Simpan Uang \tRp. " + uangSimpan);
        System.out.println("Saldo Saat Ini: " + myBank.tampilSaldoIDR() + '\n');

        myBank.ambilUang(150000);
        System.out.println("Ambil Uang Rp 150000");
        System.out.println("Saldo saat ini: " + myBank.tampilSaldoIDR() + '\n');

        bungatabungan = (int) (ratebunga * myBank.saldo);
        System.out.println("Bunga Tabungan : " + bungatabungan + '\n');
    }
}
