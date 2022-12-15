
package Materi;
import java.util.Scanner;
public class Materi06_PerulanganBersarang {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Deklarasi Variabel
        int i;
        int num,batas = 0;
        String bil_prima = " ";
        // Masukkan nilai N sebagai batasan
        System.out.println("=================================================");
          System.out.print("Masukkan batasan :  ");
            batas = sc.nextInt();
            System.out.println("=================================================");
        for (i = 1; i <= batas; i++)
        {   /*Proses perulangan dan pemilihan perhitungan bilangan prima*/
        
            int prima = 0;
            for (num = i; num >= 1; num--)
            {
                if (i % num == 0)
                {
                    prima = prima + 1;
                }
            }
            if (prima == 2)
            {
                bil_prima = bil_prima + i + " ";
            }
        }
        // output
        System.out.print (batas+" Bilangan prima pertama : ");
        System.out.println (bil_prima);
    }    
}



    

