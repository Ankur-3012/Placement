class Car{
    String brand;
    int speed;

    void drive(){
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class TestCar {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.brand = "Honda";
        C1.speed = 80;
        C1.drive();

        Car C2 = new Car();
        C2.brand = "Tesla";
        C2.speed = 120;
        C2.drive();
    }
    
}
