package classes.basics;

@SuppressWarnings("all")
public class Castings {
    public void implicitCast() {
        int hour = 2;
        double fullHour = hour;

        System.out.println("===Implicit Cast===");
        System.out.println("Int: " + hour);
        System.out.println("Double: " + fullHour);
    }

    public void explicitCast() {
        double fullHour = 2.6666;
        int hour = (int) fullHour;

        System.out.println("===Explicit Cast===");
        System.out.println("Double: " + fullHour);
        System.out.println("Int: " + hour);
    }
}
