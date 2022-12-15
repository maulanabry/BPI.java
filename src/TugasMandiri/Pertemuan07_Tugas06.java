
package TugasMandiri;
import java.util.Scanner;
public class Pertemuan07_Tugas06 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
      int N,angka = 2,batas = 0; 
System.out.println("=================================================");
System.out.println("Program Menampilkan N Bilangan Prima Pertama ");
System.out.println("=================================================");
// Input banyak bilangan prima
System.out.print("Masukkan banyak bilangan prima pertama : "); 
N = sc.nextInt();
System.out.println("=================================================");
System.out.print(N +" bilangan prima pertama adalah ");
//Melakukan proses perulangan
while (N>batas) {
    boolean perulangan = true;
     for (int a = 2; a <= angka / 2; a++) {
                if (angka % a == 0) {
                    perulangan = false;
                    break;
}  
     }      
                if (perulangan == true) {
                    batas++;    
        //Output N bilangan prima pertama
                System.out.print(angka + " ");
                }      
            angka = angka + 1;
     }
    } } 
 

        
        
        
        
        
        
        
        
        
        
        
        
