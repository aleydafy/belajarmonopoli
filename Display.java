package com.game.monopoly;
public class Display {
    
    public static void showHasilDadu(int dadu1, int dadu2){
        System.out.println("Dadu 1 : " + dadu1);
        System.out.println("Dadu 2 : " + dadu2);
    }

    public static void showPemainBergerak(String warna, int hasilDadu, int posisiAwal, int posisi){
        System.out.println("warna player : " + "\u001b[31m" + warna + "\u001b[31m");
        System.out.println("Maju : " + hasilDadu + " langkah");
        System.out.println("Posisi awal : " + posisiAwal);
        System.out.println("Posisi Akhir : " + posisi);
    }

    public static void showMenu(){
        System.out.println("1. Beli Tanah");
        System.out.println("2. Beli Rumah");
        System.out.println("3. Beli Hotel");
        System.out.println("4. Lanjut");
    }
   
}
