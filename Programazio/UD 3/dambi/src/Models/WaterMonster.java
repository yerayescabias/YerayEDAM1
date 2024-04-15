package Models;

import java.time.LocalDate;

public class WaterMonster extends Monster {

    public WaterMonster(String izena){
        this.name = izena;
    }

    public double getStrength(){
        double indarra = 15;

        if(LocalDate.now().getDayOfWeek().equals("SATURDAY") || LocalDate.now().getDayOfWeek().equals("SUNDAY")){
            indarra = indarra / 3;
        }if(this.zauria != 0){
            indarra -= zauria;
        }

        return indarra;
    }
    
}
