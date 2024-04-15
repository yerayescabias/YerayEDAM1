package input;
import java.util.Scanner;
public class AverageWithInputValidation  {
    public static void main(String[] args) {
        int number1;
        boolean Isvalid;
        int Studenno=1;
        double average;
        int sum=0;
        final int MAX_STUDEN=3;
            Scanner in= new Scanner(System.in);
           
         do{
            System.out.printf("Enter the mark (0-100) for student "+Studenno);
            System.out.print(":");
            number1=in.nextInt();
             Isvalid=false; 
            if (number1>=0 && number1<=100){
                Isvalid=true;
                sum+=number1;
                ++Studenno;
                
            }else {
                    Isvalid=false;
                    System.out.println("Invalid input, try again...");
                     System.out.println("Enter the mark (0-100) for student "+Studenno);
                    System.out.print(":");
                    number1=in.nextInt();

            }
          
         }while(Studenno<=MAX_STUDEN && !Isvalid);
          in.close();
        average=sum/3.0;
         System.out.println("the average is:"+average);
    }
}
