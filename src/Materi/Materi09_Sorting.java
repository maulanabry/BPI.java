/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Materi;
import java.util.*;
public class Materi09_Sorting {
      public static void main(String[] args) {
        try (Scanner s = new Scanner (System.in);) {
            String menu [] = new String [5];
            int harga [] = new int [5];
            int pilih;
            // inisialisasi data
            menu[0] = "sate ";   harga[0] = 15000;
            menu[1] = "soto ";   harga[1] = 12000;
            menu[2] = "gule ";   harga[2] = 20000;
            menu[3] = "bakso";   harga[3] = 10000;
            menu[4] = "rawon";   harga[4] = 14000;
            // 
            do {
                System.out.print("\nMenu Program"
                    +"\n1. Daftar makanan"
                    +"\n2. Urutkan termurah"
                    +"\n3. Urutkan termahal"
                    +"\n4. Selesai"
                    +"\nPilih = ");
                pilih = s.nextInt();
                switch (pilih) {
                    case 1 : 
                        System.out.println("\nMENU \tHARGA");
                        for (int i = 0; i <5; i++) {
                            System.out.println(menu[i]+"\t"+harga[i]);
                        }
                        break;
                    case 2 : 
                        // bubble algorithm
                        System.out.println("\nHarga menu termurah");
                        String menu2[] = new String[5];
                        menu2 = menu;
                        int harga2[] = new int[5];
                        harga2 = harga;
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 4; j++) {
                                if (harga2[j] > harga2[j+1]) {
                                    // mengurutkan harga
                                    int temp = harga2[j];
                                    harga2[j] = harga2[j+1];
                                    harga2[j+1] = temp;
                                    // mengurutkan menu
                                    String temp2 = menu2[j];
                                    menu2[j] = menu2[j+1];
                                    menu2[j+1] = temp2;
                                }
                            }
                        }
                        for (int i = 0; i < 5; i++) {
                            System.out.println(menu2[i]+"\t"+harga2[i]);
                        }
                        break;
                    case 3 : 
                        // selection algorithm
                        menu2 = menu;
                        harga2 = harga;
                        System.out.println("Harga menu termahal");
                        for (int i = 0; i < 4; i++) {
                            for (int j = i+1; j < 5; j++) {
                                if (harga2[i] < harga[j]) {
                                    // mengurutkan harga
                                    int temp = harga2[j];
                                    harga2[j] = harga2[i];
                                    harga2[i] = temp;
                                    // mengurutkan menu
                                    String temp2 = menu2[j];
                                    menu2[j] = menu2[i];
                                    menu2[i] = temp2;
                                }
                            }
                        }
                        for (int i = 0; i < 5; i++) {
                            System.out.println(menu2[i]+"\t"+harga2[i]);
                        }
                        break;
                    case 4 : 
                        System.out.println("Terima kasih");
                        break;
                }
            } while (pilih != 4);
        }
    }
}
    

