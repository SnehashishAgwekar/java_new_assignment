import java.util.Scanner;
public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose conversion type:");
        System.out.println("1. Binary to Decimal");
        System.out.println("2. Decimal to Binary");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter a binary number: ");
                String binary = scanner.next();
                int decimalResult = binaryToDecimal(binary);
                System.out.println("Decimal equivalent: " + decimalResult);
                break;

            case 2:
                System.out.print("Enter a decimal number: ");
                int decimal = scanner.nextInt();
                String binaryResult = decimalToBinary(decimal);
                System.out.println("Binary equivalent: " + binaryResult);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
                break;
        }
    }
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
