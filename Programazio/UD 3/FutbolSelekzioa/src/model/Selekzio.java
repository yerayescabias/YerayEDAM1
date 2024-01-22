package model;

import java.util.ArrayList;
import java.util.Iterator;

import model.enumerazioak.Demarkazioa;
import model.enumerazioak.Herria;

public class Selekzio {
        private ArrayList<Kidea> Kideak = new ArrayList<Kidea>();
        private int azkenID=0;
        public Herria herria;

        public Selekzio(String herrialdea) {

        if (herrialdea.equals("Euskadi")) {

                this.herria=Herria.eus;

                Kideak.add(new Futbolaria(++azkenID, "Unai", "Bustinza", 28, 2, Demarkazioa.DEF));

                Kideak.add(new Futbolaria(++azkenID, "Mikel", "Balenziaga", 32, 3, Demarkazioa.DEF));

                Kideak.add(new Futbolaria(++azkenID, "Asier", "Illarramendi", 30, 4, Demarkazioa.MED));

                Kideak.add(new Futbolaria(++azkenID, "Iñigo", "Martínez", 29, 5, Demarkazioa.DEF));

                Kideak.add(new Futbolaria(++azkenID, "Mikel", "San José", 31, 6, Demarkazioa.MED));

                Kideak.add(new Futbolaria(++azkenID, "Gaizka", "Larrazabal", 23, 7, Demarkazioa.DEF));

                Kideak.add(new Futbolaria(++azkenID, "Manu", "García", 34, 8, Demarkazioa.MED));

                Kideak.add(new Futbolaria(++azkenID, "Aritz", "Aduriz", 39, 9, Demarkazioa.DEL));

                Kideak.add(new Futbolaria(++azkenID, "Javier", "Eraso", 30, 10, Demarkazioa.MED));

                Kideak.add(new Futbolaria(++azkenID, "Asier", "Villalibre", 23, 11, Demarkazioa.DEL));

                Kideak.add(new Futbolaria(++azkenID, "Aihen", "Muñoz", 23, 12, Demarkazioa.DEF));

                

                Kideak.add(new Futbolaria(++azkenID, "Aritz", "Elustondo", 26, 14, Demarkazioa.MED));

                Kideak.add(new Futbolaria(++azkenID, "Jesús", "Areso", 21, 15, Demarkazioa.DEF));

                Kideak.add(new Futbolaria(++azkenID, "Iñigo", "Vicente", 23, 16, Demarkazioa.DEL));

                Kideak.add(new Futbolaria(++azkenID, "Daniel", "Vivian", 21, 17, Demarkazioa.MED));

                Kideak.add(new Entrenatzaile(++azkenID, "Javier", "Clemente", 0, "F1"));

                Kideak.add(new Entrenatzaile(++azkenID, "Joseba", "Núñez", 0, "F2"));

                Kideak.add(new Entrenatzaile(++azkenID, "Markel", "Lautadahandi", 0, "F3"));

                Kideak.add(new Masajista(++azkenID, "Iñaki", "Sertxiberrieta", 0, "Fisioterapeuta", 0));

                Kideak.add(new Kidea(++azkenID, "Ander", "Etxeburu", 0));

                Kideak.add(new Atezaina(++azkenID, "Aitor", "Fernández", 29, 1,8));
                
                Kideak.add(new Atezaina(++azkenID, "Iago", "Herrerín", 32, 13, 0));
                

                } else if (herrialdea.equals("Rumania")) { // https://en.wikipedia.org/wiki/Romania_national_football_team#Players

                this.herria = Herria.ro;

                Kideak.add(new Futbolaria(++azkenID, "Horatiu", "Moldovan", 25, 1, Demarkazioa.POR));

                } else 

                System.out.println("Selekzio honen daturik ez daukagu momentuz. Kide gabe sortuko da.");

                

        }
        
        
        

        @Override
        public String toString() {
                return "Selekzio [Kideak=" + Kideak + ", azkenID=" + azkenID + ", herria=" + herria + "]";
        }




        public void kideakBistaratu(){
                Iterator<Kidea> mauricio= Kideak.iterator();
                while(mauricio.hasNext()){
                        Kidea kidea = mauricio.next();
                        System.out.println(kidea);
                } 
                
        }
        public void futbolariakBistaratu(){
                Iterator<Kidea> mauricio= Kideak.iterator();
                while(mauricio.hasNext()){
                        Kidea kidea = mauricio.next();
                        if(kidea instanceof Futbolaria){
                                System.out.println(kidea);
                        }
                }
        }
        
        
        
        public ArrayList<Kidea> getKideak() {
                
                
                return Kideak;
        }
        public ArrayList<String> getKideakIzenak() {
                
                return null ; 
        }
        public int kideBerria(Kidea kidea){

                return 0 ;
        }
        public int kideaEzabatu(int id){

                return 0;
        }
}

