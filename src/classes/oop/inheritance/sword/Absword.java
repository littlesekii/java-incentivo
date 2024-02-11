package classes.oop.inheritance.sword;

import classes.oop.inheritance.Sword;

public class Absword extends Sword {

    public Absword(int power) {
        super(power);
    }

    public void absorb() {
        System.out.println("You used absorb!");
    }
}
