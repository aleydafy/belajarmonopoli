package Monopoli;

import java.util.Scanner;

public class Monopoli {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        
        Start st = new Start(0);
        
        Negara indo = instansiasiNegaraIndo();
        Negara malay = instansiasiNegaraMalay();
        Negara sg = instansiasiNegaraSingapore();
        Negara hk = instansiasiNegaraHongkong();
        Negara tw = instansiasiNegaraTaiwan();
        Negara pp = instansiasiNegaraPhilipina();
        Negara tl = instansiasiNegaraThailand();
        Negara vn = instansiasiNegaraVietnam();
        Negara jp = instansiasiNegaraJepang();
        Negara kr = instansiasiNegaraKorea();
        Negara id = instansiasiNegaraIndia();
        Negara ci = instansiasiNegaraChina();
        Negara un = instansiasiNegaraUniSoviet();
        Negara it = instansiasiNegaraItalia();
        Negara ig = instansiasiNegaraInggris();
        Negara pr = instansiasiNegaraPerancis();
        Negara bl = instansiasiNegaraBelanda();
        Negara kn = instansiasiNegaraKanada();
        Negara as = instansiasiNegaraAmerika();
        Negara br = instansiasiNegaraBrazilia();
        Negara aus = instansiasiNegaraAustralia();
        Negara af = instansiasiNegaraAfrika();
        
        PajakJalan pj = new PajakJalan("Pajak Jalan", 4, 20000);
        PajakIstimewa pi = new PajakIstimewa("Pajak Istimewa", 37, 20000);
        
        Transportasi ca = new Transportasi("Changi Airport", 5, 20000, 2500, 5000, 10000, 20000);
        Transportasi terminaltokyo = new Transportasi("Terminal Bus Tokyo", 15, 20000, 2500, 5000, 10000, 10000);
        Transportasi sl = new Transportasi("Stasiun London", 25, 20000, 2500, 5000, 10000, 10000);
        Transportasi ps = new Transportasi("Pelabuhan Sidney", 35, 20000, 2500, 5000, 10000, 10000);
        
        DanaUmum du1 = new DanaUmum("Dana Umum", 2);
        DanaUmum du2 = new DanaUmum("Dana Umum", 17);
        DanaUmum du3 = new DanaUmum("Dana Umum", 33);
        
        Kesempatan ks1 = new Kesempatan("Kesempatan", 7);
        Kesempatan ks2 = new Kesempatan("Kesempatan", 22);
        Kesempatan ks3 = new Kesempatan("Kesempatan", 38);
        
        Perusahaan pl = new Perusahaan("Perusahaan Listrik", 11, 12000, 15000);
        Perusahaan pa = new Perusahaan("Perusahaan Air", 28, 12000, 15000);
        
        Penjara penjara = new Penjara("Penjara", 10);
        Penjara penjara2 = new Penjara("Masuk Penjara", 30);
        
        BebasParkir bp = new BebasParkir("Bebas Parkir", 20);
        
        Papan ppn = new Papan();
        ppn.tambah_petak(st);
        ppn.tambah_petak(indo);
        ppn.tambah_petak(du1);
        ppn.tambah_petak(malay);
        ppn.tambah_petak(pj);
        ppn.tambah_petak(ca);
        ppn.tambah_petak(sg);
        ppn.tambah_petak(ks1);
        ppn.tambah_petak(hk);
        ppn.tambah_petak(tw);
        ppn.tambah_petak(penjara);
        ppn.tambah_petak(pp);
        ppn.tambah_petak(pl);
        ppn.tambah_petak(tl);
        ppn.tambah_petak(vn);
        ppn.tambah_petak(terminaltokyo);
        ppn.tambah_petak(jp);
        ppn.tambah_petak(du2);
        ppn.tambah_petak(kr);
        ppn.tambah_petak(id);
        ppn.tambah_petak(bp);
        ppn.tambah_petak(ci);
        ppn.tambah_petak(ks2);
        ppn.tambah_petak(un);
        ppn.tambah_petak(it);
        ppn.tambah_petak(sl);
        ppn.tambah_petak(ig);
        ppn.tambah_petak(pr);
        ppn.tambah_petak(pa);
        ppn.tambah_petak(bl);
        ppn.tambah_petak(penjara2);
        ppn.tambah_petak(kn);
        ppn.tambah_petak(as);
        ppn.tambah_petak(du3);
        ppn.tambah_petak(br);
        ppn.tambah_petak(ps);
        ppn.tambah_petak(ks3);
        ppn.tambah_petak(aus);
        ppn.tambah_petak(pi);
        ppn.tambah_petak(af);

        Daduable dadu = new Dadu();
        Presenter Presenter = new Presenter();
        
        System.out.println("------------------------------------------------");
        System.out.println("|                   MONOPOLI                   |");
        System.out.println("------------------------------------------------");
        Pemainable p1 = new Pemain(new Uang(150000));
        Pemainable p2 = new Pemain(new Uang(150000));
        Pemainable p3 = new Pemain(new Uang(150000));
        Pemainable p4 = new Pemain(new Uang(150000));

        Presenter.tampilkanInputWarnaPadaPemain("Player 1", p1);
        Presenter.tampilkanInputWarnaPadaPemain("Player 2", p2);
        Presenter.tampilkanInputWarnaPadaPemain("Player 3", p3);
        Presenter.tampilkanInputWarnaPadaPemain("Player 4", p4);
       
        for(;;){
        p1.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p1, dadu, ppn, pj);
        Presenter.showMenu(p1, dadu, ppn);

        p2.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p2, dadu, ppn, pj);
        Presenter.showMenu(p2, dadu, ppn);

        p3.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p3, dadu, ppn, pj);
        Presenter.showMenu(p3, dadu, ppn);

        p4.lempardadu(dadu);
        Presenter.tampilkanHasilLemparDadu(p4, dadu, ppn, pj);
        Presenter.showMenu(p4, dadu, ppn);
        }
    }

    private static Negara instansiasiNegaraIndo() {
        Komplek komplek =  new Komplek("A");
        Rumah rumah = new Rumah(5000, 1000, 3000, 9000, 16000);
        Hotel hotel = new Hotel(25000, 25000);
        Tanah tanah = new Tanah(200, 3000);
        return new Negara("Indonesia", 1, 6000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraMalay() {
        Komplek komplek =  new Komplek("A");
        Rumah rumah = new Rumah(5000, 2000, 6000, 18000, 32000);
        Hotel hotel = new Hotel(25000, 25000);
        Tanah tanah = new Tanah(400, 3000);
        return new Negara("Malaysia", 3, 6000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraSingapore() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 4000, 10000, 30000, 45000);
        Hotel hotel = new Hotel(60000, 25000);
        Tanah tanah = new Tanah(800, 6000);
        return new Negara("Singapore", 6, 10000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraHongkong() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 3000, 9000, 27000, 40000);
        Hotel hotel = new Hotel(55000, 25000);
        Tanah tanah = new Tanah(600, 5000);
        return new Negara("Hongkong", 8, 10000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraTaiwan() {
        Komplek komplek =  new Komplek("B");
        Rumah rumah = new Rumah(5000, 3000, 9000, 27000, 40000);
        Hotel hotel = new Hotel(55000, 25000);
        Tanah tanah = new Tanah(600, 3000);
        return new Negara("Taiwan", 9, 12000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraPhilipina() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 6000, 8000, 50000, 70000);
        Hotel hotel = new Hotel(90000, 50000);
        Tanah tanah = new Tanah(1200, 8000);
        return new Negara("Philipina", 11, 14000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraThailand() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 5000, 15000, 45000, 62000);
        Hotel hotel = new Hotel(75000, 50000);
        Tanah tanah = new Tanah(1000, 7000);
        return new Negara("Thailand", 13, 42000, rumah, tanah, hotel, komplek);
    }

    private static Negara instansiasiNegaraVietnam() {
        Komplek komplek =  new Komplek("C");
        Rumah rumah = new Rumah(10000, 5000, 15000, 45000, 62000);
        Hotel hotel = new Hotel(75000, 50000);
        Tanah tanah = new Tanah(1000, 7000);
        return new Negara("Vietnam", 14, 16000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraJepang() {
        Komplek komplek =  new Komplek("D");
        Rumah rumah = new Rumah(10000, 7000, 20000, 55000, 75000);
        Hotel hotel = new Hotel(95000, 50000);
        Tanah tanah = new Tanah(1400, 9000);
        return new Negara("Jepang", 16, 18000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraKorea() {
        Komplek komplek =  new Komplek("D");
        Rumah rumah = new Rumah(10000, 8000, 22000, 60000, 80000);
        Hotel hotel = new Hotel(100000, 50000);
        Tanah tanah = new Tanah(1600, 10000);
        return new Negara("Korea", 18, 18000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraIndia() {
        Komplek komplek =  new Komplek("D");
        Rumah rumah = new Rumah(10000, 7000, 20000, 55000, 75000);
        Hotel hotel = new Hotel(95000, 50000);
        Tanah tanah = new Tanah(1400, 9000);
        return new Negara("India", 19, 20000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraChina() {
        Komplek komplek =  new Komplek("E");
        Rumah rumah = new Rumah(15000, 9000, 25000, 70000, 87000);
        Hotel hotel = new Hotel(105000, 75000);
        Tanah tanah = new Tanah(1800, 11000);
        return new Negara("RRC (China)", 21, 22000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraUniSoviet() {
        Komplek komplek =  new Komplek("E");
        Rumah rumah = new Rumah(15000, 10000, 30000, 75000, 92000);
        Hotel hotel = new Hotel(110000, 75000);
        Tanah tanah = new Tanah(2000, 12000);
        return new Negara("Uni Soviet", 23, 22000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraItalia() {
        Komplek komplek =  new Komplek("E");
        Rumah rumah = new Rumah(15000, 9000, 25000, 70000, 87000);
        Hotel hotel = new Hotel(105000, 75000);
        Tanah tanah = new Tanah(1800, 11000);
        return new Negara("Italia", 24, 24000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraInggris() {
        Komplek komplek =  new Komplek("F");
        Rumah rumah = new Rumah(15000, 14000, 36000, 85000, 102000);
        Hotel hotel = new Hotel(120000, 75000);
        Tanah tanah = new Tanah(2400, 14000);
        return new Negara("Inggris", 26, 26000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraPerancis() {
        Komplek komplek =  new Komplek("F");
        Rumah rumah = new Rumah(15000, 11000, 33000, 80000, 97500);
        Hotel hotel = new Hotel(115000, 75000);
        Tanah tanah = new Tanah(2200, 13000);
        return new Negara("Perancis", 27, 26000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraBelanda() {
        Komplek komplek =  new Komplek("F");
        Rumah rumah = new Rumah(15000, 11000, 33000, 80000, 97500);
        Hotel hotel = new Hotel(115000, 75000);
        Tanah tanah = new Tanah(2200, 13000);
        return new Negara("Belanda", 29, 28000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraKanada() {
        Komplek komplek =  new Komplek("G");
        Rumah rumah = new Rumah(20000, 13000, 39000, 90000, 110000);
        Hotel hotel = new Hotel(127000, 100000);
        Tanah tanah = new Tanah(2600, 15000);
        return new Negara("Kanada", 31, 30000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraAmerika() {
        Komplek komplek =  new Komplek("G");
        Rumah rumah = new Rumah(20000, 15000, 45000, 100000, 120000);
        Hotel hotel = new Hotel(140000, 100000);
        Tanah tanah = new Tanah(2800, 16000);
        return new Negara("Amerika Serikat", 32, 30000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraBrazilia() {
        Komplek komplek =  new Komplek("G");
        Rumah rumah = new Rumah(20000, 13000, 39000, 90000, 110000);
        Hotel hotel = new Hotel(127000, 100000);
        Tanah tanah = new Tanah(2600, 15000);
        return new Negara("Kanada", 34, 32000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraAustralia() {
        Komplek komplek =  new Komplek("H");
        Rumah rumah = new Rumah(35000, 13000, 39000, 90000, 110000);
        Hotel hotel = new Hotel(127000, 100000);
        Tanah tanah = new Tanah(2600, 15000);
        return new Negara("Australia", 37, 32000, rumah, tanah, hotel, komplek);
    }
    
    private static Negara instansiasiNegaraAfrika() {
        Komplek komplek =  new Komplek("G");
        Rumah rumah = new Rumah(20000, 13000, 39000, 90000, 110000);
        Hotel hotel = new Hotel(127000, 100000);
        Tanah tanah = new Tanah(2600, 15000);
        return new Negara("Afrika", 39, 32000, rumah, tanah, hotel, komplek);
    }
}
