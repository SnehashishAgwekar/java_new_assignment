class Student {
    // Instance variables
    private int id;
    private String name;

    // Constructor using 'this' to differentiate instance variables from parameters
    public Student(int id, String name) {
        this.id = id;   // 'this.id' refers to the instance variable, 'id' is the parameter
        this.name = name;
    }

    // Method to call another method in the same class using 'this'
    public void display() {
        this.showDetails(); // Using 'this' to call another method
    }

    // Method to show details
    private void showDetails() {
        System.out.println("Student ID: " + this.id);
        System.out.println("Student Name: " + this.name);
    }

    // Method to return the current instance using 'this'
    public Student getThisInstance() {
        return this;
    }
}

// Main class to test the program
public class ThisKeywordDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student(101, "John Doe");

        // Use 'this' to call another method
        System.out.println("Calling display method:");
        student.display();

        System.out.println();

        // Use 'this' to return the current instance
        System.out.println("Getting the current instance:");
        Student sameInstance = student.getThisInstance();
        System.out.println("Are 'student' and 'sameInstance' the same? " + (student == sameInstance));
    }
}
