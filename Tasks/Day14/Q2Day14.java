class Node1<T> {
    T data;
    Node1<T> next;

    Node1(T data) {
        this.data = data;
    }
}


// Linked List
class LinkedList1<T> {

    Node1<T> head;
    Node1<T> tail;

    // Add at beginning
    public void add(T data) {

        Node1<T> newNode = new Node1<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Append at end
    public void append(T data) {

        Node1<T> newNode = new Node1<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Remove first
    public T pop() {

        if (head == null) {
            return null;
        }

        T value = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return value;
    }

    // Display
    public void display() {

        Node1<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

// Stack Class
class Stack<T> {

    LinkedList1<T> list = new LinkedList1<>();

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        return list.pop();
    }

    public void display() {
        list.display();
    }
}

// Queue Class
class Queue<T> {

    LinkedList1<T> list = new LinkedList1<>();

    public void enqueue(T data) {
        list.append(data);
    }

    public T dequeue() {
        return list.pop();
    }

    public void display() {
        list.display();
    }
}

public class Q2Day14 {

    public static void main(String[] args) {

        // STACK
        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack:");
        stack.display();

        System.out.println("Pop: " + stack.pop());

        stack.display();

        // QUEUE
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);

        System.out.println("Queue:");
        queue.display();

        System.out.println("Dequeue: " + queue.dequeue());

        queue.display();
    }
}