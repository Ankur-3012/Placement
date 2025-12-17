import java.util.Scanner;

public class ShiftGoal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        System.out.println("Enter the number of positions to shift:");
        int shift = scanner.nextInt();
        
        String shiftedString = shiftString(input, shift);
        System.out.println("Shifted string: " + shiftedString);
        
        scanner.close();
    }

    private static String shiftString(String str, int shift) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        int length = str.length();
        shift = shift % length;
        
        return str.substring(length - shift) + str.substring(0, length - shift);
    }
    
    
}
