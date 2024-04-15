/**
 * A Test Driver for the "Circle" class
 */
public class TestCircle {    // Save as "TestCircle.java"
   public static void main(String[] args) {   // Program entry point
      // Declare and Construct an instance of the Circle class called c1

      System.out.print("Zirkulua      ");
      System.out.print("Erradio      ");
      System.out.print("Kolore      ");
      System.out.println("Azalera");
      System.out.println("========================================================");
      Circle c1 = new Circle(2.0, "blue");  // Use 3rd constructor
      System.out.print("c1     ");
      System.out.print("         " + c1.getRadius());  // use dot operator to invoke member methods
      //The radius is: 2.0
      System.out.print("          " + c1.getColor());
      //The color is: blue
      System.out.printf("          %.2f%n", c1.getArea());
      //The area is: 12.57

      // Declare and Construct another instance of the Circle class called c2
      Circle c2 = new Circle(2.0);  // Use 2nd constructor
      System.out.print("c2     ");
      System.out.print("         " + c2.getRadius());
      //The radius is: 2.0
      System.out.print("           " + c2.getColor());
      //The color is: red
      System.out.printf("          %.2f%n", c2.getArea());
      //The area is: 12.57

      // Declare and Construct yet another instance of the Circle class called c3
      Circle c3 = new Circle();  // Use 1st constructor
      System.out.print("c3     ");
      System.out.print("         " + c3.getRadius());
      //The radius is: 1.0
      System.out.print("           " + c3.getColor());
      //The color is: red
      System.out.printf("           %.2f%n", c3.getArea());
      //The area is: 3.14

      Circle c4 = new Circle(9.0, "green");
      System.out.print("c4     ");
      System.out.print("         " + c4.getRadius() );
      System.out.print("           " + c3.getColor());
      System.out.printf("           %.2f%n" , c3.getArea ());
      
   }
   
}