
package com.game.monopoly;
import java.util.Random;

public class Dadu implements Daduable {
    
    private int dadu1;
    private int dadu2;
    private int hasil;

    public void kocok(){
        Random rndm = new Random();
        dadu1 = 1 + rndm.nextInt(6);
        dadu2 = 1 + rndm.nextInt(6);
        hasil = dadu1 + dadu2;
    }

    public int getDadu(){
        return hasil;
    }
    
    public int getDadu1(){
        return dadu1;
    }
   
    public int getDadu2(){
        return dadu2;
    }
}

interface Daduable {
    public void kocok();
    public int getDadu();
    public int getDadu1();
    public int getDadu2();

}