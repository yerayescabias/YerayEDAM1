package input;
import java.util.Scanner;   

public class CylinderComputation     { 
   public static void main (String[] args) {
      double radius,height,surfaceArea,volume,baseArea;

      Scanner in = new Scanner(System.in);  
      System.out.print("Enter radius integer: "); 
      radius = in.nextDouble();   
      System.out.print("Enter height integer: "); 
      height = in.nextDouble();                 
      in.close();  

      baseArea = Math.PI * radius * radius;
      surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
      volume = baseArea * height;

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("The surface area is: %.2f%n", surfaceArea);   
      System.out.printf("The volume is: %.2f%n", volume);
      System.out.printf("The base area is: %.2f%n", baseArea);
   }
}