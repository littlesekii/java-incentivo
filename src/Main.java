import classes.Conditionals;
import classes.Variables;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

        //Variables
        Variables var = new Variables();

        var.variables();
        System.out.println();

        var.primitiveTypes();
        System.out.println();

        //Conditionals
        Conditionals con = new Conditionals();

        con.conditionals();
        System.out.println();

    }
}