
package Materi;

import java.util.Scanner;
public class Materi03_IfElse {
    public static void main(String[] args) {
        //syarat lulus, nilai >=70
        Scanner s = new Scanner (System.in);
        int nilai;
        // 1. input
        System.out.println("Masukkan nilai = ");
        nilai = s.nextInt();
        // 2. proses --> cek nilai
        // 3. output --> lulus atau tidak
        if(nilai>=70 && nilai<=100){
            //apa yang dikerjakan?
            System.out.print("SELAMAT ");
            System.out.println("Anda Lulus");
        }
        else if(nilai>100 || nilai<0){
            System.out.println("Nilai Salah!");
        }
        else{
            System.out.println("MOHON MAAF ");
            System.out.println("Anda Belum Lulus");
        }
    }
} 
