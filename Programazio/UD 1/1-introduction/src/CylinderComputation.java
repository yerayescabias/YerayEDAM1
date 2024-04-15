public class CylinderComputation {  // Save as "CircleComputation.java"
   /**
 * @param args
 */
public static void main(String[] args) {
      // Declare 3 double variables to hold radius, area and circumference.
      // A "double" holds floating-point number with an optional fractional part.
      double radius, height, surfaceArea, baseArea, volume, azaleraOsoa;
      // Declare a double to hold PI.
      // Declare as "final" to specify that its value cannot be changed (i.e. constant).
      final double PI = 3.14159265;
      
      // Assign a value to radius. (We shall read in the value from the keyboard later.)
      radius = 1.2;
      height = 5.3;
      // Compute area and circumference
      surfaceArea = 2*PI*height*radius; 
      baseArea = PI*radius*radius;
      volume = baseArea* surfaceArea ; 
      azaleraOsoa = (baseArea*2)+ surfaceArea;
      
      // Print results
      System.out.print("The base area is ");  // Print description
      System.out.println(baseArea);          // Print the value stored in the variable
      System.out.print("The surface area is ");
      System.out.println(surfaceArea);
      System.out.print("The Volume is ");
      System.out.println(volume);
      System.out.print("The total area is "+ azaleraOsoa);
   }
}