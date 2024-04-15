package model;

public abstract class Bezeroa {
    int kodea;
    String helbidea;
    
    
    public Bezeroa(int kodea, String helbidea) {
        this.kodea = kodea;
        this.helbidea = helbidea;
    }

    public int getKodea() {
        return kodea;
    }
    
    

    abstract String getIzena();

    

    public String getHelbidea() {
        return helbidea;
    }
    abstract String getEmail();

    
}
