
package com.game.monopoly;

public class Petak {

    private String nama;
    private int posisi;
    private double harga;

    public Petak() {
    }

    public Petak(String nama, int posisi, double harga) {
        this.nama = nama;
        this.posisi = posisi;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public int getPosisi(){
        return posisi;
    }

    public double getHarga(){
        return harga;
    }
}
