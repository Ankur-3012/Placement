class Transport {
    void generateTicket() {
        System.out.println("Ticket Generated");
    }
}
class Bus extends Transport {
    public void generateTicket() {
        System.out.println("Bus Ticket Generated");
    }
}
class Train extends Transport {
    public void generateTicket() {
        System.out.println("Train Ticket Generated");
    }
}

public class BookingSystem {
    public static void main(String[] args) {

        Transport t; 

        t = new Bus();  
        t.generateTicket();

        t = new Train();
        t.generateTicket();  
    }
}
