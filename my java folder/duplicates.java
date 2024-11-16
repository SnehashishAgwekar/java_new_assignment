import java.util.HashMap;
import java.util.Scanner;
public class FindDuplicateElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("Duplicate elements and their frequencies:");
        boolean duplicatesFound = false;
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (frequency > 1) {
                System.out.println(key + " occurs " + frequency + " times.");
                duplicatesFound = true;
            }
        }
        if (!duplicatesFound) {
            System.out.println("No duplicate elements found.");
        }
    }
}
