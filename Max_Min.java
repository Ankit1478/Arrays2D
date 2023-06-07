public class Max_Min {
    public static int[] maxandmin(int matrix[][]) {
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

        int[] result = new int[2];
        result[0] = max;
        result[1] = min;

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[] result = maxandmin(matrix);// convert 2D array to 1D
        System.out.println("The maximum elemnt is " + result[0]);
        System.out.println("The minimun element is " + result[1]);
    }
}
