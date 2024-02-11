package classes.oop.inheritance.sword;

import classes.oop.inheritance.Sword;

public class Flamesword extends Sword {
    private float incinerateMultiplier = 0.2f;

    private int incinerateCount;

    public Flamesword(int power, int incinerateCount) {
        super(power);
        this.incinerateCount = incinerateCount;
    }

    public void setIncinerateMultiplier(float incinerateMultiplier) {
        this.incinerateMultiplier = incinerateMultiplier;
    }

    public float getIncinerateMultiplier() {
        return incinerateMultiplier;
    }

    public void incinerate() {
        if (this.incinerateCount-- > 0) {
            System.out.println("You used incinerate!");
            System.out.println("You inflicted " + (getPower() * getIncinerateMultiplier()) + " points of damage for 5 seconds.");
            System.out.println("You have " + ((this.incinerateCount > 0) ? this.incinerateCount : "no") + " charges left.");
        } else {
            System.out.println("You have no charges left to perform this action.");
        }
    }
}
