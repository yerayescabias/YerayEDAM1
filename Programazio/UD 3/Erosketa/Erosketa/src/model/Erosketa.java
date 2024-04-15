package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Erosketa {
    protected char[] kodea;
    protected LocalDate data;
    protected Bezeroa bezeroa;
    protected ArrayList<Produktua> produktuak;
    protected ArrayList<Integer> unitateak;
    protected double guztira;

    
    public Erosketa(String kodea, String data, Bezeroa eroslea, ArrayList<Produktua> produktuak,
            ArrayList<Integer> unitateak, double guztira) {
        this.kodea = kodea.toCharArray();
        this.data = LocalDate.parse(data);
        this.bezeroa = eroslea;
        this.produktuak = produktuak;
        this.unitateak = unitateak;
        this.guztira = guztira;
    }

    public Erosketa(String kodea, Bezeroa bezeroa, double guztira) {
        this.kodea = kodea.toCharArray();
        this.bezeroa = bezeroa;
        this.guztira = guztira;
        
    }
    
    
    public char[] getKodea() {
        return kodea;
    }

    public LocalDate getData() {
        return data;
    }

    public Bezeroa getBezeroa() {
        return bezeroa;
    }

    public ArrayList<Produktua> getProduktuak() {
        return produktuak;
    }

    public ArrayList<Integer> getUnitateak() {
        return unitateak;
    }

    public double getGuztira() {
        return guztira;
    }

    @Override
    public String toString() {
        return "Erosketa {kodea=" + String.valueOf(kodea) + ", data=" + data + ", eroslea=" + bezeroa.toString() + ", guztira=" + guztira + "}";
    }

    
    public String toStringLuzea(){
        String code="";
        String num="";
        int count=1;
        Iterator<Produktua> mani = produktuak.iterator();
        Iterator<Integer> mauricio = unitateak.iterator();
        while(mani.hasNext()){
            Produktua next=mani.next();
            Integer a= mauricio.next();
            num=a.toString();
            code=count+".Produktua:"+String.valueOf(next.getKodea()) + ","+ next.getIzena() +","+a.toString()+","+next.getPrezioa();
            count++;
        }
        
        return "Erosketa \n Kodea: "+String.valueOf(kodea) +" Data: "+data+"\n Bezeroa: "+bezeroa.getKodea()+"\n Izena:"+bezeroa.getIzena()+"\n Helbidea: "+bezeroa.getHelbidea()+"\n"+code;
    }

    public boolean guztiraEgiaztatu(){
        return true;
    }

}
