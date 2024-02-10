package classes.basics;

@SuppressWarnings("all")
public class Conditionals {
    public void conditionals() {

        int age = 21;
        String message;

        if (age < 15) {
            message = "You are still a kid!";
        } else if (age < 21) {
            message = "Oh you're growing up!";
        } else {
            message = "Welcome to adult life!";
        }

        System.out.println("===Conditionals===");
        System.out.println(message);
    }
}
