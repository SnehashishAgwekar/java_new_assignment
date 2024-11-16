class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}
public class TemperatureChecker {
    public static void checkTemperature(int tempCelsius) throws TooHot, TooCold {
        if (tempCelsius > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (tempCelsius < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Temperature is Normal.");
            double tempFahrenheit = (tempCelsius * 9.0 / 5.0) + 32;
            System.out.printf("Temperature in Fahrenheit: %.2f°F%n", tempFahrenheit);
        }
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the temperature (in Celsius) as a command-line argument.");
            return;
        }
        try {
            int tempCelsius = Integer.parseInt(args[0]);
            checkTemperature(tempCelsius);
        } catch (TooHot e) {
            System.out.println("Caught TooHot Exception: " + e.getMessage());
        } catch (TooCold e) {
            System.out.println("Caught TooCold Exception: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer for the temperature.");
        }
    }
}
