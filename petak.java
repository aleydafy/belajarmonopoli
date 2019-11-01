
package monopoli;

public class Petak {

    private String nama;
    private int posisi;
    private double harga;
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setPosisi(int posisi){
        this.posisi = posisi;
    }
    
    public int getPosisi(){
        return posisi;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    public double getHarga(){
        return harga;
    }
}
