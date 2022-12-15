
package TugasMandiri;
import java.util.Scanner;
public class Test4  {  
    public static void main(String[] args) {
            //1. kasir --> pemesanan makanan

        //2. admin --> penambahan menu

        //3. dst 

        Scanner sc = new Scanner(System.in);

        int user=0;

        //array untuk data master warung

        String Menu[]= new String[10];

        int Harga[] = new int[10];

        int jumlah=4;

        Menu[0] = "Soto"; Harga[0] = 10000;

        Menu[1] = "Sate"; Harga[1] = 15000;

        Menu[2] = "Bakso"; Harga[2] = 8000;

        Menu[3] = "Rawon"; Harga[3] = 12000;

        

        //array untuk pembelian

        String menu[] = new String[5];

        int harga[] = new int[5];

        int porsi[]  = new int[5];

        int idx=0;

        

         do{

            System.out.println("\nUSER");

            System.out.println("1. Kasir");

            System.out.println("2. Admin");

            System.out.println("3. Exit");

            System.out.print("Pilih = ");

            user = sc.nextInt();

            switch(user){

                case 1 :

                    System.out.println("USER KASIR");

                    System.out.println("Daftar Menu");

                    for (int i = 0; i < jumlah; i++) {

                        System.out.print((i+1)+"."+Menu[i]);

                        System.out.println(" ["+Harga[i]+"] ");

                    }

                    System.out.print("Pilih = ");

                    int pilih = sc.nextInt();

                    System.out.print("Porsi = ");

                    porsi[idx] = sc.nextInt();

                    menu[idx] = Menu[(pilih-1)];

                    harga[idx]= Harga[(pilih-1)];

                    int total = porsi[idx] * harga[idx];

                    System.out.println("Harga/porsi : "+harga[idx]);

                    System.out.println("Biaya       : "+total);

                    

                    //menampilkan daftar pesanan

                    System.out.println("Daftar Pembelian");

                    System.out.println("No\tMenu\tHarga\tJumlah\tTotal Biaya");

                    for (int i = 0; i <= idx; i++) {

                        System.out.print((i+1)+"\t"+menu[i]);

                        System.out.print("\t"+harga[i]);

                        System.out.print("\t"+porsi[i]);

                        System.out.println("\t"+harga[i]*porsi[i]);

                    }

                    idx++;

                    break;

                case 2 :

                    System.out.println("USER ADMIN");

                    System.out.println("1. Tambah Menu");

                    System.out.println("2. Hapus Menu");

                    System.out.print("Pilih = ");

                    int pilih2 = sc .nextInt();

                    switch(pilih2){

                        case 1 :

                            System.out.print("Nama  = ");

                            Menu[jumlah] = sc.next();

                            System.out.print("Harga = ");

                            Harga[jumlah] = sc.nextInt();

                            System.out.println("Penambahan Sukses..");

                            jumlah++;

                            break;

                        case 2 :

                            System.out.print("Nama  = ");

                            String nama = sc.next();

                            boolean ketemu = false;

                            int idk = -1;

                            for (int i = 0; i < jumlah; i++) {

                                if (Menu[i].compareToIgnoreCase(nama)==0) {

                                    ketemu = true;

                                    idk = i;

                                    break;

                                }

                            }

                            if ( ketemu==false) {

                                System.out.println("Menu Tidak Ada!");

                            }else{

                                //mengubah isi array data master

                                for (int i = idk; i < jumlah-1; i++) {

                                    Menu[i] = Menu[i+1];

                                    Harga[i] = Harga[i+1];  

                                }

                                System.out.println("Penghapusan Sukses..");

                                jumlah--;

                            }

                            break;

                    }

                    break;

                case 3 :

                    System.out.println("Terima Kasih..");

            }

        }while(user!=3);

    }

}

 

    
    


