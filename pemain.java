
package monopoli;
import java.util.Scanner;
public class pemain extends petak{
    Scanner in = new Scanner(System.in);
    dadu ddu = new dadu();
    uang uang = new uang();
    papan ppn = new papan();
    private String warna;
    private int posisi;
    private int posisiawal;
    private int posisiakhir;
    
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public void setPosisi(int posisi){
        this.posisi = posisi;
    }
    
    public int getPosisi(){
        return posisi;
    }
    
    public void lempardadu(){
        ddu.kocok();
        posisiawal = posisiakhir;
        posisiakhir = ddu.getDadu() + posisiawal;
        
        if(posisiakhir > 40){
            posisiakhir -= 40;
        }
        setPosisi(posisiakhir);
        bergerak();
    }
    
    public void bergerak(){
        System.out.println("warna player : " + "\u001b[31m" + warna + "\u001b[31m");
        System.out.println("Maju : " + ddu.getDadu() + " langkah");
        System.out.println("Posisi awal : " + posisiawal);
        System.out.println("Posisi Akhir : " + getPosisi());
    }
    
    public void option(){
        System.out.println("1. Beli Tanah");
        System.out.println("2. Beli Rumah");
        System.out.println("3. Beli Hotel");
        System.out.println("4. Lanjut");
        int lagi = in.nextInt();
        
        switch(lagi){
            case 1 : 
                System.out.println("Sisa uang anda = ");
               
        }
    }
}