import java.util.Scanner;

public class progB {
    public static void main(String[] args) {
        int NUMITEMS = 300;
        String[] barazkiak = new String[NUMITEMS];
        int i = 0; // Cambio aquí
        
        Scanner in = new Scanner(System.in);

        System.out.println("Sartu itzazu gogoko dituzun barazkiak.");
        System.out.print("Gehienez 300, baina puntu batez amaitu dezakezu: ");

            while (i < NUMITEMS) {                
                barazkiak[i] = in.next();
                if (barazkiak[i].equals(".")) {
                    break; // Terminar el bucle cuando el usuario ingrese "."
                }
                i++; // Incrementar el contador
            }

        in.close();
        
        for (int zenbakiak = 0; zenbakiak < i; zenbakiak++) {  // Cambio en la lógica aquí          
            System.out.println((zenbakiak + 1) + "- " + barazkiak[zenbakiak]);
        }            
    }
}
