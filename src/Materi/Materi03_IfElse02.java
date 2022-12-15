
package Materi;

import java.util.Scanner;

public class Materi03_IfElse02 {
    public static void main(String[] args) {
         double ipk;
        int poin;
        Scanner s = new Scanner (System.in);
      //syarat lulus: ipk >= 2.75 dan poin >= 250
        //input data
        System.out.print("Masukkan IPK = ");
        ipk = s.nextDouble();
        System.out.print("Masukkan Poin = ");
        poin = s. nextInt();
                 //proses seleksi kelulusan
        if (ipk>=2.75 && ipk<=4) {
            if (poin >=250){
            // lulus
            System.out.println("Lulus");
    } else {
            //tidak lulus
            System.out.println("Belum Lulus");
            System.out.println("Poin Kurang");
              //nested
        }  }else if (ipk<2.75 && ipk>=0){
                if(poin>=250){
                //IPK kurang
                System.out.println("Belum Lulus");
                System.out.println("IPK Kurang");
                }else {//tidak lulus
                System.out.println("BELUM LULUS");
                System.out.println("IPK dan Poin Kurang");
                      
    }
}
    
}
}
    






