import java.util.Scanner;

public class Handienaprograma {
    public static void main(String[] args) {
        final int KOPURUA= 5;
        int[] zenbakiak;
        System.out.print("Idatzi " + KOPURUA + " zenbaki: ");
        zenbakiak = getNumbers(KOPURUA);
        
        System.out.println("Sartutako datuen artean handiena: " +getTheBiggest(zenbakiak));
    }

    public static int[] getNumbers(int quantity){
        
        Scanner in =new Scanner(System.in);
        int[] zenbaki= new int[quantity];
        for (int i=0;i< zenbaki.length;i++){
            zenbaki [i]=in.nextInt();
        }
        in.close();
        return zenbaki;
    }
    public static int getTheBiggest(int[] numbers){
        int max=0;
        
        for(int i=0;i<numbers.length;++i){
            if(numbers[i]>numbers[max]){
                max=i;
            }
        }
        return numbers[max];
    }
}
