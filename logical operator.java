import java.util.Scanner;

public class Logicaloperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter value of b: ");
        int b = sc.nextInt();

        System.out.println("\n------ Logical Operators ------");

        System.out.println("(a > b && b > 5) = " + (a > b && b > 5));
        System.out.println("(a < b || b > 5) = " + (a < b || b > 5));
        System.out.println("!(a > b) = " + !(a > b));

        sc.close();
    }
}
