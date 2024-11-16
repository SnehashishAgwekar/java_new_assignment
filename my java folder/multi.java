// Base class
class Animal {
    // Method in the base class
    public void eat() {
        System.out.println("Animals can eat.");
    }
}

// Intermediate derived class
class Mammal extends Animal {
    // Method in the intermediate class
    public void walk() {
        System.out.println("Mammals can walk.");
    }
}

// Most derived class
class Dog extends Mammal {
    // Method in the most derived class
    public void bark() {
        System.out.println("Dogs can bark.");
    }
}

// Main class to demonstrate multilevel inheritance
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        // Create an object of the most derived class
        Dog dog = new Dog();

        // Call methods from all levels of the inheritance hierarchy
        dog.eat();  // From the base class (Animal)
        dog.walk(); // From the intermediate class (Mammal)
        dog.bark(); // From the most derived class (Dog)
    }
}
