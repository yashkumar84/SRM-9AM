class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

class LL {
    Node head = null;

    void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

    }

    void deletionAtFirst() {
        if (head == null) {
            System.out.println("Deletion is Not Possible");
            return;
        }

        head = head.next;

    }

    void deletionAtLast() {
        if (head == null) {
            System.out.println("Deletion is Not Possible");
            return;
        }

        if (head.next == null) {
            head = null;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;

    }

    void insertAtAnywhere(int data, int pos) {
        Node newNode = new Node(data);
        Node current = head;
        Node prev = null;
        while (current.next != null && pos > 1) {
            prev = current;
            current = current.next;
            pos--;
        }

        if (pos == 1) {
            prev.next = newNode;
            newNode.next = current;
        }

    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertAtFirst(1);
        list.insertAtLast(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtAnywhere(8, 3);
        list.insertAtFirst(7);
        list.deletionAtFirst();
        list.deletionAtLast();
        list.deletionAtLast();
        list.print();

    }

}
