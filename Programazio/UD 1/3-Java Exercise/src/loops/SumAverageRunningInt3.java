package loops;
public class SumAverageRunningInt3 {
    public static void main(String[] args) {
        final int LOWERBOUND=1;
        final int HIGHERBOUND=100;
        int sum=0;
        int number= LOWERBOUND;
        do {
            sum +=number;
            ++number;
        }while (number<=HIGHERBOUND);
        
        System.out.println("the sum of 1 to 100 is "+ sum);
        double average;
        average=(LOWERBOUND+HIGHERBOUND)/2.0;
        System.out.println("the average of 1 to 100 is "+ average);

    }
}
