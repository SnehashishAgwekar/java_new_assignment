import java.util.Scanner;
public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend (number to be divided): ");
        int dividend = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        if (divisor == 0) {
            System.out.println("Divisor cannot be zero. Please enter a valid divisor.");
        } else {
            if (dividend % divisor == 0) {
                System.out.println(dividend + " is divisible by " + divisor);
            } else {
                System.out.println(dividend + " is not divisible by " + divisor);
            }
        }
    }
}