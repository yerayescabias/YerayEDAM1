package input;
import java.util.Scanner;   

public class CircleComputation   { 
   public static void main (String[] args) {
      double radius,diameter,area,circumference;

      Scanner in = new Scanner(System.in);  
      System.out.print("Enter radius integer: "); 
      radius = in.nextDouble();                    
      in.close();  

      diameter= 2.0*radius;
      area=Math.PI* radius*radius;
      circumference = 2.0 * Math.PI * radius;
      

      // Print results using printf() with the following format specifiers:
      //   %.2f for a double with 2 decimal digits
      //   %n for a newline
      System.out.printf("The diameter is: %.2f%n", diameter);   
      System.out.printf("The area is: %.2f%n", area);
      System.out.printf("the circumference is : %.2f%n", circumference);
   }
}