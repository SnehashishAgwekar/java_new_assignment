class Student {
    String name;
    int age;

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        // Creating an object of the Student class with parameters
        Student student = new Student("Alice", 20);

        // Calling the method to display student details
        student.displayDetails();
    }
}
