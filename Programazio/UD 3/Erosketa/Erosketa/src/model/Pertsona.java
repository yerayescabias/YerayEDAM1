package model;

public class Pertsona extends Bezeroa  {
    
    private String izena;
    private String abizena;
    private String email;

    
    
    public Pertsona(int kodea, String helbidea, String izena, String abizena, String email) {
        super(kodea, helbidea);
        this.izena = izena;
        this.abizena = abizena;
        this.email = email;
    }
    public String getIzena() {
        return izena  ;
    }
    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Pertsona {Kodea="+kodea+"izena=" + izena + ", abizena=" + abizena + ",helbidea="+helbidea+", email=" + email + "}";
    }

    


}
