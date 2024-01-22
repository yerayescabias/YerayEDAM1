package implementazioa;

public class WaterMonster implements Mostruosoa {
    /** Constructs a WaterMonster instance with the given name */
    private String name;

    public WaterMonster(String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return "Attack with water!";
    }
}