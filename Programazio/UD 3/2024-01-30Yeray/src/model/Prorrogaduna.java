package model;

import java.time.LocalDateTime;

public class Prorrogaduna extends FutbolPartida {
    protected int t1ProrrogakoGolak;
    protected int t2ProrrogakoGolak;
    
    
    public Prorrogaduna(LocalDateTime noiz, String t1, String t2, int t1Golak, int t2Golak, int t1ProrrogakoGolak,
            int t2ProrrogakoGolak) {
        super(noiz, t1, t2, t1Golak, t2Golak);
        this.t1ProrrogakoGolak = t1ProrrogakoGolak;
        this.t2ProrrogakoGolak = t2ProrrogakoGolak;
    }

    
    public String getIrabazlea(){
        int golak1=t1Golak+t1ProrrogakoGolak;
        int golak2=t2Golak+t2ProrrogakoGolak;
        if(golak1>golak2){
            return t1;
        }else{
            return t2;
        }
        
    }


    @Override
    public String toString() {
        return noiz+"\t"+t1+"-"+t2+"\t"+t1Golak+"-"+t2Golak+"\t"+t1ProrrogakoGolak+"-"+t2ProrrogakoGolak+"\t"+"-"+"\t\t"+getIrabazlea();
    }
    

    


}
