import java.util.Scanner;

public class pruba {
    public static void main(String[] args) {
        int base;
        int exp;
         Scanner in = new Scanner (System.in);
       System.out.println("enter an exponent number :");
       base=in.nextInt();
       System.out.println("enter an exponent number :");
       exp=in.nextInt();
       in.close();
    
        int product = 1;   // resulting product
  
       for (int i=1;i<=exp;++i) {
           product*=base;
           
           
        }
        System.out.println(product);
        
     }
}
