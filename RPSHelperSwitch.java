import java.util.Scanner;

public class RPSHelperSwitch {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Player 1's Move:");
        String a = s.next();
        String b;

        switch (a) {
            case "rock":
                b = "paper"; 
                break;
                
            case "paper":
                b = "scissors"; 
                break;
                
            case "scissors":
                b = "rock"; 
                break;
                
            default:
                b = "Invalid move!";
                break; 
        }
        System.out.println(b);
        s.close(); 
    }
}
