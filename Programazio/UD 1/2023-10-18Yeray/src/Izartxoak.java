import java.util.Scanner;
public class Izartxoak {
    public static void main(String[] args) {
        int number;
        final int FIFTY=50;
        Scanner in = new Scanner(System.in);
        System.out.print("Esan zenbaki bat 1-10: ");
        number=in.nextInt();
        in.close();
        for(int i=1;i<=FIFTY;++i){
            if(i %number==0 && i !=FIFTY ){
                System.out.print("*-");
            } else if (i==FIFTY && i %number!=0){
                
                System.out.print(i);
            }else if(i==FIFTY && i%number==0){
                System.out.print("*");
            
            }else{
                System.out.print(+i+"-");
            }
            

            
        }
    }
}
