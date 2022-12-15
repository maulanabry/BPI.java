
package TugasMandiri;
import java.text.NumberFormat;
import java.util.Scanner;
public class Test2 {
     static int hitungHarga(int hargaSatuan, int jumlah) {

        int harga = hargaSatuan * jumlah;

        return harga;

    }

    static String[][] sort(String[] menu, int[] harga) {

        String[][] hasilUrutan = new String[10][2];

        for (int i = 0; i < menu.length; i++) {

            for (int j = 0; j < menu.length - 1; j++) {

                if (menu[j].compareToIgnoreCase(menu[j + 1]) > 0) {

                    String t = menu[j];

                    menu[j] = menu[j + 1];

                    menu[j + 1] = t;

                    int h = harga[j];

                    harga[j] = harga[j + 1];

                    harga[j + 1] = h;

                }

            }

        }

        for (int i = 0; i < menu.length; i++) {

            hasilUrutan[i][0] = menu[i];

            hasilUrutan[i][1] = String.valueOf(harga[i]);

        }

        return hasilUrutan;

    }

    static String[][] search(String[] menu, int harga[], String cari) {

        String[][] hasil = new String[10][2];

        int idx = 0;//menyimpan jumlah yang diperlukan

        for (int i = 0; i < menu.length; i++) {

            if (menu[i].indexOf(cari) >= 0) {

                hasil[idx][0] = menu[i];

                hasil[idx][1] = String.valueOf(harga[i]);

                idx++;

            }

        }

        return hasil;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hargamakanan[] = new int[10];

        int hargaminuman[] = new int[10];

        int hargasnack[] = new int[10];

        String menumakanan[] = new String[10];

        String menuminuman[] = new String[5];

        String menusnack[]   = new String[5];

        int pilih = 0, pilih2 = 0, pilih3 = 0;

        String daftarmenu[]= new String[10];

        int daftarharga [] = new int [10];

        int total[]      = new int[10];

        int porsi []     = new int[10];

        int jumlahbeli   = 0;

        int totalbiaya   = 0;

        

        //inisialisasi array makanan

        menumakanan[0] = "  Rujak Cingur       "; 

        hargamakanan[0] = 12000;

        menumakanan[1] = " Rujak Buah         ";

        hargamakanan[1] = 10000;

        menumakanan[2] = "  Rujak Petis        "; 

        hargamakanan[2] = 11000;

        menumakanan[3] = "  Lontong Balap      "; 

        hargamakanan[3] = 18000;

        menumakanan[4] = "  Lontong Sayur      "; 

        hargamakanan[4] = 15000;

        menumakanan[5] = "  Lontong Kupang     "; 

        hargamakanan[5] = 20000;

        menumakanan[6] = "  Nasi Goreng        "; 

        hargamakanan[6] = 13000;

        menumakanan[7] = "  Nasi Campur        "; 

        hargamakanan[7] = 10000;

        menumakanan[8] = "  Nasi Kuning        "; 

        hargamakanan[8] = 14000;

        menumakanan[9] = "  Nasi Uduk          "; 

        hargamakanan[9] = 15000;

        

        //inisialisasi array minuman

        menuminuman[0] = "  Taro Milkshake     "; 

        hargaminuman[0] = 12000;

        menuminuman[1] = "  Mango Milkshake    "; 

        hargaminuman[1] = 11000;

        menuminuman[2] = "  Jus Melon          "; 

        hargaminuman[2] = 14000;

        menuminuman[3] = "  Jus Jambu          "; 

        hargaminuman[3] = 12000;

        menuminuman[4] = "  Jus Alpukat        "; 

        hargaminuman[4] = 13000;



        //inisiaisasi array snack

        menusnack[0]   = "  Chicken Nugget     "; 

        hargasnack[0] = 9000;

        menusnack[1]   = "  Fish Nugget        "; 

        hargasnack[1] = 8500;

        menusnack[2]   = "  Sosis Bakar        "; 

        hargasnack[2] = 7000;

        menusnack[3]   = "  Sosis Goreng       "; 

        hargasnack[3] = 6000;

        menusnack[4]   = "  Tahu Genjrot       "; 

        hargasnack[4] = 9500;



        System.out.println("***** Selamat Datang di Kedai 008 ***** ");

        System.out.println("         Jalan Wonorejo No. 25              ");

        System.out.println("               Surabaya                          ");

        do {

            System.out.println("\n========== MENU ==========");

            System.out.println("1. Makanan");

            System.out.println("2. Minuman");

            System.out.println("3. Snack");

            System.out.println("4 .Exit");

            System.out.print("Pilih = ");

            pilih = sc.nextInt();

            switch (pilih) {

                case 1:

                    System.out.println("1.Daftar Makanan");

                    System.out.println("2.Cari Makanan");

                    System.out.print("Pilih = ");

                    pilih2 = sc.nextInt();

                    switch (pilih2) {

                        case 1:

                            String[][] urut = sort(menumakanan,hargamakanan);                           

                            System.out.println("\n----------Daftar Menu----------- ");

                            System.out.println("--------------------------------");

                            System.out.println("No.\t|Menu|\t\t|Harga|");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < urut.length; i++) {

                                if (urut[i][0] != null) {

                                    System.out.print((i + 1) + ". " + urut[i][0] + " ");

                                    System.out.println(Integer.parseInt(urut[i][1]));

                                }

                            }

                            

                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= urut[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(urut[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("-------Cari Makanan-------");

                            System.out.print("Cari = ");

                            String c = sc.next();

                            String hasilcari[][] = search(menumakanan, hargamakanan, c);

                            System.out.println("Hasil Pencarian");

                            System.out.println("--------------------------------");

                            System.out.println("No\tDaftar Menu\tHarga");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < hasilcari.length; i++) {

                                if (hasilcari[i][0] != null) {

                                    System.out.print((i + 1) + ".   " + hasilcari[i][0] + " ");

                                    System.out.println("\t" + Integer.parseInt(hasilcari[i][1]));

                                }

                            }



                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= hasilcari[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(hasilcari[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                    }

                    break;

                case 2:

                    System.out.println("1.Daftar Minuman");

                    System.out.println("2.Cari Minuman");

                    System.out.print("Pilih = ");

                    pilih2 = sc.nextInt();

                    switch (pilih2) {

                        case 1:

                            String[][] urut = sort(menuminuman,hargaminuman);                           

                            System.out.println("\n----------Daftar Menu----------- ");

                            System.out.println("--------------------------------");

                            System.out.println("No.\t|Menu|\t\t|Harga|");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < urut.length; i++) {

                                if (urut[i][0] != null) {

                                    System.out.print((i + 1) + ". " + urut[i][0] + " ");

                                    System.out.println(Integer.parseInt(urut[i][1]));

                                }

                            }



                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= urut[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(urut[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("-------Cari Minuman-------");

                            System.out.print("Cari = ");

                            String c = sc.next();

                            String hasilcari[][] = search(menuminuman, hargaminuman, c);

                            System.out.println("Hasil Pencarian");

                            System.out.println("--------------------------------");

                            System.out.println("No\tDaftar Menu\tHarga");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < hasilcari.length; i++) {

                                if (hasilcari[i][0] != null) {

                                    System.out.print((i + 1) + ".   " + hasilcari[i][0] + " ");

                                    System.out.println("\t" + Integer.parseInt(hasilcari[i][1]));

                                }

                            }



                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= hasilcari[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(hasilcari[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                    }

                    break;

                case 3:

                    System.out.println("1.Daftar Snack");

                    System.out.println("2.Cari Snack");

                    System.out.print("Pilih = ");

                    pilih2 = sc.nextInt();

                    switch (pilih2) {

                        case 1:

                            String[][] urut = sort(menusnack,hargasnack);                            

                            System.out.println("\n----------Daftar Menu----------- ");

                            System.out.println("--------------------------------");

                            System.out.println("No.\t|Menu|\t\t|Harga|");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < urut.length; i++) {

                                if (urut[i][0] != null) {

                                    System.out.print((i + 1) + ". " + urut[i][0] + " ");

                                    System.out.println(Integer.parseInt(urut[i][1]));

                                }

                            }



                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= urut[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(urut[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                        case 2:

                            System.out.println("-------Cari Snack-------");

                            System.out.print("Cari = ");

                            String c = sc.next();

                            String hasilcari[][] = search(menusnack, hargasnack, c);

                            System.out.println("Hasil Pencarian");

                            System.out.println("--------------------------------");

                            System.out.println("No\tDaftar Menu\tHarga");

                            System.out.println("--------------------------------");

                            for (int i = 0; i < hasilcari.length; i++) {

                                if (hasilcari[i][0] != null) {

                                    System.out.print((i + 1) + ".   " + hasilcari[i][0] + " ");

                                    System.out.println("\t" + Integer.parseInt(hasilcari[i][1]));

                                }

                            }



                        //transaksi

                        System.out.print("Pilih Menu   = ");

                        pilih3 = sc.nextInt();

                        //menyimpan hasil array kedalam transaksi

                        daftarmenu[jumlahbeli]= hasilcari[pilih3-1][0]; //menu

                        daftarharga[jumlahbeli]= Integer.parseInt(hasilcari[pilih3-1][1]); //harga

                        System.out.print("Jumlah Porsi = ");

                        porsi[jumlahbeli] = sc.nextInt();

                        total[jumlahbeli] =  hitungHarga(daftarharga[jumlahbeli], porsi[jumlahbeli]);

                        jumlahbeli++;

                            System.out.println("");

                            break;

                    }

                    break;

                case 4:

                    System.out.println("             \n***** PEMBAYARAN *****");

                    break;

            }

        } while (pilih != 4);

        System.out.println("");

        System.out.println("           ======= Daftar Beli ======= ");

        System.out.println("-----------------------------------------------");

        System.out.println("No.  Makanan\t     Porsi    Harga");

        System.out.println("-----------------------------------------------");

        for (int i = 0; i < jumlahbeli; i++) {

            if(menumakanan[i] != null){

                System.out.println((i+1) +"." +daftarmenu[i]+ "" + porsi[i]+""+"     [" + daftarharga[i] + "]");

                totalbiaya = totalbiaya + total[i];

            }

        }

        System.out.println("-----------------------------------------------");

        System.out.println("Tagihan                  : Rp. " + totalbiaya);

        System.out.print("Tunai                    : Rp. ");

        int uang = sc.nextInt();

        System.out.println("Kembalian                : Rp. " +(uang-totalbiaya));

        System.out.println("-----------------------------------------------");

        System.out.println("   ----- Terimakasih Telah Berkunjung ----- ");

        System.out.println("         ---  Selamat Datang Kembali  ---");

    }

}

