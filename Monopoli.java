
package monopoli;
import java.util.Scanner;
public class Monopoli {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Dadu ddu = new Dadu();
        Petak ptk = new Petak();
        
        Start st = new Start();
        st.setPosisi(0);
        
        Negara indo = new Negara();
        indo.setNama("Indonesia");
        indo.setPosisi(1);
        indo.setHarga(6000);
        indo.kmplk.setNama_komplek("A");
        indo.tnh.setHarga_sewa(200);
        indo.rmh.setHarga_sewa1(1000);
        indo.rmh.setHarga_sewa2(3000);
        indo.rmh.setHarga_sewa3(9000);
        indo.rmh.setHarga_sewa4(16000);
        indo.htl.setHarga_sewa(25000);
        indo.rmh.setHarga_rmh(5000);
        indo.htl.setHarga_htl(25000);
        
        DanaUmum du = new DanaUmum();
        du.setNama("Dana Umum");
        du.setPosisi(2);
        
        Negara malay = new Negara();
        malay.setNama("Malaysia");
        malay.setPosisi(3);
        malay.setHarga(6000);
        malay.kmplk.setNama_komplek("A");
        malay.tnh.setHarga_sewa(400);
        malay.rmh.setHarga_sewa1(2000);
        malay.rmh.setHarga_sewa2(6000);
        malay.rmh.setHarga_sewa3(18000);
        malay.rmh.setHarga_sewa4(32000);
        malay.rmh.setHarga_rmh(5000);
        malay.htl.setHarga_htl(25000);
        
        PajakJalan pj = new PajakJalan();
        pj.setNama("Pajak Jalan");
        pj.setPosisi(4);
        pj.setHargapajak(20000);
        
        Transportasi ca = new Transportasi();
        ca.setNama("Changi Airport");
        ca.setPosisi(5);
        ca.setHarga(20000);
        ca.setHarga_sewa1(2500);
        ca.setHarga_sewa2(5000);
        ca.setHarga_sewa3(10000);
        ca.setHarga_sewa4(20000);
        
        Negara sg = new Negara();
        sg.setNama("Singapore");
        sg.setPosisi(6);
        sg.setHarga(10000);
        sg.kmplk.setNama_komplek("B");
        sg.tnh.setHarga_sewa(800);
        sg.rmh.setHarga_sewa1(4000);
        sg.rmh.setHarga_sewa2(10000);
        sg.rmh.setHarga_sewa3(30000);
        sg.rmh.setHarga_sewa4(45000);
        sg.htl.setHarga_sewa(60000);
        sg.rmh.setHarga_rmh(5000);
        sg.htl.setHarga_htl(25000);
        
        Kesempatan ks = new Kesempatan();
        ks.setNama("Kesempatan");
        ks.setPosisi(7);
        
        Negara hk = new Negara();
        hk.setNama("Hong Kong");
        hk.setPosisi(8);
        hk.setHarga(10000);
        hk.kmplk.setNama_komplek("B");
        hk.tnh.setHarga_sewa(600);
        hk.rmh.setHarga_sewa1(3000);
        hk.rmh.setHarga_sewa2(9000);
        hk.rmh.setHarga_sewa3(27000);
        hk.rmh.setHarga_sewa4(40000);
        hk.htl.setHarga_sewa(55000);
        hk.rmh.setHarga_rmh(5000);
        hk.htl.setHarga_htl(25000);
        
        Negara tw = new Negara();
        tw.setNama("Taiwan");
        tw.setPosisi(9);
        tw.setHarga(12000);
        tw.kmplk.setNama_komplek("B");
        tw.tnh.setHarga_sewa(600);
        tw.rmh.setHarga_sewa1(3000);
        tw.rmh.setHarga_sewa2(9000);
        tw.rmh.setHarga_sewa3(27000);
        tw.rmh.setHarga_sewa4(40000);
        tw.htl.setHarga_sewa(55000);
        tw.rmh.setHarga_rmh(5000);
        tw.htl.setHarga_htl(25000);
        
        Negara pp = new Negara();
        pp.setNama("Philipina");
        pp.setPosisi(10);
        pp.setHarga(14000);
        pp.kmplk.setNama_komplek("C");
        pp.tnh.setHarga_sewa(1200);
        pp.rmh.setHarga_sewa1(6000);
        pp.rmh.setHarga_sewa2(8000);
        pp.rmh.setHarga_sewa3(50000);
        pp.rmh.setHarga_sewa4(70000);
        pp.htl.setHarga_sewa(90000);
        pp.rmh.setHarga_rmh(10000);
        pp.htl.setHarga_htl(50000);
        
        Negara tl = new Negara();
        tl.setNama("Thailand");
        tl.setPosisi(12);
        tl.setHarga(42000);
        tl.kmplk.setNama_komplek("C");
        tl.tnh.setHarga_sewa(1000);
        tl.rmh.setHarga_sewa1(5000);
        tl.rmh.setHarga_sewa2(15000);
        tl.rmh.setHarga_sewa3(45000);
        tl.rmh.setHarga_sewa4(62000);
        tl.htl.setHarga_sewa(75000);
        tl.rmh.setHarga_rmh(10000);
        tl.htl.setHarga_htl(50000);
        
        Negara vn = new Negara();
        vn.setNama("Vietnam");
        vn.setPosisi(13);
        vn.setHarga(16000);
        vn.kmplk.setNama_komplek("C");
        vn.tnh.setHarga_sewa(1000);
        vn.rmh.setHarga_sewa1(5000);
        vn.rmh.setHarga_sewa2(15000);
        vn.rmh.setHarga_sewa3(45000);
        vn.rmh.setHarga_sewa4(62000);
        vn.htl.setHarga_sewa(75000);
        vn.rmh.setHarga_rmh(10000);
        vn.htl.setHarga_htl(50000);
        
        Transportasi terminaltokyo = new Transportasi();
        terminaltokyo.setNama("Terminal Bus Tokyo");
        terminaltokyo.setPosisi(14);
        terminaltokyo.setHarga(20000);
        terminaltokyo.setHarga_sewa1(2500);
        terminaltokyo.setHarga_sewa2(5000);
        terminaltokyo.setHarga_sewa3(10000);
        terminaltokyo.setHarga_sewa4(20000);
        
        Papan ppn = new Papan();
        ppn.tambahPetak(st);
        ppn.tambahPetak(indo);
        ppn.tambahPetak(du);
        ppn.tambahPetak(malay);
        ppn.tambahPetak(pj);
        ppn.tambahPetak(ca);
        ppn.tambahPetak(sg);
        ppn.tambahPetak(ks);
        ppn.tambahPetak(hk);
        ppn.tambahPetak(tw);
        ppn.tambahPetak(pp);
        ppn.tambahPetak(tl);
        ppn.tambahPetak(vn);
        
        Pemain p1 = new Pemain();
        System.out.println("Masukan Warna Player 1 : ");
        String warnap1 = in.nextLine();
        p1.setWarna(warnap1);
        p1.uang.setUang(150000);
        
        Pemain p2 = new Pemain();
        System.out.println("Masukan Warna Player 2 = ");
        String warnap2 = in.nextLine();
        p2.setWarna(warnap2);
        p2.uang.setUang(150000);
        
        Pemain p3 = new Pemain();
        System.out.println("Masukan Warna Player 3 = ");
        String warnap3 = in.nextLine();
        p3.setWarna(warnap3);
        p3.uang.setUang(150000);
        
        Pemain p4 = new Pemain();
        System.out.println("Masukan Warna Player 4 = ");
        String warnap4 = in.nextLine();
        p4.setWarna(warnap4);
        p4.uang.setUang(150000);
        
        System.out.println("---------------------------");
        System.out.println("Player 1 " + p1.getWarna());
        System.out.println("Uang Anda : " + p1.uang.getUang());
        p1.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p1.getPosisi()).getNama());
        System.out.println("Harga = " + ppn.daftarPetak.get(p1.getPosisi()).getHarga());
        p1.option();
        
        System.out.println("---------------------------");
        System.out.println("Player " + p2.getWarna());
        System.out.println("Uang Anda : " + p2.uang.getUang());
        p2.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p2.getPosisi()).getNama());
        p2.option();
        
        System.out.println("---------------------------");
        System.out.println("Warna Player 3 : " + p3.getWarna() + ", dan Uang Anda : " + p3.uang.getUang());
        p3.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p3.getPosisi()).getNama());
        p3.option();
        
        System.out.println("---------------------------");
        System.out.println("Warna Player 4 : " + p4.getWarna() + ", dan Uang Anda : " + p4.uang.getUang());
        p4.lempardadu();
        System.out.println("Anda berada di " + ppn.daftarPetak.get(p4.getPosisi()).getNama());
        p4.option(); 
    }
    
}
