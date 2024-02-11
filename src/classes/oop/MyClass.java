package classes.oop;

@SuppressWarnings("all")
public class MyClass {

    private static String message = "This is my class";
    private String nonstaticMessage = message;

    public static void start() {
        System.out.println(message);
//        System.out.println(nonstaticMessage);
    }

    public void setMessage(String msg) {
        message = msg;
        this.nonstaticMessage = message;
    }

    public String getMessage() {
        return this.nonstaticMessage;
    }

}
