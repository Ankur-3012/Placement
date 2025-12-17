import java.util.*;

public class SearchTheMatrix {

    public static void search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    System.out.println("Row: " + (i+1));
                    System.out.println("Column: " + (j+1));
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int[][] arr = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("Enter element at (" + (i+1) + "," + (j+1) + "): ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the element to search: ");
        int searchTarget = sc.nextInt();
        search(arr, searchTarget);
        sc.close();
    }
}

