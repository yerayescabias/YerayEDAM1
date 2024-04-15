package arrays;
import java.util.Scanner;
public class PrintArray {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        
        int[] items;

        Scanner in= new Scanner(System.in);
        System.out.print("Enter the number of items:");
        NUM_ITEMS=in.nextInt();

        items = new int[NUM_ITEMS];
        System.out.print("Enter the value of all items (separated by space):");
        if(items.length>0){
            for (int i = 0; i < items.length; ++i){                
             items[i]=in.nextInt();
            }
        }
        in.close();
        System.out.print("The values are: [");
        for (int i = 0; i < items.length; ++i) {
            if (i == 0) {
               // Print the first item without a leading commas
               System.out.print(items[0]);
            } else {
               // Print the subsequent items with a leading commas
               System.out.print("," +items[i]);
            }
        }
        System.out.print("]");
    }
}