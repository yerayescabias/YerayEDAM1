package loops;
public class Product1ToN {
    public static void main(String[] args) {
    long product = 1;      
    final int LOWERBOUND = 1;
    final int UPPERBOUND = 10;
    int number = LOWERBOUND;
        while (number<=UPPERBOUND){
            product*=number;
            ++number;
        }
        System.out.println("Result: "+product);

    }
}
