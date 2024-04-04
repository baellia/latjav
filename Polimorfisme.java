/* pertemuan 2 */

class hewan{
    public void suara(){
    System.out.println("Hewan Bersuara :");
    }
}
class kuda extends hewan{
    @Override
    public void suara(){
    System.out.println("Kuda Mengikik...");
    }
}
class kucing extends hewan{
    @Override
    public void suara(){
    System.out.println("Kucing Mengeong...");
    } 
}
class ayam extends hewan{
    @Override
    public void suara(){
    System.out.println("Ayam berkokok...");
    }
}
public class Polimorfisme {
    public static void main(String[] args){
    hewan HEWAN = new hewan();
    kuda KUDA = new kuda();
    kucing KUCING = new kucing();
    ayam AYAM = new ayam();
    
    HEWAN.suara();
    
    HEWAN = KUDA;
    HEWAN.suara();
    
    HEWAN = KUCING;
    HEWAN.suara();
    
    HEWAN = AYAM;
    HEWAN.suara();
    }
}
    
