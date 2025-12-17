import java.util.Scanner;

public class SumOfNatural {
    public static int sumOfNatural(int n) {
        if(n>0){
            if (n == 1) {
            return n;
            } else {
            return n + sumOfNatural(n - 1);
            }
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if(sumOfNatural(n)==0){
            System.out.println("Invalid Input");
        }
        else{
            System.out.println("The sum of the first " + n + " natural numbers is: " + sumOfNatural(n));
        }
        
        sc.close();
    }
    
}
