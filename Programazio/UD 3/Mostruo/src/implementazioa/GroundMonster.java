package implementazioa;

public class GroundMonster implements Mostruosoa {
    /** Constructs a StoneMonster instance with the given name */
    private String name;

    public GroundMonster (String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return "Attack with stones!";
    }
}