import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int sumOfOddNumbers = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 != 0) { 
                sumOfOddNumbers += array[i];
            }
        }
        System.out.println("The sum of all odd numbers in the array is: " + sumOfOddNumbers);
    }
}

