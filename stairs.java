import java.util.Scanner;

public class stairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Houses: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the number of stairs in Each House: ");
        for (int i = 0; i <= n-1; i++) {
            System.out.print("Enter the number of stairs in House" + (i+1) + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int j = 0; j <= n-1; j++) {
            if(arr[j] % 3 != 0){
                System.out.println(j);

            } 
        }
        scanner.close();
    }
    
}
