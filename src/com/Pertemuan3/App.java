package com.Pertemuan3;

import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception{
        for (int i = 1; i < 11; i++){
            System.out.println(i);
        }

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        for (int j : numbers){
            System.out.print(j + ",");
        }
        System.out.println("");

        String[] mahasiswa = {"Vinson", "Gilbert", "Jian", "Kelvin", "Kimberly"};
        //sorting
        Arrays.sort(mahasiswa);
        for (String mhs : mahasiswa){
            System.out.print(mhs + " ");
        }
        System.out.println("");

        int x = 1, i = 0;
        while (i < 10){
            System.out.println(x);
            i++;
        }
        System.out.println("");

        int y = 100;
        do{
            System.out.print(y + " ");
            y-=10;
        }while(y > 50);
        System.out.println("");
    }
}
