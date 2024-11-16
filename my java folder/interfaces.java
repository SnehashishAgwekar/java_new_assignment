// Define the first interface
interface Interface1 {
    void method1A();
    void method1B();
}

// Define the second interface
interface Interface2 {
    void method2A();
    void method2B();
}

// Define the third interface
interface Interface3 {
    void method3A();
    void method3B();
}

// Create a new interface inheriting from the three and adding a new method
interface CombinedInterface extends Interface1, Interface2, Interface3 {
    void combinedMethod();
}

// Define a concrete class
class ConcreteClass {
    void concreteClassMethod() {
        System.out.println("Method from ConcreteClass");
    }
}

// Create a class that implements the CombinedInterface and inherits from ConcreteClass
class MyClass extends ConcreteClass implements CombinedInterface {
    @Override
    public void method1A() {
        System.out.println("Method 1A implemented");
    }

    @Override
    public void method1B() {
        System.out.println("Method 1B implemented");
    }

    @Override
    public void method2A() {
        System.out.println("Method 2A implemented");
    }

    @Override
    public void method2B() {
        System.out.println("Method 2B implemented");
    }

    @Override
    public void method3A() {
        System.out.println("Method 3A implemented");
    }

    @Override
    public void method3B() {
        System.out.println("Method 3B implemented");
    }

    @Override
    public void combinedMethod() {
        System.out.println("Combined method implemented");
    }
}

// Define methods that accept each of the four interfaces
class InterfaceTester {
    public static void useInterface1(Interface1 obj) {
        obj.method1A();
        obj.method1B();
    }

    public static void useInterface2(Interface2 obj) {
        obj.method2A();
        obj.method2B();
    }

    public static void useInterface3(Interface3 obj) {
        obj.method3A();
        obj.method3B();
    }

    public static void useCombinedInterface(CombinedInterface obj) {
        obj.combinedMethod();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Use the methods with MyClass object
        InterfaceTester.useInterface1(myObject);
        InterfaceTester.useInterface2(myObject);
        InterfaceTester.useInterface3(myObject);
        InterfaceTester.useCombinedInterface(myObject);

        // Call method from the inherited concrete class
        myObject.concreteClassMethod();
    }
}
