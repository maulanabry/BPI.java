package Materi;

import java.util.Scanner;

public class Materi04_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin, pilih;
          boolean running = true;
          String jawab;
       while (running) {
            
       
        System.out.print("Masukkan PIN = ");
        pin = sc.nextInt();
                if(pin==1234){
                    double saldo = 5000000;
                //Tampilan Menu
                    System.out.println("ATM Sederhana");
                    System.out.println("1. Transfer");
                    System.out.println("2. Penarikan");
                    System.out.println("3. Pembayaran");
                //Input Pilihan
                    System.out.print("Pilih = ");
                    pilih = sc.nextInt();
                //Seleksi Pilihan
                            switch(pilih) {
                                case 1 :
                                    System.out.print("Rekening Tujuan = ");
                                    int rek = sc.nextInt();
                                    System.out.print("Nominal = ");
                                    double nominal = sc.nextDouble();
                                    if (saldo>=nominal){
                                        System.out.println("Transfer Sukses");
                                        saldo = saldo - nominal;
                                        System.out.println("Saldo = "+saldo);
                                    }
                                    else {
                                        System.out.println("Saldo Tidak Mencukupi");}
                                    break;     
                                case 2 :
                                    System.out.print("Nominal = ");
                                    nominal = sc.nextDouble();
                                    if(saldo>=nominal){
                                        System.out.println("Debet Sukses");
                                        saldo = saldo -nominal;
                                        System.out.println("Saldo = "+saldo);
                                    }
                                    else {
                                        System.out.println("Saldo Tidak Mencukupi");
                                    } 
                                    break;
                                case 3 :
                                    System.out.println("  1. SPP/UKT");
                                    System.out.println("  2. Listrik");
                                    System.out.println("  3. Air");
                                    System.out.println("  Pilih = ");
                                    int pilih2 = sc.nextInt();
                                    switch(pilih2){
                                        case 1 :
                                            System.out.print("NPM = ");
                                             long npm = sc.nextLong();
                                            System.out.print("SPP/UKT = ");
                                            nominal = sc.nextDouble();
                                            if(saldo>=nominal){
                                                System.out.println("Pembayaran Sukses");
                                                saldo = saldo - nominal;
                                                System.out.println("Saldo = " + saldo);
                                            } else {
                                                System.out.println("Saldo Tidak Mencukupi"); }
                                            break;
                                         case  2 :
                                             System.out.print("Kode Pelanggan = ");
                                             int kode = sc.nextInt();
                                             System.out.print("Biaya = ");
                                             nominal = sc.nextDouble();
                                             if(saldo>=nominal){
                                                 System.out.println("Pembayaran Sukses");
                                             saldo = saldo-nominal;
                                                 System.out.println("Saldo = "+saldo);}
                                             else {
                                                 System.out.println("Saldo Tidak Mencukupi");}
                                             break;
                                         case 3 :
                                             System.out.print("Kode Pelanggan = ");
                                             kode = sc.nextInt();
                                             System.out.print("Kode Pelanggan = ");
                                             kode = sc.nextInt();
                                             System.out.print("Biaya = ");
                                             nominal = sc.nextDouble();
                                             if(saldo>=nominal){
                                                 System.out.println("Pembayaran Sukses");
                                             saldo = saldo -nominal;
                                                 System.out.println("Saldo = "+saldo);
                                             }
                                             else{
                                                 System.out.println("Saldo Tidak Mencukupi");
                                 } break;
                                    
                                    }break;
                                    default:
                                        System.out.println("Menu Tidak Ada!");
                            }
                } else {System.out.println("Pin Salah!"); }
          // Melakukan Perulangan jika diinginkan
            System.out.println("Apakah anda ingin melakukan transaksi kembali??");
                System.out.print("Jawab [ya/tidak]> ");
                    jawab = sc.next();
                if( jawab.equals("ya") ){
                    running = true;
           }                else if(jawab.equals("tidak")){
                                    System.out.println("---Terima Kasih ---");
                                    break  ; 
         }
    } } }
