package string;
import java.util.Scanner;
public class ReverseString {
     public static void main(String[] args) {
              // Define variables
          String inStr;        // input String
          int inStrLen;        // length of the input String
          int emaitza;

      // Prompt and read input as "String"
        Scanner in = new Scanner(System.in);
         System.out.print("Enter a String: ");
         inStr = in.next();   // use next() to read a String
         inStrLen = inStr.length();
         in.close();
   
      // Use inStr.charAt(index) in a loop to extract each character
      // The String's index begins at 0 from the left.
      // Process the String from the right
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx){
             emaitza=charIdx;
            System.out.print(inStr.charAt(emaitza));
           
        }
            
             
        } 
           
}


