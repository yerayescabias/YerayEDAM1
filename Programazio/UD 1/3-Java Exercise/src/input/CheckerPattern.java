package input;
import java.util.Scanner;
public class CheckerPattern {
    public static void main(String[] args) {
        int size;
        Scanner in= new Scanner(System.in); 
        System.out.print("Enter the size: ");
        size=in.nextInt();
        in.close();
        
        for(int row=1;row<=size;++row){
            for(int colum=1;colum<=size;++colum){
                if(row %2==0){
                    System.out.print("# ");
                }else {
                    System.out.print(" #");
                }
            }
            System.out.println();
        }
        
    }
}
