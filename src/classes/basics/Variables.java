package classes.basics;

@SuppressWarnings("all")
public class Variables {
    public void variables() {
        String name = "Davi Bacalhau";
        int age = 21;
        boolean useGlasses = true;
        double height = 1.75f;

        System.out.println("===Variables===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Use glasses: " + true);
        System.out.println("Height: " + height);
    }

    public void primitiveTypes() {

        //Integer numbers
        byte smaller = 127;                   // 1 Byte -128 to 128
        short small = 32767;               // 2 Bytes -32768 to 32767
        int medium = 2147483647;              // 4 Bytes -2147483648 to 2147483647
        long big = 9223372036854775807L;  // 8 Bytes -9223372036854775808 to 9223372036854775807

        //real numbers
        float simpleReal = 1234.56f;      // 4 bytes
        double biggerReal = 12345678.90;  // 8 bytes

        //character
        char character = 'D';               // 2 Bytes

        //true or false
        boolean isBrazilian = true;         // 1 Bit

        System.out.println("===Primitive Types===");
        System.out.println("Byte: " + smaller);
        System.out.println("Short: " + small);
        System.out.println("Int: " + medium);
        System.out.println("Long: " + big);
        System.out.println();

        System.out.println("Float: " + simpleReal);
        System.out.println("Double: " + biggerReal);
        System.out.println();

        System.out.println("Char: " + character);
        System.out.println();

        System.out.println("Boolean: " + isBrazilian);

    }
}
