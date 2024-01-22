import java.util.Scanner;
public class Egunak {
    public static void main(String[] args) {
        int eguna;
        String hizkuntza;
        Scanner in =new Scanner (System.in);
        System.out.print("Aukeratu eguna (1-7): ");
        eguna=in.nextInt();
        System.out.print("Aukeratu Hizkuntza(EU,ES,EN): ");
        hizkuntza=in.next();
        in.close();
        String egunak [][]={
            { "Astelehena","Martitzena","eguaztena","eguena","barikua","Zapatua", "Domeka "},
            {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado ","Domingo"},
            {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"}
        };
        if(eguna>8 || eguna<1){
            System.out.println("Eguna txarto jarri da");
           
        } else{
             if(hizkuntza.equals("EU")){
                System.out.println(egunak[0][eguna-1]);
            }else if(hizkuntza.equals("ES")){
                System.out.println(egunak[1][eguna-1]);
            }else if (hizkuntza.equals("EN")){
                System.out.println(egunak[2][eguna-1]);
            }else{
                System.out.println("Hizkuntza txarto jarri duzu ");
            }
        }

    }
}
