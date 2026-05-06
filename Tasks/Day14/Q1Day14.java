class Node<T> {
    T data;
    Node1<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList<T extends Comparable<T>> {

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

    // Insert after specific node
    public void insertAfter(T key, T data) {
        Node1<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) {
                Node1<T> newNode = new Node1<>(data);
                newNode.next = temp.next;
                temp.next = newNode;

                if (temp == tail) {
                    tail = newNode;
                }
                return;
            }
            temp = temp.next;
        }

        System.out.println("Key not found");
    }

    // Delete first node
    public void pop() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head == null) {
            tail = null;
        }
    }

    // Delete last node
    public void popLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node1<T> temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    // Search node
    public boolean search(T key) {
        Node1<T> temp = head;

        while (temp != null) {
            if (temp.data.equals(key)) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    // Delete particular node
    public void delete(T key) {

        if (head == null) {
            return;
        }

        if (head.data.equals(key)) {
            head = head.next;
            return;
        }

        Node1<T> temp = head;

        while (temp.next != null) {

            if (temp.next.data.equals(key)) {
                temp.next = temp.next.next;

                if (temp.next == null) {
                    tail = temp;
                }

                return;
            }

            temp = temp.next;
        }
    }

    // Size of linked list
    public int size() {
        int count = 0;
        Node1<T> temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Sorted add
    public void sortedAdd(T data) {

        Node1<T> newNode = new Node1<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;

            if (tail == null) {
                tail = newNode;
            }

            return;
        }

        Node1<T> temp = head;

        while (temp.next != null &&
                temp.next.data.compareTo(data) < 0) {

            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    // Display list
    public void display() {
        Node1<T> temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Q1Day14 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        // UC1
        list.add(70);
        list.add(30);
        list.add(56);

        System.out.println("Linked List:");
        list.display();

        // UC4
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.append(56);
        list2.append(70);

        list2.insertAfter(56, 30);

        System.out.println("After Insert:");
        list2.display();

        // UC5
        list2.pop();

        System.out.println("After Pop:");
        list2.display();

        // UC6
        list2.popLast();

        System.out.println("After PopLast:");
        list2.display();

        // UC7
        System.out.println("Search 30: " + list.search(30));

        // UC8
        list.insertAfter(30, 40);

        System.out.println("After inserting 40:");
        list.display();

        // UC9
        list.delete(40);

        System.out.println("After deleting 40:");
        list.display();

        System.out.println("Size: " + list.size());

        // UC10 Ordered Linked List
        LinkedList<Integer> sortedList = new LinkedList<>();

        sortedList.sortedAdd(56);
        sortedList.sortedAdd(30);
        sortedList.sortedAdd(40);
        sortedList.sortedAdd(70);

        System.out.println("Sorted Linked List:");
        sortedList.display();
    }
}