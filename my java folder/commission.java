import java.util.Scanner;

// Class to calculate commission
class Commission {
    private double sales; // Instance variable to hold sales amount

    // Constructor to initialize sales
    public Commission(double sales) {
        this.sales = sales;
    }

    // Method to calculate and return the commission
    public double commission() {
        if (sales < 5000) {
            return sales * 0.05; // 5% commission for sales below 5000
        } else if (sales <= 10000) {
            return sales * 0.10; // 10% commission for sales between 5000 and 10000
        } else {
            return sales * 0.15; // 15% commission for sales above 10000
        }
    }
}

// Demo class to test the Commission class
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales amount from the user
        System.out.print("Enter the sales amount: ");
        double sales = scanner.nextDouble();

        // Validate the input
        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            // Create a Commission object
            Commission commission = new Commission(sales);

            // Calculate and display the commission
            double calculatedCommission = commission.commission();
            System.out.println("The commission is: " + calculatedCommission);
        }
    }
}
