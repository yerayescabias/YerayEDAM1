package arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        final int NUM_ITEMS;
        int[] items;
        double average = 0;
        double finali = 0;
        int student = 1;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of items:");
        NUM_ITEMS = in.nextInt();
       

        items = new int[NUM_ITEMS];
        for (int i = 1; i <= items.length; ++i) {

            System.out.print("Enter the value of all items (separated by space)" + student);
            System.out.print(":");
            System.out.println(" ");
            items[i-1] = in.nextInt();

            ++student;
            finali += items[i-1];

        }

        in.close();
        average = finali / items.length;
        System.out.println("the average is:" + average);
        int max = items[0];
        int min=items[0];
        for (int o = 1; o < items.length; ++o) {
            if (items[o] > max) {
                  max = items[o];
            } 
            if (items[o] < min) {
                 min= items[o];
            }
        }
        System.out.println(+max);
        System.out.println(+min);

    }
}
