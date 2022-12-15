
package Materi;
 import java.util.Scanner;
public class Mater03_Konvesinilai {
    public static void main(String[] args) {
    int xyz[] = 
new int[9];

        xyz[0]=0;

        xyz[1]= 
1
 ;

        for(int i= 
1
 ; i<10; i++){

            xyz[i] = xyz[i-1]+ 
xyz[i-2];

        }

        for (int i = 0; 
i < 10
 ; i++) { 

            System.out.print(xyz[i]+" ");

        }
}
}
