package Models;

import java.time.LocalDate;

public class FireMonster extends Monster {
    
    public FireMonster(String izena){
        this.name = izena;
    }

    public double getStrength(){
        double indarra = 12;

        if(LocalDate.now().getDayOfWeek().equals("SATURDAY") || LocalDate.now().getDayOfWeek().equals("SUNDAY")){
            indarra = 20;
            return indarra;
        }if(this.zauria != 0){
            indarra -= zauria;
        }
        return indarra;
    }

}
