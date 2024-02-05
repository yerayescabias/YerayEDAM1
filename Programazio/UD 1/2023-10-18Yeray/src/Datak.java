import java.util.Scanner;
public class Datak {
    public static void main(String[] args) {
        int eguna;
        int hilabetea;
        int urtea;
        String b="B";
        int number=1;
        boolean segui;
        Scanner in=new Scanner(System.in);
        segui=true;
        while (segui){
            System.out.println(+number+".Data:");
            System.out.print("Eguna:");
            eguna=in.nextInt();
            System.out.print("Hilabetea:");
            hilabetea=in.nextInt();
            
            System.out.print("Urtea:");
            urtea=in.nextInt();
            
            System.out.println("Data forma laburrean:"+datalaburra(eguna, hilabetea, urtea));
            System.out.println("Data forma luzean:" +dataluzea(eguna, hilabetea, urtea));
            System.out.print("Beste data bat sortu nahi duzu(B/E):");
            b=in.next();
            if(b.equals("B")){
                segui=true;
                number++;
            } else if(b.equals("E")){
                segui=false;
            }
        }
        in.close();
        
    }
    public static String datalaburra(int eguna,int hilabetea,int urtea) {
        
        String emaitza=" ";
        if (eguna<32 && hilabetea<=12){
            emaitza=eguna+"-"+hilabetea+"-"+urtea;
            

        } else {
            emaitza="eguna eta hilabetea txarto jarrita";
        }

        return emaitza;
        
    }
    public static String dataluzea(int eguna,int hilabetea,int urtea){
            String finala=" ";

             switch (hilabetea){
                case 1:
                finala=urtea+"ko"+" "+"urtarrilaren"+" "+eguna+"a";
                break;
                case 2:
                finala=urtea+"ko"+" "+"Otsailaren"+ " "+eguna+"a";
                break;
                case 3:
                finala=urtea+"ko"+" "+"Martxoaren"+ " "+eguna+"a";
                break;
                case 4:
                finala=urtea+"ko"+" "+"Apirilaren"+ " "+eguna+"a";
                break;
                case 5:
                finala=urtea+"ko"+" "+"Maitzaren"+ " "+eguna+"a";
                break;
                case 6:
                finala=urtea+"ko"+" "+"Ekainaren"+ " "+eguna+"a";
                break;
                case 7:
                finala=urtea+"ko"+" "+"Uztailaren"+ " "+eguna+"a";
                break;
                case 8:
                finala=urtea+"ko"+" "+"Abuztuaren"+ " "+eguna+"a";
                break;
                case 9:
                finala=urtea+"ko"+" "+"Irailaren"+ " "+eguna+"a";
                break;
                case 10:
                finala=urtea+"ko"+" "+"Urriaren"+ " "+eguna+"a";
                break;
                case 11:
                finala=urtea+"ko"+" "+"Azaroaren"+" "+ eguna+"a";
                break;
                case 12:
                finala=urtea+"ko"+" "+"Abenduaren"+ " "+eguna+"a";
                break;
                default:
                finala="txarto dago";
                
            }
        return finala;
    }
}

