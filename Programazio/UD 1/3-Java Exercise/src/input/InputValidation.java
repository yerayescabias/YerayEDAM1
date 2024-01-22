package input;
import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args) {
        int number1;
        boolean Isvalid;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number:");
        number1=in.nextInt();
         Isvalid=false; //pones q es falso 
        do{

            if (number1>=0 && number1<=10 || number1>=90 && number1<=100) {
            Isvalid = true;   //Lo vuelves verdadero ya que cumple los parametros
            System.out.println("You have entered="+number1);
            } else { 
            System.out.println("Invalid input, try again...");  
              System.out.print("Enter the number:"); //Haces que vuelva a meter el numero
             number1=in.nextInt();
            
            }   
        
        } while (!Isvalid);// si es Isvalid falso se tiene q repetir
         in.close();
       

        
      

    }
}
