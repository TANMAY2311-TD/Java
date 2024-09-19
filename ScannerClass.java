
package ScannerC;
import java.util.Scanner;

public class ScannerClass {

public static void main(String[] args) {
        
        String name;
        
            Scanner input = new Scanner(System.in); {
            System.out.print("Enter your name : ");
            name = input.nextLine();
            System.out.print("Enter your roll no. : ");
            name = input.nextLine();
            
            System.out.println("My name is : " + name);
            System.out.println("My roll no. is : " + name);
        }   
    }
}
