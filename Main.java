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

        Daduable dadu = new Dadu();

        Pemainable p1 = new Pemain(new Uang(15000000));
        Pemainable p2 = new Pemain(new Uang(15000000));
        Pemainable p3 = new Pemain(new Uang(15000000));
        Pemainable p4 = new Pemain(new Uang(15000000));

        Presenter.tampilkanInputWarnaPadaPemain("Player 1", p1);
        Presenter.tampilkanInputWarnaPadaPemain("Player 2", p2);
        Presenter.tampilkanInputWarnaPadaPemain("Player 3", p3);
        Presenter.tampilkanInputWarnaPadaPemain("Player 4", p4);

        p1.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p1, dadu, ppn);
        Presenter.showMenu();

        p2.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p2, dadu, ppn);
        Presenter.showMenu();

        p3.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p3, dadu, ppn);
        Presenter.showMenu();

        p4.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p4, dadu, ppn);
        Presenter.showMenu();

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
