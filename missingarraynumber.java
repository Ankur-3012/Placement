import java.util.Scanner;

public class missingarraynumber {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = Sc.nextInt();
        int[] arr = new int[n];
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Enter the elemnts of the array:");
        for(int i = 0; i < n - 1; i++) {
            if(i==n-1){
                break;
            }
            arr[i] = Sc.nextInt();
        }
        for(int j = 0; j < n - 1; j++) {
            sum1 += arr[j];
        }
        for(int k = 1; k <= n; k++) {
            sum2 += k;
        }
        int missingnumber = sum2 - sum1;
        System.out.println("The missing number in the array is: " + missingnumber);
        
        Sc.close();
    }
}
