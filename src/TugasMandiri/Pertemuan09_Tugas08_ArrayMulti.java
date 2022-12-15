
package TugasMandiri;
import java.util.Scanner;
import java.text.NumberFormat;
public class Pertemuan09_Tugas08_ArrayMulti {
    public static void main(String[] args) {
         NumberFormat harga=NumberFormat.getInstance();
         harga.setMaximumFractionDigits(3);
             Scanner s= new Scanner(System.in);
        // Variabel
        String pesan [][][] = new String [20][3][10];
        int hrg [][][] = new int [20][10][10];
        int meja[][][] = new int[20][10][10];
        int  pilih = 0, jml = 0, kmbl, bayar,menu = 0, jawab, mkn = 0,mnm
                = 0, mnm1 = 0,mkn1 = 0,idx2 = 0;
        boolean running= true;
        
        while (running){
            int total = 0,idx = 0;
            mkn1 = 0; mnm1 = 0;
        
         System.out.println("\t \t WARUNG MBOIS         ");
         System.out.println("=================================================");
         System.out.print("Masukkan Nomer Meja Pesanan : " );
         meja[idx][0][idx2]  = s.nextInt(); 
        do{
          total = mkn1+mnm1;
          System.out.println("-------------------------------------------------");
          System.out.println("\t \t Menu Pesanan");
          System.out.println("-------------------------------------------------");
          System.out.println("1. Makanan ");
          System.out.println("2. Minuman ");
          System.out.println("3. Daftar Pesanan");
          System.out.println("4. Selesai");
          System.out.println("-------------------------------------------------");
          System.out.print("Pilih Menu : ");
          menu = s.nextInt();
          System.out.println("-------------------------------------------------");
          if (menu ==1){
              System.out.println(" 1. Geprek Original\t(Rp 10.000) ");
              System.out.println(" 2. Geprek Telur Asin\t(Rp 15.000)");
              System.out.println(" 3. Geprek Mozzarela\t(Rp 15.000)");
              System.out.println(" 4. Indomie Original\t(Rp  6.000)");
              System.out.println(" 5. Indomie Jumbo\t(Rp  8.000)");
              System.out.println("-------------------------------------------------");
              System.out.print("pilih Menu\t: ");
              mkn =s.nextInt();
              System.out.print("Jumlah Pesanan\t: ");
                 hrg [idx][2][idx2] =s.nextInt();
              System.out.println("-------------------------------------------------");
         switch (mkn){
             case 1: 
                 pesan [idx][0][idx2] = ("Geprek Ori");
                 hrg   [idx][0][idx2] = 10000;
                 break;
              case 2: 
                 pesan [idx][0][idx2] = ("Geprek TA");
                 hrg   [idx][0][idx2] = 15000;
                 break;
              case 3: 
                 pesan [idx][0][idx2] = ("Geprek MZ");
                 hrg   [idx][0][idx2] = 15000;
                 break;
               case 4: 
                 pesan [idx][0][idx2] = ("indomie Ori");
                 hrg   [idx][0][idx2] = 6000;
                 break;
               case 5: 
                 pesan [idx][0][idx2] = ("Indomie Jmb");
                 hrg   [idx][0][idx2] = 8000;
                 break;
               default:
                 System.out.println("Pilihan Tidak tersedia");
                 break;
          }
           hrg [idx][5][idx2] = hrg [idx][2][idx2]*hrg[idx][0][idx2];
            mnm1 = mnm1+hrg [idx][5][idx2];
           System.out.println("Pesanan   : " + pesan [idx][0][idx2]);
           System.out.println("Jumlah    : "+hrg [idx][2][idx2]);
           System.out.println("Harga \t  : Rp " +harga.format(hrg [idx][0][idx2]));
           System.out.println("Total \t  : Rp " +harga.format(hrg [idx][5][idx2]));
           idx++;
        }
          else if (menu == 2){
             System.out.println(" 1. Teh Tarik\t(Rp 5.000) ");
             System.out.println(" 2. Milkshake\t(Rp 8.000)");
             System.out.println(" 3. Milk Tea\t(Rp 5.000)");
              System.out.println("-------------------------------------------------");
              System.out.print("pilih Menu\t: ");
              mnm =s.nextInt();
              System.out.print("Jumlah Pesanan\t: ");
                  hrg [idx][2][idx2] =s.nextInt();
              System.out.println("-------------------------------------------------");
         switch (mnm){
             case 1: 
                 pesan [idx][0][idx2] = ("Teh Tarik");
                 hrg   [idx][0][idx2] = 5000;
                 break;
             case 2: 
                 pesan [idx][0][idx2] = ("milkshake");
                 hrg   [idx][0][idx2] = 8000;
                 break;
             case 3: 
                 pesan [idx][0][idx2] = ("Milk Tea");
                 hrg   [idx][0][idx2] = 5000;
                 break;
             
               default:
                 System.out.println("Pilihan Tidak tersedia");
                 break;
          }
           hrg [idx][5][idx2] = hrg [idx][2][idx2]*hrg[idx][0][idx2];
            mkn1 = mkn1+hrg [idx][5][idx2];
           System.out.println("Pesanan   : " + pesan [idx][0][idx2]);
           System.out.println("Jumlah    : "+hrg [idx][2][idx2]);
           System.out.println("Harga \t  : Rp " +harga.format(hrg [idx][0][idx2]));
           System.out.println("Total \t  : Rp " +harga.format(hrg [idx][5][idx2]));
           idx++;
          }
          else if (menu == 3){
            System.out.println("\t \t Daftar Pesanan");
            System.out.println("-------------------------------------------------");
            System.out.print("No.   Nama \t Harga \t    Jumlah \t Total\n");
            for (int i = 0; i < 5; i++) {
               if(pesan[i][0][idx2] != null){
                 System.out.print((i+1) + ". " + pesan[i][0][idx2]+" " + "\tRp. ");
                 System.out.print(harga.format(hrg[i][0][idx2])+ "\t"+ hrg[i][2][idx2] +"  "+ "\t Rp. " + harga.format(hrg[i][5][idx2]));
                 System.out.println(" ");
        
            
          }
           } System.out.println("-------------------------------------------------");
             System.out.println("\t \t \t \t \t Rp. " + harga.format (total));
        }} while (menu != 4);  
       
      
                
            System.out.println("\t \t Daftar Pesanan");
            System.out.println("-------------------------------------------------");
            System.out.print("No.   Nama \t Harga \t    Jumlah \t Total\n");
            for (int i = 0; i < 5; i++) {
                if(pesan[i][0][idx2] != null){
                 System.out.print((i+1) + ". " + pesan[i][0][idx2]+" " + "\tRp. ");
                 System.out.print(harga.format(hrg[i][0][idx2])+ "\t"+ hrg[i][2][idx2] +"  "+ "\t Rp. " + harga.format(hrg[i][5][idx2]));
                 System.out.println(" ");
                } } 
            System.out.println("-------------------------------------------------");
             System.out.println("\t \t \t \t \t Rp. " + harga.format (total));
         do {
           // Input jumlah uang yang dibayarkan
            System.out.print("Masukkan uang yang dibayarkan \t\t Rp. ");
            bayar=s.nextInt();
            kmbl=bayar-total;
           }while (kmbl <= -1 ); // Agar terjadi perulangan jika kurang
           // Menampilkan kembalian
            System.out.println("Kembali\t\t\t\t\t Rp. " +harga.format(kmbl));
           System.out.println("=================================================");
           System.out.println("Apakah anda ingin melakukan transaksi kembali?");
           System.out.print("Jawab [ ya : 1 / tidak : 2 ]> ");
                     jawab=s.nextInt();
         if( jawab ==1){ total = 0;
                    idx2++;
                    running = true;
           }   
         else if(jawab == 2){
            System.out.println("-------------------------------------------------");
            System.out.println("\t \t ---Terima Kasih---");
            System.out.println("=================================================");
            break;   
           } 
        }       
    }
}
