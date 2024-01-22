package AzterketaArrayList.exekutagarriak;
import AzterketaArrayList.model.Mailegua;
import AzterketaArrayList.model.Liburua;
import java.util.Scanner;

public class Menua {

    private static Scanner in = new Scanner(System.in);

    private static Liburua[] kat; //Liburua.getKatalogoa() metodoari deituta beteko dugu array hau. 
                                        //Beraz, 1000 elementuko arraya izango da.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        kat=Liburua.getKatalogoa();

        int aukera = 0;
        do {
            System.out.println();
            System.out.println("LIBURUTEGIA");
            System.out.println("====================================");
            System.out.println("1.- Katalogoa ikusi");
            System.out.println("2.- Liburua mailegatu");
            System.out.println("3.- Liburua itzuli");
            System.out.println("4.- Irten");
            System.out.println("");
            System.out.print("Aukeratu zenbaki bat: ");
            aukera = sc.nextInt();
            System.out.println("");
            switch (aukera) {
                case 1:
                    katalogoaIkusi();
                    break;
                case 2:
                    liburuaMailegatu();
                    break;
                case 3:
                    liburuaItzuli();
                    break;
                case 5:
                    System.out.println("Eskerrik asko programa hau erabiltzearren.");
                    break;
                default:
                    System.out.println("Aukera okerra. Saiatu berriz.");
            }
        } while (aukera != 4);
    }

    /**
     * Liburuen katalogoa inprimatzen du kontsolan metodo honek.
     * Formateo string hau erabili ezazu: "%3s %-10s %-25s %-24s %-12s %6s %-3s\n"
     */
    public static void katalogoaIkusi() {

        System.out.printf("%10s %10s %10s %10s \n","Egilea","Izenburua","Hizkuntza","Urtea");
        for(int nav=1;nav<=kat.length;nav++){
            if(kat[nav-1] != null){
                System.out.println(kat[nav-1]);
            }

        }
    }
    

    /**
     * Ikusi exekuzio adibidea. Bestalde,
     * - Sartutako kodea existitzen ez bada: "Ez daukagu katalogoan kode hori daukan libururik."
     * - Liburua dagoeneko mailegatuta badago: "Sentitzen dugu baina momentu honetan liburu hori mailegatuta dago."
     * - Mailegu topera heldu bagara: "Liburu honen mailegu kopuru maximora heltzeagatik ezin izan da mailegatu. Hitz egin ezazu liburuzainarekin."
     */
    public static void liburuaMailegatu() {
        //OSATU EZAZU METODO HAU                
    }
    
    /**
     * Azken maileguaren itzuleraData bete eta liburua erabilgarri dagoela markatzen du.
     */
    public static void liburuaItzuli() {
        
    }

}
