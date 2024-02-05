package loops;

    
import java. util.Scanner;
public class ReverseInt  {
    public static void main(String[] args) {
        int number1,intdigit;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter positive integer:");
        number1=in.nextInt();
        in.close();
        while(number1>0){
            intdigit=number1%10;
            number1/=10;
              System.out.print(intdigit);  
        }

      
            

    }
}

