
package com.game.monopoly;

public class Transportasi extends Petak {
    
    private double harga_sewa1;
    private double harga_sewa2;
    private double harga_sewa3;
    private double harga_sewa4;

    public Transportasi(String nama, int posisi, double harga, double hsewa1, double hsewa2, double hsewa3, double hsewa4) {
        super(nama, posisi, harga);
        harga_sewa1 = hsewa1;
        harga_sewa2 = hsewa2;
        harga_sewa3 = hsewa3;
        harga_sewa4 = hsewa4;
    }
    
}
