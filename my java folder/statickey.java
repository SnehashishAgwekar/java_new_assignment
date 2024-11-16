class Counter {
    // Static variable to keep track of the count
    static int count = 0;

    // Constructor
    public Counter() {
        count++; // Increment the static variable count for each instance created
    }

    // Static method to access static variable count
    public static void displayCount() {
        System.out.println("Current count: " + count);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        // Create multiple objects of Counter class
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        // Call the static method using the class name
        Counter.displayCount(); // This will print the total count, which is 3
    }
}
