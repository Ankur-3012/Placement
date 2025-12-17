import java.util.*;

public class IterateTasks {

    public static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        LinkedList<String> tasks = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            tasks.add(sc.nextLine());
        }

        System.out.println("Using for-each:");
        for (String task : tasks) {
            System.out.println(task);
        }

        System.out.println("Using Iterator:");
        Iterator<String> it = tasks.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}
