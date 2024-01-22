package tableroalehenbertsioa;

public class StoneMonster implements Mostruosoa {
    /** Constructs a StoneMonster instance with the given name */
    private String name;

    public StoneMonster(String name) {
        this.name = name;
    }

    /** Subclass provides actual implementation for attack() */
    @Override
    public String attack() {
        return getIrudia()+" :Attack with stones!";
    }
    public char getIrudia(){
        return ('\u26F0');
    }
}