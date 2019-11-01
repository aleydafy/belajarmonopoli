
package monopoli;

public class petak {
    private String nama_petak;
    private int posisi;
    private double harga;
    
    public void setNama_petak(String nama_petak){
        this.nama_petak = nama_petak;
    }
    
    public String getNama_petak(){
        return nama_petak;
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
