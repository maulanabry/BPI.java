
package TugasMandiri;
import java.text.NumberFormat;
import java.util.Scanner;
public class Pertemuan08_Tugas07_Array1D {
    public static void main(String[] args) {
   
   // Membuat batasan setiap angka diberi koma
   NumberFormat harga=NumberFormat.getInstance();
   harga.setMaximumFractionDigits(3);
   //Membuat Scanner
   Scanner n = new Scanner(System.in);      
  
   // Variabel
   // [] index array --> tipedata x [] = new tipedata []
   // Membuat array
        String menu [] = new String [100]; 
        int   idx = 0,
                hrg[] = new int [100],
                jmh[] = new int [100],
                total = 0, 
                meja, 
                pesan, nominalbayar, kembali, jenis;
        
         System.out.println("\t \t WARUNG MBOIS         ");
         System.out.println("=================================================");
         System.out.print("Masukkan Nomer Meja Pesanan : " );
         meja  = n.nextInt();
         // Perulangan menggunakan do - while
          do { 
          System.out.println("=================================================");
          System.out.println("\t \t Menu Pesanan");
          System.out.println("=================================================");
          System.out.println("1. Makanan ");
          System.out.println("2. Minuman ");
          System.out.println("3. Selesai");
          System.out.println("=================================================");
          // Input jenis makanan
          System.out.print("Pilih Menu : ");
          jenis = n.nextInt();
          System.out.println("=================================================");
             // Agar bisa memilih makanan/minuman gunakan if
          if(jenis==1){
                  System.out.println(" 1. Geprek Original\t(Rp 10.000) ");
                  System.out.println(" 2. Geprek Telur Asin\t(Rp 15.000)");
                  System.out.println(" 3. Geprek Mozzarela\t(Rp 15.000)");
                  System.out.println(" 4. Indomie Original\t(Rp  6.000)");
                  System.out.println(" 5. Indomie Jumbo\t(Rp  8.000)");
                  System.out.println(" 6. Indomie Spesial\t(Rp  8.000)");
                  System.out.println(" 7. Indomie Geprek\t(Rp 10.000)");
                  System.out.println(" 8. Indomie Mozzarela\t(Rp 15.000)");
                  System.out.println("=================================================");
                  // Input pesanan dan jumlah
                  System.out.print("Pilih Pesanan\t: ");
                  pesan=n.nextInt();
                  System.out.print("Jumlah Pesanan\t: ");
                  jmh [idx] =n.nextInt();
                  System.out.println("=================================================");
              switch (pesan) {
                  case 1 :
                      // Isi data array pada setiap case
                      menu[idx] = "Geprek Original";
                      hrg [idx] = 10000;
                      // Perhitungan pesanan
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Geprek Original  (Rp 10.000) ");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                  case 2 :
                      menu[idx] = "Geprek Telur Asin";
                      hrg [idx] = 15000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Geprek Telur Asin (Rp 15.000) ");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                case 3 :
                      menu[idx] = "Geprek Mozzarela";
                      hrg [idx] = 15000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Mozzarela  (Rp 15.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                 case 4 :
                      menu[idx] = "Indomie Original";
                      hrg [idx] = 6000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Indomie Original   (Rp 6.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                case 5 :
                      menu[idx] = "Indomie Jumbo";
                      hrg [idx] = 8000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Indomie Jumbo  (Rp 8.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
               case 6 :
                      menu[idx] = "Indomie Spesial";
                      hrg [idx] = 15000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Indomie Spesial (Rp 8.000) ");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
              case 7 :
                      menu[idx] = "Indomie Geprek";
                      hrg [idx] = 15000;
                      total = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Indomie Geprek (Rp 10.000) ");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
              case 8 :
                      menu[idx] = "Indomie Mozzarela";
                      hrg [idx] = 15000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Indomie Mozzarela (Rp 15.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break;  
              } 
              // Pilihan minuman
              } else if(jenis==2) {
                  System.out.println(" 1. Teh Tarik\t(Rp 5.000) ");
                  System.out.println(" 2. Milkshake\t(Rp 15.000)");
                  System.out.println(" 3. Milk Tea\t(Rp 5.000)");
                  System.out.println(" 4. Thai Tea\t(Rp 8.000)");
                  System.out.println("=================================================");
                  System.out.print("Pilih Pesanan\t: ");
                  pesan=n.nextInt();
                  System.out.print("Jumlah Pesanan\t: ");
                  jmh [idx] =n.nextInt();
                  System.out.println("=================================================");
                 switch (pesan) {
                  case 1 :
                      menu[idx] = "Teh Tarik";
                      hrg [idx] = 5000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Teh Tarik (Rp 5.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                  case 2 :
                      menu[idx] = "Milkshake";
                      hrg [idx] = 15000;
                      total = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Milkshake (Rp 15.000) ");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                case 3 :
                      menu[idx] = "Milk Tea";
                      hrg [idx] = 5000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Milk Tea (Rp 5.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
                 case 4 :
                      menu[idx] = "Thai Tea";
                      hrg [idx] = 8000;
                      total  = total+hrg [idx]*jmh[idx];
                       System.out.println("Pesanan anda \t: Thai Tea (Rp 8.000)");
                       System.out.println("Jumlah Pesanan \t: " +jmh[idx]);
                       System.out.println("Biaya Pesanan \t: Rp " +  harga.format(hrg[idx]*jmh [idx]));
                        break; 
              }     
              }else if (jenis==3) {  
                 }      
              else { System.out.println("Pilihan Tidak Tersedia");
              // Agar array bertambah setiap pemesanan
              }idx++;  
          }while(jenis != 3);
           System.out.println("Pesanan Anda\t:");
           // Menampilkan seluruh array
                for (int i = 0; i < idx-1; i++) {
                System.out.println("\n" + (i+1) + ". " + menu[i]);
                System.out.println("Jumlah    : " + jmh[i]);
                System.out.println("Harga \t  : Rp " +harga.format(hrg [i]));
                 System.out.println("Total \t  : Rp " +harga.format(hrg[i]*jmh [i]));
                }
            System.out.println("=================================================");
            // Menampilkan total pesanan
            System.out.println("Total Biaya\t\t      : Rp "+harga.format(total));
           do {
           // Input jumlah uang yang dibayarkan
            System.out.print("Masukkan uang yang dibayarkan : Rp ");
            nominalbayar=n.nextInt();
            kembali=nominalbayar-total;
           }while (kembali <= -1 ); // Agar terjadi perulangan jika kurang
           // Menampilkan kembalian
            System.out.println("Kembali\t\t\t      : Rp " +harga.format(kembali));
            System.out.println("=================================================");
              System.out.println("\t\t Terima Kasih");
             System.out.println("=================================================");
  
    }  
}
