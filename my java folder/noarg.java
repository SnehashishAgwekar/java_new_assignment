class Example {
    // 0-arguments constructor
    public Example() {
        System.out.println("This is a 0-arguments constructor.");
    }

    // Method to display a message
    public void displayMessage() {
        System.out.println("Hello from the Example class!");
    }
}

public class ZeroArgumentsConstructor {
    public static void main(String[] args) {
        // Creating an object of the Example class
        Example example = new Example();

        // Calling a method of the Example class
        example.displayMessage();
    }
}
