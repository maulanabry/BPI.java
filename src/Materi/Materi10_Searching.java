
package Materi;
import java.util.Scanner;
public class Materi10_Searching {
    public static void main(String[] args) {
        
        
           Scanner sc = new Scanner(System.in);
        //array
        String makanan[]=new String[10];
        int harga[]=new int[10];
        
        //inisialisasi array
        makanan[0]="Sate Ayam    "; harga[0]=12000;
        makanan[1]="Sate Sapi    "; harga[1]=15000;
        makanan[2]="Sate Kambing "; harga[2]=20000;
        makanan[3]="Soto Madura  "; harga[3]=12000;
        makanan[4]="Soto Lamongan"; harga[4]=14000;
        makanan[5]="Gado-gado    "; harga[5]=10000;
        makanan[6]="Rawon        "; harga[6]=13000;
        makanan[7]="Bakso        "; harga[7]=8000;
        makanan[8]="Pecel        "; harga[8]=7000;
        makanan[9]="Penyetan     "; harga[9]=9000;
        int pilih=0;
        String belimakan[]=new String[5];
        int beliharga[]=new int[5];
        int jumlahbeli=0;
        
        System.out.println("Selamat datang di Warung Makan");
        do{
            System.out.println("\nMENU");
            System.out.println("1. Daftar Makanan");
            System.out.println("2. Cari Makanan");
            System.out.println("3. Selesai");
            System.out.print("Pilih = ");
            pilih=sc.nextInt();
            switch(pilih){
                case 1:
                    //urutkan berdasarkan nama pakai bubble sort
                    for (int i = 0; i < 10; i++) {
                        for (int j = 0; j < 9; j++) {
                            if(makanan[j].compareToIgnoreCase(makanan[j+1])>0){
                                String t=makanan[j];
                                makanan[j]=makanan[j+1];
                                makanan[j+1]=t;
                                int h=harga[j];
                                harga[j]=harga[j+1];
                                harga[j+1]=h;
                            }
                        }
                    }
                    System.out.println("\nDaftar Menu");
                    for (int i = 0; i < 10; i++) {
                        System.out.println(makanan[i]+" "+harga[i]);
                    }
                    break;
                case 2:
                    System.out.print("Cari = ");
                    String cari = sc.next();
                    String carimakan[]=new String[10];
                    int cariharga[]=new int[10];
                    
                    int idx=0;
                    for (int i = 0; i < makanan.length; i++) {
                        if(makanan[i].indexOf(cari)>=0){
                            carimakan[idx]=makanan[i];
                            cariharga[idx]=harga[i];
                            idx++;
                            System.out.println(idx+"."+makanan[i]+" "+harga[i]);
                        }
                    }
                    //transaksi
                    System.out.print("Pilih menu = ");
                    int pilih2 = sc.nextInt();
                    belimakan[jumlahbeli]=carimakan[pilih2-1];
                    beliharga[jumlahbeli]=cariharga[pilih2-1];
                    jumlahbeli++;
                    break;
                case 3:
                    System.out.println("\nTerima kasih");
                    break;
                
            }
            
        }while(pilih!=3);
        //cetak daftar beli
        System.out.println("\n=== Daftar Beli ===");
        for (int i = 0; i < jumlahbeli; i++) {
            System.out.println(belimakan[i]+"["+beliharga[i]+"]");   
        }
        System.out.println("Terima kasih atas kedatangan anda");
    }
   
}
