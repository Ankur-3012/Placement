import java.util.Scanner;

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Age : ");
        int age = scanner.nextInt();  
        System.out.print("Enter Student CGPA : ");
        float cgpa = scanner.nextFloat();
        System.out.print("Enter Student Grade : ");
        char grade = scanner.next().charAt(0);
        scanner.close();
        
        System.out.println("STUDENT DETAILS SUMMARY");
        
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : "+ age);
        System.out.printf("CGPA : %.2f\n", cgpa); 
        System.out.println("Grade : "+ grade);
    }
}
