package methods;
import java.util.Scanner;
public class Exponent {
   public static void main(String[] args) {
      // Declare variables
      int exp;    // exponent (non-negative integer)
      int base;
     int emaitza;
  // base (integer)
      // Prompt and read exponent and base
       Scanner in = new Scanner (System.in);
       System.out.println("enter a base number :");
       base=in.nextInt();
       System.out.println("enter an exponent number :");
       exp=in.nextInt();
       in.close();
       emaitza=exponent(base, exp);
     System.out.println(base + " raises to the power of " + exp + " is: " + emaitza);
      
   }

   // Returns "base" raised to the power "exp"
   public static int exponent(int base, int exp) {
      int product = 1;   // resulting product

      for(int i=1;i<=exp;++i){
         product*=base;
      }
      return product;
   }
}