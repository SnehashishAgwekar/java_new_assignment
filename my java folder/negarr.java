public class ExceptionDemo {

    public static void main(String[] args) {
        // Handling NegativeArraySizeException
        try {
            int size = -5; // Invalid size for an array
            int[] array = new int[size]; // This will trigger NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println("Caught NegativeArraySizeException: " + e.getMessage());
        }

        // Handling ArithmeticException
        try {
            int numerator = 10;
            int denominator = 0; // Division by zero
            int result = numerator / denominator; // This will trigger ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
