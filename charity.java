import java.util.Scanner;

public class charity {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the last day of Charity:  ");
        int n = sc.nextInt();
        int c = 0;
        for(int i=1;i<=n;i++){
            c+=i*i;
        }
        System.out.println("Total amount collected in charity till day "+n+" is : "+c);  
        sc.close(); 
    }
    
}
