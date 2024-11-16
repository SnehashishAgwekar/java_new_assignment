import java.util.Scanner;

// Base class
abstract class ThreeDObject {
    // Abstract methods to be overridden
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

// Derived class for Box
class Box extends ThreeDObject {
    private double length, width, height;

    // Constructor
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

// Derived class for Cube
class Cube extends ThreeDObject {
    private double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

// Derived class for Cylinder
class Cylinder extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class for Cone
class Cone extends ThreeDObject {
    private double radius, height;

    // Constructor
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

// Main class to test the program
public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Box
        System.out.println("Enter dimensions of Box (length, width, height):");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Input for Cube
        System.out.println("\nEnter side length of Cube:");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Input for Cylinder
        System.out.println("\nEnter dimensions of Cylinder (radius, height):");
        double cylRadius = scanner.nextDouble();
        double cylHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylRadius, cylHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Input for Cone
        System.out.println("\nEnter dimensions of Cone (radius, height):");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        scanner.close();
    }
}
