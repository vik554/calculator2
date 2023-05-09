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


    }
    public static double add(double num1, double num2) {
        return num1 + num2;
    }
}
