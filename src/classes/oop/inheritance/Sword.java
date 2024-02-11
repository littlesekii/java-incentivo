package classes.oop.inheritance;

public class Sword {

    private final int power;

    public Sword(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void slash() {
        System.out.println("You used slash!");
        System.out.println("You inflicted " + getPower() + " points of damage.");
    }
}
