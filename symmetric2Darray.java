import java.util.Scanner;

public class symmetric2Darray {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);        
        int[][] matrix = new int[3][3];
        boolean isSymmetric = true;
        System.out.println("Enter the no. of rows and columns of the 2D array:");
        int row = sc.nextInt();
        int column = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element at position (" + (i+1) + ", " + (j+1) + "):");
                matrix[i][j] = sc.nextInt();
                }
            }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
            if (!isSymmetric) {
                break;
            }
        }

        if (isSymmetric) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
        sc.close();
    }
    
}
