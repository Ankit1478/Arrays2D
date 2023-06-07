public class transpose {
    public static void printmatrix(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 2, m = 3;
        int[][] matrix = { { 2, 3, 7 }, { 5, 6, 7 } };
        printmatrix(matrix);

        int transpose[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("The Transpose of matrix is -");
        printmatrix(transpose);
    }
}
