import classes.basics.Castings;
import classes.basics.Loops;
import classes.oop.Constructors;
import classes.oop.inheritance.Sword;
import classes.oop.inheritance.sword.Absword;
import classes.oop.inheritance.sword.Flamesword;

@SuppressWarnings("all")
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();

//        //Variables
//        Variables var = new Variables();
//
//        var.variables();
//        System.out.println();
//
//        var.primitiveTypes();
//        System.out.println();
//
//        //Conditionals
//        Conditionals con = new Conditionals();
//
//        con.conditionals();
//        System.out.println();
//
//        //Data Structures
//        DataStructures dts = new DataStructures();
//
//        dts.arrays();
//        System.out.println();
//
//        dts.arrayLists();
//        System.out.println();
//
//        Loops loo = new Loops();
//
//        loo.forLoop();
//        System.out.println();
//
//        loo.whileLoop();
//        System.out.println();
//
//        Castings cas = new Castings();
//
//        cas.implicitCast();
//        System.out.println();
//
//        cas.explicitCast();
//        System.out.println();
//
//        Constructors con0 = new Constructors();
//        Constructors con = new Constructors(5, 22);

        System.out.println("===Sword===");
        Sword sword = new Sword(12);
        sword.slash();

        System.out.println();
        System.out.println();

        System.out.println("===Flamesword===");
        Sword flamesword = new Flamesword(8, 2);

        //was too OVERPOWERED
        ((Flamesword) flamesword).setIncinerateMultiplier(0.8f);

        ((Flamesword)flamesword).incinerate();
        System.out.println();

        flamesword.slash();

        ((Flamesword)flamesword).incinerate();
        System.out.println();

        flamesword.slash();

        ((Flamesword)flamesword).incinerate();
        System.out.println();

        System.out.println();
        System.out.println();


        System.out.println("===Absword===");
        Sword absword = new Absword(10);

        ((Absword)absword).absorb();
        System.out.println();
        absword.slash();
        System.out.println();
        absword.slash();
        System.out.println();
    }
}