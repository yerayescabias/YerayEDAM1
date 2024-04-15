package dambat.model;

public class Zatikia {
    private int zenbakitzaile;
    private int izendatzaile;
    
    
    /**
     * Programa honetan zatikiekin euren arteko eragiketak egin arituko gara
     * eta beste motako eragiketak egingo ditugu 
     * @param zenbakitzaile
     * @param izendatzaile
     */
   
     public  Zatikia ( int zenbakitzaile , int izendatzaile){
        this.zenbakitzaile=zenbakitzaile;
        this.izendatzaile=izendatzaile;
        
    }

    public int getZenbakitzaile(){
        return zenbakitzaile;
    }

    public int  getIzendatzaile() {
        return izendatzaile;
    } 

    public void setZenbakitzaile(int zenba){
        zenbakitzaile=zenba;
    }
    
    public void setIzendatzaile(int izenda){
        izendatzaile=izenda;
    }

    public String toString(){
        return zenbakitzaile+"/"+izendatzaile;
    }

    public static Zatikia Biderketa(Zatikia zat1,Zatikia zat2 ){
        int a=0,b=0;
        a=zat1.getZenbakitzaile()*zat2.getZenbakitzaile();
        b=zat1.getIzendatzaile()*zat2.getIzendatzaile();
        Zatikia zat3=new Zatikia(a, b);
        return zat3;
    }

    /**
     * Programa honetan zatikiekin, zuk aukeratutako zartikiak, euren arteko batuketa egiten du eta 
     * lortzen den zatikia sinplifikatzen da,
     * @param zenbakitzaile
     * @param izendatzaile
     */

    public static Zatikia batu(Zatikia zat1,Zatikia zat2){
        int a=0,b=0,c=0,d=0;
        
        
        a=zat1.getIzendatzaile()*zat2.getIzendatzaile();
        b=zat1.getZenbakitzaile()*zat2.getIzendatzaile();
        c=zat2.getZenbakitzaile()*zat1.getIzendatzaile();
        d=b+c;
        Zatikia zat3=new Zatikia(d,a);
        zat3.sinplifikatu();
        zat3.hamartarBaliokide();
        
        
        
        
        return zat3;
    }

    public void batu(Zatikia bestezatikibat){
        int a=0,b=0,c=0,d=0;
        Zatikia zat2=new Zatikia(zenbakitzaile, izendatzaile);
        a=bestezatikibat.getIzendatzaile()*zat2.getIzendatzaile();
        b=bestezatikibat.getZenbakitzaile()*zat2.getIzendatzaile();
        c=zat2.getZenbakitzaile()*bestezatikibat.getIzendatzaile();
        d=b+c;
        setIzendatzaile(a);
        setZenbakitzaile(d);
        sinplifikatu();

    }

        public void  sinplifikatu(){
        
        if(izendatzaile<0){
            izendatzaile=izendatzaile*-1;
        } 
        if(zenbakitzaile<0){
            zenbakitzaile=zenbakitzaile*-1;
        }
        if(izendatzaile>zenbakitzaile){
        for(int i=2;i<=izendatzaile;i++){
                while(izendatzaile %i==0 && zenbakitzaile%i==0){
                    izendatzaile/=i;
                    zenbakitzaile/=i;
                    }
                
            }
        }else if(zenbakitzaile>izendatzaile) {
            for(int i=2;i<=zenbakitzaile;i++){
                while(izendatzaile %i==0 && zenbakitzaile%i==0){
                    izendatzaile/=i;
                    zenbakitzaile/=i;
                    
                
                }
            }
        }
    }
    public double hamartarBaliokide(){
            double hamartar=0.0;
            hamartar=zenbakitzaile/izendatzaile;
        return hamartar;
    }
    public boolean isBaliokidea(Zatikia bestezatikibat){
        bestezatikibat=new Zatikia(zenbakitzaile, izendatzaile);
        bestezatikibat.sinplifikatu();
        Zatikia za2=new Zatikia(zenbakitzaile, izendatzaile);
        za2.sinplifikatu();
        
        if(za2.getIzendatzaile()== bestezatikibat.getIzendatzaile() && za2.getZenbakitzaile()== bestezatikibat.getZenbakitzaile()){
            return true;
            
        } else{
            return false;
        }
        
    }
    public boolean isBiggerthan(Zatikia bestezatikibat){
        boolean cachi=true;
        if(this.hamartarBaliokide()>bestezatikibat.hamartarBaliokide()){
            cachi=true;
        }else{
            cachi= false;
        }
        return cachi;
    }
    public  Zatikia(){
        zenbakitzaile=(int)(Math.random()*10+1);
        izendatzaile=(int)(Math.random()*10+1);
    }
    public  Zatikia(String Zatidatzi){

    }
    public static int[] faktorizatu(int n){  
        int[] faktorizatu = new int[100];
        int nav=0;

            for(int i=2;n!=1;i++){
                while(n%i==0){
                    n=n/i;
                    faktorizatu[nav]=i;
                    nav++;
                    }
            }
        return faktorizatu;
    }
    public static int zkh(int n1, int n2){
        int c,b,emaitza;
        Math.abs(n1);
        Math.abs(n2);
        if(n1>n2){
            c=n1;
            b=n2;
        }else{
            c=n2;
            b=n1;
        }
        do{
            emaitza=b;
            b=c%b;
            c=emaitza;
        }while(b!= 0);
        return emaitza;
    }
    public static int mkt(int n1, int n2){
        Math.abs(n1);
        Math.abs(n2);
        int i;
        i=(n2*n1)/zkh(n1, n2);
        return i;
        
    }
}











