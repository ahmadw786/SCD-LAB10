import java.util.Scanner;

public class Calculator {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero.");
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        Calculator calculator = new Calculator();
        double result;

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 2:
                result = calculator.subtract(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 3:
                result = calculator.multiply(num1, num2);
                System.out.println("Result: " + result);
                break;
            case 4:
                try {
                    result = calculator.divide(num1, num2);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }

        scanner.close();
    }

}

