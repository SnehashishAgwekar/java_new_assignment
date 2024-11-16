import java.util.Scanner;

public class ConsecutiveDigitsSum {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the number as a string to handle its digits
        System.out.print("Enter a number: ");
        String numStr = scanner.nextLine();

        // Variable to store the sum of numbers formed by consecutive digits
        int sum = 0;

        // Loop through the string and create numbers by consecutive digits
        for (int i = 0; i < numStr.length() - 1; i++) {
            // Form the number by two consecutive digits
            int number = Integer.parseInt(numStr.substring(i, i + 2));
            sum += number;
        }

        // Output the result
        System.out.println("The sum of numbers formed by consecutive digits is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}
