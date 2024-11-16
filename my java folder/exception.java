// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingDemo {

    // Method that throws a custom exception using the 'throws' keyword
    public static void riskyMethod(boolean triggerException) throws CustomException {
        if (triggerException) {
            throw new CustomException("Triggered a CustomException using 'throw'");
        } else {
            System.out.println("No exception triggered in riskyMethod");
        }
    }

    public static void main(String[] args) {
        try {
            // Simulate a scenario that triggers an ArithmeticException
            int result = 10 / 0;
            System.out.println("This will not print: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught an ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after ArithmeticException handling");
        }

        try {
            // Call the risky method with true to trigger a CustomException
            riskyMethod(true);

        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after CustomException handling");
        }

        try {
            // Call the risky method without triggering an exception
            riskyMethod(false);
        } catch (CustomException e) {
            System.out.println("Caught a CustomException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after normal execution");
        }

        System.out.println("Program execution continues after handling all exceptions");
    }
}
