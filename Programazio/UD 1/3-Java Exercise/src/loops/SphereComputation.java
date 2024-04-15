package loops;
import java.util.Scanner;   

public class SphereComputation    { 
   public static void main (String[] args) {
      double radius,surfaceArea,volume;

      Scanner in = new Scanner(System.in);  
      System.out.print("Enter radius integer: "); 
      radius = in.nextDouble();                    
      in.close();  

      surfaceArea = 4 * Math.PI * radius * radius;
      volume = (4 /3) * Math.PI * radius * radius * radius;
      

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("The surface area is: %.2f%n", surfaceArea);   
      System.out.printf("The volume is: %.2f%n", volume);
   }
}