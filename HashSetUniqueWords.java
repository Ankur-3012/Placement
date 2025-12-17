import java.util.*;

public class HashSetUniqueWords {
    public static void main(String[] args) {
        HashSet<String> uniqueWords = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        
        String[] words = sentence.split(" ");
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        System.out.println("Unique words in the sentence: " + uniqueWords);
        scanner.close();
    }
    
}
