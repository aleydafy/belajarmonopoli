
package com.game.monopoly;

public class Negara extends Petak {
    
    Rumah rmh;
    Tanah tnh;
    Hotel htl;
    Komplek kmplk;

    public Negara(String nama, int posisi, double harga, Rumah rumah, Tanah tanah, Hotel hotel, Komplek komplek){
        super(nama, posisi, harga);
        rmh = rumah;
        tnh = tanah;
        htl = hotel;
        kmplk = komplek;
    }
}
