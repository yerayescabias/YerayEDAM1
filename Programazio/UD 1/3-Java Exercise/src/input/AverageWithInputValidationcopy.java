package input;
    
   import java.util.Scanner;
   public class AverageWithInputValidationcopy {
      public static void main(String[] args) {

          final int NUM_STUDENTS = 3;
          int numberIn=0;
          boolean isValid;   
          int sum = 0;
          double average;
          Scanner in= new Scanner(System.in);
          for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
              // Prompt user for mark with input validation
              System.out.printf("Enter the mark (0-100) for student "+studentNo);
              System.out.print(":");
              numberIn=in.nextInt();
              isValid = false;   // reset assuming input is not valid
              do {
               if (numberIn>=0 && numberIn<=100){
                  isValid=true;
                  
              }else {
                      isValid=false;
                      System.out.println("Invalid input, try again...");
                      System.out.print("Enter the mark (0-100) for student "+studentNo);
                        System.out.print(":");
                      numberIn=in.nextInt();
  
              }
                } while (!isValid);
    
              sum += numberIn;
            
            
         }in.close();        
          average=sum/3.0;
         System.out.println("the average is:"+average);
   } 
}     

 
 