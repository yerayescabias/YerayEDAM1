package implementazioa;

import java.util.ArrayList;
import java.util.Random;

public class Ejerzitoa {
    
    private ArrayList<Mostruosoa> monstruoak = new ArrayList();

    public Ejerzitoa(){
        Random random= new Random();
        new Ejerzitoa(random.nextInt(10),random.nextInt(10),random.nextInt(10));
    }

    public Ejerzitoa(int firekop, int Stonekop, int waterkop) {
        int count=1;
        monstruoak = new ArrayList<Mostruosoa>();
        if (firekop != 0 && Stonekop != 0 && waterkop != 0) {
            while (firekop != 0) {
                monstruoak.add(new FireMonster("f"+count));
                firekop--;
                count++;
            }
            while(Stonekop!=0){
                
                monstruoak.add(new GroundMonster("S"+count));
                --Stonekop;
                count++;
            }
            while(waterkop!=0){
                monstruoak.add(new WaterMonster("w"+count));
                --waterkop;
                count++;
            }
        }

    }

    
}
