import java.util.Scanner;

public class ProgB {
    public static void main(String[] args) {
        int NUMITEMS = 300;
        String[] barazkiak = new String[NUMITEMS];
        int i = 0;
        boolean puntua =true;
        
        Scanner in = new Scanner(System.in);

        System.out.println("Sartu itzazu gogoko dituzun barazkiak.");
        System.out.print("Gehienez 300, baina puntu batez amaitu dezakezu: ");

            while (i < NUMITEMS && puntua==true ) {                
                barazkiak[i] = in.next();
                if (barazkiak[i].equals(".")) {
                    puntua=false; 
                }
                i++; 
            }

        in.close();
        System.out.println("BARAZKIAK");
        System.out.println("=================");
        for (int zenbakiak = 0; zenbakiak < i-1; zenbakiak++) {         
            System.out.println((zenbakiak + 1) + "- " + barazkiak[zenbakiak]);
        }            
    }
}
