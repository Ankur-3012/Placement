import java.util.Scanner;

public class Palindromechek {
    static boolean isPalindrome(String str) {
        int left = 0 , right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            else{
                left++;
                right--;
            }
            
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println(isPalindrome(input));
        sc.close();
    }
    
}
