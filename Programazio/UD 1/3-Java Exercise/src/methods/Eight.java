package methods;
import java.util.Scanner;
public class Eight {
    public static void main(String[] args) {
        int number=0;
        boolean hasEight;
        
        int sum=0;
         Scanner in= new Scanner(System.in);
         
        
        while(number!=-1 ){
            System.out.print("Enter a positive integer (or -1 to end):");
             number=in.nextInt();
            hasEight=Eightr(number);
            if (hasEight=true){
                sum+=number;
               
                hasEight=false;
                
            }
            
        }
        in.close();
        System.out.println("The magic sum is:"+sum);
    }
    public static boolean Eightr(int number) {
        boolean hasEight=false;
        int lasthcar;
        lasthcar=number%10;
        if (lasthcar==8 && hasEight==false){
            hasEight=true;
        } 
        number=number/10;

        return hasEight;
    }
}   
