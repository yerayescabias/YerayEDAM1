package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class EpekaErosketa extends Erosketa {
    int epeak=12;
    boolean ordainketaBukatu = false;
    double kuota;
    
    public double gainetikOrdainduBeharrekoa(){

        return 0;
    }

    

    public EpekaErosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira, double kuota) {
        super(kodea, data, eroslea, produktuak, unitateak, guztira);
        this.kuota = kuota;
    }



    public EpekaErosketa(String kodea,String data, Bezeroa bezeroa, double guztira, double kuota) {
        super(kodea, bezeroa, guztira);
        this.kuota = kuota;
    }



    @Override
    public String toString() {
        return "EpekaErosketa [epeak=" + epeak + ", ordainketaBukatu=" + ordainketaBukatu + ", kuota=" + kuota + "]";
    }
    
    
}
