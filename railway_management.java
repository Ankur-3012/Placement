public class railway_management {
    Node head;
    public static void main(String[] args) {
        railway_management rm = new railway_management();
        rm.insert("Station A");
        rm.insert("Station B");
        rm.insert("Station C");
        rm.display();
        
        rm.insertBetween("Station D", "Station B");
        rm.display();
        
        rm.deleteByName("Station A");
        rm.display();
        
        rm.insertAtIndex("Station E", 1);
        rm.display();
    }
    public void insert(String name) {
    Node newNode = new Node(name);
    if (head == null) {
        head = newNode;
        return;
    } 
    Node current = head;
    while (current.next != null) {
        current = current.next;
    }
    current.next = newNode;}
    // Insertion between nodes
    public void insertBetween(String name, String prevName) {
        Node newNode = new Node(name);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current != null && !current.name.equals(prevName)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Previous node not found");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    // delete a node by name
    public void deleteByName(String name) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.name.equals(name)) {
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null && !current.next.name.equals(name)) {
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Node with name " + name + " not found");
            return;
        }
        current.next = current.next.next;
    }
    // disolay the linked list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            System.out.print(current.name + " ");
            current = current.next;
        }
        System.out.println();
    }
    // name of current station and next stations
    public void insertAtIndex(String name, int index) {
        Node newnode = new Node(name);
        if (index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
}
    }
}
class Node {
    String name;
    Node next;

    Node(String name) {
        this.name = name;
        this.next = null;
    }

}