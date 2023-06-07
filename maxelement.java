public class maxelement {
    public static int maxnu(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                max = Math.max(max, matrix[i][j]);
                min = Math.min(min, matrix[i][j]);
            }
        }

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = matrix[i][j];
            }
        }

        // return the maximum value in the matrix
        return max;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(maxnu(matrix));
    }
}
