
package TugasMandiri;
import java.text.NumberFormat;
import java.util.Scanner;
public class kasirsederhana {
    public static void main(String[] args) {
    NumberFormat harga=NumberFormat.getInstance();
     harga.setMaximumFractionDigits(3);
        Scanner s= new Scanner(System.in);
        //Variabel
   int total = 0,kembali = 0,hrg,jml,bayar,meja,jenis = 0,pesan;
   
       System.out.println("=================================================");
       System.out.println("\t \tWarung Mbois");
         System.out.println("=================================================");
           System.out.print("Meja Pesanan \t: ");
           meja = s.nextInt();
       do {
           System.out.println("=================================================");
           System.out.println("\t \t    Menu");
        System.out.println("=================================================");
           System.out.println("1. Makanan");
           System.out.println("2. Minuman");
           System.out.println("3. Selesai");
         System.out.println("=================================================");
           System.out.print("Pilih \t: ");
           jenis = s.nextInt();
         System.out.println("=================================================");
         if (jenis ==1){
             System.out.println("1. Geprek Orinal\t(Rp 10.000)");
             System.out.println("2. Geprek Keju\t \t(Rp 15.000)");
        System.out.println("=================================================");
             System.out.print("Pilih Pesanan\t: ");
             pesan = s.nextInt();
             System.out.print("Jumlah Pesanan\t: ");
             jml = s.nextInt();
        System.out.println("=================================================");
        switch (pesan){
            case 1:
                hrg = 10000;
                total = total+hrg*jml;
                System.out.println("Pesanan anda \t: Geprek Original (Rp 10.000)");
                System.out.println("Jumlah pesanan \t: "+jml);
                System.out.println("Biaya pesanan \t: "+(hrg*jml));
                break;
            case 2 :
                hrg = 15000;
                total = total+hrg*jml;
                System.out.println("Pesanan anda \t: Geprek Keju (Rp 10.000)");
                System.out.println("Jumlah pesanan \t: "+jml);
                System.out.println("Biaya pesanan \t: "+(hrg*jml));
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
            
        }
 
         } else if (jenis ==2){
              System.out.println("1. Milkshake\t(Rp 8.000)");
             System.out.println("2. Pop Ice\t(Rp 5.000)");
        System.out.println("=================================================");
             System.out.print("Pilih Pesanan\t: ");
             pesan = s.nextInt();
             System.out.print("Jumlah Pesanan\t: ");
             jml = s.nextInt();
        System.out.println("=================================================");
        switch (pesan){
            case 1:
                hrg = 8000;
                total = total+hrg*jml;
                System.out.println("Pesanan anda \t: Milkshake (Rp 8.000)");
                System.out.println("Jumlah pesanan \t: "+jml);
                System.out.println("Biaya pesanan \t: "+harga.format(hrg*jml));
                break;
            case 2 :
                hrg = 5000;
                total = total+hrg*jml;
                System.out.println("Pesanan anda \t: Pop Ice (Rp 5.000)");
                System.out.println("Jumlah pesanan \t: "+jml);
                System.out.println("Biaya pesanan \t: "+harga.format(hrg*jml));
                break;
            default:
                System.out.println("Pilihan Tidak Tersedia");
 
         }
           
         }else if (jenis==3) {
         }else {
             System.out.println("Pilihan Tidak Tersedia");
         }
       }while (jenis !=3);
       System.out.println("Meja Pesanan \t: "+meja);
       System.out.println("Total Biaya \t: Rp "+harga.format (total)); 
       do {
           System.out.print("Uang pembeli \t: Rp ");
           bayar = s.nextInt();
           kembali = bayar - total;
  
       } while (kembali < 0);
        System.out.println("Kembalian\t: Rp  "+harga.format (kembali));
        System.out.println("=================================================");
        System.out.println("\t \tTerima Kasih");
         System.out.println("=================================================");
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
        
        
        
        
        
        
        
        
        
    }
}
