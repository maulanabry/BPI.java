
package TugasMandiri;


import java.util.Scanner;
// mengimport scanner ke program 

public class Pertemuan03_Tugas02 {

    public static void main(String[] args) {

        Scanner sc    = new Scanner(System.in);
         //Membuat Objek dari Class Scanner
         
         //Definisikan variabel
         int jumlahberas,hargaberas,totalberas,uangditerima;
         double diskon;
                 
            //1, Tuliskan opening dan input jumlah beras 
            System.out.println("----Kasir Warung Beras Sederhana----");
            System.out.println("------------Selamat Berbelanja------------");
            System.out.print("Berapa jumlah beras yang ingin dibeli (Kg)    : ");  //Mencetak Output
            jumlahberas = sc.nextInt(); //Mendapatkan Input dari User
            
            //2. Input Harga beras
            System.out.print("Harga beras                            : Rp ");
            hargaberas = sc.nextInt();
            
            //3. Hitung Harga total beras
            totalberas = jumlahberas * hargaberas;
            System.out.println("Harga jual                             : Rp " + totalberas);
            
            //4. Hitung diskon 
            diskon = 0.05 * totalberas;
             System.out.println("Potongan diskon 5%           : Rp " + diskon);
             
             //5. Hitung Total biaya setelah diskon
             System.out.println("Total biaya                          : Rp " + (totalberas - diskon));
             
             //6. Input Uang diterima
             System.out.print("Uang diterima                           : Rp " );
             uangditerima = sc.nextInt();
             
              //7. Hitung Uang kembalian
             System.out.println("uang kembalian                  : Rp " + (uangditerima-hargaberas+diskon));
             
        
    }
}
        
        
        
        
        
        
  