package exekutagarriak;
import java.util.ArrayList;

import model.*;

public class KarlosSortu {
    public static void main(String[] args) {
            Bezeroa karlos = new Pertsona(1,"Hondartza Pasialekua z/g ZARAUTZ","Karlos","Argiñano","kargi@uni.eus");
        System.out.println("karlos => " + karlos);
        
        Produktua toshiba = new Produktua("C01","Toshiba Satellite Pro",450);
        System.out.println("toshiba => " + toshiba);    
        
        
        ArrayList<Produktua> erosketaHonetakoproduktuak = new ArrayList<>();
        erosketaHonetakoproduktuak.add(toshiba);
        ArrayList<Integer> erosketaHonetakounitateak = new ArrayList<>();
        erosketaHonetakounitateak.add(15);
        Erosketa gaurkoErosketa = new Erosketa("E18-02","2018-10-24",karlos,
                            erosketaHonetakoproduktuak,erosketaHonetakounitateak,6750);
        System.out.println("gaurkoErosketa =>"+gaurkoErosketa+"\n");
        System.out.println("Orain formato luzean:");
        System.out.println(gaurkoErosketa.toStringLuzea());
        
        if (gaurkoErosketa.guztiraEgiaztatu())
            System.out.println("Datu zuzenak.");
        else
            System.out.println("'guztira' atributua ez dator bat produktuen zerrendak dioenarekin."); 
    }
}
