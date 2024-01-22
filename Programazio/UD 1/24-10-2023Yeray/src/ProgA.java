import java.util.Scanner;
public class ProgA {
   public static void main(String[] args) {
    int zenbakia;
    Scanner in = new Scanner(System.in);
    System.out.print ("Esan zenbaki bat (1-10): ");
    zenbakia=in.nextInt();
    in.close();
    if(zenbakia>0)
    for(int i=1;i<=zenbakia;i++){
        for(int luzeera=0;luzeera!=zenbakia;++luzeera){
            System.out.print(i+" ");
        }
        System.out.println("");
    }
   }
}
