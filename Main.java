package com.game.monopoly;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Negara indo = instansiasiNegaraIndo();
        Negara malay = instansiasiNegaraMalay();
        Negara sg = instansiasiNegaraSingapore();
        Negara hk = instansiasiNegaraHongkong();
        Negara tw = instansiasiNegaraTaiwan();
        Negara pp = instansiasiNegaraPhilipina();
        Negara tl = instansiasiNegaraThailand();
        Negara vn = instansiasiNegaraVietnam();
        Transportasi ca = new Transportasi("Changi Airport", 5, 20000, 2500, 5000, 10000, 20000);
        Transportasi terminaltokyo = new Transportasi("Terminal Bus Tokyo", 14, 20000, 2500, 5000, 10000, 10000);
        PajakJalan pj = new PajakJalan("Pajak Jalan", 4, 20000);
        Start st = new Start(0);
        Kesempatan ks = new Kesempatan("Kesempatan", 7);
        DanaUmum du = new DanaUmum("Dana Umum", 2);

        Papan ppn = new Papan();
        ppn.tambah_petak(st);
        ppn.tambah_petak(indo);
        ppn.tambah_petak(du);
        ppn.tambah_petak(malay);
        ppn.tambah_petak(pj);
        ppn.tambah_petak(ca);
        ppn.tambah_petak(sg);
        ppn.tambah_petak(ks);
        ppn.tambah_petak(hk);
        ppn.tambah_petak(tw);
        ppn.tambah_petak(pp);
        ppn.tambah_petak(tl);
        ppn.tambah_petak(vn);

        Scanner in = new Scanner(System.in);
        Daduable dadu = new Dadu();

        System.out.println("Masukan Warna Player 1 : ");
        String warnap1 = in.nextLine();
        Pemain p1 = new Pemain(warnap1, new Uang(1500000), dadu);

        System.out.println("Masukan Warna Player 2 = ");
        String warnap2 = in.nextLine();
        Pemain p2 = new Pemain(warnap2, new Uang(150000), dadu);

        System.out.println("Masukan Warna Player 3 = ");
        String warnap3 = in.nextLine();
        Pemain p3 = new Pemain(warnap3, new Uang(150000), dadu);

        System.out.println("Masukan Warna Player 4 = ");
        String warnap4 = in.nextLine();
        Pemain p4 = new Pemain(warnap4, new Uang(150000), dadu);

        System.out.println("---------------------------");
        System.out.println("Player 1 " + p1.getWarna());
        System.out.println("Uang Anda : " + p1.getUang());
        p1.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p1.getPosisi()).getNama());
        System.out.println("Harga = " + ppn.daftarPetak.get(p1.getPosisi()).getHarga());
        p1.option();

        System.out.println("---------------------------");
        System.out.println("Player " + p2.getWarna());
        System.out.println("Uang Anda : " + p2.getUang());
        p2.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p2.getPosisi()).getNama());
        p2.option();

        System.out.println("---------------------------");
        System.out.println("Warna Player 3 : " + p3.getWarna() + ", dan Uang Anda : " + p3.getUang());
        p3.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p3.getPosisi()).getNama());
        p3.option();

        System.out.println("---------------------------");
        System.out.println("Warna Player 4 : " + p4.getWarna() + ", dan Uang Anda : " + p4.getUang());
        p4.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p4.getPosisi()).getNama());
        p4.option();
    }

    private static Negara instansiasiNegaraIndo() {
        Komplek komplek =  new Komplek("A");
        Rumah rumah = new Rumah(5000, 1000, 3000, 9000, 16000);
        Hotel hotel = new Hotel(25000, 25000);
        Tanah tanah = new Tanah(200);
        return new Negara("Indonesia", 1, 6000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraMalay() {
        Komplek komplek =  new Komplek("A");
        Rumah rumah = new Rumah(5000, 2000, 6000, 18000, 32000);
        Hotel hotel = new Hotel(0, 25000);
        Tanah tanah = new Tanah(400);
        return new Negara("Malaysia", 3, 6000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraSingapore() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 4000, 10000, 30000, 45000);
        Hotel hotel = new Hotel(60000, 25000);
        Tanah tanah = new Tanah(800);
        return new Negara("Singapore", 6, 10000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraHongkong() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 3000, 9000, 27000, 40000);
        Hotel hotel = new Hotel(55000, 25000);
        Tanah tanah = new Tanah(600);
        return new Negara("Hongkong", 8, 10000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraTaiwan() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 3000, 9000, 27000, 40000);
        Hotel hotel = new Hotel(55000, 25000);
        Tanah tanah = new Tanah(600);
        return new Negara("Taiwan", 9, 12000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraPhilipina() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 6000, 8000, 50000, 70000);
        Hotel hotel = new Hotel(90000, 50000);
        Tanah tanah = new Tanah(1200);
        return new Negara("Philipina", 10, 14000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraThailand() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 5000, 15000, 45000, 62000);
        Hotel hotel = new Hotel(75000, 50000);
        Tanah tanah = new Tanah(1000);
        return new Negara("Thailand", 12, 42000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraVietnam() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 5000, 15000, 45000, 62000);
        Hotel hotel = new Hotel(75000, 50000);
        Tanah tanah = new Tanah(1000);
        return new Negara("Vietnam", 13, 16000, rumah, tanah, hotel, komplek);
    }
}
