class Parent{
    void print() {
        System.out.println("parent class");
    }
}

class subclass1 extends Parent {
    void print() {
        System.out.println("subclass1");
    }
}

class subclass2 extends Parent {
    void print() {
        System.out.println("subclass2");
    }
}

public class RunTimePoly {
    public static void main(String[] args) {
        Parent a;
        a= new subclass1();
        a.print();
        a= new subclass2();
        a.print();

    }
}
