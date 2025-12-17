import java.util.*;

public class MergeSortedLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println(list1);
        System.out.println(list2);
        ListIterator<Integer> iterator = list2.listIterator();
        while (iterator.hasNext()) {
            list1.add(iterator.next());
        }
        System.out.println(list1);
    }
    
}
