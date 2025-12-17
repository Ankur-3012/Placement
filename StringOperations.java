import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String upper = "";
        String noDuplicate = "";
        String noSpace = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println("Character count (without spaces): " + count);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!noDuplicate.contains(String.valueOf(ch))) {
                noDuplicate = noDuplicate + ch;
            }
        }
        System.out.println("After removing duplicates: " + noDuplicate);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                noSpace = noSpace + str.charAt(i);
            }
        }
        System.out.println("After removing spaces: " + noSpace);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upper = upper + (char)(ch-32);
            } else {
                upper = upper + ch;
            }
        }
        System.out.println("Uppercase string: " + upper);

        sc.close();
    }
}
