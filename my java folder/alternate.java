import java.util.Scanner;

public class PrintAlternateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array of size n
        int[] array = new int[n];

        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Print every alternate number
        System.out.println("Every alternate number in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
