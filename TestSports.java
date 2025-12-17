interface Player {
    void play();
}

abstract class Sportsperson {
    String name;
    int age;
    String achievements;
    Sportsperson(String name, int age, String achievements) {
        this.name = name;
        this.age = age;
        this.achievements = achievements;
    }
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Achievements: " + achievements);
    }
}

class Cricketer extends Sportsperson implements Player {

    Cricketer(String name, int age, String achievements) {
        super(name, age, achievements);
    }
    public void play() {
        System.out.println(name + " is playing cricket.");
    }
}

class Footballer extends Sportsperson implements Player {
    Footballer(String name, int age, String achievements) {
        super(name, age, achievements);
    }
    public void play() {
        System.out.println(name + " is playing football.");
    }
}

public class TestSports {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Virat Kohli", 35, "ICC Player Of The Decade");
        Footballer f1 = new Footballer("Lionel Messi", 38, "8 Ballon d'Or");
        c1.showDetails();
        c1.play();
        System.out.println();
        f1.showDetails();
        f1.play();
    }
}

