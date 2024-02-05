public class ProgC {
        public static void main(String[] args) {
        
            final int MUGA = 100;
            int zenbaki1 = 2;
            int zenbaki2 = 150;
            int zenbaki3 = 100;
            System.out.println(zenbaki1 + " zenbakia " + MUGA + " handia da: " + isBig(MUGA, zenbaki1));
            System.out.println(zenbaki2 + " zenbakia " + MUGA + " handia da: " + isBig(MUGA, zenbaki2));
            System.out.println(zenbaki3 + " zenbakia " + MUGA + " handia da: " + isBig(MUGA, zenbaki3));


        }
           
           
        public static String  isBig(int Muga,int zenbaki ) {
            String emaitza=" ";
            
                 if (Muga>zenbaki){
                emaitza="false";
                }else if (Muga==zenbaki ){
                emaitza="false";
                }else if (Muga<zenbaki) {
                emaitza="true";
                }
            
           
            return emaitza;
        }
        
}       

    

