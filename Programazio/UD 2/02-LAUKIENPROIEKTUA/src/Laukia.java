public class Laukia {
    
    private int zabalera;
    private int altuera;

        public Laukia(){
        zabalera=5;
        altuera=5;
        }

        public Laukia(int zab, int altu){
            zabalera = zab;
            altuera=altu;
        }

        public int getZabalera(){
            return zabalera;
        }

        public int getAltuera(){
            return altuera;
        }
        public int getPerimetroa(){
            return 2*zabalera + 2*altuera;
        }
        public int getAzalera(){
            return zabalera *altuera;
        }
        public void setZabalera(int zabaleraBErria){
            zabaleraBErria=zabalera;
        }
        public void setAltuera(int altueraberria){
            altueraberria=altuera;
        }
        public String getMOta(){
            if (altuera>zabalera){
                return "Bertikala";
            }else if(altuera<zabalera){
                return "Horizontala";
            }else{
                return "karratua";
            }

        }
        public String toString(){
            return "Laukia ["+ zabalera +"x"+ altuera+"]";
        }

        public void marraztuBeteta(){
            for (int i=1; i<=altuera;i++){
                System.out.println(" ");
                for(int a=1;a<=zabalera;a++){
                    System.out.print("* ");
                }
                
            }
        }
        public void marraztuHUtsik(){
            for (int i=1; i<=altuera;i++){
                System.out.println(" ");
                for(int a=1;a<=zabalera;a++){
                    if(i==1 || i==altuera){
                        System.out.print("* ");
                    }else if(a==1 ){
                        System.out.print("*");
                    }else if( a==zabalera)
                        System.out.print("  *");
                    else{
                        System.out.print(" ");
                    }
                }
                
            }
        }

        public void marraztuBEteta(char c){
            for (int i=1; i<=altuera;i++){
                System.out.println(" ");
                for(int a=1;a<=zabalera;a++){
                    System.out.print(" "+ c);
                }
            }
        }
        
        public static Laukia istheBiggest(Laukia laukia[]){
        int emaitza=0;
        int komparaketa=0;
        int posizio=0;
        
        for(int i=0;Menua.sortutakoak>i;++i){
            
            emaitza=laukia[i].getAzalera();
            if(komparaketa<emaitza){
                komparaketa=emaitza;
                if(komparaketa==emaitza){
                    posizio=i;
                }
                
            }
        }
        return laukia[posizio];
        }
        

}
