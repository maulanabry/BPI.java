/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasMandiri;
import java.util.Scanner;
import java.text.NumberFormat;
public class Method_Gagal {
        Scanner s = new Scanner(System.in);  
    NumberFormat rupiah=NumberFormat.getInstance(); 
    static   int idx = 0, idx2=0;
    static   String menu[][] = new String[20][5]; 
    static   int harga [][] = new int [20][5];  
    static   int jumlah [] = new int [20];  
    static   int beliharga[] = new int[20];
    static   int subtotal[] = new int[20];
    static   String belimakan[] = new String[20];
    static   int pilih = 0,i,j;
    public static void main(String[] args) {
       
      // Inisialisasi array makanan
     menu[0][0]="Geprek  Original"; harga[0][0]=10000;
     menu[1][0]="Geprek  Keju\t"; harga[1][0]=15000;
     menu[2][0]="Geprek  Telur Asin"; harga[2][0]=18000;
     menu[3][0]="Indomie Original"; harga[3][0]=5000;
     menu[4][0]="Indomie Spesial"; harga[4][0]=8000;
     // Inisialisasi array minuman   
     menu[0][1]="Es Teh\t\t"; harga[0][1]=3000;
     menu[1][1]="Es Jeruk\t"; harga[1][1]=4000;
     menu[2][1]="Kopi Panas\t"; harga[2][1]=2500;
     menu[3][1]="Susu Panas\t"; harga[3][1]=5000;
     menu[4][1]="Jeruk Panas\t"; harga[4][1]=4000;
     // Inisialisasi array snack 
     menu[0][2]="Roti Bakar\t"; harga[0][2]=6000;
     menu[1][2]="Jagung Bakar\t"; harga[1][2]=7000;
     menu[2][2]="Tahu Goreng\t"; harga[2][2]=5000;
     menu[3][2]="Donat Goreng\t"; harga[3][2]=8000;
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
        call.beranda();
        System.out.print("Pilih : ");
        pilih = s.nextInt();
        System.out.println("-------------------------------------------------"); 
     if (pilih==1){
        call.daftar();
     }
     else if (pilih ==2){
        call.search();
     }
     
     
     
     }while (pilih!=10); {
        
    }
    }
    void beranda (){
    System.out.println("-------------------------------------------------");
      System.out.println("\t \t    Beranda");
      System.out.println("-------------------------------------------------");
      System.out.println("1. Daftar Menu");
      System.out.println("2. Searching");
      System.out.println("4. Melakukan Pemesanan");
      System.out.println("5. Daftar Transaksi");
      System.out.println("6. Selesai");
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
            System.out.println((i+1) + ". \t" + menu[i][j]+" " + "\tRp. "+rupiah.format(harga[i][j]));    
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
             
  }
}
   
   
   
   
   
   
}


