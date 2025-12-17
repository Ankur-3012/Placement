abstract class Payment {
    double amount;
    Payment(double amount) {
        this.amount = amount;
    }
    abstract void makePayment();
    void generateReceipt() {
        System.out.println("Receipt generated for amount: " + amount);
    }
}



class CreditCardPayment extends Payment {

    CreditCardPayment(double amount) {
        super(amount);
    }
    void makePayment() {
        System.out.println("Payment of " + amount + " made using Credit Card.");
        generateReceipt();
    }
    
}

class UpiPayment extends Payment {

    UpiPayment(double amount) {
        super(amount);
    }
    void makePayment() {
        System.out.println("Payment of " + amount + " made using UPI.");
        generateReceipt();
    }
    
}

public class example {
    public static void main(String[] args) {
        Payment r1 = new CreditCardPayment(100.0);
        r1.makePayment();
        
        Payment r2 = new UpiPayment(200.0);
        r2.makePayment();
    }
}