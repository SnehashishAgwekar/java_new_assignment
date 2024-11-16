class Student {
    String name;
    int age;
    double grade;

    // 0-arguments constructor
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.grade = 0.0;
        System.out.println("0-arguments constructor called.");
    }

    // Constructor with 1 argument
    public Student(String name) {
        this.name = name;
        this.age = 0;
        this.grade = 0.0;
        System.out.println("1-argument constructor called.");
    }

    // Constructor with 2 arguments
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.grade = 0.0;
        System.out.println("2-arguments constructor called.");
    }

    // Constructor with 3 arguments
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        System.out.println("3-arguments constructor called.");
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {
        // Using 0-arguments constructor
        Student student1 = new Student();
        student1.displayDetails();

        // Using 1-argument constructor
        Student student2 = new Student("Alice");
        student2.displayDetails();

        // Using 2-arguments constructor
        Student student3 = new Student("Bob", 20);
        student3.displayDetails();

        // Using 3-arguments constructor
        Student student4 = new Student("Charlie", 21, 8.5);
        student4.displayDetails();
    }
}
