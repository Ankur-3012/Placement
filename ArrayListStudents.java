import java.util.*;
class StudentList {
    public static void addStudent(ArrayList<String> students, String name) {
        students.add(name);
    }
    public static void deleteStudent(ArrayList<String> students, String name) {
        students.remove(name);
    }
    public static void searchStudent(ArrayList<String> students, String name) {
        if(students.contains(name)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
    public static void displayStudents(ArrayList<String> students) {
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}



public class ArrayListStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> students = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            students.add(sc.nextLine());
        }
        String Opertion = sc.nextLine();
        switch (Opertion) {
            case "addStudent":
                String newname = sc.nextLine();
                StudentList.addStudent(students, newname);
                break;
            case "deleteStudent":
                String Tcname = sc.nextLine();
                StudentList.deleteStudent(students, Tcname);
                break;
            case "searchStudent":
                String wantedname = sc.nextLine();
                StudentList.searchStudent(students, wantedname);
                break;
            case "displayStudents":
                StudentList.displayStudents(students);
                break;
            case "exit":
                break;
            default:
                System.out.println("Invalid Operation");
        }
        sc.close();
    }
    
}
