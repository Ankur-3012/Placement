import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of student:");
        System.out.print("Enter marks of student A :");
        int a = sc.nextInt();
        System.out.print("Enter marks of student B :");
        int b = sc.nextInt();
        System.out.print("Enter marks of student C :");
        int c = sc.nextInt();
        if(a<b && a>c){
            System.out.println("Student with Second Highest marks is A with marks : "+a);
        }
        else if(b<a && b>c){
            System.out.println("Student with Second Highest marks is B with marks : "+b);
        }
        else{
            System.out.println("Student with Second Highest marks is C with marks : "+c);
        }   
        sc.close(); 
    }
    
}
