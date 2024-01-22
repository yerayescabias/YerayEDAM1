public class ThreeFiveSevenSum{ 
    public static void main(String[] args){
        final int LOWEBOUND = 1;
        final int HIGHERBOUND= 1000;
        int suma= 0;
        
        int number=LOWEBOUND;
                while (number<=HIGHERBOUND){
                    if  ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) &&
                    (number % 15 != 0 || number % 21 != 0 || number % 35 != 0 || number % 105 != 0)) {
                    suma +=  number;
                      }
                    number++;
                    
                }   
        
            
            System.out.println("The sum of all the integres divisible by 3,5 or 7 are these: " +suma);
        }
}       