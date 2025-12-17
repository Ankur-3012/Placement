abstract class delivery {
    double amount;
    delivery(double amount) {
        this.amount = amount;
    }
    abstract double extra();
    void makeDelivery() {
        System.out.println("Delivery of amount: " + (amount + extra()));
    }
}

class StandardDelivery extends delivery {

    StandardDelivery(double amount) {
        super(amount);
    }
    double extra() {
        return 0; 
    }
    
}

class ExpressDelivery extends delivery {

    ExpressDelivery(double amount) {
        super(amount);
    }
    double extra() {
        double charge = 0.1 * amount;
        return charge; 
    }
    
}



public class Ecommerce {
    public static void main(String[] args) {
        delivery d1 = new StandardDelivery(100.0);
        d1.makeDelivery();
        
        delivery d2 = new ExpressDelivery(200.0);
        d2.makeDelivery();
    }
    
}
