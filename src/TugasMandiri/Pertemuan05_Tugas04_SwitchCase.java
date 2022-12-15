
package TugasMandiri;
// Dimasukkan agar rupiah terdapat , (ex Rp 200,000)
import java.text.NumberFormat;

import java.util.Scanner;
public class Pertemuan05_Tugas04_SwitchCase {
    public static void main(String[] args) {
        
    // Dimasukkan agar rupiah terdapat , (ex Rp 200,000)
        NumberFormat harga=NumberFormat.getInstance();
        harga.setMaximumFractionDigits(3);
   // Memasukkan input user
        Scanner sc = new Scanner(System.in);
   // Deklarasikan Variabel
        boolean running = true, ulang = true, error = true, error2 = true;
        int menu, pesan, jumlah;
        double total =0, diskon, nominalbayar, kembalian;
        String jawab;
        
   //  Tuliskan variable Menu
        int sateayam=1500,satekambing=3000;
        int laukayam=13000, laukempal=15000;
        int peceltahutempe=5000, peceltelur=7000, pecelayam=10000;
        
  // while (running)  digunakan untuk melakukan perulangan akhir
          while(running) {
         System.out.println("                      Kasir Penjualan Makanan     ");
         System.out.println("                        WARUNG SEDERHANA         ");
         System.out.println("=================================================");
         System.out.print("                     Masukkan Nomer Meja Pesanan : " );
         int meja = sc.nextInt();
     
  // for i dibuat untuk menambah pesanan makanan
        for (String i = "ya"; i.equals("ya")|| i.equals("ya");)
        {
          System.out.println("=================================================");
          System.out.println("                            Menu Makanan");
          System.out.println("=================================================");
  // Masukkan pilihan jenis makanan
          System.out.println("1. Sate Thailand ");
          System.out.println("2. Pecel Sumatra ");
          System.out.println("3. Penyetan Khas Jerman");
          error = true;error2=true;
 // Perulangan error #1
          while (error) {
          System.out.println("=================================================");
          System.out.print("pilih menu : ");
          menu = sc.nextInt();
          System.out.println("=================================================");
          
 // Gunakan Switch agar user bisa memilih 
 
          switch(menu){
               case 1 :
                  System.out.println("1. Sate Ayam Thailand                         (Rp1.500/tusuk) ");
                  System.out.println("2. Sate Kambing Thailand                  (Rp3.000/tusuk)");
                  // error = false pastikan ada agar tidak terjadi error
                       error = false;
                  break;
             
              case 2:
                  System.out.println(" 3. pecel sumatra lauk ayam               (Rp13.000/porsi)");
                  System.out.println(" 4. pecel sumatra thailand lauk empal (Rp15.000/porsi)");
                   error = false;
                  break;
              case 3:
                  System.out.println(" 5. penyetan jerman lauk tahu/tempe (Rp5.000/porsi)");
                  System.out.println(" 6. penyetan jerman lauk telur             (Rp7.000/porsi)");
                  System.out.println(" 7. penyetan jerman lauk ayam            (Rp10.000/porsi)");
                   error = false;
                  break;
// Jika user input diluar nomor yang disediakan akan terjadi error dengan melakukan perulangan
              default:
                 System.out.println("Pilihan Tidak tersedia");
// error = true agar perulangan terjadi
                 error = true;
          }
                 }
            // Perulangan error #2
                while (error2) {
              System.out.println("=================================================");
            // Input nomer menu + jumlah pesanan yang dipilih
              System.out.print("Nomer menu  : ");
              pesan =sc.nextInt();
              System.out.print("Jumlah Pesanan  : ");
              jumlah=sc.nextInt();
              System.out.println("=================================================");
            // Lakukan perhitungan dengan switch case
                  switch(pesan){
                     case 1:
                         System.out.println("pesanan anda                                     : Sate ayam");
                         System.out.println("harga                                                   : Rp 1.500/tusuk");
                         System.out.println("Jumlah Pesanan                                   : "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(sateayam*jumlah));
                         total=total+sateayam*jumlah;
                         error2 = false;
                         break; 
                    case 2:
                         System.out.println("Pesanan Anda                                     : Sate Kambing");
                         System.out.println("harga                                                   : Rp 3.000/tusuk");
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(satekambing*jumlah));
                         total=total+satekambing*jumlah;
                         error2 = false;
                         break; 
                     case 3:
                         System.out.println("Pesanan Anda                                     : Pecel Sumatra Lauk Ayam");
                         System.out.println("harga                                                   : Rp 13.000/Porsi");
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(laukayam*jumlah));
                         total=total+laukayam*jumlah;
                          error2 = false;
                         break;  
                     case 4:
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Tahu/Tempel");
                         System.out.println("harga                                                   : Rp 15.000/Porsi");
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format( laukempal*jumlah));
                         total=total+laukempal*jumlah;
                          error2 = false;
                         break;  
                     case 5 :
                         System.out.println("Pesanan Anda                                     : Pecel Sumatra Thailand Lauk Empal");
                         System.out.println("harga                                                   : Rp 5.000/Porsi");
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(peceltahutempe*jumlah));
                         total=total+peceltahutempe*jumlah;
                          error2 = false;
                         break; 
                     case 6 :
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Telur");
                         System.out.println("harga                                                   : Rp 7.000/Porsi");
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format( peceltelur*jumlah));
                         total=total+peceltelur*jumlah;
                          error2 = false;
                         break;  
                      case 7 :
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Ayam");
                         System.out.println("harga                                                   : Rp 10.000/Porsi");
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format(pecelayam*jumlah));
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         total=total+pecelayam*jumlah;
                         error2 = false;
                         break;  
                        
                       default:
                        System.out.println("Pilihan Tidak tersedia");
                        error2 = true;
                        break;
                  } }
                // Menggunakan for dapat dilakukan penambahan pesanan
                    System.out.println("=================================================");
                    System.out.print("Apakah Anda Ingin Membeli Makanan Lainya?" + " [ya/tidak]> ");
                    i=sc.next();
                    if (i.equals("ya")) {}
                  }
                    System.out.println("Total Biaya pesanan                               : Rp "+harga.format(total));
                     System.out.println("=================================================");
                      
                // Percabangan kartu member
                     System.out.print("Apakah anda memiliki kartu member ? [ya/tidak]> ");
                     jawab=sc.next();
                // Jika Ya lakukan perhitungan diskon
                     if( jawab.equals("ya") ){ 
                         System.out.println("Selamat anda mendapatkan diskon 5%");
                         diskon=total*0.05;
                         System.out.println("Diskon                                               : Rp " +harga.format(diskon));
                         total = total - diskon;
                // Selain jawaban ya termasuk tidak akan melanjutkan program
                     } 
            
                 // Lakukan perhtungan utama, while ulang digunakan jika terjadi kesalahan seperti kurang uang 
                     while (ulang) {
              
                     if (total >= 0){
                      System.out.println("=================================================");
                      System.out.println("Nomer Meja                                         :" + meja);
                      System.out.println("Total Biaya                                          : Rp "+harga.format(total));
                      System.out.print("Masukkan uang yang dibayarkan          : Rp ");
                      nominalbayar=sc.nextInt();
                      kembalian=nominalbayar-total;
              
                    // Perhitungan Normal
                        if (kembalian > 0) {
                            System.out.println("Kembali                                          : Rp " +harga.format(kembalian));
                            break;
                        }
                         //Tidak ada uang kembali
                        else if (kembalian== 0) { 
                        System.out.println("Kembali                                              : Rp 0");   
                        break;
                } 
                         // Uang kurang
                        else  if (kembalian< 0) { 
                        System.out.println(" xxxxxxxxxxxxxx Uang yang Dibayarkan Kurang xxxxxxxxxxxxxxx");
                        System.out.print("Apakah anda ingin mengulang pembayaran" + " [ya/tidak]> ");
                        String i = sc.next(); 
                        // Percabangan kekurangan uang jika ya akan terjadi perulangan dalam pembayaran
                        // Jika tidak, program akan melanjutkan
                          if( i.equals("ya"))   {
                              ulang = true;
                          }     
                          else if (i.equals("tidak")) {
                          break ;
        } } } 
    }   
                     // Perulangan keseluruhan program
                         System.out.println("=================================================");
          System.out.println("Apakah anda ingin melakukan transaksi kembali?");
                System.out.print("Jawab [ya/tidak]> ");
                    jawab = sc.next();
                if( jawab.equals("ya") ){ total = 0;
                    running = true;
                                    System.out.println("");
                                     System.out.println("");
           }                else if(jawab.equals("tidak")){
                                    System.out.println("                           ---Terima Kasih---");
                                     System.out.println("=================================================");
                                     System.out.println("");
                                     System.out.println("");
                                    break;   
           }
    }  }
    
}