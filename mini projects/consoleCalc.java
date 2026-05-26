package practice.consoleCalculator;

import java.util.Scanner; // FIXED: Added missing import

public class consoleCalc {

    // Addition Method
    public static int add(int a, int b) {
        return a + b;
    }

    // Subtraction Method
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Multiplication Method
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Division Method
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n== Console Calculator ==");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            // Exit Condition
            if (choice == 5) {
                System.out.println("Calculator Closed");
                break;
            }

            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;

                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;

                case 4:
                    System.out.println("Result: " + divide(num1, num2));
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        sc.close();
    }
}