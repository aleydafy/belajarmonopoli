
package com.game.monopoly;
import java.util.Scanner;

public class Pemain implements Pemainable{

    private Uang uang;
    private String warna;
    private int posisi;
    private int posisiawal;
    private int posisiakhir;

    public Pemain(Uang uang){
        this.uang = uang;
    }

    public Pemain(String warna, Uang uang ) {
        this.uang = uang;
        this.warna = warna;
    }

    public void lempardadu(Daduable dadu){
        dadu.kocok();
        posisiawal = posisiakhir;
        posisiakhir = dadu.getDadu() + posisiawal;
        
        if(posisiakhir > 40){
            posisiakhir -= 40;
        }
        posisi = posisiakhir;
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

    public int getPosisiAwal(){
        return posisiawal;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }
}

interface Pemainable {
    public void lempardadu(Daduable dadu);
    public void setWarna(String warna);
    public String getWarna();
    public String getUang();
    public int getPosisi();
    public int getPosisiAwal();
}
