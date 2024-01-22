package input;
import java.util.Scanner;
public class TriangularPatternX2 {
    public static void main(String[] args) {
        final int SIZE;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter size: ");
        SIZE = in.nextInt();
        in.close();

        for( int row=1;row<=SIZE;++row){
            System.out.println();
           for(int col=1;col<=SIZE;++col){
                if(row + col <= SIZE + 1 ){
                System.out.print("#");
                
                }
            }

        }


        
    }
}
