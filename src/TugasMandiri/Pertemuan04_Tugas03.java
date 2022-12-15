
package TugasMandiri;

import java.util.Scanner;

public class Pertemuan04_Tugas03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Deklarasikan Variabel
        int jumlahbarang, hargasatuan,nominalbayar,totalbiaya;
        double diskon = 0, totalbiayadiskon,nominalkembali ;
        boolean running = true;
        String jawab;
        while (running) {
        System.out.println("---Toko Baju Hello World---");
        
        //input jumlah barang + hargasatuan
        //jumlah barang
        System.out.print("Jumlah baju yang ingin dibeli : ");
            jumlahbarang = sc.nextInt();
        //harga satuan
        System.out.print("Harga satuan baju : Rp ");
            hargasatuan = sc.nextInt();
        //Jumlahkan total biaya
         totalbiaya = jumlahbarang*hargasatuan;
            System.out.println("Total biaya : Rp " +totalbiaya);
       
        
        //pemilihan Diskon
        
        // 1) pembelian < 100.000 = diskon 0%
            // Perhitungan Diskon
        if(totalbiaya>0 && totalbiaya<=100000){
            diskon = totalbiaya*0;
                System.out.println("Anda Tidak Mendapatkan diskon");
        }    
        // 2) pembelian 100.001 - 200.000 = diskon 5%
            // Perhitungan Diskon
        else if(totalbiaya>=100001 && totalbiaya<=200000){
                diskon = totalbiaya*0.05;
                    System.out.println("Selamat Anda Mendapat Diskon 5%");
        } 
    // 3) pembelian 200.001 - 300.000 = diskon 10%
            // Perhitungan Diskon
        else if(totalbiaya>=200001 && totalbiaya<=300000){
            diskon = totalbiaya*0.1;
                System.out.println("Selamat Anda Mendapat Diskon 10%");
        } 
    // 4) pembelian 300.001 - 400.000 = diskon 15%
            // Perhitungan Diskon
        else if(totalbiaya>=300001 && totalbiaya<=400000){
            diskon = totalbiaya*0.15;
                System.out.println("Selamat Anda Mendapat Diskon 15%");
        }
        // 5) pembelian 400.001 - 500.000 = diskon 20%
            // Perhitungan Diskon
        else if(totalbiaya>=400001 && totalbiaya<=500000){
            diskon = totalbiaya*0.20;
             System.out.println("Selamat Anda Mendapat Diskon 20%");
        }
         // 6) pembelian > 500.000 = diskon 25%
            // Perhitungan Diskon
        else if(totalbiaya > 500000){
            diskon = totalbiaya*0.25;
                System.out.println("Selamat Anda Mendapat Diskon 25%"); 
        }
        //Jika nominal salah
        else { System.out.println("Terjadi Kesalahan");}
        
        // Menghitung Diskon
        if (totalbiaya >= 0) {
                System.out.println("Diskon : Rp " + diskon);
          
             // Harga Setelah Diskon
            totalbiayadiskon = totalbiaya - diskon;
                System.out.println("Total biaya Setelah Diskon : Rp " + totalbiayadiskon);        
           
            // Masukkan uang yang dibayarkan
            System.out.print("Uang yang dibayarkan : Rp ");
                nominalbayar = sc.nextInt();
                // Menghitung Kembalian
             nominalkembali = nominalbayar - totalbiayadiskon;
                System.out.println("Kembali : Rp "+nominalkembali);
            
            //Tidak ada uang kembali
                if (nominalkembali == 0) { 
                    System.out.println("Tidak ada kembalian");   
                } 
            // Uang kurang
                else  if (nominalkembali <= 0) { 
                    System.out.println("---Uang Kurang---");
                } 
            }   
           // Melakukan Perulangan jika diinginkan
            System.out.println("Apakah anda ingin melakukan transaksi kembali??");
                System.out.print("Jawab [ya/tidak]> ");
                    jawab = sc.next();
                if( jawab.equals("ya") ){
                    running = true;
           }                else if(jawab.equals("tidak")){
                                    System.out.println("---Terima Kasih Sudah Berbelanja---");
                                    break;
            } 
        }   
    }
}
    
