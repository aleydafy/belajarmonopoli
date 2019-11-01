
package monopoli;

public class Hotel extends Petak {
    
    private double harga_sewa;
    private double harga_htl;
    
    public void setHarga_sewa(double harga_sewa){
        this.harga_sewa = harga_sewa;
    }
    
    public double getHarga_sewa(){
        return harga_sewa;
    }
    
    public void setHarga_htl(double harga_htl){
        this.harga_htl = harga_htl;
    }
    
    public double getHarga_htl(){
        return harga_htl;
    }
}
