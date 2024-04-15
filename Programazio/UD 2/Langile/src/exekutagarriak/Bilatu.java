package exekutagarriak;
import java.util.Scanner;

import model.Langilea;
public class Bilatu {
    public static void main(String[] args) {
        String izena;
        boolean finish=true;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the name that you want to search the information: ");
        izena=in.next();
        in.close();
        
        
        for (int nav=1; nav<=Langilea.nireHamarLagunLangile().length && finish == true;nav++){
            System.out.println(Langilea.bilatu(Langilea.nireHamarLagunLangile(),izena));
            finish=false;
            
        }
        
        
        

       
    }
}
