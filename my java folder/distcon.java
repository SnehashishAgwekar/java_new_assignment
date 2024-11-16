import java.util.Scanner;

public class distcon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        
        double kilometers = milesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers.");
        
        scanner.close();
    }
    
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }
}