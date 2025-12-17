class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee Name: " + name + ", Salary: " + salary);
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    void displayManager() {
        displayEmployee();
        System.out.println("Manager Name: " + name + ", Salary: " + salary + ", Department: " + department);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    void displayDeveloper() {
        displayEmployee();
        System.out.println("Developer Name: " + name + ", Salary: " + salary + ", Programming Language: " + programmingLanguage);
    }
}

public class Company {
    public static void main(String[] args) {
        Manager m = new Manager("Alice", 80000, "IT");
        Developer d = new Developer("Bob", 60000, "Java");

        m.displayManager();
        System.out.println();
        d.displayDeveloper();
    }
}