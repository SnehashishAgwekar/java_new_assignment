import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range (positive integer): ");
        int range = scanner.nextInt();
        int sum = 0;
        if (range > 0) {
            for (int i = 1; i <= range; i++) {
                sum += i;
            }
            System.out.println("The sum of natural numbers up to " + range + " is: " + sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }scanner.close();}}