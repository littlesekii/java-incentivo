package classes.oop;

public class AccessModifiers {
    public String publicName;           //every class can modify
    protected String protectedName;     //only the class, classes in the same package and a class that inherits
    String defaultName;                 //only the class and other classes in the same package
    private String privateName;         //only the class can modify
}
