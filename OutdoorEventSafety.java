import java.util.Scanner;

public class OutdoorEventSafety {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = scanner.nextInt(); // Input temperature

        if (temperature > 0) {
            System.out.println("Safe for outdoor activities.");
        } else {
            System.out.println("Too cold for outdoor activities.");
        }
        scanner.close();
    }
}