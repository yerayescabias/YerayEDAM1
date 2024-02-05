package model;

import model.enumerazioak.Demarkazioa;

public class Atezaina extends Futbolaria {
    private int geratutakoGolak=0;
    

    public Atezaina(int id, String izena, String abizena, int adina, int dortsala,
            int geratutakoGolak) {
        super(id, izena, abizena, adina, dortsala, Demarkazioa.POR);
        this.geratutakoGolak = geratutakoGolak;
    }

    

    public void golaGeratu(){
        
    }
}
