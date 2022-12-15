
package TugasMandiri;
import java.util.Scanner;
class Kondisi {
    int Pilihan[][] = new int[20][20];
    int Pesan [][] = new int [20][20];
    int Total_Harga [][] = new int [20][20];
    int qty[][] = new int[20][20];
    int qt[] = new int[20];
    
    String daftar [] = {"Siomay","Batagor ","Krawu","Seblak","Kebuli"};
    int Harga [] = {8000,8000,15000,10000,18000};
    int  i=0, indeks=0, Total_Biaya, Total = 0;
    Scanner p = new Scanner (System.in);

    void menu () {
        System.out.println("\n===== SELAMAT DATANG DI WARUNG SIRU =====");
        System.out.println ("===== DAFTAR MAKANAN =====");
        System.out.println("1. Siomay    [Rp.  8000/porsi]");
        System.out.println("2. Batagor   [Rp.  8000/porsi]");
        System.out.println("3. Krawu     [Rp. 15000/porsi]");
        System.out.println("4. Seblak    [Rp. 10000/porsi]");
        System.out.println("5. Kebuli    [Rp. 18000/porsi]");
        System.out.println("6. Total Pesanan Sementara");
        System.out.println("7. Selesai Pesanan");
    }
    
    boolean CekUlang(String cek) {
        qty[i][0] = indeks;
        qty[i][1] = Total;
        boolean ulang = true;
        switch (cek) {
            case "y" : i++; indeks=0; Total=0; break;
            case "n" : TotalPesanan(); ulang = false; break;
            default : System.out.println("Pilihan salah ! ulangi lagi.");
    }
        return ulang;
  }
    
    void Getkondisi(int pilih, int Porsi) {
        if (pilih <= 5 && pilih >= 1){
            Pilihan [i][indeks]= pilih-1;
            Pesan [i][indeks] = Porsi;
            Total_Harga [i][indeks] = Porsi * Harga[pilih-1];
            Total += Total_Harga[i][indeks];
            indeks++;
            }
    }
    
    void TotalPesanan (){
      for (int k = 0; k <= i; k++) {
        System.out.println("\n===== Daftar Pesanan ke-"+(k+1)+" [Warung Siru] =====");
        System.out.println("No. Nama \tSatuan \t\tJumlah \t\tHarga\n"
                         + "--------------------------------------------------------------");
        for (int j=0; j < qty[k][0]; j++) {
            System.out.println((j+1) + ". " + daftar[Pilihan[k][j]] + "\tRp. " + Harga[Pilihan[k][j]] + "\t"+ Pesan[k][j] + " porsi \t" + "Rp. " + Total_Harga[k][j]);
        }
        System.out.println("--------------------------------------------------------------\n"
                         + "\t\t\t\t\tTOTAL \tRp. " +qty[k][1]);
      }
    }
    
    void Pesanan(){
        System.out.println("===== Daftar Pesanan [Warung Siru] =====");
        System.out.println("No. Nama \tSatuan \t\tJumlah \t\tHarga\n"
                         + "--------------------------------------------------------------");
        for (int j = 0; j < indeks; j++) {
            System.out.println((j+1) + ". " + daftar[Pilihan[i][j]] + "\tRp. " + Harga[Pilihan[i][j]] + "\t"+ Pesan[i][j] + " porsi \t" + "Rp. " + Total_Harga[i][j]);
        }
        System.out.println("--------------------------------------------------------------\n"
                         + "\t\t\t\t\tTOTAL \tRp. " +Total);
    }
}

public class VoidArray {
    public static void main(String[] args) {
    Kondisi nKon = new Kondisi();
    Scanner p = new Scanner (System.in);
    int pilih, Porsi;
    boolean ulang = true;
    while(ulang){
     do{
        nKon.menu();
        System.out.print("Pilih Menu : ");
            pilih = p.nextInt();
            if (pilih <= 5 && pilih >= 1){
                System.out.print("Berapa Porsi : ");
                Porsi = p.nextInt();
                nKon.Getkondisi(pilih, Porsi);
            }
            else if (pilih==6){
                nKon.Pesanan();
                System.out.println("(Reminder! ini sementara, pilih 7 untuk selesai pesanan.)");
            }
            else if (pilih==7) {
                System.out.println("Berikut daftar total semua Pesanan anda.");
                nKon.Pesanan();
                System.out.println("Terimakasih telah mampir di Warung Siru kami :)\n");
            }
            else {
                System.out.println("Pilihan tidak tersedia ! ulangi.");
            }
        }while (pilih!=7);
     System.out.print("\nApakah ingin pesanan baru?(y/n) : ");
     String cek = p.next();
     ulang = nKon.CekUlang(cek);
    }
  }
}

        

    
    
    
    
    
    