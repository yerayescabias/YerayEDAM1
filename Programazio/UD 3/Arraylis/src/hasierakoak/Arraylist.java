package hasierakoak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arraylist {
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
        
        if( al.indexOf(bilatu) != -1){
            if( al.contains(bilatu)){
                System.out.println(al.indexOf(bilatu));
            }
            else /* if(al.contains(bilatu)== false) */{
                System.out.println("Ez dago ");
            }
        
        }
        in.close();
    }
}
