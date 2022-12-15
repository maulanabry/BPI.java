
package TugasMandiri;
import java.util.Scanner;
import java.text.NumberFormat;
class Pertemuan12_Tugas11_Method {
    Scanner s = new Scanner(System.in);  
    NumberFormat rupiah=NumberFormat.getInstance(); 
    static   int idx = 0, idx2=0;
    static   String menu[][] = new String[20][5]; 
    static   int harga [][] = new int [20][5];  
    static   int jumlah [] = new int [20];  
    static   int beliharga[] = new int[20];
    static   int subtotal[] = new int[20];
    static   String belimakan[] = new String[20];
    static   int pilih = 0,i,j,pilih2,total,bayar,kmbl;
    public static void main(String[] args) {
       
      // Inisialisasi array makanan
     menu[0][0]="Geprek  Original"; harga[0][0]=10000;
     menu[1][0]="Geprek  Keju"; harga[1][0]=15000;
     menu[2][0]="Geprek  Telur Asin"; harga[2][0]=18000;
     menu[3][0]="Indomie Original"; harga[3][0]=5000;
     menu[4][0]="Indomie Spesial"; harga[4][0]=8000;
     // Inisialisasi array minuman   
     menu[0][1]="Es Teh"; harga[0][1]=3000;
     menu[1][1]="Es Jeruk"; harga[1][1]=4000;
     menu[2][1]="Kopi Panas"; harga[2][1]=2500;
     menu[3][1]="Susu Panas"; harga[3][1]=5000;
     menu[4][1]="Jeruk Panas"; harga[4][1]=4000;
     // Inisialisasi array snack 
     menu[0][2]="Roti Bakar"; harga[0][2]=6000;
     menu[1][2]="Jagung Bakar"; harga[1][2]=7000;
     menu[2][2]="Tahu Goreng"; harga[2][2]=5000;
     menu[3][2]="Donat Goreng"; harga[3][2]=8000;
     menu[4][2]="Singkong Goreng"; harga[4][2]=5500;   
     
     Scanner s = new Scanner(System.in);  
     NumberFormat rupiah=NumberFormat.getInstance();   
     rupiah.setMaximumFractionDigits(3);
     Pertemuan12_Tugas11_Method call = new Pertemuan12_Tugas11_Method ();
    
    int meja; 
    
    System.out.println("\t \t WARUNG MBOIS         ");
    System.out.println("=================================================");
    System.out.print("Masukkan Nomer Meja Pesanan : " );
    meja  = s.nextInt();
     do {
        idx=0;
        call.beranda();
        System.out.print("Pilih : ");
        pilih = s.nextInt();
     System.out.println("-------------------------------------------------"); 
     if (pilih==1){
        call.coba();
     }
     else if (pilih ==2){
        call.search();
     }
     else if (pilih==3){
        call.daftar();
        call.pesan();
     }
     else if (pilih ==4){
        call.Transaksi();
     }
     else if (pilih==5){
     }
     else {
         System.out.println("Terjadi Kesalahan");
     }
     }while (pilih!=5); {
     call.Transaksi();
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
    void beranda (){
      System.out.println("-------------------------------------------------");
      System.out.println("\t \t    Beranda");
      System.out.println("-------------------------------------------------");
      System.out.println("1. Daftar Menu");
      System.out.println("2. Searching");
      System.out.println("3. Melakukan Pemesanan");
      System.out.println("4. Daftar Transaksi");
      System.out.println("5. Selesai");
      System.out.println("-------------------------------------------------"); 
    }
   void daftar () {
       System.out.println("\t \t Daftar Menu");
    for ( j = 0; j < 3;j++){
       System.out.println("-------------------------------------------------");
        if (j==0){
       System.out.println("\t \t   Makanan");
       System.out.println("-------------------------------------------------");    
       System.out.println("No.     \tNama \t \t Harga"); 
        }
        else if (j==1){
       System.out.println("\t \t   Minuman");
       System.out.println("-------------------------------------------------");    
       System.out.println("No.     \tNama \t \t Harga"); 
        }
        else if (j==2){
       System.out.println("\t \t   Snack");
       System.out.println("-------------------------------------------------");    
       System.out.println("No.     \tNama \t \t Harga"); 
        }
       for ( i = 0; i < 5; i++) {
          if(menu[i]!= null){
            menu[idx][3] = menu[i][j];
            harga[idx][3] = harga[i][j];
            System.out.println((idx+1) + ". \t" + menu[idx][3]+" " + "\tRp. "+rupiah.format(harga[idx][3]));
            idx++;    
             
   }
}
    }
} void search () {      
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
              String search = s.next ();
              System.out.println("-------------------------------------------------");
              System.out.println("\t \t Hasil Search");
              System.out.println("-------------------------------------------------");
              System.out.println("No.     \tNama \t \t Harga");
             idx=0;
             for ( j = 0; j < 3;j++){
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
                    pesan();
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
                                     System.out.println((idx+1) + ". \t" +  menu[idx][3]+" " + "\tRp. "+rupiah.format( harga[idx][3])); 
                                     idx++;
                                    } 
                                } 
                            }
                          }
                    pesan();
                    break;
                    default:
                    System.out.println("Terjadi Kesalahan");
  }
}
        void pesan() {
                    // Input Menu dan Jumlah
                    //Memasukkan data yang disaring pada array transaksi seperti belimakan dan beli harga
                    System.out.println("-------------------------------------------------");
                    System.out.print("Masukkan Nomer Menu\t\t\t: ");
                    pilih2 = s.nextInt();
                    System.out.print("Masukkan Jumlah Pesanan\t\t: ");
                    jumlah[idx2] = s.nextInt();   
                    belimakan [idx2] = menu[pilih2-1][3];
                    beliharga [idx2] = harga[pilih2-1][3];
                    subtotal[idx2] = beliharga [idx2]*jumlah[idx2];
                    total = total+subtotal[idx2];  
                    idx2++;
                    }
       void Transaksi(){
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
    void coba(){

System.out.println("No.     \tNama \t \t Harga");
 for ( j = 0; j < 3;j++){
for (int i = 0; i < 5; i++) {
    menu[idx][3] = menu[i][j];
    harga[idx][3] = harga[i][j];
    System.out.format((idx+1)+". "+menu[idx][3]  + "\t\t\tRp. "+rupiah.format(harga[idx][3])+"\n"); 
    idx++;
}
 }
    
}
}
