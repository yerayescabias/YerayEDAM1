package exekutagarriak;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

import model.*;

public class FutbolTxapelketa {
    private static String[] taldeak;
    private static ArrayList<Partida> partidak=new ArrayList<>();

    public static void main(String[] args) {
        datuakKargatu();
        System.out.println("FUTBOL PARTIDAREN EMAITZAK. TXAPELDUNA" + txapelduna());
        partidakBistaratu();
    }

    public static void datuakKargatu(){
        taldeak= new String[6];
        for(int i=0; i<taldeak.length;i++){
            taldeak[i]="t"+(i+1);
        }
        partidak.add(new FutbolPartida(LocalDateTime.of(2024,01,01,07,00) ,taldeak[0],taldeak[2],3,4));
        partidak.add(new Prorrogaduna(LocalDateTime.of(2024,01,02,07,00),taldeak[0],taldeak[3],0,0,1,0));
        partidak.add(new Penaltiduna(LocalDateTime.of(2024,01,03,07,00), taldeak[2], taldeak[4], 2,2,1,1,5,4));
        partidak.add(new FutbolPartida(LocalDateTime.of(2024,01,04,07,00) ,taldeak[3],taldeak[5],0,4));
        partidak.add(new FutbolPartida( LocalDateTime.of(2024,01,05,07,00),taldeak[4],taldeak[0],2,0));
        partidak.add(new FutbolPartida( LocalDateTime.of(2024,01,06,07,00),taldeak[5],taldeak[1],1,2));
        partidak.add(new FutbolPartida(LocalDateTime.of(2024,01,07,07,00),taldeak[1],taldeak[4],1,0));
    }

    public static void partidakBistaratu(){
        System.out.println("NOIZ \t\t     TALDEAK\tGOL_N\tGOL_PRO\tGOL_PEN\tIRABAZLEA");
        Iterator<Partida> mauricio= partidak.iterator();
        while (mauricio.hasNext()) {
            Partida jokoak=mauricio.next();
            System.out.println(jokoak.toString());
        }

    }

    public static String  txapelduna(){
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        int count5=0;
        int count6=0;
        
        Iterator<Partida> mauricio= partidak.iterator();
        while (mauricio.hasNext()) {
                Partida jokoak=mauricio.next();
            if(jokoak instanceof FutbolPartida){
                FutbolPartida hola =(FutbolPartida)jokoak;
                if (hola.getIrabazlea().equals("t1")){
                    count1++;
                }
            }else if (jokoak instanceof Prorrogaduna){
                jokoak =(Prorrogaduna) jokoak;
            }else{
                jokoak =(Penaltiduna) jokoak; 
            }
            
        
            
        }
        return null ;
    }
}

