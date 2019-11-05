package com.game.monopoly;

import java.util.Scanner;

public class Presenter {

    public static void showMenu(){
        System.out.println("1. Beli Tanah");
        System.out.println("2. Beli Rumah");
        System.out.println("3. Beli Hotel");
        System.out.println("4. Lanjut");
    }

    public static void tampilkanInputWarnaPadaPemain(String title, Pemainable pemain){
        System.out.println("Masukan Warna " + title + ": ");
        Scanner in = new Scanner(System.in);
        String warnap1 = in.nextLine();
        pemain.setWarna(warnap1);
    }

    public static void tampilkanHasilLemparDadu(Pemainable pemain, Daduable dadu, Papan ppn){
        int posisiPemain = pemain.getPosisi();
        int posisiAwalPemain = pemain.getPosisiAwal();
        String warnaPemain = pemain.getWarna();
        String namaPetak = ppn.daftarPetak.get(pemain.getPosisi()).getNama();

        System.out.println("---------------------------");
        System.out.println("Player " + warnaPemain);
        System.out.println("Uang Anda : " + pemain.getUang());
        System.out.println("Dadu 1 : " + dadu.getDadu1());
        System.out.println("Dadu 2 : " +  dadu.getDadu2());
        System.out.println("warna player : " + "\u001b[31m" + warnaPemain + "\u001b[31m");
        System.out.println("Maju : " + dadu.getDadu() + " langkah");
        System.out.println("Posisi awal : " + posisiAwalPemain);
        System.out.println("Posisi Akhir : " + posisiPemain);
        System.out.println("Anda berada di " + namaPetak);
    }
   
}
