package exekutagarriak;
import java.util.Scanner;

import java.util.Iterator;

import java.util.ArrayList;
import model.Bezeroa;
import model.Erosketa;
import model.Produktua;

public class ErosketakKudeatu {
    private static ArrayList<Bezeroa> kontaktua;
    private static ArrayList<Produktua> produktuKatalogoa;
    private static ArrayList<Erosketa> erosketenZerrenda;
    private static  Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int num=0;
        String contnue="y";
        
            while(contnue.equals("y") || contnue.equals("Y")){
            System.out.println("EROSKETEN KUDEAKETA\n--------------------------------\n 0.irten\n 1.  Create (Datuak gehitu)\n 2.  Read (Ikusi)\n 3.  Update (Aldatu)\n 4.  Delete (Ezabatu)");
            System.out.println("Aukeratu zenbaki bat: ");
            num=in.nextInt();
            switch (num) {
                case 0:
                    break;
                case 1:
                    create();
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 2:
                    read();
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 3:
                    update();
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 4:
                    delete();
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;

                default:
                    System.out.println("Wrong number\n\n");
                    break;
            }
        }
        in.close();
        
    }

    public static void initialize() {
    }

    public static int menuNagusiaErakutsi() {

        return 0;
    }

    public static void create() {
        /* System.out.print("Sartu erosketa Kodea: ");
        String kodea=in.next();
        System.out.print("Sartu bezero Kodea: ");

        System.out.print("Guztira ordaindu beharrekoa: ");
        double guztira=in.nextInt();
        new Erosketa(kodea, Bezeriokod, guztira); */
    }

    public static void read() {
        int num=0;
        String contnue="y";
        
            while(contnue.equals("y") || contnue.equals("Y")){
            System.out.println("READ MENUA\n--------------------------------\n 0.irten\n 1.Erosketen zerrenda\n 2.Fakturazio osoa \n 3.  Bezerorik onena\n 4.  Helbidea Bilatu");
            System.out.println("Aukeratu zenbaki bat: ");
            num=in.nextInt();
            switch (num) {
                case 0:
                    break;
                case 1:
                    String finala="";
                    Iterator<Erosketa> mauricio=erosketenZerrenda.iterator();
                    while(mauricio.hasNext()){
                        Erosketa a= (Erosketa) mauricio.next();
                        System.out.println(a.toStringLuzea());
                        

                    }
                    
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 2:
                    
                System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 3:
                    
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;
                case 4:
                    
                    System.out.println("Jarraitu nahi duzu(Y/N):");
                    contnue=in.next();
                    if(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                        System.out.println("Wrong character");
                        while(contnue!="y"|| contnue!="Y"||  contnue!="N"||  contnue!="n"){
                            contnue=in.next();
                        }
                    }
                    break;

                default:
                    System.out.println("Wrong number\n\n");
                    break;
                }
            }
    }

    public static void update() {

    }

    public static void delete() {

    }

    public static int readMenuaErakutsi() {

        return 0;

    }

    public static void erosketenZerrenda() {

    }

    public static double fakturazioOsoa() {

        return 0;
    }

    public static Bezeroa bezerorikOnena() {

        return null;
    }

    public static void helbideaBilatu() {

    }

    public static void epekakoErosketenTxostena() {

    }
}
