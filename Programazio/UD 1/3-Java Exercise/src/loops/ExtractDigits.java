package loops;
public class ExtractDigits {
    public static void main(String[] args) {
         int number=12345;
         int digit;
         while(number>0){
                digit=number%10;
                System.out.print(digit + " ");
                number=number/10;
            }
    }
}
