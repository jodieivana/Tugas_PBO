package com.Pertemuan3;

public class kubus {

    public int s;

    public int hitungLuas(){
        //int luas = 6 * (s *s);
        return 6*(s*s);
    }

    public int hitungVolume(){
        return s*s*s;
    }

    public void tampilkanLuas(){
        System.out.println("Luas Permukaan Kubus s = " + s + " cm");
        System.out.println("Luas = " + hitungLuas());
    }

    public void tampilkanVolume(){
        System.out.println("Volume Kubus s = " + s + " cm");
        System.out.println("Volume = " + hitungVolume());
    }
}
