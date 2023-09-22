import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        if (scanner.hasNextDouble()) {
            double number1 = scanner.nextDouble();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                double number2 = scanner.nextDouble();

                // Compare the two numbers
                if (number1 == number2) {
                    System.out.println("The numbers are equal.");
                } else if (number1 < number2) {
                    System.out.println("The first number is less than the second number.");
                } else {
                    System.out.println("The second number is less than the first number.");
                }
            } else {
                System.out.println("Invalid input for the second number. Please enter a valid number.");
            }
        } else {
            System.out.println("Invalid input for the first number. Please enter a valid number.");
        }

        // Close the scanner
        scanner.close();
    }
}
