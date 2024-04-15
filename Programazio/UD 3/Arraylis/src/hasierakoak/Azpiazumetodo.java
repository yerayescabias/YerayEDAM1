package hasierakoak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Azpiazumetodo {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<String>();
        Iterator<String> alit;
        Scanner in= new Scanner(System.in);
        System.out.println("Zenbat izena jarri nahi dituzu: ");
        int zenbat=in.nextInt();
        
        for(int i=0;i<zenbat;i++){
            System.out.println("Sartu izena: ");
            String izena=in.next();
            al.add(i,izena);
        }
        alit=al.iterator();
        System.out.println("zein balio bilatu nahi duzu: ");
        String bilatu = in.next();
        if (al.indexOf(bilatu) == -1) {
        System.out.println("Ez dago bilatu nahi duzun datua");
        } else{
        if (al.contains(bilatu)) {
            System.out.println("Zuk bilatu nahi duzun datuaren posizioa " + (al.indexOf(bilatu) + 1) + " da.");
            if (al.indexOf(bilatu) != al.lastIndexOf(bilatu)) {
            System.out.println("Bat baino gehiago dago");
        } else {
            System.out.println("Bakarra dago");
        }
        
    }
    }
    in.close();
}
}

