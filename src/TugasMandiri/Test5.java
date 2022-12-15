
package TugasMandiri;
import java.util.Scanner; 

public class Test5 {
    static void rekursi(int i){

        System.out.print(i+",");

        if(i>=8){

            System.out.print("0,");

            return;

        }

        System.out.print(i+",");

        rekursi(i+1);

        System.out.print(i+",");

        rekursi(i+2);

    }
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Insert a number: ");
int number = input.nextInt();
input.nextLine(); // This line you have to add (It consumes the \n character)
System.out.print("Text1: ");
String text1 = input.nextLine();
System.out.print("Text2: ");
String text2 = input.nextLine();
    
}}
