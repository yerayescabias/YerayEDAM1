package loops;
public class SumAverageRunningInt6 {
    public static void main(String[] args) {
        final int LOWERBOUND=1;
        final int HIGHERBOUND=100;
         int Sumodd=0;
         int Sumeven=0;
         int Absdifft;
        int number= LOWERBOUND;
       while(number<=HIGHERBOUND){
        if (number %2==0){
            Sumeven+=number;
            ++number;
        } else {
            Sumodd+=number;
            ++number;
            }
        }
        System.out.println("from 1 to 100 the sum of all odd numbers is "+Sumodd);
        System.out.println("from 1 to 100 the sum of all even numbers is "+Sumeven);

        if (Sumeven>Sumodd){
            Absdifft=Sumeven-Sumodd;
        }else{
            Absdifft=Sumodd-Sumeven;

        }
         System.out.println("And the difference between odd and even is " + Absdifft);

    }
}
