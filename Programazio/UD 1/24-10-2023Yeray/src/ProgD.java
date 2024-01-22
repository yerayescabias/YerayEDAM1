public class ProgD {
    public static void main(String[] args){
    System.out.println("urdin hitza gazteleraz => " + itzuliGaztelerara("urdin"));
    System.out.println("beltz hitza gazteleraz => " + itzuliGaztelerara("beltz"));
    
    }    
    
    public static String itzuliGaztelerara(String hitzaString) {
    String amaieran=" ";
    boolean amaitu=false;
   
    String[][] hitzak = {{"gorri","rojo"},
                         {"urdin","azul"},
                         {"berde", "verde"},
                         {"hori", "amarillo"}};
        
        for( int i = 0; i < hitzak.length && amaitu==false;i++ ) {
            if(hitzak[i][0].equals(hitzaString)) {
                 amaieran=hitzak[i][1];
                 amaitu=true;
            }else if (hitzak[i][0]!=hitzaString){
                amaieran="ez dago itzulpena gordeta";

            }
           
        }
         return amaieran;
    }
}








