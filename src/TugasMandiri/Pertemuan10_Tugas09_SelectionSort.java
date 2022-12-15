
package TugasMandiri;
import java.util.Scanner;
import java.text.NumberFormat;
public class Pertemuan10_Tugas09_SelectionSort {
    public static void main(String[] args) {
    NumberFormat rupiah=NumberFormat.getInstance();
    rupiah.setMaximumFractionDigits(3);
    Scanner s= new Scanner(System.in);
    //Variabel
    String menu []=new String[5];
    int harga [] = new int [5];  
    int pilih=0;
    // Inisiasi Data
        menu[0]="Geprek  Original"; harga[0]=10000;
        menu[1]="Geprek  Keju\t"; harga[1]=15000;
        menu[2]="Geprek  Telur Asis"; harga[2]=18000;
        menu[3]="Indomie Original"; harga[3]=5000;
        menu[4]="Indomie Spesial"; harga[4]=10000;
   //
         System.out.println("\t \t WARUNG MBOIS         ");

         do{
          pilih=0;
          System.out.println("=================================================");;
          System.out.println("\t \t Program Menu");
          System.out.println("-------------------------------------------------");
          System.out.println("1. Daftar Menu");
          System.out.println("2. Sorting Menu");
          System.out.println("3. Selesai");
          System.out.println("-------------------------------------------------");
          System.out.print("Pilih : ");
          pilih = s.nextInt();
          System.out.println("-------------------------------------------------");
       //Daftar Menu
          if (pilih ==1) {
            System.out.println("\t \t Daftar Menu");
            System.out.println("-------------------------------------------------");
            System.out.println("No.     Nama \t \t Harga");
            for (int i = 0; i < 5; i++) {
                if(menu[i]!= null){
                 System.out.println((i+1) + ". " + menu[i]+" " + "\tRp. "+rupiah.format(harga[i]));
                 
       } } }
          // Sorting menggunakan algoritma selection sort
          if (pilih ==2){
            String menu2[] = new String[5];
            menu2 = menu;
            int harga2[] = new int[5];
            harga2 = harga;
              System.out.println("\t \t Sorting Menu");
              System.out.println("-------------------------------------------------");
              System.out.println("1. Termahal - Descending \n2. Termurah - Ascending");       
              System.out.println("-------------------------------------------------");
              System.out.print("Pilih : ");
              pilih = s.nextInt();
              System.out.println("-------------------------------------------------");
                switch (pilih) {
                    case 1 :
                     System.out.println("\t \t Termahal - Descending");
                     System.out.println("-------------------------------------------------");
                     for (int i = 0; i < 4; i++){
                        for(int j = i+1; j < 5; j++){
                            if(harga2[i]<harga2[j]){
                                int temp=harga2[j];
                                harga2[j]=harga2[i];
                                harga2[i]=temp;
                                String a = menu2[j];
                                menu2[j] = menu2[i];
                                menu2[i] = a;
                    } } }   break;  
                    case 2 :
                     System.out.println("\t \t Termurah - Ascending");
                     System.out.println("-------------------------------------------------");
                     for (int i = 0; i < 4; i++){
                        for(int j = i+1; j < 5; j++){
                            if(harga2[i]>harga2[j]){
                                int temp=harga2[j];
                                harga2[j]=harga2[i];
                                harga2[i]=temp;
                                String a = menu2[j];
                                menu2[j] = menu2[i];
                                menu2[i] = a;
                    } } }       break;
                    default :
                    System.out.println("Terjadi Kesalahan");
                     break;
                        } 
                 System.out.println("No.     Nama \t \t Harga");
                 for (int i = 0; i < 5; i++) {
                 if(menu[i]!= null){
                 System.out.println((i+1) + ". " + menu2[i]+" " + "\tRp. "+rupiah.format(harga2[i]));
          } } } 
    } while (pilih != 3);
     System.out.println("\t \t Terima Kasih");
     System.out.println("=================================================");;
    } }

