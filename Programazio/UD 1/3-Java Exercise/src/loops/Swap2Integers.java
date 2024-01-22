package loops;
import java. util.Scanner;
public class Swap2Integers {
    public static void main(String[] args) {
        int number1,number2,temp;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter first integer:");
        number1=in.nextInt();
        System.out.print("Enter first integer:");
        number2=in.nextInt();
        in.close();
        temp=number1;
        number1=number2;
        number2=temp;
        System.out.println("first integer is:"+number1);  
        System.out.println("Second integer is:"+number2);
            

    }
}
