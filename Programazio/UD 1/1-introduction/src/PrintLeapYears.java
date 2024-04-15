public class PrintLeapYears {
    public static void main(String[] args){
            final int lowebound = 999;
            final int higherbound= 2010;
            int number=lowebound;
                    while (number<=higherbound){
                        if  (number % 4 == 0 || number %400==0 && number %100!=0){
                            System.out.println(number);
                        }
                        number++;
                    }
            }
}
