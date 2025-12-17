import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        String str;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        str = scanner.nextLine();
        String[] words = str.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("The longest word is: " + longestWord);
        scanner.close();
    }
    
}
