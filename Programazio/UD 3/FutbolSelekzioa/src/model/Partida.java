package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Partida {
    private LocalDate data;
    private String aurkaria;
    private ArrayList<Futbolaria> txartelak;
    public Partida(LocalDate data, String aurkaria, ArrayList<Futbolaria> txartelak) {
        this.data = data;
        this.aurkaria = aurkaria;
        this.txartelak = txartelak;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getAurkaria() {
        return aurkaria;
    }
    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }
    public ArrayList<Futbolaria> getTxartelak() {
        return txartelak;
    }
    public void setTxartelak(ArrayList<Futbolaria> txartelak) {
        this.txartelak = txartelak;
    }
    public void txartelaJarri(Futbolaria f){
        
    }
    
}
