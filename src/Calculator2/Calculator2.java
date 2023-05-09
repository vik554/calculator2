package Calculator2;
import java.util.Scanner;

public class Calculator2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;
        switch (operator) {
            case '+':
                result = add(num1, num2);
                break;

            case '-':
                result = subtract(num1, num2);
                break;

            case '*':
                result = multiply(num1, num2);
                break;

            case '/':
                result = divide(num1, num2);
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();


    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Cannot divide by zero");
            System.exit(0);
        }
        return num1 / num2;
    }

}
