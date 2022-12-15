
package Materi;
import java.util.Scanner;
public class Materi05_Perulangan_loopdowhile {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
        int pilih, setor, tarik, transfer;
        int saldo=100000;
        do{
            System.out.println("\nMenu ATM");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer");
            System.out.println("4. Selesai");
            System.out.print("Pilih = ");
            pilih=s.nextInt();
            switch(pilih) {
                case 1:
                    System.out.print("Nominal Setor = ");
                    setor=s.nextInt();
                    saldo=saldo+setor;
                    System.out.println("Saldo: "+saldo);
                    break;
                case 2:
                    System.out.print("Nominal Tarik = ");
                    tarik=s.nextInt();
                    if(saldo>=tarik){
                        saldo=saldo-tarik;
                    }
                    else{
                        System.out.println("Saldo tidak cukup!");
                    }
                    saldo=saldo-tarik;
                    System.out.println("Saldo: "+saldo);
                    break;
                case 3:
                    System.out.print("Rekening Tujuan = ");
                    int rek = s.nextInt();
                    System.out.print("Nominal Transfer = ");
                    transfer=s.nextInt();
                    if(saldo>=transfer){
                        saldo=saldo-transfer;
                        System.out.print("Transfer Sukses");
                    }
                    else{
                        System.out.println("Saldo tidak cukup!");
                    }
                    System.out.println("Saldo: "+saldo);
                    break;
                case 4:
                    System.out.println("Terima kasih");
                    break;
            }
        }while(pilih!=4);
    }
}
    

