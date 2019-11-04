
package com.game.monopoly;
import java.util.Scanner;

public class Pemain {

    private Scanner in;
    private Daduable ddu;
    private Uang uang;
    private String warna;
    private int posisi;
    private int posisiawal;
    private int posisiakhir;

    public Pemain(String warna, Uang uang, Daduable dadu) {
        this.ddu = dadu;
        this.uang = uang;
        this.warna = warna;
        this.in = new Scanner(System.in);
    }
    
    public String getWarna(){
        return warna;
    }
    
    public String getUang(){
        return String.valueOf(uang.getNominal());
    }
    
    public int getPosisi(){
        return posisi;
    }

    public void lempardadu(){
        ddu.kocok();
        posisiawal = posisiakhir;
        posisiakhir = ddu.getDadu() + posisiawal;
        
        if(posisiakhir > 40){
            posisiakhir -= 40;
        }
        posisi = posisiakhir;

        Display.showHasilDadu(ddu.getDadu1(), ddu.getDadu2());
        Display.showPemainBergerak(warna, ddu.getDadu(), posisiawal, posisi);
    }
    
    public void option(){
      
        Display.showMenu();
        
        int lagi = in.nextInt();
        
        switch(lagi){
            case 1 : 
                System.out.println("Sisa uang anda = ");
               
        }
    }
}
