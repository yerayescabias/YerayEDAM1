import java.util.Scanner;
public class LaukiBatSortu {
    public static void main(String[] args) {
        int altuera;
        int zabalera;
        char c;
        Scanner in= new Scanner(System.in);
        System.out.print("Altuera bat sartu: ");
        altuera=in.nextInt();
        System.out.print("Zabalera bat sartu: ");
        zabalera=in.nextInt();

        
        
        Laukia l1= new Laukia(zabalera, altuera);
        System.out.println("Lauki karratua sortu duzu: =>" +l1);
        System.out.println("Hona marrazkia beteta:");
        l1.marraztuBeteta();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Hona marrazkia hutsik:");
        l1.marraztuHUtsik();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Zein ikurrekin nahi duzu laukia bete?");
        c=in.next().charAt(0);
        in.close();
        l1.marraztuBEteta(c);
    }
}
