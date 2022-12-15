
package TugasMandiri;
import java.util.Scanner;
public class Test3 
{     //variabel global
    static int harga[] = new int[5];
  
    
    
    static int transaksi(int harga_satuan, int jumlah)//header //transaksi
    {
        //body
        int total = 0;
        total = harga_satuan * jumlah;
        
        return harga_satuan;
        
        
    }
    
    static String[] sort(String[] menu){
        String hasil[] = new String[10];
        
        for (int i = 0; i < menu.length; i++) {
            for (int j = 0; j < menu.length-1; j++) {
                if (menu[j].compareToIgnoreCase(menu[j+1]) > 0) {
                    String t = menu[j];
                    menu[j] = menu[j+1];
                    menu[j+1] = t;
                    int h = harga[j];
                    harga[j] = harga[j+1];
                    harga[j+1] = h;
                }
            }
        }
        return menu;
    }
    
    static String[][] search(String[] menu, String cari, int harga[]){
        String[][] hasil = new String[5][2];
        int idx = 0;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].indexOf(cari) >= 0) {
                hasil[idx][0] = menu[i];
                hasil[idx][1] = String.valueOf(harga[i]);
                idx++;
            }
        }
        return hasil;
    }
    
    static String[][] transaksi(String[] menu, int harga[]){
        String[][] pembayaran = new String[5][2];
        int idx = 0;
        return pembayaran;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int h = hitung_harga(1000,5);
//        System.out.println("Harga : " + h); // menampilkan cara 1
//        System.out.println("Harga :" + hitung_harga(1000,5)); // menampilkan cara 2
        String makanan[] = new String[5];
        String minuman[] = new String[5];
        String snack[]   = new String[4];
        String carimakanan[] = new String[5];
        String belimakan[] = new String[5];
        int cariharga[] = new int[5];
//        int harga[] = new int[10];
        int beliharga[] =  new int[5];
        int pilih = 0,
            jumlah = 0,
            jumlahbeli = 0,
            pilih2 = 0,
            total = 0,
            finaltotal = 0,
            bayar = 0,
            kembalian = 0;  
        
//inisialisasi array Makanan
        makanan [0] = "BURGER_KOMPLIT       ";            harga [0] = 35000;
        makanan [1] = "BURGER_SEDERHANA     ";            harga [1] = 15000;
        makanan [2] = "BURGER_EKONOMI       ";            harga [2] = 45000;
        makanan [3] = "BREAD_PIZZA KOMPLIT  ";            harga [3] = 20000;
        makanan [4] = "BREAD_HOTDOG EKONOMI ";            harga [4] = 18000;
//inisialisasi array Minuman
        minuman [0] = "BASIC_MINERAL        ";            harga [0] = 35000;
        minuman [1] = "BASIC_TEA            ";            harga [1] = 15000;
        minuman [2] = "BASIC_LEMON          ";            harga [2] = 45000;
        minuman [3] = "SODA_FANTA           ";            harga [3] = 20000;
        minuman [4] = "SODA_SPRITE          ";            harga [4] = 18000;
//inisialisasi array Minuman
        snack [0] = "BASIC_KENTANG        ";              harga [0] = 35000;
        snack [1] = "BASIC_ROTI           ";              harga [1] = 15000;
        snack [2] = "BASIC_SALAD          ";              harga [2] = 45000;
        snack [3] = "BASIC_JAMUR KRISPI   ";              harga [3] = 20000;
         
        do {
            System.out.println("\nMENU");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            System.out.println("3. Snack");
            System.out.println("4. Transaksi");
            
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            System.out.println("==========================");   
            switch(pilih){
                case 1 :
                    System.out.println("1. DAFTAR MAKANAN");
                    System.out.println("2. CARI MAKANAN DARI HARGA");
                    System.out.println("3. CARI MAKANAN DARI NAMA");
                    
                    System.out.print("pilih : ");
                    pilih2 = sc.nextInt();
                    
                    switch(pilih2){
                        case 1:
                            String[] urut = sort(makanan);
                            System.out.println("==========================");   
                            System.out.println("DAFTAR MENU");
                            for (int i = 0; i < urut.length; i++) {
                                System.out.println((i+1)+"."+urut[i]);
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Cari Menu Berdasarkan Range Harga"); //Bedasarkan Harga            
                            System.out.print("Dari harga                    : ");
                            int hargabawah = sc.nextInt();
                            System.out.print("Sampai harga                  : ");
                            int hargaatas = sc.nextInt();   
                            
                            System.out.println("------------------------------------------------"); // shorting for menu n harga (part 1)
                            for (int i = 0; i < harga.length; i++) {
                                if (harga [i] >= hargabawah) {
                                    if (harga [i] <= hargaatas) {
                                        System.out.println((i+1)+"."+makanan[i] + "\t" + harga[i]);
                                    } 
                                } 
                            }
                             
                             System.out.println("===================================");
                            break;
                        
                           case 3:
                            System.out.print("Cari Nama : ");   // bedasarkan nama
                            String cari = sc.next();
                            String hasil_cari[][] = search(makanan,cari,harga);
                               System.out.println("==========================");
                               System.out.println("DAFTAR URUTAN");
                               for (int i = 0; i < hasil_cari.length; i++) {
                                   if (hasil_cari[i][0] != null && hasil_cari[i][1] != null) {
                                       System.out.print((1+i)+"." +hasil_cari[i][0]);
                                       System.out.println(Integer.parseInt(hasil_cari[i][1]));
                                   }                                
                               }
                            System.out.print("Pilih Menu : ");
                            pilih2 = sc.nextInt();
                            belimakan[jumlahbeli] = carimakanan[pilih2 - 1];
                            beliharga[jumlahbeli] = cariharga[pilih2 - 1];
                            jumlahbeli++;
                            
                            System.out.print("Jumlah Beli : ");
                            jumlah = sc.nextInt();
                           
                                    
                            break;
                    }
                    break;
                
                case 2:
                    System.out.println("1. DAFTAR MINUMAN");
                    System.out.println("2. CARI BEDASARKAN HARGA");
                    System.out.println("3. CARI BEDASARKAN NAMA");
                    
                    System.out.print("pilih : ");
                    pilih2 = sc.nextInt();
                    
                    switch(pilih2){
                        case 1:
                            String[] urut = sort(minuman);
                            System.out.println("==========================");   
                            System.out.println("DAFTAR MENU");
                            for (int i = 0; i < urut.length; i++) {
                                System.out.println((i+1)+"."+urut[i]);
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Cari Menu Berdasarkan Range Harga"); //Bedasarkan Harga            
                            System.out.print("Dari harga                    : ");
                            int hargabawah = sc.nextInt();
                            System.out.print("Sampai harga                  : ");
                            int hargaatas = sc.nextInt();   
                            
                            System.out.println("------------------------------------------------"); // shorting for menu n harga (part 1)
                            for (int i = 0; i < harga.length; i++) {
                                if (harga [i] >= hargabawah) {
                                    if (harga [i] <= hargaatas) {
                                        System.out.println((i+1)+"."+minuman[i] + "\t" + harga[i]);
                                    } 
                                } 
                            }
                             
                             System.out.println("===================================");
                            break;
                        case 3:
                            System.out.print("Cari Nama : ");   // bedasarkan nama
                            String cari = sc.next();
                            String hasil_cari[][] = search(minuman,cari,harga);
                               System.out.println("==========================");
                               System.out.println("DAFTAR URUTAN");
                               for (int i = 0; i < hasil_cari.length; i++) {
                                   if (hasil_cari[i][0] != null && hasil_cari[i][1] != null) {
                                       System.out.print((1+i)+"." +hasil_cari[i][0]);
                                       System.out.println(Integer.parseInt(hasil_cari[i][1]));
                                   }                                
                               }
                            System.out.print("Pilih Menu : ");
                            pilih2 = sc.nextInt();
                            belimakan[jumlahbeli] = carimakanan[pilih2 - 1];
                            beliharga[jumlahbeli] = cariharga[pilih2 - 1];
                            jumlahbeli++;
                            
                            System.out.print("Jumlah Beli : ");
                            jumlah = sc.nextInt();
                            break;
                    }

                    break;
                case 3:
                    System.out.println("1. DAFTAR SNACK");
                    System.out.println("2. CARI SNACK");
                    
                    System.out.print("pilih : ");
                    pilih2 = sc.nextInt();
                    
                    switch(pilih2){
                        case 1:
                            String[] urut = sort(snack);
                            System.out.println("==========================");   
                            System.out.println("DAFTAR MENU");
                            for (int i = 0; i < urut.length; i++) {
                                System.out.println((i+1)+"."+urut[i]);
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Cari Menu Berdasarkan Range Harga"); //Bedasarkan Harga            
                            System.out.print("Dari harga                    : ");
                            int hargabawah = sc.nextInt();
                            System.out.print("Sampai harga                  : ");
                            int hargaatas = sc.nextInt();   
                            
                            System.out.println("------------------------------------------------"); // shorting for menu n harga (part 1)
                            for (int i = 0; i < harga.length; i++) {
                                if (harga [i] >= hargabawah) {
                                    if (harga [i] <= hargaatas) {
                                        System.out.println((i+1)+"."+snack[i] + "\t" + harga[i]);
                                    } 
                                } 
                            }
                             
                             System.out.println("===================================");
                            break;
                        case 3:
                            System.out.print("Cari Nama : ");   // bedasarkan nama
                            String cari = sc.next();
                            String hasil_cari[][] = search(snack,cari,harga);
                               System.out.println("==========================");
                               System.out.println("DAFTAR URUTAN");
                               for (int i = 0; i < hasil_cari.length; i++) {
                                   if (hasil_cari[i][0] != null && hasil_cari[i][1] != null) {
                                       System.out.print((1+i)+"." +hasil_cari[i][0]);
                                       System.out.println(Integer.parseInt(hasil_cari[i][1]));
                                   }                                
                               }
                            System.out.print("Pilih Menu : ");
                            pilih2 = sc.nextInt();
                            belimakan[jumlahbeli] = carimakanan[pilih2 - 1];
                            beliharga[jumlahbeli] = cariharga[pilih2 - 1];
                            jumlahbeli++;
                            
                            System.out.print("Jumlah Beli : ");
                            jumlah = sc.nextInt();
                            break;
                    }
                case 4:  
            }
        } while (pilih != 4);
        //cetak daftar beli
        System.out.println("DAFTAR BELANJA ANDA");
        
        for (int i = 0; i < jumlahbeli; i++) {
            total = harga[i] * jumlah;
            finaltotal = finaltotal + total;
//            belimakan[jumlahbeli] = carimakanan[pilih2 - 1];
//            beliharga[jumlahbeli] = cariharga[pilih2 - 1];
            System.out.println(makanan[i]+"\t : "+"(Rp."+harga[i]+")"+"\t"+jumlah+"x"+"\t = "+total);
            
        }
         System.out.print("Grand Total : ");
            for (int i = 0; i < jumlahbeli; i++) {
                System.out.print(finaltotal);
            
                System.out.print("\n===================================");
                
            System.out.print("\nPembayaran :");
            bayar = sc.nextInt();
     
                for (int j = 0; j < finaltotal; j++) {
                    if (bayar < finaltotal){
                    System.out.print("Uang Anda Kurang :");
                    bayar = sc.nextInt();
                }
            }
        }
          
                kembalian = bayar - finaltotal ;
                System.out.println("Kembalian : Rp." + kembalian);
                
                if (kembalian < bayar) {
                    System.out.println("==========================");
                    System.out.println("SELAMAT DATANG KEMBALI");
                    System.out.println("==========================");
                }
    }
     
    
}

        
            
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

