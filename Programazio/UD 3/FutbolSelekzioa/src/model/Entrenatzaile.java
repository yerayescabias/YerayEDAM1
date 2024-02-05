package model;

public class Entrenatzaile extends Kidea {
    

    private String idFederazioa;
    
    public Entrenatzaile(int id, String izena,String abizena, int dortsala,String idFederazioa){
        super(id, izena, abizena, dortsala);
        this.idFederazioa = idFederazioa;
    }
    

    public String getIdFederazioa() {
        return idFederazioa;
    }

    public void setIdFederazioa(String idFederazioa) {
        this.idFederazioa = idFederazioa;
    }
    
    public void entremaneduaZuzendu(){

    }

    public void partiduaZuzendu(){

    }
    
}
