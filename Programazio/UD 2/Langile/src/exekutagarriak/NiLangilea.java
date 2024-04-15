package exekutagarriak;
import model.Langilea;

public class NiLangilea {
    public static void main(String[] args) {
        Langilea lang1;
        lang1=new Langilea(0, "Yeray", "Abizena", 600);
        System.out.println(lang1.toString());
        System.out.println(lang1.getUrtkeoSoldata()); 
        System.out.println(lang1.soldataIgo(50));
        System.out.println(lang1.toString());
        System.out.println("[");
        for(int i=1;i<=Langilea.nireHamarLagunLangile().length;i++){
            System.out.println(Langilea.nireHamarLagunLangile()[i-1]);
        }
        System.out.println("]"); 
        System.out.println(lang1.toString());
        


    }
    
}