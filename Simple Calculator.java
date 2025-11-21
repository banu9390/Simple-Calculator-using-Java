import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        System.out.println("Choose operation:");
        System.out.println("1 → Addition");
        System.out.println("2 → Subtraction");
        System.out.println("3 → Multiplication");
        System.out.println("4 → Division");
        System.out.println("5 → Modulo");
        int sol = sc.nextInt();

        switch (sol) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;

            case 2:
                System.out.println("Result = " + (a - b));
                break;

            case 3:
                System.out.println("Result = " + (a * b));
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Undefined (cannot divide by zero)");
                } else {
                    System.out.println("Result = " + (a / b));
                }
                break;

            case 5:
                if (b == 0) {
                    System.out.println("Undefined (mod by zero)");
                } else {
                    System.out.println("Result = " + (a % b));
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
