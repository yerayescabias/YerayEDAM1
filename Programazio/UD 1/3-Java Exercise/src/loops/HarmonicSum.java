package loops;
public class HarmonicSum  {
    public static void main(String[] args) {
      final int MAX_DENOMINATOR=50000;
        double sumaIaD=0;
         double sumaDaI=0;
        double denominator=1.0;
        double number=MAX_DENOMINATOR;
         double absdiff;
      while (denominator<=MAX_DENOMINATOR){

        sumaIaD+=(1.0/denominator);
        ++denominator;
        
     }
     System.out.println("the sum from left to right is:" +sumaIaD);
   
     while(number>=1.0){
        
        sumaDaI+=(1.0/number);
        --number;
        }
        System.out.println("the sum from right to left is:" +sumaDaI);
        absdiff=sumaDaI-sumaIaD;
        System.out.println("the difference betwen them is "+ absdiff); 
    }
    
}
 