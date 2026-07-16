public class Operators {
    public static void main(String[] args) {

        int a = 20;
        int b = 10;

        // Arithmetic Operators
        System.out.println("------ Arithmetic Operators ------");
        System.out.println("Addition = " + (a + b));

        // Assignment Operators
        System.out.println("\n------ Assignment Operators ------");
        int x = 5;

        x += 3;
        System.out.println("x += 3 : " + x);

        x -= 2;
        System.out.println("x -= 2 : " + x);

        x *= 4;
        System.out.println("x *= 4 : " + x);

        // Relational Operators
        System.out.println("\n------ Relational Operators ------");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\n------ Logical Operators ------");
        System.out.println("(a > b && b > 5) : " + (a > b && b > 5));
        System.out.println("(a < b || b > 5) : " + (a < b || b > 5));
        System.out.println("!(a > b) : " + !(a > b));

        // Increment and Decrement Operators
        System.out.println("\n------ Increment / Decrement ------");
        int n = 10;

        System.out.println("n = " + n);
        System.out.println("n++ = " + (n++));
        System.out.println("After n++ = " + n);

        // Bitwise Operators
        System.out.println("\n------ Bitwise Operators ------");
        int p = 5;
        int q = 3;

        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));

// shift Operators
        System.out.println("\n------ shift operators ------");
        System.out.println("p << 1 = " + (p << 1));
        System.out.println("p >> 1 = " + (p >> 1));
//ternary Operators
        System.out.println("\n------ ternary Operators ------");
         int max =(a>b)?a : b;
          System.out.println("Maximum =" +max);
//instanceof Operators
        System.out.println("\n------ instanceof Operators ------");
         String name ="java";
        System.out.println( name instanceof String);


    }
}
