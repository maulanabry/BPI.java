
package TugasMandiri;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class pembeli  {  
    private String nama;
    private int usia;
    private String alamat;
    pembeli(){//constructor
        nama= "";
        usia= 0;
        alamat = "";
        System.out.println("Object customer created...");
        
    }
    pembeli(String n, int u, String a){
        nama = n;
        usia = u;
        alamat = a;
        System.out.println("Object"+nama+"dibuat...");
        
    }
    void setNama(String n){
        nama = n;
    }
    void setUsia(int u){
        usia = u;
    }
    void setAlamat(String a){
        alamat = a;
    }
    public String getNama(){
        return nama;
    }
    public int getUsia(){
        return usia;
    }
    public String getAlamat(){
        return alamat;
    }
    public String isiObject(){
        return nama+" ["+usia+"] "+alamat;
    }
}
class makanan{
}
class minuman{    
}
class Application {
    static void menumakanan(){
            System.out.println("Soto \t\t12.000");
            System.out.println("Rawon\t\t11.000");
            System.out.println("Bakso\t\t 8.000");
            System.out.println("Ayam \t\t10.000");
            System.out.println("Bebek\t\t15.000");
}
    static void menupembeli(){
    Scanner sc = new Scanner(System.in);
     int pilih = 0;
            do{
            pembeli pb = new pembeli("Gosal",17,"Surabaya");           
            System.out.println("1. Lihat pembeli");
            System.out.println("2. Ubah pembeli");
            System.out.println("3. Hapus pembeli");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
           
            pilih = sc.nextInt();
            switch(pilih){
                
                case 1:
                    
                    String t = pb.isiObject();
                    System.out.println("Pembeli = "+t);                           
                     break;
                case 2: 
                    System.out.print("Nama = ");
                    String n = sc.next();
                    System.out.print("Alamat = ");
                    String a = sc.next();
                    System.out.print("Usia = ");
                    int u = sc.nextInt();
                    pb.setNama(n);
                    pb.setUsia(u);
                    pb.setAlamat(a);
                    System.out.println("Data telah diubah");
                     break;    
                case 3:
                    pb.setNama("--");
                    pb.setAlamat("--");
                    pb.setUsia(0);
                     break;
                case 4:
                    System.out.println("Terimakasih...");
                    
                     break;}
            } while( pilih !=4); 
            }
            
   
            
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String [] makanan = new String[10];
       int [] hargamakan = new int[10];
       makanan[1] = "Soto";
       hargamakan[1] = 12000;
       makanan[2] = "Rawon";
       hargamakan[2] = 11000;
       makanan[3] = "Bakso";
       hargamakan[3] = 8000;
       makanan[4] = "Ayam";
       hargamakan[4] = 10000;
       makanan[5] = "Bebek";
       hargamakan[5] = 15000;  
       
       System.out.println("Bukan Warung Gosal");

        int pilih = 0;
        do{
            System.out.println("1. Menu pembeli");
            System.out.println("2. Menu makanan");
            System.out.println("3. Menu minuman");
            System.out.println("4. Selesai");
            System.out.println("Pilih = ");    
        pilih = sc.nextInt();    
        switch(pilih){
                case 1:
                    menupembeli();                         
                     break;
                case 2: 
                    menumakanan();
                     break;    
                case 3:
                     break;
                case 4:
                     break;
        }}while (pilih!=1);}
}