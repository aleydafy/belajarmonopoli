
package monopoli;
import java.util.Scanner;
public class Monopoli {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        dadu ddu = new dadu();
        petak ptk = new petak();
        
        start st = new start();
        st.setPosisi(0);
        
        negara indo = new negara();
        indo.setNama_petak("Indonesia");
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
        
        dana_umum du = new dana_umum();
        du.setNama_petak("Dana Umum");
        du.setPosisi(2);
        
        negara malay = new negara();
        malay.setNama_petak("Malaysia");
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
        
        pajak_jalan pj = new pajak_jalan();
        pj.setNama_petak("Pajak Jalan");
        pj.setPosisi(4);
        pj.setHargapajak(20000);
        
        transportasi ca = new transportasi();
        ca.setNama_petak("Changi Airport");
        ca.setPosisi(5);
        ca.setHarga(20000);
        ca.setHarga_sewa1(2500);
        ca.setHarga_sewa2(5000);
        ca.setHarga_sewa3(10000);
        ca.setHarga_sewa4(20000);
        
        negara sg = new negara();
        sg.setNama_petak("Singapore");
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
        
        kesempatan ks = new kesempatan();
        ks.setNama_petak("Kesempatan");
        ks.setPosisi(7);
        
        negara hk = new negara();
        hk.setNama_petak("Hong Kong");
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
        
        negara tw = new negara();
        tw.setNama_petak("Taiwan");
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
        
        negara pp = new negara();
        pp.setNama_petak("Philipina");
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
        
        negara tl = new negara();
        tl.setNama_petak("Thailand");
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
        
        negara vn = new negara();
        vn.setNama_petak("Vietnam");
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
        
        transportasi terminaltokyo = new transportasi();
        terminaltokyo.setNama_petak("Terminal Bus Tokyo");
        terminaltokyo.setPosisi(14);
        terminaltokyo.setHarga(20000);
        terminaltokyo.setHarga_sewa1(2500);
        terminaltokyo.setHarga_sewa2(5000);
        terminaltokyo.setHarga_sewa3(10000);
        terminaltokyo.setHarga_sewa4(20000);
        
        papan ppn = new papan();
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
        
        pemain p1 = new pemain();
        System.out.println("Masukan Warna Player 1 : ");
        String warnap1 = in.nextLine();
        p1.setWarna(warnap1);
        p1.uang.setUang(150000);
        
        pemain p2 = new pemain();
        System.out.println("Masukan Warna Player 2 = ");
        String warnap2 = in.nextLine();
        p2.setWarna(warnap2);
        p2.uang.setUang(150000);
        
        pemain p3 = new pemain();
        System.out.println("Masukan Warna Player 3 = ");
        String warnap3 = in.nextLine();
        p3.setWarna(warnap3);
        p3.uang.setUang(150000);
        
        pemain p4 = new pemain();
        System.out.println("Masukan Warna Player 4 = ");
        String warnap4 = in.nextLine();
        p4.setWarna(warnap4);
        p4.uang.setUang(150000);
        
        System.out.println("---------------------------");
        System.out.println("Player 1 " + p1.getWarna());
        System.out.println("Uang Anda : " + p1.uang.getUang());
        p1.lempardadu();
        System.out.println("Anda berada di " + ppn.daftar_petak.get(p1.getPosisi()).getNama_petak());
        System.out.println("Harga = " + ppn.daftar_petak.get(p1.getPosisi()).getHarga());
        p1.option();
        
        System.out.println("---------------------------");
        System.out.println("Player " + p2.getWarna());
        System.out.println("Uang Anda : " + p2.uang.getUang());
        p2.lempardadu();
        System.out.println("Anda berada di " + ppn.daftar_petak.get(p2.getPosisi()).getNama_petak());
        p2.option();
        
        System.out.println("---------------------------");
        System.out.println("Warna Player 3 : " + p3.getWarna() + ", dan Uang Anda : " + p3.uang.getUang());
        p3.lempardadu();
        System.out.println("Anda berada di " + ppn.daftar_petak.get(p3.getPosisi()).getNama_petak());
        p3.option();
        
        System.out.println("---------------------------");
        System.out.println("Warna Player 4 : " + p4.getWarna() + ", dan Uang Anda : " + p4.uang.getUang());
        p4.lempardadu();
        System.out.println("Anda berada di " + ppn.daftar_petak.get(p4.getPosisi()).getNama_petak());
        p4.option(); 
    }
    
}
