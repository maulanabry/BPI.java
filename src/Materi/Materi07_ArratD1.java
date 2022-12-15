
package Materi;
import java.util.Scanner;
public class Materi07_ArratD1 {
public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String makanan[];
        makanan = new String[5];
        int harga[] = new int[5];
        int indeks=0; //index array
        int pilih=0;
        int total=0;
        do{
            System.out.println("DAFTAR MENU");
            System.out.println("1. Sate     [15.000]");
            System.out.println("2. Soto     [10.000]");
            System.out.println("3. Rawon    [12.000]");
            System.out.println("4. Pecel    [ 8.000]");
            System.out.println("5. Bakso    [10.000]");
            System.out.println("6. Selesai");
            System.out.print("Pilih = ");
            pilih=s.nextInt();
            switch(pilih){
                case 1:
                    makanan[indeks]="Sate ";
                    harga[indeks]=15000;
                    total=total+15000;
                    break;
                case 2:
                    makanan[indeks]="Soto ";
                    harga[indeks]=10000;
                    total=total+10000;
                    break;
                case 3:
                    makanan[indeks]="Rawon";
                    harga[indeks]=12000;
                    total=total+12000;
                    break;
                case 4:
                    makanan[indeks]="Pecel";
                    harga[indeks]=8000;
                    total=total+8000;
                    break;
                case 5:
                    makanan[indeks]="Bakso";
                    harga[indeks]=10000;
                    total=total+10000;
                    break;
            }
            indeks++;
        }while(pilih!=6);
        //menampilkan makanan yang dibeli
        System.out.println("-----------------------------");
        System.out.println("DAFTAR BELANJA");
        for (int i = 0; i < indeks-1; i++) {
            System.out.println((i+1)+". "+makanan[i]+"\t Rp. "+harga[i]);
        }
        System.out.println("TOTAL BELANJA :  Rp. "+total);
    }
}   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

