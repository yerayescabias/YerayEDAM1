package model;

import java.time.LocalDateTime;

public class Penaltiduna extends Prorrogaduna {
    private int t1Penaltiak;
    private int t2Penaltiak;
    
    public Penaltiduna(LocalDateTime noiz, String t1, String t2, int t1Golak, int t2Golak, int t1ProrrogakoGolak,
            int t2ProrrogakoGolak, int t1Penaltiak, int t2Penaltiak) {
        super(noiz, t1, t2, t1Golak, t2Golak, t1ProrrogakoGolak, t2ProrrogakoGolak);
        this.t1Penaltiak = t1Penaltiak;
        this.t2Penaltiak = t2Penaltiak;
    }

    
    public String getIrabazlea(){
        int golak1=t1Golak+t1ProrrogakoGolak+t1Penaltiak;
        int golak2=t2Golak+t2ProrrogakoGolak+t2Penaltiak;
        if(golak1>golak2){
            return t1;
        }else{
            return t2;
        }
        
    }


    @Override
    public String toString() {
        return noiz+"\t"+t1+"-"+t2+"\t"+t1Golak+"-"+t2Golak+"\t"+t1ProrrogakoGolak+"-"+t2ProrrogakoGolak+"\t"+t1Penaltiak+"-"+t2Penaltiak+"\t\t"+getIrabazlea();
    }

    

}
