package herentziaabstrakzioarekin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hiztegia {
    
    public static ArrayList<String> izenArruntak= new ArrayList<String>();
    public static ArrayList<String> adjetiboak= new ArrayList<String>();

    public static String getKonposatua(){
        izenArruntak.addAll(Arrays.asList("Burua","Belarria","Zangoa","Gorputza","Ahoa","Eskua"));
        adjetiboak.addAll(Arrays.asList("Handia","Txikia","Luzea","Zikina","Pozoitsua","Liraina","Ederra","Indartsua"));
        Random random= new Random();
        int randomINT = random.nextInt(izenArruntak.size());
        int randomm= random.nextInt(adjetiboak.size());
        return izenArruntak.get(randomINT)+adjetiboak.get(randomm);
    }
}
