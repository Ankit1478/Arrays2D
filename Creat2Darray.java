import java.util.Scanner;

public class Creat2Darray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;// row
        int m = matrix[0].length;// column
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 9);

    }

    // Brute Force Approach
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found cell at " + "( " + i + " ," + j + " )");
                    return true;
                } else {
                    System.out.println("Not found");
                }
            }

        }
        return false;
    }

}
