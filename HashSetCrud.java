import java.util.HashSet;

public class HashSetCrud {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();   
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");
        System.out.println("Fruits in HashSet: " + fruits);
        boolean containsBanana = fruits.contains("Banana");
        System.out.println("Contains Banana? " + containsBanana);
        fruits.remove("Orange");
        System.out.println("Fruits after removing Orange: " + fruits);
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is HashSet empty? " + isEmpty);
    }
    
}
