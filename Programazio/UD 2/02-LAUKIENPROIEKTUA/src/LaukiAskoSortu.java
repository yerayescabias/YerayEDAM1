import java.util.Scanner;
public class LaukiAskoSortu {
    public static void main(String[] args) {
        Laukia[] Laukiak;
        int items;
        Scanner in = new Scanner(System.in);
        System.out.print("Zenbat lauki sortu nahi dituzu? ");
        items = in.nextInt();
        int a=1;
        Laukiak=new Laukia[items];
        for(int i=0;i<=Laukiak.length-1;i++){
            int zabalera,altuera;
            System.out.println(a+" Laukiaren datuak");
            System.out.print("zabalera:" );
            zabalera=in.nextInt();
            System.out.print("altuera:" );
            altuera=in.nextInt();
            ++a;
            Laukiak[i]= new  Laukia(zabalera, altuera);
            
        }
        in.close();
        System.out.printf("%10s %15s %10s %10s %15s %10s\n " ,"laukia","zabalera",  "altuera", "azalera" ,"perimetroa" ,"mota");
        System.out.println("=================================================================================");
        int o=1;
        for(int i=0;i<Laukiak.length;i++){
            
        System.out.println("        "+o+"              "+Laukiak [i].getZabalera()+"            "+Laukiak [i].getAltuera()+"         "+Laukiak [i].getAzalera()+"          "+Laukiak [i].getPerimetroa()+"            "+Laukiak [i].getMOta() );
        ++o;
        }
    }
}
