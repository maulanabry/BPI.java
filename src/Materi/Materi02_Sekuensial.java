/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Materi;

import java.util.Scanner;

public class Materi02_Sekuensial {   public static void main(String[] args) {
        //gaji total  = gaji pokok + (masuk x 15.000) + tunjangan
        //tunjangan   = gaji pokok x 5%
        Scanner sc    = new Scanner(System.in);
        int gajipokok = 4000000; //inisialisasi
        int jumlahmasuk;
        double tunjangan, gajitotal;
        
        System.out.println("Aplikasi Gaji Pegawai");
        //input
        System.out.print("Masukkan Gaji Pokok        =");
        gajipokok = sc.nextInt ();
        System.out.print("Masukkan Jumlah Hari Kerja = ");
        jumlahmasuk = sc.nextInt();
        //proses
        tunjangan   = gajipokok * 0.05;
        gajitotal   = gajipokok + (jumlahmasuk * 15000) + tunjangan;
        //output
        System.out.println("Gaji Pokok     :"+gajipokok);
        System.out.println("Uang Transport :"+(jumlahmasuk * 15000));
        System.out.println("Tunjangan      :"+tunjangan);
        System.out.println("Gaji Pegawai   :"+gajitotal);
        
    }
}
        
    

