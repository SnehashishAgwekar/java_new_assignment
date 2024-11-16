// Base class (Super class)
class Animal {
    String name;

    // Constructor for Animal class
    public Animal(String name) {
        this.name = name;
    }

    // Method to display general behavior
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method to display general behavior
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Derived class (Subclass) inheriting from Animal
class Dog extends Animal {
    
    // Constructor for Dog class
    public Dog(String name) {
        super(name); // Calling the constructor of the superclass (Animal)
    }

    // Method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

// Derived class (Subclass) inheriting from Animal
class Cat extends Animal {
    
    // Constructor for Cat class
    public Cat(String name) {
        super(name); // Calling the constructor of the superclass (Animal)
    }

    // Method specific to Cat class
    public void meow() {
        System.out.println(name + " is meowing.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Creating an object of Dog class
        Dog dog = new Dog("Buddy");
        dog.eat();    // Inherited method
        dog.sleep();  // Inherited method
        dog.bark();   // Dog-specific method

        System.out.println();

        // Creating an object of Cat class
        Cat cat = new Cat("Whiskers");
        cat.eat();    // Inherited method
        cat.sleep();  // Inherited method
        cat.meow();   // Cat-specific method
    }
}
