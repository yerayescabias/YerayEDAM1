package string;
import java.util.Scanner;
public class Phonekaypad {
    public static void main(String[] args) {
        String a;
        int legnth;
       int i=0; 
        Scanner in=new Scanner(System.in);
        System.out.print("write a word: ");
        a=in.next().toLowerCase();
        legnth=a.length();
        in.close();

        while(legnth>i){
            
            
            char v;
            v=a.charAt(i); 
            
            if(v=='a'|| v=='b'|| v=='c'){
                System.out.print("2");
           } else if(v=='d' || v=='e' || v=='f'){
            System.out.print("3");
           }else if(v=='g' || v=='h' || v=='i'){
            System.out.print("4");
           }else if(v=='j' || v=='k' || v=='l'){
            System.out.print("5");
           }else if(v=='m' || v=='n' || v=='o'){
            System.out.print("6");
           }else if(v=='p' || v=='q' || v=='r'){
            System.out.print("7");
           }else if(v=='s' || v=='t' || v=='u'){
            System.out.print("8");
           }else if(v=='v' || v=='w' || v=='x' || v=='y' || v=='z'){
            System.out.print("9");
           }else{
            System.out.print(v);
           }
           ++i;
        
            
            }
        }
    
}
