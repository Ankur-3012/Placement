public class VowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello Java";
        int vowels = 0 , Consonats = 0;
        str = str.toLowerCase();

        for(char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    Consonats++;
                }
            }
        }
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + Consonats);
    }
    
}
