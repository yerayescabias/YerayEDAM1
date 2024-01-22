package input;
import java.util.Scanner;   
public class SumProductMinMax3  {  
   public static void main (String[] args) {
      
      int number1, number2,number3,product, sum;

      // Put up prompting messages and read inputs as "int"
      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
      System.out.print("Enter first integer: ");  // No newline for prompting message
      number1 = in.nextInt();                    // Read next input as "int"
       System.out.print("Enter second integer: ");
      number2=in.nextInt();
      System.out.print("Enter third integer: ");
      number3=in.nextInt();
      in.close();  // Close Scanner

      // Compute sum
      sum = number1+number2+number3;
      product=number1*number2*number3;
      
      if (number1>number2 && number1 >number3){
         System.out.println("max is:"+number1);
      } else if (number1<number2 && number2<number3){
         System.out.println("max is:"+number3);
      }else if (number1<number2 && number2>number3)
         System.out.println("max is:"+number2);
      else if (number1==number2 && number2 == number1 && number3 ==number2 ){
            System.out.println("all the numbers have the same value");

      }
      
      if (number1<number2 && number3>number1){
         System.out.println("min is:" + number1);
      } else if (number1>number2 && number3>number2){
         System.out.println("min is:" + number2);
      } else if (number3<number1 && number2>number3){
         System.out.println("min is:" + number3);
      }
      

      // Display result
      System.out.println("The sum is: " + sum);   // Print with newline2
      System.out.println("The product is: " + product);
   }
}