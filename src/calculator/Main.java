package calculator;

import java.util.Scanner;
/**
 * 4. Write a “main” method into the main class. It has a scanner that takes
 *  user input. Also write the logic that it ask user to “Enter first Number:”,
 *  “Enter second Number:” “Please enter one of symbol +,-,*, /:” if user
 *  enter + symbol result like “Addition of 5 and 10 is: 15” and respective for
 *  other symbols.
 *  5. With the result it’s also print one more message “Would you like to do
 *  more calculation Please enter “Y” or “N” :” (Hint use while loop if user
 *  enter Y program asking the user to enter First Number, and if user enter
 *  Nprogramme should terminate
 */


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String continueCalculation;

        do {
            // Prompt user for input
            System.out.print("Enter first number: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            System.out.print("Please enter one of symbol +, -, *, /: ");
            char symbol = scanner.next().charAt(0); // Read symbol

            // Perform the calculation based on the symbol
            calculator.calculateResult(firstNumber, secondNumber, symbol);

            // Ask if the user wants to continue
            System.out.print("Would you like to do more calculation? Please enter 'Y' or 'N': ");
            continueCalculation = scanner.next().toUpperCase();  // Ensure uppercase for consistency
        } while (continueCalculation.equals("Y"));

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
