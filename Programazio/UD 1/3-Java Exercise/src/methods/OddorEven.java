package methods;
import java.util.Scanner;
public class OddorEven {
   public static void main(String[] args) {
      // Declare variables
      int number;    // exponent (non-negative integer)
      boolean OddEvenTest;
  
       Scanner in = new Scanner (System.in);
       System.out.print("enter a base number :");
       number=in.nextInt();
       in.close();
      
      if (OddEvenTest=false){
         System.out.println(number+": is an even number");
      }else{
         System.out.println(number+": is an odd number");
      }
    }

   // Returns "base" raised to the power "exp"
   public static int Odd (int number,boolean OddEvenTest) {
      if(number %2==0){
         OddEvenTest=false;
      } else{
          OddEvenTest=true;
      }  

      return number;
   }
}
