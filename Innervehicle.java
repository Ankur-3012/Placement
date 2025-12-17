class vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
    
}

class car extends vehicle {
    void drive() {
        System.out.println("Car drives");
    }
    
}

class SportsCar extends car {
    void boost() {
        System.out.println("Boost mode activated");
    }
    
}


public class Innervehicle {
    public static void main(String[] args) {
        SportsCar sc = new SportsCar();
        sc.start();
        sc.drive();
        sc.boost();
    }

    
}