class Node{
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SingleLinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtPosition(int index, int data) {
        Node newNode = new Node(data);
        if (index == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode1 = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode1.next = temp.next;
        temp.next = newNode1;
    }
    public void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }
    public void deleteAtEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;   
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    public void deleteAtPosition(int index) {
        if (index == 0) {
            deleteAtBeginning();
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        temp.next = temp.next.next;
        
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class LinkedListSingle {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.printList(); 
        
        list.insertAtBeginning(5);
        list.printList(); 
        
        list.insertAtPosition(2, 15);
        list.printList();
        
        list.deleteAtPosition(3);
        list.printList(); 
        
        list.deleteAtEnd();
        list.printList();
    }
}
