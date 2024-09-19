//TANMAY DAS;
package ScannerB;
import java.util.Scanner;

public class ScannerB {
public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int x, y;

      System.out.print("Enter the value of X: ");
      x = sc.nextInt();

      System.out.print("Enter the value of Y: ");
      y = sc.nextInt();

      System.out.println("Sum of X and Y is " + (x + y));
      sc.close();    
   }
}
