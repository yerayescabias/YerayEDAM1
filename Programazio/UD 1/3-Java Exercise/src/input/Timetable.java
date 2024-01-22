package input;
import java.util.Scanner;
/**
* |   1   2   3   4   5   6   7   8   9  10
--------------------------------------------
 1 |   1   2   3   4   5   6   7   8   9  10
 2 |   2   4   6   8  10  12  14  16  18  20
 3 |   3   6   9  12  15  18  21  24  27  30
 4 |   4   8  12  16  20  24  28  32  36  40
 5 |   5  10  15  20  25  30  35  40  45  50
 6 |   6  12  18  24  30  36  42  48  54  60
 7 |   7  14  21  28  35  42  49  56  63  70
 8 |   8  16  24  32  40  48  56  64  72  80
 9 |   9  18  27  36  45  54  63  72  81  90
10 |  10  20  30  40  50  60  70  80  90 100
 */
public class Timetable {
   public static void main(String[] args) {
      // Declarar variables
      final int SIZE;   // Declarar una variable final 

      // Pedir el valor de la variable final 
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the size: ");
      SIZE = in.nextInt();
      in.close();

      // Primero se printea La columna *|
      System.out.print(" * |"); 
      for (int col = 1; col <= SIZE; ++col) { 
         System.out.printf("%4d", col); //Printea la primera fila independiente
      }
      System.out.println();  // Salta linea
      System.out.print("----");// Printea la linea  continua
      for (int col = 1; col <= SIZE; ++col) {
         System.out.printf("%4s", "----");
      }
      System.out.println();  //Salta linea

      // Printea el cuerpo 
      for (int row = 1; row <= SIZE; ++row) {  
         System.out.printf("%2d |", row);      // Printea la barra
         for (int col = 1; col <= SIZE; ++col) {   
            System.out.printf("%4d", row*col);// printea la cantidad de linea* columna 
         }
         System.out.println();  // Salta linea
      }
   }
}