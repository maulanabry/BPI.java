
package TugasMandiri;
import java.text.NumberFormat;
import java.util.Scanner;
public class Pertemuan11_Tugas10_Searching {
    public static void main(String[] args) {
    NumberFormat rupiah=NumberFormat.getInstance();
    rupiah.setMaximumFractionDigits(3);
    Scanner s= new Scanner(System.in);
    // Array
      int idx = 0, idx2=0;
      String menu[][] = new String[20][5]; int harga [][] = new int [20][5];  
      int jumlah [] = new int [20];  
      int beliharga[] = new int[20];
      int subtotal[] = new int[20];
      String belimakan[] = new String[20];
        
    // Inisialisasi array makanan
     menu[0][1]="Geprek  Original"; harga[0][1]=10000;
     menu[1][1]="Geprek  Keju\t"; harga[1][1]=15000;
     menu[2][1]="Geprek  Telur Asin"; harga[2][1]=18000;
     menu[3][1]="Indomie Original"; harga[3][1]=5000;
     menu[4][1]="Indomie Spesial"; harga[4][1]=8000;
     // Inisialisasi array minuman   
     menu[0][2]="Es Teh\t\t"; harga[0][2]=3000;
     menu[1][2]="Es Jeruk\t"; harga[1][2]=4000;
     menu[2][2]="Kopi Panas\t"; harga[2][2]=2500;
     menu[3][2]="Susu Panas\t"; harga[3][2]=5000;
     menu[4][2]="Jeruk Panas\t"; harga[4][2]=4000;   
        
    int pilih = 0,meja,j = 1,i = 0,pilih2,total = 0,bayar,kmbl;
    System.out.println("\t \t WARUNG MBOIS         ");
    System.out.println("=================================================");
    System.out.print("Masukkan Nomer Meja Pesanan : " );
    meja  = s.nextInt();
//Perulangan utama 
 do { 
     idx=0;
      System.out.println("-------------------------------------------------");
      System.out.println("\t \t    Beranda");
      System.out.println("-------------------------------------------------");
      System.out.println("1. Daftar Menu");
      System.out.println("2. Sorting");
      System.out.println("3. Searching");
      System.out.println("4. Melakukan Pemesanan");
      System.out.println("5. Daftar Transaksi");
      System.out.println("6. Selesai");
          System.out.println("-------------------------------------------------");
          System.out.print("Pilih : ");
          pilih = s.nextInt();
          System.out.println("-------------------------------------------------");
       if (pilih ==1) {
           // Menunjukkan seluruh daftar menu
            System.out.println("\t \t Daftar Menu Makanan");
            System.out.println("-------------------------------------------------");
            System.out.println("No.     \tNama \t \t Harga");
            for ( i = 0; i < 5; i++) {
                if(menu[i]!= null){
                 System.out.println((i+1) + ". \t" + menu[i][1]+" " + "\tRp. "+rupiah.format(harga[i][1]));
            
       } 
            }  
            System.out.println("\n-------------------------------------------------");
            System.out.println("\t \t Daftar Menu Minuman");
            System.out.println("-------------------------------------------------");
            System.out.println("No.    \t\tNama \t \t Harga");
            for ( i = 0; i < 5; i++) {
                if(menu[i]!= null){
                 System.out.println((i+1) + ". \t" + menu[i][2]+" " + "\tRp. "+rupiah.format(harga[i][2]));
            
       } 
            }       // Input untuk memilih makanan/minuman, dengan mengganti var j
                    System.out.println("-------------------------------------------------");
                    System.out.println("1. Makanan ");
                    System.out.println("2. Minuman ");
                     // Input Menu dan Jumlah
                    System.out.println("-------------------------------------------------");
                    System.out.print("Pilih Menu :");
                    j = s.nextInt();
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t: ");
                    jumlah[idx2] = s.nextInt(); 
                    //Memasukkan data yang diinput pada variabel transaksi
                    belimakan [idx2] = menu[pilih2-1][j];
                    beliharga [idx2] = harga[pilih2-1][j];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    idx2++;
       }
         // Sorting menggunakan algoritma selection sort
       else if  (pilih ==2){
           // Sorting Harga, tidak dibuatkan transaksi 
            String menu2[][] = new String[20][3];
            menu2 = menu;
            int harga2[][] = new int[20][3];
            harga2 = harga;
              System.out.println("\t \t Sorting Menu");
              System.out.println("-------------------------------------------------");
              System.out.println("1. Termahal - Descending \n2. Termurah - Ascending");       
              System.out.println("-------------------------------------------------");
              System.out.print("Pilih : ");
              pilih = s.nextInt();
              System.out.println("-------------------------------------------------");
                switch (pilih) {
                    case 1 :
                     System.out.println("\t \t Termahal - Descending");
                     System.out.println("-------------------------------------------------");
                     for (i = 0; i < 5; i++){
                        for( j = i+1; j < 5; j++){
                            if(harga2[i][1]<harga2[j][1]){
                                int temp=harga2[j][1];
                                harga2[j][1]=harga2[i][1];
                                harga2[i][1]=temp;
                                String a = menu2[j][1];
                                menu2[j][1] = menu2[i][1];
                                menu2[i][1] = a;
                                
                    } 
                        } 
                           } 
                     for (i = 0; i < 5; i++){
                        for( j = i+1; j < 5 ; j++){
                            if(harga2[i][2]<harga2[j][2]){
                                int temp=harga2[j][2];
                                harga2[j][2]=harga2[i][2];
                                harga2[i][2]=temp;
                                String a = menu2[j][2];
                                menu2[j][2] = menu2[i][2];
                                menu2[i][2] = a;
                    } 
                        } 
                            } 
                     break;  
                    case 2 :
                     System.out.println("\t \t Termurah - Ascending");
                     System.out.println("-------------------------------------------------");
                     for ( i = 0; i < 5; i++){
                        for( j = i+1; j < 5; j++){
                            if(harga2[i][1]>harga2[j][1]){
                                int temp=harga2[j][1];
                                harga2[j][1]=harga2[i][1];
                                harga2[i][1]=temp;
                                String a = menu2[j][1];
                                menu2[j][1] = menu2[i][1];
                                menu2[i][1] = a;
                                
                    } 
                        } 
                            } 
                     for (i = 0; i < 5; i++){
                        for( j = i+1; j < 5 ; j++){
                            if(harga2[i][2]>harga2[j][2]){
                                int temp=harga2[j][2];
                                harga2[j][2]=harga2[i][2];
                                harga2[i][2]=temp;
                                String a = menu2[j][2];
                                menu2[j][2] = menu2[i][2];
                                menu2[i][2] = a;
                    } 
                        } 
                            } break;
                    default :
                        System.out.println("Terjadi Kesalahan");
                            break;
                        }
            System.out.println("\t \t Daftar Menu Makanan");
            System.out.println("-------------------------------------------------");
            System.out.println("No.     \tNama \t \t Harga");
            for (i = 0; i < 5; i++) {
                if(menu[i]!= null){
                 System.out.println((i+1) + ". \t" + menu2[i][1]+" " + "\tRp. "+rupiah.format(harga2[i][1]));
            
            } 
         }  
            System.out.println("\n-------------------------------------------------");
            System.out.println("\t \t Daftar Menu Minuman");
            System.out.println("-------------------------------------------------");
            System.out.println("No.     \tNama \t \t Harga");
            for ( i = 0; i < 5; i++) {
                if(menu[i]!= null){
                 System.out.println((i+1) + ". \t" + menu2[i][2]+" " + "\tRp. "+rupiah.format(harga2[i][2]));
            
                } 
            } 
       }
         else if (pilih == 3){
             // Pilihan Searching
              System.out.println("\t \t Searching Menu");
              System.out.println("-------------------------------------------------");
              System.out.println("1. Berdasarkan Nama \n2. Berdasarkan Harga");       
              System.out.println("-------------------------------------------------");
              System.out.print("Pilih : ");
              pilih = s.nextInt();
              System.out.println("-------------------------------------------------");
              switch (pilih){
                  case 1 :
              System.out.print("Yang dicari :");
              String search = s.next ();
              System.out.println("-------------------------------------------------");
              System.out.println("\t \t Hasil Search");
              System.out.println("-------------------------------------------------");

             System.out.println("No.     \tNama \t \t Harga");
             idx=0;
             for ( j = 1; j < 3;j++){
                    for (i = 0; i < menu.length; i++) {
                        if(menu[i][j]!= null){
                            if (menu[i][j].indexOf(search) >= 0) {
                                // Data yang disimpan pada [idx] [3]
                                menu[idx][3] = menu[i][j];
                                harga[idx][3] = harga[i][j];
                                //Output Hasil Pencarian
                                System.out.println((idx+1) + ". \t" + menu[idx][3]+" " + "\tRp. "+rupiah.format(harga[idx][3]));
                                idx++;         
                        }
                    }
                 }
             }
                    // Input Menu dan Jumlah
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t: ");
                    jumlah[idx2] = s.nextInt(); 
                    //Memasukkan data yang disaring pada array transaksi seperti belimakan dan beli harga
                    belimakan [idx2] = menu[pilih2-1][3];
                    beliharga [idx2] = harga[pilih2-1][3];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    idx2++;
                    
             break;
                  case 2 :
            System.out.println("\t \tMenu Range Harga"); //Bedasarkan Harga
            System.out.println("-------------------------------------------------");
                            System.out.print("Mulai harga                    : ");
                            int searchfr = s.nextInt();
                            System.out.print("Hingga harga                   : ");              
                            int searchun = s.nextInt();    
                            System.out.println("------------------------------------------------"); // shorting for menu n harga (part 1)
                             System.out.println("No.     \tNama \t \t Harga");
                            for ( j = 1; j < 3;j++){
                             for ( i = 0; i < harga.length; i++) {
                                if (harga [i][j] >= searchfr) {
                                    if (harga [i][j] <= searchun) {
                                     menu[idx][3] = menu[i][j];
                                     harga[idx][3] = harga[i][j];
                                     System.out.println((i+1) + ". \t" +  menu[idx][3]+" " + "\tRp. "+rupiah.format( harga[idx][3])); 
                                     idx++;
                                    } 
                                } 
                            }
                          }
                      // Input Menu dan Jumlah
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t: ");
                    jumlah[idx2] = s.nextInt(); 
                   //Memasukkan data yang disaring pada array transaksi seperti belimakan dan beli harga
                    belimakan [idx2] = menu[pilih2-1][3];
                    beliharga [idx2] = harga[pilih2-1][3];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    idx2++;
                          
               break;
                  default :
                      System.out.println("Terjadi Kesalahan");}}
         
         else if (pilih == 4){
            System.out.println("\t \t Daftar Menu");
            System.out.println("-------------------------------------------------");
             System.out.println("No.     \tNama \t \t Harga");
                idx=0;
                for ( j = 1; j < 3;j++){
                    for (i = 0; i < menu.length; i++) {
                        if(menu[i][j]!= null){
                                menu[idx][3] = menu[i][j];
                                harga[idx][3] = harga[i][j];
                                System.out.println((idx+1) + ". \t" + menu[idx][3]+" " + "\tRp. "+rupiah.format(harga[idx][3]));
                                idx++;         
                        }
                    }
                }
              // Input Menu dan Jumlah
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t: ");
                    jumlah[idx2] = s.nextInt(); 
                  //Memasukkan data yang disaring pada array transaksi seperti belimakan dan beli harga
                    belimakan [idx2] = menu[pilih2-1][3];
                    beliharga [idx2] = harga[pilih2-1][3];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    idx2++;
       
   } else if (pilih==5){
       // Menunjukkan list transaksi yang disimpan pada array transaksi seperti belimakan dan beli harga
     System.out.println("\t \t Daftar Transaksi");
     System.out.println("-------------------------------------------------");
     System.out.print("No.   \t\tNama \t\t Harga \t    Jumlah \t Total\n");
        for ( i = 0; i < idx2; i++) {
          if (menu[i][j]!= null) {
            System.out.println((i + 1) + ".\t" + belimakan [i]+ "\tRp. " + rupiah.format(beliharga [i])+ "\t" + jumlah[i]+"\tRp. "+rupiah.format(subtotal [i]));               
   }
   }        System.out.println("\n\t\t\t\t\t\t\tRp. "+rupiah.format(total));
   }
   else if (pilih==6) { // Kosong dibuat agar tidak mengaktifkan else

   } else 
   {
       System.out.println("Terjadi Kesalahan");
   }
   } 
     while (pilih != 6); 
        // Daftar Transaksi dan Pembayaran
        System.out.println("\t \t Daftar Transaksi");
        System.out.println("-------------------------------------------------");
        System.out.print("No.   \t\tNama \t\t Harga \t    Jumlah \t Total\n");
        for ( i = 0; i < idx2; i++) {
          if (menu[i][j]!= null) {
            System.out.println((i + 1) + ".\t" + belimakan [i]+ "\tRp. " + rupiah.format(beliharga [i])+ "\t" + jumlah[i]+"\tRp. "+rupiah.format(subtotal [i]));               
   }
   }       System.out.println("\n\t\t\t\t\t\t\tRp. "+rupiah.format(total));
            System.out.println("-------------------------------------------------");
        do 
          {
           // Input jumlah uang yang dibayarkan
             System.out.print("Masukkan uang yang dibayarkan \t\t\t\tRp. ");
             bayar=s.nextInt();
             kmbl=bayar-total;
           } while (kmbl <= -1 ); {
            // looping dibuat jika terjadi kesalahan
                 System.out.println("Kembali\t\t\t\t\t\t\tRp. " +rupiah.format(kmbl));
                 System.out.println("-------------------------------------------------");
                 System.out.println("\t \t ---Terima Kasih---");
                 System.out.println("=================================================");
          }
    }
}
        
        
        
        
        
        
        
        
    

