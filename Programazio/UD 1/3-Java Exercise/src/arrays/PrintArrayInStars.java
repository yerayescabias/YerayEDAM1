package arrays;
import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        int sum=0;

        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number of items:");
        NUM_ITEMS=in.nextInt();

        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space):");
       
        // Print array in "index: number of stars" using a nested-loop
        // Take note that rows are the array indexes and columns are the value in that index
        if(items.length>0){

         for (int i=0;i<items.length;++i){
            items[i]=in.nextInt();
         }
             for (int idx = 0; idx < items.length; ++idx) {  // row
                
                System.out.print(idx + ": ");
            // Print value as the number of stars
                
                 for (int starNo = 1; starNo <= items[idx]; ++starNo) {  // column
                    System.out.print("*");
                    sum=1+idx;
                    
                }
                
                System.out.println(" "+sum );
                
                System.out.println(" ");
                sum=0;
         }
        }
        in.close();
    }   

        
}

