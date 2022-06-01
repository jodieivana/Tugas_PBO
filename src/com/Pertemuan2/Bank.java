package com.Pertemuan2;

public class Bank {
    public int saldo;

    public Bank(){
    }

    public Bank(int saldo){
        this.saldo = saldo;
    }

    public void simpanUang(int uang){
        this.saldo += uang;
    }

    public void ambilUang(int uang){
        this.saldo -= uang;
    }

    public String tampilSaldoIDR(){
        return "Rp. " + saldo;
    }
}
