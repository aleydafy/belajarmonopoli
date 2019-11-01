
package monopoli;
import java.util.Random;

public class Dadu {
    
    private int dadu1;
    private int dadu2;
    private int hasil;
    
    Random rndm = new Random();
    
    public void kocok(){
        dadu1 = 1 + rndm.nextInt(6);
        System.out.println("Dadu 1 : " + dadu1);
        dadu2 = 1 + rndm.nextInt(6);
        System.out.println("Dadu 2 : " + dadu2);
        setDadu(dadu1, dadu2);
    }
    
    public void setDadu(int dadu1, int dadu2){
        this.dadu1 = dadu1;
        this.dadu2 = dadu2;
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
