import java.util.Scanner;
public class Izenak {
    public static void main(String[] args) {
        final int NUM_ITEMS=8;
        String [] items =new String[NUM_ITEMS];
        

        Scanner in = new Scanner(System.in);
         System.out.print("Sartu itzazu gogoko dituzun barazkiak. ");
        System.out.print("Gehienez 300, baina puntu batez amaitu dezakezu: ");
        if(items.length>0){
            for (int i = NUM_ITEMS; i>=0;){                
                items[i]=in.next();
            }
        }
       
        
       
        
        
        
    }   
}  
