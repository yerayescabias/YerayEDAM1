package input;
import java.util.Scanner;
public class SquarePatternDoWhile {
    public static void main(String[] args) {
        int size;
        Scanner in= new Scanner(System.in); 
        System.out.print("Enter the size: ");
        size=in.nextInt();
        in.close();
        int row=1;
        int colum=1;
        do{
            do{
                System.out.print("# ");
                ++colum;
            }while(colum<=size);
            colum=1;
            System.out.println();
            ++row;
        }while(row<=size);
    }
}
