class employee{
    String name;
    int age;
    int salary;
    String empType;

    public employee(String name, int age, int salary, String empType){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.empType=empType;
    }
    void getBonus(){
        System.out.println("bonus");
    }
}

class permanent extends employee{
    permanent(String name, int age ,int salary, String empType){
        super(name,age,salary,empType);
    }
    void getBonus(){
        System.out.println("bonus is : "+ (0.2*salary+salary));
    }
}
class contractual extends employee{
    contractual(String name, int age ,int salary, String empType){
        super(name,age,salary,empType);
    }
    void getBonus(){
        System.out.println("bonus is : "+ (0.1*salary+salary));
    }
}

public class BonusOverloading {
    public static void main(String[] args) {
     employee e;
     e=new permanent("Ankur",20,250000,"permanent");
     e.getBonus();
     e=new contractual("Akash",21,4000000,"contractual");
     e.getBonus();  
    }
}