package exekutagarriak;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

import model.*;

public class DatuakAztertu {
    private static ArrayList<Bezeroa> kontaktuak;
    private static ArrayList<Produktua> produktukatalogo;
    private static ArrayList<Erosketa> erosketenZerrenda;

public static void main(String[] args) {
        System.out.println(fakturazioOsoa()+"\n");
        erosketenZerrenda();
        System.out.println("Gure bezerorik onena hau da: \t"+ bezerorikonena());
        helbideaBilatu();

}


    

    public static void initialize(){

        kontaktuak = new ArrayList<Bezeroa>();

        kontaktuak.add(new Pertsona(1, "Hondartza Pasialekua z/g ZARAUTZ", "Karlos", "Argiñano", "kargi@zarautz.eus"));

        kontaktuak.add(new Pertsona(2, "Mirakontxa z/g. DONOSTIA","Martin", "Berasategi",  "mbera@donostia.eus"));

        String imeilak[]={"idazkaria@uni.eus","zuzendaria@uni.eus"};

        kontaktuak.add(new Enpresa(3,"Otaola Hiribidea 29","CIFP Uni Eibar-Ermua LHII","Uni Eibar-Ermua",imeilak));



        produktukatalogo= new  ArrayList<Produktua> ();

        produktukatalogo.add(new Produktua("C01", "Toshiba Satellite Pro", 450));

        produktukatalogo.add(new Produktua("C02", "HP Pavilion", 600));

        produktukatalogo.add(new Produktua("T01", "Samsung Galaxy", 210));

        produktukatalogo.add(new Produktua("T02", "iPhone XX", 1300));



        erosketenZerrenda = new ArrayList<Erosketa>();
        


        /*********** EROSKETA *************/

        ArrayList<Produktua> lehenErosketaProduktuak = new ArrayList<>();

        lehenErosketaProduktuak.add(produktukatalogo.get(0));

        lehenErosketaProduktuak.add(produktukatalogo.get(1));

        lehenErosketaProduktuak.add(produktukatalogo.get(2));

        ArrayList<Integer> lehenErosketaUnitateak = new ArrayList<>();

        lehenErosketaUnitateak.add(4);

        lehenErosketaUnitateak.add(2);

        lehenErosketaUnitateak.add(3);

        erosketenZerrenda.add(new Erosketa("E18-01", "2018-09-25", kontaktuak.get(1), lehenErosketaProduktuak,

                lehenErosketaUnitateak, 3630));
        



        /*********** EROSKETA *************/

        ArrayList<Produktua> bigarrenErosketaProduktuak = new ArrayList<>();

        bigarrenErosketaProduktuak.add(produktukatalogo.get(0));

        ArrayList<Integer> bigarrenErosketaUnitateak = new ArrayList<>();

        bigarrenErosketaUnitateak.add(15);

        erosketenZerrenda.add(new Erosketa("E18-02", "2018-10-24", kontaktuak.get(0),

                bigarrenErosketaProduktuak, bigarrenErosketaUnitateak, 6750));



        /*********** EROSKETA *************/

        ArrayList<Produktua> hirugarrenErosketaProduktuak = new ArrayList<>();

        hirugarrenErosketaProduktuak.add(produktukatalogo.get(0));

        hirugarrenErosketaProduktuak.add(produktukatalogo.get(3));

        ArrayList<Integer> hirugarrenErosketaUnitateak = new ArrayList<>();

        hirugarrenErosketaUnitateak.add(1);

        hirugarrenErosketaUnitateak.add(1);

        erosketenZerrenda.add(new Erosketa("E19-01", "2019-01-09", kontaktuak.get(0),

                hirugarrenErosketaProduktuak, hirugarrenErosketaUnitateak, 660));



        /*********** EROSKETA: 4 *************/

        ArrayList<Produktua> laugarrenErosketaProduktuak = new ArrayList<>();

        laugarrenErosketaProduktuak.add(produktukatalogo.get(0));

        laugarrenErosketaProduktuak.add(produktukatalogo.get(1));

        laugarrenErosketaProduktuak.add(produktukatalogo.get(3));

        ArrayList<Integer> laugarrenErosketaUnitateak = new ArrayList<>();

        laugarrenErosketaUnitateak.add(3);

        laugarrenErosketaUnitateak.add(1);

        laugarrenErosketaUnitateak.add(1);

        erosketenZerrenda.add(new EpekaErosketa("E19-02", "2019-02-09",

                kontaktuak.get(1), laugarrenErosketaProduktuak, laugarrenErosketaUnitateak, 3250, 300));



        /*********** EROSKETA: 5 *************/



        erosketenZerrenda.add(new Erosketa("E21-01", "2021-01-17",

                kontaktuak.get(2), null, null, 15000));



        /*********** EROSKETA 6 *************/

        erosketenZerrenda.add(new Erosketa("E22-01", "2022-01-18",

                kontaktuak.get(2), null, null, 6600));



        /*********** EROSKETA 7 *************/

        erosketenZerrenda.add(new EpekaErosketa("E22-02", "2022-02-20",

                kontaktuak.get(0), null, null, 135000,8000));




        /*********** EROSKETA 8 *************/

        erosketenZerrenda.add(new Erosketa("E22-03", "2022-02-21",

                kontaktuak.get(2), null, null, 7550));



        /*********** EROSKETA 9 *************/

        erosketenZerrenda.add(new EpekaErosketa("E22-04", "2022-02-27",

                kontaktuak.get(1), null, null, 32500,3000));

        /*********** EROSKETA 10 *************/

        erosketenZerrenda.add(new Erosketa("E23-01", "2023-01-02",

                kontaktuak.get(2), null, null, 2560));



        /*********** EROSKETA 11 *************/

        erosketenZerrenda.add(new Erosketa("E23-02", "2023-02-02",

                kontaktuak.get(0), null, null, 1300));

        /*********** EROSKETA 12 *************/

        erosketenZerrenda.add(new Erosketa("E23-03", "2023-02-02",

                kontaktuak.get(1), null, null, 1050));

        /*********** EROSKETA 13 *************/

        erosketenZerrenda.add(new EpekaErosketa("E23-04", "2023-02-12",

                kontaktuak.get(2), null, null, 33800,3000));


}
    public static void erosketenZerrenda(){
        initialize();
        System.out.println("Kodea\t Data\t Bezeroa\t Guztira\t");
        System.out.println("-------------------------------------------------------");
        Iterator<Erosketa>mauricio=erosketenZerrenda.iterator();
        while(mauricio.hasNext()){
                Erosketa a= mauricio.next();
                System.out.println(String.valueOf(a.getKodea())+"\t"+ a.getData()+"\t"+ a.getBezeroa().getKodea()+"\t"+a.getGuztira());

        }
}
public static double fakturazioOsoa(){
        initialize();
        double total=0;
        Iterator<Erosketa>mauricio=erosketenZerrenda.iterator();
        while(mauricio.hasNext()){
        Erosketa a= mauricio.next();
        total+=a.getGuztira();

        }

        return total;

}
        public static Bezeroa bezerorikonena(){
        initialize();
        int bezeroa1=0;
        int bezeroa2=0;
        int bezeroa3=0;
        
        Iterator<Erosketa>mauricio=erosketenZerrenda.iterator();
        while(mauricio.hasNext()){
                Erosketa a =mauricio.next();
                if(a.getBezeroa().getKodea()==1){
                        bezeroa1++;
                }else if(a.getBezeroa().getKodea()==2){
                        bezeroa2++;
                }else if(a.getBezeroa().getKodea()==3){
                        bezeroa3++;
                }
        }
        if(bezeroa1>bezeroa2 && bezeroa1>bezeroa3){
                return kontaktuak.get(0);
        }else if(bezeroa2>bezeroa1 && bezeroa2> bezeroa3){
                return kontaktuak.get(1);
        }else if(bezeroa3>bezeroa1 && bezeroa3> bezeroa2){
                return kontaktuak.get(2);
        }else{
                return null;
        }       

}
public static void helbideaBilatu(){
        initialize();
        int kpodea=0;
        boolean finishh=true;
        Scanner in = new Scanner(System.in);
        System.out.print("Zein bezero bilatu nahi duzu: ");
        kpodea=in.nextInt();
        if(kpodea>0 || kpodea<4){
                Iterator<Bezeroa> mort= kontaktuak.iterator();
                while(mort.hasNext() && finishh){
                        Bezeroa b=mort.next();
                        if(b.getKodea()==kpodea ){
                                System.out.println(b.getHelbidea());
                                finishh=false;
                                
                        }
                }
        }else{
                System.out.println("Zenbaki okerra");
        }
        in.close();
}
public static void erosketabezeroka(){
        initialize();
        

}
public static void erosketakopuruaUrteetaHilabetekoa(){

}
}
