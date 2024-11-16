import java.util.Scanner;

class Employee {
    // Instance variables
    private int empId;
    private String empName;
    private double basicSalary;

    // Constructor
    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        double hra = 0.2 * basicSalary; // 20% of basic salary as HRA
        double da = 0.5 * basicSalary; // 50% of basic salary as DA
        return basicSalary + hra + da;
    }

    // Method to display employee details and gross salary
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

// Main class to test the program
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input employee details
        System.out.println("Enter Employee ID:");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Employee Name:");
        String empName = scanner.nextLine();
        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();

        // Create an Employee object
        Employee employee = new Employee(empId, empName, basicSalary);

        // Display employee details and gross salary
        System.out.println("\nEmployee Details:");
        employee.displayDetails();

        scanner.close();
    }
}
