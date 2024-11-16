// Custom exception class
class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

import java.util.HashMap;
import java.util.Map;

public class CountryCapitalFinder {

    // Predefined map of countries and their capitals
    private static final Map<String, String> countryCapitals = new HashMap<>();

    static {
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington, D.C.");
        countryCapitals.put("Canada", "Ottawa");
        countryCapitals.put("Germany", "Berlin");
        countryCapitals.put("Australia", "Canberra");
    }

    // Method to get the capital of a country
    public static String getCapital(String country) throws NoMatchFoundException {
        if (countryCapitals.containsKey(country)) {
            return countryCapitals.get(country);
        } else {
            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter the name of a country as a command-line argument.");
            return;
        }

        String country = args[0];
        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
