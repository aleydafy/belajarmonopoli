
package monopoli;
import java.util.ArrayList;

public class Papan {

    ArrayList<Petak> daftarPetak;
    
    public Papan(){
        daftarPetak = new ArrayList<Petak>();
    }
    
    public void tambahPetak(Petak ptk){
        daftarPetak.add(ptk);
    }
}
