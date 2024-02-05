package model;
public class Langilea{
    private int id;
    private String izena;
    private String abizena;
    private double soldata;

    public Langilea(int id, String izena,String abizena,double soldata)
    {
        this.id=id;
        this.izena=izena;
        this.abizena=abizena;
        this.soldata=soldata;
    }
    public int getId()
    {
        return id;
    }
    public String getIzena()
    {
        return izena;
    }
    public String getAbizena()
    {
        return abizena;
    }
    public Double getSoldata()
    {
        return soldata;
    }
    public double getUrtkeoSoldata()
    {
        return soldata*12;
    }
    public void setSoldata(double soldata)
    {
        this.soldata=soldata;
        
    }
    public double soldataIgo(int portzentaia){
        double emaitza=0;
        emaitza=soldata+(soldata*((100.0-portzentaia)/100.0));
        setSoldata(emaitza);
        return emaitza;
    }
    public String toString(){

        return "Langilea[ id="+id+" ,izena="+izena+" ,abizena="+abizena+",soldata="+soldata+" ]";
    }
    public static Langilea[] nireHamarLagunLangile(){
        Langilea[] langileak= new Langilea[10];

        langileak[0]=new Langilea(0, "iker", "Aooipi", 500);
        langileak[1]= new Langilea(1, "maik", "Aasd", 800);
        langileak[2]= new Langilea(2, "Nikel", "Lama", 900);
        langileak[3]= new Langilea(3, "mama", "Pasa", 700);
        langileak[3]= new Langilea(3, "Jaoia", "Pasa", 700);
        langileak[4]= new Langilea(4, "Aksa", "VASa", 8600);
        langileak[5]= new Langilea(5, "Ikams", "Alasd", 8500);
        langileak[6]=new Langilea(6, "nike", "Acmaabe", 400);
        langileak[7]= new Langilea(7, "adidas", "AuiuA", 900);
        langileak[8]= new Langilea(8, "pluma", "Ioas", 700);
        langileak[9]=new Langilea(9, "ozuna", "Ayera", 1200);
        

        /*  for(int nav=1;nav<=langileak.length;++nav){
            langileak [nav-1]= new Langilea(nav, nav+" izena", nav+" abizena", nav*nav);
        
        } */
        return langileak;
    }
    public static Langilea bilatu(Langilea[] langileak,String izena){
        
        Langilea l =null;
        for(int i=0;i<langileak.length;i++){
            if(langileak[i].getIzena().equals(izena)){
                l=langileak[i];
                break;
            }
        }
        return l;
    }

    }
        



