package Monopoli;

import java.util.Scanner;

public class Presenter extends Petak{
    
    Scanner in = new Scanner(System.in);
    
    public void showMenu(Pemainable pemain, Daduable dadu, Papan ppn){
        int posisiPemain = pemain.getPosisi();
        int posisiAwalPemain = pemain.getPosisiAwal();
        String namaPetak = ppn.daftarPetak.get(pemain.getPosisi()).getNama();
        double hargaNegara = ppn.daftarPetak.get(pemain.getPosisi()).getHarga();
        Petak p = ppn.daftarPetak.get(pemain.getPosisi());
        double hargaRumah = 0;
        if (p instanceof Negara){
            Negara n = (Negara) p;
            hargaRumah = n.rmh.getHarga();
        }
        
        System.out.println("Harga Tanah = " + hargaNegara);
        System.out.println("1. Beli Tanah");
        System.out.println("2. Beli Rumah");
        System.out.println("3. Beli Hotel");
        System.out.println("4. Lanjut");
        int pilih = in.nextInt();
        if(pilih == 1) {
            System.out.println("Anda telah membeli Negara " + namaPetak);
            System.out.println("Sisa Uang Anda = " + (pemain.getUang()-hargaNegara));
            System.out.println("Menu Lain? [y/t]");
            String menu = in.next();
            switch(menu){
                case "y" :
                    System.out.println("1. Beli Rumah");
                    System.out.println("2. Beli Hotel");
                    int menu1 = in.nextInt();
                    if(menu1 == 1){
                        System.out.println("Harga Rumah = " + hargaRumah);
                        System.out.println("Beli? [y/t]");
                        String beli = in.next();
                        switch(beli){
                            case "y":
                                System.out.println("Anda akan membeli rumah berapa banyak? 1-4");
                                int banyak = in.nextInt();
                                if(banyak == 1){
                                    System.out.println("Anda telah membeli 1 Rumah");
                                    System.out.println("Sisa uang anda = ");
                                }
                                if(banyak == 2){
                                    System.out.println("Anda telah membeli 2 Rumah");
                                    System.out.println("Sisa uang anda = ");
                                }
                                if(banyak == 3){
                                    System.out.println("Anda telah membeli 3 Rumah");
                                    System.out.println("Sisa uang anda = ");
                                }
                                if(banyak == 4){
                                    System.out.println("Anda telah membeli 4 Rumah");
                                    System.out.println("Sisa uang anda = ");
                                }
                            break;
                            case "t":
                                System.out.println("Oke bisa beli lain kali ya");
                            break;
                        }
                    }
                    else if(menu1 == 2){
                        System.out.println("Harga Hotel = ");
                        System.out.println("Beli? [y/t]");
                        String beli = in.next();
                        switch(beli){
                            case "y":
                                    System.out.println("Anda telah membeli 1 Hotel");
                                    System.out.println("Sisa uang anda = ");
                            break;
                            case "t":
                                System.out.println("Oke bisa beli lain kali ya");
                            break;
                        }
                    }
                case "t":
                    System.out.println("Giliran player selanjutnya!");
                    break;
            }
        }
    }

    public static void tampilkanInputWarnaPadaPemain(String title, Pemainable pemain){
        System.out.print("Masukan Warna " + title + ": ");
        Scanner in = new Scanner(System.in);
        String warnap1 = in.nextLine();
        pemain.setWarna(warnap1);
    }

    public static void tampilkanHasilLemparDadu(Pemainable pemain, Daduable dadu, Papan ppn, PajakJalan pj){
        int posisiPemain = pemain.getPosisi();
        int posisiAwalPemain = pemain.getPosisiAwal();
        String warnaPemain = pemain.getWarna();
        String namaPetak = ppn.daftarPetak.get(pemain.getPosisi()).getNama();
        double hargaPajakJalan = pj.getHarga();

        System.out.println("------------------------------------------------");
        System.out.println("Player " + warnaPemain);
        System.out.println("Uang Anda : " + pemain.getUang());
        System.out.println("Dadu 1 : " + dadu.getDadu1());
        System.out.println("Dadu 2 : " +  dadu.getDadu2());
        System.out.println("Maju : " + dadu.getDadu() + " langkah");
        System.out.println("Posisi awal : " + posisiAwalPemain);
        System.out.println("Posisi Akhir : " + posisiPemain);
        System.out.println("Anda berada di " + namaPetak);
        
        if (posisiPemain == 4){
        
        }
    }
   
}
