import java.util.Scanner;

public class exception {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dividend:");
        int a = sc.nextInt();

        System.out.println("Enter divisor:");
        int b = sc.nextInt();

        try {
            System.out.println("Result: " + (a / b));
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero!");
        }

        sc.close();
    }
}
