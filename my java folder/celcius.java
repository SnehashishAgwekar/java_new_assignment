import java.util.Scanner;

public class celcius{

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
                break;

            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                celsius = fahrenheitToCelsius(fahrenheit);
                System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }
        
        scanner.close();
    }
}