package exekutagarriak;
import java.util.Scanner;

import model.Langilea; 
public class Seigarrena {
    public static void main(String[] args) {
        String izena;
        int soldataigo,soldata=0;
        double handiena=0.0;
        boolean finish=true;
        Langilea[] langileak= Langilea.nireHamarLagunLangile();
        System.out.printf("%10s %10s %13s %13s\n " ,"ID","Izena",  "Abizena", "Soldata" );
        System.out.println("========================================================================");
        for(int nav=1;nav<=langileak.length;nav++){
            System.out.println(Langilea.nireHamarLagunLangile()[nav-1]);
        }

        Scanner in = new Scanner(System.in);
        System.out.println("Sartu langilearen izena: ");
        izena=in.next();
        
        System.out.println(Langilea.bilatu(langileak, izena));

        for(int nav=1;nav<=langileak.length && finish==true;nav++){
            if(langileak[nav-1].getIzena().equals(izena)){
                System.out.println("Zenbateko portzentu igo nahi diozu langileari: ");
                soldataigo=in.nextInt();
                langileak[nav-1].soldataIgo(soldataigo);
                finish=false;
            }else {
                finish=true;
            }
        }
        
        System.out.printf("%10s %10s %13s %13s\n " ,"ID","Izena",  "Abizena", "Soldata" );
        System.out.println("========================================================================");
        for(int nav=1;nav<=langileak.length;nav++){
            System.out.println(langileak[nav-1]);
        }
        
        for(int nav=1;nav<=langileak.length;nav++){
            soldata+=langileak[nav-1].getSoldata();
        }
            soldata=soldata*12;
            System.out.println("Urteko soldata empresa guztiak: "+soldata);
        for(int nav=1; nav<=langileak.length;nav++){
            if(langileak[nav-1].getSoldata()>handiena){
                handiena= langileak[nav-1].getSoldata();
            }
        }
        for(int nav=1;nav<=langileak.length;nav++){
            if(langileak[nav-1].getSoldata().equals(handiena)){
                System.out.println("Soldata handiena hau da "+langileak[nav-1]);
            }
        }
        
        in.close();
    }
}
