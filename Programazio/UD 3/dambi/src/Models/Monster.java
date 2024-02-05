package Models;

public abstract class Monster {
    protected String name;
    protected double zauria = 0;

    public abstract double getStrength();

    public double getZauria(){
        return this.zauria;
    }
    public void zauritu(double zenbat){
        this.zauria += zenbat;
    }
    public String toString(){
        return this.name + "["+ this.getStrength() + "]";
    }
}