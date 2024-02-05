package tableroalehenbertsioa;


public class TestMonster {
    public static void main(String[] args) {
        // Program at the specification defined in the superclass/interface.
        // Declare instances of the superclass, substituted by subclasses.
        Mostruosoa m1 = new FireMonster("uu"); // upcast
        Mostruosoa m2 = new WaterMonster("ff"); // upcast
        Mostruosoa m3 = new StoneMonster("dd"); // upcast

        // Invoke the actual implementation
        System.out.println(m1.attack()); // Run FireMonster's attack()
        // Attack with fire!
        System.out.println(m2.attack()); // Run WaterMonster's attack()
        // Attack with water!
        System.out.println(m3.attack()); // Run StoneMonster's attack()
        // Attack with stones!

    }
}