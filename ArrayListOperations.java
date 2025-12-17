import java.util.*;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Original List: " + fruits);
        System.out.println("Element at index 2: " + fruits.get(2));
        fruits.set(1, "Pineapple");
        System.out.println("After modifying index 1: " + fruits);
        fruits.add(2,"Kiwi");
        System.out.println("After Inserting at index 2: " + fruits);
        fruits.remove(3);
        System.out.println("After removing index 3: " + fruits);
        fruits.remove("Apple");
        System.out.println("After removing 'Apple': " + fruits);
        System.out.println("Contains 'Kiwi'?: " + fruits.contains("Kiwi"));
        System.out.println("Size of the list: " + fruits.size());
        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);
        System.out.println("Iterating using for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Iterating using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        fruits.clear();
        System.out.println("After clearing: " + fruits);
        System.out.println("Is the list empty?: " + fruits.isEmpty());


    }
}
