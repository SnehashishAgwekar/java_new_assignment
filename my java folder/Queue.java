class Queue {
    private int[] queueArray; // Array to hold queue elements
    private int front; // Index of the front element
    private int rear; // Index of the rear element
    private int maxSize; // Maximum capacity of the queue
    private int currentSize; // Current number of elements in the queue

    // Constructor to initialize the queue
    public Queue(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
        } else {
            rear = (rear + 1) % maxSize; // Circular increment
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued " + value + " into the queue.");
        }
    }

    // Method to remove and return the front element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to dequeue.");
            return -1; // Return -1 if the queue is empty
        } else {
            int value = queueArray[front];
            front = (front + 1) % maxSize; // Circular increment
            currentSize--;
            System.out.println("Dequeued " + value + " from the queue.");
            return value;
        }
    }

    // Method to peek at the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1; // Return -1 if the queue is empty
        } else {
            return queueArray[front];
        }
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return currentSize == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return currentSize == maxSize;
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue queue = new Queue(5); // Create a queue of size 5

        // Testing the queue operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Attempt to dequeue from an empty queue
    }
}
