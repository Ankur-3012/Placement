public class Lexicography {
    public static void main(String[] args) {
        String a = "apple";
        String b = "banana";

        int result = a.compareTo(b);
        if (result == 0) {
            System.out.println("Both Strings are equal");
        } else if (result < 0) {
            System.out.println("a comes before b");
        } else {
            System.out.println("a comes after b");
        }
    }
    
}
