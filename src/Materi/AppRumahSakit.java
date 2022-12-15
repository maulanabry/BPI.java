
package Materi;
import java.util.Scanner; 
public class AppRumahSakit {
 //deklarasi variabel2 global    
  static Scanner sc = new Scanner(System.in);     
//asumsi maksimal 50 pasien; menyimpan 6 data:     
//kode, nama, umur, asal, sakit, status peserta     
  static String pasien[][] = new String[50][6];     
  static int jumPasien=0;    
      static void rawatjalan(String kd, String nm, String um,  
            String as, String skt, String st){        
          if(jumPasien>=50){           
             System.out.println("Kapasitas penuh..."); 
        } 
        else{ 
            pasien[jumPasien][0]=kd;            
            pasien[jumPasien][1]=nm;             
            pasien[jumPasien][2]=um;            
            pasien[jumPasien][3]=as;           
            pasien[jumPasien][4]=skt;         
            pasien[jumPasien][5]=st; 
            System.out.println("Pencatatan berhasil");          
            jumPasien++; 
        } 
    } 
     
    static String[][] urutkan(String[][] data, int kolom){ 
        for (int i = 0; i < jumPasien-1; i++) { 
            for (int j = i+1; j < jumPasien; j++) { 
                
if(data[i][kolom].compareToIgnoreCase(data[j][kolom])>0) 
                {   //tukar nama 
                    String temp1 = data[i][1];                     
                    data[i][1]=data[j][1];                    
                    data[j][1]=temp1; 
                    //tukar umur 
                    String temp2 = data[i][2];                     
                    data[i][2]=data[j][2];                    
                    data[j][2]=temp2; 
                    //tukar asal 
                    String temp3 = data[i][3];                     
                    data[i][3]=data[j][3];                     
                    data[j][3]=temp3; 
                     
                } 
            } 
        } 
 //copy kolom2 array yg sdh diurutkan 
        //ke array penampung yg baru 
        //asumsi hanya 3 kolom yang diakses         
        String hasil[][] = new String[jumPasien][3];        
        for (int i = 0; i < jumPasien; i++) {hasil[i][0] = data[i][1];   
    //nama             
    hasil[i][1] = data[i][2];   
    //umur             
    hasil[i][2] = data[i][3];   
    //asal 
        } return hasil; 
    } 
    static void cetakUrut(String d[][]){
        for (int i = 0; i < jumPasien; i++) {
            System.out.print((i+1)+". "+d[i][0]); 
            System.out.print(", "+d[i][1]); 
            System.out.println(" thn, "+d[i][2]); 
        } 
    } 
    static void urutNama(){ 
        String pas[][] = urutkan(pasien, 1);         
        System.out.println("Urut Nama"); 
        cetakUrut(pas); 
    } 
     
    static void urutUmur(){ 
        String pas[][] = urutkan(pasien, 2);         
        System.out.println("Urut Umur"); 
        cetakUrut(pas);         
    } 
     static void urutAsal(){ 
        String pas[][] = urutkan(pasien, 3);         
        System.out.println("Urut Asal");         
        cetakUrut(pas); 
    } 
 
    static void rekap(){ 
        System.out.println("==Rekap Data Pasien=="); 
        
System.out.println("No.\tKode\tNama\tUmur\tAsal\tSakit\tPeser ta");         
for(int i=0;i<jumPasien;i++){             
    System.out.print((i+1)+"\t"); 
            System.out.print(pasien[i][0]+"\t"); 
            System.out.print(pasien[i][1]+"\t"); 
            System.out.print(pasien[i][2]+"\t"); 
            System.out.print(pasien[i][3]+"\t"); 
            System.out.print(pasien[i][4]+"\t"); 
            System.out.println(pasien[i][5]+"\t"); 
        } 
        System.out.println("");         int p;         do{ 
            System.out.println("[[Urutkan berdasar]]");             
            System.out.println("1.Nama\n2.Umur\n3.Asal");            
            System.out.print("Pilih = "); p=sc.nextInt();            
            switch(p){                 
            case 1: urutNama(); break;                 
            case 2: urutUmur(); break;                 
            case 3: urutAsal(); break; 
            } 
            } 
        while(p<=3); 
    } 
    static void cari(String nm){      
        boolean ketemu=false;     
        for(int i=0; i<jumPasien; i++){       
            if (pasien[i][1].contains(nm)) 
            { 
                System.out.print(pasien[i][1]+" "+pasien[i][2]+" thn"); 
                System.out.println(" asal "+pasien[i][3]);                
                ketemu=true; 
            } 
        } 
        if(ketemu==false){ 
            System.out.println("Pasien tidak ditemukan"); 
        } 
    } 
     
    static void cetakGrafik(int x){        
        for (int i = 0; i < x; i++) { 
            System.out.print("X"); } 
System.out.println(""); 
    } 
    static void umurStat(){         int k1=0; 
//0-10 thn        
int k2=0; //10-17 thn       
int k3=0; //18-40 thn        
int k4=0; //41-60 thn      
int k5=0; //61 thn lebih      
//hitung jumlahnya dulu      
for (int i = 0; i < jumPasien; i++) {          
    if(Integer.parseInt(pasien[i][2])>=61) 
    k5++; 
            else if(Integer.parseInt(pasien[i][2])>=41)               
                k4++; 
            else if(Integer.parseInt(pasien[i][2])>=18)        
                k3++; 
            else if(Integer.parseInt(pasien[i][2])>=10)         
                k2++; 
            else if(Integer.parseInt(pasien[i][2])>=0)            
                k1++; 
        } 
System.out.println("==Grafik Usia Pasien=="); 
        System.out.print(">= 60 thn ");         cetakGrafik(k5); 
        System.out.print("41-60 thn "); cetakGrafik(k4); 
System.out.print("18-40 thn "); cetakGrafik(k3); 
System.out.print("10-17 thn "); 
cetakGrafik(k2); 
System.out.print("  0-9 thn "); cetakGrafik(k1); 
    } 
    static void asalStat(){        
        int k1=0;
    //sby       
    int k2=0; //sda        
    int k3=0; //mjk        
    int k4=0; //grs        
    int k5=0; //lain         
//hitung jumlahnya dulu       
for (int i = 0; i < jumPasien; i++) { 
            if(pasien[i][3].compareToIgnoreCase("sby")==0)               
                k1++; 
            else if(pasien[i][3].compareToIgnoreCase("sda")==0)             
                k2++; 
            else if(pasien[i][3].compareToIgnoreCase("mjk")==0)           
                k3++; 
            else if(pasien[i][3].compareToIgnoreCase("grs")==0)           
                k4++; 
            k5=jumPasien-(k1+k2+k3+k4); 
        } 
            System.out.println("==Grafik Asal Pasien=="); 
            System.out.print("Surabaya  ");         cetakGrafik(k1); 
            System.out.print("Sidoarjo  "); cetakGrafik(k2); 
            System.out.print("Mojokerto "); cetakGrafik(k3); 
            System.out.print("Gresik    "); 
            cetakGrafik(k4); 
            System.out.print("Lainnya   "); cetakGrafik(k5); 
 }
  static void sakitStat(){         
      int k1=0; //pusing         
      int k2=0; //mual        
      int k3=0; //diare         
      int k4=0; //batuk        
      int k5=0; //lainnya       
      //hitung jumlahnya dulu       
      for (int i = 0; i < jumPasien; i++) { 
            if(pasien[i][4].compareToIgnoreCase("pusing")==0)   
                k1++; 
            else if(pasien[i][4].compareToIgnoreCase("mual")==0)     
                k2++; 
            else if(pasien[i][4].compareToIgnoreCase("diare")==0)   
                k3++; 
            else if(pasien[i][4].compareToIgnoreCase("batuk")==0)        
                k4++; 
            k5=jumPasien-(k1+k2+k3+k4); 
        } 
        System.out.println("==Grafik Sakit Pasien=="); 
        System.out.print("Pusing   ");         cetakGrafik(k1); 
        System.out.print("Mual     "); cetakGrafik(k2); 
        System.out.print("Diare    "); cetakGrafik(k3); System.out.print("Batuk    ");
        cetakGrafik(k4); 
        System.out.print("Lainnya  ");         cetakGrafik(k5); 
    } 
 static void pesertaStat(){         
     int k1=0; //bpjs        
     int k2=0; //umum       
     //hitung jumlahnya dulu        
     for (int i = 0; i < jumPasien; i++) { 
            if(pasien[i][5].compareToIgnoreCase("bpjs")==0)              
                k1++; 
            else if(pasien[i][5].compareToIgnoreCase("umum")==0)           
                k2++; 
        } 
        System.out.println("==Grafik Peserta Pasien=="); 
        System.out.print("BPJS ");         cetakGrafik(k1); 
        System.out.print("Umum "); 
        cetakGrafik(k2); 
    } 
    public static void main(String[] args) {         int pilih; 
        //inisialisasi data pasien 
        pasien[0][0]="PSN1"; 
        pasien[0][1]="Adi";  
        pasien[0][2]="21"; 
        pasien[0][3]="Sby"; 
        pasien[0][4]="Pusing";
        pasien[0][5]="BPJS"; 
        pasien[1][0]="PSN2"; 
        pasien[1][1]="Abi";  
        pasien[1][2]="24"; 
        pasien[1][3]="Sby";
        pasien[1][4]="Mual";
        pasien[1][5]="BPJS"; 
        pasien[2][0]="PSN3"; 
        pasien[2][1]="Adim";  
        pasien[2][2]="31"; pasien[2][3]="Sda";    
        pasien[2][4]="Diare"; pasien[2][5]="Umum";     
        pasien[3][0]="PSN4"; pasien[3][1]="Budi";      
        pasien[3][2]="44"; pasien[3][3]="Grs";       
        pasien[3][4]="Gatal"; pasien[3][5]="BPJS";   
        pasien[4][0]="PSN5"; pasien[4][1]="Adi";      
        pasien[4][2]="11"; pasien[4][3]="Mjk";     
        pasien[4][4]="Batuk"; pasien[4][5]="Umum";    
        jumPasien=5;       
        do{ 
            System.out.println("MENU PASIEN RS SEHAT"); 
            System.out.println("1.Rekam Rawat Jalan"); 
            System.out.println("2.Statistik Umur"); 
            System.out.println("3.Statistik Asal"); 
            System.out.println("4.Statistik Jenis Sakit"); 
            System.out.println("5.Statistik Jenis Peserta"); 
            System.out.println("6.Rekap Pasien"); 
            System.out.println("7.Cari Pasien"); 
            System.out.println("8.Exit");         
            System.out.print("Pilih = "); 
            pilih = sc.nextInt(); 
            switch(pilih){ 
                case 1: System.out.println("== Pasien Rawat Jalan =="); 
	                        String 	kode 	= 
"PSN".concat(String.valueOf(jumPasien+1)); 
                        System.out.print("Nama      = "); 
                        String nama = sc.next(); 
                        System.out.print("Umur      = "); 
                        String umur = sc.next(); 
                        System.out.print("Daerah Asal: "); 
                        System.out.print("[Sby][Sda][Mjk]"); 
                        System.out.println("[Grs][Lainnya]"); 
                        System.out.print("Asal      = "); 
                        String asal = sc.next(); 
                        System.out.print("Jenis Sakit: "); 
                        System.out.print("[Pusing][Mual][Diare]"); 
                        System.out.println("[Batuk][Lainnya]"); 
                        System.out.print("Sakit     = "); 
                        String sakit = sc.next(); 
                        System.out.print("BPJS/Umum = "); 
                        String status = sc.next();   
                        rawatjalan(kode,nama,umur,asal,sakit,status);                 
                        break;              
                case 2:                   
                    umurStat();                   
                break;               
                case 3:                    
                    asalStat();                
                break;              
                case 4:                 
                    sakitStat();              
                    break;           
                case 5:               
                    pesertaStat();      
                    break;           
                case 6: 
                    rekap(); 
                    break;               
                case 7:  
                    System.out.println("==Cari Nama Pasien==");          
                    System.out.print("Masukkan Nama = "); 
                    nama = sc.next();                  
                    cari(nama); 
                    break; 
                case 8: System.out.println("Terima kasih...");               
                break; 
            } 
            System.out.println(""); 
        }while(pilih!=8); 
    } 
} 


 






   
    

    
