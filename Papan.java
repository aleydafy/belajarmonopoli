
package com.game.monopoly;
import java.util.ArrayList;

public class Papan{

    ArrayList<Petak> daftarPetak;
    
    public Papan(){
        daftarPetak = new ArrayList<Petak>();
    }
    
    public void tambah_petak(Petak ptk){
        daftarPetak.add(ptk);
    }
}
