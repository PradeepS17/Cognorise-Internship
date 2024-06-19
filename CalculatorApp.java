import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt user for the first number
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            // Prompt user for the second number
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Prompt user for the operator
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the corresponding arithmetic operation
            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                    break;
                default:
                    validOperation = false;
                    System.out.println("Invalid operator. Please use one of the following: +, -, *, /.");
                    break;
            }

            // Display the result if the operation was valid
            if (validOperation) {
                System.out.println("The result is: " + result);
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numbers and an operator.");
        } finally {
            scanner.close();
        }
    }
}
