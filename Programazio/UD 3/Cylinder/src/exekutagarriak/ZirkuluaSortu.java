package exekutagarriak;
import model.Circle;
import model.Cylinder;
import java.util.Scanner;
    /*
    * egilea:Yeray Escabias
    */
public class ZirkuluaSortu {
    public static void main(String[] args) {
        
        int altuera;
        int erradio;
        String Colors;
        char hautatu;
        Scanner in = new Scanner(System.in);

        System.out.print("Zirkulu arrunta edo zilindroa sortu nahi duzu(a/z)? ");
        hautatu = in.next().charAt(0);

        if (hautatu == 'a'){
            System.out.print("Zein izango da bere erradioa? ");
            erradio = in.nextInt();
            System.out.print("Zein izango da bere kolorea? ");
            Colors = in.next();

            Circle ci1 = new Circle(erradio, Colors);

            System.out.println();
            System.out.println("Hauek dira sortutako ZIRKULUAren ezaugarriak:");
            System.out.println("Erradioa: " + ci1.getRadius());
            System.out.println("Kolorea: " + ci1.getColor());
            System.out.println("Azalera: " + ci1.getArea());
        } else if(hautatu == 'z'){
            System.out.print("Zein izango da bere erradioa? ");
            erradio = in.nextInt();
            System.out.print("Zein izango da bere kolorea? ");
            Colors = in.next();
            System.out.print("Zein izango da bere altuera? ");
            altuera = in.nextInt();

            Cylinder cy1 = new Cylinder(altuera, erradio, Colors);

            System.out.println();
            System.out.println("Hauek dira sortutako ZILINDROAren ezaugarriak:");
            System.out.println("Erradioa: " + cy1.getRadius());
            System.out.println("Kolorea: " + cy1.getColor());
            System.out.println("Altuera: " + cy1.getHeight());
            System.out.println("Azalera: " + cy1.getArea());
            System.out.println("Bolumena: " + cy1.getVolume());
        } else{
            System.out.println("Baliogabeko aukera.");
        }
        in.close();
    }
}
