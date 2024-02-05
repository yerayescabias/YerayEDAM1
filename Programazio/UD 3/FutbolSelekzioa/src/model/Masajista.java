package model;

public class Masajista extends Kidea{
    private String titulazioa;
    private int experientzia;
    
    public Masajista(int id, String izena, String abizena, int adina, String titulazioa, int experientzia) {
        super(id, izena, abizena, adina);
        this.titulazioa = titulazioa;
        this.experientzia = experientzia;
    }
    public String getTitulazioa() {
        return titulazioa;
    }
    public void setTitulazioa(String titulazioa) {
        this.titulazioa = titulazioa;
    }
    public int getExperientzia() {
        return experientzia;
    }
    public void setExperientzia(int experientzia) {
        this.experientzia = experientzia;
    }
    
}
