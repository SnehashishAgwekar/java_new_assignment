// Custom exception class
class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}

public class EquationCalculator {

    // Method to calculate the equation and handle exceptions
    public static int calculate(int a, int b, int c) throws CustomArithmeticException {
        try {
            // Check for potential integer overflow before performing addition
            if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
                throw new CustomArithmeticException("Integer overflow during addition");
            }
            int sum = a + b;

            // Check for division by zero
            if (c == 0) {
                throw new CustomArithmeticException("Division by zero is not allowed");
            }
            return sum / c;

        } catch (ArithmeticException e) {
            throw new CustomArithmeticException("Unexpected arithmetic exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int a = 100;
        int b = Integer.MAX_VALUE; // For overflow test
        int c = 0;                 // For division by zero test

        try {
            int result = calculate(a, b, c);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        }

       
        try {
            int result = calculate(10, 20, 2);
            System.out.println("Result: " + result);
        } catch (CustomArithmeticException e) {
            System.out.println("Caught CustomArithmeticException: " + e.getMessage());
        }
    }
}
