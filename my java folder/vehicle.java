// Base class
class Vehicle {
    // Protected instance variables
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    // Constructor
    public Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    // Method to display vehicle details
    public void showData() {
        System.out.println("This is a vehicle class.");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}

// Subclass for Bus
class Bus extends Vehicle {
    // Private instance variable for Bus
    private int routeNumber;

    // Constructor
    public Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName); // Call the superclass constructor
        this.routeNumber = routeNumber;
    }

    // Override showData method
    @Override
    public void showData() {
        super.showData(); // Call the superclass's showData
        System.out.println("Route Number: " + routeNumber);
    }
}

// Subclass for Car
class Car extends Vehicle {
    // Private instance variable for Car
    private String manufacturerName;

    // Constructor
    public Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName); // Call the superclass constructor
        this.manufacturerName = manufacturerName;
    }

    // Override showData method
    @Override
    public void showData() {
        super.showData(); // Call the superclass's showData
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}

// Main class to test the program
public class VehicleTest {
    public static void main(String[] args) {
        // Create a Bus object
        Bus bus = new Bus("MH-12-AB-1234", 60, "Yellow", "John Doe", 101);
        System.out.println("Bus Details:");
        bus.showData();

        System.out.println();

        // Create a Car object
        Car car = new Car("DL-05-XY-5678", 120, "Red", "Jane Smith", "Toyota");
        System.out.println("Car Details:");
        car.showData();
    }
}
