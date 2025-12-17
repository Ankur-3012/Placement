import java.util.Stack;
import java.util.Scanner;
public class TwoStackSort {

    public static void sortAsc(Stack<Integer> s) {
        Stack<Integer> tempStack = new Stack<>();

        while (!s.isEmpty()) {
            int x = s.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > x) {
                s.push(tempStack.pop());
            }

            tempStack.push(x);
        }

        System.out.println(tempStack);
    }
    public static void sortDesc(Stack<Integer> s) {
        Stack<Integer> tempStack1 = new Stack<>();

        while (!s.isEmpty()) {
            int x = s.pop();

            while (!tempStack1.isEmpty() && tempStack1.peek() < x) {
                s.push(tempStack1.pop());
            }

            tempStack1.push(x);
        }

        System.out.println(tempStack1);
    }


    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        Scanner Sc = new Scanner(System.in);
        s.push(3);
        s.push(1);
        s.push(4);
        s.push(2);
        System.out.println(s);
        System.out.println("Choose Sorting Order: 1. Ascending 2. Descending");
        int choice = Sc.nextInt();
        if (choice == 1) {
            sortAsc(s);
        } else {
            sortDesc(s);
        }
        Sc.close(); 

    }
}
