import java.util.Scanner;
public class alphabetidentification {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);
        if ((alphabet >= 'A' && alphabet <= 'Z') || (alphabet >= 'a' && alphabet <= 'z')) {
            System.out.println(alphabet + " is an alphabet.");
            if (alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U' || alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
                System.out.println(alphabet + " is a vowel.");
            } else {
                System.out.println(alphabet + " is a consonant.");
            }
        }
        else {
            System.out.println(alphabet + " is not an alphabet.");
        }
        
        scanner.close();
    
    }
}
