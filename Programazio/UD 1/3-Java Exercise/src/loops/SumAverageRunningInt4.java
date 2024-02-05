package loops;
public class SumAverageRunningInt4 {
    public static void main(String[] args) {
        final int LOWERBOUND=111;
        final int HIGHERBOUND=8899;
        int count=0;
        int number= LOWERBOUND;
        do {
            count +=number;
            ++number;
        }while (number<=HIGHERBOUND);
        
        System.out.println("the sum of 1 to 100 is "+ count);
        double average;
        average=(LOWERBOUND+HIGHERBOUND)/2.0;
        System.out.println("the average of 1 to 100 is "+ average);

    }
}
