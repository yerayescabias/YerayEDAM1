package model;

import java.time.LocalDateTime;

public class FutbolPartida extends Partida {
    protected int t1Golak;
    protected int t2Golak;
    
    public FutbolPartida(LocalDateTime noiz, String t1 , String t2, int t1Golak, int t2Golak){
        this.noiz=noiz;
        this.t1=t1;
        this.t2=t2;
        this.t1Golak=t1Golak;
        this.t2Golak=t2Golak;

    }
    
    public String getIrabazlea(){
        int golak1=t1Golak;
        int golak2=t2Golak;
        if(golak1>golak2){
            return t1;
        }else{
            return t2;
        }
        
    }

    @Override
    public String toString() {
        return noiz+"\t"+t1+"-"+t2+"\t"+t1Golak+"-"+t2Golak+"\t"+"-"+"\t"+"-"+"\t\t"+getIrabazlea();
    }
    

    
    
}
