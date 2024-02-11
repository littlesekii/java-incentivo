package classes.oop;

@SuppressWarnings("all")
public class Constructors {

    private int hours;
    private int minutes;

    public Constructors() {
        this.hours = 0;
        this.minutes = 0;
    }

    public Constructors(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }
}
