package exekutagarriak;
import java.util.Scanner;

import model.Langilea;

public class Bederatzi{
    public static void main(String[] args) {
        int aukeratu;
        String a=" ";
        boolean finish=true;
        Langilea[] langileak;
        
        
        langileak= new Langilea[100];
        for(int nav=1;nav<=Langilea.nireHamarLagunLangile().length;nav++){
            langileak[nav-1]= Langilea.nireHamarLagunLangile()[nav-1];
        }
        
        Scanner in = new Scanner(System.in);
        do{
        System.out.println("==================");
        System.out.println("===== MENUA ======");
        System.out.println("==================");
        System.out.println("0.-Irten");
        System.out.println("1.- Langile guztiak ikusi");
        System.out.println("2.- Langilea kontratatu");
        System.out.println("3.- Langilea jubilatu");
        System.out.println("4.- Soldatak igo");
        System.out.print("Aukeratu:");
        aukeratu=in.nextInt();
        
        switch (aukeratu) {
            case 1:
                langileakInprimatu(langileak, finish);
                System.out.println("Jarraitu nahi duzu(y/n)?");
                a=in.next().toLowerCase();
                break;
            case 2:
                langileBerria(langileak,finish);
                System.out.println("Jarraitu nahi duzu(y/n)?");
                a=in.next().toLowerCase();
                break;
            case 3:
                langileaJubilatu(langileak,finish);
                System.out.println("Jarraitu nahi duzu(y/n)?");
                a=in.next().toLowerCase();
                break;
            case 4:
                soldatIGO(langileak, finish);
                System.out.println("Jarraitu nahi duzu(y/n)?");
                a=in.next().toLowerCase();
            case 0:
                break;
                
            default:
                System.out.println("WRONG NUMBER ENTER AGAIN");
                System.out.println("Jarraitu nahi duzu(y/n)?");
                a=in.next().toLowerCase();  
                break;
        }
        }while(a.equals("y"));
        in.close(); 
    }
    public static void langileBerria(Langilea[] langileak, boolean finish){
            
        Scanner in = new Scanner(System.in);
            String izena,abizena;
            int id;
            double soldata;
            System.out.println(" Langilearen ID jarri: ");
            id=in.nextInt();
            System.out.println(" Langilearen izena  jarri: ");
            izena=in.next();
            System.out.println(" Langilearen abizena jarri: ");
            abizena=in.next();
            System.out.println(" Langilearen soldata jarri: ");
            soldata=in.nextDouble();
            for(int nav=1;nav<=langileak.length && finish==true;nav++){
                if(langileak[nav-1].getIzena()==(null)){
                    
                    System.out.println(langileak[nav-1]=new Langilea(id, izena, abizena, soldata));
                    finish=false;
                }
            }
            
            
            



    }
    public static void langileakInprimatu(Langilea[] langileak,boolean finish){
       
        System.out.printf("%10s,%10s,%10s, %10s\n", "id","izena","abizena","soldata");
                System.out.println("==========================================================");
                for(int nav=1;nav<=langileak.length && finish==true;nav++){
                    if(langileak[nav-1] != null){
                        System.out.println(langileak[nav-1]);
                    }else{
                        
                        finish=false;
                        break;
                    }
                    }
    }

    public static void langileaJubilatu(Langilea[] langileak, boolean finish){
       int id;
        Scanner in = new Scanner(System.in);
        System.out.print("Zein langile jubilatu nahi duzu(id): ");
        id=in.nextInt();
        for(int nav=1;nav<=langileak.length&& finish==true;nav++){
            if(langileak[nav-1].getId()==(id)){
                langileak[nav-1]= new Langilea(0, null, null, 0.0);
                finish=false;
            }
        }
    }
    public static void soldatIGO(Langilea[] langileak,boolean finish){
        int id,sodl;
        Scanner in = new Scanner(System.in);
        System.out.print("Zein langileri soldata igo  nahi diozu (id): ");
        id=in.nextInt();
        System.out.print("Zenbat portzentaia igo nahi diozu: ");
        sodl=in.nextInt();
         for(int nav=1;nav<=langileak.length&& finish==true;nav++){
            if(langileak[nav-1].getId()==(id)){
                langileak[nav-1].soldataIgo(sodl);
                
                System.out.println(langileak[nav-1]);
                finish=false;
            }
        }

    }
}

