import java.util.Scanner;
public class Menua {
        static int aukeraketa;
        static int laukia_kop=10;
        static int sortutakoak=0;
        static Laukia[] laukia= new Laukia[laukia_kop];
        static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        
        do{
            System.out.println("LAUKIAK");
            System.out.println("====================================");
            System.out.println("1.- Lauki berria sortu");
            System.out.println("2.- Laukien taula ikusi");
            System.out.println("3.- Lauki bat marraztu");
            System.out.println("4.- Lauki handiena bilatu");
            System.out.println("5.- Irten");
            
            System.out.print("Aukeratu zenbaki bat:");
            aukeraketa=in.nextInt();
            switch (aukeraketa) {
                case 1:
                    if(laukia.length>=10){
                    sortu();   

                }
                    break;
                case 2:
                    inprimatu(laukia);
                    
                    break;
                case 3:
                    marraztu(laukia);
                
                    break;
                case 4:
                    handiena();
                    break;
                case 5:
                
                    break;
                default:
                    System.out.println("Txarto jarri duzu ipini berriro");
                    
            }
        }while(aukeraketa !=5);
        System.out.println("Eskerrik asko programa hau erabiltzeagatik.");
        in.close();
    }

    public static void sortu(){
        
        int zabalera,altuera;
        System.out.print("zabalera: ");
        zabalera=in.nextInt();
        System.out.print("Altuera: ");
        altuera=in.nextInt();
        if(sortutakoak<10){
        laukia[sortutakoak++]= new Laukia(zabalera, altuera);
        } else{
            System.out.println("Lauki kopurua bete da");
        }
        
    }
    public static void inprimatu(Laukia laukia[]){
        System.out.printf("%10s %15s %10s %10s %15s %10s\n " ,"laukia","zabalera",  "altuera", "azalera" ,"perimetroa" ,"mota");
        System.out.println("=================================================================================");
        int o=1;
        for(int i=0;i<sortutakoak;i++){
            
        System.out.println("        "+o+"              "+laukia [i].getZabalera()+"            "+laukia [i].getAltuera()+"         "+laukia [i].getAzalera()+"          "+laukia [i].getPerimetroa()+"            "+laukia [i].getMOta() );
        ++o;
        }
    }
    
    
    public static void marraztu(Laukia laukia[]){
        int select;
        System.out.print("Zein karratu imprimatu nahi duzu:");
        select=in.nextInt();
        select=select-1;
        int altueraa=laukia[select].getAltuera();
        int zabaleraa=laukia[select].getZabalera();
        for(int i=0;i<=altueraa;i++){
            for(int a=0;a< zabaleraa ;a++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
    public static void handiena(){
        System.out.println(Laukia.istheBiggest(laukia));
        /*   for (int i = 1; i<sortutakoak;++i){
        if (laukia[i].getAzalera()> laukia[posizio].getAzalera()){
            posizio=i;
        }
        System.out.println(laukia[posizio]); */
    }
    
}



