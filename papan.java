
package monopoli;
import java.util.ArrayList;
public class papan {
    ArrayList<petak> daftar_petak;
    
    public papan(){
        daftar_petak = new ArrayList<petak>();
    }
    
    public void tambah_petak(petak ptk){
        daftar_petak.add(ptk);
    }
}
