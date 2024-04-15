package model;

import java.util.Arrays;

public class Enpresa extends Bezeroa {
    private String izenJuridikoa;
    private String izenKomertziala;
    private String[] kontaktoenEmailak;
    
    
    public Enpresa(int kodea, String helbidea, String izenJuridikoa, String izenKomertziala,
            String[] kontaktoenEmailak) {
        super(kodea, helbidea);
        this.izenJuridikoa = izenJuridikoa;
        this.izenKomertziala = izenKomertziala;
        this.kontaktoenEmailak = kontaktoenEmailak;
    }
    @Override
    public String getIzena(){

        return izenKomertziala;
    }
    
    @Override
    String getEmail() {
        return helbidea ;
    }
    @Override
    public String toString() {
        return "Enpresa [izenJuridikoa=" + izenJuridikoa + ", izenKomertziala=" + izenKomertziala
                + ", kontaktoenEmailak=" + Arrays.toString(kontaktoenEmailak) + "]";
    }
    
    
}
