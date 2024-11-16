// Custom exception for invalid username
class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

// Custom exception for password mismatch
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}

public class UserValidation {

    // Method to validate username and password
    public static void validateUser(String username, String password, String confirmPassword)
            throws InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new InvalidUsernameException("Username must be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match.");
        }

        System.out.println("User successfully validated!");
    }

    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Please provide username, password, and confirm password as command-line arguments.");
            return;
        }

        String username = args[0];
        String password = args[1];
        String confirmPassword = args[2];

        try {
            validateUser(username, password, confirmPassword);
        } catch (InvalidUsernameException e) {
            System.out.println("Caught InvalidUsernameException: " + e.getMessage());
        } catch (PasswordMismatchException e) {
            System.out.println("Caught PasswordMismatchException: " + e.getMessage());
        }
    }
}
