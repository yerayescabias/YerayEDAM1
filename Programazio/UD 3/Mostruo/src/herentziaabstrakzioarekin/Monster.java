package herentziaabstrakzioarekin;

/**
 * The abstract superclass Monster defines the expected common behaviors,
 * via abstract methods.
 */
abstract public class Monster {
    private String name; // private instance variable

    /** Constructs a Monster instance of the given name */
    public Monster(String name) {
        this.name = name;
    }

    /** Define common behavior for all its subclasses */
    abstract public String attack();

    @Override
    public String toString() {
        if(this instanceof FireMonster){
        return "FireMonster ["+this.name+"]";
        }else if(this instanceof WaterMonster){
            return "WaterMonster["+this.name+"]";
        }else if(this instanceof StoneMonster){
            return "StoneMonster["+this.name+"]";
        }else{
            return null;
        }
    }

    
}
