import java.util.Scanner;

class Rectangle {

    int length;
    int breadth;


    public Rectangle() {
        this(3, 4);
    }


    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int calculateArea() {
        return length * breadth;
    }
}

public class RectangleOverloading {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of rectangle:");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        Rectangle r1 = new Rectangle();
        System.out.println("Area: " + r1.calculateArea());

        Rectangle r2 = new Rectangle(length, breadth);
        System.out.println("Area: " + r2.calculateArea());

        sc.close();
    }
}
