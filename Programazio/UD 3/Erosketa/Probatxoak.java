
import java.time.LocalDate;
import java.util.Scanner;

public class Probatxoak {

    public static void main(String[] args) {
        String data;
        Scanner in = new Scanner(System.in);
        System.out.println("sartu data uuuu-mm-dd formatuan");
        data = in.nextLine();
        LocalDate idDataUser = LocalDate.parse(data);
       
        // LocalDate idDataLau (LocalDate) strDataBat; Ez du funtzionatzen
        try {
            String strDataBat = "2024-01-23";
            LocalDate idDataBat = LocalDate.now();
            LocalDate idDateBI = LocalDate.parse(strDataBat);
            LocalDate idDatahiru = LocalDate.of(2024, 1, 23);
            System.out.println("User input date:"+ idDataUser);
            
        } catch (Exception e) {
            System.out.println("Errorea data formatoan");
         System.out.println("Sartu duzun hurrengo eguna: "+ idDataUser.plusDays(1));
        }
        
    }
}