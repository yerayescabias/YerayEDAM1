import java.util.Scanner;
public class GradesStatistics {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        double average=0;
        double finali=0;
        int max=-999999;
        int min=99999;
        int student=1;
        int i=1;
        int [] notas;
        int p=0;
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number of items:");
        NUM_ITEMS=in.nextInt();
        int nota=NUM_ITEMS;

        items = new int[NUM_ITEMS];
        
        while(i<=items.length){
        
       System.out.print("Enter the value of all items (separated by space)"+ student);
       System.out.print(":");
       System.out.println(" ");
        nota=in.nextInt();
        
        ++student;
        finali+=nota;
        notas= new int [nota];
        ++i;
        

    }
   
       in.close(); 
       average=finali/items.length;
       System.out.println("the average is:"+average);
       
    
      
      
       
    
    }


}

      

       

    
         

        
    

