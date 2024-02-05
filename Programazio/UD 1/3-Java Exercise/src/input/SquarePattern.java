package input;
import java.util.Scanner;
public class SquarePattern {
    public static void main(String[] args) {
        int size;
        Scanner in= new Scanner(System.in); 
        System.out.print("Enter the size: ");
        size=in.nextInt();
        in.close();
        if(size>0){
        for(int row=1;row<=size;++row){
            for(int colum=1;colum<=size;++colum){
                System.out.print("# ");
            }
            System.out.println();
        }
        }
        
    }
}
