import java.util.*;

public class LInkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        ListIterator<String> iterator = list.listIterator();
        System.out.println("Iterating through the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(list);
    }
}
