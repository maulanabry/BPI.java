package Materi;
import java.text.NumberFormat;
import java.util.Scanner;
public class ProjectAkhir {
    // Variabel Global
    static Scanner s = new Scanner(System.in);  
    // format rupiah
    static NumberFormat rupiah=NumberFormat.getInstance(); 
    static   int idx = 0, idx2=0;
    static   String menu[][] = new String[20][5]; 
    static   String tanggal[] = new String[20]; 
    static   int harga [][] = new int [20][5];  
    static   int jumlah [] = new int [20];  
    static   int belitotal [] = new int [20]; 
    static   int belijumlah [] = new int [20];  
    static   int beliharga[] = new int[20];
    static   int subtotal[] = new int[20];
    static   String belimakan[] = new String[20];
    static   int pilih = 0,i,j,pilih2,total,bayar,kmbl,user,banyak =14,jml,pilih3,tgl,grandtotal;
    static boolean found=false;
    // main method
    public static void main(String[] args) {
    rupiah.setMaximumFractionDigits(3);  
    
    // Inisialisasi array 
    
     menu[0][0]="Geprek Original\t"; harga[0][0]=10000;harga[0][1]=0;
     menu[1][0]="Geprek Keju\t"; harga[1][0]=15000;harga[1][1]=0;
     menu[2][0]="Geprek Telur Asin"; harga[2][0]=18000;harga[2][1]=0;
     menu[3][0]="Indomie Original"; harga[3][0]=5000;harga[3][1]=0;
     menu[4][0]="Indomie Spesial\t"; harga[4][0]=8000;harga[4][1]=0;  
     menu[5][0]="Es Teh\t\t"; harga[5][0]=3000;harga[5][1]=0;
     menu[6][0]="Es Jeruk\t"; harga[6][0]=4000;harga[6][1]=0;
     menu[7][0]="Kopi Panas\t"; harga[7][0]=2500;harga[7][1]=0;
     menu[8][0]="Susu Panas\t"; harga[8][0]=5000;harga[8][1]=0;
     menu[9][0]="Jeruk Panas\t"; harga[9][0]=4000;harga[9][1]=0;
     menu[10][0]="Roti Bakar\t"; harga[10][0]=6000;harga[10][1]=0;
     menu[11][0]="Jagung Bakar\t"; harga[11][0]=7000;harga[11][1]=0;
     menu[12][0]="Tahu Goreng\t"; harga[12][0]=5000;harga[12][1]=0;
     menu[13][0]="Donat Goreng\t"; harga[13][0]=8000;harga[13][1]=0;
     menu[14][0]="Singkong Goreng\t"; harga[14][0]=5500;harga[14][1]=0;   
     
    System.out.println("\t \tAPP WARUNG MBOIS         ");
    System.out.println("=================================================");
    // Set waktu
    time(tanggal, tgl);
    // Perulangan utama
    do {
        System.out.println("\t \t  Helo, User!");
        // Pilihan User
        // Kasir -> Transaksi
        // Admin -> Mengubah Menu
        // Owner -> Melihat history transaksi
        System.out.println("------------------------------------------------");
        System.out.println("1. Kasir\n2. Admin\n3. Owner\n4. Set tanggal\n5. Exit");
        System.out.println("------------------------------------------------");
        System.out.print("Pilih Nomor :");
        user = s.nextInt(); 
        System.out.println("------------------------------------------------");
            idx=0;
            switch (user){
               case 1 :
                // Pilihan Kasir
                   do {
                System.out.println("\t \t  Beranda Kasir");
                System.out.println("-------------------------------------------------");
                System.out.println("1. Daftar Menu");
                System.out.println("2. Pencarian");
                System.out.println("3. Melakukan Pemesanan");
                System.out.println("4. Daftar Transaksi");
                System.out.println("5. Pembayaran");
                System.out.println("6. Kembali");
                System.out.println("-------------------------------------------------"); 
                System.out.print("Pilih Nomor :");
                pilih = s.nextInt(); 
                System.out.println("-------------------------------------------------"); 
     if (pilih==1){
         // Daftar Menu
        daftar();
     }
     else if (pilih ==2){
         // Pencarian
        search();
        if (found == true){
                  pesan();
             }
     
     }
     else if (pilih==3){
         // Pemesanan
        daftar();
        pesan();
     }
     else if (pilih ==4){
         // Melihat daftar menu yang dipilih
        Transaksi();
     }
     else if (pilih==5){
         //Melakukan Transaksi/Pembayaran
     Transaksi();
     do 
          {
           // Input jumlah uang yang dibayarkan
             System.out.print("Masukkan uang yang dibayarkan \t\t\t\tRp. ");
             bayar=s.nextInt();
             kmbl=bayar-total;
           } while (kmbl <= -1 ); {
            // looping dibuat jika terjadi kesalahan/pembayaran tidak
                 System.out.println("Kembali\t\t\t\t\t\t\tRp. " +rupiah.format(kmbl));
                 System.out.println("-------------------------------------------------");
                 System.out.println("\t \t ---Terima Kasih---");
                 System.out.println("=================================================");
          }}
          else if (pilih ==6){
              // Kembali ke menu utama
     }
     else {
         System.out.println("Terjadi Kesalahan");
     }
                   }while (pilih!=6); break;  
            
               
     
                case 2 :
                    // Pilihan Admin
                    do{
                System.out.println("\t \t  Beranda Admin");
                System.out.println("-------------------------------------------------");
                System.out.println("1. Daftar Menu");
                System.out.println("2. Menambah Menu");
                System.out.println("3. Merubah Menu");
                System.out.println("4. Menghapus Menu");
                System.out.println("5. Kembali");
                System.out.println("-------------------------------------------------"); 
                System.out.print("Pilih Nomor :");
                pilih = s.nextInt(); 
                System.out.println("-------------------------------------------------"); 
     if (pilih==1){
         // Daftar Menu
        daftar();
        // Terdapat pemilihan jika ingin mengedit menu tampa pencarian
                System.out.println("\t \tPilihan Edit Menu");
                System.out.println("-------------------------------------------------"); 
                System.out.println("1. Menambah Menu");
                System.out.println("2. Merubah Menu");
                System.out.println("3. Menghapus Menu");
                System.out.println("4. Kembali");
                System.out.println("-------------------------------------------------");
                System.out.print("Pilih Nomor :");
                pilih3 = s.nextInt(); 
                System.out.println("-------------------------------------------------"); 
                switch (pilih3){
                    case 1 :
                        // Penambahan menu
                     add();
                        break;
                    case 2 :
                        // Mengubah Menu
                        change();
                        break;
                    case 3 :
                        // Menghapus Menu
                     delete();
                        break;
                    case 4 :
                        // kembali ke menu admin
                        break;
                    default:
                        System.out.println("Terjadi Kesalahan");
                        break;
                }
     }
     else if (pilih ==2){
         // Menambah Menu
        add();
     }
     else if (pilih==3){
         // Merubah Menu didahului Pencarian
        search();
       if (found == true){
                
              change();}
       
     }
     else if (pilih ==4){
         // Menghapus Menu didahului Pencarian
        search();
        if (found == true){
             delete();}
     }
     else if (pilih ==5){
         // Kembali ke Menu utama
     }
     else {
         System.out.println("Terjadi Kesalahan");
     }
     
     }   while (pilih!=5);
                    break;
                case 3 :
            do {
                // Menu Owner
                System.out.println("\t \t  Beranda Owner");
                System.out.println("-------------------------------------------------");
                System.out.println("1. History Transaksi");
                System.out.println("2. Sorting Menu Terlaris");
                System.out.println("3. Kembali");
                System.out.println("-------------------------------------------------"); 
                System.out.print("Pilih Nomor :");
                pilih = s.nextInt(); 
                System.out.println("-------------------------------------------------"); 
    if (pilih==1){
        // Melihat history transaksi
        historyall();
        System.out.println("-------------------------------------------------");
        historytransaksi();
     }
    else if (pilih==2){
        // Sorting Menu Terlaris
historytop(menu, harga, belijumlah);
        } else if (pilih==3) {
            // Kembali ke menu utama
        }
        else {
        System.out.println("Terjadi Kesalahan");
    }
            }while (pilih != 3); 
            break;
           case 4 :
               // Set Waktu
               time(tanggal, tgl);
                break;
           case 5 :
               break;
            
           default: 
           System.out.println("Terjadi Kesalahan");
            } 
    }      while (user!=5);
    }
    
    // Method 
    static void daftar () {
       System.out.println("\t \t Daftar Menu");
       System.out.println("-------------------------------------------------");
       System.out.println("No.     \tNama \t \t Harga"); 

       idx=0;
       for ( i = 0; i < banyak; i++) {
          if(menu[i][j]!= null){
            menu[idx][3] = menu[i][j];
            harga[idx][3] = harga[i][j];
            System.out.println((idx+1) + ". \t" + menu[idx][3]+" " + "\tRp. "+rupiah.format(harga[idx][3]));
            idx++;    
   
}
    }
      System.out.println("-------------------------------------------------");
} 
    static void search () {  
        
      System.out.println("\t \t Searching Menu");
      System.out.println("-------------------------------------------------");
      System.out.println("1. Berdasarkan Nama \n2. Berdasarkan Harga");       
      System.out.println("-------------------------------------------------");
      System.out.print("Pilih : ");
      pilih = s.nextInt();
      System.out.println("-------------------------------------------------");
  switch (pilih) {
      case 1 : 
              System.out.print("Yang dicari :");
              String search = s.nextLine();
              search = s.nextLine();
              
              System.out.println("-------------------------------------------------");
              System.out.println("\t \t Hasil Search");
              System.out.println("-------------------------------------------------");
              System.out.println("No.     \tNama \t \t Harga");
              System.out.println("-------------------------------------------------");
              mCari(menu, harga, search);
              break;
      case 2 : 
          idx=0;
                    System.out.println("\t \tMenu Range Harga"); //Bedasarkan Harga
                    System.out.println("-------------------------------------------------");
                    System.out.print("Mulai harga                    : ");
                      int searchfr = s.nextInt();
                      System.out.print("Hingga harga                   : ");              
                      int searchun = s.nextInt();    
                      System.out.println("------------------------------------------------"); // shorting for menu n harga (part 1)
                      System.out.println("No.     \tNama \t \t Harga");
                      System.out.println("-------------------------------------------------");
                       for ( i = 0; i < harga.length; i++) {
                          if (harga [i][j] >= searchfr) {
                            if (harga [i][j] <= searchun) {
                                     menu[idx][3] = menu[i][j];
                                     harga[idx][3] = harga[i][j];
                                     System.out.println((idx+1) + ". \t" +  menu[idx][3]+" " + "\tRp. "+rupiah.format( harga[idx][3])); 
                                     idx++;
                                     found = true;
                                } 
                            }
                          }
                    break;
                    default:
                    System.out.println("Terjadi Kesalahan");
                    
  }
}
    static String[][] mCari(String[][] menu, int harga[][], String search)  { 
    String[][] hasil = new String[10][2];  
                
                    for (i = 0; i < menu.length; i++) {
                        if(menu[i][j]!= null){
                            if (menu[i][j].contains(search) ) {
                                // Data yang disimpan pada [idx] [3]
                                menu[idx][3] = menu[i][j];
                                harga[idx][3] = harga[i][j];
                                //Output Hasil Pencarian
                                System.out.println((i+1) + ". \t" + menu[idx][3]+" " + "\tRp. "+rupiah.format(harga[idx][3]));
                                idx++; 
                             found = true;
                                        
                    }
    }
             } 
    return hasil; 
    }
        static void pesan() {
                    // Input Menu dan Jumlah
                    //Memasukkan data yang disaring pada array transaksi seperti belimakan dan beli harga
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Nomer Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t\t: ");
                    jml = s.nextInt();
                    tanggal [idx2]=tanggal[tgl];
                    jumlah [idx2] = jml;
                    belimakan [idx2] = menu[pilih2-1][3];
                    beliharga [idx2] = harga[pilih2-1][3];
                    belijumlah[pilih2-1] = harga[pilih2-1][1]+jml;
                    belitotal [pilih2-1]= harga[pilih2-1][0]*jumlah [idx2];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    grandtotal = total;
                    idx2++;
                    
                    System.out.println("-------------------------------------------------");
                    }
     static void Transaksi(){
        // Menunjukkan list transaksi yang disimpan pada array transaksi seperti belimakan dan beli harga
     System.out.println("\t \t Daftar Transaksi");
     System.out.println("-------------------------------------------------");
     System.out.print("No.   \t\tNama \t\t Harga \t    Jumlah \t Total\n");
        for ( i = 0; i < idx2; i++) {
          if(menu[i][j]!= null){
            System.out.println((i + 1) + ".\t" + belimakan [i]+ "\tRp. " + rupiah.format(beliharga [i])+ "\t" + jumlah[i]+"\tRp. "+rupiah.format(subtotal [i]));               
   }}
           System.out.println("\n\t\t\t\t\t\t\tRp. "+rupiah.format(total));
   }   
    static void add(){
        System.out.print("Masukkan nama menu\t\t\t: ");
        menu[banyak][0]=s.nextLine();
        menu[banyak][0]=s.nextLine();
        System.out.print("Masukkan Harga\t\t\t\t: ");
        harga [banyak][0]=s.nextInt();
        System.out.println("Penambahan Sukses..");
        banyak++;
        System.out.println("-------------------------------------------------");
        
    }
    static void change(){
        System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nomer Menu\t\t\t: ");
        pilih2 = s.nextInt();
        System.out.print("Masukkan Nama\t\t\t\t: ");
        menu[pilih2-1][0] = s.nextLine();
        menu[pilih2-1][0] = s.nextLine();
        System.out.print("Masukkan Harga\t\t\t\t: ");
        harga[pilih2-1][0] = s.nextInt();
        harga[pilih2-1][1] = 0;
        System.out.println("Perubahan Berhasil..");
        System.out.println("-------------------------------------------------");
    }
    static void delete(){
      System.out.println("-------------------------------------------------");
        System.out.print("Masukkan Nomer Menu\t\t\t: ");
        pilih2 = s.nextInt();
        menu[pilih2-1][0] = null;
        harga[pilih2-1][0] = 0;
        harga[pilih2-1][1] = 0;
        banyak=banyak -1;
        System.out.println("Penghapusan Berhasil..");
        System.out.println("-------------------------------------------------");  
    }
    static void historyall () {
        idx=0;
     System.out.println("\t \t Daftar Transaksi");
     System.out.println("-------------------------------------------------");
     System.out.print("No.   \t\tNama \t\t Harga \t    Jumlah \t Total\n");
             for ( i = 0; i < banyak; i++) {
                 if(menu[i][j]!= null){
            System.out.println((idx + 1) + ".\t" + menu [i][0]+ "\tRp. " + rupiah.format(harga [i][0])+ "\t" + belijumlah[i]+"\tRp. "+rupiah.format(belitotal[i]));
            idx++;
   }} System.out.println("\nTotal Pemasukan :\t\t\t\t\tRp. "+rupiah.format(grandtotal));   
    }
    static String[] historytop(String[][] menu2, int harga2[][], int belijumlah2[])  { 
            String[] top = new String[20]; 
           harga2 = harga;
           belijumlah2 = belijumlah;
           menu2 = menu;
                      for (int i = 0; i < banyak; i++) {
                            for (int j = 0; j < banyak; j++) {
                                if (belijumlah2[j] < belijumlah2[j+1]) {
                                    // mengurutkan jumlah
                                    int temp = belijumlah2[j];
                                    belijumlah2[j] = belijumlah2[j+1];
                                    belijumlah2[j+1] = temp;
                                    // mengurutkan menu
                                    String temp2 = menu2[j][0];
                                    menu2[j][0] = menu2[j+1][0];
                                    menu2[j+1][0] = temp2;
                                     int temp3 = harga2[j][0];
                                    harga2[j][0] = harga2[j+1][0];
                                    harga2[j+1][0] = temp3;
                                }
                            }
                        } idx=0;
            System.out.println("\t \t Sorting Menu Terlaris");
            System.out.println("-------------------------------------------------");
            System.out.println("No.     \tNama \t \t Harga \t \tJumlah Pembelian");
            for (i = 0; i < 6; i++) {
                if(menu[i][0]!= null){
                 System.out.println((idx+1) + ". \t" + menu[i][0]+" " + "\t Rp."+rupiah.format(harga[i][0])+"\t\t"+ belijumlah2[i]);
                 idx++;
            } 
         } System.out.println("-------------------------------------------------"); 
    
    return top;}
    
   static String[] time (String[] tanggal, int tgl) {
    System.out.print("Set Hari, Tanggal \t : ");
    tanggal[tgl] = s.nextLine();
    tanggal[tgl] = s.nextLine();
    tgl++;
    System.out.println("------------------------------------------------");
   return tanggal;}
   
     static void historytransaksi () {
     System.out.println("\t \t Daftar Transaksi");
     System.out.println("-------------------------------------------------");
     System.out.println("No.   \t\tNama \t\t Harga \t    Jumlah \t Total\t\tHari, tanggal");
        for ( i = 0; i < idx2; i++) {
            System.out.println((i + 1) + ".\t" + belimakan [i]+ "\tRp. " + rupiah.format(beliharga [i])+ "\t" + jumlah[i]+ "\tRp. "+rupiah.format(subtotal[i])+"\t"+tanggal[i]);               
   }              
   System.out.println("-------------------------------------------------");}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}