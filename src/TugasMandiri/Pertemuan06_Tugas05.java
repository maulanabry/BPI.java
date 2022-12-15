
package TugasMandiri;
//Agar bisa memamasukkan input user
import java.util.Scanner;
  // Dimasukkan agar rupiah terdapat , (ex Rp 200,000)
import java.text.NumberFormat;
public class Pertemuan06_Tugas05 {
    public static void main(String[] args) {
      // Dimasukkan agar rupiah terdapat , (ex Rp 200,000)
        NumberFormat harga=NumberFormat.getInstance();
        harga.setMaximumFractionDigits(3);
   // Memasukkan input user
        Scanner sc = new Scanner(System.in);
   // Deklarasikan Variabel
        boolean running = true, ulang = true, error = true;
        int jawab, jenis, pesan = 0, jumlah = 0;
        double total =0, diskon, nominalbayar, kembalian;
        
   //  Tuliskan variable Menu Makanan
        int sateayam=1500,satekambing=3000,laukayam=13000, laukempal=15000, peceltahutempe=5000, peceltelur=7000, pecelayam=10000;
   //  Tuliskan variable Menu Minuman
        int teh=3000,susu=4000,jeruk=5000,degan=7000;

   // while (running)  digunakan untuk melakukan looping program secara keseluruhan
          while(running) {
         System.out.println("                           WARUNG SEDERHANA         ");
         System.out.println("=================================================");
         System.out.print("                        Masukkan Nomer Meja Pesanan : " );
         int meja = sc.nextInt();
// for i dibuat untuk melakukan looping  menambah pesanan makanan
        for (int i = 1; i==(1);){
//  while (error) digunakan untuk melakukan looping ketika terjadi error dan pengulangan pemesanan
         while (error) {
          System.out.println("=================================================");
          System.out.println("                            Menu Makanan");
          System.out.println("=================================================");
  // Masukkan pilihan jenis menu
          System.out.println("1. Makanan ");
          System.out.println("2. Minuman ");
          System.out.println("=================================================");
          System.out.print("pilih menu : ");
          jenis = sc.nextInt();
          error = true;
 //  if jenis == 1 merupakan pilihan makanan   
           if(jenis==1){  
          System.out.println("=================================================");   
                  System.out.println(" 1. Sate Ayam Thailand                            (Rp1.500/tusuk) ");
                  System.out.println(" 2. Sate Kambing Thailand                       (Rp3.000/tusuk)");
                  System.out.println(" 3. pecel sumatra lauk ayam                     (Rp13.000/porsi)");
                  System.out.println(" 4. pecel sumatra thailand lauk empal      (Rp15.000/porsi)");
                  System.out.println(" 5. penyetan jerman lauk tahu/tempe       (Rp5.000/porsi)");
                  System.out.println(" 6. penyetan jerman lauk telur                  (Rp7.000/porsi)");
                  System.out.println(" 7. penyetan jerman lauk ayam                 (Rp10.000/porsi)");
         System.out.println("=================================================");  
               
            // Input nomer menu + jumlah pesanan yang dipilih
              System.out.print("Nomer menu  : ");
              pesan =sc.nextInt();
              System.out.print("Jumlah Pesanan  : ");
              jumlah=sc.nextInt();
              System.out.println("=================================================");
           
           // Agar user bisa menginput dan program memproses input user gunakan switchcase 
                 switch(pesan){
                     case 1:
                         System.out.println("pesanan anda                                      : Sate ayam");
                         System.out.println("harga                                                    : Rp 1.500/tusuk");
                         System.out.println("Jumlah Pesanan                                   : "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(sateayam*jumlah));
                         total=total+sateayam*jumlah;
                         error = false; 
                         break; 
                    case 2:
                         System.out.println("Pesanan Anda                                     : Sate Kambing");
                         System.out.println("harga                                                   : Rp 3.000/tusuk");
                         System.out.println("Jumlah Pesanan                                   :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(satekambing*jumlah));
                         total=total+satekambing*jumlah;
                         error = false; 
                         break; 
                     case 3:
                         System.out.println("Pesanan Anda                                     : Pecel Sumatra Lauk Ayam");
                         System.out.println("harga                                                   : Rp 13.000/Porsi");
                         System.out.println("Jumlah Pesanan                                   :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(laukayam*jumlah));
                         total=total+laukayam*jumlah;
                         error = false; 
                         break;  
                     case 4:
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Tahu/Tempel");
                         System.out.println("harga                                                   : Rp 15.000/Porsi");
                         System.out.println("Jumlah Pesanan                                   :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format( laukempal*jumlah));
                         total=total+laukempal*jumlah;
                         error = false; 
                         break;  
                     case 5 :
                         System.out.println("Pesanan Anda                                     : Pecel Sumatra Thailand Lauk Empal");
                         System.out.println("harga                                                   : Rp 5.000/Porsi");
                         System.out.println("Jumlah Pesanan                                   :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(peceltahutempe*jumlah));
                         total=total+peceltahutempe*jumlah;
                         error = false; 
                         break; 
                     case 6 :
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Telur");
                         System.out.println("harga                                                   : Rp 7.000/Porsi");
                         System.out.println("Jumlah Pesanan                                   :  "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format( peceltelur*jumlah));
                         total=total+peceltelur*jumlah;
                         error = false; 
                         break;  
                      case 7 :
                         System.out.println("Pesanan Anda                                     : Penyetan Jerman Lauk Ayam");
                         System.out.println("harga                                                   : Rp 10.000/Porsi");
                         System.out.println("Biaya Pesanan                                     : Rp " +harga.format(pecelayam*jumlah));
                         System.out.println("Jumlah Pesanan                                  :  "+jumlah);
                         total=total+pecelayam*jumlah;
                         error = false; 
                         break;  
                        
                       default:
                        System.out.println("Pilihan Tidak tersedia");
                        error = true;
                        break;
                  } 
        
           }  //  if jenis == 2 merupakan pilihan minuman 
           else if (jenis==2){
                  System.out.println("=================================================");
                  System.out.println("1. Teh                                                            (Rp 3.000) ");
                  System.out.println(" 2. Susu                                                          (Rp 4.000)");
                  System.out.println(" 3. Jeruk peras                                                (Rp 5.000)");
                  System.out.println(" 4. Es Degan Ijo                                              (Rp 7.000)");
                  System.out.println("=================================================");
               // Input nomer menu + jumlah pesanan yang dipilih
              System.out.print("Nomer menu  : ");
              pesan =sc.nextInt();
              System.out.print("Jumlah Pesanan  : ");
              jumlah=sc.nextInt();
              // Agar user bisa menginput dan program memproses input user gunakan switchcase
              System.out.println("=================================================");
                  switch(pesan){
                     case 1 :
                         System.out.println("pesanan anda                                      : Teh");
                         System.out.println("harga                                                    : Rp 3.000");
                         System.out.println("Jumlah Pesanan                                   : "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(teh*jumlah));
                         total=total+teh*jumlah;
                         error = false;
                         break; 
                    case 2 :
                         System.out.println("pesanan anda                                       : Susu");
                         System.out.println("harga                                                     : Rp 4.000");
                         System.out.println("Jumlah Pesanan                                    : "+jumlah);
                         System.out.println("Biaya Pesanan                                      : Rp " + harga.format(susu*jumlah));
                         total=total+susu*jumlah;
                         error = false;
                         break; 
                    case 3 :
                         System.out.println("pesanan anda                                      : Jeruk");
                         System.out.println("harga                                                    : Rp 5.000");
                         System.out.println("Jumlah Pesanan                                   : "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(jeruk*jumlah));
                         total=total+jeruk*jumlah;
                         error = false;
                         break; 
                     case 4 :
                         System.out.println("pesanan anda                                      : Degan");
                         System.out.println("harga                                                    : Rp 7.000");
                         System.out.println("Jumlah Pesanan                                   : "+jumlah);
                         System.out.println("Biaya Pesanan                                     : Rp " + harga.format(degan*jumlah));
                         total=total+degan*jumlah;
                         error = false;
                         break; 
  
                       default:
                        System.out.println("=================================================");
                        System.out.println("Pilihan Tidak tersedia");
                        error =true;
                        break;
            }            
           }  }
                            
            // Menggunakan for dapat menyimpan var yang telah diubah
                    System.out.println("=================================================");
                    System.out.print("Apakah anda Ingin memesan lainya?" + " [ ya : 1 / tidak : 2 ]> ");
                    i=sc.nextInt();
                    if (i == 1) {error = true;}  }  
                    
        
              System.out.println("=================================================");
              System.out.println("Total Biaya pesanan                               : Rp "+harga.format(total));
              System.out.println("=================================================");     
                // Percabangan kartu member
                     System.out.print("Apakah anda memiliki kartu member ? [ ya : 1 / tidak : 2 ]> ");
                     jawab=sc.nextInt();
                // Jika Ya lakukan perhitungan diskon
                     if( jawab == 1 ){ 
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
                        System.out.print("Apakah anda ingin mengulang pembayaran" + " [ ya : 1 / tidak : 2 ]> ");
                         jawab=sc.nextInt();
                        // Percabangan kekurangan uang jika ya akan terjadi perulangan dalam pembayaran
                        // Jika tidak, program akan melanjutkan
                          if( jawab == 1)   {
                              ulang = true;
                          }     
                          else if (jawab == 2) {
                          break ;
                          } } } }   
                     // Perulangan keseluruhan program
                         System.out.println("=================================================");
          System.out.println("Apakah anda ingin melakukan transaksi kembali?");
                System.out.print("Jawab [ ya : 1 / tidak : 2 ]> ");
                     jawab=sc.nextInt();
                if( jawab==1 ){ total = 0;
                    running = true; error = true;
                   
                                    System.out.println("");
                                     System.out.println("");
           }                
                    else if(jawab == 2){
                                    System.out.println("                           ---Terima Kasih---");
                                     System.out.println("=================================================");
                                     System.out.println("");
                                     System.out.println("");
                                    break;    
    }}}}
    
    

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

