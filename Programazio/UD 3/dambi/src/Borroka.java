import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.FireMonster;
import Models.Monster;
import Models.WaterMonster;

public class Borroka {

    private static ArrayList<Monster> ejerzito1 = new ArrayList<>();
    private static ArrayList<Monster> ejerzito2 = new ArrayList<>();
    private static final int KOPURUA = 5;
    private static int aurrezAurrekoak = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String erantzuna = "B";

        System.out.println("EJERZITO1" + ejerzitoaArmatu() + "\n");
        System.out.println("EJERZITO2" + ejerzitoaArmatu() + "\n");

        while (!erantzuna.equals("g")) {
            ejerzitoakBistaratu();
            banakaBorrokatu();
            System.out.print("Sakatu B Borrokatzeko edo G borroka Geratzeko: ");
            erantzuna = sc.nextLine();
            if(erantzuna.equals("B")){
                banakaBorrokatu();
            }else if(erantzuna.equals("g")){
                if(ejerzito1.get(0).equals(null) || ejerzito2.get(0).equals(null)){
                    System.out.println("Borroka geratu da.");
                    break;
                }else{
                    System.out.println("Ezin da borroka geratu, ez da bukatu eta");
                    erantzuna ="b";
                }
            }
        }

    }

    public static ArrayList<Monster> ejerzitoaArmatu() {

        System.out.println("Zein ejerzito armatu nahi duzu? ");

        Scanner sc = new Scanner(System.in);

        int zein = 1;

        int erantzuna = sc.nextInt();

        
        if (erantzuna == 1) {
            for (int i = 0; i < KOPURUA; i++) {
                int emaitza = (int) (Math.random() * 2);
                if (emaitza == 1) {
                    FireMonster monstruo = new FireMonster("F" + i);
                    ejerzito1.add(monstruo);
                } else {
                    WaterMonster monstruo = new WaterMonster("W" + i);
                    ejerzito1.add(monstruo);
                }
            }
            return ejerzito1;
        } else if (erantzuna == 2) {
            for (int i = 0; i < KOPURUA; i++) {
                int emaitza = (int) (Math.random() * 2);
                if (emaitza == 1) {
                    FireMonster monstruo = new FireMonster("F" + i);
                    ejerzito2.add(monstruo);
                } else {
                    WaterMonster monstruo = new WaterMonster("W" + i);
                    ejerzito2.add(monstruo);
                }
            }
        }
        return ejerzito2;

    }

    public static void ejerzitoakBistaratu() {
        int maxIndex = Math.max(ejerzito1.size(), ejerzito2.size());

        System.out.println("EJERZITO1                               EJERZITO2" + "  [AA:0]");

        for (int i = 0; i < maxIndex; i++) {
            if (i < ejerzito1.size()) {
                System.out.print(ejerzito1.get(i) + "                                ");
            } else {
                System.out.print("                                       ");
            }

            if (i < ejerzito2.size()) {
                System.out.println(ejerzito2.get(i));
            } else {
                System.out.println();
            }
        }
    }

    public static void banakaBorrokatu() {

            double ejerzito1Indarra = ejerzito1.get(0).getStrength();
            double ejerzito2Indarra = ejerzito2.get(0).getStrength();

            if(ejerzito1Indarra > ejerzito2Indarra){
                ejerzito2.removeFirst();
                if(ejerzito2.isEmpty()){
                    ejerzitoakBistaratu();
                    System.out.println("Ejerzito 1ek irabazi du");
                    System.exit(0);
                }
            }else if(ejerzito2Indarra > ejerzito1Indarra){
                ejerzito1.removeFirst();
                if(ejerzito1.isEmpty()){
                    ejerzitoakBistaratu();
                    System.out.println("Ejerzito 2k irabazi du");
                    System.exit(0);
                }
            }
            if(ejerzito1Indarra == ejerzito2Indarra){
                ejerzito1.get(0).zauritu(ejerzito2Indarra);
                ejerzito2.get(0).zauritu(ejerzito1Indarra);
                
                Monster sartu1 = ejerzito1.get(0);
                ejerzito1.removeFirst();
                ejerzito1.addLast(sartu1);
                Monster sartu2 = ejerzito2.get(0);
                ejerzito2.removeFirst();
                ejerzito2.addLast(sartu2);
            }
            aurrezAurrekoak = aurrezAurrekoak + 1;
            
    }
}
