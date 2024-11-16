class Parent {
    public static void display() {
        System.out.println("This is the static method in the Parent class.");
    }
}
class Child extends Parent {
    public static void display() {
        System.out.println("This is the static method in the Child class.");
    }
}
public class MethodHidingExample {
    public static void main(String[] args) {
        Parent.display(); 
        Child.display(); 
        Parent parentRef = new Parent();
        Parent childRef = new Child();
        
        parentRef.display();
        childRef.display(); }
}
