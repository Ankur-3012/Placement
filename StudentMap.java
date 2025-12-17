import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> student = new HashMap<>();
        System.out.println("Enter number of students to add:");
        int n = sc.nextInt();
        int i =0;
        while(i<n){
            System.out.println("Enter Roll No. and Name:");
            int RollNo = sc.nextInt();
            String Name = sc.nextLine();
            student.put(RollNo, Name);
            i++;
        }
        System.out.println("Enter Operation (add, search, display, exit):");
        String operation = sc.nextLine();
            switch (operation) {
                case "add":
                    System.out.println("Enter Roll No. and Name:");
                    int RollNo = sc.nextInt();
                    String Name = sc.nextLine();
                    student.put(RollNo, Name);
                    break;
                case "remove":
                    System.out.print("Enter Roll No. to remove: ");
                    int RollNoToRemove = sc.nextInt();
                    if (student.containsKey(RollNoToRemove)) {
                        student.remove(RollNoToRemove);
                        System.out.println("Removed successfully.");
                    } else {
                        System.out.println("Roll No. not found.");
                    }
                    break;
                case "search":
                    System.out.print("Search Roll: ");
                    int RollNoToSearch = sc.nextInt();
                    if (student.containsKey(RollNoToSearch)) {
                        System.out.println("Found: "+ student.get(RollNoToSearch));
                    } else {
                        System.out.println("Not Found");
                    }
                    break;
                case "display":
                    System.out.println(student);
                    break;
                case "exit":
                    break;
                default:
                    System.out.println("Invalid Operation");
            }
        sc.close();
    }
    
}
