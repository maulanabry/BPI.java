package Materi;
import java.util.Scanner;
public class aksibelajar04 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int[] nilai;
        double ipk[] = new double[5];
        byte[] absen = {10,11,12,13,14};
        nilai = new int[5];

//        nilai[0] = 89;
//        nilai[1] = 77;
//        nilai[2] = 86;
//        nilai[3] = 75;
//        nilai[4] = 92;
//
//        ipk[0] = 3.92;
//        ipk[1] = 2.99;
//        ipk[2] = 3.40;
//        ipk[3] = 2.8;
//        ipk[4] = 4.0;
//
//        System.out.println("DATA MAHASISWA");
//        System.out.println("Absen : "+absen[2]);
//        System.out.println("Nilai : "+nilai[0]);
//        System.out.println("IPK   : "+ipk[2]);
//
//        for (int i =0; i<=ipk.length; i++){
//            System.out.print(ipk[i]+", ");
//        }

        nilai[0] = 89;
        nilai[1] = 77;
        nilai[2] = 25;
        int temp2 = 0;
        // nilai [0] > nilai [1] true
        temp2 = nilai[0];
        nilai[0] = nilai [1];
        nilai [1]  = temp2;
        System.out.println("nilai 0 =" + nilai[0] + " " + "nilai 1 = " + nilai [1] + " " +"nilai 2 = " + nilai [2]);
        // nilai [0] > nilai [1] false
        // nilai [1] > nilai [2] true
        temp2 = nilai[1];
        nilai[1] = nilai [2];
        nilai [2]  = temp2;
        System.out.println("nilai 0 =" + nilai[0] + " " + "nilai 1 = " + nilai [1] + " " +"nilai 2 = " + nilai [2]);
        // nilai [0] > nilai [1] true
        temp2 = nilai[0];
        nilai[0] = nilai [1];
        nilai [1]  = temp2;
        System.out.println("nilai 0 =" + nilai[0] + " " + "nilai 1 = " + nilai [1] + " " +"nilai 2 = " + nilai [2]);
        // nilai [1] > nilai [2] False
        // nilai [0] > nilai [1] false

        System.out.println("==========================");
        int angka[];
        angka = new int[10];

        for (int i =0; i<10; i++) {
            System.out.print("Masukkan angka : ");
            angka[i] = s.nextInt();
        }

        for (int i =0; i<10; i++){
            System.out.print(angka[i]+" ");
        }

        String data[]=new String[5];
        System.out.println("Selection Sort");
        System.out.println("Masukkan Data Awal");
        for (int i = 0; i < 5; i++) {
            System.out.print("Data "+(i+1)+" = ");
            data[i] = s.next();
        }
        System.out.print("Data Awal : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length; j++) {
                if(data[i].compareToIgnoreCase(data[j])>0){
                    String temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
        System.out.print("Data Akhir : ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println("");
    }
    }



