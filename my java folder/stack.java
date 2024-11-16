class Stack {
    private int[] stackArray; 
    private int top; 
    private int maxSize; 
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " into the stack.");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return -1; 
        } else {
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return -1; 
        } else {
            return stackArray[top];
        }
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == maxSize - 1;
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
