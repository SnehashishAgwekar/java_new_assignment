// Custom exception for negative age
class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class PersonInfo {

    // Method to validate age
    public static void validateAge(String name, int age) throws NegativeAgeException {
        if (age < 0) {
            throw new NegativeAgeException("Age cannot be negative.");
        }
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide name and age as command-line arguments.");
            return;
        }

        String name = args[0];
        try {
            int age = Integer.parseInt(args[1]);
            validateAge(name, age);
        } catch (NegativeAgeException e) {
            System.out.println("Caught NegativeAgeException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer for the age.");
        }
    }
}
