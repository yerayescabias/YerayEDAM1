package herentziaabstrakzioarekin;


public class Monstruoaskokoprograma {
    private static Monster[] mk;

    public static void main(String[] args) {
        monstruoakSortu("Fire",8);
        monstruoakBistaratu();
        System.out.println(Hiztegia.getKonposatua());
    }

    public static void mosntruoakSortu(int firekop, int waterkop,int stonekop){
        mk=new Monster[firekop+waterkop+stonekop];
        int orden=0;
        for(int i=0;i<firekop;i++){
            mk[orden]=new FireMonster("F"+(orden+1));
            orden++;
        }
        for(int i=0;i<waterkop;i++){
            mk[orden]=new WaterMonster("W"+(orden+1));
            orden++;
        }
        for(int i=0;i<stonekop;i++){
            mk[orden]=new StoneMonster("S"+(orden+1));
            orden++;
        }


    }

    public static void monstruoakSortu(String mota,int kop){
        mk=new Monster[kop];
        if(mota.equals("Fire")){
            for(int i=0;i<kop;i++){
                mk[i]= new FireMonster (mota+(i+1)); 
                    
                
            }
        }else if(mota.equals("Water")){
            for(int i=0;i<kop;i++){
                mk[i]= new WaterMonster (mota+(i+1)); 
                    
            }

        }else if(mota.equals("Stone")){
            for(int i=0;i<kop;i++){
                mk[i]= new StoneMonster (mota+(i+1)); 
                    
                
            }
        }
    }
    
    public static void monstruoakBistaratu(){
        System.out.println("Monstruoak Zerrenda\n-------------------------");
        try{
        
        for(int i=0;i<mk.length;i++){
            System.out.println(mk[i]);
        }
        }catch (Exception e){
            System.out.println("Ez dago monstruorik");
        }
        
    }
    

}
