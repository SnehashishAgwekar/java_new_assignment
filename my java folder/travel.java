// Base class
class Distance {
    protected double miles; // Distance in miles

    // Constructor
    public Distance(double miles) {
        this.miles = miles;
    }

    // Method to calculate travel time (assuming speed is 60 miles/hour)
    public void travelTime() {
        double time = miles / 60.0; // Time in hours
        System.out.println("Travel time (at 60 miles/hour): " + time + " hours");
    }
}

// Derived class
class DistanceMKS extends Distance {

    // Constructor
    public DistanceMKS(double kilometers) {
        super(kilometers / 1.609); // Convert kilometers to miles and pass to base class
    }

    // Override travelTime() to use kilometers and speed 100 km/hour
    @Override
    public void travelTime() {
        double kilometers = miles * 1.609; // Convert miles back to kilometers
        double time = kilometers / 100.0; // Time in hours
        System.out.println("Travel time (at 100 km/hour): " + time + " hours");
    }
}

// Main class to test the functionality
public class DistanceTest {
    public static void main(String[] args) {
        // Create an object of the base class Distance
        Distance distance = new Distance(120); // 120 miles
        System.out.println("Base class output:");
        distance.travelTime();

        System.out.println();

        // Create an object of the derived class DistanceMKS
        DistanceMKS distanceMKS = new DistanceMKS(200); // 200 kilometers
        System.out.println("Derived class output:");
        distanceMKS.travelTime();
    }
}
