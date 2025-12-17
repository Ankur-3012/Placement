import java.util.Scanner;

public class ExceptionCatch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        try {
            Scanner Sc = new Scanner(System.in);
            int a = Sc.nextInt();
            int b = Sc.nextInt();
            int result = a / b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally {
            Sc.close();
        }            
    }
    
}
