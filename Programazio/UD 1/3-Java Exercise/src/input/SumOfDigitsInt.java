package input;
import java.util.Scanner;
public class SumOfDigitsInt {
    public static void main(String[] args) {
         int number,sum=0;
        Scanner in= new Scanner(System.in);
         System.out.print("Enter positive integer:");
        number=in.nextInt();
        in.close();
        while(number>0){
            sum+=(number%10);
            number=number/10;

        }
        System.out.print("the sum of the positive integer:"+sum);
    }
}
   