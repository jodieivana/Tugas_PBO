package com.Pertemuan2;

public class titik {
    private double x, y;

    public titik(){
        
    }
    public titik(double x, double y){
        this.x = x;
        this. y = y;   
    }

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return this.y;
    }

    public void setY(double y){
        this.y = y;
    }


    public void tampil(){
        System.out.println("Selamat Datang");
    }
    public String tampildata(){
        return "Hallo";
    }   
}
