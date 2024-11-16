import java.util.Scanner;
public class admin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nStudent " + i + " Marks:");
            System.out.print("Mathematics: ");
            int math = scanner.nextInt();
            System.out.print("Physics: ");
            int physics = scanner.nextInt();
            System.out.print("Chemistry: ");
            int chemistry = scanner.nextInt();
            int total = math + physics + chemistry;
            int mathPhysicsTotal = math + physics;
            if ((math >= 60 && physics >= 50 && chemistry >= 40) &&
                (total >= 200 || mathPhysicsTotal >= 150)) {
                System.out.println("Student " + i + " is eligible for admission.");
            } else {
                System.out.println("Student " + i + " is NOT eligible for admission.");
            }
        }
        scanner.close();
    }
}
